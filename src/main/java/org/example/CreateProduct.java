package org.example;

import com.zuora.sdk.core.APIContext;
import com.zuora.sdk.models.ZProduct;

public class CreateProduct {
    public static void main(String[] args) {

        if(args.length != 2) {
            System.err.println("clientId and clientSecret is required");
            return;
        }
        final String CLIENT_ID = args[0];
        final String CLIENT_SECRET = args[1];
        final String ENDPOINT = "https://rest.apisandbox.zuora.com";

        // Initialize SDK context
        APIContext context = APIContext.builder()
                .endpointBase(ENDPOINT)
                .clientIdAndSecret(CLIENT_ID, CLIENT_SECRET)
                .enableDebug(true)
                .build();

        // Build your product
        String name = "P_" + System.currentTimeMillis();
        ZProduct product = new ZProduct.Builder()
                .name(name)
                .effectiveStartDate("2021-04-22")
                .effectiveEndDate("2066-01-01")
                .description("Test")
                .build();

        // Create your product
        String productId = ZProduct.create(context, product);
        // Use this productId
    }
}
