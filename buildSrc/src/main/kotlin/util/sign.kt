package util

import org.gradle.api.Project
import org.gradle.api.publish.PublicationContainer
import org.gradle.api.publish.maven.MavenPublication
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