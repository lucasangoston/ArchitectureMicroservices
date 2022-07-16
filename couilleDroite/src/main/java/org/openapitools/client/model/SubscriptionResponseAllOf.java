/*
 * Travel Billing
 * The Travel Invoicing Application System
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

/**
 * SubscriptionResponseAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-16T16:16:14.922776+02:00[Europe/Paris]")
public class SubscriptionResponseAllOf {
  public static final String SERIALIZED_NAME_SUBSCRIPTION_ID = "subscriptionId";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_ID)
  private Integer subscriptionId;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_REF = "subscriptionRef";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_REF)
  private String subscriptionRef;


  public SubscriptionResponseAllOf subscriptionId(Integer subscriptionId) {
    
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * Internal identifier of the subscription
   * @return subscriptionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "58761542", value = "Internal identifier of the subscription")

  public Integer getSubscriptionId() {
    return subscriptionId;
  }


  public void setSubscriptionId(Integer subscriptionId) {
    this.subscriptionId = subscriptionId;
  }


  public SubscriptionResponseAllOf subscriptionRef(String subscriptionRef) {
    
    this.subscriptionRef = subscriptionRef;
    return this;
  }

   /**
   * External identifier of the subscription
   * @return subscriptionRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SUB-YTYE65687", value = "External identifier of the subscription")

  public String getSubscriptionRef() {
    return subscriptionRef;
  }


  public void setSubscriptionRef(String subscriptionRef) {
    this.subscriptionRef = subscriptionRef;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionResponseAllOf subscriptionResponseAllOf = (SubscriptionResponseAllOf) o;
    return Objects.equals(this.subscriptionId, subscriptionResponseAllOf.subscriptionId) &&
        Objects.equals(this.subscriptionRef, subscriptionResponseAllOf.subscriptionRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionId, subscriptionRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionResponseAllOf {\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    subscriptionRef: ").append(toIndentedString(subscriptionRef)).append("\n");
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

