# Prototype Pattern Example: Soccer Players

## Overview

This repository demonstrates the Prototype Design Pattern, which allows objects to be cloned without specifying their exact class. The example features a soccer player system where players can be cloned from a prototype to create new instances efficiently.

## Structure

- **Prototype (`Player`)**: Defines the interface for cloning itself.
- **Concrete Prototype (`Defender`, `Goalkeeper`)**: Implements cloning and specific player roles.
- **Client (`Main`)**: Uses the `PlayerCache` to manage and clone player prototypes.
- **Manager (`PlayerCache`)**: Maintains a collection of prototype players and facilitates cloning.

## Diagram

```
PlayerCache
  ├── Defender
  ├── Goalkeeper
  └── Player (Prototype Interface)
```

## Files

- **Player.java**: Contains the `Player` interface for cloning.
- **Defender.java**: Implements the `Player` interface for defender players.
- **Goalkeeper.java**: Implements the `Player` interface for goalkeeper players.
- **PlayerCache.java**: Manages and provides access to player prototypes.
- **Main.java**: The main script to demonstrate the Prototype Pattern in action.

## Usage

1. **Clone the repository**:
    ```bash
    git clone https://github.com/yourusername/prototype-pattern-soccer.git
    cd prototype-pattern-soccer
    ```

2. **Compile the Java files**:
    ```bash
    javac prototype/*.java
    ```

3. **Run the main script**:
    ```bash
    java prototype.Main
    ```

4. **Example Output**:
    ```
    Cloning Defender....
    Created Defender: 
    Tackles: 60
    Player Type: Defender
    Name: John Doe
    Age: 25
    Team: Manchester United

    Cloning Goalkeeper....
    Created Goalkeeper:
    Player Type: Goalkeeper
    Name: Jane Doe
    Age: 30
    Team: Chelsea
    ```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

Feel free to modify or expand the README as needed!