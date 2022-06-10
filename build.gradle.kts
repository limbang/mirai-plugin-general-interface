plugins {
    kotlin("jvm") version "1.6.21"
    `maven-publish`
}

group = "top.limbang"
version = "0.0.1-SNAPSHOT"

repositories {
    maven("https://maven.aliyun.com/repository/public")
    mavenCentral()
}

dependencies {
    implementation("net.mamoe:mirai-core-api:2.11.1")
    testImplementation(kotlin("test"))
}

java {
    withJavadocJar()
    withSourcesJar()
}

publishing {
    repositories {
        maven {
            name = "OSSRH"
            val releasesRepoUrl = uri("https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/")
            val snapshotsRepoUrl = uri("https://s01.oss.sonatype.org/content/repositories/snapshots/")
            url = if (version.toString().endsWith("SNAPSHOT")) snapshotsRepoUrl else releasesRepoUrl
            credentials {
                username = System.getenv("MAVEN_USERNAME")
                password = System.getenv("MAVEN_PASSWORD")
            }
        }
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/limbang/mirai-plugin-general-interface")
            credentials {
                username = System.getenv("GITHUB_ACTOR")
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
    publications {
        create<MavenPublication>("gpr") {
            artifactId = "mirai-plugin-general-interface"
            from(components["java"])
            pom {
                licenses {
                    licenses {
                        name.set("GNU Affero General Public License v3.0")
                        url.set("https://choosealicense.com/licenses/agpl-3.0/")
                    }
                    developers {
                        developer {
                            name.set("limbang")
                            email.set("495071565@qq.com")
                        }
                    }
                    scm {
                        connection.set("git@github.com:limbang/mirai-plugin-general-interface.git")
                        url.set("https://github.com/limbang/mirai-plugin-general-interface")
                    }
                }
            }
        }
    }
}