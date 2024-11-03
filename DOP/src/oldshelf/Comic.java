package oldshelf;
import java.util.*;
public class Comic extends Book {

	private final String Title;

	private final int ageOfMainCharacter;

	public Comic(String Title,int ageOfMainCharacter) {
		this.Title=title;
		this.ageOfMainCharacter=ageOfMainCharacter;
	}
	
	// TODO : create a getter if required.
	public String getTitle(){
		return Title;
	}
	public void setTitle(String Title){
		this.Title=Title;
	}
	@Override
	public String toString() {
		return "Title: "+Title+" | Age of main character: "+ageOfMainCharacter;
	}

	// TODO: Bonus: 
	@Override
	public int hashCode() {
		return Integer.parseInt(Title)+ageOfMainCharacter;
		
	}
	
	// TODO: Bonus: 
	@Override
	public boolean equals(Object o) {
		// TODO: Based on the information about hashCode write the equals method.
		if(this==o)return true;
		else if(o.getClass()!=this.getClass()){return false;}
		else{return hashCode()==o.hashCode();}

	}
}

