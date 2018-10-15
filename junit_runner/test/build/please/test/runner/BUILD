java_test(
    name = "please_test_runner_test",
    srcs = ["PleaseTestRunnerTest.java"],
    deps = [
        ":test_runner",
        "//third_party/java:junit",
        "//junit_runner/src/build/please/test/result",
        "//junit_runner/src/build/please/test/runner",
        "//junit_runner/test/build/please/test/runner/testdata",
    ],
)

java_library(
    name = "test_runner",
    srcs = [
        "AlwaysAcceptingPleaseTestRunner.java",
    ],
    test_only = True,
    visibility = [
        "//junit_runner/test/build/please/cover/runner/...",
    ],
    deps = [
        "//junit_runner/src/build/please/test/runner",
    ],
)
