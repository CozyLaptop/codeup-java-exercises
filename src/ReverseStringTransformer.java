public class ReverseStringTransformer extends StringTransformer{
    public ReverseStringTransformer(String str){
        setStr(str);
    }
    public String transform() {
        return new StringBuilder(str).reverse().toString();
    }
}
