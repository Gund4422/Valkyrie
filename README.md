# Valkyrie
An open source, mixin based ghost AND a bit blatant client for Minecraft 1.8.9 built on Minecraft Forge.  
forked from [zPeanut] and [UltramoxX]'s Hydrogen.  

Current stable release: **1.12.5**  
  
Please remember that: **We are not responsible for any repercussions you face using this client.  
We are merely providing you with it. Use at your own risk.** 


## Features

There are currently over 50 modules included in Valkyrie,  
including a fully customizable Ingame GUI, aswell as various render, combat and utility focused modules. and also, 2 more modules from Valkyrie: NoFall, and OmniSprint (OmniSprint requires nothing, it just packet bursts sprint packets)  
  
Go ahead and try them out!

## USER INSTALLATION

Before you install Valkyrie, make sure to have installed Minecraft Forge for Minecraft 1.8.9.

### Manual Installation:

1. Download the latest [release] of Valkyrie from the actions tab.
2. Drag and Drop ``hydrogen-x.x.x.jar`` into your directory for Forge mods (Win-Default: ``%appdata%/.minecraft/mods``).
3. Select your launcher profile with the respective Forge version.
4. Enjoy the ride.

## Setup with Forge MDK

Hydrogen runs on Gradle. Make sure you have it is installed correctly before setting up.

1. Clone the Repository under `https://github.com/zPeanut/Hydrogen.git`
2. Open command prompt and CD into the directory.
3. Depending on which IDE(Integrated Development Enviroment) you use, different commands have to be ran.
    - IntelliJ: `gradlew setupDecompWorkspace idea genIntellijRuns build`
    - Eclipse: `gradlew setupDecompWorkspace eclipse build`
4. Open the folder in your preferred IDE, depending which you chose above.

## Exporting the client using Forge MDK

After you have succesfully made changes to Hydrogen and want to export it, simply type  

`.\gradlew clean build`  

into your IDE Terminal or Windows Command Prompt / Windows Powershell.  
You will then get a jar file located at  

`\build\libs`  

inside of your directory. Simply put that file into your mods folder inside .minecraft and you're good to go!
## Requirements 
**[DarkMagician6's EventAPI]**, an open source EventAPI system, made for handling events across java based projects.  
**[Semver4j]**, A Library for semantic versioning in Java applications. Used to compare semantic versions in the client to check if the client is outdated.



[zPeanut]: https://github.com/zPeanut
[UltramoxX]: https://github.com/Morten-Renner
[SemVer4j]: https://github.com/vdurmont/semver4j
[DarkMagician6's EventAPI]: https://bitbucket.org/DarkMagician6/eventapi/src/master/
[release]: https://github.com/Gund4422/Valkyrie/actions
