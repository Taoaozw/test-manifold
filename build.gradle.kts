plugins {
    id("java")
    id("maven-publish")
}


allprojects {
    group = "org.example"
    version = "1.0-SNAPSHOT"
}

subprojects {
    apply(plugin = "java")
    apply(plugin ="maven-publish")

    repositories {
        mavenLocal()
        mavenCentral()
    }

    dependencies {
        // https://mvnrepository.com/artifact/systems.manifold/manifold-ext-rt
        implementation("systems.manifold:manifold-ext-rt:2023.1.3")
        compileOnly("systems.manifold:manifold:2023.1.3")
        compileOnly("systems.manifold:manifold-ext:2023.1.3")
        compileOnly("systems.manifold:manifold-props:2023.1.3")
        compileOnly("systems.manifold:manifold-strings:2023.1.3")
        annotationProcessor("systems.manifold:manifold-ext:2023.1.3")
        testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
        testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
    }

    tasks {
        test {
            useJUnitPlatform()
        }

        compileJava {
            options.compilerArgs.add("-Xplugin:Manifold")
        }
    }

    //publish to maven local
    publishing {
        publications {
            create<MavenPublication>("mavenJava") {
                from(components["java"])
            }
        }
    }

}