subinclude("//:version")

subinclude("@pleasings//java:maven_library")

package(javac_tool = "javac")

maven_library(
    name = "javac-worker",
    srcs = glob(["src/**/*.java"]),
    pom = "pom.xml",
    version = VERSION,
    deps = ["//third_party/java:gson"],
)

java_binary(
    name = "javac_worker",
    out = "javac_worker",
    main_class = "build.please.compile.JavaCompiler",
    self_executable = True,
    visibility = ["PUBLIC"],
    deps = [":javac-worker"],
)
