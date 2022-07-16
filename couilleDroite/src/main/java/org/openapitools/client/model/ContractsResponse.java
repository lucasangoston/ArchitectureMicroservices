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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.ContractResponse;
import org.openapitools.client.model.QueryMetadataResponse;

/**
 * List of contracts that meet the search criteria
 */
@ApiModel(description = "List of contracts that meet the search criteria")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-16T16:18:57.613106+02:00[Europe/Paris]")
public class ContractsResponse {
  public static final String SERIALIZED_NAME_CONTRACTS = "contracts";
  @SerializedName(SERIALIZED_NAME_CONTRACTS)
  private List<ContractResponse> contracts = null;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private QueryMetadataResponse metadata;


  public ContractsResponse contracts(List<ContractResponse> contracts) {
    
    this.contracts = contracts;
    return this;
  }

  public ContractsResponse addContractsItem(ContractResponse contractsItem) {
    if (this.contracts == null) {
      this.contracts = new ArrayList<ContractResponse>();
    }
    this.contracts.add(contractsItem);
    return this;
  }

   /**
   * Get contracts
   * @return contracts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ContractResponse> getContracts() {
    return contracts;
  }


  public void setContracts(List<ContractResponse> contracts) {
    this.contracts = contracts;
  }


  public ContractsResponse metadata(QueryMetadataResponse metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public QueryMetadataResponse getMetadata() {
    return metadata;
  }


  public void setMetadata(QueryMetadataResponse metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractsResponse contractsResponse = (ContractsResponse) o;
    return Objects.equals(this.contracts, contractsResponse.contracts) &&
        Objects.equals(this.metadata, contractsResponse.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contracts, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractsResponse {\n");
    sb.append("    contracts: ").append(toIndentedString(contracts)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

