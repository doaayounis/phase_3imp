import java.util.*;
import java.util.Date;
import java.awt.image.*;
import java.io.*;

public class post {
	
     private String descrip="";
	 private String title="" ;
	 private int post_ID;
	 private String type="";
	 private Date date;
	 private BufferedImage Image ;
	
	public post() {}
	public post (String descrip,String title ,int post_ID,String type,Date date ,BufferedImage Image)
	{this.descrip=descrip;
	 this.title=title;
	 this.post_ID=post_ID;
	 this.type=type;
	 this.date=date;
	 //this.Image=Image;
	
	}
	//set , get
	   public String getdescrip() {
	        return descrip;
	    }
	    public void setdescrip(String descrip) {
	        this.descrip = descrip;
	    }
	    public String gettitle() {
	        return title;
	    }
	    public void settitle(String title) {
	        this.title = title;
	    }
	    public String gettype() {
	        return type;
	    }
	    public void settype(String type) {
	        this.type =type;
	    }
	    
	    public int getid() {
	        return post_ID;
	    }
	    public void setid(int post_ID) {
	        this.post_ID =post_ID;
	    }
	   
	    public void setdate() {
	        this.date= new Date();;
	    }
	    public Date getdate() {
	        return date;
	    }
	    
}


