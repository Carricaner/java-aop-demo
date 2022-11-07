plugins {
    id("java")
    // AspectJ
    id("io.freefair.aspectj.post-compile-weaving") version "6.5.1"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")

    // Enable Spring Aspect with AspectJ
    implementation("org.aspectj:aspectjrt:1.9.9.1")
    runtimeOnly("org.aspectj:aspectjweaver:1.9.9.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}