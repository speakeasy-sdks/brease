<!-- Start SDK Example Usage -->
```go
package main

import(
	"context"
	"log"
	"brease"
	"brease/pkg/models/operations"
	"brease/pkg/models/shared"
)

func main() {
    s := sdk.New()

    ctx := context.Background()
    res, err := s.ContextID.AddRule(ctx, operations.AddRuleRequest{
        AddRuleInput: &shared.AddRuleInput{
            Rule: &shared.ModelsRule{
                Action: "corrupti",
                Description: sdk.String("provident"),
                Expression: shared.Expression{},
                ID: "bd9d8d69-a674-4e0f-867c-c8796ed151a0",
                Target: shared.ModelsTarget{
                    Target: "ipsam",
                    TargetValue: sdk.String("repellendus"),
                    Type: "sapiente",
                },
            },
        },
        ContextID: "quo",
    }, operations.AddRuleSecurity{
        APIToken: "",
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