#include <jni.h>
#include <string>
#include "Calculator.h"

extern "C" JNIEXPORT jdouble

JNICALL
Java_com_killi8n_sumwithndk_MainActivity_sum(
        JNIEnv *env,
        jobject /* this */,
        double num1, double num2) {
    Calculator calculator(num1, num2);
    return calculator.sum(num1, num2);
}

extern "C" JNIEXPORT jdouble

JNICALL
Java_com_killi8n_sumwithndk_MainActivity_sub(
        JNIEnv *env,
        jobject /* this */,
        double num1, double num2) {
    Calculator calculator(num1, num2);
    return calculator.sub(num1, num2);
}

extern "C" JNIEXPORT jdouble

JNICALL
Java_com_killi8n_sumwithndk_MainActivity_mul(
        JNIEnv *env,
        jobject /* this */,
        double num1, double num2) {
    Calculator calculator(num1, num2);
    return calculator.mul(num1, num2);
}

extern "C" JNIEXPORT jdouble

JNICALL
Java_com_killi8n_sumwithndk_MainActivity_div(
        JNIEnv *env,
        jobject /* this */,
        double num1, double num2) {
    Calculator calculator(num1, num2);
    return calculator.div(num1, num2);
}

