# 🎶 Java Music Player

A simple console-based music player built in Java using the `javax.sound.sampled` library.  
This program allows you to **play**, **stop**, **replay**, and **quit** audio playback directly from the terminal.

---

## 🧩 Features
- ▶️ **Play** a `.wav` file  
- ⏸️ **Stop** the audio  
- 🔁 **Replay** from the beginning  
- ❌ **Quit** the program gracefully  
- 🖥️ Clean and easy-to-use console interface

---

## ⚙️ Requirements
- Java JDK 17+ (or any version that supports `javax.sound.sampled`)
- A `.wav` audio file (place it inside `src/` folder, e.g. `src/A.wav`)

---

## 🚀 How to Run

1. Clone this repository:
   ```bash
   git clone https://github.com/<your-username>/music-player.git
2. Open the folder in your IDE (IntelliJ, VS Code, Eclipse, etc.)

3. Make sure the .wav file path inside the code is correct:

       String filePath = "src/A.wav";
5. Compile and run the program:

       javac MusicPlayer.java
       java MusicPlayer


6. Control playback using these keys:

    P → Play
    S → Stop
    R → Replay
    Q → Quit
   
---

## 🧠 Example Output

🎶 Welcome to Simple Music Player 🎶
-----------------------------------
✅ Audio file loaded successfully!

🎛️  Available Controls:
   [P] ▶️  Play
   [S] ⏸️  Stop
   [R] 🔁  Replay
   [Q] ❌  Quit
👉 Enter your choice: P
▶️ Playing...

