package week1;

// 24th Jan22
public class Hosting {
    private int id;
    private String name;
    private String url;

    public Hosting (int lId, String name, String url){
        id = lId;
        this.name = name;
        this.url = url;
    }

    public String getName(){
        return this.name;
    }

}
