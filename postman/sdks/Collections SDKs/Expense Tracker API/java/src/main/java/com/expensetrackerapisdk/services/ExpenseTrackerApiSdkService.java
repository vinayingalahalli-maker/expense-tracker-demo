package com.expensetrackerapisdk.services;

import com.expensetrackerapisdk.config.ExpenseTrackerApiSdkConfig;
import com.expensetrackerapisdk.config.RequestConfig;
import com.expensetrackerapisdk.exceptions.ApiError;
import com.expensetrackerapisdk.http.Environment;
import com.expensetrackerapisdk.http.ExpenseTrackerApiSdkResponse;
import com.expensetrackerapisdk.http.HttpMethod;
import com.expensetrackerapisdk.http.ModelConverter;
import com.expensetrackerapisdk.http.util.RequestBuilder;
import com.expensetrackerapisdk.models.CreateCategoryRequest;
import com.expensetrackerapisdk.models.CreateClaimRequest;
import com.expensetrackerapisdk.models.CreateExpenseRequest;
import com.expensetrackerapisdk.models.RejectClaimRequest;
import com.expensetrackerapisdk.models.UpdateExpenseRequest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import lombok.NonNull;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * ExpenseTrackerApiSdkService Service
 */
public class ExpenseTrackerApiSdkService extends BaseService {

  private RequestConfig listCategoriesConfig;
  private RequestConfig createCategoryConfig;
  private RequestConfig getCategoryConfig;
  private RequestConfig updateCategoryConfig;
  private RequestConfig listExpensesConfig;
  private RequestConfig createExpenseConfig;
  private RequestConfig getExpenseConfig;
  private RequestConfig updateExpenseConfig;
  private RequestConfig deleteExpenseConfig;
  private RequestConfig listClaimsConfig;
  private RequestConfig createClaimConfig;
  private RequestConfig getClaimConfig;
  private RequestConfig submitClaimConfig;
  private RequestConfig approveClaimConfig;
  private RequestConfig rejectClaimConfig;
  private RequestConfig reimburseClaimConfig;

  /**
   * Constructs a new instance of ExpenseTrackerApiSdkService.
   *
   * @param httpClient The HTTP client to use for requests
   * @param config The SDK configuration
   */
  public ExpenseTrackerApiSdkService(
    @NonNull OkHttpClient httpClient,
    ExpenseTrackerApiSdkConfig config
  ) {
    super(httpClient, config);
  }

  /**
   * Sets method-level configuration for {@code listCategories}.
   * Method-level overrides take precedence over service-level configuration but are
   * overridden by request-level configurations.
   *
   * @param config The configuration overrides to apply at the method level
   * @return This service instance for method chaining
   */
  public ExpenseTrackerApiSdkService setListCategoriesConfig(RequestConfig config) {
    this.listCategoriesConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for {@code createCategory}.
   * Method-level overrides take precedence over service-level configuration but are
   * overridden by request-level configurations.
   *
   * @param config The configuration overrides to apply at the method level
   * @return This service instance for method chaining
   */
  public ExpenseTrackerApiSdkService setCreateCategoryConfig(RequestConfig config) {
    this.createCategoryConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for {@code getCategory}.
   * Method-level overrides take precedence over service-level configuration but are
   * overridden by request-level configurations.
   *
   * @param config The configuration overrides to apply at the method level
   * @return This service instance for method chaining
   */
  public ExpenseTrackerApiSdkService setGetCategoryConfig(RequestConfig config) {
    this.getCategoryConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for {@code updateCategory}.
   * Method-level overrides take precedence over service-level configuration but are
   * overridden by request-level configurations.
   *
   * @param config The configuration overrides to apply at the method level
   * @return This service instance for method chaining
   */
  public ExpenseTrackerApiSdkService setUpdateCategoryConfig(RequestConfig config) {
    this.updateCategoryConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for {@code listExpenses}.
   * Method-level overrides take precedence over service-level configuration but are
   * overridden by request-level configurations.
   *
   * @param config The configuration overrides to apply at the method level
   * @return This service instance for method chaining
   */
  public ExpenseTrackerApiSdkService setListExpensesConfig(RequestConfig config) {
    this.listExpensesConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for {@code createExpense}.
   * Method-level overrides take precedence over service-level configuration but are
   * overridden by request-level configurations.
   *
   * @param config The configuration overrides to apply at the method level
   * @return This service instance for method chaining
   */
  public ExpenseTrackerApiSdkService setCreateExpenseConfig(RequestConfig config) {
    this.createExpenseConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for {@code getExpense}.
   * Method-level overrides take precedence over service-level configuration but are
   * overridden by request-level configurations.
   *
   * @param config The configuration overrides to apply at the method level
   * @return This service instance for method chaining
   */
  public ExpenseTrackerApiSdkService setGetExpenseConfig(RequestConfig config) {
    this.getExpenseConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for {@code updateExpense}.
   * Method-level overrides take precedence over service-level configuration but are
   * overridden by request-level configurations.
   *
   * @param config The configuration overrides to apply at the method level
   * @return This service instance for method chaining
   */
  public ExpenseTrackerApiSdkService setUpdateExpenseConfig(RequestConfig config) {
    this.updateExpenseConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for {@code deleteExpense}.
   * Method-level overrides take precedence over service-level configuration but are
   * overridden by request-level configurations.
   *
   * @param config The configuration overrides to apply at the method level
   * @return This service instance for method chaining
   */
  public ExpenseTrackerApiSdkService setDeleteExpenseConfig(RequestConfig config) {
    this.deleteExpenseConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for {@code listClaims}.
   * Method-level overrides take precedence over service-level configuration but are
   * overridden by request-level configurations.
   *
   * @param config The configuration overrides to apply at the method level
   * @return This service instance for method chaining
   */
  public ExpenseTrackerApiSdkService setListClaimsConfig(RequestConfig config) {
    this.listClaimsConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for {@code createClaim}.
   * Method-level overrides take precedence over service-level configuration but are
   * overridden by request-level configurations.
   *
   * @param config The configuration overrides to apply at the method level
   * @return This service instance for method chaining
   */
  public ExpenseTrackerApiSdkService setCreateClaimConfig(RequestConfig config) {
    this.createClaimConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for {@code getClaim}.
   * Method-level overrides take precedence over service-level configuration but are
   * overridden by request-level configurations.
   *
   * @param config The configuration overrides to apply at the method level
   * @return This service instance for method chaining
   */
  public ExpenseTrackerApiSdkService setGetClaimConfig(RequestConfig config) {
    this.getClaimConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for {@code submitClaim}.
   * Method-level overrides take precedence over service-level configuration but are
   * overridden by request-level configurations.
   *
   * @param config The configuration overrides to apply at the method level
   * @return This service instance for method chaining
   */
  public ExpenseTrackerApiSdkService setSubmitClaimConfig(RequestConfig config) {
    this.submitClaimConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for {@code approveClaim}.
   * Method-level overrides take precedence over service-level configuration but are
   * overridden by request-level configurations.
   *
   * @param config The configuration overrides to apply at the method level
   * @return This service instance for method chaining
   */
  public ExpenseTrackerApiSdkService setApproveClaimConfig(RequestConfig config) {
    this.approveClaimConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for {@code rejectClaim}.
   * Method-level overrides take precedence over service-level configuration but are
   * overridden by request-level configurations.
   *
   * @param config The configuration overrides to apply at the method level
   * @return This service instance for method chaining
   */
  public ExpenseTrackerApiSdkService setRejectClaimConfig(RequestConfig config) {
    this.rejectClaimConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for {@code reimburseClaim}.
   * Method-level overrides take precedence over service-level configuration but are
   * overridden by request-level configurations.
   *
   * @param config The configuration overrides to apply at the method level
   * @return This service instance for method chaining
   */
  public ExpenseTrackerApiSdkService setReimburseClaimConfig(RequestConfig config) {
    this.reimburseClaimConfig = config;
    return this;
  }

  /**
   * Method listCategories
   * GET /categories
   *
   * @return response of {@code Object}
   */
  public Object listCategories() throws ApiError {
    return this.listCategories(null);
  }

  /**
   * Method listCategories
   * GET /categories
   *
   * @return response of {@code Object}
   */
  public Object listCategories(RequestConfig requestConfig) throws ApiError {
    return withRawResponse().listCategories(requestConfig).getData();
  }

  /**
   * Method listCategories
   * GET /categories
   *
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> listCategoriesAsync() throws ApiError {
    return this.listCategoriesAsync(null);
  }

  /**
   * Method listCategories
   * GET /categories
   *
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> listCategoriesAsync(RequestConfig requestConfig)
    throws ApiError {
    return withRawResponse()
      .listCategoriesAsync(requestConfig)
      .thenApply(response -> response.getData());
  }

  private Request buildListCategoriesRequest(RequestConfig resolvedConfig) {
    return new RequestBuilder(
      HttpMethod.GET,
      resolveBaseUrl(resolvedConfig, Environment.DEFAULT),
      "categories"
    )
      .setAccessTokenAuth(resolveAccessToken(resolvedConfig), "Bearer")
      .build();
  }

  /**
   * Method createCategory
   * POST /categories
   *
   * @param createCategoryRequest {@link CreateCategoryRequest} Request Body
   * @return response of {@code Object}
   */
  public Object createCategory(@NonNull CreateCategoryRequest createCategoryRequest)
    throws ApiError {
    return this.createCategory(createCategoryRequest, null);
  }

  /**
   * Method createCategory
   * POST /categories
   *
   * @param createCategoryRequest {@link CreateCategoryRequest} Request Body
   * @return response of {@code Object}
   */
  public Object createCategory(
    @NonNull CreateCategoryRequest createCategoryRequest,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse().createCategory(createCategoryRequest, requestConfig).getData();
  }

  /**
   * Method createCategory
   * POST /categories
   *
   * @param createCategoryRequest {@link CreateCategoryRequest} Request Body
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> createCategoryAsync(
    @NonNull CreateCategoryRequest createCategoryRequest
  ) throws ApiError {
    return this.createCategoryAsync(createCategoryRequest, null);
  }

  /**
   * Method createCategory
   * POST /categories
   *
   * @param createCategoryRequest {@link CreateCategoryRequest} Request Body
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> createCategoryAsync(
    @NonNull CreateCategoryRequest createCategoryRequest,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse()
      .createCategoryAsync(createCategoryRequest, requestConfig)
      .thenApply(response -> response.getData());
  }

  private Request buildCreateCategoryRequest(
    @NonNull CreateCategoryRequest createCategoryRequest,
    RequestConfig resolvedConfig
  ) {
    return new RequestBuilder(
      HttpMethod.POST,
      resolveBaseUrl(resolvedConfig, Environment.DEFAULT),
      "categories"
    )
      .setAccessTokenAuth(resolveAccessToken(resolvedConfig), "Bearer")
      .setJsonContent(createCategoryRequest)
      .build();
  }

  /**
   * Method getCategory
   * GET /categories/{id}
   *
   * @param id String
   * @return response of {@code Object}
   */
  public Object getCategory(@NonNull String id) throws ApiError {
    return this.getCategory(id, null);
  }

  /**
   * Method getCategory
   * GET /categories/{id}
   *
   * @param id String
   * @return response of {@code Object}
   */
  public Object getCategory(@NonNull String id, RequestConfig requestConfig) throws ApiError {
    return withRawResponse().getCategory(id, requestConfig).getData();
  }

  /**
   * Method getCategory
   * GET /categories/{id}
   *
   * @param id String
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> getCategoryAsync(@NonNull String id) throws ApiError {
    return this.getCategoryAsync(id, null);
  }

  /**
   * Method getCategory
   * GET /categories/{id}
   *
   * @param id String
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> getCategoryAsync(
    @NonNull String id,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse()
      .getCategoryAsync(id, requestConfig)
      .thenApply(response -> response.getData());
  }

  private Request buildGetCategoryRequest(@NonNull String id, RequestConfig resolvedConfig) {
    return new RequestBuilder(
      HttpMethod.GET,
      resolveBaseUrl(resolvedConfig, Environment.DEFAULT),
      "categories/{id}"
    )
      .setAccessTokenAuth(resolveAccessToken(resolvedConfig), "Bearer")
      .setPathParameter("id", id)
      .build();
  }

  /**
   * Method updateCategory
   * PUT /categories/{id}
   *
   * @param id String
   * @param createCategoryRequest {@link CreateCategoryRequest} Request Body
   * @return response of {@code Object}
   */
  public Object updateCategory(
    @NonNull String id,
    @NonNull CreateCategoryRequest createCategoryRequest
  ) throws ApiError {
    return this.updateCategory(id, createCategoryRequest, null);
  }

  /**
   * Method updateCategory
   * PUT /categories/{id}
   *
   * @param id String
   * @param createCategoryRequest {@link CreateCategoryRequest} Request Body
   * @return response of {@code Object}
   */
  public Object updateCategory(
    @NonNull String id,
    @NonNull CreateCategoryRequest createCategoryRequest,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse().updateCategory(id, createCategoryRequest, requestConfig).getData();
  }

  /**
   * Method updateCategory
   * PUT /categories/{id}
   *
   * @param id String
   * @param createCategoryRequest {@link CreateCategoryRequest} Request Body
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> updateCategoryAsync(
    @NonNull String id,
    @NonNull CreateCategoryRequest createCategoryRequest
  ) throws ApiError {
    return this.updateCategoryAsync(id, createCategoryRequest, null);
  }

  /**
   * Method updateCategory
   * PUT /categories/{id}
   *
   * @param id String
   * @param createCategoryRequest {@link CreateCategoryRequest} Request Body
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> updateCategoryAsync(
    @NonNull String id,
    @NonNull CreateCategoryRequest createCategoryRequest,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse()
      .updateCategoryAsync(id, createCategoryRequest, requestConfig)
      .thenApply(response -> response.getData());
  }

  private Request buildUpdateCategoryRequest(
    @NonNull String id,
    @NonNull CreateCategoryRequest createCategoryRequest,
    RequestConfig resolvedConfig
  ) {
    return new RequestBuilder(
      HttpMethod.PUT,
      resolveBaseUrl(resolvedConfig, Environment.DEFAULT),
      "categories/{id}"
    )
      .setAccessTokenAuth(resolveAccessToken(resolvedConfig), "Bearer")
      .setPathParameter("id", id)
      .setJsonContent(createCategoryRequest)
      .build();
  }

  /**
   * Method listExpenses
   * GET /expenses
   *
   * @return response of {@code Object}
   */
  public Object listExpenses() throws ApiError {
    return this.listExpenses(null);
  }

  /**
   * Method listExpenses
   * GET /expenses
   *
   * @return response of {@code Object}
   */
  public Object listExpenses(RequestConfig requestConfig) throws ApiError {
    return withRawResponse().listExpenses(requestConfig).getData();
  }

  /**
   * Method listExpenses
   * GET /expenses
   *
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> listExpensesAsync() throws ApiError {
    return this.listExpensesAsync(null);
  }

  /**
   * Method listExpenses
   * GET /expenses
   *
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> listExpensesAsync(RequestConfig requestConfig) throws ApiError {
    return withRawResponse()
      .listExpensesAsync(requestConfig)
      .thenApply(response -> response.getData());
  }

  private Request buildListExpensesRequest(RequestConfig resolvedConfig) {
    return new RequestBuilder(
      HttpMethod.GET,
      resolveBaseUrl(resolvedConfig, Environment.DEFAULT),
      "expenses"
    )
      .setAccessTokenAuth(resolveAccessToken(resolvedConfig), "Bearer")
      .build();
  }

  /**
   * Method createExpense
   * POST /expenses
   *
   * @param createExpenseRequest {@link CreateExpenseRequest} Request Body
   * @return response of {@code Object}
   */
  public Object createExpense(@NonNull CreateExpenseRequest createExpenseRequest) throws ApiError {
    return this.createExpense(createExpenseRequest, null);
  }

  /**
   * Method createExpense
   * POST /expenses
   *
   * @param createExpenseRequest {@link CreateExpenseRequest} Request Body
   * @return response of {@code Object}
   */
  public Object createExpense(
    @NonNull CreateExpenseRequest createExpenseRequest,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse().createExpense(createExpenseRequest, requestConfig).getData();
  }

  /**
   * Method createExpense
   * POST /expenses
   *
   * @param createExpenseRequest {@link CreateExpenseRequest} Request Body
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> createExpenseAsync(
    @NonNull CreateExpenseRequest createExpenseRequest
  ) throws ApiError {
    return this.createExpenseAsync(createExpenseRequest, null);
  }

  /**
   * Method createExpense
   * POST /expenses
   *
   * @param createExpenseRequest {@link CreateExpenseRequest} Request Body
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> createExpenseAsync(
    @NonNull CreateExpenseRequest createExpenseRequest,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse()
      .createExpenseAsync(createExpenseRequest, requestConfig)
      .thenApply(response -> response.getData());
  }

  private Request buildCreateExpenseRequest(
    @NonNull CreateExpenseRequest createExpenseRequest,
    RequestConfig resolvedConfig
  ) {
    return new RequestBuilder(
      HttpMethod.POST,
      resolveBaseUrl(resolvedConfig, Environment.DEFAULT),
      "expenses"
    )
      .setAccessTokenAuth(resolveAccessToken(resolvedConfig), "Bearer")
      .setJsonContent(createExpenseRequest)
      .build();
  }

  /**
   * Method getExpense
   * GET /expenses/{id}
   *
   * @param id String
   * @return response of {@code Object}
   */
  public Object getExpense(@NonNull String id) throws ApiError {
    return this.getExpense(id, null);
  }

  /**
   * Method getExpense
   * GET /expenses/{id}
   *
   * @param id String
   * @return response of {@code Object}
   */
  public Object getExpense(@NonNull String id, RequestConfig requestConfig) throws ApiError {
    return withRawResponse().getExpense(id, requestConfig).getData();
  }

  /**
   * Method getExpense
   * GET /expenses/{id}
   *
   * @param id String
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> getExpenseAsync(@NonNull String id) throws ApiError {
    return this.getExpenseAsync(id, null);
  }

  /**
   * Method getExpense
   * GET /expenses/{id}
   *
   * @param id String
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> getExpenseAsync(@NonNull String id, RequestConfig requestConfig)
    throws ApiError {
    return withRawResponse()
      .getExpenseAsync(id, requestConfig)
      .thenApply(response -> response.getData());
  }

  private Request buildGetExpenseRequest(@NonNull String id, RequestConfig resolvedConfig) {
    return new RequestBuilder(
      HttpMethod.GET,
      resolveBaseUrl(resolvedConfig, Environment.DEFAULT),
      "expenses/{id}"
    )
      .setAccessTokenAuth(resolveAccessToken(resolvedConfig), "Bearer")
      .setPathParameter("id", id)
      .build();
  }

  /**
   * Method updateExpense
   * PUT /expenses/{id}
   *
   * @param id String
   * @param updateExpenseRequest {@link UpdateExpenseRequest} Request Body
   * @return response of {@code Object}
   */
  public Object updateExpense(
    @NonNull String id,
    @NonNull UpdateExpenseRequest updateExpenseRequest
  ) throws ApiError {
    return this.updateExpense(id, updateExpenseRequest, null);
  }

  /**
   * Method updateExpense
   * PUT /expenses/{id}
   *
   * @param id String
   * @param updateExpenseRequest {@link UpdateExpenseRequest} Request Body
   * @return response of {@code Object}
   */
  public Object updateExpense(
    @NonNull String id,
    @NonNull UpdateExpenseRequest updateExpenseRequest,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse().updateExpense(id, updateExpenseRequest, requestConfig).getData();
  }

  /**
   * Method updateExpense
   * PUT /expenses/{id}
   *
   * @param id String
   * @param updateExpenseRequest {@link UpdateExpenseRequest} Request Body
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> updateExpenseAsync(
    @NonNull String id,
    @NonNull UpdateExpenseRequest updateExpenseRequest
  ) throws ApiError {
    return this.updateExpenseAsync(id, updateExpenseRequest, null);
  }

  /**
   * Method updateExpense
   * PUT /expenses/{id}
   *
   * @param id String
   * @param updateExpenseRequest {@link UpdateExpenseRequest} Request Body
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> updateExpenseAsync(
    @NonNull String id,
    @NonNull UpdateExpenseRequest updateExpenseRequest,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse()
      .updateExpenseAsync(id, updateExpenseRequest, requestConfig)
      .thenApply(response -> response.getData());
  }

  private Request buildUpdateExpenseRequest(
    @NonNull String id,
    @NonNull UpdateExpenseRequest updateExpenseRequest,
    RequestConfig resolvedConfig
  ) {
    return new RequestBuilder(
      HttpMethod.PUT,
      resolveBaseUrl(resolvedConfig, Environment.DEFAULT),
      "expenses/{id}"
    )
      .setAccessTokenAuth(resolveAccessToken(resolvedConfig), "Bearer")
      .setPathParameter("id", id)
      .setJsonContent(updateExpenseRequest)
      .build();
  }

  /**
   * Method deleteExpense
   * DELETE /expenses/{id}
   *
   * @param id String
   * @return response of {@code String}
   */
  public String deleteExpense(@NonNull String id) throws ApiError {
    return this.deleteExpense(id, null);
  }

  /**
   * Method deleteExpense
   * DELETE /expenses/{id}
   *
   * @param id String
   * @return response of {@code String}
   */
  public String deleteExpense(@NonNull String id, RequestConfig requestConfig) throws ApiError {
    return withRawResponse().deleteExpense(id, requestConfig).getData();
  }

  /**
   * Method deleteExpense
   * DELETE /expenses/{id}
   *
   * @param id String
   * @return response of {@code CompletableFuture<String>}
   */
  public CompletableFuture<String> deleteExpenseAsync(@NonNull String id) throws ApiError {
    return this.deleteExpenseAsync(id, null);
  }

  /**
   * Method deleteExpense
   * DELETE /expenses/{id}
   *
   * @param id String
   * @return response of {@code CompletableFuture<String>}
   */
  public CompletableFuture<String> deleteExpenseAsync(
    @NonNull String id,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse()
      .deleteExpenseAsync(id, requestConfig)
      .thenApply(response -> response.getData());
  }

  private Request buildDeleteExpenseRequest(@NonNull String id, RequestConfig resolvedConfig) {
    return new RequestBuilder(
      HttpMethod.DELETE,
      resolveBaseUrl(resolvedConfig, Environment.DEFAULT),
      "expenses/{id}"
    )
      .setAccessTokenAuth(resolveAccessToken(resolvedConfig), "Bearer")
      .setPathParameter("id", id)
      .build();
  }

  /**
   * Method listClaims
   * GET /claims
   *
   * @return response of {@code Object}
   */
  public Object listClaims() throws ApiError {
    return this.listClaims(null);
  }

  /**
   * Method listClaims
   * GET /claims
   *
   * @return response of {@code Object}
   */
  public Object listClaims(RequestConfig requestConfig) throws ApiError {
    return withRawResponse().listClaims(requestConfig).getData();
  }

  /**
   * Method listClaims
   * GET /claims
   *
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> listClaimsAsync() throws ApiError {
    return this.listClaimsAsync(null);
  }

  /**
   * Method listClaims
   * GET /claims
   *
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> listClaimsAsync(RequestConfig requestConfig) throws ApiError {
    return withRawResponse()
      .listClaimsAsync(requestConfig)
      .thenApply(response -> response.getData());
  }

  private Request buildListClaimsRequest(RequestConfig resolvedConfig) {
    return new RequestBuilder(
      HttpMethod.GET,
      resolveBaseUrl(resolvedConfig, Environment.DEFAULT),
      "claims"
    )
      .setAccessTokenAuth(resolveAccessToken(resolvedConfig), "Bearer")
      .build();
  }

  /**
   * Method createClaim
   * POST /claims
   *
   * @param createClaimRequest {@link CreateClaimRequest} Request Body
   * @return response of {@code Object}
   */
  public Object createClaim(@NonNull CreateClaimRequest createClaimRequest) throws ApiError {
    return this.createClaim(createClaimRequest, null);
  }

  /**
   * Method createClaim
   * POST /claims
   *
   * @param createClaimRequest {@link CreateClaimRequest} Request Body
   * @return response of {@code Object}
   */
  public Object createClaim(
    @NonNull CreateClaimRequest createClaimRequest,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse().createClaim(createClaimRequest, requestConfig).getData();
  }

  /**
   * Method createClaim
   * POST /claims
   *
   * @param createClaimRequest {@link CreateClaimRequest} Request Body
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> createClaimAsync(@NonNull CreateClaimRequest createClaimRequest)
    throws ApiError {
    return this.createClaimAsync(createClaimRequest, null);
  }

  /**
   * Method createClaim
   * POST /claims
   *
   * @param createClaimRequest {@link CreateClaimRequest} Request Body
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> createClaimAsync(
    @NonNull CreateClaimRequest createClaimRequest,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse()
      .createClaimAsync(createClaimRequest, requestConfig)
      .thenApply(response -> response.getData());
  }

  private Request buildCreateClaimRequest(
    @NonNull CreateClaimRequest createClaimRequest,
    RequestConfig resolvedConfig
  ) {
    return new RequestBuilder(
      HttpMethod.POST,
      resolveBaseUrl(resolvedConfig, Environment.DEFAULT),
      "claims"
    )
      .setAccessTokenAuth(resolveAccessToken(resolvedConfig), "Bearer")
      .setJsonContent(createClaimRequest)
      .build();
  }

  /**
   * Method getClaim
   * GET /claims/{id}
   *
   * @param id String
   * @return response of {@code Object}
   */
  public Object getClaim(@NonNull String id) throws ApiError {
    return this.getClaim(id, null);
  }

  /**
   * Method getClaim
   * GET /claims/{id}
   *
   * @param id String
   * @return response of {@code Object}
   */
  public Object getClaim(@NonNull String id, RequestConfig requestConfig) throws ApiError {
    return withRawResponse().getClaim(id, requestConfig).getData();
  }

  /**
   * Method getClaim
   * GET /claims/{id}
   *
   * @param id String
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> getClaimAsync(@NonNull String id) throws ApiError {
    return this.getClaimAsync(id, null);
  }

  /**
   * Method getClaim
   * GET /claims/{id}
   *
   * @param id String
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> getClaimAsync(@NonNull String id, RequestConfig requestConfig)
    throws ApiError {
    return withRawResponse()
      .getClaimAsync(id, requestConfig)
      .thenApply(response -> response.getData());
  }

  private Request buildGetClaimRequest(@NonNull String id, RequestConfig resolvedConfig) {
    return new RequestBuilder(
      HttpMethod.GET,
      resolveBaseUrl(resolvedConfig, Environment.DEFAULT),
      "claims/{id}"
    )
      .setAccessTokenAuth(resolveAccessToken(resolvedConfig), "Bearer")
      .setPathParameter("id", id)
      .build();
  }

  /**
   * Method submitClaim
   * POST /claims/{id}/submit
   *
   * @param id String
   * @return response of {@code Object}
   */
  public Object submitClaim(@NonNull String id) throws ApiError {
    return this.submitClaim(id, null);
  }

  /**
   * Method submitClaim
   * POST /claims/{id}/submit
   *
   * @param id String
   * @return response of {@code Object}
   */
  public Object submitClaim(@NonNull String id, RequestConfig requestConfig) throws ApiError {
    return withRawResponse().submitClaim(id, requestConfig).getData();
  }

  /**
   * Method submitClaim
   * POST /claims/{id}/submit
   *
   * @param id String
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> submitClaimAsync(@NonNull String id) throws ApiError {
    return this.submitClaimAsync(id, null);
  }

  /**
   * Method submitClaim
   * POST /claims/{id}/submit
   *
   * @param id String
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> submitClaimAsync(
    @NonNull String id,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse()
      .submitClaimAsync(id, requestConfig)
      .thenApply(response -> response.getData());
  }

  private Request buildSubmitClaimRequest(@NonNull String id, RequestConfig resolvedConfig) {
    return new RequestBuilder(
      HttpMethod.POST,
      resolveBaseUrl(resolvedConfig, Environment.DEFAULT),
      "claims/{id}/submit"
    )
      .setAccessTokenAuth(resolveAccessToken(resolvedConfig), "Bearer")
      .setPathParameter("id", id)
      .build();
  }

  /**
   * Method approveClaim
   * POST /claims/{id}/approve
   *
   * @param id String
   * @return response of {@code Object}
   */
  public Object approveClaim(@NonNull String id) throws ApiError {
    return this.approveClaim(id, null);
  }

  /**
   * Method approveClaim
   * POST /claims/{id}/approve
   *
   * @param id String
   * @return response of {@code Object}
   */
  public Object approveClaim(@NonNull String id, RequestConfig requestConfig) throws ApiError {
    return withRawResponse().approveClaim(id, requestConfig).getData();
  }

  /**
   * Method approveClaim
   * POST /claims/{id}/approve
   *
   * @param id String
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> approveClaimAsync(@NonNull String id) throws ApiError {
    return this.approveClaimAsync(id, null);
  }

  /**
   * Method approveClaim
   * POST /claims/{id}/approve
   *
   * @param id String
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> approveClaimAsync(
    @NonNull String id,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse()
      .approveClaimAsync(id, requestConfig)
      .thenApply(response -> response.getData());
  }

  private Request buildApproveClaimRequest(@NonNull String id, RequestConfig resolvedConfig) {
    return new RequestBuilder(
      HttpMethod.POST,
      resolveBaseUrl(resolvedConfig, Environment.DEFAULT),
      "claims/{id}/approve"
    )
      .setAccessTokenAuth(resolveAccessToken(resolvedConfig), "Bearer")
      .setPathParameter("id", id)
      .build();
  }

  /**
   * Method rejectClaim
   * POST /claims/{id}/reject
   *
   * @param id String
   * @param rejectClaimRequest {@link RejectClaimRequest} Request Body
   * @return response of {@code Object}
   */
  public Object rejectClaim(@NonNull String id, @NonNull RejectClaimRequest rejectClaimRequest)
    throws ApiError {
    return this.rejectClaim(id, rejectClaimRequest, null);
  }

  /**
   * Method rejectClaim
   * POST /claims/{id}/reject
   *
   * @param id String
   * @param rejectClaimRequest {@link RejectClaimRequest} Request Body
   * @return response of {@code Object}
   */
  public Object rejectClaim(
    @NonNull String id,
    @NonNull RejectClaimRequest rejectClaimRequest,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse().rejectClaim(id, rejectClaimRequest, requestConfig).getData();
  }

  /**
   * Method rejectClaim
   * POST /claims/{id}/reject
   *
   * @param id String
   * @param rejectClaimRequest {@link RejectClaimRequest} Request Body
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> rejectClaimAsync(
    @NonNull String id,
    @NonNull RejectClaimRequest rejectClaimRequest
  ) throws ApiError {
    return this.rejectClaimAsync(id, rejectClaimRequest, null);
  }

  /**
   * Method rejectClaim
   * POST /claims/{id}/reject
   *
   * @param id String
   * @param rejectClaimRequest {@link RejectClaimRequest} Request Body
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> rejectClaimAsync(
    @NonNull String id,
    @NonNull RejectClaimRequest rejectClaimRequest,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse()
      .rejectClaimAsync(id, rejectClaimRequest, requestConfig)
      .thenApply(response -> response.getData());
  }

  private Request buildRejectClaimRequest(
    @NonNull String id,
    @NonNull RejectClaimRequest rejectClaimRequest,
    RequestConfig resolvedConfig
  ) {
    return new RequestBuilder(
      HttpMethod.POST,
      resolveBaseUrl(resolvedConfig, Environment.DEFAULT),
      "claims/{id}/reject"
    )
      .setAccessTokenAuth(resolveAccessToken(resolvedConfig), "Bearer")
      .setPathParameter("id", id)
      .setJsonContent(rejectClaimRequest)
      .build();
  }

  /**
   * Method reimburseClaim
   * POST /claims/{id}/reimburse
   *
   * @param id String
   * @return response of {@code Object}
   */
  public Object reimburseClaim(@NonNull String id) throws ApiError {
    return this.reimburseClaim(id, null);
  }

  /**
   * Method reimburseClaim
   * POST /claims/{id}/reimburse
   *
   * @param id String
   * @return response of {@code Object}
   */
  public Object reimburseClaim(@NonNull String id, RequestConfig requestConfig) throws ApiError {
    return withRawResponse().reimburseClaim(id, requestConfig).getData();
  }

  /**
   * Method reimburseClaim
   * POST /claims/{id}/reimburse
   *
   * @param id String
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> reimburseClaimAsync(@NonNull String id) throws ApiError {
    return this.reimburseClaimAsync(id, null);
  }

  /**
   * Method reimburseClaim
   * POST /claims/{id}/reimburse
   *
   * @param id String
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> reimburseClaimAsync(
    @NonNull String id,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse()
      .reimburseClaimAsync(id, requestConfig)
      .thenApply(response -> response.getData());
  }

  private Request buildReimburseClaimRequest(@NonNull String id, RequestConfig resolvedConfig) {
    return new RequestBuilder(
      HttpMethod.POST,
      resolveBaseUrl(resolvedConfig, Environment.DEFAULT),
      "claims/{id}/reimburse"
    )
      .setAccessTokenAuth(resolveAccessToken(resolvedConfig), "Bearer")
      .setPathParameter("id", id)
      .build();
  }

  /**
   * Returns an accessor whose methods mirror this service but return the full HTTP response
   * (status code, headers, and raw body) wrapped alongside the parsed data.
   *
   * @return An accessor exposing raw-response variants of this service's methods
   */
  public WithRawResponse withRawResponse() {
    return new WithRawResponse();
  }

  /**
   * Per-call accessor exposing raw-response variants of {@link ExpenseTrackerApiSdkService}'s methods.
   * Reuses the enclosing service's request builders and configuration.
   */
  public class WithRawResponse {

    /**
     * Method listCategories
     * GET /categories
     *
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> listCategories() throws ApiError {
      return this.listCategories(null);
    }

    /**
     * Method listCategories
     * GET /categories
     *
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> listCategories(RequestConfig requestConfig)
      throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(listCategoriesConfig, requestConfig);
      Request request = buildListCategoriesRequest(resolvedConfig);
      Response response = execute(request, resolvedConfig);
      byte[] bodyBytes = ModelConverter.readBytes(response);
      return new ExpenseTrackerApiSdkResponse<>(
        response,
        bodyBytes,
        ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
      );
    }

    /**
     * Method listCategories
     * GET /categories
     *
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> listCategoriesAsync()
      throws ApiError {
      return this.listCategoriesAsync(null);
    }

    /**
     * Method listCategories
     * GET /categories
     *
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> listCategoriesAsync(
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(listCategoriesConfig, requestConfig);
      Request request = buildListCategoriesRequest(resolvedConfig);
      CompletableFuture<Response> futureResponse = executeAsync(request, resolvedConfig);
      return futureResponse.thenApplyAsync(response -> {
        byte[] bodyBytes = ModelConverter.readBytes(response);
        return new ExpenseTrackerApiSdkResponse<>(
          response,
          bodyBytes,
          ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
        );
      });
    }

    /**
     * Method createCategory
     * POST /categories
     *
     * @param createCategoryRequest {@link CreateCategoryRequest} Request Body
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> createCategory(
      @NonNull CreateCategoryRequest createCategoryRequest
    ) throws ApiError {
      return this.createCategory(createCategoryRequest, null);
    }

    /**
     * Method createCategory
     * POST /categories
     *
     * @param createCategoryRequest {@link CreateCategoryRequest} Request Body
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> createCategory(
      @NonNull CreateCategoryRequest createCategoryRequest,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(createCategoryConfig, requestConfig);
      Request request = buildCreateCategoryRequest(createCategoryRequest, resolvedConfig);
      Response response = execute(request, resolvedConfig);
      byte[] bodyBytes = ModelConverter.readBytes(response);
      return new ExpenseTrackerApiSdkResponse<>(
        response,
        bodyBytes,
        ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
      );
    }

    /**
     * Method createCategory
     * POST /categories
     *
     * @param createCategoryRequest {@link CreateCategoryRequest} Request Body
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> createCategoryAsync(
      @NonNull CreateCategoryRequest createCategoryRequest
    ) throws ApiError {
      return this.createCategoryAsync(createCategoryRequest, null);
    }

    /**
     * Method createCategory
     * POST /categories
     *
     * @param createCategoryRequest {@link CreateCategoryRequest} Request Body
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> createCategoryAsync(
      @NonNull CreateCategoryRequest createCategoryRequest,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(createCategoryConfig, requestConfig);
      Request request = buildCreateCategoryRequest(createCategoryRequest, resolvedConfig);
      CompletableFuture<Response> futureResponse = executeAsync(request, resolvedConfig);
      return futureResponse.thenApplyAsync(response -> {
        byte[] bodyBytes = ModelConverter.readBytes(response);
        return new ExpenseTrackerApiSdkResponse<>(
          response,
          bodyBytes,
          ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
        );
      });
    }

    /**
     * Method getCategory
     * GET /categories/{id}
     *
     * @param id String
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> getCategory(@NonNull String id) throws ApiError {
      return this.getCategory(id, null);
    }

    /**
     * Method getCategory
     * GET /categories/{id}
     *
     * @param id String
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> getCategory(
      @NonNull String id,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(getCategoryConfig, requestConfig);
      Request request = buildGetCategoryRequest(id, resolvedConfig);
      Response response = execute(request, resolvedConfig);
      byte[] bodyBytes = ModelConverter.readBytes(response);
      return new ExpenseTrackerApiSdkResponse<>(
        response,
        bodyBytes,
        ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
      );
    }

    /**
     * Method getCategory
     * GET /categories/{id}
     *
     * @param id String
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> getCategoryAsync(
      @NonNull String id
    ) throws ApiError {
      return this.getCategoryAsync(id, null);
    }

    /**
     * Method getCategory
     * GET /categories/{id}
     *
     * @param id String
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> getCategoryAsync(
      @NonNull String id,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(getCategoryConfig, requestConfig);
      Request request = buildGetCategoryRequest(id, resolvedConfig);
      CompletableFuture<Response> futureResponse = executeAsync(request, resolvedConfig);
      return futureResponse.thenApplyAsync(response -> {
        byte[] bodyBytes = ModelConverter.readBytes(response);
        return new ExpenseTrackerApiSdkResponse<>(
          response,
          bodyBytes,
          ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
        );
      });
    }

    /**
     * Method updateCategory
     * PUT /categories/{id}
     *
     * @param id String
     * @param createCategoryRequest {@link CreateCategoryRequest} Request Body
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> updateCategory(
      @NonNull String id,
      @NonNull CreateCategoryRequest createCategoryRequest
    ) throws ApiError {
      return this.updateCategory(id, createCategoryRequest, null);
    }

    /**
     * Method updateCategory
     * PUT /categories/{id}
     *
     * @param id String
     * @param createCategoryRequest {@link CreateCategoryRequest} Request Body
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> updateCategory(
      @NonNull String id,
      @NonNull CreateCategoryRequest createCategoryRequest,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(updateCategoryConfig, requestConfig);
      Request request = buildUpdateCategoryRequest(id, createCategoryRequest, resolvedConfig);
      Response response = execute(request, resolvedConfig);
      byte[] bodyBytes = ModelConverter.readBytes(response);
      return new ExpenseTrackerApiSdkResponse<>(
        response,
        bodyBytes,
        ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
      );
    }

    /**
     * Method updateCategory
     * PUT /categories/{id}
     *
     * @param id String
     * @param createCategoryRequest {@link CreateCategoryRequest} Request Body
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> updateCategoryAsync(
      @NonNull String id,
      @NonNull CreateCategoryRequest createCategoryRequest
    ) throws ApiError {
      return this.updateCategoryAsync(id, createCategoryRequest, null);
    }

    /**
     * Method updateCategory
     * PUT /categories/{id}
     *
     * @param id String
     * @param createCategoryRequest {@link CreateCategoryRequest} Request Body
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> updateCategoryAsync(
      @NonNull String id,
      @NonNull CreateCategoryRequest createCategoryRequest,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(updateCategoryConfig, requestConfig);
      Request request = buildUpdateCategoryRequest(id, createCategoryRequest, resolvedConfig);
      CompletableFuture<Response> futureResponse = executeAsync(request, resolvedConfig);
      return futureResponse.thenApplyAsync(response -> {
        byte[] bodyBytes = ModelConverter.readBytes(response);
        return new ExpenseTrackerApiSdkResponse<>(
          response,
          bodyBytes,
          ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
        );
      });
    }

    /**
     * Method listExpenses
     * GET /expenses
     *
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> listExpenses() throws ApiError {
      return this.listExpenses(null);
    }

    /**
     * Method listExpenses
     * GET /expenses
     *
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> listExpenses(RequestConfig requestConfig)
      throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(listExpensesConfig, requestConfig);
      Request request = buildListExpensesRequest(resolvedConfig);
      Response response = execute(request, resolvedConfig);
      byte[] bodyBytes = ModelConverter.readBytes(response);
      return new ExpenseTrackerApiSdkResponse<>(
        response,
        bodyBytes,
        ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
      );
    }

    /**
     * Method listExpenses
     * GET /expenses
     *
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> listExpensesAsync()
      throws ApiError {
      return this.listExpensesAsync(null);
    }

    /**
     * Method listExpenses
     * GET /expenses
     *
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> listExpensesAsync(
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(listExpensesConfig, requestConfig);
      Request request = buildListExpensesRequest(resolvedConfig);
      CompletableFuture<Response> futureResponse = executeAsync(request, resolvedConfig);
      return futureResponse.thenApplyAsync(response -> {
        byte[] bodyBytes = ModelConverter.readBytes(response);
        return new ExpenseTrackerApiSdkResponse<>(
          response,
          bodyBytes,
          ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
        );
      });
    }

    /**
     * Method createExpense
     * POST /expenses
     *
     * @param createExpenseRequest {@link CreateExpenseRequest} Request Body
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> createExpense(
      @NonNull CreateExpenseRequest createExpenseRequest
    ) throws ApiError {
      return this.createExpense(createExpenseRequest, null);
    }

    /**
     * Method createExpense
     * POST /expenses
     *
     * @param createExpenseRequest {@link CreateExpenseRequest} Request Body
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> createExpense(
      @NonNull CreateExpenseRequest createExpenseRequest,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(createExpenseConfig, requestConfig);
      Request request = buildCreateExpenseRequest(createExpenseRequest, resolvedConfig);
      Response response = execute(request, resolvedConfig);
      byte[] bodyBytes = ModelConverter.readBytes(response);
      return new ExpenseTrackerApiSdkResponse<>(
        response,
        bodyBytes,
        ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
      );
    }

    /**
     * Method createExpense
     * POST /expenses
     *
     * @param createExpenseRequest {@link CreateExpenseRequest} Request Body
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> createExpenseAsync(
      @NonNull CreateExpenseRequest createExpenseRequest
    ) throws ApiError {
      return this.createExpenseAsync(createExpenseRequest, null);
    }

    /**
     * Method createExpense
     * POST /expenses
     *
     * @param createExpenseRequest {@link CreateExpenseRequest} Request Body
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> createExpenseAsync(
      @NonNull CreateExpenseRequest createExpenseRequest,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(createExpenseConfig, requestConfig);
      Request request = buildCreateExpenseRequest(createExpenseRequest, resolvedConfig);
      CompletableFuture<Response> futureResponse = executeAsync(request, resolvedConfig);
      return futureResponse.thenApplyAsync(response -> {
        byte[] bodyBytes = ModelConverter.readBytes(response);
        return new ExpenseTrackerApiSdkResponse<>(
          response,
          bodyBytes,
          ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
        );
      });
    }

    /**
     * Method getExpense
     * GET /expenses/{id}
     *
     * @param id String
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> getExpense(@NonNull String id) throws ApiError {
      return this.getExpense(id, null);
    }

    /**
     * Method getExpense
     * GET /expenses/{id}
     *
     * @param id String
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> getExpense(
      @NonNull String id,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(getExpenseConfig, requestConfig);
      Request request = buildGetExpenseRequest(id, resolvedConfig);
      Response response = execute(request, resolvedConfig);
      byte[] bodyBytes = ModelConverter.readBytes(response);
      return new ExpenseTrackerApiSdkResponse<>(
        response,
        bodyBytes,
        ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
      );
    }

    /**
     * Method getExpense
     * GET /expenses/{id}
     *
     * @param id String
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> getExpenseAsync(
      @NonNull String id
    ) throws ApiError {
      return this.getExpenseAsync(id, null);
    }

    /**
     * Method getExpense
     * GET /expenses/{id}
     *
     * @param id String
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> getExpenseAsync(
      @NonNull String id,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(getExpenseConfig, requestConfig);
      Request request = buildGetExpenseRequest(id, resolvedConfig);
      CompletableFuture<Response> futureResponse = executeAsync(request, resolvedConfig);
      return futureResponse.thenApplyAsync(response -> {
        byte[] bodyBytes = ModelConverter.readBytes(response);
        return new ExpenseTrackerApiSdkResponse<>(
          response,
          bodyBytes,
          ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
        );
      });
    }

    /**
     * Method updateExpense
     * PUT /expenses/{id}
     *
     * @param id String
     * @param updateExpenseRequest {@link UpdateExpenseRequest} Request Body
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> updateExpense(
      @NonNull String id,
      @NonNull UpdateExpenseRequest updateExpenseRequest
    ) throws ApiError {
      return this.updateExpense(id, updateExpenseRequest, null);
    }

    /**
     * Method updateExpense
     * PUT /expenses/{id}
     *
     * @param id String
     * @param updateExpenseRequest {@link UpdateExpenseRequest} Request Body
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> updateExpense(
      @NonNull String id,
      @NonNull UpdateExpenseRequest updateExpenseRequest,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(updateExpenseConfig, requestConfig);
      Request request = buildUpdateExpenseRequest(id, updateExpenseRequest, resolvedConfig);
      Response response = execute(request, resolvedConfig);
      byte[] bodyBytes = ModelConverter.readBytes(response);
      return new ExpenseTrackerApiSdkResponse<>(
        response,
        bodyBytes,
        ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
      );
    }

    /**
     * Method updateExpense
     * PUT /expenses/{id}
     *
     * @param id String
     * @param updateExpenseRequest {@link UpdateExpenseRequest} Request Body
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> updateExpenseAsync(
      @NonNull String id,
      @NonNull UpdateExpenseRequest updateExpenseRequest
    ) throws ApiError {
      return this.updateExpenseAsync(id, updateExpenseRequest, null);
    }

    /**
     * Method updateExpense
     * PUT /expenses/{id}
     *
     * @param id String
     * @param updateExpenseRequest {@link UpdateExpenseRequest} Request Body
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> updateExpenseAsync(
      @NonNull String id,
      @NonNull UpdateExpenseRequest updateExpenseRequest,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(updateExpenseConfig, requestConfig);
      Request request = buildUpdateExpenseRequest(id, updateExpenseRequest, resolvedConfig);
      CompletableFuture<Response> futureResponse = executeAsync(request, resolvedConfig);
      return futureResponse.thenApplyAsync(response -> {
        byte[] bodyBytes = ModelConverter.readBytes(response);
        return new ExpenseTrackerApiSdkResponse<>(
          response,
          bodyBytes,
          ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
        );
      });
    }

    /**
     * Method deleteExpense
     * DELETE /expenses/{id}
     *
     * @param id String
     * @return response of {@code ExpenseTrackerApiSdkResponse<String>}
     */
    public ExpenseTrackerApiSdkResponse<String> deleteExpense(@NonNull String id) throws ApiError {
      return this.deleteExpense(id, null);
    }

    /**
     * Method deleteExpense
     * DELETE /expenses/{id}
     *
     * @param id String
     * @return response of {@code ExpenseTrackerApiSdkResponse<String>}
     */
    public ExpenseTrackerApiSdkResponse<String> deleteExpense(
      @NonNull String id,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(deleteExpenseConfig, requestConfig);
      Request request = buildDeleteExpenseRequest(id, resolvedConfig);
      Response response = execute(request, resolvedConfig);
      byte[] bodyBytes = ModelConverter.readBytes(response);
      return new ExpenseTrackerApiSdkResponse<>(
        response,
        bodyBytes,
        ModelConverter.toBodyString(bodyBytes)
      );
    }

    /**
     * Method deleteExpense
     * DELETE /expenses/{id}
     *
     * @param id String
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<String>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<String>> deleteExpenseAsync(
      @NonNull String id
    ) throws ApiError {
      return this.deleteExpenseAsync(id, null);
    }

    /**
     * Method deleteExpense
     * DELETE /expenses/{id}
     *
     * @param id String
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<String>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<String>> deleteExpenseAsync(
      @NonNull String id,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(deleteExpenseConfig, requestConfig);
      Request request = buildDeleteExpenseRequest(id, resolvedConfig);
      CompletableFuture<Response> futureResponse = executeAsync(request, resolvedConfig);
      return futureResponse.thenApplyAsync(response -> {
        byte[] bodyBytes = ModelConverter.readBytes(response);
        return new ExpenseTrackerApiSdkResponse<>(
          response,
          bodyBytes,
          ModelConverter.toBodyString(bodyBytes)
        );
      });
    }

    /**
     * Method listClaims
     * GET /claims
     *
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> listClaims() throws ApiError {
      return this.listClaims(null);
    }

    /**
     * Method listClaims
     * GET /claims
     *
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> listClaims(RequestConfig requestConfig)
      throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(listClaimsConfig, requestConfig);
      Request request = buildListClaimsRequest(resolvedConfig);
      Response response = execute(request, resolvedConfig);
      byte[] bodyBytes = ModelConverter.readBytes(response);
      return new ExpenseTrackerApiSdkResponse<>(
        response,
        bodyBytes,
        ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
      );
    }

    /**
     * Method listClaims
     * GET /claims
     *
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> listClaimsAsync()
      throws ApiError {
      return this.listClaimsAsync(null);
    }

    /**
     * Method listClaims
     * GET /claims
     *
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> listClaimsAsync(
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(listClaimsConfig, requestConfig);
      Request request = buildListClaimsRequest(resolvedConfig);
      CompletableFuture<Response> futureResponse = executeAsync(request, resolvedConfig);
      return futureResponse.thenApplyAsync(response -> {
        byte[] bodyBytes = ModelConverter.readBytes(response);
        return new ExpenseTrackerApiSdkResponse<>(
          response,
          bodyBytes,
          ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
        );
      });
    }

    /**
     * Method createClaim
     * POST /claims
     *
     * @param createClaimRequest {@link CreateClaimRequest} Request Body
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> createClaim(
      @NonNull CreateClaimRequest createClaimRequest
    ) throws ApiError {
      return this.createClaim(createClaimRequest, null);
    }

    /**
     * Method createClaim
     * POST /claims
     *
     * @param createClaimRequest {@link CreateClaimRequest} Request Body
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> createClaim(
      @NonNull CreateClaimRequest createClaimRequest,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(createClaimConfig, requestConfig);
      Request request = buildCreateClaimRequest(createClaimRequest, resolvedConfig);
      Response response = execute(request, resolvedConfig);
      byte[] bodyBytes = ModelConverter.readBytes(response);
      return new ExpenseTrackerApiSdkResponse<>(
        response,
        bodyBytes,
        ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
      );
    }

    /**
     * Method createClaim
     * POST /claims
     *
     * @param createClaimRequest {@link CreateClaimRequest} Request Body
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> createClaimAsync(
      @NonNull CreateClaimRequest createClaimRequest
    ) throws ApiError {
      return this.createClaimAsync(createClaimRequest, null);
    }

    /**
     * Method createClaim
     * POST /claims
     *
     * @param createClaimRequest {@link CreateClaimRequest} Request Body
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> createClaimAsync(
      @NonNull CreateClaimRequest createClaimRequest,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(createClaimConfig, requestConfig);
      Request request = buildCreateClaimRequest(createClaimRequest, resolvedConfig);
      CompletableFuture<Response> futureResponse = executeAsync(request, resolvedConfig);
      return futureResponse.thenApplyAsync(response -> {
        byte[] bodyBytes = ModelConverter.readBytes(response);
        return new ExpenseTrackerApiSdkResponse<>(
          response,
          bodyBytes,
          ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
        );
      });
    }

    /**
     * Method getClaim
     * GET /claims/{id}
     *
     * @param id String
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> getClaim(@NonNull String id) throws ApiError {
      return this.getClaim(id, null);
    }

    /**
     * Method getClaim
     * GET /claims/{id}
     *
     * @param id String
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> getClaim(
      @NonNull String id,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(getClaimConfig, requestConfig);
      Request request = buildGetClaimRequest(id, resolvedConfig);
      Response response = execute(request, resolvedConfig);
      byte[] bodyBytes = ModelConverter.readBytes(response);
      return new ExpenseTrackerApiSdkResponse<>(
        response,
        bodyBytes,
        ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
      );
    }

    /**
     * Method getClaim
     * GET /claims/{id}
     *
     * @param id String
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> getClaimAsync(
      @NonNull String id
    ) throws ApiError {
      return this.getClaimAsync(id, null);
    }

    /**
     * Method getClaim
     * GET /claims/{id}
     *
     * @param id String
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> getClaimAsync(
      @NonNull String id,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(getClaimConfig, requestConfig);
      Request request = buildGetClaimRequest(id, resolvedConfig);
      CompletableFuture<Response> futureResponse = executeAsync(request, resolvedConfig);
      return futureResponse.thenApplyAsync(response -> {
        byte[] bodyBytes = ModelConverter.readBytes(response);
        return new ExpenseTrackerApiSdkResponse<>(
          response,
          bodyBytes,
          ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
        );
      });
    }

    /**
     * Method submitClaim
     * POST /claims/{id}/submit
     *
     * @param id String
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> submitClaim(@NonNull String id) throws ApiError {
      return this.submitClaim(id, null);
    }

    /**
     * Method submitClaim
     * POST /claims/{id}/submit
     *
     * @param id String
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> submitClaim(
      @NonNull String id,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(submitClaimConfig, requestConfig);
      Request request = buildSubmitClaimRequest(id, resolvedConfig);
      Response response = execute(request, resolvedConfig);
      byte[] bodyBytes = ModelConverter.readBytes(response);
      return new ExpenseTrackerApiSdkResponse<>(
        response,
        bodyBytes,
        ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
      );
    }

    /**
     * Method submitClaim
     * POST /claims/{id}/submit
     *
     * @param id String
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> submitClaimAsync(
      @NonNull String id
    ) throws ApiError {
      return this.submitClaimAsync(id, null);
    }

    /**
     * Method submitClaim
     * POST /claims/{id}/submit
     *
     * @param id String
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> submitClaimAsync(
      @NonNull String id,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(submitClaimConfig, requestConfig);
      Request request = buildSubmitClaimRequest(id, resolvedConfig);
      CompletableFuture<Response> futureResponse = executeAsync(request, resolvedConfig);
      return futureResponse.thenApplyAsync(response -> {
        byte[] bodyBytes = ModelConverter.readBytes(response);
        return new ExpenseTrackerApiSdkResponse<>(
          response,
          bodyBytes,
          ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
        );
      });
    }

    /**
     * Method approveClaim
     * POST /claims/{id}/approve
     *
     * @param id String
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> approveClaim(@NonNull String id) throws ApiError {
      return this.approveClaim(id, null);
    }

    /**
     * Method approveClaim
     * POST /claims/{id}/approve
     *
     * @param id String
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> approveClaim(
      @NonNull String id,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(approveClaimConfig, requestConfig);
      Request request = buildApproveClaimRequest(id, resolvedConfig);
      Response response = execute(request, resolvedConfig);
      byte[] bodyBytes = ModelConverter.readBytes(response);
      return new ExpenseTrackerApiSdkResponse<>(
        response,
        bodyBytes,
        ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
      );
    }

    /**
     * Method approveClaim
     * POST /claims/{id}/approve
     *
     * @param id String
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> approveClaimAsync(
      @NonNull String id
    ) throws ApiError {
      return this.approveClaimAsync(id, null);
    }

    /**
     * Method approveClaim
     * POST /claims/{id}/approve
     *
     * @param id String
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> approveClaimAsync(
      @NonNull String id,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(approveClaimConfig, requestConfig);
      Request request = buildApproveClaimRequest(id, resolvedConfig);
      CompletableFuture<Response> futureResponse = executeAsync(request, resolvedConfig);
      return futureResponse.thenApplyAsync(response -> {
        byte[] bodyBytes = ModelConverter.readBytes(response);
        return new ExpenseTrackerApiSdkResponse<>(
          response,
          bodyBytes,
          ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
        );
      });
    }

    /**
     * Method rejectClaim
     * POST /claims/{id}/reject
     *
     * @param id String
     * @param rejectClaimRequest {@link RejectClaimRequest} Request Body
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> rejectClaim(
      @NonNull String id,
      @NonNull RejectClaimRequest rejectClaimRequest
    ) throws ApiError {
      return this.rejectClaim(id, rejectClaimRequest, null);
    }

    /**
     * Method rejectClaim
     * POST /claims/{id}/reject
     *
     * @param id String
     * @param rejectClaimRequest {@link RejectClaimRequest} Request Body
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> rejectClaim(
      @NonNull String id,
      @NonNull RejectClaimRequest rejectClaimRequest,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(rejectClaimConfig, requestConfig);
      Request request = buildRejectClaimRequest(id, rejectClaimRequest, resolvedConfig);
      Response response = execute(request, resolvedConfig);
      byte[] bodyBytes = ModelConverter.readBytes(response);
      return new ExpenseTrackerApiSdkResponse<>(
        response,
        bodyBytes,
        ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
      );
    }

    /**
     * Method rejectClaim
     * POST /claims/{id}/reject
     *
     * @param id String
     * @param rejectClaimRequest {@link RejectClaimRequest} Request Body
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> rejectClaimAsync(
      @NonNull String id,
      @NonNull RejectClaimRequest rejectClaimRequest
    ) throws ApiError {
      return this.rejectClaimAsync(id, rejectClaimRequest, null);
    }

    /**
     * Method rejectClaim
     * POST /claims/{id}/reject
     *
     * @param id String
     * @param rejectClaimRequest {@link RejectClaimRequest} Request Body
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> rejectClaimAsync(
      @NonNull String id,
      @NonNull RejectClaimRequest rejectClaimRequest,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(rejectClaimConfig, requestConfig);
      Request request = buildRejectClaimRequest(id, rejectClaimRequest, resolvedConfig);
      CompletableFuture<Response> futureResponse = executeAsync(request, resolvedConfig);
      return futureResponse.thenApplyAsync(response -> {
        byte[] bodyBytes = ModelConverter.readBytes(response);
        return new ExpenseTrackerApiSdkResponse<>(
          response,
          bodyBytes,
          ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
        );
      });
    }

    /**
     * Method reimburseClaim
     * POST /claims/{id}/reimburse
     *
     * @param id String
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> reimburseClaim(@NonNull String id) throws ApiError {
      return this.reimburseClaim(id, null);
    }

    /**
     * Method reimburseClaim
     * POST /claims/{id}/reimburse
     *
     * @param id String
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> reimburseClaim(
      @NonNull String id,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(reimburseClaimConfig, requestConfig);
      Request request = buildReimburseClaimRequest(id, resolvedConfig);
      Response response = execute(request, resolvedConfig);
      byte[] bodyBytes = ModelConverter.readBytes(response);
      return new ExpenseTrackerApiSdkResponse<>(
        response,
        bodyBytes,
        ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
      );
    }

    /**
     * Method reimburseClaim
     * POST /claims/{id}/reimburse
     *
     * @param id String
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> reimburseClaimAsync(
      @NonNull String id
    ) throws ApiError {
      return this.reimburseClaimAsync(id, null);
    }

    /**
     * Method reimburseClaim
     * POST /claims/{id}/reimburse
     *
     * @param id String
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> reimburseClaimAsync(
      @NonNull String id,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(reimburseClaimConfig, requestConfig);
      Request request = buildReimburseClaimRequest(id, resolvedConfig);
      CompletableFuture<Response> futureResponse = executeAsync(request, resolvedConfig);
      return futureResponse.thenApplyAsync(response -> {
        byte[] bodyBytes = ModelConverter.readBytes(response);
        return new ExpenseTrackerApiSdkResponse<>(
          response,
          bodyBytes,
          ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
        );
      });
    }
  }
}
