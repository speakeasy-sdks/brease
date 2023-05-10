/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package industries.dot.brease.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class GetAllRulesResponse {
    /**
     * OK
     */
    
    public industries.dot.brease.models.shared.ApiAllRulesResponse apiAllRulesResponse;

    public GetAllRulesResponse withApiAllRulesResponse(industries.dot.brease.models.shared.ApiAllRulesResponse apiAllRulesResponse) {
        this.apiAllRulesResponse = apiAllRulesResponse;
        return this;
    }
    
    
    public String contentType;

    public GetAllRulesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public GetAllRulesResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetAllRulesResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetAllRulesResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
