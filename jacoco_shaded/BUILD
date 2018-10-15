java_binary(
    name = "jacoco",
    deps = [
        "//third_party/java/jacoco:jacoco.report",
    ],
)

genrule(
    name = "jacoco_shaded",
    srcs = {
        "jar": [":jacoco"],
        "rules": ["jarjar_rules.txt"],
    },
    outs = ["jacoco_shaded.jar"],
    cmd = "$TOOL process $SRCS_RULES $SRCS_JAR $OUT",
    tools = ["//third_party/java/jarjar:bin"],
    visibility = ["PUBLIC"],
)

maven_library(
    name = "jacoco-shaded",
    srcs = [],
    pom = "pom.xml",
    version = "0.8.1",
)
