

//rootProject.name = ""
include(":z_common")
include(":z_module")

//gradle.beforeProject {
//  loadLocalProperties()
//  extra.set("signing.keyId",System.getenv("SIGN_ID"))
//  extra.set("signing.password",System.getenv("SIGN_PASSWORD"))
//  extra.set("signing.secretKeyRingFile",System.getenv("SIGN_FILE"))
//}
//fun Project.loadLocalProperties() {
//  val localPropertiesFile: File = rootDir.resolve("local.properties")
//  if (localPropertiesFile.exists()) {
//    val localProperties = java.util.Properties()
//    localProperties.load(localPropertiesFile.inputStream())
//    localProperties.forEach { (k, v) -> if (k is String) project.extra.set(k, v) }
//  }
//}

