package minecraft_app.minecraftchecker;

import java.util.ArrayList;
import la_hacks.minecraftchecker.R;

/**
 * Created by Marion on 5/16/15.
 */
public class Table {

    // Each item array will be length of 10
    // format as follows:
    // - First row of table are elements 0,1,2 in array
    // - Second row of table are elements 3,4,5 in array
    // - Last row of table are elements 6,7,8 in array
    // Element 9 is the result item of the 3 rows in the receipt
    private ArrayList<Item[]> receipts = new ArrayList<>();

    // Keeping items on table as separate variables for clarity
    private Item topLeft;
    private Item topCenter;
    private Item topRight;
    private Item left;
    private Item center;
    private Item right;
    private Item bottomLeft;
    private Item bottomCenter;
    private Item bottomRight;
    private Item result;

    private int index;

    public Table() {
        // Initialize all items as default "box" item. "Box" is a placeholder so items are never null.
        topLeft = new Item(R.drawable.box, "box");
        topCenter = new Item(R.drawable.box, "box");
        topRight = new Item(R.drawable.box, "box");
        left = new Item(R.drawable.box, "box");
        center = new Item(R.drawable.box, "box");
        right = new Item(R.drawable.box, "box");
        bottomLeft = new Item(R.drawable.box, "box");
        bottomCenter = new Item(R.drawable.box, "box");
        bottomRight = new Item(R.drawable.box, "box");
        result = new Item(R.drawable.box, "box");
        index = 0;

        // Populate receipts here. When app is complete, this part will be HUGE. Consider alternate way to populate receipts in future.
        // Note: Using "box" for absence of an item on a particular table slot
        receipts.add(new Item[]{
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.box, "box"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.box, "box"),
                new Item(R.drawable.box, "box"),
                new Item(R.drawable.box, "box"),
                new Item(R.drawable.iron_helmet, "iron_helmet")});
    }

    // Manual setters, getters (might not need getters, keep for now though for debugging)
    public void setTopLeft(Item item) {
        topLeft = item;
    }
    public void setTopCenter(Item item) {
        topCenter = item;
    }
    public void setTopRight(Item item) {
        topRight = item;
    }
    public void setLeft(Item item) {
        left = item;
    }
    public void setCenter(Item item) {
        center = item;
    }
    public void setRight(Item item) {
        right = item;
    }
    public void setBottomLeft(Item item) {
        bottomLeft = item;
    }
    public void setBottomCenter(Item item) {
        bottomCenter = item;
    }
    public void setBottomRight(Item item) {
        bottomRight = item;
    }
    public void setResult(Item item) {
        result = item;
    }
    public void clearTable() {
        // Set all items to default "box" items
        topLeft.setImageRes(R.drawable.box);
        topLeft.setName("box");
        topCenter.setImageRes(R.drawable.box);
        topCenter.setName("box");
        topRight.setImageRes(R.drawable.box);
        topRight.setName("box");
        left.setImageRes(R.drawable.box);
        left.setName("box");
        center.setImageRes(R.drawable.box);
        center.setName("box");
        right.setImageRes(R.drawable.box);
        right.setName("box");
        bottomLeft.setImageRes(R.drawable.box);
        bottomLeft.setName("box");
        bottomCenter.setImageRes(R.drawable.box);
        bottomCenter.setName("box");
        bottomRight.setImageRes(R.drawable.box);
        bottomRight.setName("box");
        result.setImageRes(R.drawable.box);
        result.setName("box");
    }
    public boolean isTableReceipt() {
        for(int i = 0; i < receipts.size(); i++) {
            // To-do: somehow need to check if table is a receipt
            //        by stepping through the receipts ArrayList
        }
        return false;
    }
    public boolean resultHasReceipt() {
        return false;
    }
}

