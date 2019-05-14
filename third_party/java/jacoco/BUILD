maven_jar(
    name = "jacoco.core",
    hash = "f0d992771801b58f6a064248f1778aafd86835a2",
    id = "org.jacoco:org.jacoco.core:0.8.4",
    deps = [
        ":asm",
        ":asm-commons",
        ":asm-util",
    ],
)

maven_jar(
    name = "jacoco.report",
    hash = "b8a3b5de0c123f3b6a63d144bd32161f68233960",
    id = "org.jacoco:org.jacoco.report:0.8.4",
    visibility = ["PUBLIC"],
    deps = [":jacoco.core"],
)

maven_jar(
    name = "asm",
    hash = "d37ba92c7076b5e3d4ab9cd1d05529b63a4dd535",
    id = "org.ow2.asm:asm:7.1",
)

maven_jar(
    name = "asm-commons",
    hash = "ba09c8def728a04f3c840e4c4ac45d3487f92300",
    id = "org.ow2.asm:asm-commons:7.1",
    deps = [
        ":asm-analysis",
        ":asm-tree",
    ],
)

maven_jar(
    name = "asm-tree",
    hash = "aef2c569bccfbe02895c1434339c055ddb2e045d",
    id = "org.ow2.asm:asm-tree:7.1",
)

maven_jar(
    name = "asm-analysis",
    hash = "ef7533b6614b894a14d0293adfa9d8a54d0089ca",
    id = "org.ow2.asm:asm-analysis:7.1",
)

maven_jar(
    name = "asm-util",
    hash = "09032f7018f1ab735093697b80a8d9b42488a274",
    id = "org.ow2.asm:asm-util:7.1",
)
