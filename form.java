import java.io.*; 
import java.util.*; 


class form {

    public static void main(String[] args) {
        // TODO code application logic here
         List l=new ArrayList();
         // System.out.println("Enter the input");
         Scanner input=new Scanner(System.in);
          String a ;
               
        System.out.println("1/ what is coler of your lose thing ?");
         a =input.nextLine();
                 l.add(a);
        System.out.println("2/ what is contain of your lose thing?");
         a =input.nextLine();
                 l.add(a);
        System.out.println("3/ where you lose your lose thing?");
         a =input.nextLine();
                 l.add(a);
        System.out.println("4/  when you lose your lose thing?");
         a =input.nextLine();
                 l.add(a);
        System.out.println("5/ what is material of your lose thing ?");
         a =input.nextLine();
                 l.add(a);
        System.out.println("6/ what is brand of your lose thing? ?");
         a =input.nextLine();
                 l.add(a);
        
        System.out.println(l);
        
        System.out.println("Are this answers is correct?");
        System.out.println(" If correct send y else n ");
        char i=input.next().charAt(0);
        if(i=='Y' || i=='y')
        { 
           System.out.println("owner post mail");
        
        }
        else
             System.out.println("this thing not for you");
        
        

        
        
    }
    
}
