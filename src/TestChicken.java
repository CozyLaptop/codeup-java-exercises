public class TestChicken {
    public static void main(String[] args) {
        Chicken lilChicken = new Chicken("Booster", "Bakah!");
//        Chicken should make it's noise here
//        lilChicken.name = "Booster";
//        lilChicken.sound = "Ba kah!";
        lilChicken.makeNoise();
        lilChicken.makeNoise();
        lilChicken.makeNoise();
        lilChicken.layEgg();
        lilChicken.layEgg();
        lilChicken.layEgg();
    }
}
