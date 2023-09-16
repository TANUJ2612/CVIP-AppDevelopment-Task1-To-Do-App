plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.todoapp"
    compileSdk = 33

    buildFeatures{
        viewBinding = true
    }

    defaultConfig {
        applicationId = "com.example.todoapp"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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

//    def lifecycle_version = "2.6.1"
//    def arch_version = "2.2.0"
//    def room_version = "2.5.2"

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    // ViewModel
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.0-alpha02")
    // LiveData
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.5.0-alpha02")

    // Annotation processor
    annotationProcessor("androidx.lifecycle:lifecycle-compiler:2.5.0-alpha02")

    // To use Kotlin annotation processing tool (kapt)
    implementation("androidx.room:room-runtime:2.4.1")
    // To use Kotlin Symbol Processing (KSP)
    annotationProcessor("androidx.room:room-compiler:2.4.1")
    // Lottie Animation
    implementation("com.airbnb.android:lottie:6.1.0")
}