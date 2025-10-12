import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String filePath = "src/A.wav"; // Path to your audio file
        File audioFile = new File(filePath);

        System.out.println("🎶 Welcome to Simple Music Player 🎶");
        System.out.println("-----------------------------------");

        try (
                Scanner scanner = new Scanner(System.in);
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile)
        ) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            System.out.println("✅ Audio file loaded successfully!");
            System.out.println();

            String choice = "";

            while (!choice.equals("Q")) {
                System.out.println("🎛️  Available Controls:");
                System.out.println("   [P] ▶️  Play");
                System.out.println("   [S] ⏸️  Stop");
                System.out.println("   [R] 🔁  Replay");
                System.out.println("   [Q] ❌  Quit");
                System.out.print("👉 Enter your choice: ");
                choice = scanner.nextLine().trim().toUpperCase();

                switch (choice) {
                    case "P" -> {
                        clip.start();
                        System.out.println("▶️ Playing...");
                    }
                    case "S" -> {
                        clip.stop();
                        System.out.println("⏸️ Stopped.");
                    }
                    case "R" -> {
                        clip.stop();
                        clip.setMicrosecondPosition(0);
                        clip.start();
                        System.out.println("🔁 Restarted.");
                    }
                    case "Q" -> {
                        clip.stop();
                        System.out.println("👋 Exiting player...");
                    }
                    default -> System.out.println("⚠️ Invalid choice. Try again!");
                }

                System.out.println();
            }

        } catch (UnsupportedAudioFileException e) {
            System.out.println("❌ Error: Unsupported audio file format.");
        } catch (LineUnavailableException e) {
            System.out.println("❌ Error: Audio line unavailable.");
        } catch (IOException e) {
            System.out.println("❌ Error: Problem reading the file.");
        } catch (Exception e) {
            System.out.println("⚠️ Unexpected error: " + e.getMessage());
        }
    }
}
