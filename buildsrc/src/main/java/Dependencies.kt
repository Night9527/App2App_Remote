
import Versions.archVersion
import Versions.arouterApiVersion
import Versions.arouterCompilerVersion
import Versions.autodisposeKotlinVersion
import Versions.glideVersion
import Versions.rxJava2Version
import Versions.rxbindingKotlinVersion
import Versions.supportLibVersion
import Versions.workVersion
import java.text.SimpleDateFormat
import java.util.*

object SysConfig {
    const val compileSdkVersion               = 28
    const val minSdkVersion                   = 21
    const val targetSdkVersion                = 28

    const val versionCode                     = 2
//    var versionName                           = "1.1.2"
    var versionName                           = "V1.1.0.${SimpleDateFormat("yyMMdd").format(Date())}"
}

object Versions {
    const val supportLibVersion               = "28.0.0-alpha1"
//    const val navigationVersion               = "1.0.0-alpha01"
//    const val roomVersion                     = "1.1.0"
//    const val pagingVersion                   = "1.0.0"

    const val arouterApiVersion               = "1.3.1"
    const val arouterCompilerVersion          = "1.1.4"

    const val workVersion                     = "1.0.0-alpha02"

    const val archVersion                     = "1.1.1"

    const val glideVersion                    = "4.7.1"
    const val rxbindingKotlinVersion          = "2.1.1"

    const val rxJava2Version                  = "2.1.4"

    const val autodisposeKotlinVersion        = "0.8.0"

}

object Deps {

    val ktx                             = "androidx.core:core-ktx:0.3"
    val anko                            = "org.jetbrains.anko:anko-commons:0.10.4"
    val kotlinStdlibJdk8                = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.2.51"

    val design                          = "com.android.support:design:$supportLibVersion"
    val supportV7                       = "com.android.support:appcompat-v7:$supportLibVersion"
    val supportV4                       = "com.android.support:appcompat-v4:$supportLibVersion"
    val constraintLayout                = "com.android.support.constraint:constraint-layout:1.1.0"

    val recyclerview                    = "com.android.support:recyclerview-v7:$supportLibVersion"
    val cardview                        = "com.android.support:cardview-v7:$supportLibVersion"

    val retrofit2                       = "com.squareup.retrofit2:retrofit:2.4.0"
    val retrofitAdapterGson             = "com.squareup.retrofit2:converter-gson:2.4.0"
    val loggingInterceptor              = "com.squareup.okhttp3:logging-interceptor:3.5.0"
    val retrofitAdapterRxJava2          = "com.squareup.retrofit2:adapter-rxjava2:2.4.0"

    val archExtensions                  = "android.arch.lifecycle:extensions:$archVersion"
    val archRuntime                     = "android.arch.lifecycle:runtime:$archVersion"
    val archCompiler                    = "android.arch.lifecycle:compiler:$archVersion"
    val archJava8                       = "android.arch.lifecycle:common-java8:$archVersion"

    val workRuntime                     = "android.arch.work:work-runtime:$workVersion"

    val dagger2                         = "com.google.dagger:dagger:2.15"
    val dagger2Compiler                 = "com.google.dagger:dagger-compiler:2.15"
    val dagger2Android                  = "com.google.dagger:dagger-android:2.15"
    val dagger2AndroidCompiler          = "com.google.dagger:dagger-android-processor:2.15"
    val dagger2AndroidSupport           = "com.google.dagger:dagger-android-support:2.15"

    val rxKotlin                        = "io.reactivex.rxjava2:rxkotlin:2.2.0"
    val rxAndroid2                      = "io.reactivex.rxjava2:rxandroid:2.0.2"
    val rxJava2                         = "io.reactivex.rxjava2:rxjava:$rxJava2Version"

    val glide                           = "com.github.bumptech.glide:glide:$glideVersion"
    val glideCompiler                   = "com.github.bumptech.glide:compiler:$glideVersion"

    val arouter                         = "com.alibaba:arouter-api:$arouterApiVersion"
    val arouterCompiler                 = "com.alibaba:arouter-compiler:$arouterCompilerVersion"

    val bugly                           = "com.tencent.bugly:crashreport_upgrade:latest.release"
    val buglyNativeCrash                = "com.tencent.bugly:nativecrashreport:latest.release"

    val permissionsDispatcher           = "com.github.hotchemi:permissionsdispatcher:3.2.0"
    val permissionsDispatcherProcessor  = "com.github.hotchemi:permissionsdispatcher-processor:3.2.0"

    val rxbindingKotlin                 = "com.jakewharton.rxbinding2:rxbinding-kotlin:$rxbindingKotlinVersion"
    val rxbindingRecyclerviewKotlin     = "com.jakewharton.rxbinding2:rxbinding-recyclerview-v7-kotlin:$rxbindingKotlinVersion"
    val rxbindingAppcompatKotlin        = "com.jakewharton.rxbinding2:rxbinding-appcompat-v7-kotlin:$rxbindingKotlinVersion"
    val rxbindingDesignKotlin           = "com.jakewharton.rxbinding2:rxbinding-design-kotlin:$rxbindingKotlinVersion"

    val autodisposeKotlin               = "com.uber.autodispose:autodispose-kotlin:$autodisposeKotlinVersion"
    val autodisposeAndroidKotlin        = "com.uber.autodispose:autodispose-android-kotlin:$autodisposeKotlinVersion"
    val autodisposeArchKotlin           = "com.uber.autodispose:autodispose-android-archcomponents-kotlin:$autodisposeKotlinVersion"

    val gson                            = "com.google.code.gson:gson:2.8"

}