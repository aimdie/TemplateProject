package util

import org.gradle.api.Project
import org.gradle.api.publish.PublicationContainer
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.kotlin.dsl.extra
import org.gradle.kotlin.dsl.getByName
import org.gradle.plugins.signing.SigningExtension

/**
 * @作者 做就行了！
 * @时间 2021/7/8 23:44
 * @该类描述： -
 * @使用说明： -
 */
/**
 * 签名类。
 */
val Project.signing: SigningExtension
  get() = extensions.getByName<SigningExtension>("signing")

/**
 * 签名发布。
 */
fun Project.sign(pc: PublicationContainer) {
  signing.sign(pc)
}

/**
 * 签名发布。
 */
fun Project.sign(mavenPublication: MavenPublication) {
  signing.sign(mavenPublication)
}

/**
 * 应用签名参数。
 *
 * 1、格式：
 * ·SIGN_FILE：F:/ModuleProject/wang_0x12345678_SECRET.gpg
 * ·SIGN_ID：12345678
 * ·SIGN_PASSWORD：woshimima
 */
fun Project.applySignParamPlan1() {
  extra.set("signing.keyId", System.getenv("SIGN_ID"))
  extra.set("signing.password", System.getenv("SIGN_PASSWORD"))
  extra.set("signing.secretKeyRingFile", System.getenv("SIGN_FILE"))
}