pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Kotlin_Conceptos_Basicos"
include(":app")
include(":Lesson1")
include(":Actividad_Lesson1")
include(":Lesson2")
include(":Actividad_Lesson2")
include(":Lesson3")
include(":Actividad_Lesson3")
include(":1er_Examen")
