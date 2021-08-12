package type.common

import org.gradle.api.Project
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.api.tasks.SourceSet
import org.gradle.api.tasks.SourceSetContainer
import org.gradle.api.tasks.TaskProvider
import org.gradle.api.tasks.bundling.Jar
import org.gradle.kotlin.dsl.getValue
import org.gradle.kotlin.dsl.provideDelegate
import org.gradle.kotlin.dsl.registering

/**
 * @作者 做就行了！
 * @时间 2021/7/8 23:45
 * @该类描述： -
 * @使用说明： -
 */

/**
 * 总源码。
 */
val Project.sourceSets: SourceSetContainer
  get() = extensions.getByName("sourceSets") as SourceSetContainer


/**
 * main目录的源码。
 */
val SourceSetContainer.main: SourceSet
  get() = getByName("main")

/**
 * 打包源码。
 */
fun Project.addSourceJar(mavenPublication: MavenPublication) {
  val sourceTask: TaskProvider<Jar>
    by tasks.registering(Jar::class) {
      archiveClassifier.set("source")
      from(sourceSets.main.allSource)
    }
  mavenPublication.artifact(sourceTask.get())
}