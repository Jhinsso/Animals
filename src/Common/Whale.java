package Common;

public class Whale implements Animals {
    public String name;
    private String age;

    @Override
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    @Override
    public String getAge(){
        return age;
    }
    public void setAge(String age){
        this.age=age;
    }
}
