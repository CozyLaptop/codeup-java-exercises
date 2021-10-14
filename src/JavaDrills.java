
// Work in progress flip first and last character
public class JavaDrills {
    public static String flipOuterCase(String str){
        String newString = "";
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (Character.isUpperCase(c)){
                newString += Character.toString(c).toLowerCase();
            } else newString += Character.toString(c).toUpperCase();
        }
        return newString;
    }

    public static void main(String[] args) {
        System.out.println(flipOuterCase("GrEaT"));
    }
}
