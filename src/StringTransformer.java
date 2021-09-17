public abstract class StringTransformer{
    protected String str;
    public StringTransformer(){

    }
    public StringTransformer(String str){
        this.str = str;
    }
    public abstract String transform();

    public void setStr(String str) {
        this.str = str;
    }
    public String getStr() {
        return str;
    }
}
