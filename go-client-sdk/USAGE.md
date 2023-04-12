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

    ctx := context.Background()    
    req := operations.AddRuleRequest{
        AddRuleInput: &shared.AddRuleInput{
            Rule: &shared.ModelsRule{
                Action: "corrupti",
                Description: "provident",
                Expression: shared.Expression{},
                ID: "distinctio",
                Target: shared.ModelsTarget{
                    Target: "quibusdam",
                    TargetValue: "unde",
                    Type: "nulla",
                },
            },
        },
        ContextID: "corrupti",
    }

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