package exm

import org.gradle.api.Project
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.kotlin.dsl.get

/**
 * @作者 做就行了！
 * @时间 2021/7/8 23:47
 * @该类描述： -
 * @使用说明： -
 */
/**
 * src目录的所有类，作为库。
 */
fun Project.addLibKotlin(publication: MavenPublication) {
  publication.from(components["kotlin"])
}
