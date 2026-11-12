import { z } from 'zod';
import { BaseService } from '../base-service';
import { ContentType, HttpResponse, SdkConfig } from '../../http/types';
import { RequestBuilder } from '../../http/transport/request-builder';
import { SerializationStyle } from '../../http/serialization/base-serializer';
import { ThrowableError } from '../../http/errors/throwable-error';
import { Environment } from '../../http/environment';
import {
  CreateCategoryRequest,
  createCategoryRequestRequest,
} from './models/create-category-request';
import { CreateExpenseRequest, createExpenseRequestRequest } from './models/create-expense-request';
import { UpdateExpenseRequest, updateExpenseRequestRequest } from './models/update-expense-request';
import { CreateClaimRequest, createClaimRequestRequest } from './models/create-claim-request';
import { RejectClaimRequest, rejectClaimRequestRequest } from './models/reject-claim-request';

/**
 * Service class for ExpenseTrackerApiSdkService operations.
 * Provides methods to interact with ExpenseTrackerApiSdkService-related API endpoints.
 * All methods return promises and handle request/response serialization automatically.
 */
export class ExpenseTrackerApiSdkService extends BaseService {
  protected listCategoriesConfig?: Partial<SdkConfig>;

  protected createCategoryConfig?: Partial<SdkConfig>;

  protected getCategoryConfig?: Partial<SdkConfig>;

  protected updateCategoryConfig?: Partial<SdkConfig>;

  protected listExpensesConfig?: Partial<SdkConfig>;

  protected createExpenseConfig?: Partial<SdkConfig>;

  protected getExpenseConfig?: Partial<SdkConfig>;

  protected updateExpenseConfig?: Partial<SdkConfig>;

  protected deleteExpenseConfig?: Partial<SdkConfig>;

  protected listClaimsConfig?: Partial<SdkConfig>;

  protected createClaimConfig?: Partial<SdkConfig>;

  protected getClaimConfig?: Partial<SdkConfig>;

  protected submitClaimConfig?: Partial<SdkConfig>;

  protected approveClaimConfig?: Partial<SdkConfig>;

  protected rejectClaimConfig?: Partial<SdkConfig>;

  protected reimburseClaimConfig?: Partial<SdkConfig>;

  /**
   * Sets method-level configuration for listCategories.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setListCategoriesConfig(config: Partial<SdkConfig>): this {
    this.listCategoriesConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for createCategory.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setCreateCategoryConfig(config: Partial<SdkConfig>): this {
    this.createCategoryConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for getCategory.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setGetCategoryConfig(config: Partial<SdkConfig>): this {
    this.getCategoryConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for updateCategory.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setUpdateCategoryConfig(config: Partial<SdkConfig>): this {
    this.updateCategoryConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for listExpenses.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setListExpensesConfig(config: Partial<SdkConfig>): this {
    this.listExpensesConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for createExpense.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setCreateExpenseConfig(config: Partial<SdkConfig>): this {
    this.createExpenseConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for getExpense.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setGetExpenseConfig(config: Partial<SdkConfig>): this {
    this.getExpenseConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for updateExpense.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setUpdateExpenseConfig(config: Partial<SdkConfig>): this {
    this.updateExpenseConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for deleteExpense.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setDeleteExpenseConfig(config: Partial<SdkConfig>): this {
    this.deleteExpenseConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for listClaims.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setListClaimsConfig(config: Partial<SdkConfig>): this {
    this.listClaimsConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for createClaim.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setCreateClaimConfig(config: Partial<SdkConfig>): this {
    this.createClaimConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for getClaim.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setGetClaimConfig(config: Partial<SdkConfig>): this {
    this.getClaimConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for submitClaim.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setSubmitClaimConfig(config: Partial<SdkConfig>): this {
    this.submitClaimConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for approveClaim.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setApproveClaimConfig(config: Partial<SdkConfig>): this {
    this.approveClaimConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for rejectClaim.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setRejectClaimConfig(config: Partial<SdkConfig>): this {
    this.rejectClaimConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for reimburseClaim.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setReimburseClaimConfig(config: Partial<SdkConfig>): this {
    this.reimburseClaimConfig = config;
    return this;
  }

  /**
   *
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - 200 OK
   */
  async listCategories(requestConfig?: Partial<SdkConfig>): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(this.listCategoriesConfig, requestConfig);
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('GET')
      .setPath('/categories')
      .setRequestSchema(z.any())
      .addAccessTokenAuth(resolvedConfig?.token, 'Bearer')
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 200,
      })
      .addError({
        error: ThrowableError,
        contentType: ContentType.Json,
        status: 401,
      })
      .build();
    return this.client.callDirect<any>(request);
  }

  /**
   *
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - 201 Created
   */
  async createCategory(
    body: CreateCategoryRequest,
    requestConfig?: Partial<SdkConfig>,
  ): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(this.createCategoryConfig, requestConfig);
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('POST')
      .setPath('/categories')
      .setRequestSchema(createCategoryRequestRequest)
      .addAccessTokenAuth(resolvedConfig?.token, 'Bearer')
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 201,
      })
      .addError({
        error: ThrowableError,
        contentType: ContentType.Json,
        status: 422,
      })
      .addHeaderParam({ key: 'Content-Type', value: 'application/json' })
      .addBody(body)
      .build();
    return this.client.callDirect<any>(request);
  }

  /**
   *
   * @param {string} id -
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - 200 OK
   */
  async getCategory(id: string, requestConfig?: Partial<SdkConfig>): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(this.getCategoryConfig, requestConfig);
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('GET')
      .setPath('/categories/{id}')
      .setRequestSchema(z.any())
      .addAccessTokenAuth(resolvedConfig?.token, 'Bearer')
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 200,
      })
      .addError({
        error: ThrowableError,
        contentType: ContentType.Json,
        status: 404,
      })
      .addPathParam({
        key: 'id',
        value: id,
      })
      .build();
    return this.client.callDirect<any>(request);
  }

  /**
   *
   * @param {string} id -
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - 200 OK
   */
  async updateCategory(
    id: string,
    body: CreateCategoryRequest,
    requestConfig?: Partial<SdkConfig>,
  ): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(this.updateCategoryConfig, requestConfig);
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('PUT')
      .setPath('/categories/{id}')
      .setRequestSchema(createCategoryRequestRequest)
      .addAccessTokenAuth(resolvedConfig?.token, 'Bearer')
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 200,
      })
      .addError({
        error: ThrowableError,
        contentType: ContentType.Json,
        status: 403,
      })
      .addPathParam({
        key: 'id',
        value: id,
      })
      .addHeaderParam({ key: 'Content-Type', value: 'application/json' })
      .addBody(body)
      .build();
    return this.client.callDirect<any>(request);
  }

  /**
   *
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - 200 OK
   */
  async listExpenses(requestConfig?: Partial<SdkConfig>): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(this.listExpensesConfig, requestConfig);
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('GET')
      .setPath('/expenses')
      .setRequestSchema(z.any())
      .addAccessTokenAuth(resolvedConfig?.token, 'Bearer')
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 200,
      })
      .addError({
        error: ThrowableError,
        contentType: ContentType.Json,
        status: 401,
      })
      .build();
    return this.client.callDirect<any>(request);
  }

  /**
   *
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - 201 Created
   */
  async createExpense(
    body: CreateExpenseRequest,
    requestConfig?: Partial<SdkConfig>,
  ): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(this.createExpenseConfig, requestConfig);
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('POST')
      .setPath('/expenses')
      .setRequestSchema(createExpenseRequestRequest)
      .addAccessTokenAuth(resolvedConfig?.token, 'Bearer')
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 201,
      })
      .addError({
        error: ThrowableError,
        contentType: ContentType.Json,
        status: 422,
      })
      .addHeaderParam({ key: 'Content-Type', value: 'application/json' })
      .addBody(body)
      .build();
    return this.client.callDirect<any>(request);
  }

  /**
   *
   * @param {string} id -
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - 200 OK
   */
  async getExpense(id: string, requestConfig?: Partial<SdkConfig>): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(this.getExpenseConfig, requestConfig);
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('GET')
      .setPath('/expenses/{id}')
      .setRequestSchema(z.any())
      .addAccessTokenAuth(resolvedConfig?.token, 'Bearer')
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 200,
      })
      .addError({
        error: ThrowableError,
        contentType: ContentType.Json,
        status: 404,
      })
      .addPathParam({
        key: 'id',
        value: id,
      })
      .build();
    return this.client.callDirect<any>(request);
  }

  /**
   *
   * @param {string} id -
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - 200 OK
   */
  async updateExpense(
    id: string,
    body: UpdateExpenseRequest,
    requestConfig?: Partial<SdkConfig>,
  ): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(this.updateExpenseConfig, requestConfig);
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('PUT')
      .setPath('/expenses/{id}')
      .setRequestSchema(updateExpenseRequestRequest)
      .addAccessTokenAuth(resolvedConfig?.token, 'Bearer')
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 200,
      })
      .addError({
        error: ThrowableError,
        contentType: ContentType.Json,
        status: 409,
      })
      .addPathParam({
        key: 'id',
        value: id,
      })
      .addHeaderParam({ key: 'Content-Type', value: 'application/json' })
      .addBody(body)
      .build();
    return this.client.callDirect<any>(request);
  }

  /**
   *
   * @param {string} id -
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<string>>} - 204 No Content
   */
  async deleteExpense(id: string, requestConfig?: Partial<SdkConfig>): Promise<string> {
    const resolvedConfig = this.getResolvedConfig(this.deleteExpenseConfig, requestConfig);
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('DELETE')
      .setPath('/expenses/{id}')
      .setRequestSchema(z.any())
      .addAccessTokenAuth(resolvedConfig?.token, 'Bearer')
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.string(),
        contentType: ContentType.Json,
        status: 204,
      })
      .addError({
        error: ThrowableError,
        contentType: ContentType.Json,
        status: 409,
      })
      .addPathParam({
        key: 'id',
        value: id,
      })
      .build();
    return this.client.callDirect<string>(request);
  }

  /**
   *
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - 200 OK
   */
  async listClaims(requestConfig?: Partial<SdkConfig>): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(this.listClaimsConfig, requestConfig);
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('GET')
      .setPath('/claims')
      .setRequestSchema(z.any())
      .addAccessTokenAuth(resolvedConfig?.token, 'Bearer')
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 200,
      })
      .addError({
        error: ThrowableError,
        contentType: ContentType.Json,
        status: 401,
      })
      .build();
    return this.client.callDirect<any>(request);
  }

  /**
   *
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - 201 Created
   */
  async createClaim(body: CreateClaimRequest, requestConfig?: Partial<SdkConfig>): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(this.createClaimConfig, requestConfig);
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('POST')
      .setPath('/claims')
      .setRequestSchema(createClaimRequestRequest)
      .addAccessTokenAuth(resolvedConfig?.token, 'Bearer')
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 201,
      })
      .addError({
        error: ThrowableError,
        contentType: ContentType.Json,
        status: 422,
      })
      .addHeaderParam({ key: 'Content-Type', value: 'application/json' })
      .addBody(body)
      .build();
    return this.client.callDirect<any>(request);
  }

  /**
   *
   * @param {string} id -
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - 200 OK
   */
  async getClaim(id: string, requestConfig?: Partial<SdkConfig>): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(this.getClaimConfig, requestConfig);
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('GET')
      .setPath('/claims/{id}')
      .setRequestSchema(z.any())
      .addAccessTokenAuth(resolvedConfig?.token, 'Bearer')
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 200,
      })
      .addError({
        error: ThrowableError,
        contentType: ContentType.Json,
        status: 404,
      })
      .addPathParam({
        key: 'id',
        value: id,
      })
      .build();
    return this.client.callDirect<any>(request);
  }

  /**
   *
   * @param {string} id -
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - 200 OK
   */
  async submitClaim(id: string, requestConfig?: Partial<SdkConfig>): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(this.submitClaimConfig, requestConfig);
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('POST')
      .setPath('/claims/{id}/submit')
      .setRequestSchema(z.any())
      .addAccessTokenAuth(resolvedConfig?.token, 'Bearer')
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 200,
      })
      .addError({
        error: ThrowableError,
        contentType: ContentType.Json,
        status: 409,
      })
      .addPathParam({
        key: 'id',
        value: id,
      })
      .build();
    return this.client.callDirect<any>(request);
  }

  /**
   *
   * @param {string} id -
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - 200 OK
   */
  async approveClaim(id: string, requestConfig?: Partial<SdkConfig>): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(this.approveClaimConfig, requestConfig);
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('POST')
      .setPath('/claims/{id}/approve')
      .setRequestSchema(z.any())
      .addAccessTokenAuth(resolvedConfig?.token, 'Bearer')
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 200,
      })
      .addError({
        error: ThrowableError,
        contentType: ContentType.Json,
        status: 403,
      })
      .addPathParam({
        key: 'id',
        value: id,
      })
      .build();
    return this.client.callDirect<any>(request);
  }

  /**
   *
   * @param {string} id -
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - 200 OK
   */
  async rejectClaim(
    id: string,
    body: RejectClaimRequest,
    requestConfig?: Partial<SdkConfig>,
  ): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(this.rejectClaimConfig, requestConfig);
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('POST')
      .setPath('/claims/{id}/reject')
      .setRequestSchema(rejectClaimRequestRequest)
      .addAccessTokenAuth(resolvedConfig?.token, 'Bearer')
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 200,
      })
      .addError({
        error: ThrowableError,
        contentType: ContentType.Json,
        status: 409,
      })
      .addPathParam({
        key: 'id',
        value: id,
      })
      .addHeaderParam({ key: 'Content-Type', value: 'application/json' })
      .addBody(body)
      .build();
    return this.client.callDirect<any>(request);
  }

  /**
   *
   * @param {string} id -
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - 200 OK
   */
  async reimburseClaim(id: string, requestConfig?: Partial<SdkConfig>): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(this.reimburseClaimConfig, requestConfig);
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('POST')
      .setPath('/claims/{id}/reimburse')
      .setRequestSchema(z.any())
      .addAccessTokenAuth(resolvedConfig?.token, 'Bearer')
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 200,
      })
      .addError({
        error: ThrowableError,
        contentType: ContentType.Json,
        status: 409,
      })
      .addPathParam({
        key: 'id',
        value: id,
      })
      .build();
    return this.client.callDirect<any>(request);
  }
}
