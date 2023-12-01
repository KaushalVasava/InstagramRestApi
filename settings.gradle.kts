pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        maven("https://us-central1-maven.pkg.dev/varabyte-repos/public")
    }
    plugins {
        id("org.jetbrains.kotlin.plugin.serialization") version "1.9.21" apply false
    }
}

rootProject.name = "InstagramRestAPI"

include(":site")
