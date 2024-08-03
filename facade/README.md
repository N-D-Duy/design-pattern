# Facade Pattern Example: Computer On/Off

## Overview

This repository demonstrates the Facade Design Pattern, which provides a simplified interface to a complex subsystem. The example includes a computer system where components like CPU, Memory, and Hard Drive are managed through a facade to turn the computer on and off.

## Structure

- **Facade (`ComputerFacade`)**: Provides a simplified interface to the complex subsystem.
- **Subsystem Classes (`CPU`, `HardDrive`, `Memory`)**: Represent different components of the subsystem.
- **Client (`Main`)**: Uses the facade to interact with the subsystem.

## Diagram

```
ComputerFacade
  ├── CPU
  ├── HardDrive
  └── Memory
```

## Files

- **ComputerFacade.java**: Contains the `ComputerFacade` class.
- **CPU.java**: Contains the `CPU` class.
- **HardDrive.java**: Contains the `HardDrive` class.
- **Memory.java**: Contains the `Memory` class.
- **Main.java**: The main script to demonstrate the Facade Pattern in action.

## Usage

1. **Clone the repository**:
    ```bash
    git clone https://github.com/yourusername/facade-pattern-computer.git
    cd facade-pattern-computer
    ```

2. **Compile the Java files**:
    ```bash
    javac facade/*.java
    ```

3. **Run the main script**:
    ```bash
    java facade.Main
    ```

4. **Example Output**:
    ```
    Computer is starting...
    Freezing CPU
    Loading data from memory address 0 with data Data from hard drive
    Jumping to address 0
    Executing CPU
    Computer is on!

    Computer is shutting down...
    Stopping CPU
    Computer is off!
    ```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

Feel free to customize the README.md further based on your project requirements!