<!-- Start SDK Example Usage -->
```java
package hello.world;

import industries.dot.brease.SDK;

import industries.dot.brease.models.operations.AddRuleSecurity;
import industries.dot.brease.models.operations.AddRuleRequest;
import industries.dot.brease.models.operations.AddRuleResponse;
import industries.dot.brease.models.shared.AddRuleInput;
import industries.dot.brease.models.shared.ModelsRuleExpression3;
import industries.dot.brease.models.shared.ModelsRuleExpression2;
import industries.dot.brease.models.shared.ModelsRuleExpression1;
import industries.dot.brease.models.shared.ModelsRule;
import industries.dot.brease.models.shared.ModelsTarget;
import industries.dot.brease.models.shared.ExpressionArrayExpression3;
import industries.dot.brease.models.shared.ExpressionArrayExpression2;
import industries.dot.brease.models.shared.ExpressionArrayExpression1;
import industries.dot.brease.models.shared.ExpressionArray;
import industries.dot.brease.models.shared.ConditionBase2;
import industries.dot.brease.models.shared.Condition;
import industries.dot.brease.models.shared.ConditionTypeEnum;
import industries.dot.brease.models.shared.ConditionBaseKey;
import industries.dot.brease.models.shared.ConditionBaseRef;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            AddRuleRequest req = new AddRuleRequest() {{
                addRuleInput = new AddRuleInput() {{
                    rule = new ModelsRule() {{
                        action = "corrupti";
                        description = "provident";
                        expression = new ModelsRuleExpression3() {{
                            condition = new Condition() {{
                                base = new ConditionBase2() {{
                                    ref = new ConditionBaseRef() {{
                                        dst = "unde";
                                        src = "nulla";
                                    }};
                                }};
                                parameter = false;
                                type = "rgx";
                            }};
                        }};
                        id = "vel";
                        target = new ModelsTarget() {{
                            target = "error";
                            targetValue = "deserunt";
                            type = "suscipit";
                        }};
                    }};
                }};
                contextID = "iure";
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