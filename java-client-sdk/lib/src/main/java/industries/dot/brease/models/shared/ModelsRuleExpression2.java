/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package industries.dot.brease.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ModelsRuleExpression2 {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("or")
    public ExpressionArray or;

    public ModelsRuleExpression2 withOr(ExpressionArray or) {
        this.or = or;
        return this;
    }
    
    public ModelsRuleExpression2(){}
}
