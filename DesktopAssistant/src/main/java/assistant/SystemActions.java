
package assistant;

public class SystemActions {

    public static void openNotepad() throws Exception {

        Runtime.getRuntime().exec("notepad");

        System.out.println("Opening Notepad...");
    }

}
