/*
 * Travel Contract
 * The Travel Contract Application System
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.client.model.BusinessAddress;
import org.openapitools.client.model.BusinessPerson;
import org.openapitools.client.model.BusinessProfessionnalParty;
import org.openapitools.client.model.BusinessSubscriberEInvoicing;

/**
 * Describes subscriber organisation &amp; contact
 */
@ApiModel(description = "Describes subscriber organisation & contact")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-16T16:19:57.320415+02:00[Europe/Paris]")
public class BusinessSubscriber {
  public static final String SERIALIZED_NAME_SUBSCRIBER_REF = "subscriberRef";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBER_REF)
  private String subscriberRef;

  /**
   * Gets or Sets subscriberType
   */
  @JsonAdapter(SubscriberTypeEnum.Adapter.class)
  public enum SubscriberTypeEnum {
    PARTICULAR("PARTICULAR"),
    
    PROFESSIONNAL("PROFESSIONNAL");

    private String value;

    SubscriberTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SubscriberTypeEnum fromValue(String value) {
      for (SubscriberTypeEnum b : SubscriberTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SubscriberTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubscriberTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SubscriberTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SubscriberTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SUBSCRIBER_TYPE = "subscriberType";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBER_TYPE)
  private SubscriberTypeEnum subscriberType;

  public static final String SERIALIZED_NAME_PARTY = "party";
  @SerializedName(SERIALIZED_NAME_PARTY)
  private BusinessProfessionnalParty party;

  public static final String SERIALIZED_NAME_E_INVOICING = "eInvoicing";
  @SerializedName(SERIALIZED_NAME_E_INVOICING)
  private BusinessSubscriberEInvoicing eInvoicing;

  public static final String SERIALIZED_NAME_CONTACT_PERSON = "contactPerson";
  @SerializedName(SERIALIZED_NAME_CONTACT_PERSON)
  private BusinessPerson contactPerson;

  public static final String SERIALIZED_NAME_CONTACT_ADDRESS = "contactAddress";
  @SerializedName(SERIALIZED_NAME_CONTACT_ADDRESS)
  private BusinessAddress contactAddress;

  public static final String SERIALIZED_NAME_BILLING_ADDRESS = "billingAddress";
  @SerializedName(SERIALIZED_NAME_BILLING_ADDRESS)
  private BusinessAddress billingAddress;


  public BusinessSubscriber subscriberRef(String subscriberRef) {
    
    this.subscriberRef = subscriberRef;
    return this;
  }

   /**
   * External reference of subscriber (By example: social reason of the company)
   * @return subscriberRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Ma Petite Entreprise", value = "External reference of subscriber (By example: social reason of the company)")

  public String getSubscriberRef() {
    return subscriberRef;
  }


  public void setSubscriberRef(String subscriberRef) {
    this.subscriberRef = subscriberRef;
  }


  public BusinessSubscriber subscriberType(SubscriberTypeEnum subscriberType) {
    
    this.subscriberType = subscriberType;
    return this;
  }

   /**
   * Get subscriberType
   * @return subscriberType
  **/
  @ApiModelProperty(example = "PROFESSIONNAL", required = true, value = "")

  public SubscriberTypeEnum getSubscriberType() {
    return subscriberType;
  }


  public void setSubscriberType(SubscriberTypeEnum subscriberType) {
    this.subscriberType = subscriberType;
  }


  public BusinessSubscriber party(BusinessProfessionnalParty party) {
    
    this.party = party;
    return this;
  }

   /**
   * Get party
   * @return party
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BusinessProfessionnalParty getParty() {
    return party;
  }


  public void setParty(BusinessProfessionnalParty party) {
    this.party = party;
  }


  public BusinessSubscriber eInvoicing(BusinessSubscriberEInvoicing eInvoicing) {
    
    this.eInvoicing = eInvoicing;
    return this;
  }

   /**
   * Get eInvoicing
   * @return eInvoicing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BusinessSubscriberEInvoicing geteInvoicing() {
    return eInvoicing;
  }


  public void seteInvoicing(BusinessSubscriberEInvoicing eInvoicing) {
    this.eInvoicing = eInvoicing;
  }


  public BusinessSubscriber contactPerson(BusinessPerson contactPerson) {
    
    this.contactPerson = contactPerson;
    return this;
  }

   /**
   * Get contactPerson
   * @return contactPerson
  **/
  @ApiModelProperty(required = true, value = "")

  public BusinessPerson getContactPerson() {
    return contactPerson;
  }


  public void setContactPerson(BusinessPerson contactPerson) {
    this.contactPerson = contactPerson;
  }


  public BusinessSubscriber contactAddress(BusinessAddress contactAddress) {
    
    this.contactAddress = contactAddress;
    return this;
  }

   /**
   * Get contactAddress
   * @return contactAddress
  **/
  @ApiModelProperty(required = true, value = "")

  public BusinessAddress getContactAddress() {
    return contactAddress;
  }


  public void setContactAddress(BusinessAddress contactAddress) {
    this.contactAddress = contactAddress;
  }


  public BusinessSubscriber billingAddress(BusinessAddress billingAddress) {
    
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Get billingAddress
   * @return billingAddress
  **/
  @ApiModelProperty(required = true, value = "")

  public BusinessAddress getBillingAddress() {
    return billingAddress;
  }


  public void setBillingAddress(BusinessAddress billingAddress) {
    this.billingAddress = billingAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessSubscriber businessSubscriber = (BusinessSubscriber) o;
    return Objects.equals(this.subscriberRef, businessSubscriber.subscriberRef) &&
        Objects.equals(this.subscriberType, businessSubscriber.subscriberType) &&
        Objects.equals(this.party, businessSubscriber.party) &&
        Objects.equals(this.eInvoicing, businessSubscriber.eInvoicing) &&
        Objects.equals(this.contactPerson, businessSubscriber.contactPerson) &&
        Objects.equals(this.contactAddress, businessSubscriber.contactAddress) &&
        Objects.equals(this.billingAddress, businessSubscriber.billingAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriberRef, subscriberType, party, eInvoicing, contactPerson, contactAddress, billingAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessSubscriber {\n");
    sb.append("    subscriberRef: ").append(toIndentedString(subscriberRef)).append("\n");
    sb.append("    subscriberType: ").append(toIndentedString(subscriberType)).append("\n");
    sb.append("    party: ").append(toIndentedString(party)).append("\n");
    sb.append("    eInvoicing: ").append(toIndentedString(eInvoicing)).append("\n");
    sb.append("    contactPerson: ").append(toIndentedString(contactPerson)).append("\n");
    sb.append("    contactAddress: ").append(toIndentedString(contactAddress)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

