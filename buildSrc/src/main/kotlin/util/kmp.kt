package util

fun getArtifactNameSuffix(artifactName: String): String {
  return when (artifactName) {
    "kotlinMultiplatform" -> ""
    "androidRelease" -> "-android"
    "androidDebug" -> "-android-debug"
    else -> "-$artifactName"
  }
}

fun getArtifactName(artifactName: String): String {
  return when (artifactName) {
    "kotlinMultiplatform" -> ""
    "androidRelease" -> "android"
    "androidDebug" -> "android-debug"
    else -> artifactName
  }
}