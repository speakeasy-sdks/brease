<!-- Start SDK Example Usage -->
```typescript
import { SDK } from "brease-sdk";
import { AddRuleResponse } from "brease-sdk/dist/sdk/models/operations";
import { ConditionType } from "brease-sdk/dist/sdk/models/shared";

const sdk = new SDK();

sdk.contextID.addRule({
  addRuleInput: {
    rule: {
      action: "corrupti",
      description: "provident",
      expression: {
        condition: {
          base: {
            ref: {
              dst: "unde",
              src: "nulla",
            },
          },
          parameter: false,
          type: ConditionType.Rgx,
        },
      },
      id: "69a674e0-f467-4cc8-b96e-d151a05dfc2d",
      target: {
        target: "at",
        targetValue: "maiores",
        type: "molestiae",
      },
    },
  },
  contextID: "quod",
}, {
  apiToken: "",
}).then((res: AddRuleResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```
<!-- End SDK Example Usage -->