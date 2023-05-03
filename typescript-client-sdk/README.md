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
import { SDK } from "brease-sdk";
import { AddRuleResponse } from "brease-sdk/dist/sdk/models/operations";
import { ConditionTypeEnum } from "brease-sdk/dist/sdk/models/shared";

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
          type: ConditionTypeEnum.Rgx,
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
  apiToken: "Bearer YOUR_BEARER_TOKEN_HERE",
}).then((res: AddRuleResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```
<!-- End SDK Example Usage -->

<!-- Start SDK Available Operations -->
## Available Resources and Operations


### [contextID](docs/contextid/README.md)

* [addRule](docs/contextid/README.md#addrule) - Adds a new rule to the context
* [evaluateRules](docs/contextid/README.md#evaluaterules) - Evaluate rules within a context on the provided object
* [getAllRules](docs/contextid/README.md#getallrules) - Returns all rules with the context
* [removeRule](docs/contextid/README.md#removerule) - Removes a rule from the context
* [replaceRule](docs/contextid/README.md#replacerule) - Replaces an existing rule within the context
<!-- End SDK Available Operations -->

### Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated programmatically.
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release !

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)

