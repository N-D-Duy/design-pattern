# Factory Pattern Example: Product Creation

## Overview

This repository demonstrates the Factory Design Pattern, which provides an interface for creating objects but allows subclasses to alter the type of objects that will be created. The example features a product creation system where products of type A or B can be created based on a specified type.

## Structure

- **Product (`Product`)**: Defines the interface for products.
- **Concrete Products (`ProductA`, `ProductB`)**: Implement the `Product` interface and represent specific product types.
- **Factory (`ProductFactory`)**: Creates instances of products based on the provided type.
- **Client (`Main`)**: Uses the `ProductFactory` to create products and demonstrates their usage.

## Diagram

```
ProductFactory
  ├── ProductA
  └── ProductB
      └── Product (Product Interface)
```

## Files

- **Product.java**: Contains the `Product` interface, which defines methods that concrete products must implement.
- **ProductA.java**: Implements the `Product` interface to represent product type A.
- **ProductB.java**: Implements the `Product` interface to represent product type B.
- **ProductFactory.java**: Contains the factory method to create products based on the specified type.
- **Main.java**: The main script to demonstrate the Factory Pattern in action.

## Usage

1. **Clone the repository**:
    ```bash
    git clone https://github.com/yourusername/factory-pattern-product.git
    cd factory-pattern-product
    ```

2. **Compile the Java files**:
    ```bash
    javac factory/*.java
    ```

3. **Run the main script**:
    ```bash
    java factory.Main
    ```

4. **Example Output**:
    ```
    Product A
    ```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

Feel free to customize the README further based on your project needs!