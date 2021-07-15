apply(from = "publish.gradle.kts")

plugins {
  kotlin("multiplatform")
  id("com.android.library")
  id("kotlin-parcelize")
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
  android{
//    publishAllLibraryVariants()
    publishLibraryVariants("release", "debug")
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
//        api("org.jetbrains.kotlin:kotlin-stdlib-common:${Versions.kotlinVersion}")
//        api("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.0")
      }
    }
    named("commonTest") {
      dependencies {
//        implementation(kotlin("test-junit"))
      }
    }
    named("jvmMain")
    named("jvmTest")
    //==================================================
    /**
     * 等效于这些方法：
     * val commonMain by getting
     * val commonTest by getting
     * val jvmMain by getting
     */
  }
}

android {
  compileSdkVersion(29)
  sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
  defaultConfig {
    minSdkVersion(24)
    targetSdkVersion(29)
  }
}