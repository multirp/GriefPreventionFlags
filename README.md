# GriefPreventionFlags

This is a fork of the classic Grief Prevention Flags plugin, originally made by [BigScary](https://github.com/BigScary/GriefPreventionFlags), then maintained by [ShaneBee](https://github.com/ShaneBeee/GriefPreventionFlags) (see credits below).  At some point I'm likely to remove it from the stream entirely and set it up on it's own repo.

## Requirements
* **GriefPrevention:** This fork now requires the snapshot of GriefPrevention.  The last packaged release (16.17.1) uses a different method of claim permission checking, and I moved over to the newer supplier model, so this will only work with the newer snapshots

## Changelog
Since ShaneBee's fork, there have been a few changes.  This will be brief as none of the changes were particularly major.

### Updates since 5.10.2
* **NoDeathMessage:** New flag - when active, no players dying in that claim send death messages to chat

### 5.10.2
* **GriefPrevention Update:** This plugin is now good up to [GriefPrevention](https://github.com/techfortress/GriefPrevention) 16.17.2-SNAPSHOT
* **RespawnLocation:** The ClaimPlayerFlag RespawnLocation no longer takes arguments.  It was interacting poorly with PlaceholderAPI for some reason.  Now, the player inserted into the command will act as the location - the location they are at will be the location people respawn.
* **NoIceForm:** This flag now blocks natural (weather) formation of ice, as well as unnatural (Frostwalker).  I did not move Frostwalker/Frosted Ice into it's own flag, but may if it becomes necessary
* **NoMossGrowth:** This flag prevents the bonemealing of Moss blocks and glowing lichen unless the player has Build permissions within the claim


---
Below has been archived from my fork of [ShaneBee's Repo](https://github.com/ShaneBeee/GriefPreventionFlags)

---

# GriefPreventionFlags
![GitHub release](https://img.shields.io/github/release/ShaneBeee/GriefPreventionFlags.svg?style=for-the-badge)
![GitHub issues](https://img.shields.io/github/issues-raw/ShaneBeee/GriefPreventionFlags.svg?style=for-the-badge)
![GitHub closed issues](https://img.shields.io/github/issues-closed-raw/ShaneBeee/GriefPreventionFlags.svg?style=for-the-badge)
![GitHub All Releases](https://img.shields.io/github/downloads/ShaneBeee/GriefPreventionFlags/total.svg?style=for-the-badge)
[![Discord](https://img.shields.io/discord/425192525091831808.svg?style=for-the-badge)](https://discordapp.com/invite/km3UF8Q)
[![Build Status](https://travis-ci.org/ShaneBeee/GriefPreventionFlags.svg?branch=master)](https://travis-ci.org/ShaneBeee/GriefPreventionFlags)

Bringing back an old favorite of GriefPrevention users... Admin Flags

GriefPrevention Flags is a plugin to allow admins to set flags for GriefPrevention claims. Either a single claim, or a global flag for all claims. It's similar to WorldGuard, but it's more performant, easier to use, and includes many more useful flags than WorldGuard does.  It also doesn't require WorldEdit to run (unlike WorldGuard).  Admins can also empower players to self-serve by giving them access to specific flags, which they can then only use on land claims they own.

This is a fork from the original author [BigScary](https://github.com/BigScary/GriefPreventionFlags).

### Versions

There are now 2 separate versions. One for Legacy 1.12.2 and one for the new 1.13 update. Because of so many changes in the Spigot/Bukkit API in 1.13, I have decided to keep these two versions separate.  
You can find both versions in the releases tab.  
Make sure to download the correct version, for your version of Spigot!

More info for this plugin can be found on [Spigot](https://www.spigotmc.org/resources/griefprevention-flags.55773/)
