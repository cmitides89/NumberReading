// import java.io.*;
// import java.util.*;
// public class ReadFromFile{
//   public static void main(String[] args) throws IOException{
//     String filename = "myPersonalData.txt";
//     File personalData = new File(filename);
//     String firstN = null;
//     String lastN = null;
//     String zipCode = null;
//
//     ArrayList<PersonalData> pData = new ArrayList<PersonalData>();
//
//     BufferedReader reader = new BufferedReader(new FileReader(filename));
//     String ln;
//     while((ln = reader.readLine()) != null){
//       System.out.println(ln);
//
//       String[] parsedParams = ln.split(" ");
//       for(String parsedP : parsedParams){
//         if(firstN == null){
//           firstN = parsedP;
//         }else if(firstN != null && lastN == null){
//           lastN = parsedP;
//         }else if(firstN != null && lastN != null ){
//           zipCode = parsedP;
//         }
//       }
//       if(firstN != null && lastN != null && zipCode != null ){
//         pData.add(new PersonalData(firstN, lastN, zipCode));
//       }
//
//     }
//
//   }
// }
