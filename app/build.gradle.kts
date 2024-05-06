plugins {
    alias(libs.plugins.androidApplication)
}

android {
    namespace = "com.example.triviafrag"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.triviafrag"
        minSdk = 31
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    // agregar viewBinding a Module y clic en Sync para sincronizar gradle Module
    buildFeatures {
        viewBinding = true
    }

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

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    // implementar navigation y clic en Sync Now
    implementation(libs.navigation.fragment.ktx)
    implementation(libs.navigation.ui.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}