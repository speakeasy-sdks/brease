/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package industries.dot.brease.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class EvaluateRulesResponse {
    /**
     * OK
     */
    
    public industries.dot.brease.models.shared.ApiEvaluateRulesResponse apiEvaluateRulesResponse;
    public EvaluateRulesResponse withApiEvaluateRulesResponse(industries.dot.brease.models.shared.ApiEvaluateRulesResponse apiEvaluateRulesResponse) {
        this.apiEvaluateRulesResponse = apiEvaluateRulesResponse;
        return this;
    }
    
    
    public String contentType;
    public EvaluateRulesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;
    public EvaluateRulesResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public EvaluateRulesResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    

    public EvaluateRulesResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
    this.contentType = contentType;
this.statusCode = statusCode;
  }
}
