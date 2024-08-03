# Bridge Pattern Example: Shapes with Colors

## Overview

This repository demonstrates the Bridge Design Pattern by separating the abstraction (Shapes) from its implementation (Colors) so that both can vary independently. The example includes different shapes that can be drawn in various colors.

## Structure

- **Abstraction (`Shape`)**: The base class for all shapes.
- **Refined Abstractions (`Circle`, `Rectangle`)**: Derived classes from `Shape`.
- **Implementor (`Color`)**: The base interface for all colors.
- **Concrete Implementors (`RedColor`, `GreenColor`)**: Classes that implement the `Color` interface.

## Diagram

```
Shape
  ├── Circle
  └── Rectangle

Color
  ├── RedColor
  └── GreenColor
```

## Files

- **Circle.java**: Contains the `Circle` class.
- **Color.java**: Contains the `Color` interface.
- **GreenColor.java**: Contains the `GreenColor` class.
- **Main.java**: The main script to demonstrate the Bridge Pattern in action.
- **README.md**: This readme file.
- **RedColor.java**: Contains the `RedColor` class.
- **Rectangle.java**: Contains the `Rectangle` class.
- **Shape.java**: Contains the `Shape` class.

## Usage

1. **Clone the repository**:
    ```bash
    git clone https://github.com/yourusername/bridge-pattern-shapes.git
    cd bridge-pattern-shapes
    ```

2. **Compile the Java files**:
    ```bash
    javac bridge/*.java
    ```

3. **Run the main script**:
    ```bash
    java bridge.Main
    ```

4. **Example Output**:
    ```
    Drawing Circle in Red color.
    Drawing Circle in Green color.
    Drawing Rectangle in Red color.
    Drawing Rectangle in Green color.
    ```
    
## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

Feel free to customize further based on your project requirements!