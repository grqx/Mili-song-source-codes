Transcribed source code displayed in the background of Mili's songs.

This repo is a fork from [syuchan1005 / Mili-song-source-codes](https://github.com/syuchan1005/Mili-song-source-codes).

the source code of `goddrinksjava` is mostly written by `syuchan1005`
`music_player.MusicPlayer` is mostly based on [`unusuallman`'s fork](https://github.com/unusuallman/Mili-song-source-codes) of `syuchan1005`'s repo ([source](https://github.com/unusuallman/Mili-song-source-codes/blob/master/src/goddrinksjava/MusicPlayer.java) / [raw](https://raw.githubusercontent.com/unusuallman/Mili-song-source-codes/refs/heads/master/src/goddrinksjava/MusicPlayer.java))

Some files have been added to make the source code for both `world.execute(me);` and `sustain++;` executable.
It also displays the lyrics and plays the music at runtime.


| source code                                                                       |                                                                                   YouTube                                                                                    |
|:----------------------------------------------------------------------------------|:----------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|
| [GodDrinksJava.java](src/goddrinksjava/GodDrinksJava.java)                        |                              [world.execute(me); ![](http://img.youtube.com/vi/ESx_hy1n7HA/0.jpg)](https://www.youtube.com/watch?v=ESx_hy1n7HA)                              |
| [sustainPlusPlus_ending_ver.java](src/sustainPlusPlus_ending_ver.java) | [Mili - sustain++; (ending ver.) / Ghost In The Shell: SAC_2045 Ending Theme ![](https://img.youtube.com/vi/Wu4fVGsEn8s/0.jpg)](https://www.youtube.com/watch?v=Wu4fVGsEn8s) |
| [sustainPlusPlus.java](src/extraLarge/sustainPlusPlus.java)                       |        [Mili - sustain++; / Ghost In The Shell: SAC_2045 Ending Theme ![](https://img.youtube.com/vi/JHY0PYZXvfU/0.jpg)](https://www.youtube.com/watch?v=JHY0PYZXvfU)        |



## To pack into jar and run:
### `sustain++;`
Run: [`extraLarge.pack.bat`](extraLarge.pack.bat)
or [`extraLarge.pack.sh`](extraLarge.pack.sh)
, then run `java -jar ./goddrinksjava.jar`
### `world.execute(me);`
Run: [`goddrinksjava.pack.bat`](goddrinksjava.pack.bat)
or [`goddrinksjava.pack.sh`](goddrinksjava.pack.sh)
, then run `java -jar ./extraLarge.jar`

Releases are available now.
