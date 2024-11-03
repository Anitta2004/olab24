package newshelf;
import oldshelf.FictionType;
public record Fiction(String name,FictionType ft)implements IBook{
    @Override
    public String getTitle(){
        return name;
    }
}