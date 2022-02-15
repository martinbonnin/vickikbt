plugins {
  id("org.jetbrains.kotlin.jvm").version("1.5.30")
  id("com.apollographql.apollo3").version("3.1.0")
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("com.apollographql.apollo3:apollo-api:3.1.0")
}
apollo {
  packageName.set("com.vickikbt.gistagram")
}