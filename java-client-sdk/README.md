# brease-sdk

<!-- Start SDK Installation -->
## SDK Installation

### Gradle

```groovy
implementation 'industries.dot.brease:brease-sdk:0.0.1'
```
<!-- End SDK Installation -->

## SDK Example Usage
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

<!-- Start SDK Available Operations -->
## Available Resources and Operations


### contextID

* `addRule` - Adds a new rule to the context
* `evaluateRules` - Evaluate rules within a context on the provided object
* `getAllRules` - Returns all rules with the context
* `removeRule` - Removes a rule from the context
* `replaceRule` - Replaces an existing rule within the context
<!-- End SDK Available Operations -->

### Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage 
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally 
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated programmatically. 
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release !

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
