// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"brease/pkg/models/shared"
	"net/http"
)

type ReplaceRuleSecurity struct {
	APIToken string `security:"scheme,type=http,subtype=bearer,name=Authorization"`
}

type ReplaceRuleRequest struct {
	ReplaceRuleInput *shared.ReplaceRuleInput `request:"mediaType=application/json"`
	ContextID        string                   `pathParam:"style=simple,explode=false,name=contextID"`
	ID               string                   `pathParam:"style=simple,explode=false,name=id"`
}

type ReplaceRuleResponse struct {
	// OK
	APIReplaceRuleResponse *shared.APIReplaceRuleResponse
	ContentType            string
	StatusCode             int
	RawResponse            *http.Response
}
