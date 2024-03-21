/*
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * AnyTypeTest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0-SNAPSHOT")
public class AnyTypeTest {
  public static final String SERIALIZED_NAME_ANY_TYPE_PROPERTY = "any_type_property";
  @SerializedName(SERIALIZED_NAME_ANY_TYPE_PROPERTY)
  private Object anyTypeProperty = null;

  public static final String SERIALIZED_NAME_ARRAY_PROP = "array_prop";
  @SerializedName(SERIALIZED_NAME_ARRAY_PROP)
  private List<String> arrayProp = new ArrayList<>();

  public static final String SERIALIZED_NAME_REF_ARRAY_PREFIX_ITEMS = "ref_array_prefix_items";
  @SerializedName(SERIALIZED_NAME_REF_ARRAY_PREFIX_ITEMS)
  private List<String> refArrayPrefixItems = new ArrayList<>();

  public AnyTypeTest() {
  }

  public AnyTypeTest anyTypeProperty(Object anyTypeProperty) {
    this.anyTypeProperty = anyTypeProperty;
    return this;
  }

   /**
   * Get anyTypeProperty
   * @return anyTypeProperty
  **/
  @javax.annotation.Nullable
  public Object getAnyTypeProperty() {
    return anyTypeProperty;
  }

  public void setAnyTypeProperty(Object anyTypeProperty) {
    this.anyTypeProperty = anyTypeProperty;
  }


  public AnyTypeTest arrayProp(List<String> arrayProp) {
    this.arrayProp = arrayProp;
    return this;
  }

  public AnyTypeTest addArrayPropItem(String arrayPropItem) {
    if (this.arrayProp == null) {
      this.arrayProp = new ArrayList<>();
    }
    this.arrayProp.add(arrayPropItem);
    return this;
  }

   /**
   * test array in 3.1 spec
   * @return arrayProp
  **/
  @javax.annotation.Nullable
  public List<String> getArrayProp() {
    return arrayProp;
  }

  public void setArrayProp(List<String> arrayProp) {
    this.arrayProp = arrayProp;
  }


  public AnyTypeTest refArrayPrefixItems(List<String> refArrayPrefixItems) {
    this.refArrayPrefixItems = refArrayPrefixItems;
    return this;
  }

  public AnyTypeTest addRefArrayPrefixItemsItem(String refArrayPrefixItemsItem) {
    if (this.refArrayPrefixItems == null) {
      this.refArrayPrefixItems = new ArrayList<>();
    }
    this.refArrayPrefixItems.add(refArrayPrefixItemsItem);
    return this;
  }

   /**
   * An item that was added to the queue. 
   * @return refArrayPrefixItems
  **/
  @javax.annotation.Nullable
  public List<String> getRefArrayPrefixItems() {
    return refArrayPrefixItems;
  }

  public void setRefArrayPrefixItems(List<String> refArrayPrefixItems) {
    this.refArrayPrefixItems = refArrayPrefixItems;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the AnyTypeTest instance itself
   */
  public AnyTypeTest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnyTypeTest anyTypeTest = (AnyTypeTest) o;
    return Objects.equals(this.anyTypeProperty, anyTypeTest.anyTypeProperty) &&
        Objects.equals(this.arrayProp, anyTypeTest.arrayProp) &&
        Objects.equals(this.refArrayPrefixItems, anyTypeTest.refArrayPrefixItems)&&
        Objects.equals(this.additionalProperties, anyTypeTest.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(anyTypeProperty, arrayProp, refArrayPrefixItems, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnyTypeTest {\n");
    sb.append("    anyTypeProperty: ").append(toIndentedString(anyTypeProperty)).append("\n");
    sb.append("    arrayProp: ").append(toIndentedString(arrayProp)).append("\n");
    sb.append("    refArrayPrefixItems: ").append(toIndentedString(refArrayPrefixItems)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("any_type_property");
    openapiFields.add("array_prop");
    openapiFields.add("ref_array_prefix_items");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AnyTypeTest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AnyTypeTest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AnyTypeTest is not found in the empty JSON string", AnyTypeTest.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("array_prop") != null && !jsonObj.get("array_prop").isJsonNull() && !jsonObj.get("array_prop").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `array_prop` to be an array in the JSON string but got `%s`", jsonObj.get("array_prop").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ref_array_prefix_items") != null && !jsonObj.get("ref_array_prefix_items").isJsonNull() && !jsonObj.get("ref_array_prefix_items").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ref_array_prefix_items` to be an array in the JSON string but got `%s`", jsonObj.get("ref_array_prefix_items").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AnyTypeTest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AnyTypeTest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AnyTypeTest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AnyTypeTest.class));

       return (TypeAdapter<T>) new TypeAdapter<AnyTypeTest>() {
           @Override
           public void write(JsonWriter out, AnyTypeTest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public AnyTypeTest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AnyTypeTest instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AnyTypeTest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AnyTypeTest
  * @throws IOException if the JSON string is invalid with respect to AnyTypeTest
  */
  public static AnyTypeTest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AnyTypeTest.class);
  }

 /**
  * Convert an instance of AnyTypeTest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

