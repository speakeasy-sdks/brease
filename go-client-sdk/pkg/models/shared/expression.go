// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package shared

import (
	"bytes"
	"encoding/json"
	"errors"
)

type Expression3 struct {
	Condition *Condition `json:"condition,omitempty"`
}

type Expression2 struct {
	Or *ExpressionArray `json:"or,omitempty"`
}

type Expression1 struct {
	And *ExpressionArray `json:"and,omitempty"`
}

type ExpressionType string

const (
	ExpressionTypeExpression1 ExpressionType = "Expression_1"
	ExpressionTypeExpression2 ExpressionType = "Expression_2"
	ExpressionTypeExpression3 ExpressionType = "Expression_3"
)

type Expression struct {
	Expression1 *Expression1
	Expression2 *Expression2
	Expression3 *Expression3

	Type ExpressionType
}

func CreateExpressionExpression1(expression1 Expression1) Expression {
	typ := ExpressionTypeExpression1

	return Expression{
		Expression1: &expression1,
		Type:        typ,
	}
}

func CreateExpressionExpression2(expression2 Expression2) Expression {
	typ := ExpressionTypeExpression2

	return Expression{
		Expression2: &expression2,
		Type:        typ,
	}
}

func CreateExpressionExpression3(expression3 Expression3) Expression {
	typ := ExpressionTypeExpression3

	return Expression{
		Expression3: &expression3,
		Type:        typ,
	}
}

func (u *Expression) UnmarshalJSON(data []byte) error {
	var d *json.Decoder

	expression1 := new(Expression1)
	d = json.NewDecoder(bytes.NewReader(data))
	d.DisallowUnknownFields()
	if err := d.Decode(&expression1); err == nil {
		u.Expression1 = expression1
		u.Type = ExpressionTypeExpression1
		return nil
	}

	expression2 := new(Expression2)
	d = json.NewDecoder(bytes.NewReader(data))
	d.DisallowUnknownFields()
	if err := d.Decode(&expression2); err == nil {
		u.Expression2 = expression2
		u.Type = ExpressionTypeExpression2
		return nil
	}

	expression3 := new(Expression3)
	d = json.NewDecoder(bytes.NewReader(data))
	d.DisallowUnknownFields()
	if err := d.Decode(&expression3); err == nil {
		u.Expression3 = expression3
		u.Type = ExpressionTypeExpression3
		return nil
	}

	return errors.New("could not unmarshal into supported union types")
}

func (u Expression) MarshalJSON() ([]byte, error) {
	if u.Expression1 != nil {
		return json.Marshal(u.Expression1)
	}

	if u.Expression2 != nil {
		return json.Marshal(u.Expression2)
	}

	if u.Expression3 != nil {
		return json.Marshal(u.Expression3)
	}

	return nil, nil
}

type Expression5 struct {
	Or *ExpressionArray `json:"or,omitempty"`
}

type Expression4 struct {
	And *ExpressionArray `json:"and,omitempty"`
}
