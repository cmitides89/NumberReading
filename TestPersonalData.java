import java.io.*;
import java.util.*;
public class TestPersonalData{



  public static void main(String[] args) throws IOException {
    ArrayList<PersonalData> pData = new ArrayList<PersonalData>();
    ArrayList<String> parsedInput = new ArrayList<String>();
    String firstN = null;
    String lastN = null;
    String zipCode = null;
    Console c = System.console();

    if(c == null){
      System.err.println("No console, so...");
      System.exit(1);
    }
    // String input = c.readLine("enter a first and last name and a zip: ");
    while(true){
        String input = c.readLine("enter a first and last name and a zip: ");

          String[] persDataSplitTab = input.split("\t");
          // for(int i =0; i < persDataSplitTab.length; i++){
          //   System.out.println(persDataSplitTab[i].getClass().getName());
          //
          //     pData.add(new PersonalData(persDataSplitTab[i], persDataSplitTab[i], persDataSplitTab[i]));
          //     System.out.println(pData.get(i).getFirstName());
          //     System.out.println(pData.get(i).getLastName());
          //     System.out.println(pData.get(i).getZip());
          // }
          for(String el : persDataSplitTab){
            if(firstN == null){
              firstN = el;
            }else if(firstN != null){
              lastN = el;
            }else if(firstN == null && zipCode != null ){
              zipCode = el;
            }
          }
          pData.add(new PersonalData(firstN, lastN, zipCode));
          firstN = null;
          lastN = null;
          zipCode = null;
        // System.out.println(input);

        if("quit".equals(input)){
          // System.out.println(pData.size());
          for(int i =0; i < pData.size(); i++){
            System.out.println("part two=====================");
            System.out.println(pData.get(i).getFirstName());
            System.out.println(pData.get(i).getLastName());
            System.out.println(pData.get(i).getZip());
            // System.out.println(pData.get(i));
            // for(int j =0; j < pData.get(i).length; j++){
            //   pData.get(i);
            // }
          }
          System.out.print("bie");
          System.exit(0);
        }
    }

    // System.out.println(input);

  }
}
