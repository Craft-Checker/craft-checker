package minecraft_app.minecraftchecker;

import java.util.ArrayList;

import la_hacks.minecraftchecker.R;

/**
 * Created by Marion on 5/18/15.
 *
 * This class is specifically for all of the crafting receipts.
 * This will be very long. It builds the data to be used in the Table class
 */
public class ReceiptBuilder {
    private ArrayList<Item[]> receipts = new ArrayList<>();
    public ReceiptBuilder() {
        // Currently these are only a few receipts for testing
        receipts.add(new Item[]{
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.iron_helmet, "iron_helmet")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.glass, "glass"),
                new Item(0, "blank"),
                new Item(R.drawable.glass, "glass"),
                new Item(0, "blank"),
                new Item(R.drawable.glass, "glass"),
                new Item(0, "blank"),
                new Item(R.drawable.glass_bottle, "glass_bottle")});
    }
    public ArrayList<Item[]> getReceipts() {
        return this.receipts;
    }
}
