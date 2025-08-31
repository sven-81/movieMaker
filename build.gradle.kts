plugins {
    kotlin("jvm") version "2.0.0"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.google.code.gson:gson:2.11.0") // for json debug view
}

sourceSets {
    main {
        kotlin.srcDir("src")
    }
}

application {
    mainClass.set("de.moviemaker.MainKt")
}
