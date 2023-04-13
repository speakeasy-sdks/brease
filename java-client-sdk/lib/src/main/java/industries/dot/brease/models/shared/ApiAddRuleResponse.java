/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package industries.dot.brease.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ApiAddRuleResponse - OK
 */
public class ApiAddRuleResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("rule")
    public ModelsRule rule;
    public ApiAddRuleResponse withRule(ModelsRule rule) {
        this.rule = rule;
        return this;
    }
    
}