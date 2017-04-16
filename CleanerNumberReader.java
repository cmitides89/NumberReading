import java.util.*;
public class CleanerNumberReader{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int input = 0;
    int countDuplicate = 0;
    ArrayList<Integer> userList = new ArrayList<Integer>();
    // userList.add(10);
    // userList.add(10);
    // userList.add(9);
    // userList.add(10);
    // userList.add(10);
    // userList.add(9);
    // userList.add(1);
    while(input != -1){
        System.out.println("Enter a number 0 - 100 press -1 to quit");
        input = scan.nextInt();
        if(input != -1)
          userList.add(input);
    }

    Collections.sort(userList);

    ArrayList<Integer> values = new ArrayList<Integer>();
    ArrayList<Integer> count = new ArrayList<Integer>();
    //Iterate over the user list, if a value is not in values list, add it to values list.
    for(int i =0; i < userList.size(); i++){
      //right off the bat, values contains nothing so it will add at least one of each digit
      if(values.contains(userList.get(i))==false){
        values.add(userList.get(i));
        System.out.println("Value added to Values");
      }
    }
    //compare values list to user's list, if values has userlist then count 1
    for(int i =0; i < values.size(); i++){
      // System.out.println("value in values "+values.get(i));
      for(int j = 0; j <userList.size(); j++){
        if(userList.get(j) == values.get(i)){
          countDuplicate++;
          count.add(i, countDuplicate);
        }
      }
      countDuplicate = 0;
      System.out.println("The Value of "+values.get(i)+ " has " +count.get(i)+ " Occurrences.");
    }

    // for(int i = 0; i < count.size(); i++){
    //   System.out.println(count.get(i));
    // }

  }

}
