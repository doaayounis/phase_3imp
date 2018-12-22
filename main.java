import java.util.Scanner;
import java.awt.image.*;
import java.io.*;
import java.awt.image.renderable.*;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class main {
	
	
	 public static void main(String[] args)
	   
	    {  
		
		 UserControl obj = new UserControl();
         obj.Register();
		 
		ArrayList<post> Posts= new ArrayList<post>();
		int id=0;
		 Scanner input = new Scanner(System.in);
	    for(int i=0 ;i<2;i++)
	    {post pos=new post();
		 
		 System.out.print("Describtion:");
		String Desc = input.next();
		
		System.out.print("Title:");
		String tit = input.next();
		
		System.out.print("Type of Item");
		String typ = input.next();
		//System.out.println("ImageSrc:");
	     id++;
		//String img_src = input.next();
		//BufferedImage Imge=ImageIO.read(getClass().getResource(img_src));
		pos.setdescrip(Desc);
		pos.settitle(tit);
		pos.settype(typ);
		pos.setdate();
		pos.setid(id);
		
		post_DB pds=new post_DB(Posts);
		
		
		post_DAControl p=new post_DAControl(pds,pos);
		p.InsertPost();
		p.DisplayPost();
		p.SearchPost("bag","geld");
		p.deletePost(2);
		
	    }
	 
		
	 

}
}
