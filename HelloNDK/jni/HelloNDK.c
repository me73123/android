#include <jni.h>
#include <string.h>
#include "com_example_hellondk_MainActivity.h"

JNIEXPORT jstring Java_com_example_hellondk_MainActivity_helloString(JNIEnv *env, jobject thiz){
	return (*env)->NewStringUTF(env, "Hello from JNI!");
}

JNIEXPORT jint JNICALL Java_com_example_hellondk_MainActivity_plus
(JNIEnv *env, jobject thiz, jint a, jint b){
	jint total = 0;
	total = a + b;
	return total;
}

JNIEXPORT jint JNICALL Java_com_example_hellondk_MainActivity_multiply
  (JNIEnv *env, jobject thiz, jint a, jint b){
	jint total = 0;
	total = a * b;
	return total;
}

JNIEXPORT jint JNICALL Java_com_example_hellondk_MainActivity_Except
  (JNIEnv *env, jobject thiz, jint a, jint b){
	jint total = 0;
	total = a / b;
	return total;
}
