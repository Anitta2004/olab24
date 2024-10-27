package oldshelf;

public class Fiction extends Book {
  private final String name;
	private static FictionType type;
	public Fiction(String name,FictionType type) {
		this.name=name;
		this.type=type;
		// TODO  correct the above.
	}
	public String getName(){
		return name;
	}	
	public FictionType getType(){
		return type;
	}

}
