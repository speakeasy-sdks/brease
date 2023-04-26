/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package industries.dot.brease.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class AddRuleResponse {
    /**
     * OK
     */
    
    public industries.dot.brease.models.shared.ApiAddRuleResponse apiAddRuleResponse;
    public AddRuleResponse withApiAddRuleResponse(industries.dot.brease.models.shared.ApiAddRuleResponse apiAddRuleResponse) {
        this.apiAddRuleResponse = apiAddRuleResponse;
        return this;
    }
    
    
    public String contentType;
    public AddRuleResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;
    public AddRuleResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public AddRuleResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public AddRuleResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
