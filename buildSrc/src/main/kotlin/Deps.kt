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
  
  //////////////////////////////////////////////////
  object Minor {
    val utilKlib = "org.jetbrains.kotlin:kotlin-util-klib:+"
    val utilIo = "org.jetbrains.kotlin:kotlin-util-io:+"
    val serializationRuntime = "org.jetbrains.kotlinx:kotlinx-serialization-runtime:+"
    val serializationProtobuf = "org.jetbrains.kotlinx:kotlinx-serialization-protobuf:+"
    
    /**
     * 导入任何“serialization”后，自动导入该模块。
     */
    val serializationCore = "org.jetbrains.kotlinx:kotlinx-serialization-core:+"
    
    /**
     * 能引用，但是导入后看不见库。
     */
    val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines:+"
    val stdlib =
      "org.jetbrains.kotlin:kotlin-stdlib-common:+"
    val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core-common:+"
  }
}