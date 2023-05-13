# contextID

## Overview

Rule domain context

### Available Operations

* [addRule](#addrule) - Adds a new rule to the context
* [evaluateRules](#evaluaterules) - Evaluate rules within a context on the provided object
* [getAllRules](#getallrules) - Returns all rules with the context
* [removeRule](#removerule) - Removes a rule from the context
* [replaceRule](#replacerule) - Replaces an existing rule within the context

## addRule

Adds a new rule to the context

### Example Usage

```typescript
import { SDK } from "brease-sdk";
import { AddRuleResponse } from "brease-sdk/dist/sdk/models/operations";
import { ConditionTypeEnum } from "brease-sdk/dist/sdk/models/shared";

const sdk = new SDK();

sdk.contextID.addRule({
  addRuleInput: {
    rule: {
      action: "quod",
      description: "esse",
      expression: {
        or: {
          expression: [
            {
              condition: {
                base: {
                  key: "nam",
                },
                parameter: false,
                type: ConditionTypeEnum.Sx,
              },
            },
            {
              and: {},
            },
            {
              or: {},
            },
            {
              condition: {
                base: {
                  ref: {
                    dst: "totam",
                    src: "beatae",
                  },
                },
                parameter: false,
                type: ConditionTypeEnum.Npx,
              },
            },
          ],
        },
      },
      id: "42cb7392-0592-4939-afea-7596eb10faaa",
      target: {
        target: "dolores",
        targetValue: "dolorem",
        type: "corporis",
      },
    },
  },
  contextID: "explicabo",
}, {
  apiToken: "YOUR_BEARER_TOKEN_HERE",
}).then((res: AddRuleResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## evaluateRules

Evaluate rules within a context on the provided object

### Example Usage

```typescript
import { SDK } from "brease-sdk";
import { EvaluateRulesResponse } from "brease-sdk/dist/sdk/models/operations";
import { ConditionTypeEnum } from "brease-sdk/dist/sdk/models/shared";

const sdk = new SDK();

sdk.contextID.evaluateRules({
  evaluateRulesInput: {
    object: {
      "enim": "omnis",
      "nemo": "minima",
      "excepturi": "accusantium",
      "iure": "culpa",
    },
    overrideCode: "doloribus",
    overrideRules: [
      {
        action: "architecto",
        description: "mollitia",
        expression: {
          and: {
            expression: [
              {
                and: {},
              },
              {
                condition: {
                  base: {
                    ref: {
                      dst: "occaecati",
                      src: "numquam",
                    },
                  },
                  parameter: false,
                  type: ConditionTypeEnum.Npx,
                },
              },
              {
                or: {},
              },
            ],
          },
        },
        id: "39251aa5-2c3f-45ad-819d-a1ffe78f097b",
        target: {
          target: "perferendis",
          targetValue: "doloremque",
          type: "reprehenderit",
        },
      },
      {
        action: "ut",
        description: "maiores",
        expression: {
          and: {
            expression: [
              {
                and: {},
              },
              {
                or: {},
              },
            ],
          },
        },
        id: "1b5e6e13-b99d-4488-a1e9-1e450ad2abd4",
        target: {
          target: "modi",
          targetValue: "qui",
          type: "aliquid",
        },
      },
      {
        action: "cupiditate",
        description: "quos",
        expression: {
          and: {
            expression: [
              {
                condition: {
                  base: {
                    key: "alias",
                  },
                  parameter: "dolorum",
                  type: ConditionTypeEnum.Sx,
                },
              },
            ],
          },
        },
        id: "4bb4f63c-969e-49a3-afa7-7dfb14cd66ae",
        target: {
          target: "non",
          targetValue: "occaecati",
          type: "enim",
        },
      },
      {
        action: "accusamus",
        description: "delectus",
        expression: {
          condition: {
            base: {
              ref: {
                dst: "nam",
                src: "id",
              },
            },
            parameter: false,
            type: ConditionTypeEnum.Sx,
          },
        },
        id: "f3a66997-074b-4a44-a9b6-e2141959890a",
        target: {
          target: "reiciendis",
          targetValue: "mollitia",
          type: "ad",
        },
      },
    ],
  },
  contextID: "eum",
}, {
  apiToken: "YOUR_BEARER_TOKEN_HERE",
}).then((res: EvaluateRulesResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## getAllRules

Returns all rules with the context

### Example Usage

```typescript
import { SDK } from "brease-sdk";
import { GetAllRulesResponse } from "brease-sdk/dist/sdk/models/operations";

const sdk = new SDK();

sdk.contextID.getAllRules({
  contextID: "dolor",
}, {
  apiToken: "YOUR_BEARER_TOKEN_HERE",
}).then((res: GetAllRulesResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## removeRule

Removes a rule from the context

### Example Usage

```typescript
import { SDK } from "brease-sdk";
import { RemoveRuleResponse } from "brease-sdk/dist/sdk/models/operations";

const sdk = new SDK();

sdk.contextID.removeRule({
  contextID: "necessitatibus",
  id: "2516fe4c-8b71-41e5-b7fd-2ed028921cdd",
}, {
  apiToken: "YOUR_BEARER_TOKEN_HERE",
}).then((res: RemoveRuleResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## replaceRule

Replaces an existing rule within the context

### Example Usage

```typescript
import { SDK } from "brease-sdk";
import { ReplaceRuleResponse } from "brease-sdk/dist/sdk/models/operations";
import { ConditionTypeEnum } from "brease-sdk/dist/sdk/models/shared";

const sdk = new SDK();

sdk.contextID.replaceRule({
  replaceRuleInput: {
    rule: {
      action: "maxime",
      description: "ea",
      expression: {
        or: {
          expression: [
            {
              or: {},
            },
          ],
        },
      },
      id: "01fb576b-0d5f-40d3-8c5f-bb2587053202",
      target: {
        target: "minus",
        targetValue: "quam",
        type: "dolor",
      },
    },
  },
  contextID: "vero",
  id: "5fe9b90c-2890-49b3-be49-a8d9cbf48633",
}, {
  apiToken: "YOUR_BEARER_TOKEN_HERE",
}).then((res: ReplaceRuleResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```
