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

<!-- Start SDK Available Operations -->
## Available Resources and Operations


### [ContextID](docs/contextid/README.md)

* [AddRule](docs/contextid/README.md#addrule) - Adds a new rule to the context
* [EvaluateRules](docs/contextid/README.md#evaluaterules) - Evaluate rules within a context on the provided object
* [GetAllRules](docs/contextid/README.md#getallrules) - Returns all rules with the context
* [RemoveRule](docs/contextid/README.md#removerule) - Removes a rule from the context
* [ReplaceRule](docs/contextid/README.md#replacerule) - Replaces an existing rule within the context
<!-- End SDK Available Operations -->

### Maturity

This SDK is in beta and therefore, we recommend pinning usage to a specific package version.
This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated and maintained programmatically.
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release !

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
