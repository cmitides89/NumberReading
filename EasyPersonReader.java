import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;

public class EasyPersonReader{
  public static void main(String[] args) {
    String fileName = "peopleData.txt";
    File dataFile = new File(fileName);



    String input ="";
    Scanner scan = new Scanner(System.in);
    ArrayList<PersonalData> personData = new ArrayList<PersonalData>();

    while(!input.equals("quit")){
      System.out.println("Enter firstName, lastName & zip seperated by tab, type quit to exit");
      input = scan.nextLine();
      String[] personDataSplit = input.split("\t");
      if(!input.equals("quit")){
        personData.add(new PersonalData(personDataSplit[0]
                          , personDataSplit[1]
                          , Integer.parseInt(personDataSplit[2])));
      }
    }
    for(int i = 0; i<personData.size(); i++){
      System.out.println(personData.get(i).toString());
    }
  }
}
