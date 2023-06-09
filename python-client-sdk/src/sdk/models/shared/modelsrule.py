"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""

from __future__ import annotations
import dataclasses
from ..shared import condition as shared_condition
from ..shared import expressionarray as shared_expressionarray
from ..shared import modelstarget as shared_modelstarget
from dataclasses_json import Undefined, dataclass_json
from sdk import utils
from typing import Any, Optional


@dataclass_json(undefined=Undefined.EXCLUDE)

@dataclasses.dataclass
class ModelsRuleExpression3:
    condition: Optional[shared_condition.Condition] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('condition'), 'exclude': lambda f: f is None }})
    



@dataclass_json(undefined=Undefined.EXCLUDE)

@dataclasses.dataclass
class ModelsRuleExpression2:
    or_: Optional[shared_expressionarray.ExpressionArray] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('or'), 'exclude': lambda f: f is None }})
    



@dataclass_json(undefined=Undefined.EXCLUDE)

@dataclasses.dataclass
class ModelsRuleExpression1:
    and_: Optional[shared_expressionarray.ExpressionArray] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('and'), 'exclude': lambda f: f is None }})
    



@dataclass_json(undefined=Undefined.EXCLUDE)

@dataclasses.dataclass
class ModelsRule:
    action: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('action') }})
    expression: Any = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('expression') }})
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('id') }})
    target: shared_modelstarget.ModelsTarget = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('target') }})
    description: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('description'), 'exclude': lambda f: f is None }})
    

