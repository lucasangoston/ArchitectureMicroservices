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
 * Bank Coordinates
 */
@ApiModel(description = "Bank Coordinates")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-16T16:16:14.922776+02:00[Europe/Paris]")
public class WireTransfertResourceBankCoordinates {
  public static final String SERIALIZED_NAME_BANK_CODE = "bankCode";
  @SerializedName(SERIALIZED_NAME_BANK_CODE)
  private String bankCode;

  public static final String SERIALIZED_NAME_BRANCH_CODE = "branchCode";
  @SerializedName(SERIALIZED_NAME_BRANCH_CODE)
  private String branchCode;

  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "accountNumber";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_IBAN = "iban";
  @SerializedName(SERIALIZED_NAME_IBAN)
  private String iban;

  public static final String SERIALIZED_NAME_BIC = "bic";
  @SerializedName(SERIALIZED_NAME_BIC)
  private String bic;

  public static final String SERIALIZED_NAME_ACCOUNT_OWNER = "accountOwner";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_OWNER)
  private String accountOwner;

  public static final String SERIALIZED_NAME_BANK_NAME = "bankName";
  @SerializedName(SERIALIZED_NAME_BANK_NAME)
  private String bankName;

  public static final String SERIALIZED_NAME_ICS = "ics";
  @SerializedName(SERIALIZED_NAME_ICS)
  private String ics;


  public WireTransfertResourceBankCoordinates bankCode(String bankCode) {
    
    this.bankCode = bankCode;
    return this;
  }

   /**
   * Bank identifier
   * @return bankCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12548", value = "Bank identifier")

  public String getBankCode() {
    return bankCode;
  }


  public void setBankCode(String bankCode) {
    this.bankCode = bankCode;
  }


  public WireTransfertResourceBankCoordinates branchCode(String branchCode) {
    
    this.branchCode = branchCode;
    return this;
  }

   /**
   * Bank branch identifier
   * @return branchCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "02998", value = "Bank branch identifier")

  public String getBranchCode() {
    return branchCode;
  }


  public void setBranchCode(String branchCode) {
    this.branchCode = branchCode;
  }


  public WireTransfertResourceBankCoordinates accountNumber(String accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Account number extracted from RIB
   * @return accountNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "98765432109", value = "Account number extracted from RIB")

  public String getAccountNumber() {
    return accountNumber;
  }


  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public WireTransfertResourceBankCoordinates key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Control key extracted from RIB
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9172", value = "Control key extracted from RIB")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public WireTransfertResourceBankCoordinates iban(String iban) {
    
    this.iban = iban;
    return this;
  }

   /**
   * Identification Bank Account Number extracted from RIB
   * @return iban
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FR7612548029989876543210917", value = "Identification Bank Account Number extracted from RIB")

  public String getIban() {
    return iban;
  }


  public void setIban(String iban) {
    this.iban = iban;
  }


  public WireTransfertResourceBankCoordinates bic(String bic) {
    
    this.bic = bic;
    return this;
  }

   /**
   * Bank Identifier Number
   * @return bic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BIC", value = "Bank Identifier Number")

  public String getBic() {
    return bic;
  }


  public void setBic(String bic) {
    this.bic = bic;
  }


  public WireTransfertResourceBankCoordinates accountOwner(String accountOwner) {
    
    this.accountOwner = accountOwner;
    return this;
  }

   /**
   * Name of the account owner
   * @return accountOwner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Ma Petite Entreprise", value = "Name of the account owner")

  public String getAccountOwner() {
    return accountOwner;
  }


  public void setAccountOwner(String accountOwner) {
    this.accountOwner = accountOwner;
  }


  public WireTransfertResourceBankCoordinates bankName(String bankName) {
    
    this.bankName = bankName;
    return this;
  }

   /**
   * the clear name of the institution and the counter holding the account
   * @return bankName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "LA BANQUE DU BUYER", value = "the clear name of the institution and the counter holding the account")

  public String getBankName() {
    return bankName;
  }


  public void setBankName(String bankName) {
    this.bankName = bankName;
  }


  public WireTransfertResourceBankCoordinates ics(String ics) {
    
    this.ics = ics;
    return this;
  }

   /**
   * SEPA creditor identifier
   * @return ics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FR83ZZZ459654", value = "SEPA creditor identifier")

  public String getIcs() {
    return ics;
  }


  public void setIcs(String ics) {
    this.ics = ics;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WireTransfertResourceBankCoordinates wireTransfertResourceBankCoordinates = (WireTransfertResourceBankCoordinates) o;
    return Objects.equals(this.bankCode, wireTransfertResourceBankCoordinates.bankCode) &&
        Objects.equals(this.branchCode, wireTransfertResourceBankCoordinates.branchCode) &&
        Objects.equals(this.accountNumber, wireTransfertResourceBankCoordinates.accountNumber) &&
        Objects.equals(this.key, wireTransfertResourceBankCoordinates.key) &&
        Objects.equals(this.iban, wireTransfertResourceBankCoordinates.iban) &&
        Objects.equals(this.bic, wireTransfertResourceBankCoordinates.bic) &&
        Objects.equals(this.accountOwner, wireTransfertResourceBankCoordinates.accountOwner) &&
        Objects.equals(this.bankName, wireTransfertResourceBankCoordinates.bankName) &&
        Objects.equals(this.ics, wireTransfertResourceBankCoordinates.ics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankCode, branchCode, accountNumber, key, iban, bic, accountOwner, bankName, ics);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WireTransfertResourceBankCoordinates {\n");
    sb.append("    bankCode: ").append(toIndentedString(bankCode)).append("\n");
    sb.append("    branchCode: ").append(toIndentedString(branchCode)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    accountOwner: ").append(toIndentedString(accountOwner)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    ics: ").append(toIndentedString(ics)).append("\n");
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
