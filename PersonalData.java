public class PersonalData{
  private String firstName;
  private String lastName;
  private int zip;

  PersonalData(){

  }
  PersonalData(String firstName, String lastName, String zip){
    this.firstName = firstName;
    this.lastName = lastName;
    //our input in the test class is a string, so convert the string into int
    this.zip = Integer.parseInt(zip);
  }

  public String getFirstName(){
    return this.firstName;
  }

  public String getLastName(){
    return this.lastName;
  }

  public int getZip(){
    return this.zip;
  }

}
