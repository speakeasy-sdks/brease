/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package industries.dot.brease.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ConditionBaseRef {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dst")
    public String dst;

    public ConditionBaseRef withDst(String dst) {
        this.dst = dst;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("src")
    public String src;

    public ConditionBaseRef withSrc(String src) {
        this.src = src;
        return this;
    }
    
    public ConditionBaseRef(){}
}
