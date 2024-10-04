

public class Person {
    protected String name, birth; // có thể truy cập phạm vi các lớp con

    public Person(String name, String birth) {
        this.name = name;
        this.birth = birth;
    }
    public String getName(){
        return this.name;
    }

    public String toString(){
        return this.name +" "+this.birth;
    }

    public void greet(){
        System.out.println("Ham greet cua lop person");
    }
}
