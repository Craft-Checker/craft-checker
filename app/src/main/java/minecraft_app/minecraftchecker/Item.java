package minecraft_app.minecraftchecker;

/**
 * Created by Marion on 4/26/15.
 */
public class Item {
    private int imageRes;
    private String name;

    public Item(int imageRes, String name) {
        this.imageRes = imageRes;
        this.name = name;
    }

    public int getImageRes() {
        return imageRes;
    }
    public String getName() { return name; }
    public void setImageRes(int imageRes) {this.imageRes = imageRes; }
    public void setName(String name) {this.name = name; }
    public Item getCopy() {
        Item copy = new Item(this.imageRes, this.name);
        return copy;
    }
}
