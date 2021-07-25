apply(from = "publish.gradle.kts")

plugins {
  kotlin("multiplatform")
//  id("com.android.library")
//  id("kotlin-parcelize")
}

kotlin {
  
  metadata {
    compilations.all {
      kotlinOptions {
        //开启"expect"关键字。
        freeCompilerArgs += "-Xopt-in=kotlin.RequiresOptIn"
      }
    }
  }
  /**
   * 方法：fun jvm(name: String = "jvm")
   * 1、他就是目录：jvmMain。
   */
  jvm {
    compilations.all {
      kotlinOptions.jvmTarget = "1.8"
    }
    testRuns["test"].executionTask.configure {
      useJUnit()
    }
  }
  
  /**
   * 给各个模块添加依赖。
   */
  sourceSets {
    named("commonMain") {
      dependencies {
        implementation(Deps.Kotlin.stdlib)
        implementation(Deps.Kotlinx.coroutinesCore)
        implementation(Deps.Kotlinx.serializationJson)
        
        //        implementation(project(":lib-"))
      }
    }
    named("commonTest") {
      dependencies {
        implementation(Deps.KotlinTest.junit)
      }
    }
    named("jvmMain"){
    
    }
    named("jvmTest"){
    
    }
    //==================================================
    /**
     * 等效于这些方法：
     * val commonMain by getting
     * val commonTest by getting
     * val jvmMain by getting
     */
  }
  
}
//////////////////////////////////////////////////
//kotlin{
//  android{
////    publishAllLibraryVariants()
//    publishLibraryVariants("release", "debug")
//  }
//}
//android {
//  compileSdkVersion(29)
//  sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
//  defaultConfig {
//    minSdkVersion(24)
//    targetSdkVersion(29)
//  }
//}