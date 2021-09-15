public class MiniVan extends Vehicle{
    public MiniVan(){
        this.setName("MiniVan");
    }
    public void makeNoise() {
        System.out.println("Mom car coming through!");
    }
    public void breakDown(){
        super.makeNoise();
        System.out.println("Uh oh, whats that sound??");
    }
}
