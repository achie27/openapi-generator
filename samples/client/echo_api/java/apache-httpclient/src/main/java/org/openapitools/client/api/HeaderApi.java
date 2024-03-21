/*
 * Echo Server API
 * Echo Server API
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.api;

import com.fasterxml.jackson.core.type.TypeReference;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import org.openapitools.client.model.StringEnumRef;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0-SNAPSHOT")
public class HeaderApi extends BaseApi {

  public HeaderApi() {
    super(Configuration.getDefaultApiClient());
  }

  public HeaderApi(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * Test header parameter(s)
   * Test header parameter(s)
   * @param integerHeader  (optional)
   * @param booleanHeader  (optional)
   * @param stringHeader  (optional)
   * @param enumNonrefStringHeader  (optional)
   * @param enumRefStringHeader  (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String testHeaderIntegerBooleanStringEnums(Integer integerHeader, Boolean booleanHeader, String stringHeader, String enumNonrefStringHeader, StringEnumRef enumRefStringHeader) throws ApiException {
    return this.testHeaderIntegerBooleanStringEnums(integerHeader, booleanHeader, stringHeader, enumNonrefStringHeader, enumRefStringHeader, Collections.emptyMap());
  }


  /**
   * Test header parameter(s)
   * Test header parameter(s)
   * @param integerHeader  (optional)
   * @param booleanHeader  (optional)
   * @param stringHeader  (optional)
   * @param enumNonrefStringHeader  (optional)
   * @param enumRefStringHeader  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String testHeaderIntegerBooleanStringEnums(Integer integerHeader, Boolean booleanHeader, String stringHeader, String enumNonrefStringHeader, StringEnumRef enumRefStringHeader, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/header/integer/boolean/string/enums";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    if (integerHeader != null)
      localVarHeaderParams.put("integer_header", apiClient.parameterToString(integerHeader));
if (booleanHeader != null)
      localVarHeaderParams.put("boolean_header", apiClient.parameterToString(booleanHeader));
if (stringHeader != null)
      localVarHeaderParams.put("string_header", apiClient.parameterToString(stringHeader));
if (enumNonrefStringHeader != null)
      localVarHeaderParams.put("enum_nonref_string_header", apiClient.parameterToString(enumNonrefStringHeader));
if (enumRefStringHeader != null)
      localVarHeaderParams.put("enum_ref_string_header", apiClient.parameterToString(enumRefStringHeader));

    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<String> localVarReturnType = new TypeReference<String>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  @Override
  public <T> T invokeAPI(String url, String method, Object request, TypeReference<T> returnType, Map<String, String> additionalHeaders) throws ApiException {
    String localVarPath = url.replace(apiClient.getBaseURL(), "");
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarHeaderParams.putAll(additionalHeaders);

    final String[] localVarAccepts = {
      "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    return apiClient.invokeAPI(
      localVarPath,
        method,
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        request,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        returnType
    );
  }
}
