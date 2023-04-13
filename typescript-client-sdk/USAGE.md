<!-- Start SDK Example Usage -->
```typescript
import {
  AddRuleRequest,
  AddRuleResponse
} from "brease-sdk/dist/sdk/models/operations";
import {
  ConditionTypeEnum,
} from "brease-sdk/dist/sdk/models/shared";

import { AxiosError } from "axios";
import { SDK } from "brease-sdk";
const sdk = new SDK();

const req: AddRuleRequest = {
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
          type: ConditionTypeEnum.Rgx,
        },
      },
      id: "vel",
      target: {
        target: "error",
        targetValue: "deserunt",
        type: "suscipit",
      },
    },
  },
  contextID: "iure",
};

sdk.contextID.addRule(req).then((res: AddRuleResponse | AxiosError) => {
   // handle response
});
```
<!-- End SDK Example Usage -->