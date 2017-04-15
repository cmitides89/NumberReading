import java.io.*;
import java.util.*;
public class TestPersonalData{

  public static void main(String[] args) throws IOException {
    //create an arraylist to store our object which holds the
    ArrayList<PersonalData> pData = new ArrayList<PersonalData>();

    Console c = System.console();

    if(c == null){
      System.err.println("No console, so...");
      System.exit(1);
    }

    while(true){
        String firstN = null;
        String lastN = null;
        String zipCode = null;

        String input = c.readLine("enter a first and last name and a zip: ");

          String[] persDataSplitTab = input.split("\t");
          System.out.println(persDataSplitTab.length);

          if("quit".equals(input) == false){
            for(String el : persDataSplitTab){
                if(firstN == null){
                  firstN = el;
                }else if(firstN != null && lastN == null){
                  lastN = el;
                }else if(firstN != null && lastN != null ){
                  zipCode = el;
                }
            }
          }
          //dont add if the vars are null
          if(firstN != null && lastN != null && zipCode != null ){
            pData.add(new PersonalData(firstN, lastN, zipCode));
          }

        if("quit".equals(input)){
          System.out.println(pData.size());
          for(int i =0; i < pData.size(); i++){
            System.out.println("================part two=====================");
            System.out.println(pData.get(i).getFirstName());
            System.out.println(pData.get(i).getLastName());
            System.out.println(pData.get(i).getZip());
          }
          // System.out.print("bie");
          System.exit(0);
        }
    }

    // System.out.println(input);

  }
}
