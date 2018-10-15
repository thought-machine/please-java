java_test(
    name = "please_coverage_runner_test",
    srcs = [
        "PleaseCoverageRunnerTest.java",
    ],
    deps = [
        "//third_party/java:junit",
        "//third_party/java/jacoco",
        "//junit_runner/src/build/please/cover/result",
        "//junit_runner/src/build/please/cover/runner",
        "//junit_runner/src/build/please/test/result",
        "//junit_runner/src/build/please/test/runner",
        "//junit_runner/test/build/please/cover/runner/testdata",
        "//junit_runner/test/build/please/test/runner:test_runner",
    ],
)

java_test(
    name = "instrumenting_class_loader_test",
    srcs = [
        "InstrumentingClassLoaderTest.java",
    ],
    deps = [
        "//third_party/java:junit",
        "//third_party/java/jacoco",
        "//junit_runner/src/build/please/cover/runner",
        "//junit_runner/test/build/please/cover/runner/testdata",
    ],
)
