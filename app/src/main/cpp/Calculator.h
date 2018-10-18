//
// Created by killi8n on 18/10/2018.
//

#ifndef SUMWITHNDK_CALCULATOR_H
#define SUMWITHNDK_CALCULATOR_H


class Calculator {
    double num1, num2;

public:
    Calculator(double num1, double num2);

    double sum(double num1, double num2);
    double sub(double num1, double num2);
    double mul(double num1, double num2);
    double div(double num1, double num2);

};


#endif //SUMWITHNDK_CALCULATOR_H
