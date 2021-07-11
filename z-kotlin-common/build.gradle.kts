apply(from = "publish.gradle.kts")

plugins {
  id("kotlin-platform-common")
}

group = "cn.renaldrive"
version = "29.7.7"

sourceSets{
  main{
    resources.srcDir("zresDir")
  }
}

kotlin{
  sourceSets{
    main{
      kotlin.srcDir("srcDir")
    }
    test{
      kotlin.srcDir("testDir")
    }
  }
}

dependencies {
  implementation("org.jetbrains.kotlin:kotlin-stdlib-common:1.5.0")
//  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.0")
}
