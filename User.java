package project;
import java.util.Vector;
public class User 
{
  public String Name;
  public String Email;
  public String Password;
  public String Phone;
  public Vector  myUsercontroller;
  public void setname(String n) 
  {   Name=n;
  }
  public void setemail(String E) 
  {  Email=E;
  }
  public void setpassword(String P) 
  { Password=P;
  }
  public void setphone(String Ph) 
  { Phone =Ph;
  }
  public String getname()
  {
  return Name;
  }
  public String getEmail()
  {
  return Email;
  }
  public String getPassword() 
  {
  return Password;
  }  
  public String getPhone() 
  {
  return Phone;
  } 
}
