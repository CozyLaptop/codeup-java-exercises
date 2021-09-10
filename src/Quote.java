public class Quote {
    public static String randomQuote(){
        int randomNumber = (int) (Math.random() * 4 + 1);
        String quote;
        if (randomNumber == 1){
            quote = "\"If life were predictable it would cease to be life and be without flavor.\" -Eleanor Roosevelt";
        } else
        if (randomNumber == 2){
            quote ="\"Life is a succession of lessons which must be lived to be understood.\" -Ralph Waldo Emerson";
        } else
        if (randomNumber == 3){
            quote = "\"The only impossible journey is the one you never begin.\" -Tony Robbins";
        } else {
            quote = "\"Life is really simple, but we insist on making it complicated.\" -Confucius";
        }
        return quote;
    }
}
