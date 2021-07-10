object Deps {
  object Kotlin {
    val testCommon = "org.jetbrains.kotlin:kotlin-test-common:${Versions.kotlinVersion}"
    val testAnnotationsCommon =
      "org.jetbrains.kotlin:kotlin-test-annotations-common:${Versions.kotlinVersion}"
    val testJvm = "org.jetbrains.kotlin:kotlin-test:${Versions.kotlinVersion}"
    val testJvmJunit = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlinVersion}"
  }
  object Test {
    val junit = "junit:junit:${Versions.junit}"
    val kotlinTest = "org.jetbrains.kotlin:kotlin-test:${Versions.kotlinVersion}"
    val kotlinJunit = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlinVersion}"
  }
}