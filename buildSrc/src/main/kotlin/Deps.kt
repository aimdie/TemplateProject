object Deps {
  object Kotlin {
    val stdlib =
      "org.jetbrains.kotlin:kotlin-stdlib:+"
  }
  
  object Kotlinx {
    /**
     * 自动导入"serializationCore"。
     */
    val serializationJson =
      "org.jetbrains.kotlinx:kotlinx-serialization-json:+"
    val coroutinesCore =
      "org.jetbrains.kotlinx:kotlinx-coroutines-core:+"
  }
  
  object KotlinTest {
    
    /**
     * 导入后可调试。
     */
    val junit =
      "org.jetbrains.kotlin:kotlin-test-junit:+"
  }
  
  object Test {
    val junit =
      "junit:junit:+"
  }
  
  //////////////////////////////////////////////////
  object Minor {
    val utilKlib = "org.jetbrains.kotlin:kotlin-util-klib:+"
    val utilIo = "org.jetbrains.kotlin:kotlin-util-io:+"
    val serializationRuntime = "org.jetbrains.kotlinx:kotlinx-serialization-runtime:+"
    val serializationProtobuf = "org.jetbrains.kotlinx:kotlinx-serialization-protobuf:+"
  }
}
