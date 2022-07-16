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
 * BusinessPerson
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-16T16:19:57.320415+02:00[Europe/Paris]")
public class BusinessPerson {
  public static final String SERIALIZED_NAME_CCUID = "ccuid";
  @SerializedName(SERIALIZED_NAME_CCUID)
  private String ccuid;

  /**
   * Gender of the contact
   */
  @JsonAdapter(GenderEnum.Adapter.class)
  public enum GenderEnum {
    M("M"),
    
    MME("MME");

    private String value;

    GenderEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static GenderEnum fromValue(String value) {
      for (GenderEnum b : GenderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<GenderEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GenderEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GenderEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return GenderEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private GenderEnum gender;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_MAIL = "mail";
  @SerializedName(SERIALIZED_NAME_MAIL)
  private String mail;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;


  public BusinessPerson ccuid(String ccuid) {
    
    this.ccuid = ccuid;
    return this;
  }

   /**
   * CCUID
   * @return ccuid
  **/
  @ApiModelProperty(example = "CCU-123", required = true, value = "CCUID")

  public String getCcuid() {
    return ccuid;
  }


  public void setCcuid(String ccuid) {
    this.ccuid = ccuid;
  }


  public BusinessPerson gender(GenderEnum gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Gender of the contact
   * @return gender
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "M", value = "Gender of the contact")

  public GenderEnum getGender() {
    return gender;
  }


  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }


  public BusinessPerson firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * First name of the contact
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "John", value = "First name of the contact")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public BusinessPerson lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name of the contact
   * @return lastName
  **/
  @ApiModelProperty(example = "DOE", required = true, value = "Last name of the contact")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public BusinessPerson mail(String mail) {
    
    this.mail = mail;
    return this;
  }

   /**
   * Mail address of the contact
   * @return mail
  **/
  @ApiModelProperty(example = "john.doe@acme.com", required = true, value = "Mail address of the contact")

  public String getMail() {
    return mail;
  }


  public void setMail(String mail) {
    this.mail = mail;
  }


  public BusinessPerson phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Phone number of the contact
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+33 (0)1 56 87 65 78", value = "Phone number of the contact")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessPerson businessPerson = (BusinessPerson) o;
    return Objects.equals(this.ccuid, businessPerson.ccuid) &&
        Objects.equals(this.gender, businessPerson.gender) &&
        Objects.equals(this.firstName, businessPerson.firstName) &&
        Objects.equals(this.lastName, businessPerson.lastName) &&
        Objects.equals(this.mail, businessPerson.mail) &&
        Objects.equals(this.phone, businessPerson.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ccuid, gender, firstName, lastName, mail, phone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessPerson {\n");
    sb.append("    ccuid: ").append(toIndentedString(ccuid)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    mail: ").append(toIndentedString(mail)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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

