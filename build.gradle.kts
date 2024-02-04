import net.darkhax.curseforgegradle.TaskPublishCurseForge
object Constants {
    const val minecraft_version: String = "1.20.4"
    const val loader_version: String = "0.15.6"
    const val terrablender_version: String = "1.20.4-3.3.0.10"
    const val rei_version: String = "14.0.688"
    const val fabric_version: String = "0.95.4+1.20.4"
    const val terraform_wood_api_version: String = "9.0.0"
    const val mod_version: String = "2.1.4.6-1.20.4"
    const val mod_name: String = "2.1.4.6"
    const val maven_group: String = "net.crypticverse.betterbiomes"
    const val  archives_base_name: String = "betterbiomes-fabric"
}

plugins {
    id("fabric-loom") version ("1.5.+")
    id("com.modrinth.minotaur") version ("2.+")
    id("net.darkhax.curseforgegradle") version ("1.1.18")
    `maven-publish`
}
repositories {
    mavenLocal()
    maven {
        name = "MinecraftForge"
        url = uri("https://maven.minecraftforge.net")
    }
    maven {
        name = "TerraformersMC"
        url = uri("https://maven.terraformersmc.com/")
    }
    maven {url = uri("https://maven.shedaniel.me")}
}
loom {
    accessWidenerPath = file("src/main/resources/betterbiomes.accesswidener")
    runs {
        // This adds a new gradle task that runs the datagen API: "gradlew runDatagen"
        create("datagen") {
            server()
            name = "Data Generation"
            vmArg("-Dfabric-api.datagen")
            vmArg("-Dfabric-api.datagen.output-dir=${file("src/main/generated")}")
            vmArg("-Dfabric-api.datagen.modid=betterbiomes")
            runDir("build/datagen")
        }
    }
}
sourceSets {
    val main = getByName("main")

    main.apply {
        java {
            srcDir("src/main/generated")
        }
    }
}
modrinth {
    token.set(System.getenv("MODRINTH_TOKEN"))
    projectId.set("Qs2o8KiI")
    versionNumber.set("fabric-${Constants.mod_version}")
    versionName.set("Better Biomes Fabric ${Constants.mod_name}")
    versionType.set("beta")
    uploadFile.set(tasks.remapJar)
    changelog = project.file("CHANGELOG.md").readText()
    gameVersions.add("1.20.4")
    loaders.add("fabric")
    dependencies {
        required.project("fabric-api")
        required.project("terrablender")
        optional.project("rei")
    }
}
tasks.register<TaskPublishCurseForge>("curseforge") {
    val mainFile = upload(938715, tasks.remapJar.get())
    mainFile.changelog = project.file("CHANGELOG.md").readText()
    mainFile.changelogType = "markdown"
    mainFile.releaseType = "beta"
    mainFile.displayName = "Better Biomes Fabric ${Constants.mod_name}"
    mainFile.addModLoader("Quilt")
    mainFile.addGameVersion("1.20.4")
    mainFile.addJavaVersion("Java 17")
    mainFile.addRequirement("fabric-api")
    mainFile.addRequirement("terrablender-fabric")
    mainFile.addOptional("roughly-enough-items")
}

dependencies {
    minecraft(group = "com.mojang", name = "minecraft", version = Constants.minecraft_version)
    mappings(loom.officialMojangMappings())
    modImplementation(group = "net.fabricmc", name = "fabric-loader", version = Constants.loader_version)

    modImplementation(group = "net.fabricmc.fabric-api", name = "fabric-api", version = Constants.fabric_version)
    include(group = "net.fabricmc.fabric-api", name = "fabric-api", version = Constants.fabric_version)

    modImplementation(group = "com.github.glitchfiend", name = "TerraBlender-fabric", version = Constants.terrablender_version)
    include(group = "com.github.glitchfiend", name = "TerraBlender-fabric", version = Constants.terrablender_version)

    modImplementation(group = "com.terraformersmc.terraform-api", name = "terraform-wood-api-v1", version = Constants.terraform_wood_api_version)
    include(group = "com.terraformersmc.terraform-api", name = "terraform-wood-api-v1", version = Constants.terraform_wood_api_version)

    modCompileOnly(group = "me.shedaniel", name = "RoughlyEnoughItems-api-fabric", version = Constants.rei_version)
    modRuntimeOnly(group = "me.shedaniel", name = "RoughlyEnoughItems-fabric", version = Constants.rei_version)

    modApi(group = "me.shedaniel.cloth", name = "cloth-config-fabric", version = "13.0.121") {
        exclude(group = "net.fabricmc.fabric-api")
    }
    modApi(group = "dev.architectury", name = "architectury-fabric", version = "11.0.9")
}

tasks {
    processResources {
        inputs.property("version", project.version)
        filesMatching("fabric.mod.json") {
            expand(mapOf("version" to project.version))
        }
    }
}
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
    withSourcesJar()
}
tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    options.release.set(17)
    }
tasks.jar {
    from("LICENSE") {
        rename {"${it}_${Constants.archives_base_name}"}
    }
}
publishing {
    publications {
        register("mavenJava", MavenPublication::class) {
            artifactId = "BetterBiomes-fabric"
            from(components["java"])
        }
    }
    repositories {
        maven("${System.getenv("MAVEN_URL")}")
    }
}