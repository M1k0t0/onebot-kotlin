plugins {
    java
    kotlin("jvm") version "1.5.30"
    kotlin("plugin.serialization") version "1.5.30"
    kotlin("kapt") version "1.5.30"
    id("com.github.johnrengelman.shadow") version "6.0.0"
    id("com.github.gmazzo.buildconfig") version "2.0.2"
}

allprojects {
    group = "com.github.yyuueexxiinngg"
    version = Versions.projectVersion

    repositories {
        maven(url = "https://mirrors.huaweicloud.com/repository/maven")
        maven(url = "https://dl.bintray.com/kotlin/kotlin-eap")
        gradlePluginPortal()
        jcenter()
        mavenCentral()
    }
}
