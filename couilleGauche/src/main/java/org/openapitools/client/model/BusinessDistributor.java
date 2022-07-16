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
import org.openapitools.client.model.BusinessDistributorEFacturation;
import org.openapitools.client.model.BusinessPerson;

/**
 * Describes distributor organisation &amp; contact
 */
@ApiModel(description = "Describes distributor organisation & contact")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-16T16:19:57.320415+02:00[Europe/Paris]")
public class BusinessDistributor {
  public static final String SERIALIZED_NAME_DISRIBUTOR_REF = "disributorRef";
  @SerializedName(SERIALIZED_NAME_DISRIBUTOR_REF)
  private String disributorRef;

  public static final String SERIALIZED_NAME_E_FACTURATION = "eFacturation";
  @SerializedName(SERIALIZED_NAME_E_FACTURATION)
  private BusinessDistributorEFacturation eFacturation;

  public static final String SERIALIZED_NAME_CONTACT_PERSON = "contactPerson";
  @SerializedName(SERIALIZED_NAME_CONTACT_PERSON)
  private BusinessPerson contactPerson;

  public static final String SERIALIZED_NAME_CONTACT_ADDRESS = "contactAddress";
  @SerializedName(SERIALIZED_NAME_CONTACT_ADDRESS)
  private BusinessAddress contactAddress;


  public BusinessDistributor disributorRef(String disributorRef) {
    
    this.disributorRef = disributorRef;
    return this;
  }

   /**
   * External reference of distributor
   * @return disributorRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "esgi SA", value = "External reference of distributor")

  public String getDisributorRef() {
    return disributorRef;
  }


  public void setDisributorRef(String disributorRef) {
    this.disributorRef = disributorRef;
  }


  public BusinessDistributor eFacturation(BusinessDistributorEFacturation eFacturation) {
    
    this.eFacturation = eFacturation;
    return this;
  }

   /**
   * Get eFacturation
   * @return eFacturation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BusinessDistributorEFacturation geteFacturation() {
    return eFacturation;
  }


  public void seteFacturation(BusinessDistributorEFacturation eFacturation) {
    this.eFacturation = eFacturation;
  }


  public BusinessDistributor contactPerson(BusinessPerson contactPerson) {
    
    this.contactPerson = contactPerson;
    return this;
  }

   /**
   * Get contactPerson
   * @return contactPerson
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BusinessPerson getContactPerson() {
    return contactPerson;
  }


  public void setContactPerson(BusinessPerson contactPerson) {
    this.contactPerson = contactPerson;
  }


  public BusinessDistributor contactAddress(BusinessAddress contactAddress) {
    
    this.contactAddress = contactAddress;
    return this;
  }

   /**
   * Get contactAddress
   * @return contactAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BusinessAddress getContactAddress() {
    return contactAddress;
  }


  public void setContactAddress(BusinessAddress contactAddress) {
    this.contactAddress = contactAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessDistributor businessDistributor = (BusinessDistributor) o;
    return Objects.equals(this.disributorRef, businessDistributor.disributorRef) &&
        Objects.equals(this.eFacturation, businessDistributor.eFacturation) &&
        Objects.equals(this.contactPerson, businessDistributor.contactPerson) &&
        Objects.equals(this.contactAddress, businessDistributor.contactAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disributorRef, eFacturation, contactPerson, contactAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessDistributor {\n");
    sb.append("    disributorRef: ").append(toIndentedString(disributorRef)).append("\n");
    sb.append("    eFacturation: ").append(toIndentedString(eFacturation)).append("\n");
    sb.append("    contactPerson: ").append(toIndentedString(contactPerson)).append("\n");
    sb.append("    contactAddress: ").append(toIndentedString(contactAddress)).append("\n");
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

