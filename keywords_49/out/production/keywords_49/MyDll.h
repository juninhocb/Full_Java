#include <jni.h>

#ifndef _Included_MyJNI
#define _Included_MyJNI
#ifdef __cplusplus
extern "C" {
#endif
	/*
	 *  * Class:     MyJNI
	 *   * Method:    sayHello
	 *    * Signature: ()V
	 *     */
	JNIEXPORT void JNICALL Java_MyJNI_sayHello(JNIEnv *, jobject);
	 
#ifdef __cplusplus
}
#endif
#endif
