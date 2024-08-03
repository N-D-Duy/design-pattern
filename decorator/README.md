# Decorator Pattern Example: Beverage

## Overview

This repository demonstrates the Decorator Design Pattern, which allows behavior to be added to individual objects, either statically or dynamically, without affecting the behavior of other objects from the same class. The example includes a beverage ordering system where different condiments can be added to beverages.

## Structure

- **Component (`Beverage`)**: The base interface for all beverages.
- **Concrete Components (`Espresso`, `BubbleTea`)**: Concrete implementations of the `Beverage` interface.
- **Decorator (`CondimentDecorator`)**: Abstract decorator class that implements the `Beverage` interface.
- **Concrete Decorators (`BlackSugar`, `Scream`, `Milk`)**: Concrete implementations of the `CondimentDecorator`.

## Diagram

```
Beverage
  ├── Espresso
  └── BubbleTea

CondimentDecorator
  ├── BlackSugar
  ├── Scream
  └── Milk
```

## Files

- **Beverage.java**: Contains the `Beverage` interface.
- **BlackSugar.java**: Contains the `BlackSugar` class.
- **Scream.java**: Contains the `Scream` class.
- **Milk.java**: Contains the `Milk` class.
- **CondimentDecorator.java**: Contains the `CondimentDecorator` abstract class.
- **Espresso.java**: Contains the `Espresso` class.
- **BubbleTea.java**: Contains the `BubbleTea` class.
- **Main.java**: The main script to demonstrate the Decorator Pattern in action.

## Usage

1. **Clone the repository**:
    ```bash
    git clone https://github.com/yourusername/decorator-pattern-beverage.git
    cd decorator-pattern-beverage
    ```

2. **Compile the Java files**:
    ```bash
    javac decorator/*.java
    ```

3. **Run the main script**:
    ```bash
    java decorator.Main
    ```

4. **Example Output**:
    ```
    Espresso, Black Sugar, Scream, Milk: $5.00
    Bubble Tea, Black Sugar, Milk: $4.50
    ```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

Feel free to customize the README.md further based on your project requirements!