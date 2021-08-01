buildscript {
  repositories {
    maven("https://maven.aliyun.com/repository/gradle-plugin")
  
    gradlePluginPortal()
    jcenter()
    google()
    mavenCentral()
  }
  dependencies {
    val kotlinVersion = "1.5.20"
    classpath(kotlin("serialization", version = kotlinVersion))
    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.10")
  
    classpath("com.android.tools.build:gradle:4.0.1")
  }
}

allprojects {
  repositories {
    //jetpack包。
    maven { url = uri("https://maven.pkg.jetbrains.space/public/p/compose/dev") }
    maven("https://www.jetbrains.com/intellij-repository/releases")
    maven("https://repo.huaweicloud.com/repository/maven/")
    google()
    jcenter()
    mavenCentral()
    mavenLocal()
  }
}