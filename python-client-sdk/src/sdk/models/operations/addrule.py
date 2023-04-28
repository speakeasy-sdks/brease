"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""

from __future__ import annotations
import dataclasses
import requests as requests_http
from ..shared import addruleinput as shared_addruleinput
from ..shared import apiaddruleresponse as shared_apiaddruleresponse
from typing import Optional


@dataclasses.dataclass
class AddRuleSecurity:
    
    api_token: str = dataclasses.field(metadata={'security': { 'scheme': True, 'type': 'http', 'sub_type': 'bearer', 'field_name': 'Authorization' }})

    

@dataclasses.dataclass
class AddRuleRequest:
    
    context_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'contextID', 'style': 'simple', 'explode': False }})

    add_rule_input: Optional[shared_addruleinput.AddRuleInput] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})

    

@dataclasses.dataclass
class AddRuleResponse:
    
    content_type: str = dataclasses.field()

    status_code: int = dataclasses.field()

    api_add_rule_response: Optional[shared_apiaddruleresponse.APIAddRuleResponse] = dataclasses.field(default=None)

    r"""OK"""
    raw_response: Optional[requests_http.Response] = dataclasses.field(default=None)

    