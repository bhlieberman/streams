/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package alice;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    // Throw early, throw often
    public static void main(String[] args) throws IOException {
        // PD: How many times does "Alice" show up in the file?

      // Grap the PAth of alice.txt
      Path alicePath = Paths.get("alice_in_wonderland.txt");
//      System.out.println(alicePath.isAbsolute());

      Scanner scanner = null;
      scanner = new Scanner(alicePath);

      String characterName = "Alice";
      HashMap<String, Integer> aliceMap = new HashMap<>();
      aliceMap.put(characterName, 0);
      System.out.println("First Line!" + scanner.nextLine());
      while(scanner.hasNextLine()){
        String currentLine = scanner.nextLine();
        if(currentLine.contains(characterName)){
          // increase count in hashmap
          aliceMap.put(characterName, (aliceMap.get(characterName)) + 1);
        }
      }
      int amountOfAlices = aliceMap.get(characterName);

      // loop throught the file
      // while loop -> condition? While we have text?
      // look line by line for alice


    }

    // Reading with FILE
  public static List<String> getAllLines(String filePath) throws IOException {
      Path path = Paths.get(filePath);
      return Files.readAllLines(path);
  }

  // Read with BufferedReader try catch
  public static void readBufferTryCatch(String filePath) throws IOException{
      Path alicePath = Paths.get(filePath);
      BufferedReader reader = null;

      try{
        reader = Files.newBufferedReader(alicePath);
        String line = reader.readLine();
        while(line != null){
          // Code Logic
          // Advances the line
          line = reader.readLine();
        }
      } catch (IOException ioe) {
        ioe.printStackTrace();
      } finally {
        reader.close();
      }
  }


  // REad with BufferedReader try with resources
  public static void readBufferTryWithResources(String filePath) {
      Path path = Paths.get(filePath);
      try(BufferedReader reader = Files.newBufferedReader(path)){
        String line = reader.readLine();
        while(line != null){
          // Code Logic
          line = reader.readLine();
        }
      } catch (IOException ioe) {
        ioe.printStackTrace();
      }

  }


}
