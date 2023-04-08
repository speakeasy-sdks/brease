# brease-sdk

<!-- Start SDK Installation -->
## SDK Installation

### NPM

```bash
npm add brease-sdk
```

### Yarn

```bash
yarn add brease-sdk
```
<!-- End SDK Installation -->

## SDK Example Usage
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

<!-- Start SDK Available Operations -->
## Available Resources and Operations


### contextID

* `addRule` - Adds a new rule to the context
* `evaluateRules` - Evaluate rules within a context on the provided object
* `getAllRules` - Returns all rules with the context
* `removeRule` - Removes a rule from the context
* `replaceRule` - Replaces an existing rule within the context
<!-- End SDK Available Operations -->

### Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated programmatically.
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release !

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)

