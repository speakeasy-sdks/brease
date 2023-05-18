/*
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

import * as utils from "../internal/utils";
import * as operations from "./models/operations";
import * as shared from "./models/shared";
import { AxiosInstance, AxiosRequestConfig, AxiosResponse } from "axios";

/**
 * Rule domain context
 */
export class ContextID {
  _defaultClient: AxiosInstance;
  _securityClient: AxiosInstance;
  _serverURL: string;
  _language: string;
  _sdkVersion: string;
  _genVersion: string;

  constructor(
    defaultClient: AxiosInstance,
    securityClient: AxiosInstance,
    serverURL: string,
    language: string,
    sdkVersion: string,
    genVersion: string
  ) {
    this._defaultClient = defaultClient;
    this._securityClient = securityClient;
    this._serverURL = serverURL;
    this._language = language;
    this._sdkVersion = sdkVersion;
    this._genVersion = genVersion;
  }

  /**
   * Adds a new rule to the context
   */
  async addRule(
    req: operations.AddRuleRequest,
    security: operations.AddRuleSecurity,
    config?: AxiosRequestConfig
  ): Promise<operations.AddRuleResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.AddRuleRequest(req);
    }

    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(
      baseURL,
      "/{contextID}/rules/add",
      req
    );

    let [reqBodyHeaders, reqBody]: [object, any] = [{}, {}];

    try {
      [reqBodyHeaders, reqBody] = utils.serializeRequestBody(
        req,
        "addRuleInput",
        "json"
      );
    } catch (e: unknown) {
      if (e instanceof Error) {
        throw new Error(`Error serializing request body, cause: ${e.message}`);
      }
    }

    if (!(security instanceof utils.SpeakeasyBase)) {
      security = new operations.AddRuleSecurity(security);
    }
    const client: AxiosInstance = utils.createSecurityClient(
      this._defaultClient,
      security
    );

    const headers = { ...reqBodyHeaders, ...config?.headers };
    headers[
      "user-agent"
    ] = `speakeasy-sdk/${this._language} ${this._sdkVersion} ${this._genVersion}`;

    const httpRes: AxiosResponse = await client.request({
      validateStatus: () => true,
      url: url,
      method: "post",
      headers: headers,
      data: reqBody,
      ...config,
    });

    const contentType: string = httpRes?.headers?.["content-type"] ?? "";

    if (httpRes?.status == null) {
      throw new Error(`status code not found in response: ${httpRes}`);
    }

    const res: operations.AddRuleResponse = new operations.AddRuleResponse({
      statusCode: httpRes.status,
      contentType: contentType,
      rawResponse: httpRes,
    });
    switch (true) {
      case httpRes?.status == 200:
        if (utils.matchContentType(contentType, `application/json`)) {
          res.apiAddRuleResponse = utils.objectToClass(
            httpRes?.data,
            shared.ApiAddRuleResponse
          );
        }
        break;
    }

    return res;
  }

  /**
   * Evaluate rules within a context on the provided object
   */
  async evaluateRules(
    req: operations.EvaluateRulesRequest,
    security: operations.EvaluateRulesSecurity,
    config?: AxiosRequestConfig
  ): Promise<operations.EvaluateRulesResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.EvaluateRulesRequest(req);
    }

    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(
      baseURL,
      "/{contextID}/evaluate",
      req
    );

    let [reqBodyHeaders, reqBody]: [object, any] = [{}, {}];

    try {
      [reqBodyHeaders, reqBody] = utils.serializeRequestBody(
        req,
        "evaluateRulesInput",
        "json"
      );
    } catch (e: unknown) {
      if (e instanceof Error) {
        throw new Error(`Error serializing request body, cause: ${e.message}`);
      }
    }

    if (!(security instanceof utils.SpeakeasyBase)) {
      security = new operations.EvaluateRulesSecurity(security);
    }
    const client: AxiosInstance = utils.createSecurityClient(
      this._defaultClient,
      security
    );

    const headers = { ...reqBodyHeaders, ...config?.headers };
    headers[
      "user-agent"
    ] = `speakeasy-sdk/${this._language} ${this._sdkVersion} ${this._genVersion}`;

    const httpRes: AxiosResponse = await client.request({
      validateStatus: () => true,
      url: url,
      method: "post",
      headers: headers,
      data: reqBody,
      ...config,
    });

    const contentType: string = httpRes?.headers?.["content-type"] ?? "";

    if (httpRes?.status == null) {
      throw new Error(`status code not found in response: ${httpRes}`);
    }

    const res: operations.EvaluateRulesResponse =
      new operations.EvaluateRulesResponse({
        statusCode: httpRes.status,
        contentType: contentType,
        rawResponse: httpRes,
      });
    switch (true) {
      case httpRes?.status == 200:
        if (utils.matchContentType(contentType, `application/json`)) {
          res.apiEvaluateRulesResponse = utils.objectToClass(
            httpRes?.data,
            shared.ApiEvaluateRulesResponse
          );
        }
        break;
    }

    return res;
  }

  /**
   * Returns all rules with the context
   */
  async getAllRules(
    req: operations.GetAllRulesRequest,
    security: operations.GetAllRulesSecurity,
    config?: AxiosRequestConfig
  ): Promise<operations.GetAllRulesResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.GetAllRulesRequest(req);
    }

    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(baseURL, "/{contextID}/rules", req);

    if (!(security instanceof utils.SpeakeasyBase)) {
      security = new operations.GetAllRulesSecurity(security);
    }
    const client: AxiosInstance = utils.createSecurityClient(
      this._defaultClient,
      security
    );

    const headers = { ...config?.headers };
    headers[
      "user-agent"
    ] = `speakeasy-sdk/${this._language} ${this._sdkVersion} ${this._genVersion}`;

    const httpRes: AxiosResponse = await client.request({
      validateStatus: () => true,
      url: url,
      method: "get",
      headers: headers,
      ...config,
    });

    const contentType: string = httpRes?.headers?.["content-type"] ?? "";

    if (httpRes?.status == null) {
      throw new Error(`status code not found in response: ${httpRes}`);
    }

    const res: operations.GetAllRulesResponse =
      new operations.GetAllRulesResponse({
        statusCode: httpRes.status,
        contentType: contentType,
        rawResponse: httpRes,
      });
    switch (true) {
      case httpRes?.status == 200:
        if (utils.matchContentType(contentType, `application/json`)) {
          res.apiAllRulesResponse = utils.objectToClass(
            httpRes?.data,
            shared.ApiAllRulesResponse
          );
        }
        break;
    }

    return res;
  }

  /**
   * Removes a rule from the context
   */
  async removeRule(
    req: operations.RemoveRuleRequest,
    security: operations.RemoveRuleSecurity,
    config?: AxiosRequestConfig
  ): Promise<operations.RemoveRuleResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.RemoveRuleRequest(req);
    }

    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(
      baseURL,
      "/{contextID}/rules/{id}",
      req
    );

    if (!(security instanceof utils.SpeakeasyBase)) {
      security = new operations.RemoveRuleSecurity(security);
    }
    const client: AxiosInstance = utils.createSecurityClient(
      this._defaultClient,
      security
    );

    const headers = { ...config?.headers };
    headers[
      "user-agent"
    ] = `speakeasy-sdk/${this._language} ${this._sdkVersion} ${this._genVersion}`;

    const httpRes: AxiosResponse = await client.request({
      validateStatus: () => true,
      url: url,
      method: "delete",
      headers: headers,
      ...config,
    });

    const contentType: string = httpRes?.headers?.["content-type"] ?? "";

    if (httpRes?.status == null) {
      throw new Error(`status code not found in response: ${httpRes}`);
    }

    const res: operations.RemoveRuleResponse =
      new operations.RemoveRuleResponse({
        statusCode: httpRes.status,
        contentType: contentType,
        rawResponse: httpRes,
      });
    switch (true) {
      case httpRes?.status == 200:
        break;
    }

    return res;
  }

  /**
   * Replaces an existing rule within the context
   */
  async replaceRule(
    req: operations.ReplaceRuleRequest,
    security: operations.ReplaceRuleSecurity,
    config?: AxiosRequestConfig
  ): Promise<operations.ReplaceRuleResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.ReplaceRuleRequest(req);
    }

    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(
      baseURL,
      "/{contextID}/rules/{id}",
      req
    );

    let [reqBodyHeaders, reqBody]: [object, any] = [{}, {}];

    try {
      [reqBodyHeaders, reqBody] = utils.serializeRequestBody(
        req,
        "replaceRuleInput",
        "json"
      );
    } catch (e: unknown) {
      if (e instanceof Error) {
        throw new Error(`Error serializing request body, cause: ${e.message}`);
      }
    }

    if (!(security instanceof utils.SpeakeasyBase)) {
      security = new operations.ReplaceRuleSecurity(security);
    }
    const client: AxiosInstance = utils.createSecurityClient(
      this._defaultClient,
      security
    );

    const headers = { ...reqBodyHeaders, ...config?.headers };
    headers[
      "user-agent"
    ] = `speakeasy-sdk/${this._language} ${this._sdkVersion} ${this._genVersion}`;

    const httpRes: AxiosResponse = await client.request({
      validateStatus: () => true,
      url: url,
      method: "put",
      headers: headers,
      data: reqBody,
      ...config,
    });

    const contentType: string = httpRes?.headers?.["content-type"] ?? "";

    if (httpRes?.status == null) {
      throw new Error(`status code not found in response: ${httpRes}`);
    }

    const res: operations.ReplaceRuleResponse =
      new operations.ReplaceRuleResponse({
        statusCode: httpRes.status,
        contentType: contentType,
        rawResponse: httpRes,
      });
    switch (true) {
      case httpRes?.status == 200:
        if (utils.matchContentType(contentType, `application/json`)) {
          res.apiReplaceRuleResponse = utils.objectToClass(
            httpRes?.data,
            shared.ApiReplaceRuleResponse
          );
        }
        break;
    }

    return res;
  }
}
