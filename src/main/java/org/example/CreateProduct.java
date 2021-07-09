package org.example;

import com.zuora.sdk.core.APIContext;
import com.zuora.sdk.core.internal.DotEnv;
import com.zuora.sdk.models.ZProduct;

public class CreateProduct {
    public static void main(String[] args) {
        // Configure client_id and client_secret from the .env file you created above.
        final String CLIENT_ID = DotEnv.get("CLIENT_ID");
        final String CLIENT_SECRET = DotEnv.get("CLIENT_SECRET");
        final String ENDPOINT = DotEnv.get("ENDPOINT_BASE");

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
