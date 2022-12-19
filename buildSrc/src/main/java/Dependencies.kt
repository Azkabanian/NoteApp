object Dependencies {

    const val core = "androidx.core:core-ktx:${Versions.coreVersion}"
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompatVersion}"
    const val material = "com.google.android.material:material:${Versions.materialVersion}"
    const val constraintlayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintlayoutVersion}"
    const val junit = "junit:junit:${Versions.junitVersion}"
    const val extJunit = "androidx.test.ext:${Versions.extJunitVersion}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espressoVersion}"
    const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigationComponentVersion}"
    const val navigationUi = "androidx.navigation:navigation-ui-ktx:${Versions.navigationComponentVersion}"



    // Coroutines
    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutinesVersion}"
    const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesVersion}"

    // Room
    const val roomRuntime = "androidx.room:room-runtime:${Versions.roomVersion}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.roomVersion}"

    // Kotlin Extensions and Coroutines support for Room
    const val kotlinExtensionAndCoroutinesSupportForRoom = "androidx.room:room-ktx:${Versions.roomVersion}"

    // Architectural Components
    const val lifecycleOfViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleOfViewModelVersion}"

    //Koin
    const val koinOfAndroid = "io.insert-koin:koin-android:${Versions.koinVersionOfAndroid}"
    const val koinOfCoreJvm = "io.insert-koin:koin-core-jvm:${Versions.koinVersionOfCoreJvm}"

    //Retrofit
    const val retrofit2 = "com.squareup.retrofit2:retrofit:${Versions.retrofit2Version}"
    const val retrofitConverterGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit2Version}"

    //okhttp
    const val okhttp3 = "com.squareup.okhttp3:okhttp:${Versions.okhttp3Version}"
    const val okhttpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp3Version}"

    //Picasso
    const val picasso = "com.squareup.picasso:picasso:${Versions.picassoVersion}"

    //SnapTimePicker
    const val snapTimePicker = "com.akexorcist:snap-time-picker:${Versions.snapTimePickerVersion}"

    //Country picker
    const val countryPicker = "com.hbb20:android-country-picker:${Versions.countryPickerVersion}"
}