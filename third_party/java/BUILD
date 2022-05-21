package(default_visibility = ["PUBLIC"])

maven_jar(
    name = "junit",
    hash = "8e495b634469d64fb8acfa3495a065cbacc8a0fff55ce1e31007be4c16dc57d3",
    id = "junit:junit:4.13.2",
)

maven_jar(
    name = "hamcrest",
    hash = "4877670629ab96f34f5f90ab283125fcd9acb7e683e66319a68be6eb2cca60de",
    id = "org.hamcrest:hamcrest-all:1.3",
)

maven_jar(
    name = "logback-classic",
    hash = "98c3f18f5d0d642cd5f327cc724566cd19649626c7d88f70143bd704c94157d5",
    id = "ch.qos.logback:logback-classic:1.1.3",
    test_only = True,  # Only used in one test.
    deps = [
        ":logback-core",
        ":slf4j-api",
    ],
)

maven_jar(
    name = "logback-core",
    hash = "47c0fd342995d3315b8faccacc324b2a76143b27c430d4b2d6a29eabc31f5c14",
    id = "ch.qos.logback:logback-core:1.1.3",
    test_only = True,
)

maven_jar(
    name = "slf4j-api",
    hash = "3863e27005740d4d1289bf87b113efea115e9a22408a7d623be8004991232bfe",
    id = "org.slf4j:slf4j-api:1.7.10",
    test_only = True,
)

maven_jar(
    name = "gson",
    hash = "d3999291855de495c94c743761b8ab5176cfeabe281a5ab0d8e8d45326fd703e",
    id = "com.google.code.gson:gson:2.8.9",
)
