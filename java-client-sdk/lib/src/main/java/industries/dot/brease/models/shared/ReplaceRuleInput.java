/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package industries.dot.brease.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReplaceRuleInput {
    @JsonProperty("rule")
    public ApiRule rule;
    public ReplaceRuleInput withRule(ApiRule rule) {
        this.rule = rule;
        return this;
    }
    
}
