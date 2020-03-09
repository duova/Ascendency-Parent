# Ascendency-Parent

Welocome!

This repo contains the parent project for some custom stuff on the
<b>Ascendency</b> modded Minecraft server.

<h2>Cloning</h2>
In order to keep the sub-modules updated, please run:
```bash
git submodule foreach git pull
```
<h2>Compiling</h2>
In order to have maven build the sources alongside forge, you will need to install a jar to your local maven repository.
<br>
<br>
 <b>Download the universal jar from forge</b> 
 <p> Version 
 <a href= https://files.minecraftforge.net/maven/net/minecraftforge/forge/index_1.10.2.html> 
 12.18.3.2511 
 </a>
 </p>

 Then, install the jar into your maven repository like so:
 
 ```bash
 maven install:install -D<path-to-file> -DgroupId=net.minecraftforge.forge -DartifactId=MinecraftForge -Dversion=12.18.3.2511 -Dpackaging=jar
 ```

Once this is complete, you can then install the module to the repository.
<br>
That being said, AscendencyClient will <b>not</b> be installed into the maven repository
this is because the client is a forge mod - built by gradle.
<br>
```bash
maven clean install
```
You <i>must</i> install install to the repo in order for gradle to correctly
pick up the necessary dependencies.
<br>
<br>
<b> NOTE: all <i>maven</i> commands can be changed to <i>mvnw</i>.</b>
<br>
<h2>Getting the jars</h2>
You can find the compiled jars and the source jars here:
<br>
<br>
* AscendencyServerPlugin
    ```bash
    AscendencyServerPlugin/target
    ```
* AscendencyClient
    ```bash
    AscendencyClient/build/libs
    ```
<br>
