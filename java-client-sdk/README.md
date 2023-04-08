# brease-sdk

<!-- Start SDK Installation -->
## SDK Installation

### Gradle

```groovy
implementation 'industries.dot.brease:brease-sdk:1.0.0'
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
