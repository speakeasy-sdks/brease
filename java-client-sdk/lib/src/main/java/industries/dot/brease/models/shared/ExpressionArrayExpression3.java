/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package industries.dot.brease.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ExpressionArrayExpression3 {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("condition")
    public Condition condition;
    public ExpressionArrayExpression3 withCondition(Condition condition) {
        this.condition = condition;
        return this;
    }
    
    public ExpressionArrayExpression3(){}
}
