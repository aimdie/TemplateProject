package type.kmp

import org.gradle.api.Project
import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.kotlin.dsl.create
import org.gradle.kotlin.dsl.getByName
import org.gradle.kotlin.dsl.withType
import org.gradle.plugins.signing.SigningExtension
import type.kmp.util.getArtifactNameSuffix
import util.getVersionMe

//////////////////////////////////////////////////
const val mGroupId = "cn.ace"
const val mDevId = "aimdie"
const val mLicenseName = "The Apache License, Version 2.0"
const val mLicenseUrl = "http://www.apache.org/licenses/LICENSE-2.0.txt"

/**
 * 配置发布的各项信息。
 * @receiver Project
 * @param mLibVersion String 库的版本。
 */
fun Project.configPublishPlan1(
  mLibVersion: String = getVersionMe()
) {
  val projectName = name
  plugins.apply("signing")
  plugins.apply("maven-publish")
  extensions.configure<PublishingExtension>("publishing") {
    publications.withType<MavenPublication>().configureEach {
      groupId = mGroupId
      artifactId = projectName + getArtifactNameSuffix(name)
      println("name=${name}")
      println("artifactId=${artifactId}")
      pom {
        version = mLibVersion
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
    val signing: SigningExtension = extensions.getByName<SigningExtension>("signing")
    signing.sign(publications)
  }
}
//////////////////////////////////////////////////
