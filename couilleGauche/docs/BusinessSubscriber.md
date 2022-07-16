

# BusinessSubscriber

Describes subscriber organisation & contact
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subscriberRef** | **String** | External reference of subscriber (By example: social reason of the company) |  [optional]
**subscriberType** | [**SubscriberTypeEnum**](#SubscriberTypeEnum) |  | 
**party** | [**BusinessProfessionnalParty**](BusinessProfessionnalParty.md) |  |  [optional]
**eInvoicing** | [**BusinessSubscriberEInvoicing**](BusinessSubscriberEInvoicing.md) |  |  [optional]
**contactPerson** | [**BusinessPerson**](BusinessPerson.md) |  | 
**contactAddress** | [**BusinessAddress**](BusinessAddress.md) |  | 
**billingAddress** | [**BusinessAddress**](BusinessAddress.md) |  | 



## Enum: SubscriberTypeEnum

Name | Value
---- | -----
PARTICULAR | &quot;PARTICULAR&quot;
PROFESSIONNAL | &quot;PROFESSIONNAL&quot;



