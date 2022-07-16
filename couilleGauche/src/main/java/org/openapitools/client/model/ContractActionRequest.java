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

/**
 * Describe contract action
 */
@ApiModel(description = "Describe contract action")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-16T16:19:57.320415+02:00[Europe/Paris]")
public class ContractActionRequest {
  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_CONTRACT_REF = "contractRef";
  @SerializedName(SERIALIZED_NAME_CONTRACT_REF)
  private String contractRef;


  public ContractActionRequest action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "activation", value = "")

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public ContractActionRequest contractRef(String contractRef) {
    
    this.contractRef = contractRef;
    return this;
  }

   /**
   * Get contractRef
   * @return contractRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getContractRef() {
    return contractRef;
  }


  public void setContractRef(String contractRef) {
    this.contractRef = contractRef;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractActionRequest contractActionRequest = (ContractActionRequest) o;
    return Objects.equals(this.action, contractActionRequest.action) &&
        Objects.equals(this.contractRef, contractActionRequest.contractRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, contractRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractActionRequest {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    contractRef: ").append(toIndentedString(contractRef)).append("\n");
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

