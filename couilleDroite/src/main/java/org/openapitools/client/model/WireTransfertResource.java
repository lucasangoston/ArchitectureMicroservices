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
 * SEPA Informations
 */
@ApiModel(description = "SEPA Informations")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-16T16:18:57.613106+02:00[Europe/Paris]")
public class WireTransfertResource {
  public static final String SERIALIZED_NAME_RUM = "rum";
  @SerializedName(SERIALIZED_NAME_RUM)
  private String rum;


  public WireTransfertResource rum(String rum) {
    
    this.rum = rum;
    return this;
  }

   /**
   * Référence Unique de Mandat
   * @return rum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "RUM08918098739762ABCGDF65524255658", value = "Référence Unique de Mandat")

  public String getRum() {
    return rum;
  }


  public void setRum(String rum) {
    this.rum = rum;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WireTransfertResource wireTransfertResource = (WireTransfertResource) o;
    return Objects.equals(this.rum, wireTransfertResource.rum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rum);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WireTransfertResource {\n");
    sb.append("    rum: ").append(toIndentedString(rum)).append("\n");
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

