subinclude("//:version")

subinclude("@pleasings//java:maven_library")

maven_library(
    name = "junit-runner",
    srcs = glob(["src/**/*.java"]),
    pom = "pom.xml",
    version = VERSION,
    visibility = ["//junit_runner/..."],
    deps = [
        "//jacoco_shaded",
        "//third_party/java:hamcrest",
        "//third_party/java:junit",
    ],
)

java_binary(
    name = "junit_runner",
    main_class = "build.please.main.TestMain",
    visibility = ["PUBLIC"],
    deps = [
        ":junit-runner",
    ],
)
