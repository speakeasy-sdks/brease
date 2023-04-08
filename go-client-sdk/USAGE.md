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