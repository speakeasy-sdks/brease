<!-- Start SDK Example Usage -->
```java
package hello.world;

import industries.dot.brease.SDK;

import industries.dot.brease.models.operations.AddRuleSecurity;
import industries.dot.brease.models.operations.AddRuleRequest;
import industries.dot.brease.models.operations.AddRuleResponse;
import industries.dot.brease.models.shared.AddRuleInput;
import industries.dot.brease.models.shared.ApiRule;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            AddRuleRequest req = new AddRuleRequest() {{
                addRuleInput = new AddRuleInput() {{
                    rule = new ApiRule() {{
                        action = "corrupti";
                        description = "provident";
                        expression = new java.util.HashMap<String, Object>() {{
                            put("quibusdam", "unde");
                            put("nulla", "corrupti");
                            put("illum", "vel");
                        }};
                        id = "error";
                        target = "deserunt";
                        targetType = "suscipit";
                        targetValue = "iure";
                    }};
                }};
                contextID = "magnam";
            }}            

            AddRuleResponse res = sdk.contextID.addRule(req, new AddRuleSecurity() {{
                apiToken = "Bearer YOUR_BEARER_TOKEN_HERE";
            }});

            if (res.apiAddRuleResponse.isPresent()) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
```
<!-- End SDK Example Usage -->