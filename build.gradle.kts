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
    modRuntimeOnly("net.fabricmc:fabric-loader:0.16.10")
}

tasks.test {
    useJUnitPlatform()
}