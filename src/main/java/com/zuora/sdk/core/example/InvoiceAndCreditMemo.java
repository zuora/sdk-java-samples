package com.zuora.sdk.core.example;

import com.zuora.sdk.core.APIContext;
import com.zuora.sdk.core.apis.CreditMemosAPI;
import com.zuora.sdk.core.apis.InvoicesAPI;
import com.zuora.sdk.core.apis.InvoicesAPI.InvoiceObjectRetrieveRequest;
import com.zuora.sdk.core.apis.data.CreditMemoItemFromInvoiceItemType;
import com.zuora.sdk.core.apis.data.GETCreditMemoType;
import com.zuora.sdk.core.apis.data.GETInvoiceItemsResponse;
import com.zuora.sdk.core.apis.data.InvoiceItem;
import com.zuora.sdk.core.apis.data.ProxyGetInvoice;

import com.google.common.collect.ImmutableList;

public class InvoiceAndCreditMemo {

    public static void main(String[] args) {

        if (args.length != 3) {
            System.err.println("clientId clientSecret invoiceId are required");
            return;
        }
        final String CLIENT_ID = args[0];
        final String CLIENT_SECRET = args[1];
        final String invoiceId = args[2];
        final String ENDPOINT = "https://rest.apisandbox.zuora.com";

        // Initialize SDK context
        APIContext context = APIContext.builder()
                .endpointBase(ENDPOINT)
                .clientIdAndSecret(CLIENT_ID, CLIENT_SECRET)
                .enableDebug(true)
                .build();

        //Demo: fetch Invoice object
        //Quick: ProxyGetInvoice proxyGetInvoice = InvoicesAPI.objectRetrieve(context, invoiceId);
        //Alternative: customize fields
        ProxyGetInvoice proxyGetInvoice = new InvoiceObjectRetrieveRequest(context, invoiceId)
                .fields("Id,Amount,InvoiceDate").execute().head();
        System.out.println("Fetched Invoice Amount: " + proxyGetInvoice.amount());

        //Demo: List all InvoiceItems of the Invoice
        GETInvoiceItemsResponse getInvoiceItemsResponse = InvoicesAPI.itemsList(context, invoiceId);
        System.out.println("Fetched Invoice Item Count: " + getInvoiceItemsResponse.invoiceItems().size());

        //Demo: Create CreditMemo from the Invoice
        if (getInvoiceItemsResponse.invoiceItems().isEmpty()) {
            return;
        }
        InvoiceItem invoiceItem = getInvoiceItemsResponse.invoiceItems().get(0);
        GETCreditMemoType getCreditMemoType = InvoicesAPI.creditMemoCreateFrom(context, invoiceId)
                .autoPost(false)
                .autoApplyToInvoiceUponPosting(false)
                .comment("create creditmemo from sdk")
                .reasonCode("Write-off")
                .effectiveDate(proxyGetInvoice.invoiceDate())
                .excludeFromAutoApplyRules(false)
                .items(ImmutableList.of(new CreditMemoItemFromInvoiceItemType()
                        .amount(1d)
                        .comment("credit memo item")
                        .invoiceItemId(invoiceItem.id())
                        .skuName(invoiceItem.chargeName())))
                .execute().head();
        System.out.println("CreditMemo is created, id: " + getCreditMemoType.id());

        //Demo: Cancel the created CreditMemo
        GETCreditMemoType updatedCreditMemoType = CreditMemosAPI.cancel(context, getCreditMemoType.id()).execute().head();
        System.out.println("CreditMemo's status is " + updatedCreditMemoType.status());

    }

}
