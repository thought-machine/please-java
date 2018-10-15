subinclude("@pleasings//java:maven_library")

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
    outs = ["jacoco-shaded-0.8.1.jar"],
    cmd = "$TOOL process $SRCS_RULES $SRCS_JAR $OUT",
    tools = ["//third_party/java/jarjar:bin"],
    visibility = ["PUBLIC"],
)

maven_library(
    name = "jacoco-shaded",
    srcs = [],
    jar = ":jacoco_shaded",
    pom = "pom.xml",
    version = "0.8.1",
)
