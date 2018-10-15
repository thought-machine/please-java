subinclude("@pleasings//java:maven_library")

maven_library(
    name = "junit-runner",
    srcs = glob(["src/**/*.java"]),
    pom = "pom.xml",
    version = "13.2.0",
    visibility = ["//junit_runner/..."],
    deps = [
        "//third_party/java:hamcrest",
        "//third_party/java:junit",
        "//third_party/java/jacoco",
    ],
)

java_binary(
    name = "junit_runner",
    main_class = "build.please.main.TestMain",
    visibility = ["PUBLIC"],
    deps = [
        "//junit_runner/src/build/please/main:junit_runner",
    ],
)
