/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package industries.dot.brease;

import com.fasterxml.jackson.databind.ObjectMapper;
import industries.dot.brease.utils.HTTPClient;
import industries.dot.brease.utils.HTTPRequest;
import industries.dot.brease.utils.JSON;
import industries.dot.brease.utils.SerializedBody;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

/**
 * Rule domain context
 */
public class ContextID {
	
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public ContextID(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}

    /**
     * Adds a new rule to the context
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public industries.dot.brease.models.operations.AddRuleResponse addRule(industries.dot.brease.models.operations.AddRuleRequest request, industries.dot.brease.models.operations.AddRuleSecurity security) throws Exception {
        String baseUrl = this._serverUrl;
        String url = industries.dot.brease.utils.Utils.generateURL(industries.dot.brease.models.operations.AddRuleRequest.class, baseUrl, "/{contextID}/rules/add", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = industries.dot.brease.utils.Utils.serializeRequestBody(request, "addRuleInput", "json");
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = industries.dot.brease.utils.Utils.configureSecurityClient(this._defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        industries.dot.brease.models.operations.AddRuleResponse res = new industries.dot.brease.models.operations.AddRuleResponse() {{
            apiAddRuleResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (industries.dot.brease.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                industries.dot.brease.models.shared.ApiAddRuleResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), industries.dot.brease.models.shared.ApiAddRuleResponse.class);
                res.apiAddRuleResponse = out;
            }
        }

        return res;
    }

    /**
     * Evaluate rules within a context on the provided object
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public industries.dot.brease.models.operations.EvaluateRulesResponse evaluateRules(industries.dot.brease.models.operations.EvaluateRulesRequest request, industries.dot.brease.models.operations.EvaluateRulesSecurity security) throws Exception {
        String baseUrl = this._serverUrl;
        String url = industries.dot.brease.utils.Utils.generateURL(industries.dot.brease.models.operations.EvaluateRulesRequest.class, baseUrl, "/{contextID}/evaluate", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = industries.dot.brease.utils.Utils.serializeRequestBody(request, "evaluateRulesInput", "json");
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = industries.dot.brease.utils.Utils.configureSecurityClient(this._defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        industries.dot.brease.models.operations.EvaluateRulesResponse res = new industries.dot.brease.models.operations.EvaluateRulesResponse() {{
            apiEvaluateRulesResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (industries.dot.brease.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                industries.dot.brease.models.shared.ApiEvaluateRulesResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), industries.dot.brease.models.shared.ApiEvaluateRulesResponse.class);
                res.apiEvaluateRulesResponse = out;
            }
        }

        return res;
    }

    /**
     * Returns all rules with the context
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public industries.dot.brease.models.operations.GetAllRulesResponse getAllRules(industries.dot.brease.models.operations.GetAllRulesRequest request, industries.dot.brease.models.operations.GetAllRulesSecurity security) throws Exception {
        String baseUrl = this._serverUrl;
        String url = industries.dot.brease.utils.Utils.generateURL(industries.dot.brease.models.operations.GetAllRulesRequest.class, baseUrl, "/{contextID}/rules", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = industries.dot.brease.utils.Utils.configureSecurityClient(this._defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        industries.dot.brease.models.operations.GetAllRulesResponse res = new industries.dot.brease.models.operations.GetAllRulesResponse() {{
            apiAllRulesResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (industries.dot.brease.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                industries.dot.brease.models.shared.ApiAllRulesResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), industries.dot.brease.models.shared.ApiAllRulesResponse.class);
                res.apiAllRulesResponse = out;
            }
        }

        return res;
    }

    /**
     * Removes a rule from the context
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public industries.dot.brease.models.operations.RemoveRuleResponse removeRule(industries.dot.brease.models.operations.RemoveRuleRequest request, industries.dot.brease.models.operations.RemoveRuleSecurity security) throws Exception {
        String baseUrl = this._serverUrl;
        String url = industries.dot.brease.utils.Utils.generateURL(industries.dot.brease.models.operations.RemoveRuleRequest.class, baseUrl, "/{contextID}/rules/{id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        
        HTTPClient client = industries.dot.brease.utils.Utils.configureSecurityClient(this._defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        industries.dot.brease.models.operations.RemoveRuleResponse res = new industries.dot.brease.models.operations.RemoveRuleResponse() {{
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
        }

        return res;
    }

    /**
     * Replaces an existing rule within the context
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public industries.dot.brease.models.operations.ReplaceRuleResponse replaceRule(industries.dot.brease.models.operations.ReplaceRuleRequest request, industries.dot.brease.models.operations.ReplaceRuleSecurity security) throws Exception {
        String baseUrl = this._serverUrl;
        String url = industries.dot.brease.utils.Utils.generateURL(industries.dot.brease.models.operations.ReplaceRuleRequest.class, baseUrl, "/{contextID}/rules/{id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = industries.dot.brease.utils.Utils.serializeRequestBody(request, "replaceRuleInput", "json");
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = industries.dot.brease.utils.Utils.configureSecurityClient(this._defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        industries.dot.brease.models.operations.ReplaceRuleResponse res = new industries.dot.brease.models.operations.ReplaceRuleResponse() {{
            apiReplaceRuleResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (industries.dot.brease.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                industries.dot.brease.models.shared.ApiReplaceRuleResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), industries.dot.brease.models.shared.ApiReplaceRuleResponse.class);
                res.apiReplaceRuleResponse = out;
            }
        }

        return res;
    }
}