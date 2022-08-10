package ProgramowanieObiektowe;

public class ReadOnlyGetterSetter {

    private String name = "Name";

    public String getName(){
        return name;
        // możemy też zmienić np.
        // return name + "jest ok";
    }

    public void setName(String name){
        this.name = name;
    }

}
