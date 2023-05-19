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

```java
package hello.world;

import industries.dot.brease.SDK;
import industries.dot.brease.models.operations.AddRuleRequest;
import industries.dot.brease.models.operations.AddRuleResponse;
import industries.dot.brease.models.operations.AddRuleSecurity;
import industries.dot.brease.models.shared.AddRuleInput;
import industries.dot.brease.models.shared.Condition;
import industries.dot.brease.models.shared.ConditionBase2;
import industries.dot.brease.models.shared.ConditionBaseKey;
import industries.dot.brease.models.shared.ConditionBaseRef;
import industries.dot.brease.models.shared.ConditionType;
import industries.dot.brease.models.shared.ExpressionArray;
import industries.dot.brease.models.shared.ExpressionArrayExpression1;
import industries.dot.brease.models.shared.ExpressionArrayExpression2;
import industries.dot.brease.models.shared.ExpressionArrayExpression3;
import industries.dot.brease.models.shared.ModelsRule;
import industries.dot.brease.models.shared.ModelsRuleExpression1;
import industries.dot.brease.models.shared.ModelsRuleExpression2;
import industries.dot.brease.models.shared.ModelsRuleExpression3;
import industries.dot.brease.models.shared.ModelsTarget;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            AddRuleRequest req = new AddRuleRequest("debitis") {{
                addRuleInput = new AddRuleInput() {{
                    rule = new ModelsRule("ipsa",                 new ModelsRuleExpression3() {{
                                        condition = new Condition() {{
                                            base = new ConditionBaseKey() {{
                                                key = "suscipit";
                                            }};
                                            parameter = false;
                                            type = ConditionType.NIN;
                                        }};
                                    }}, "placeat",                 new ModelsTarget("voluptatum", "iusto") {{
                                        targetValue = "excepturi";
                                    }};) {{
                        description = "nisi";
                    }};;
                }};;
            }};            

            AddRuleResponse res = sdk.contextID.addRule(req, new AddRuleSecurity("recusandae") {{
                apiToken = "YOUR_BEARER_TOKEN_HERE";
            }});

            if (res.apiAddRuleResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## evaluateRules

Evaluate rules within a context on the provided object

### Example Usage

```java
package hello.world;

import industries.dot.brease.SDK;
import industries.dot.brease.models.operations.EvaluateRulesRequest;
import industries.dot.brease.models.operations.EvaluateRulesResponse;
import industries.dot.brease.models.operations.EvaluateRulesSecurity;
import industries.dot.brease.models.shared.Condition;
import industries.dot.brease.models.shared.ConditionBase2;
import industries.dot.brease.models.shared.ConditionBaseKey;
import industries.dot.brease.models.shared.ConditionBaseRef;
import industries.dot.brease.models.shared.ConditionType;
import industries.dot.brease.models.shared.EvaluateRulesInput;
import industries.dot.brease.models.shared.ExpressionArray;
import industries.dot.brease.models.shared.ExpressionArrayExpression1;
import industries.dot.brease.models.shared.ExpressionArrayExpression2;
import industries.dot.brease.models.shared.ExpressionArrayExpression3;
import industries.dot.brease.models.shared.ModelsRule;
import industries.dot.brease.models.shared.ModelsRuleExpression1;
import industries.dot.brease.models.shared.ModelsRuleExpression2;
import industries.dot.brease.models.shared.ModelsRuleExpression3;
import industries.dot.brease.models.shared.ModelsTarget;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            EvaluateRulesRequest req = new EvaluateRulesRequest("temporibus") {{
                evaluateRulesInput = new EvaluateRulesInput(                new java.util.HashMap<String, Object>() {{
                                    put("quis", "veritatis");
                                }}) {{
                    overrideCode = "deserunt";
                    overrideRules = new industries.dot.brease.models.shared.ModelsRule[]{{
                        add(new ModelsRule("fuga",                 new ModelsRuleExpression2() {{
                                            or = new ExpressionArray() {{
                                                expression = new Object[]{{
                                                    add(new ExpressionArrayExpression2() {{
                                                        or = new ExpressionArray() {{}};
                                                    }}),
                                                    add(new ExpressionArrayExpression2() {{
                                                        or = new ExpressionArray() {{}};
                                                    }}),
                                                }};
                                            }};
                                        }}, "saepe",                 new ModelsTarget("quidem", "architecto") {{
                                            targetValue = "ipsa";
                                        }};) {{
                            action = "ipsam";
                            description = "repellendus";
                            expression = new ModelsRuleExpression3() {{
                                condition = new Condition() {{
                                    base = new ConditionBase2() {{
                                        ref = new ConditionBaseRef() {{
                                            dst = "odit";
                                            src = "at";
                                        }};
                                    }};
                                    parameter = 978619L;
                                    type = ConditionType.NPX;
                                }};
                            }};
                            id = "cc78ca1b-a928-4fc8-9674-2cb739205929";
                            target = new ModelsTarget("hic", "saepe") {{
                                target = "dolor";
                                targetValue = "natus";
                                type = "laboriosam";
                            }};
                        }}),
                    }};
                }};;
            }};            

            EvaluateRulesResponse res = sdk.contextID.evaluateRules(req, new EvaluateRulesSecurity("reiciendis") {{
                apiToken = "YOUR_BEARER_TOKEN_HERE";
            }});

            if (res.apiEvaluateRulesResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getAllRules

Returns all rules with the context

### Example Usage

```java
package hello.world;

import industries.dot.brease.SDK;
import industries.dot.brease.models.operations.GetAllRulesRequest;
import industries.dot.brease.models.operations.GetAllRulesResponse;
import industries.dot.brease.models.operations.GetAllRulesSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            GetAllRulesRequest req = new GetAllRulesRequest("est");            

            GetAllRulesResponse res = sdk.contextID.getAllRules(req, new GetAllRulesSecurity("mollitia") {{
                apiToken = "YOUR_BEARER_TOKEN_HERE";
            }});

            if (res.apiAllRulesResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## removeRule

Removes a rule from the context

### Example Usage

```java
package hello.world;

import industries.dot.brease.SDK;
import industries.dot.brease.models.operations.RemoveRuleRequest;
import industries.dot.brease.models.operations.RemoveRuleResponse;
import industries.dot.brease.models.operations.RemoveRuleSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            RemoveRuleRequest req = new RemoveRuleRequest("laborum", "dolores");            

            RemoveRuleResponse res = sdk.contextID.removeRule(req, new RemoveRuleSecurity("dolorem") {{
                apiToken = "YOUR_BEARER_TOKEN_HERE";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## replaceRule

Replaces an existing rule within the context

### Example Usage

```java
package hello.world;

import industries.dot.brease.SDK;
import industries.dot.brease.models.operations.ReplaceRuleRequest;
import industries.dot.brease.models.operations.ReplaceRuleResponse;
import industries.dot.brease.models.operations.ReplaceRuleSecurity;
import industries.dot.brease.models.shared.Condition;
import industries.dot.brease.models.shared.ConditionBase2;
import industries.dot.brease.models.shared.ConditionBaseKey;
import industries.dot.brease.models.shared.ConditionBaseRef;
import industries.dot.brease.models.shared.ConditionType;
import industries.dot.brease.models.shared.ExpressionArray;
import industries.dot.brease.models.shared.ExpressionArrayExpression1;
import industries.dot.brease.models.shared.ExpressionArrayExpression2;
import industries.dot.brease.models.shared.ExpressionArrayExpression3;
import industries.dot.brease.models.shared.ModelsRule;
import industries.dot.brease.models.shared.ModelsRuleExpression1;
import industries.dot.brease.models.shared.ModelsRuleExpression2;
import industries.dot.brease.models.shared.ModelsRuleExpression3;
import industries.dot.brease.models.shared.ModelsTarget;
import industries.dot.brease.models.shared.ReplaceRuleInput;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            ReplaceRuleRequest req = new ReplaceRuleRequest("corporis", "explicabo") {{
                replaceRuleInput = new ReplaceRuleInput(                new ModelsRule("nobis",                 new ModelsRuleExpression1() {{
                                                    and = new ExpressionArray() {{
                                                        expression = new Object[]{{
                                                            add(new ExpressionArrayExpression2() {{
                                                                or = new ExpressionArray() {{}};
                                                            }}),
                                                            add(new ExpressionArrayExpression1() {{
                                                                and = new ExpressionArray() {{}};
                                                            }}),
                                                            add(new ExpressionArrayExpression2() {{
                                                                or = new ExpressionArray() {{}};
                                                            }}),
                                                        }};
                                                    }};
                                                }}, "accusantium",                 new ModelsTarget("iure", "culpa") {{
                                                    targetValue = "doloribus";
                                                }};) {{
                                    description = "sapiente";
                                }};);;
            }};            

            ReplaceRuleResponse res = sdk.contextID.replaceRule(req, new ReplaceRuleSecurity("architecto") {{
                apiToken = "YOUR_BEARER_TOKEN_HERE";
            }});

            if (res.apiReplaceRuleResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
