/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package industries.dot.brease.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ApiEvaluateRulesResponse - OK
 */
public class ApiEvaluateRulesResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("results")
    public ModelsEvaluationResult[] results;
    public ApiEvaluateRulesResponse withResults(ModelsEvaluationResult[] results) {
        this.results = results;
        return this;
    }
    
}
