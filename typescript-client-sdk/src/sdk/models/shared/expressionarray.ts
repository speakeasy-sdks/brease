/*
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Condition } from "./condition";
import { Expose, Type } from "class-transformer";

export class ExpressionArrayExpression3 extends SpeakeasyBase {
  @SpeakeasyMetadata()
  @Expose({ name: "condition" })
  @Type(() => Condition)
  condition?: Condition;
}

export class ExpressionArrayExpression2 extends SpeakeasyBase {
  @SpeakeasyMetadata()
  @Expose({ name: "or" })
  @Type(() => ExpressionArray)
  or?: ExpressionArray;
}

export class ExpressionArrayExpression1 extends SpeakeasyBase {
  @SpeakeasyMetadata()
  @Expose({ name: "and" })
  @Type(() => ExpressionArray)
  and?: ExpressionArray;
}

export class ExpressionArray extends SpeakeasyBase {
  @SpeakeasyMetadata()
  @Expose({ name: "expression" })
  expression?: any[];
}
