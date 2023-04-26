/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package industries.dot.brease.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import industries.dot.brease.utils.SpeakeasyMetadata;

public class GetAllRulesSecurity {
    @SpeakeasyMetadata("security:scheme=true,type=http,subtype=bearer,name=Authorization")
    public String apiToken;
    public GetAllRulesSecurity withApiToken(String apiToken) {
        this.apiToken = apiToken;
        return this;
    }
    
    public GetAllRulesSecurity(@JsonProperty("apiToken") String apiToken) {
        this.apiToken = apiToken;
  }
}
