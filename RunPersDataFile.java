import java.io.*;
import java.util.*;
public class RunPersDataFile{
  public static void main(String[] args) throws IOException {
    //PART 3 OF HW SAVE AND READ FROM A FILE
    String filename = "myPersonalData.txt";
    File personalData = new File(filename);
    //if the file does not exist make it
    if(!personalData.exists()){
      personalData.createNewFile();
      System.out.println(filename+" was created");
    }

    //make filewriter instance w personalData file & BF instance w FW
    FileWriter fw = new FileWriter(personalData);
    BufferedWriter writeToFile = new BufferedWriter(fw);



    //create an arraylist to store our object which holds the
    ArrayList<PersonalData> pData = new ArrayList<PersonalData>();

    Console c = System.console();
    if(c == null){
      System.err.println("No console, so...");
      System.exit(1);
    }

    while(true){
      //create placeholders for the params we are going to pass into our PData constructor
        String firstN = null;
        String lastN = null;
        String zipCode = null;

        String input = c.readLine("enter a first and last name & zip seperated by tabkey, type quit to exit: ");

          String[] persDataSplitTab = input.split("\t");


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

          for(PersonalData pD : pData){
            writeToFile.write(pD.getFirstName()+ " " +pD.getLastName()+" "+pD.getZip()+System.lineSeparator());
          }
          writeToFile.close();
          //=============================READING======================================
          BufferedReader reader = new BufferedReader(new FileReader(filename));
          String ln;
          while((ln = reader.readLine()) != null){
            System.out.println(ln);
          }

          System.exit(0);
        }
    }
  }
}
