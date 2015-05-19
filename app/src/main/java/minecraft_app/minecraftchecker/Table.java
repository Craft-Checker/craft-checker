package minecraft_app.minecraftchecker;

import android.util.Log;

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
        // Initialize all items as default "blank" item. "blank" is a placeholder so items are never null.
        topLeft = new Item(0, "blank");
        topCenter = new Item(0, "blank");
        topRight = new Item(0, "blank");
        left = new Item(0, "blank");
        center = new Item(0, "blank");
        right = new Item(0, "blank");
        bottomLeft = new Item(0, "blank");
        bottomCenter = new Item(0, "blank");
        bottomRight = new Item(0, "blank");
        result = new Item(0, "blank");
        index = 0;

        // Populate receipts here. When app is complete, this part will be HUGE. Consider alternate way to populate receipts in future.
        // Note: Using "box" for absence of an item on a particular table slot
        ReceiptBuilder builder = new ReceiptBuilder();
        receipts = builder.getReceipts();
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
        // Set all items to default "blank" items
        topLeft = new Item(0, "blank");
        topCenter = new Item(0, "blank");
        topRight = new Item(0, "blank");
        left = new Item(0, "blank");
        center = new Item(0, "blank");
        right = new Item(0, "blank");
        bottomLeft = new Item(0, "blank");
        bottomCenter = new Item(0, "blank");
        bottomRight = new Item(0, "blank");
        result = new Item(0, "blank");
        index = 0;
    }

    /*
    BIG HUGE NOTE HERE: These boolean methods actually modify the index of a "found" receipt or item.
    This is BAD. Should modify in separate methods so these simply check if it exists without
    trying to calculate the index of the found item or receipt. The key here is controlling
    which item or receipt you are looking for so you can control the behavior of how the table
    displays. Fix this. Works generally "good enough" for now, but it's horrible coding practice.
     */

    public boolean isTableReceipt() {
        boolean found = false;
        Item[] receipt = null;
        for(int i = 0; i < receipts.size() && !found; i++) {
            // To-do: somehow need to check if table is a receipt
            //        by stepping through the receipts ArrayList
            receipt = receipts.get(i);
            if(receipt.length == 10) {
                Log.i("TEST", "Within table, receipt was of length 10");
                if (topLeft.getName().equalsIgnoreCase(receipt[0].getName())
                        && topCenter.getName().equalsIgnoreCase(receipt[1].getName())
                        && topRight.getName().equalsIgnoreCase(receipt[2].getName())
                        && left.getName().equalsIgnoreCase(receipt[3].getName())
                        && center.getName().equalsIgnoreCase(receipt[4].getName())
                        && right.getName().equalsIgnoreCase(receipt[5].getName())
                        && bottomLeft.getName().equalsIgnoreCase(receipt[6].getName())
                        && bottomCenter.getName().equalsIgnoreCase(receipt[7].getName())
                        && bottomRight.getName().equalsIgnoreCase(receipt[8].getName())) {
                    found = true;
                    index = i;
                }
            }
        }
        return found;
    }
    public boolean resultHasReceipt() {
        boolean found = false;
        Item[] receipt = null;
        for(int i = 0; i < receipts.size() && !found; i++) {
            receipt = receipts.get(i);
            if(receipt.length == 10) {
                if (result.getName().equalsIgnoreCase(receipt[9].getName())) {
                    found = true;
                    index = i;
                }
            }
        }
        return found;
    }
    // If either a receipt or a result exists, getting that Item[] will provide both the
    // receipt and result data
    // THIS METHOD IS A BAD IDEA: fix this by splitting into two methods.
    // First method should get the receipt for the item
    // Second method should get the item for a receipt
    public Item[] getMatchingReceipt() {
        boolean receiptExists = resultHasReceipt();
        boolean resultExists = isTableReceipt();
        if(receiptExists || resultExists)
            return receipts.get(index);
        else
            return null;
        // Be careful here. Will return null if no receipt exists. Be sure to check if it exists before trying to get it
    }
}

