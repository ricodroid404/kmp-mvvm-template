plugins {
    //trick: for the same plugin versions in all sub-modules
    id("com.android.application").version("8.1.1").apply(false)
    id("com.android.library").version("8.1.1").apply(false)
    kotlin("android").version("1.9.10").apply(false)// TODO 10じゃないとios落ちる
    kotlin("multiplatform").version("1.9.0").apply(false)
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}