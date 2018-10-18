//
// Created by killi8n on 18/10/2018.
//

#include "Calculator.h"

Calculator::Calculator(double num1, double num2) {
    Calculator::num1 = num1;
    Calculator::num2 = num2;
}

double Calculator::sum(double num1, double num2) {

    return num1 + num2;
}

double Calculator::sub(double num1, double num2) {
    return num1 - num2;
}

double Calculator::mul(double num1, double num2) {

    return num1 * num2;

}

double Calculator::div(double num1, double num2) {

    return num1 / num2;
}