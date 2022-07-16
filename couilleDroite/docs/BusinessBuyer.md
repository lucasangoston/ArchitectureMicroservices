

# BusinessBuyer

Describes buyer organisation & contact
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**buyerRef** | **String** | External reference of buyer (By example: social reason of the company) |  [optional]
**buyerType** | [**BuyerTypeEnum**](#BuyerTypeEnum) |  | 
**party** | [**BusinessProfessionnalParty**](BusinessProfessionnalParty.md) |  |  [optional]
**eInvoicing** | [**BusinessBuyerEInvoicing**](BusinessBuyerEInvoicing.md) |  |  [optional]
**contactPerson** | [**BusinessPerson**](BusinessPerson.md) |  | 
**contactAddress** | [**BusinessAddress**](BusinessAddress.md) |  | 
**billingAddress** | [**BusinessAddress**](BusinessAddress.md) |  | 



## Enum: BuyerTypeEnum

Name | Value
---- | -----
PARTICULAR | &quot;PARTICULAR&quot;
PROFESSIONNAL | &quot;PROFESSIONNAL&quot;



