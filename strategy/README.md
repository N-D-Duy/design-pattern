# Strategy Pattern Example: Calculator

## Overview

This repository demonstrates the Strategy Design Pattern, which defines a family of algorithms, encapsulates each one, and makes them interchangeable. The example features a calculator that performs various operations like addition, subtraction, and multiplication using different strategies.

## Structure

- **Context (`Context`)**: Maintains a reference to a `CalculateStrategy` and uses it to execute the algorithm.
- **Strategy Interface (`CalculateStrategy`)**: Defines the interface for the calculation strategy.
- **Concrete Strategies (`OperationAdd`, `OperationSubstract`, `OperationMultiply`)**: Implement different calculation algorithms.
- **Client (`Main`)**: Uses the `Context` to perform calculations with different strategies.

## Diagram

```
Context
  └── CalculateStrategy
      ├── OperationAdd
      ├── OperationSubstract
      └── OperationMultiply
```

## Files

- **CalculateStrategy.java**: Contains the `CalculateStrategy` interface.
- **Context.java**: Contains the `Context` class, which uses a `CalculateStrategy`.
- **OperationAdd.java**: Implements the addition strategy.
- **OperationSubstract.java**: Implements the subtraction strategy.
- **OperationMultiply.java**: Implements the multiplication strategy.
- **Main.java**: The main script to demonstrate the Strategy Pattern in action.

## Usage

1. **Clone the repository**:
    ```bash
    git clone https://github.com/yourusername/strategy-pattern-calculator.git
    cd strategy-pattern-calculator
    ```

2. **Compile the Java files**:
    ```bash
    javac strategy/*.java
    ```

3. **Run the main script**:
    ```bash
    java strategy.Main
    ```

4. **Example Output**:
    ```
    10 + 5 = 15
    10 - 5 = 5
    10 * 5 = 50
    ```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

Feel free to adjust the details to better fit your project!