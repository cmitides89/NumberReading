public class PersonalData{
  private String firstName;
  private String lastName;
  private int zip;

  PersonalData(){

  }
  PersonalData(String firstName, String lastName, String zip){
    this.firstName = firstName;
    this.lastName = lastName;
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
