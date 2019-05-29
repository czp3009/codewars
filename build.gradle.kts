import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.31"
}

allprojects {
    group = "com.hiczp"
    version = "1.0"

    repositories {
        mavenCentral()
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions.jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
}

subprojects {
    apply(plugin = "kotlin")

    dependencies {
        implementation(kotlin("stdlib-jdk8"))
    }

    dependencies {
        testImplementation(kotlin("test"))
        testImplementation("junit:junit:4.12")
    }
}
