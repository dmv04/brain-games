plugins {
    id ("application")
    id("checkstyle")
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"


application {
    mainClass = "io.github.dmv04.App"
}

repositories {
    mavenCentral()
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

