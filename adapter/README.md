# Adapter Pattern Example: Media Player

## Overview

This repository demonstrates the Adapter Design Pattern by allowing objects with incompatible interfaces to work together. The example includes different media players that can play various media formats using an adapter.

## Structure

- **Target (`MediaPlayer`)**: The interface that the client expects.
- **Adapter (`MediaAdapter`)**: Adapts the interface of a class into another interface the client expects.
- **Adaptee (`AdvancedMediaPlayer`, `Mp4Player`, `VlcPlayer`)**: The existing interfaces that need adapting.
- **Client (`AudioPlayer`)**: The class that interacts with the Target interface.

## Diagram

```
MediaPlayer
  ├── AudioPlayer

AdvancedMediaPlayer
  ├── Mp4Player
  └── VlcPlayer

MediaAdapter
```

## Files

- **AdvancedMediaPlayer.java**: Contains the `AdvancedMediaPlayer` interface.
- **AudioPlayer.java**: Contains the `AudioPlayer` class.
- **Main.java**: The main script to demonstrate the Adapter Pattern in action.
- **MediaAdapter.java**: Contains the `MediaAdapter` class.
- **MediaPlayer.java**: Contains the `MediaPlayer` interface.
- **Mp4Player.java**: Contains the `Mp4Player` class.
- **VlcPlayer.java**: Contains the `VlcPlayer` class.

## Usage

1. **Clone the repository**:
    ```bash
    git clone https://github.com/yourusername/adapter-pattern-media-player.git
    cd adapter-pattern-media-player
    ```

2. **Compile the Java files**:
    ```bash
    javac adapter/*.java
    ```

3. **Run the main script**:
    ```bash
    java adapter.Main
    ```

4. **Example Output**:
    ```
    Playing mp3 file: beyond the horizon.mp3
    Playing mp4 file: alone.mp4
    Playing vlc file: far far away.vlc
    Playing mp3 file: mind me.mp3
    ```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

Feel free to customize the README.md further based on your project requirements!