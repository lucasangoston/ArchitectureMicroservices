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
import java.math.BigDecimal;

/**
 * CurrentBill
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-16T16:16:14.922776+02:00[Europe/Paris]")
public class CurrentBill {
  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customerId";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private String customerId;

  public static final String SERIALIZED_NAME_BILL = "bill";
  @SerializedName(SERIALIZED_NAME_BILL)
  private BigDecimal bill;


  public CurrentBill customerId(String customerId) {
    
    this.customerId = customerId;
    return this;
  }

   /**
   * Customer Id
   * @return customerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Customer Id")

  public String getCustomerId() {
    return customerId;
  }


  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  public CurrentBill bill(BigDecimal bill) {
    
    this.bill = bill;
    return this;
  }

   /**
   * Customer current bill
   * @return bill
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Customer current bill")

  public BigDecimal getBill() {
    return bill;
  }


  public void setBill(BigDecimal bill) {
    this.bill = bill;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentBill currentBill = (CurrentBill) o;
    return Objects.equals(this.customerId, currentBill.customerId) &&
        Objects.equals(this.bill, currentBill.bill);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, bill);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentBill {\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    bill: ").append(toIndentedString(bill)).append("\n");
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

