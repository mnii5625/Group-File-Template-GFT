plugins {
    id ("org.jetbrains.intellij") version "0.7.2"
    java
    kotlin("jvm") version "1.5.0"
}

group = "com.louco"
version = "alfa-2.2"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    testCompile("junit", "junit", "4.12")
}

// See https://github.com/JetBrains/gradle-intellij-plugin/
intellij {
//    version = "201.8743.12"
//    alternativeIdePath = "/Applications/Android Studio.app"
     version = "2020.3.3"
}

tasks.getByName<org.jetbrains.intellij.tasks.PatchPluginXmlTask>("patchPluginXml") {
    changeNotes("""
      Add change notes here.<br>
      <em>most HTML tags may be used</em>""")
}