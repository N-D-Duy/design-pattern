# Proxy Pattern Example: Image Loading

## Overview

This repository demonstrates the Proxy Design Pattern, which provides a surrogate or placeholder for another object. The example features an image loading system where a proxy controls access to the real image, handling operations like loading and displaying.

## Structure

- **Subject (`Image`)**: Defines the interface for accessing the image.
- **Real Subject (`RealImage`)**: Implements the `Image` interface and represents the actual image.
- **Proxy (`ImageProxy`)**: Controls access to the `RealImage` and handles additional tasks like lazy loading.
- **Client (`Main`)**: Uses the `ImageProxy` to interact with the `RealImage`.

## Diagram

```
ImageProxy
  └── RealImage
      └── Image (Subject Interface)
```

## Files

- **Image.java**: Contains the `Image` interface, defining methods for image operations.
- **RealImage.java**: Implements the `Image` interface, representing the actual image with loading and displaying functionality.
- **ImageProxy.java**: Implements the `Image` interface and provides access control to the `RealImage`, including lazy loading.
- **Main.java**: The main script to demonstrate the Proxy Pattern in action.

## Usage

1. **Clone the repository**:
    ```bash
    git clone https://github.com/yourusername/proxy-pattern-image.git
    cd proxy-pattern-image
    ```

2. **Compile the Java files**:
    ```bash
    javac proxy/*.java
    ```

3. **Run the main script**:
    ```bash
    java proxy.Main
    ```

4. **Example Output**:
    ```
    Loading image from file...
    Displaying image
    Displaying image
    ```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

Feel free to adjust or expand the README according to your project’s specifics!