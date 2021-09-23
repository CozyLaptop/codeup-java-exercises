public class Comedy extends Movie{
    private boolean funny;

    public Comedy(String name, String director, boolean isFunny){
        super(name, director);
        this.funny = isFunny;
    }

    public boolean isFunny() {
        return this.funny;
    }

    public void setFunny(boolean funny) {
        this.funny = funny;
    }
}
