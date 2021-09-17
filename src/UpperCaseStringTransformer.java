public class UpperCaseStringTransformer extends StringTransformer{
    public UpperCaseStringTransformer(String str){
        setStr(str);
    }
    public String transform() {
        return getStr().toUpperCase();
    }
}
