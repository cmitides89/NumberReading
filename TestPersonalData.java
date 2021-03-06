import java.io.*;
import java.util.*;
public class TestPersonalData{
  public static void main(String[] args) throws IOException {
    //PART 2 OF HW SAVE AND READ FROM AN OBJECT
    
    //create an arraylist to store our object which holds the
    ArrayList<PersonalData> pData = new ArrayList<PersonalData>();

    Console c = System.console();
    //Java docs shows to do this, I guess it is a safty net in case something
    //goes wrong during loading a console?
    if(c == null){
      System.err.println("No console, so...");
      System.exit(1);
    }
//make an infinate loop to always run, unless user types quit,
    while(true){
      //create placeholders for the params we are going to pass into our PData constructor
        String firstN = null;
        String lastN = null;
        String zipCode = null;
        //use the Console.readLine function to catch the users input
        String input = c.readLine("enter a first and last name & zip seperated by tabkey, type quit to exit: ");
        //store each input into an array, and split it at the tab
          String[] persDataSplitTab = input.split("\t");
          // System.out.println(persDataSplitTab.length);

          //a regular boolean statement input != quit doesnt work ?
          if("quit".equals(input) == false){
            //for each element inside the array, assign it to our placeholders
            for(String el : persDataSplitTab){
              //dont want to overwrite our placeholds so only use them if they are null
                if(firstN == null){
                  firstN = el;
                }else if(firstN != null && lastN == null){
                  lastN = el;
                }else if(firstN != null && lastN != null ){
                  zipCode = el;
                }
            }
          }

          //dont add to arraylist if the placeholders are null
          if(firstN != null && lastN != null && zipCode != null ){
            pData.add(new PersonalData(firstN, lastN, zipCode));
          }

          //when the user types quit we will use the System method exit() to break out of loop
        if("quit".equals(input)){
          System.out.println(pData.size());
          for(int i =0; i < pData.size(); i++){
            System.out.println("================part two HW=====================");
            System.out.println(pData.get(i).getFirstName());
            System.out.println(pData.get(i).getLastName());
            System.out.println(pData.get(i).getZip());
          }
          System.exit(0);
        }
    }
  }
}
