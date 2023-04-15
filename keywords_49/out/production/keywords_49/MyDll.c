#include <jni.h>
#include <stdio.h>
#include "MyDll.h"

JNIEXPORT void JNICALL Java_MyJNI_sayHello(JNIEnv *env, jobject thisObj)
{
	printf("Hello to Java World from C! \n"); 
	return; 
} 	
