<!-- Start SDK Example Usage -->
```python
import sdk
from sdk.models import operations, shared

s = sdk.SDK()


req = operations.AddRuleRequest(
    add_rule_input=shared.AddRuleInput(
        rule=shared.APIRule(
            action="corrupti",
            description="provident",
            expression={
                "quibusdam": "unde",
                "nulla": "corrupti",
                "illum": "vel",
            },
            id="error",
            target="deserunt",
            target_type="suscipit",
            target_value="iure",
        ),
    ),
    context_id="magnam",
)
    
res = s.context_id.add_rule(req, operations.AddRuleSecurity(
    api_token="Bearer YOUR_BEARER_TOKEN_HERE",
))

if res.api_add_rule_response is not None:
    # handle response
```
<!-- End SDK Example Usage -->