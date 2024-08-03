# Builder Pattern Example: Pizza Builder

## Overview

This repository demonstrates the Builder Design Pattern by constructing complex objects step by step. The example includes different types of pizzas that can be built using specific pizza builders and a director.

## Structure

- **Builder (`PizzaBuilder`)**: Abstract interface for creating products.
- **Concrete Builders (`MargheritaPizzaBuilder`, `MozzarellaPizzaBuilder`)**: Concrete implementations of the `PizzaBuilder`.
- **Product (`Pizza`)**: The complex object that is being built.
- **Director (`PizzaDirector`)**: Constructs the object using the `PizzaBuilder` interface.

## Diagram

```
PizzaBuilder
  ├── MargheritaPizzaBuilder
  └── MozzarellaPizzaBuilder

Pizza

PizzaDirector
```

## Files

- **Main.java**: The main script to demonstrate the Builder Pattern in action.
- **MargheritaPizzaBuilder.java**: Contains the `MargheritaPizzaBuilder` class.
- **MozzarellaPizzaBuilder.java**: Contains the `MozzarellaPizzaBuilder` class.
- **Pizza.java**: Contains the `Pizza` class.
- **PizzaBuilder.java**: Contains the `PizzaBuilder` interface.
- **PizzaDirector.java**: Contains the `PizzaDirector` class.

## Usage

1. **Clone the repository**:
    ```bash
    git clone https://github.com/yourusername/builder-pattern-pizza-builder.git
    cd builder-pattern-pizza-builder
    ```

2. **Compile the Java files**:
    ```bash
    javac builder/*.java
    ```

3. **Run the main script**:
    ```bash
    java builder.Main
    ```

4. **Example Output**:
    ```
    Margherita Pizza built with ingredients: [Tomato Sauce, Mozzarella, Basil]
    Mozzarella Pizza built with ingredients: [Tomato Sauce, Extra Mozzarella, Oregano]
    ```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

Feel free to customize the README.md further based on your project requirements!