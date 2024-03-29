plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.calculadora"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.calculadora"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
        //testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        testInstrumentationRunner = "org.junit.runners.JUnit4"
        //testInstrumentationRunnerArguments ["runnerBuilder"] = "de.mannodermaus.junit5.AndroidJunit5Builder"




    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.2")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.7.2")
    testImplementation("org.junit.vintage:junit-vintage-engine:5.7.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}}

