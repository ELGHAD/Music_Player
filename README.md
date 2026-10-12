# Java Music Player

A lightweight command-line audio player built with Java, using the standard `javax.sound.sampled` API to play, stop, and replay WAV audio files without third-party dependencies.

## Overview

**Java Music Player** is a console-based application that demonstrates how Java can interact with audio resources through its built-in sound API. Users control playback through simple keyboard commands, while the application manages the audio clip lifecycle.

The project provides a focused example of core Java development, resource management, and event-driven user interaction in a minimal application.

## Key Features

- **WAV Playback:** Play supported `.wav` audio files.
- **Playback Control:** Stop playback and replay the audio from the beginning.
- **Interactive CLI:** Control the application through keyboard commands.
- **Resource Management:** Work with Java audio clips and their lifecycle.
- **Zero Third-Party Dependencies:** Use the standard Java sound API.
- **Lightweight Execution:** Run directly from the Java command line.

## Technology Stack

| Technology | Purpose |
|---|---|
| Java | Application logic and control flow |
| `javax.sound.sampled` | Audio playback and clip management |
| Java `Clip` API | Playback control and audio resource handling |
| Command-line interface | User interaction |
| JDK 17+ | Development and execution environment |

## How It Works

The application loads a WAV file, presents the available playback commands, and responds to user input.

```text
User Input
    |
    v
Command-Line Interface
    |
    v
Playback Controller
    |
    v
Java Sound API
    |
    v
WAV Audio Output
```

The application supports the following commands:

| Command | Action |
|---|---|
| `P` | Play the audio |
| `S` | Stop playback |
| `R` | Replay from the beginning |
| `Q` | Exit the application |

## Getting Started

### Prerequisites

- JDK 17 or later
- A terminal or command prompt
- A supported WAV audio file
- An audio output device

### 1. Clone the Repository

```bash
git clone https://github.com/ELGHAD/Music_Player.git
cd Music_Player
```

### 2. Configure the Audio File

Place a WAV file in the `src/` directory. For example:

```text
src/A.wav
```

Ensure that the file path in `MusicPlayer.java` matches the location of your audio file:

```java
String filePath = "src/A.wav";
```

### 3. Compile the Application

From the project root, run:

```bash
javac -d out src/MusicPlayer.java
```

### 4. Run the Application

```bash
java -cp out MusicPlayer
```

If the source file declares a package, adjust the compilation and execution commands accordingly.

## Example Interaction

```text
Welcome to Simple Music Player

Audio file loaded successfully!

Available Controls:
[P] Play
[S] Stop
[R] Replay
[Q] Quit

Enter your choice: P
Playing...
```

The exact console messages depend on the application's implementation.

## Project Structure

```text
Music_Player/
├── src/
│   ├── MusicPlayer.java
│   └── A.wav
├── .gitignore
└── README.md
```

## Engineering Concepts Demonstrated

This project illustrates several foundational concepts relevant to Java development:

- **Core Java:** Control flow, methods, and console input.
- **API Usage:** Working with the standard Java Sound API.
- **Resource Lifecycle:** Opening, controlling, stopping, and closing audio resources.
- **User Interaction:** Mapping console commands to application behavior.
- **Dependency Management:** Building a small application without external libraries.

## Potential Improvements

Possible extensions for a future version include:

- Volume control and playback position tracking.
- Support for additional audio formats where compatible with the Java Sound API.
- A graphical interface using JavaFX or Swing.
- Improved input validation and audio-loading error handling.
- Automated tests for playback commands and resource cleanup.
- A more structured design separating the command-line interface from audio playback logic.

These are potential enhancements, not features currently claimed by this version.

## Author

**ELGHAD**

- GitHub: https://github.com/ELGHAD
- Repository: https://github.com/ELGHAD/Music_Player

