# [BetterBiomes](https://modrinth.com/mod/better-biomes)

This is a mod that adds different biomes to the game!

*Please note that this mod is in beta, and more features will be added along the way.

## Installation

To install this mod on the client, place the `.jar` file in your `mods` folder.

For servers, place the file in the `mods` folder on the server. *Please note that the mod is both server and client side.*

### Current Features include:
Maple trees and the Maple forest biome

## Compatibility

This mod is compatible with Fabric, Quilt, Forge, and NeoForge. This repo is the Fabric/Quilt mod.
- Minecraft 1.20.2 or higher
- Fabric Loader 0.14.23 or higher
- Fabric API

## Contributing

We need language files! To make a lang file, create a fork with the file, then pull request it into the master branch.
Or, go to our Crowdin page and contribute there!

## Developing Guide
Better Biomes uses the normal Gradle project structure, and can be compiled by running the gradle task `build`.

## Implementation in your mod
To implement this mod, follow the steps below.

### Maven
Add the maven for either Curse Maven or Modrinth's Maven.
```gradle
repositories {
    maven { url = "https://raw.githubusercontent.com/CrypticVerse/projectresources/master/maven" }
}
```

### Implementation for Fabric Loom
For Fabric's Loom, include the following for either Curse Maven or Modrinth's Maven. You only need one. For ForgeGradle, check out the BetterBiomes-Forge repo.
```gradle
modImplementation "net.crypticverse.betterbiomes:BetterBiomes-Fabric:${betterbiomes_version)-${mc_verison}"
```

#### Requirements

- OpenJDK 17 or higher.
  We recommend using the JDK from [Eclipse Temurin](https://adoptium.net/temurin/releases/?version=17), as it works without issues.

- Gradle 8.3 or higher (optional)
  Gradle is already provided in this repository, so you do not need to download it seperatley

## License
   This mod is licensed under MIT License, which is free and open source. For more info, refer to the [license file](LICENSE).
   [Looking for Forge? Find it Here!](https://github.com?crypticVerse/BetterBiomes-Forge)
