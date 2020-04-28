java_test(
    name = "please_test_runner_test",
    srcs = ["PleaseTestRunnerTest.java"],
    deps = [
        ":test_runner",
        "//junit_runner:junit-runner",
        "//junit_runner/src/test/java/build/please/test/runner/testdata",
        "//third_party/java:junit",
    ],
)

java_library(
    name = "test_runner",
    srcs = [
        "AlwaysAcceptingPleaseTestRunner.java",
    ],
    test_only = True,
    visibility = [
        "//junit_runner/src/test/java/build/please/cover/runner/...",
    ],
    deps = [
        "//junit_runner:junit-runner",
    ],
)
