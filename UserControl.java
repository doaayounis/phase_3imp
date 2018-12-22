package project;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.Scanner;
public class UserControl 
{
    public List<User> user=new ArrayList();
    public Vector<String> myUsermail = new Vector();
    public Vector<String> myUserpass = new Vector();
    //public Vector  myuserservice;
    Scanner input = new Scanner (System.in);
    
    public void login()
    {
       User U = new User();
       System.out.println("Please enter your Email:");
       String mail = input.next();
       U.setemail(mail);
      //myUsermail.add(mail);
       System.out.println("Please enter your Password:");
       String pass = input.next();
       U.setpassword(pass);
       while(!myUsermail.contains(mail) || !myUserpass.contains(pass))
                 {
                      System.out.println("unfortunately! can't find this user account:");
                      System.out.println("Try again:");
                      System.out.println("Email:");  mail = input.next();
                      System.out.println("password:");  pass = input.next();
                    
                 }
       if(myUsermail.contains(mail) && myUserpass.contains(pass))
                 {
                      System.out.println("Great! valid data, you can access your account:");
                 }        
    }
    
    public void Register()
    {
        User U = new User();
        System.out.println("Please enter your Name:");
        String name = input.next();
        U.setname(name);
        System.out.println("Please enter your Email:");
        String mail = input.next();
        //U.setemail(mail);
        System.out.println("Please enter your Password:");
        String pass = input.next();
        //U.setpassword(pass);
        System.out.println("Please enter your phone number:");
        String phon = input.next();
        //U.setphone(phon);
        
        while(!mail.contains("@") && !mail.contains(".") && pass.length()<8 && phon.length()!=11)
        {
            System.out.println("Error data,try agian");
            System.out.println("Name:"); name = input.next();
            System.out.println("Email:"); mail = input.next();
            System.out.println("Password:"); pass = input.next();
            System.out.println("Phone number:"); phon = input.next();
      
        }
        if(mail.contains("@") && mail.contains(".") && pass.length()>=8 && phon.length()==11)
            {
                 U.setemail(mail);
                 U.setpassword(pass);
                 U.setphone(phon);
                 while(user.contains(mail) && user.contains(pass))
                 {
                      System.out.println("Already exist,try again");
                      System.out.println("Email:");mail = input.next();
                      System.out.println("Password:"); pass = input.next();
                 }
                if(!user.contains(mail) && !user.contains(pass))
                 {
                     myUsermail.add(mail);
                     myUserpass.add(pass);
                     System.out.println("you can login now:"); 
                 }       
            }     
       user.add(U);
       //System.out.println(user);
       login();
    }
}
