import java.awt.image.BufferedImage;
import java.util.Date;

public class post_DAControl {
	private post_DB PDS ;
	private post po;
	
	public post_DAControl(){}
	public post_DAControl(post_DB PDS,post po)
	{this.PDS=PDS;
	 this.po=po;
	}


public void InsertPost() {
	
		PDS.Posts.add(po);
		System.out.println("addedddddd");
}


public void SearchPost(String Title , String Typ){
	System.out.println("search function -->");
	for (int i=0 ; i<PDS.Posts.size();i++)
	{
	if(PDS.Posts.get(i).gettitle().equals(Title)&&PDS.Posts.get(i).gettype().equals(Typ))
	{  
		System.out.println(PDS.Posts.get(i).getdescrip()+"     "+PDS.Posts.get(i).getid()+"     "
				+PDS.Posts.get(i).gettitle()+"     "
				+PDS.Posts.get(i).gettype()+"     "
				+PDS.Posts.get(i).getdate()+"     ");
	
	}
	else 
	{
		System.out.println("error!  post not found");
	}
	}
	
	

}

public void deletePost(int ID){
	for (int i=0 ; i<PDS.Posts.size();i++)
	{
	if(PDS.Posts.get(i).getid()==ID)
	{
	PDS.Posts.remove(i);
	DisplayPost();
	}
	else 
	{
		System.out.println("error!  post not found");
	}
	}
	
	
}

public void DisplayPost(){
	for(int i=0;i<PDS.Posts.size();i++)
	{
	System.out.println(PDS.Posts.get(i).getdescrip()+"     "+PDS.Posts.get(i).getid()+"     "
	+PDS.Posts.get(i).gettitle()+"     "
	+PDS.Posts.get(i).gettype()+"     "
	+PDS.Posts.get(i).getdate()+"     ");
	}
	

}

}//class