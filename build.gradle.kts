plugins {
    java
}

group = "com.ob11to"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

println("configuration phase")
println("gradle id: ${gradle.hashCode()}")
println("root: ${rootProject.hashCode()}, ${project.hashCode()}, ${gradle.rootProject.hashCode()}")