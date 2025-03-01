plugins {
    id("fabric-loom") version "1.9.2"
    id("maven-publish")
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://maven.fabricmc.net/")
}

dependencies {
    minecraft("com.mojang:minecraft:1.21.1")
    mappings("net.fabricmc:yarn:1.21.1+build.3:v2")
    modImplementation("net.fabricmc.fabric-api:fabric-api:0.115.1+1.21.1")
    modImplementation("net.fabricmc.fabric-api:fabric-lifecycle-events-v1:2.5.0+01d9a51c19")
    modImplementation("net.fabricmc.fabric-api:fabric-command-api-v1:1.2.49+f71b366f19")
    modImplementation("net.fabricmc.fabric-api:fabric-rendering-v1:5.0.5+df16efd019")
    modRuntimeOnly("net.fabricmc:fabric-loader:0.15.11")
}


tasks.test {
    useJUnitPlatform()
}