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
    ArrayList<Integer> doopsList = new ArrayList<Integer>();
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
    for(Integer i : numberList)
      System.out.println(i);

    int countingIndex =0;
    int indexOfi;
    int lastIndexOfi;

    for(int i =0; i < numberList.size(); i++){

      indexOfi = numberList.indexOf(numberList.get(i));
      lastIndexOfi = numberList.lastIndexOf(numberList.get(i));

      if(indexOfi !=  lastIndexOfi && numberList.get(i) != countingIndex){
        System.out.println("in nested for loop");

        for(int j =i; j < numberList.size(); j++){

          if(numberList.get(i) == numberList.get(j)){
            System.out.println(numberList.get(i)+" i is equal to j "+ numberList.get(j));
            numberList.remove(indexOfi);
            myCountingArray[countingIndex] = countDuplicate++;
            System.out.println(myCountingArray[i]);
          }

        }
      }
      countingIndex++;
      countDuplicate = 1;

    }
  }
}
