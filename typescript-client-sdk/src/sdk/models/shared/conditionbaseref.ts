/*
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Expose } from "class-transformer";

export class ConditionBaseRef extends SpeakeasyBase {
  @SpeakeasyMetadata()
  @Expose({ name: "dst" })
  dst?: string;

  @SpeakeasyMetadata()
  @Expose({ name: "src" })
  src?: string;
}