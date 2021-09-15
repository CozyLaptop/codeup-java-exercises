public class Vehicle {
    private String name;
    public void makeNoise(){
        System.out.println("Beep beep!");
    }
    public String getName() {
        try {
            return name;
        } catch (Exception e) {
            return "EMPTY SPOT";
        }
    }
    public void setName(String name) {
        this.name = name;
    }
}
