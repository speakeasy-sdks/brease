/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package industries.dot.brease.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import industries.dot.brease.utils.SpeakeasyMetadata;

public class AddRuleSecurity {
    @SpeakeasyMetadata("security:scheme=true,type=http,subtype=bearer,name=Authorization")
    public String apiToken;
    public AddRuleSecurity withApiToken(String apiToken) {
        this.apiToken = apiToken;
        return this;
    }
    
    public AddRuleSecurity(@JsonProperty("apiToken") String apiToken) {
        this.apiToken = apiToken;
  }
}
