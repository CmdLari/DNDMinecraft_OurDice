# DNDMinecraft_OurDice
*Client-side dice-rolling mod for Minecraft (Fabric)*  
**Authors:** Jonas & Lary

## Description
DNDMinecraft_OurDice is a lightweight Minecraft Fabric mod that adds a simple `/roll` command to roll dice directly in the game. Intended for tabletop-RPG style play inside Minecraft, it supports commands like:
- `/roll` → rolls a default 1d20
- `/roll NdM` → rolls *N* dice each with *M* sides (e.g., `/roll 3d6`)

## Features
- Client-side only: no server mod required (ideal for single-player or clients connecting to vanilla servers)
- Supports default roll when no argument is provided (`/roll`)
- Supports custom dice syntax (`NdM`, e.g., `2d8`, `5d12`)
- Clear feedback printed to the player with the result of the roll
- Built with the Fabric API and works with modern Minecraft versions

## Installation
1. Ensure you have Minecraft with Fabric loader installed.
2. Place the mod JAR (from releases or built locally) into your `mods/` folder.
3. Launch Minecraft with the Fabric profile.
4. In-game, type `/roll` or `/roll <dice>` to use the command.

## Usage
### Default roll (1d20)
/roll

shell
Copy code

### Custom roll
/roll 4d10

markdown
Copy code
This rolls four ten-sided dice and displays the total.

If you provide an invalid syntax (e.g., `/roll abc`, `/roll d20`, `/roll 2d`), you’ll receive a message:
> “Please roll valid dice (eg. 1d20)”

## Development
- Language: Java
- Uses Fabric API (client side) for command registration
- Main classes:
    - `OurDice` — client mod initializer, registers the `/roll` command
    - `DieLogic` — handles parsing the dice string and performing the roll logic
- Feel free to fork and extend to add features such as:
    - Showing each individual die result (not just the sum)
    - Adding modifiers (e.g., `/roll 2d6+3`)
    - Support for advantage/disadvantage mechanics
    - Integration with chat output, log tracking, or scoreboard display

## Contributing
- Fork the repository
- Add your feature or fix the issue
- Submit a pull request describing your changes and why
- Please ensure your code is well-commented and follows existing style

## License
MIT