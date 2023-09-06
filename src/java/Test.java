
import java.io.File;


public class Test {

  public static void main(String[] args) {
    // Specify the directory path you want to list files from
    String folderPath = "D:\\@aliceholic13";

    // Create a File object for the folder
    File folder = new File(folderPath);

    // Check if the folder exists
    if (folder.exists() && folder.isDirectory()) {
      // List all files in the folder
      File[] files = folder.listFiles();

      // Print all file names
      if (files != null) {
        for (File file : files) {
          System.out.println(file.getName());
        }
      }
    } else {
      System.out.println("The specified folder.");
    }
  }
}
