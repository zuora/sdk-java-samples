
# Charge Model Interface

.

 ## Structure

`ChargeModelInterface`

 ## Types

 FlatFee, PerUnit, Volume, Tiered
 
 ## Flat Fee
 
 | Name | Type | Tags | Description | Getter |
 |  --- | --- | --- | --- | --- |
 | `type` | [`ChargeModel`](/doc/models/charge-model.md) | ReadOnly | charge model | String getType() |
 | `amount` | `Double` | Required | flat fee amount | String getAmount() |
 
 
 ### Usage

```java 
 FlatFee flatFee = FlatFee.builder().amount(50.0).build();
 ```
 
 
 ## Per Unit

| Name | Type | Tags | Description | Getter |
 |  --- | --- | --- | --- | --- |
 | `type` | [`ChargeModel`](/doc/models/charge-model.md) | ReadOnly | charge model | String getType() |
 | `amount` | `Double` | Required | flat fee amount | String getAmount() |
 | `quantity` | `Double` | Required | flat fee amount | String getAmount() |
 | `unitOfMeasure` | `String` | Required | flat fee amount | String getAmount() |
 

 ### Usage

```java
PerUnit perUnit = PerUnit.builder().amount(50.0).unitOfMeasure("Each").build();
```


 ## Volume

 | Name | Type | Tags | Description | Getter |
 |  --- | --- | --- | --- | --- |
 | `type` | [`ChargeModel`](/doc/models/charge-model.md) | ReadOnly | charge model | String getType() |
 | `unitOfMeasure` | `String` | Required | unit of measure | String getUnitOfMeasure() |
 | `tiers` | [`Tier`](/doc/models/tier.md) | Required | tiers | String getTiers() |
 

 ### Usage

```java
 Volume volume = Volume.builder()
                        .tier(Tier.tierBuilder()
                                .tier(1)
                                .upTo(1000.0)
                                .amount(20.0)
                                .build())
                        .tier(Tier.tierBuilder()
                                .tier(2)
                                .upTo(2000.0)
                                .amount(50.0)
                                .build())
                        .unitOfMeasure("Each")
                        .build()
  ```
 ## Tiered
  

 | Name | Type | Tags | Description | Getter |
 |  --- | --- | --- | --- | --- |
 | `type` | [`ChargeModel`](/doc/models/charge-model.md) | ReadOnly | charge model | String getType() |
 | `unitOfMeasure` | `String` | Required | unit of measure | String getUnitOfMeasure() |
 | `tiers` | [`Tier`](/doc/models/tier.md) | Required | tiers | String getTiers() |
 
 
 ### Usage

```java
Tiered tiered = Tiered.builder()
                        .tier(Tier.tierBuilder()
                                .tier(1)
                                .upTo(1000.0)
                                .amount(20.0)
                                .build())
                        .tier(Tier.tierBuilder()
                                .tier(2)
                                .upTo(2000.0)
                                .amount(50.0)
                                .build())
                        .unitOfMeasure("Each")
                        .build()
 ```
