# Command Pattern Example: Stock Trading

## Overview

This repository demonstrates the Command Design Pattern by encapsulating a request as an object, thereby allowing for parameterization of clients with different requests, queuing of requests, and logging of the requests. The example includes a stock trading application where orders can be placed to buy or sell stocks.

## Structure

- **Command (`Order`)**: An abstract interface for executing operations.
- **Concrete Commands (`BuyStock`, `SellStock`)**: Concrete implementations of the `Order` interface.
- **Receiver (`Stock`)**: The class that knows how to perform the operations associated with carrying out a request.
- **Invoker (`Broker`)**: Asks the command to carry out the request.
- **Client (`Main`)**: Creates the concrete command objects and sets the receiver.

## Diagram

```
Order
  ├── BuyStock
  └── SellStock

Stock

Broker

Main
```

## Files

- **Broker.java**: Contains the `Broker` class.
- **BuyStock.java**: Contains the `BuyStock` class.
- **SellStock.java**: Contains the `SellStock` class.
- **Stock.java**: Contains the `Stock` class.
- **Order.java**: Contains the `Order` interface.
- **Main.java**: The main script to demonstrate the Command Pattern in action.

## Usage

1. **Clone the repository**:
    ```bash
    git clone https://github.com/yourusername/command-pattern-stock-trading.git
    cd command-pattern-stock-trading
    ```

2. **Compile the Java files**:
    ```bash
    javac command/*.java
    ```

3. **Run the main script**:
    ```bash
    java command.Main
    ```

4. **Example Output**:
    ```
    Stock [ Name: ABC, Quantity: 10 ] bought
    Stock [ Name: ABC, Quantity: 10 ] sold
    ```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

Feel free to customize the README.md further based on your project requirements!