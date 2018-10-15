java_binary(
    name = "jacoco_all",
    deps = [
        ":asm",
        ":asm-analysis",
        ":asm-commons",
        ":asm-tree",
        ":asm-util",
        ":jacoco.agent",
        ":jacoco.core",
        ":jacoco.report",
    ],
)

genrule(
    name = "jacoco",
    srcs = {
        "jar": [":jacoco_all"],
        "rules": ["jarjar_rules.txt"],
    },
    outs = ["jacoco_shaded.jar"],
    cmd = "$TOOL process $SRCS_RULES $SRCS_JAR $OUT",
    tools = ["//third_party/java/jarjar:bin"],
    visibility = ["PUBLIC"],
)

maven_jar(
    name = "jacoco.core",
    hash = "1395ce44a2e4c728550835abda1c2f968ab4ccf3",
    id = "org.jacoco:org.jacoco.core:0.8.1",
)

maven_jar(
    name = "jacoco.report",
    hash = "d3bb614ff63fc63e33495e07ab7f1897c5ed0f72",
    id = "org.jacoco:org.jacoco.report:0.8.1",
)

maven_jar(
    name = "jacoco.agent",
    hash = "13224d3ec84b5f881337d76a7765267e7b8541cd",
    id = "org.jacoco:org.jacoco.agent:0.8.1",
)

maven_jar(
    name = "asm",
    hash = "9b66ade83c8663b1d0d8b96c68735cd7819d5974",
    id = "org.ow2.asm:asm:6.0",
)

maven_jar(
    name = "asm-commons",
    hash = "974412964b72c4c7b0b02243827a6bdd6ad982ad",
    id = "org.ow2.asm:asm-commons:6.0",
)

maven_jar(
    name = "asm-tree",
    hash = "d77ccf739f87599e427d1efac3f2d7c5f76f9fd3",
    id = "org.ow2.asm:asm-tree:6.0",
)

maven_jar(
    name = "asm-analysis",
    hash = "1e278666d0d4373a5c1a6a6e09f82e8a4723f5c3",
    id = "org.ow2.asm:asm-analysis:6.0",
)

maven_jar(
    name = "asm-util",
    hash = "ae51352634a6b266a6409748e98c6d82b4afe8d4",
    id = "org.ow2.asm:asm-util:6.0",
)
