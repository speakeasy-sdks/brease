<!-- Start SDK Example Usage -->
```python
import sdk
from sdk.models import operations, shared

s = sdk.SDK()


req = operations.AddRuleRequest(
    add_rule_input=shared.AddRuleInput(
        rule=shared.ModelsRule(
            action='corrupti',
            description='provident',
            expression=shared.ModelsRuleExpression3(
                condition=shared.Condition(
                    base=shared.ConditionBase2(
                        ref=shared.ConditionBaseRef(
                            dst='unde',
                            src='nulla',
                        ),
                    ),
                    parameter=False,
                    type=shared.ConditionTypeEnum.RGX,
                ),
            ),
            id='69a674e0-f467-4cc8-b96e-d151a05dfc2d',
            target=shared.ModelsTarget(
                target='at',
                target_value='maiores',
                type='molestiae',
            ),
        ),
    ),
    context_id='quod',
)

res = s.context_id.add_rule(req, operations.AddRuleSecurity(
    api_token="Bearer YOUR_BEARER_TOKEN_HERE",
))

if res.api_add_rule_response is not None:
    # handle response
```
<!-- End SDK Example Usage -->