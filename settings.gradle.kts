pluginManagement {
    repositories {
        jcenter()
        gradlePluginPortal()
    }
}

// always good to nail down the root project name, because
// the root directory name may be different in some envs (e.g. CI)
// hence the following even makes sense for single-project builds
rootProject.name = "ppxml-root"

include("ppxml")