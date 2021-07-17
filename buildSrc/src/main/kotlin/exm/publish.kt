package exm

import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import java.net.URI

//////////////////////////////////////////////////
fun MavenPublication.setPomPersonal(
  mGroupId: String,
  mArtifactId: String,
  mLibVersion: String,
  mLibName: String,
  mLibDescription: String,
  mLibUrl: String,
  mLicenseName: String,
  mLicenseUrl: String,
  mDevId: String
) {
  groupId = mGroupId
  artifactId = mArtifactId
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

fun PublishingExtension.setMvnRepository(uri: URI) {
  repositories {
    maven {
      url = uri
    }
  }
}

//////////////////////////////////////////////////
