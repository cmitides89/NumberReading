// import java.io.Console;
// import java.util.*;
// import java.io.IOException;
public class PersonalData{
  private String firstName;
  private String lastName;
  private String zip;

  PersonalData(){

  }
  PersonalData(String firstName, String lastName, String zip){
    this.firstName = firstName;
    this.lastName = lastName;
    this.zip = zip;
  }

  public String getFirstName(){
    return this.firstName;
  }

  public String getLastName(){
    return this.lastName;
  }

  public String getZip(){
    return this.zip;
  }

}
