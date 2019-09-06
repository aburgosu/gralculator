package com.foundation.gui.gralculator;

public enum Operator {
    ADD("+"), SUB("-"), MULT("×"), DIV("÷");
    private String operator;

    Operator(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }
}