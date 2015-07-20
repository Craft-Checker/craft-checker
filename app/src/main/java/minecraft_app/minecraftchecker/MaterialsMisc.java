package minecraft_app.minecraftchecker;

import java.util.ArrayList;

import la_hacks.minecraftchecker.R;

/**
 * Created by Marion on 7/19/15.
 */
public class MaterialsMisc {
    private ArrayList<Item[]> receipts = new ArrayList<>();

    public MaterialsMisc() {
        // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  MATERIALS / MISC  <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

        receipts.add(new Item[]{                                    // Block of Coal
                new Item(R.drawable.coal, "coal"),
                new Item(R.drawable.coal, "coal"),
                new Item(R.drawable.coal, "coal"),
                new Item(R.drawable.coal, "coal"),
                new Item(R.drawable.coal, "coal"),
                new Item(R.drawable.coal, "coal"),
                new Item(R.drawable.coal, "coal"),
                new Item(R.drawable.coal, "coal"),
                new Item(R.drawable.coal, "coal"),
                new Item(R.drawable.block_of_coal, "block_of_coal")});

        receipts.add(new Item[]{                                    // Book - default center
                new Item(0, "blank"),
                new Item(R.drawable.paper, "paper"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.paper, "paper"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.paper, "paper"),
                new Item(0, "blank"),
                new Item(R.drawable.book, "book")});
        receipts.add(new Item[]{
                new Item(R.drawable.paper, "paper"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.paper, "paper"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.paper, "paper"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.book, "book")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.paper, "paper"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.paper, "paper"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.paper, "paper"),
                new Item(R.drawable.book, "book")});

        receipts.add(new Item[]{                                    // Book and Quill - default bottom left
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.feather, "feather"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.ink_sac, "ink_sac"),
                new Item(R.drawable.book, "book"),
                new Item(0, "blank"),
                new Item(R.drawable.book_and_quill, "book_and_quill")});
        receipts.add(new Item[]{
                new Item(R.drawable.feather, "feather"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.ink_sac, "ink_sac"),
                new Item(R.drawable.book, "book"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.book_and_quill, "book_and_quill")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(R.drawable.feather, "feather"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.ink_sac, "ink_sac"),
                new Item(R.drawable.book, "book"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.book_and_quill, "book_and_quill")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.feather, "feather"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.ink_sac, "ink_sac"),
                new Item(R.drawable.book, "book"),
                new Item(R.drawable.book_and_quill, "book_and_quill")});

        receipts.add(new Item[]{                                    // Clay Block - default bottom left
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.clay, "clay"),
                new Item(R.drawable.clay, "clay"),
                new Item(0, "blank"),
                new Item(R.drawable.clay, "clay"),
                new Item(R.drawable.clay, "clay"),
                new Item(0, "blank"),
                new Item(R.drawable.clay_block, "clay_block")});
        receipts.add(new Item[] {
                new Item(R.drawable.clay, "clay"),
                new Item(R.drawable.clay, "clay"),
                new Item(0, "blank"),
                new Item(R.drawable.clay, "clay"),
                new Item(R.drawable.clay, "clay"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.clay_block, "clay_block")});
        receipts.add(new Item[] {
                new Item(0, "blank"),
                new Item(R.drawable.clay, "clay"),
                new Item(R.drawable.clay, "clay"),
                new Item(0, "blank"),
                new Item(R.drawable.clay, "clay"),
                new Item(R.drawable.clay, "clay"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.clay_block, "clay_block")});
        receipts.add(new Item[] {
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.clay, "clay"),
                new Item(R.drawable.clay, "clay"),
                new Item(0, "blank"),
                new Item(R.drawable.clay, "clay"),
                new Item(R.drawable.clay, "clay"),
                new Item(R.drawable.clay_block, "clay_block")});

        receipts.add(new Item[]{                                         // Stick - default bottom center
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick")});
        receipts.add(new Item[]{
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.stick, "stick")});

        receipts.add(new Item[]{                                    // Wooden Plank - Default to center
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wood, "wood"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank")});
        receipts.add(new Item[]{
                new Item(R.drawable.wood, "wood"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(R.drawable.wood, "wood"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wood, "wood"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wood, "wood"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wood, "wood"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wood, "wood"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wood, "wood"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wood, "wood"),
                new Item(R.drawable.wooden_plank, "wooden_plank")});

        receipts.add(new Item[]{                                         // Paper - default to center
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.sugar_cane, "sugar_cane"),
                new Item(R.drawable.sugar_cane, "sugar_cane"),
                new Item(R.drawable.sugar_cane, "sugar_cane"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.paper, "paper")});
        receipts.add(new Item[]{
                new Item(R.drawable.sugar_cane, "sugar_cane"),
                new Item(R.drawable.sugar_cane, "sugar_cane"),
                new Item(R.drawable.sugar_cane, "sugar_cane"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.paper, "paper")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.sugar_cane, "sugar_cane"),
                new Item(R.drawable.sugar_cane, "sugar_cane"),
                new Item(R.drawable.sugar_cane, "sugar_cane"),
                new Item(R.drawable.paper, "paper")});

        receipts.add(new Item[]{                                    // Gold
                new Item(R.drawable.gold_nugget, "gold_nugget"),
                new Item(R.drawable.gold_nugget, "gold_nugget"),
                new Item(R.drawable.gold_nugget, "gold_nugget"),
                new Item(R.drawable.gold_nugget, "gold_nugget"),
                new Item(R.drawable.gold_nugget, "gold_nugget"),
                new Item(R.drawable.gold_nugget, "gold_nugget"),
                new Item(R.drawable.gold_nugget, "gold_nugget"),
                new Item(R.drawable.gold_nugget, "gold_nugget"),
                new Item(R.drawable.gold_nugget, "gold_nugget"),
                new Item(R.drawable.gold, "gold")});

        receipts.add(new Item[]{                                    // Iron Block
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron_block, "iron_block")});

        receipts.add(new Item[]{                                    // Gold Block
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.gold_block, "gold_block")});

        receipts.add(new Item[]{                                    // Diamond Block
                new Item(R.drawable.diamond, "diamond"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(R.drawable.diamond_block, "diamond_block")});
    }
    public ArrayList<Item[]> getMaterialsMiscReceipts() {
        return receipts;
    }
}
