import java.util.*;
public class NumberReader{
  public static void main(String[] args){
    //create instantce of scanner class
    Scanner scan = new Scanner(System.in);
    int input = 0;
    int countDuplicate = 0;
    //create an array list to store the input numbers
    ArrayList<Integer> numberList = new ArrayList<Integer>();
    numberList.add(10);
    numberList.add(10);
    numberList.add(10);
    numberList.add(9);
    numberList.add(10);
    numberList.add(9);
    numberList.add(9);
    numberList.add(3);
    numberList.add(2);
    numberList.add(1);
    // ArrayList<Integer> numberListCopy = new ArrayList<Integer>();
    // do{
    //   input = scan.nextInt();
    //   System.out.println("Enter a value between 0 - and 50 [ -1 to end ]: " +input);
    //   numberList.add(new Integer(input));
    //   // for(int i =0; i < numberList.size(); i++){
    //   //   System.out.println("number list i is " +numberList.get(i));
    //   // }
    // }while(input != -1);


    // Object[] numListAsArraysObject = numberList.toArray();
    // int[] numListAsArray = new int [numListAsArraysObject.length];
    //
    // for(int i = 0; i < numListAsArray.length; i++){
    //   numListAsArray[i] = (Integer)numListAsArraysObject[i];
    // }
    ArrayList<Integer> values = new ArrayList<Integer>();
    ArrayList<Integer> counting = new ArrayList<Integer>();
    int[] myCountingArray = new int[numberList.size()];
    // int index = numberList.get(0);
    // for(int i = 0; i < numberList.size(); i++){
    //   if(index == numberList.get(i)){
    //     System.out.println(index+" equals " +numberList.get(i));
    //     doopsList.add(numberList.get(i));
    //     countDuplicate++;
    //     System.out.println(countDuplicate);
    //
    //   }
    // }
    // for(Integer i : numberList){
    Collections.sort(numberList);
    int count =1;
for(int i=0; i<numberList.size(); i++){
  if(i<numberList.size()-1){
    if(numberList.get(i)==numberList.get(i+1)){
      count++;
    }
  }else{
    System.out.print(numberList.get(i)+"occurs "+count+ " times");
  }
  if(i<numberList.size()-1 && numberList.get(i)!= numberList.get(i+1)){
    System.out.println(numberList.get(i)+ " occurs "+count+ " times");
    count=1;
  }
}


    // for(Integer i : numberList)
    //   System.out.println(i);
    //
    // int countingIndex =0;
    // int indexOfi;
    // int lastIndexOfi;
    //
    // for(int i =0; i < numberList.size()-1; i++){
    //   if(numberList.get(i) == numberList.get(i+1)){
    //       values.add(numberList.get(i));
    //       // counting.get(i) = counting.get(i+1);
    //       // System.out.println("value of " +values.get(i) +" Is ");
    //   }
    // }
    // for(int i = 0; i < values.size(); i++){
    //   System.out.println(values.get(i));
    // }
  }
}
