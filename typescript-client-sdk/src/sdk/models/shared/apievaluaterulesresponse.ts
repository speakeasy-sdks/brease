/*
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { ApiEvaluationResult } from "./apievaluationresult";
import { Expose, Type } from "class-transformer";

/**
 * OK
 */
export class ApiEvaluateRulesResponse extends SpeakeasyBase {
  @SpeakeasyMetadata({ elemType: ApiEvaluationResult })
  @Expose({ name: "results" })
  @Type(() => ApiEvaluationResult)
  results?: ApiEvaluationResult[];
}
