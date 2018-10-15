java_library(
    name = "junit_runner",
    srcs = glob(["*.java"]),
    exported_deps = [
        "//third_party/java:hamcrest",
        "//third_party/java:junit",
        "//third_party/java/jacoco",
    ],
    visibility = ["//junit_runner/..."],
    deps = [
        "//junit_runner/src/build/please/common/report",
        "//junit_runner/src/build/please/common/source",
        "//junit_runner/src/build/please/common/test",
        "//junit_runner/src/build/please/cover/report",
        "//junit_runner/src/build/please/cover/result",
        "//junit_runner/src/build/please/cover/runner",
        "//junit_runner/src/build/please/test/report",
        "//junit_runner/src/build/please/test/result",
        "//junit_runner/src/build/please/test/runner",
    ],
)
