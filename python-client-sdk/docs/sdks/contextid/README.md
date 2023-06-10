# context_id

## Overview

Rule domain context

### Available Operations

* [add_rule](#add_rule) - Adds a new rule to the context
* [evaluate_rules](#evaluate_rules) - Evaluate rules within a context on the provided object
* [get_all_rules](#get_all_rules) - Returns all rules with the context
* [remove_rule](#remove_rule) - Removes a rule from the context
* [replace_rule](#replace_rule) - Replaces an existing rule within the context

## add_rule

Adds a new rule to the context

### Example Usage

```python
import sdk
from sdk.models import operations, shared

s = sdk.SDK()

req = operations.AddRuleRequest(
    add_rule_input=shared.AddRuleInput(
        rule=shared.ModelsRule(
            action='quod',
            description='esse',
            expression=shared.ModelsRuleExpression2(
                or_=shared.ExpressionArray(
                    expression=[
                        shared.ExpressionArrayExpression3(
                            condition=shared.Condition(
                                base=shared.ConditionBaseKey(
                                    key='nam',
                                ),
                                parameter=False,
                                type=shared.ConditionType.SX,
                            ),
                        ),
                        shared.ExpressionArrayExpression1(
                            and_=shared.ExpressionArray(),
                        ),
                        shared.ExpressionArrayExpression2(
                            or_=shared.ExpressionArray(),
                        ),
                        shared.ExpressionArrayExpression3(
                            condition=shared.Condition(
                                base=shared.ConditionBase2(
                                    ref=shared.ConditionBaseRef(
                                        dst='totam',
                                        src='beatae',
                                    ),
                                ),
                                parameter=False,
                                type=shared.ConditionType.NPX,
                            ),
                        ),
                    ],
                ),
            ),
            id='42cb7392-0592-4939-afea-7596eb10faaa',
            target=shared.ModelsTarget(
                target='dolores',
                target_value='dolorem',
                type='corporis',
            ),
        ),
    ),
    context_id='explicabo',
)

res = s.context_id.add_rule(req, operations.AddRuleSecurity(
    api_token="",
))

if res.api_add_rule_response is not None:
    # handle response
```

### Parameters

| Parameter                                                                | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `request`                                                                | [operations.AddRuleRequest](../../models/operations/addrulerequest.md)   | :heavy_check_mark:                                                       | The request object to use for the request.                               |
| `security`                                                               | [operations.AddRuleSecurity](../../models/operations/addrulesecurity.md) | :heavy_check_mark:                                                       | The security requirements to use for the request.                        |


### Response

**[operations.AddRuleResponse](../../models/operations/addruleresponse.md)**


## evaluate_rules

Evaluate rules within a context on the provided object

### Example Usage

```python
import sdk
from sdk.models import operations, shared

s = sdk.SDK()

req = operations.EvaluateRulesRequest(
    evaluate_rules_input=shared.EvaluateRulesInput(
        object={
            "enim": 'omnis',
            "nemo": 'minima',
            "excepturi": 'accusantium',
            "iure": 'culpa',
        },
        override_code='doloribus',
        override_rules=[
            shared.ModelsRule(
                action='architecto',
                description='mollitia',
                expression=shared.ModelsRuleExpression1(
                    and_=shared.ExpressionArray(
                        expression=[
                            shared.ExpressionArrayExpression1(
                                and_=shared.ExpressionArray(),
                            ),
                            shared.ExpressionArrayExpression3(
                                condition=shared.Condition(
                                    base=shared.ConditionBase2(
                                        ref=shared.ConditionBaseRef(
                                            dst='occaecati',
                                            src='numquam',
                                        ),
                                    ),
                                    parameter=False,
                                    type=shared.ConditionType.NPX,
                                ),
                            ),
                            shared.ExpressionArrayExpression2(
                                or_=shared.ExpressionArray(),
                            ),
                        ],
                    ),
                ),
                id='39251aa5-2c3f-45ad-819d-a1ffe78f097b',
                target=shared.ModelsTarget(
                    target='perferendis',
                    target_value='doloremque',
                    type='reprehenderit',
                ),
            ),
            shared.ModelsRule(
                action='ut',
                description='maiores',
                expression=shared.ModelsRuleExpression1(
                    and_=shared.ExpressionArray(
                        expression=[
                            shared.ExpressionArrayExpression1(
                                and_=shared.ExpressionArray(),
                            ),
                            shared.ExpressionArrayExpression2(
                                or_=shared.ExpressionArray(),
                            ),
                        ],
                    ),
                ),
                id='1b5e6e13-b99d-4488-a1e9-1e450ad2abd4',
                target=shared.ModelsTarget(
                    target='modi',
                    target_value='qui',
                    type='aliquid',
                ),
            ),
            shared.ModelsRule(
                action='cupiditate',
                description='quos',
                expression=shared.ModelsRuleExpression1(
                    and_=shared.ExpressionArray(
                        expression=[
                            shared.ExpressionArrayExpression3(
                                condition=shared.Condition(
                                    base=shared.ConditionBaseKey(
                                        key='alias',
                                    ),
                                    parameter='dolorum',
                                    type=shared.ConditionType.SX,
                                ),
                            ),
                        ],
                    ),
                ),
                id='4bb4f63c-969e-49a3-afa7-7dfb14cd66ae',
                target=shared.ModelsTarget(
                    target='non',
                    target_value='occaecati',
                    type='enim',
                ),
            ),
            shared.ModelsRule(
                action='accusamus',
                description='delectus',
                expression=shared.ModelsRuleExpression3(
                    condition=shared.Condition(
                        base=shared.ConditionBase2(
                            ref=shared.ConditionBaseRef(
                                dst='nam',
                                src='id',
                            ),
                        ),
                        parameter=False,
                        type=shared.ConditionType.SX,
                    ),
                ),
                id='f3a66997-074b-4a44-a9b6-e2141959890a',
                target=shared.ModelsTarget(
                    target='reiciendis',
                    target_value='mollitia',
                    type='ad',
                ),
            ),
        ],
    ),
    context_id='eum',
)

res = s.context_id.evaluate_rules(req, operations.EvaluateRulesSecurity(
    api_token="",
))

if res.api_evaluate_rules_response is not None:
    # handle response
```

### Parameters

| Parameter                                                                            | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `request`                                                                            | [operations.EvaluateRulesRequest](../../models/operations/evaluaterulesrequest.md)   | :heavy_check_mark:                                                                   | The request object to use for the request.                                           |
| `security`                                                                           | [operations.EvaluateRulesSecurity](../../models/operations/evaluaterulessecurity.md) | :heavy_check_mark:                                                                   | The security requirements to use for the request.                                    |


### Response

**[operations.EvaluateRulesResponse](../../models/operations/evaluaterulesresponse.md)**


## get_all_rules

Returns all rules with the context

### Example Usage

```python
import sdk
from sdk.models import operations

s = sdk.SDK()

req = operations.GetAllRulesRequest(
    context_id='dolor',
)

res = s.context_id.get_all_rules(req, operations.GetAllRulesSecurity(
    api_token="",
))

if res.api_all_rules_response is not None:
    # handle response
```

### Parameters

| Parameter                                                                        | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `request`                                                                        | [operations.GetAllRulesRequest](../../models/operations/getallrulesrequest.md)   | :heavy_check_mark:                                                               | The request object to use for the request.                                       |
| `security`                                                                       | [operations.GetAllRulesSecurity](../../models/operations/getallrulessecurity.md) | :heavy_check_mark:                                                               | The security requirements to use for the request.                                |


### Response

**[operations.GetAllRulesResponse](../../models/operations/getallrulesresponse.md)**


## remove_rule

Removes a rule from the context

### Example Usage

```python
import sdk
from sdk.models import operations

s = sdk.SDK()

req = operations.RemoveRuleRequest(
    context_id='necessitatibus',
    id='2516fe4c-8b71-41e5-b7fd-2ed028921cdd',
)

res = s.context_id.remove_rule(req, operations.RemoveRuleSecurity(
    api_token="",
))

if res.status_code == 200:
    # handle response
```

### Parameters

| Parameter                                                                      | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `request`                                                                      | [operations.RemoveRuleRequest](../../models/operations/removerulerequest.md)   | :heavy_check_mark:                                                             | The request object to use for the request.                                     |
| `security`                                                                     | [operations.RemoveRuleSecurity](../../models/operations/removerulesecurity.md) | :heavy_check_mark:                                                             | The security requirements to use for the request.                              |


### Response

**[operations.RemoveRuleResponse](../../models/operations/removeruleresponse.md)**


## replace_rule

Replaces an existing rule within the context

### Example Usage

```python
import sdk
from sdk.models import operations, shared

s = sdk.SDK()

req = operations.ReplaceRuleRequest(
    replace_rule_input=shared.ReplaceRuleInput(
        rule=shared.ModelsRule(
            action='maxime',
            description='ea',
            expression=shared.ModelsRuleExpression2(
                or_=shared.ExpressionArray(
                    expression=[
                        shared.ExpressionArrayExpression2(
                            or_=shared.ExpressionArray(),
                        ),
                    ],
                ),
            ),
            id='01fb576b-0d5f-40d3-8c5f-bb2587053202',
            target=shared.ModelsTarget(
                target='minus',
                target_value='quam',
                type='dolor',
            ),
        ),
    ),
    context_id='vero',
    id='5fe9b90c-2890-49b3-be49-a8d9cbf48633',
)

res = s.context_id.replace_rule(req, operations.ReplaceRuleSecurity(
    api_token="",
))

if res.api_replace_rule_response is not None:
    # handle response
```

### Parameters

| Parameter                                                                        | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `request`                                                                        | [operations.ReplaceRuleRequest](../../models/operations/replacerulerequest.md)   | :heavy_check_mark:                                                               | The request object to use for the request.                                       |
| `security`                                                                       | [operations.ReplaceRuleSecurity](../../models/operations/replacerulesecurity.md) | :heavy_check_mark:                                                               | The security requirements to use for the request.                                |


### Response

**[operations.ReplaceRuleResponse](../../models/operations/replaceruleresponse.md)**

