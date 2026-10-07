pluginManagement {
    repositories {
        gradlePluginPortal()
        maven {
            name = "Su5eD"
            url = uri("https://maven.su5ed.dev/releases")
        }
    }

    plugins {
        id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
    }
}

rootProject.name = "connector"

include("transformer")
dependencyResolutionManagement {
    repositories {
        // TEMPORARY: lokaler 26.2-Maven-Mirror (vor PR wieder entfernen!)
        maven { url = uri("https://thisismartin321.github.io/sinytra-26.2-maven/") }
    }
}
