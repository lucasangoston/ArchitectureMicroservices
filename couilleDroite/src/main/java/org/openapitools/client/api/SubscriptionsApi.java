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


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.SubscriptionRequest;
import org.openapitools.client.model.SubscriptionResponse;
import org.openapitools.client.model.SubscriptionsResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubscriptionsApi {
    private ApiClient localVarApiClient;

    public SubscriptionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SubscriptionsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getSubscription
     * @param subscriptionRef External identifier of the subscription (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> ERROR - Not authenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> ERROR - Access token does not have the required scope </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> ERROR - Internal Server error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSubscriptionCall(String subscriptionRef, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/subscriptions/{subscriptionRef}"
            .replaceAll("\\{" + "subscriptionRef" + "\\}", localVarApiClient.escapeString(subscriptionRef.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKey", "OAuth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getSubscriptionValidateBeforeCall(String subscriptionRef, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'subscriptionRef' is set
        if (subscriptionRef == null) {
            throw new ApiException("Missing the required parameter 'subscriptionRef' when calling getSubscription(Async)");
        }
        

        okhttp3.Call localVarCall = getSubscriptionCall(subscriptionRef, _callback);
        return localVarCall;

    }

    /**
     * Read Subscription
     * Get an existing Subscription
     * @param subscriptionRef External identifier of the subscription (required)
     * @return SubscriptionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> ERROR - Not authenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> ERROR - Access token does not have the required scope </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> ERROR - Internal Server error </td><td>  -  </td></tr>
     </table>
     */
    public SubscriptionResponse getSubscription(String subscriptionRef) throws ApiException {
        ApiResponse<SubscriptionResponse> localVarResp = getSubscriptionWithHttpInfo(subscriptionRef);
        return localVarResp.getData();
    }

    /**
     * Read Subscription
     * Get an existing Subscription
     * @param subscriptionRef External identifier of the subscription (required)
     * @return ApiResponse&lt;SubscriptionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> ERROR - Not authenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> ERROR - Access token does not have the required scope </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> ERROR - Internal Server error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SubscriptionResponse> getSubscriptionWithHttpInfo(String subscriptionRef) throws ApiException {
        okhttp3.Call localVarCall = getSubscriptionValidateBeforeCall(subscriptionRef, null);
        Type localVarReturnType = new TypeToken<SubscriptionResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Read Subscription (asynchronously)
     * Get an existing Subscription
     * @param subscriptionRef External identifier of the subscription (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> ERROR - Not authenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> ERROR - Access token does not have the required scope </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> ERROR - Internal Server error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSubscriptionAsync(String subscriptionRef, final ApiCallback<SubscriptionResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSubscriptionValidateBeforeCall(subscriptionRef, _callback);
        Type localVarReturnType = new TypeToken<SubscriptionResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for patchSubscription
     * @param subscriptionRef External identifier of the subscription (required)
     * @param subscriptionRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> ERROR - Invalid object request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> ERROR - Not authenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> ERROR - Access token does not have the required scope </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> ERROR - Internal Server error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call patchSubscriptionCall(String subscriptionRef, SubscriptionRequest subscriptionRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = subscriptionRequest;

        // create path and map variables
        String localVarPath = "/subscriptions/{subscriptionRef}"
            .replaceAll("\\{" + "subscriptionRef" + "\\}", localVarApiClient.escapeString(subscriptionRef.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKey", "OAuth2" };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call patchSubscriptionValidateBeforeCall(String subscriptionRef, SubscriptionRequest subscriptionRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'subscriptionRef' is set
        if (subscriptionRef == null) {
            throw new ApiException("Missing the required parameter 'subscriptionRef' when calling patchSubscription(Async)");
        }
        

        okhttp3.Call localVarCall = patchSubscriptionCall(subscriptionRef, subscriptionRequest, _callback);
        return localVarCall;

    }

    /**
     * Patch Subscription
     * Update an existing Subscription
     * @param subscriptionRef External identifier of the subscription (required)
     * @param subscriptionRequest  (optional)
     * @return SubscriptionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> ERROR - Invalid object request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> ERROR - Not authenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> ERROR - Access token does not have the required scope </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> ERROR - Internal Server error </td><td>  -  </td></tr>
     </table>
     */
    public SubscriptionResponse patchSubscription(String subscriptionRef, SubscriptionRequest subscriptionRequest) throws ApiException {
        ApiResponse<SubscriptionResponse> localVarResp = patchSubscriptionWithHttpInfo(subscriptionRef, subscriptionRequest);
        return localVarResp.getData();
    }

    /**
     * Patch Subscription
     * Update an existing Subscription
     * @param subscriptionRef External identifier of the subscription (required)
     * @param subscriptionRequest  (optional)
     * @return ApiResponse&lt;SubscriptionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> ERROR - Invalid object request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> ERROR - Not authenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> ERROR - Access token does not have the required scope </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> ERROR - Internal Server error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SubscriptionResponse> patchSubscriptionWithHttpInfo(String subscriptionRef, SubscriptionRequest subscriptionRequest) throws ApiException {
        okhttp3.Call localVarCall = patchSubscriptionValidateBeforeCall(subscriptionRef, subscriptionRequest, null);
        Type localVarReturnType = new TypeToken<SubscriptionResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Patch Subscription (asynchronously)
     * Update an existing Subscription
     * @param subscriptionRef External identifier of the subscription (required)
     * @param subscriptionRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> ERROR - Invalid object request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> ERROR - Not authenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> ERROR - Access token does not have the required scope </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> ERROR - Internal Server error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call patchSubscriptionAsync(String subscriptionRef, SubscriptionRequest subscriptionRequest, final ApiCallback<SubscriptionResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = patchSubscriptionValidateBeforeCall(subscriptionRef, subscriptionRequest, _callback);
        Type localVarReturnType = new TypeToken<SubscriptionResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for postSubscription
     * @param subscriptionRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> SUCCESS - Subscription created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> ERROR - Invalid object request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> ERROR - Not authenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> ERROR - Access token does not have the required scope </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> ERROR - Internal Server error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postSubscriptionCall(SubscriptionRequest subscriptionRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = subscriptionRequest;

        // create path and map variables
        String localVarPath = "/subscriptions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKey", "OAuth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call postSubscriptionValidateBeforeCall(SubscriptionRequest subscriptionRequest, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = postSubscriptionCall(subscriptionRequest, _callback);
        return localVarCall;

    }

    /**
     * Add Subscriptions
     * Add a new Subscription
     * @param subscriptionRequest  (optional)
     * @return SubscriptionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> SUCCESS - Subscription created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> ERROR - Invalid object request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> ERROR - Not authenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> ERROR - Access token does not have the required scope </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> ERROR - Internal Server error </td><td>  -  </td></tr>
     </table>
     */
    public SubscriptionResponse postSubscription(SubscriptionRequest subscriptionRequest) throws ApiException {
        ApiResponse<SubscriptionResponse> localVarResp = postSubscriptionWithHttpInfo(subscriptionRequest);
        return localVarResp.getData();
    }

    /**
     * Add Subscriptions
     * Add a new Subscription
     * @param subscriptionRequest  (optional)
     * @return ApiResponse&lt;SubscriptionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> SUCCESS - Subscription created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> ERROR - Invalid object request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> ERROR - Not authenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> ERROR - Access token does not have the required scope </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> ERROR - Internal Server error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SubscriptionResponse> postSubscriptionWithHttpInfo(SubscriptionRequest subscriptionRequest) throws ApiException {
        okhttp3.Call localVarCall = postSubscriptionValidateBeforeCall(subscriptionRequest, null);
        Type localVarReturnType = new TypeToken<SubscriptionResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add Subscriptions (asynchronously)
     * Add a new Subscription
     * @param subscriptionRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> SUCCESS - Subscription created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> ERROR - Invalid object request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> ERROR - Not authenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> ERROR - Access token does not have the required scope </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> ERROR - Internal Server error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postSubscriptionAsync(SubscriptionRequest subscriptionRequest, final ApiCallback<SubscriptionResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = postSubscriptionValidateBeforeCall(subscriptionRequest, _callback);
        Type localVarReturnType = new TypeToken<SubscriptionResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for searchSubscriptions
     * @param contractRef External identifier of the deferred billing contract for the customer (optional)
     * @param customerRef External identifier of the buyer (optional)
     * @param contractStatus Contract Status (optional)
     * @param limit Limits the number of items on a page (optional)
     * @param offset Specifies the page number of the list to be displayed (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> SUCCESS - Returns a list of Subscriptions </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> ERROR - Not authenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> ERROR - Access token does not have the required scope </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> ERROR - Internal Server error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call searchSubscriptionsCall(String contractRef, String customerRef, String contractStatus, Integer limit, Integer offset, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/subscriptions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (contractRef != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("contractRef", contractRef));
        }

        if (customerRef != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("customerRef", customerRef));
        }

        if (contractStatus != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("contractStatus", contractStatus));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKey", "OAuth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call searchSubscriptionsValidateBeforeCall(String contractRef, String customerRef, String contractStatus, Integer limit, Integer offset, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = searchSubscriptionsCall(contractRef, customerRef, contractStatus, limit, offset, _callback);
        return localVarCall;

    }

    /**
     * Search Subscriptions
     * Multi-criteria search for subscriptions. The result is a list (maybe empty) of subscriptions
     * @param contractRef External identifier of the deferred billing contract for the customer (optional)
     * @param customerRef External identifier of the buyer (optional)
     * @param contractStatus Contract Status (optional)
     * @param limit Limits the number of items on a page (optional)
     * @param offset Specifies the page number of the list to be displayed (optional)
     * @return SubscriptionsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> SUCCESS - Returns a list of Subscriptions </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> ERROR - Not authenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> ERROR - Access token does not have the required scope </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> ERROR - Internal Server error </td><td>  -  </td></tr>
     </table>
     */
    public SubscriptionsResponse searchSubscriptions(String contractRef, String customerRef, String contractStatus, Integer limit, Integer offset) throws ApiException {
        ApiResponse<SubscriptionsResponse> localVarResp = searchSubscriptionsWithHttpInfo(contractRef, customerRef, contractStatus, limit, offset);
        return localVarResp.getData();
    }

    /**
     * Search Subscriptions
     * Multi-criteria search for subscriptions. The result is a list (maybe empty) of subscriptions
     * @param contractRef External identifier of the deferred billing contract for the customer (optional)
     * @param customerRef External identifier of the buyer (optional)
     * @param contractStatus Contract Status (optional)
     * @param limit Limits the number of items on a page (optional)
     * @param offset Specifies the page number of the list to be displayed (optional)
     * @return ApiResponse&lt;SubscriptionsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> SUCCESS - Returns a list of Subscriptions </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> ERROR - Not authenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> ERROR - Access token does not have the required scope </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> ERROR - Internal Server error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SubscriptionsResponse> searchSubscriptionsWithHttpInfo(String contractRef, String customerRef, String contractStatus, Integer limit, Integer offset) throws ApiException {
        okhttp3.Call localVarCall = searchSubscriptionsValidateBeforeCall(contractRef, customerRef, contractStatus, limit, offset, null);
        Type localVarReturnType = new TypeToken<SubscriptionsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Search Subscriptions (asynchronously)
     * Multi-criteria search for subscriptions. The result is a list (maybe empty) of subscriptions
     * @param contractRef External identifier of the deferred billing contract for the customer (optional)
     * @param customerRef External identifier of the buyer (optional)
     * @param contractStatus Contract Status (optional)
     * @param limit Limits the number of items on a page (optional)
     * @param offset Specifies the page number of the list to be displayed (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> SUCCESS - Returns a list of Subscriptions </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> ERROR - Not authenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> ERROR - Access token does not have the required scope </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> ERROR - Internal Server error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call searchSubscriptionsAsync(String contractRef, String customerRef, String contractStatus, Integer limit, Integer offset, final ApiCallback<SubscriptionsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = searchSubscriptionsValidateBeforeCall(contractRef, customerRef, contractStatus, limit, offset, _callback);
        Type localVarReturnType = new TypeToken<SubscriptionsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}