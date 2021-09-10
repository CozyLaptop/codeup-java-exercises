public class Person {
    private String name;
    public String getName(){
        return name;
//TODO: return the person's name
    }

    public void setName(String name){
        this.name = name;
//TODO: change the name property to the passed value
    }
    public void sayHello(){
        System.out.println("Hello, " + name);
//TODO: print a message to the console using the person's name

    }
    public Person (){

    }
    public Person (String name){
        this.name = name;
    }
}
