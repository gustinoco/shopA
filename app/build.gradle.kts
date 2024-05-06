// Ref: https://issuetracker.google.com/issues/187326581#comment8
@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.android.kotlin)
}

android {
    compileSdk = libs.versions.sdk.compile.get().toInt()

    defaultConfig {
        applicationId = "br.com.shop.shopA"
        minSdk = libs.versions.sdk.min.get().toInt()
        targetSdk = libs.versions.sdk.target.get().toInt()
        versionCode = libs.versions.module.version.code.get().toInt()
        versionName = libs.versions.module.version.name.get().toString()
        buildToolsVersion = libs.versions.buildtools.get()
    }

    buildFeatures {
        viewBinding = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.toVersion(libs.versions.java.get())
        targetCompatibility = JavaVersion.toVersion(libs.versions.java.get())
    }

    kotlinOptions {
        jvmTarget = libs.versions.java.get()
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

dependencies {
    implementation(libs.kotlin.stdlib)
    implementation(libs.kotlin.coroutines.core)
    implementation(libs.kotlin.coroutines.android)
    implementation(libs.kotlin.coroutines.playservices)

    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.navigation.fragment)
    implementation(libs.androidx.navigation.ui)
    implementation(libs.androidx.recyclerview)


    implementation(libs.shop.commons)
    implementation(libs.shop.home)
    implementation(libs.shop.login)
    implementation(libs.shop.shopping)
    implementation(libs.shop.cart)

    implementation(libs.core.splash)


    implementation(libs.sample.retrofit.gson)


    testImplementation(libs.test.mockk)
    testImplementation(libs.test.junitjupiter.api)
    testImplementation(libs.test.junitjupiter.engine)
    testImplementation(libs.test.coretesting)
    testImplementation(libs.test.coroutinestesting)

}
