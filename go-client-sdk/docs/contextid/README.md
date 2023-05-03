# ContextID

## Overview

Rule domain context

### Available Operations

* [AddRule](#addrule) - Adds a new rule to the context
* [EvaluateRules](#evaluaterules) - Evaluate rules within a context on the provided object
* [GetAllRules](#getallrules) - Returns all rules with the context
* [RemoveRule](#removerule) - Removes a rule from the context
* [ReplaceRule](#replacerule) - Replaces an existing rule within the context

## AddRule

Adds a new rule to the context

### Example Usage

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
                Action: "odit",
                Description: sdk.String("at"),
                Expression: shared.Expression{},
                ID: "df7cc78c-a1ba-4928-bc81-6742cb739205",
                Target: shared.ModelsTarget{
                    Target: "natus",
                    TargetValue: sdk.String("sed"),
                    Type: "iste",
                },
            },
        },
        ContextID: "dolor",
    }, operations.AddRuleSecurity{
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

## EvaluateRules

Evaluate rules within a context on the provided object

### Example Usage

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
    res, err := s.ContextID.EvaluateRules(ctx, operations.EvaluateRulesRequest{
        EvaluateRulesInput: &shared.EvaluateRulesInput{
            Object: map[string]interface{}{
                "laboriosam": "hic",
                "saepe": "fuga",
                "in": "corporis",
            },
            OverrideCode: sdk.String("iste"),
            OverrideRules: []shared.ModelsRule{
                shared.ModelsRule{
                    Action: "saepe",
                    Description: sdk.String("quidem"),
                    Expression: shared.Expression{},
                    ID: "10faaa23-52c5-4955-907a-ff1a3a2fa946",
                    Target: shared.ModelsTarget{
                        Target: "quam",
                        TargetValue: sdk.String("molestiae"),
                        Type: "velit",
                    },
                },
                shared.ModelsRule{
                    Action: "error",
                    Description: sdk.String("quia"),
                    Expression: shared.Expression{},
                    ID: "51aa52c3-f5ad-4019-9a1f-fe78f097b007",
                    Target: shared.ModelsTarget{
                        Target: "ut",
                        TargetValue: sdk.String("maiores"),
                        Type: "dicta",
                    },
                },
            },
        },
        ContextID: "corporis",
    }, operations.EvaluateRulesSecurity{
        APIToken: "Bearer YOUR_BEARER_TOKEN_HERE",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.APIEvaluateRulesResponse != nil {
        // handle response
    }
}
```

## GetAllRules

Returns all rules with the context

### Example Usage

```go
package main

import(
	"context"
	"log"
	"brease"
	"brease/pkg/models/operations"
)

func main() {
    s := sdk.New()

    ctx := context.Background()
    res, err := s.ContextID.GetAllRules(ctx, operations.GetAllRulesRequest{
        ContextID: "dolore",
    }, operations.GetAllRulesSecurity{
        APIToken: "Bearer YOUR_BEARER_TOKEN_HERE",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.APIAllRulesResponse != nil {
        // handle response
    }
}
```

## RemoveRule

Removes a rule from the context

### Example Usage

```go
package main

import(
	"context"
	"log"
	"brease"
	"brease/pkg/models/operations"
)

func main() {
    s := sdk.New()

    ctx := context.Background()
    res, err := s.ContextID.RemoveRule(ctx, operations.RemoveRuleRequest{
        ContextID: "iusto",
        ID: "1b5e6e13-b99d-4488-a1e9-1e450ad2abd4",
    }, operations.RemoveRuleSecurity{
        APIToken: "Bearer YOUR_BEARER_TOKEN_HERE",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.StatusCode == http.StatusOK {
        // handle response
    }
}
```

## ReplaceRule

Replaces an existing rule within the context

### Example Usage

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
    res, err := s.ContextID.ReplaceRule(ctx, operations.ReplaceRuleRequest{
        ReplaceRuleInput: &shared.ReplaceRuleInput{
            Rule: shared.ModelsRule{
                Action: "modi",
                Description: sdk.String("qui"),
                Expression: shared.Expression{},
                ID: "69802d50-2a94-4bb4-b63c-969e9a3efa77",
                Target: shared.ModelsTarget{
                    Target: "illum",
                    TargetValue: sdk.String("maiores"),
                    Type: "rerum",
                },
            },
        },
        ContextID: "dicta",
        ID: "4cd66ae3-95ef-4b9b-a88f-3a66997074ba",
    }, operations.ReplaceRuleSecurity{
        APIToken: "Bearer YOUR_BEARER_TOKEN_HERE",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.APIReplaceRuleResponse != nil {
        // handle response
    }
}
```
