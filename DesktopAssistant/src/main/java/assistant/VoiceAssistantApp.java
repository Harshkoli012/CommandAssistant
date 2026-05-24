
package assistant;

import java.util.Scanner;

public class VoiceAssistantApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Java Voice Assistant ===");
        System.out.println("Available Commands:");
        System.out.println("open google");
        System.out.println("open youtube");
        System.out.println("open notepad");
        System.out.println("open setting");
        System.out.println("shutdown");
        System.out.println("cancel shutdown");
        System.out.println("time");
        System.out.println("search java");
        System.out.println("exit");

        while (true) {

            System.out.print("\nEnter Command: ");
            String command = sc.nextLine().toLowerCase();

            try {

                if (command.contains("open google")) {
                    BrowserActions.openGoogle();
                }

                else if (command.contains("open youtube")) {
                    BrowserActions.openYoutube();
                }

                else if (command.startsWith("search")) {

                    String text = command.replace("search", "").trim();

                    if(text.isEmpty()) {
                        System.out.println("Please enter something to search.");
                    } else {
                        BrowserActions.searchGoogle(text);
                    }
                }

                else if (command.contains("open notepad")) {
                    SystemActions.openNotepad();
                }
                else if (command.contains("open setting")) {
                    Runtime.getRuntime().exec("cmd /c start ms-settings:");
                    System.out.println("Opening setting");

                } else if (command.contains("shutdown")) {
                    Runtime.getRuntime().exec("shutdown /s /t 5");
                    System.out.println("Shutting Down System in 5 Seconds");

                } else if (command.contains("cancel shutdown")) {
                    Runtime.getRuntime().exec("shutdwon /a ");
                    System.out.println("Shutdown cancelled");

                } else if (command.contains("time")) {
                    TimeActions.showTime();
                }

                else if (command.contains("exit")) {
                    break;
                }

                else {
                    System.out.println("Command not recognized.");
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        sc.close();
    }
}
