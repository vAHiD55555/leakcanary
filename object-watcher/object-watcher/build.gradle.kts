plugins {
  id("org.jetbrains.kotlin.jvm")
  id("com.vanniktech.maven.publish")
}

java {
  sourceCompatibility = JavaVersion.VERSION_1_8
  targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
  implementation(libs.kotlin.stdlib)
  api(projects.shark.sharkLog)
  api(projects.leakcanary.leakcanaryGc)

  testImplementation(libs.assertjCore)
  testImplementation(libs.junit)
}
