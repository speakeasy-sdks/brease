<!-- Start SDK Example Usage -->
```typescript
import {
  AddRuleRequest,
  AddRuleResponse
} from "brease-sdk/dist/sdk/models/operations";

import { AxiosError } from "axios";
import { SDK } from "brease-sdk";
const sdk = new SDK();

const req: AddRuleRequest = {
  addRuleInput: {
    rule: {
      action: "corrupti",
      description: "provident",
      expression: {
        "quibusdam": "unde",
        "nulla": "corrupti",
        "illum": "vel",
      },
      id: "error",
      target: "deserunt",
      targetType: "suscipit",
      targetValue: "iure",
    },
  },
  contextID: "magnam",
};

sdk.contextID.addRule(req).then((res: AddRuleResponse | AxiosError) => {
   // handle response
});
```
<!-- End SDK Example Usage -->