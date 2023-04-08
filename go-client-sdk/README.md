# brease

<!-- Start SDK Installation -->
## SDK Installation

```bash
go get github.com/speakeasy-sdks/brease/go-client-sdk
```
<!-- End SDK Installation -->

## SDK Example Usage
<!-- Start SDK Example Usage -->
```go
package main

import (
    "context"
    "log"
    "brease"
    "brease/pkg/models/shared"
    "brease/pkg/models/operations"
)

func main() {
    s := sdk.New()

    req := operations.AddRuleRequest{
        AddRuleInput: &shared.AddRuleInput{
            Rule: &shared.APIRule{
                Action: "corrupti",
                Description: "provident",
                Expression: map[string]interface{}{
                    "quibusdam": "unde",
                    "nulla": "corrupti",
                    "illum": "vel",
                },
                ID: "error",
                Target: "deserunt",
                TargetType: "suscipit",
                TargetValue: "iure",
            },
        },
        ContextID: "magnam",
    }

    ctx := context.Background()
    res, err := s.ContextID.AddRule(ctx, req, operations.AddRuleSecurity{
        APIToken: "Bearer YOUR_BEARER_TOKEN_HERE",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.APIAddRuleResponse != nil {
        // handle response
    }
}
```
<!-- End SDK Example Usage -->

<!-- Start SDK Available Operations -->
## Available Resources and Operations


### ContextID

* `AddRule` - Adds a new rule to the context
* `EvaluateRules` - Evaluate rules within a context on the provided object
* `GetAllRules` - Returns all rules with the context
* `RemoveRule` - Removes a rule from the context
* `ReplaceRule` - Replaces an existing rule within the context
<!-- End SDK Available Operations -->

### Maturity

This SDK is in beta and therefore, we recommend pinning usage to a specific package version.
This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated and maintained programmatically.
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release !

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
