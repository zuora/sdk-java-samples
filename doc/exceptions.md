# Exception Handling
The Zuora SDK uses runtime (or unchecked) exceptions.

# Exceptions


## Base Exception
 `ZuoraSdkException`


## Zuora SDK Exceptions

Subclasses of the `ZuoraSdkException` base exception provide more information about the error and why it occurred. The following table lists all exceptions for the Zuora SDK with descriptions, suggested actions, and whether they are retryable:

| Exception | Description |  Action | Retryable? |
|  --- | --- | --- | -- |
| AuthenticationException | This exception is thrown when the SDK fails to authenticate with the Zuora Server due to invalid API authentication credentials. | Check the credentials used for SDK authentication. | No |
| AuthorizationException | This exception is thrown when the request cannot be processed due to a certain tenant or user permission is missing. | Check the missing tenant or user permission in the error message and contact [Zuora Global Support](https://support.zuora.com/) for enablement. | No |
| ExternalIntegrationException | This exception is thrown when Zuora encounters an error when communicating with an external system you have configured, for example, payment gateway, tax engine provider. | Check the error message and take action accordingly. | No |
| InvalidRequestException | This exception is thrown when the SDK operation was an invalid request. | Check the violations list. The `reason` can be used to determine the particular failure type. The `field` can be used to determine the invalid field on the request. The `message` of the Violation can be used to take actions accordingly. | No |
| LockContentionException | This exception is thrown when request cannot be processed because the objects this request is trying to modify are being modified by another API request, UI operation, or batch job process. | Retry the operation first. If this error still occurs, contact [Zuora Global Support](https://support.zuora.com/) with the returned requestId value in the exception for assistance. | Yes |
| RateLimitExceededException | This exception is thrown when your requests exceed Zuora's rate limit (too many requests within a period of time) or exceed Zuora's concurrent request limit (too many concurrent requests). | Retry the operation after the number of seconds specified by the `resetInSeconds` value in the exception. Check [Rate and concurrent request limits](https://knowledgecenter.zuora.com/BB_Introducing_Z_Business/Policies/Concurrent_Request_Limits) for details about Zuora’s rate limit and concurrent request limit policy. | Yes |
| ServerConnectionException | This exception is thrown when the Zuora Server could not be contacted for a response. | Check the endpoint configuration and internet connection. | Yes |












