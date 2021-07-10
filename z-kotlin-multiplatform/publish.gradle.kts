import exm.getArtifactNameSuffix

val mGroupId = "kill.vanity"
val mDevId = "aimdie"
val mLicenseName = "The Apache License, Version 2.0"
val mLicenseUrl = "http://www.apache.org/licenses/LICENSE-2.0.txt"

val mArtifactId = "lib-test"
val mLibVersion = "29.7.7"
val mLibName = "Lib Test"
val mLibDescription = "该库为测试用"
val mLibUrl = "无libUrl"
val mMvnUrl = ""
/**
 * 如果不加afterEvaluate，那么jvm中的配置会作为最终配置。
 * <pre><code>
 *  jvm{
 *    mavenPublication{
 *      artifactId = "jvmArtifactIdTest"
 *    }
 *    compilations.all {
 *      kotlinOptions.jvmTarget = "1.8"
 *    }
 *    testRuns["test"].executionTask.configure {
 *      useJUnit()
 *    }
 *  }
 * </code></pre>
 */
afterEvaluate {
  
  extra.set("signing.keyId", System.getenv("SIGN_ID"))
  extra.set("signing.password", System.getenv("SIGN_PASSWORD"))
  extra.set("signing.secretKeyRingFile", System.getenv("SIGN_FILE"))
  
  plugins.apply("signing")
  plugins.apply("maven-publish")
  extensions.configure<PublishingExtension>("publishing") {
    publications.withType<MavenPublication>().configureEach {
      println("name=${name}")
      groupId = mGroupId
      artifactId = mArtifactId + getArtifactNameSuffix(name)
      println("artifactId=${artifactId}")
      pom {
        version = mLibVersion
        name.set(mLibName)
        description.set(mLibDescription)
        url.set(mLibUrl)
        licenses {
          license {
            name.set(mLicenseName)
            url.set(mLicenseUrl)
          }
        }
        
        developers {
          developer {
            id.set(mDevId)
          }
        }
      }
    }
    repositories {
      maven {
        url = uri(mMvnUrl)
      }
    }
    val signing: SigningExtension = extensions.getByName<SigningExtension>("signing")
    signing.sign(publications)
  }
  
}
//val mArtifactId = ""
//val mLibVersion = ""
//val mLibName = ""
//val mLibDescription = ""
//val mLibUrl = ""
//val mMvnUrl = ""