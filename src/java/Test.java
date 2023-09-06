
import java.io.File;


public class Test {

  public static void main(String[] args) {
    // Specify the directory path you want to list files from
    String folderPath = "D:\\@aliceholic13";

    // Create a File object for the folder
    File folder = new File(folderPath);

    // Check if the folder exists
    if (folder.exists() && folder.isDirectory()) {
      File[] files = folder.listFiles();

      if (files != null) {
        for (File file : files) {
          System.out.println(file.getName());
        }
      }
    }
  }
}
