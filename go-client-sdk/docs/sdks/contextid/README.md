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

### Parameters

| Parameter                                                                | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `ctx`                                                                    | [context.Context](https://pkg.go.dev/context#Context)                    | :heavy_check_mark:                                                       | The context to use for the request.                                      |
| `request`                                                                | [operations.AddRuleRequest](../../models/operations/addrulerequest.md)   | :heavy_check_mark:                                                       | The request object to use for the request.                               |
| `security`                                                               | [operations.AddRuleSecurity](../../models/operations/addrulesecurity.md) | :heavy_check_mark:                                                       | The security requirements to use for the request.                        |


### Response

**[*operations.AddRuleResponse](../../models/operations/addruleresponse.md), error**


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
        APIToken: "",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.APIEvaluateRulesResponse != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                            | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `ctx`                                                                                | [context.Context](https://pkg.go.dev/context#Context)                                | :heavy_check_mark:                                                                   | The context to use for the request.                                                  |
| `request`                                                                            | [operations.EvaluateRulesRequest](../../models/operations/evaluaterulesrequest.md)   | :heavy_check_mark:                                                                   | The request object to use for the request.                                           |
| `security`                                                                           | [operations.EvaluateRulesSecurity](../../models/operations/evaluaterulessecurity.md) | :heavy_check_mark:                                                                   | The security requirements to use for the request.                                    |


### Response

**[*operations.EvaluateRulesResponse](../../models/operations/evaluaterulesresponse.md), error**


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
        APIToken: "",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.APIAllRulesResponse != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                        | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `ctx`                                                                            | [context.Context](https://pkg.go.dev/context#Context)                            | :heavy_check_mark:                                                               | The context to use for the request.                                              |
| `request`                                                                        | [operations.GetAllRulesRequest](../../models/operations/getallrulesrequest.md)   | :heavy_check_mark:                                                               | The request object to use for the request.                                       |
| `security`                                                                       | [operations.GetAllRulesSecurity](../../models/operations/getallrulessecurity.md) | :heavy_check_mark:                                                               | The security requirements to use for the request.                                |


### Response

**[*operations.GetAllRulesResponse](../../models/operations/getallrulesresponse.md), error**


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
        APIToken: "",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.StatusCode == http.StatusOK {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                      | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `ctx`                                                                          | [context.Context](https://pkg.go.dev/context#Context)                          | :heavy_check_mark:                                                             | The context to use for the request.                                            |
| `request`                                                                      | [operations.RemoveRuleRequest](../../models/operations/removerulerequest.md)   | :heavy_check_mark:                                                             | The request object to use for the request.                                     |
| `security`                                                                     | [operations.RemoveRuleSecurity](../../models/operations/removerulesecurity.md) | :heavy_check_mark:                                                             | The security requirements to use for the request.                              |


### Response

**[*operations.RemoveRuleResponse](../../models/operations/removeruleresponse.md), error**


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
        APIToken: "",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.APIReplaceRuleResponse != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                        | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `ctx`                                                                            | [context.Context](https://pkg.go.dev/context#Context)                            | :heavy_check_mark:                                                               | The context to use for the request.                                              |
| `request`                                                                        | [operations.ReplaceRuleRequest](../../models/operations/replacerulerequest.md)   | :heavy_check_mark:                                                               | The request object to use for the request.                                       |
| `security`                                                                       | [operations.ReplaceRuleSecurity](../../models/operations/replacerulesecurity.md) | :heavy_check_mark:                                                               | The security requirements to use for the request.                                |


### Response

**[*operations.ReplaceRuleResponse](../../models/operations/replaceruleresponse.md), error**

