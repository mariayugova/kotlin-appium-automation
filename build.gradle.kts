plugins {
    val kotlinVersion = "1.6.20"

    application
    kotlin("jvm") version kotlinVersion
    java
}

dependencies {
    implementation("junit:junit:4.12")
    implementation("io.appium:java-client:4.1.2")
    testImplementation(kotlin("test"))
}

repositories {
    mavenCentral()
}

tasks.withType<Test> {
    useJUnit()
}
