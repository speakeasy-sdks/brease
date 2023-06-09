/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package industries.dot.brease.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ConditionBaseKey {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    public String key;

    public ConditionBaseKey withKey(String key) {
        this.key = key;
        return this;
    }
    
    public ConditionBaseKey(){}
}
