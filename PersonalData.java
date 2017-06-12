public class PersonalData{
  public String firstName;
  public String lastName;
  public int zip;

  PersonalData(){

  }
  PersonalData(String firstName, String lastName, int zip){
    this.firstName = firstName;
    this.lastName = lastName;
    this.zip = zip;
  }

  public String toString(){
    return "firstName= "+firstName +" lastName= "+lastName+" zipCode= " + zip;
  }

}
