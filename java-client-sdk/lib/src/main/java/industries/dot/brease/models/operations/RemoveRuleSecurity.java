/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package industries.dot.brease.models.operations;

import industries.dot.brease.utils.SpeakeasyMetadata;

public class RemoveRuleSecurity {
    @SpeakeasyMetadata("security:scheme=true,type=http,subtype=bearer,name=Authorization")
    public String apiToken;
    public RemoveRuleSecurity withApiToken(String apiToken) {
        this.apiToken = apiToken;
        return this;
    }
    
}
