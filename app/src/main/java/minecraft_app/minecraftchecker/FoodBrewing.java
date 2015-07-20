package minecraft_app.minecraftchecker;

import java.util.ArrayList;

import la_hacks.minecraftchecker.R;

/**
 * Created by Marion on 7/19/15.
 */
public class FoodBrewing {
    private ArrayList<Item[]> receipts = new ArrayList<>();

    public FoodBrewing() {

        // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  FOOD / BREWING  <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

        receipts.add(new Item[]{                                // Sugar - Default to center
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.sugar_cane, "sugar_cane"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.sugar, "sugar")});
        receipts.add(new Item[]{
                new Item(R.drawable.sugar_cane, "sugar_cane"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.sugar, "sugar")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(R.drawable.sugar_cane, "sugar_cane"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.sugar, "sugar")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.sugar_cane, "sugar_cane"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.sugar, "sugar")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.sugar_cane, "sugar_cane"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.sugar, "sugar")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.sugar_cane, "sugar_cane"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.sugar, "sugar")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.sugar_cane, "sugar_cane"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.sugar, "sugar")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.sugar_cane, "sugar_cane"),
                new Item(0, "blank"),
                new Item(R.drawable.sugar, "sugar")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.sugar_cane, "sugar_cane"),
                new Item(R.drawable.sugar, "sugar")});

        receipts.add(new Item[]{                                // Cake
                new Item(R.drawable.milk, "milk"),
                new Item(R.drawable.milk, "milk"),
                new Item(R.drawable.milk, "milk"),
                new Item(R.drawable.sugar, "sugar"),
                new Item(R.drawable.egg, "egg"),
                new Item(R.drawable.sugar, "sugar"),
                new Item(R.drawable.wheat, "wheat"),
                new Item(R.drawable.wheat, "wheat"),
                new Item(R.drawable.wheat, "wheat"),
                new Item(R.drawable.cake, "cake")});

        receipts.add(new Item[]{                                // Golden Apple
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.apple, "apple"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.golden_apple, "golden_apple")});

        receipts.add(new Item[]{                                // Enchanted Golden Apple
                new Item(R.drawable.gold_block, "gold_block"),
                new Item(R.drawable.gold_block, "gold_block"),
                new Item(R.drawable.gold_block, "gold_block"),
                new Item(R.drawable.gold_block, "gold_block"),
                new Item(R.drawable.apple, "apple"),
                new Item(R.drawable.gold_block, "gold_block"),
                new Item(R.drawable.gold_block, "gold_block"),
                new Item(R.drawable.gold_block, "gold_block"),
                new Item(R.drawable.gold_block, "gold_block"),
                new Item(R.drawable.enchanted_golden_apple, "enchanted_golden_apple")});

        receipts.add(new Item[]{                                // Pumpkin Seeds - Default to center
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.pumpkin, "pumpkin"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.pumpkin_seeds, "pumpkin_seeds")});
        receipts.add(new Item[]{
                new Item(R.drawable.pumpkin, "pumpkin"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.pumpkin_seeds, "pumpkin_seeds")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(R.drawable.pumpkin, "pumpkin"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.pumpkin_seeds, "pumpkin_seeds")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.pumpkin, "pumpkin"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.pumpkin_seeds, "pumpkin_seeds")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.pumpkin, "pumpkin"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.pumpkin_seeds, "pumpkin_seeds")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.pumpkin, "pumpkin"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.pumpkin_seeds, "pumpkin_seeds")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.pumpkin, "pumpkin"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.pumpkin_seeds, "pumpkin_seeds")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.pumpkin, "pumpkin"),
                new Item(0, "blank"),
                new Item(R.drawable.pumpkin_seeds, "pumpkin_seeds")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.pumpkin, "pumpkin"),
                new Item(R.drawable.pumpkin_seeds, "pumpkin_seeds")});

        receipts.add(new Item[]{                                         // Pumpkin Pie - default to bottom left
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.pumpkin, "pumpkin"),
                new Item(R.drawable.sugar, "sugar"),
                new Item(0, "blank"),
                new Item(R.drawable.egg, "egg"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.pumpkin_pie, "pumpkin_pie")});
        receipts.add(new Item[]{
                new Item(R.drawable.pumpkin, "pumpkin"),
                new Item(R.drawable.sugar, "sugar"),
                new Item(0, "blank"),
                new Item(R.drawable.egg, "egg"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.pumpkin_pie, "pumpkin_pie")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(R.drawable.pumpkin, "pumpkin"),
                new Item(R.drawable.sugar, "sugar"),
                new Item(0, "blank"),
                new Item(R.drawable.egg, "egg"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.pumpkin_pie, "pumpkin_pie")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.pumpkin, "pumpkin"),
                new Item(R.drawable.sugar, "sugar"),
                new Item(0, "blank"),
                new Item(R.drawable.egg, "egg"),
                new Item(0, "blank"),
                new Item(R.drawable.pumpkin_pie, "pumpkin_pie")});

        receipts.add(new Item[]{                                // Melon
                new Item(R.drawable.melon_slice, "melon_slice"),
                new Item(R.drawable.melon_slice, "melon_slice"),
                new Item(R.drawable.melon_slice, "melon_slice"),
                new Item(R.drawable.melon_slice, "melon_slice"),
                new Item(R.drawable.melon_slice, "melon_slice"),
                new Item(R.drawable.melon_slice, "melon_slice"),
                new Item(R.drawable.melon_slice, "melon_slice"),
                new Item(R.drawable.melon_slice, "melon_slice"),
                new Item(R.drawable.melon_slice, "melon_slice"),
                new Item(R.drawable.melon, "melon")});

        receipts.add(new Item[]{                                // Melon Seeds - Default to center
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.melon_slice, "melon_slice"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.melon_seeds, "melon_seeds")});
        receipts.add(new Item[]{
                new Item(R.drawable.melon_slice, "melon_slice"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.melon_seeds, "melon_seeds")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(R.drawable.melon_slice, "melon_slice"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.melon_seeds, "melon_seeds")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.melon_slice, "melon_slice"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.melon_seeds, "melon_seeds")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.melon_slice, "melon_slice"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.melon_seeds, "melon_seeds")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.melon_slice, "melon_slice"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.melon_seeds, "melon_seeds")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.melon_slice, "melon_slice"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.melon_seeds, "melon_seeds")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.melon_slice, "melon_slice"),
                new Item(0, "blank"),
                new Item(R.drawable.melon_seeds, "melon_seeds")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.melon_slice, "melon_slice"),
                new Item(R.drawable.melon_seeds, "melon_seeds")});

        receipts.add(new Item[]{                                         // Glistering Melon
                new Item(R.drawable.gold_nugget, "gold_nugget"),
                new Item(R.drawable.gold_nugget, "gold_nugget"),
                new Item(R.drawable.gold_nugget, "gold_nugget"),
                new Item(R.drawable.gold_nugget, "gold_nugget"),
                new Item(R.drawable.melon_slice, "melon_slice"),
                new Item(R.drawable.gold_nugget, "gold_nugget"),
                new Item(R.drawable.gold_nugget, "gold_nugget"),
                new Item(R.drawable.gold_nugget, "gold_nugget"),
                new Item(R.drawable.gold_nugget, "gold_nugget"),
                new Item(R.drawable.glistering_melon, "glistering_melon")});

        receipts.add(new Item[] {                                        // Hay Bale
                new Item(R.drawable.wheat, "wheat"),
                new Item(R.drawable.wheat, "wheat"),
                new Item(R.drawable.wheat, "wheat"),
                new Item(R.drawable.wheat, "wheat"),
                new Item(R.drawable.wheat, "wheat"),
                new Item(R.drawable.wheat, "wheat"),
                new Item(R.drawable.wheat, "wheat"),
                new Item(R.drawable.wheat, "wheat"),
                new Item(R.drawable.wheat, "wheat"),
                new Item(R.drawable.hay_bale, "hay_bale")});

        receipts.add(new Item[]{                                         // Bread - default to center
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wheat, "wheat"),
                new Item(R.drawable.wheat, "wheat"),
                new Item(R.drawable.wheat, "wheat"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.bread, "bread")});
        receipts.add(new Item[]{
                new Item(R.drawable.wheat, "wheat"),
                new Item(R.drawable.wheat, "wheat"),
                new Item(R.drawable.wheat, "wheat"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.bread, "bread")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wheat, "wheat"),
                new Item(R.drawable.wheat, "wheat"),
                new Item(R.drawable.wheat, "wheat"),
                new Item(R.drawable.bread, "bread")});

        receipts.add(new Item[]{                                         // Cookie - default to center
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wheat, "wheat"),
                new Item(R.drawable.cocoa_beans, "cocoa_beans"),
                new Item(R.drawable.wheat, "wheat"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.cookie, "cookie")});
        receipts.add(new Item[]{
                new Item(R.drawable.wheat, "wheat"),
                new Item(R.drawable.cocoa_beans, "cocoa_beans"),
                new Item(R.drawable.wheat, "wheat"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.cookie, "cookie")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wheat, "wheat"),
                new Item(R.drawable.cocoa_beans, "cocoa_beans"),
                new Item(R.drawable.wheat, "wheat"),
                new Item(R.drawable.cookie, "cookie")});

        receipts.add(new Item[]{                                         // Golden Carrot
                new Item(R.drawable.gold_nugget, "gold_nugget"),
                new Item(R.drawable.gold_nugget, "gold_nugget"),
                new Item(R.drawable.gold_nugget, "gold_nugget"),
                new Item(R.drawable.gold_nugget, "gold_nugget"),
                new Item(R.drawable.carrot, "carrot"),
                new Item(R.drawable.gold_nugget, "gold_nugget"),
                new Item(R.drawable.gold_nugget, "gold_nugget"),
                new Item(R.drawable.gold_nugget, "gold_nugget"),
                new Item(R.drawable.gold_nugget, "gold_nugget"),
                new Item(R.drawable.golden_carrot, "golden_carrot")});

        receipts.add(new Item[]{                                // Blaze Powder - Default to center
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.blaze_rod, "blaze_rod"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.blaze_powder, "blaze_powder")});
        receipts.add(new Item[]{
                new Item(R.drawable.blaze_rod, "blaze_rod"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.blaze_powder, "blaze_powder")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(R.drawable.blaze_rod, "blaze_rod"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.blaze_powder, "blaze_powder")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.blaze_rod, "blaze_rod"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.blaze_powder, "blaze_powder")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.blaze_rod, "blaze_rod"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.blaze_powder, "blaze_powder")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.blaze_rod, "blaze_rod"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.blaze_powder, "blaze_powder")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.blaze_rod, "blaze_rod"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.blaze_powder, "blaze_powder")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.blaze_rod, "blaze_rod"),
                new Item(0, "blank"),
                new Item(R.drawable.blaze_powder, "blaze_powder")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.blaze_rod, "blaze_rod"),
                new Item(R.drawable.blaze_powder, "blaze_powder")});

        receipts.add(new Item[]{                                // Fermented Spider Eye - default top left
                new Item(R.drawable.spider_eye, "spider_eye"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.brown_mushroom, "brown_mushroom"),
                new Item(R.drawable.sugar, "sugar"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.fermented_spider_eye, "fermented_spider_eye")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(R.drawable.spider_eye, "spider_eye"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.brown_mushroom, "brown_mushroom"),
                new Item(R.drawable.sugar, "sugar"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.fermented_spider_eye, "fermented_spider_eye")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.spider_eye, "spider_eye"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.brown_mushroom, "brown_mushroom"),
                new Item(R.drawable.sugar, "sugar"),
                new Item(0, "blank"),
                new Item(R.drawable.fermented_spider_eye, "fermented_spider_eye")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.spider_eye, "spider_eye"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.brown_mushroom, "brown_mushroom"),
                new Item(R.drawable.sugar, "sugar"),
                new Item(R.drawable.fermented_spider_eye, "fermented_spider_eye")});

        receipts.add(new Item[]{                                // Magma Creme - default bottom center
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.slime_ball, "slime_ball"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.blaze_powder, "blaze_powder"),
                new Item(0, "blank"),
                new Item(R.drawable.magma_cream, "magma_creme")});
        receipts.add(new Item[]{
                new Item(R.drawable.slime_ball, "slime_ball"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.blaze_powder, "blaze_powder"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.magma_cream, "magma_creme")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(R.drawable.slime_ball, "slime_ball"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.blaze_powder, "blaze_powder"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.magma_cream, "magma_creme")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.slime_ball, "slime_ball"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.blaze_powder, "blaze_powder"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.magma_cream, "magma_creme")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.slime_ball, "slime_ball"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.blaze_powder, "blaze_powder"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.magma_cream, "magma_creme")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.slime_ball, "slime_ball"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.blaze_powder, "blaze_powder"),
                new Item(R.drawable.magma_cream, "magma_creme")});

        receipts.add(new Item[]{                                // Bowl - default bottom
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(R.drawable.bowl, "bowl")});
        receipts.add(new Item[]{
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.bowl, "bowl")});

        receipts.add(new Item[]{                                // Mushroom Stew - default center
                new Item(0, "blank"),
                new Item(R.drawable.red_mushroom, "red_mushroom"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.brown_mushroom, "brown_mushroom"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.bowl, "bowl"),
                new Item(0, "blank"),
                new Item(R.drawable.mushroom_stew, "mushroom_stew")});
        receipts.add(new Item[]{
                new Item(R.drawable.red_mushroom, "red_mushroom"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.brown_mushroom, "brown_mushroom"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.bowl, "bowl"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.mushroom_stew, "mushroom_stew")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.red_mushroom, "red_mushroom"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.brown_mushroom, "brown_mushroom"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.bowl, "bowl"),
                new Item(R.drawable.mushroom_stew, "mushroom_stew")});

        receipts.add(new Item[]{                                // Rabbit Stew
                new Item(0, "blank"),
                new Item(R.drawable.cooked_rabbit, "cooked_rabbit"),
                new Item(0, "blank"),
                new Item(R.drawable.carrot, "carrot"),
                new Item(R.drawable.baked_potato, "baked_potato"),
                new Item(R.drawable.red_mushroom, "red_mushroom"),
                new Item(0, "blank"),
                new Item(R.drawable.bowl, "bowl"),
                new Item(0, "blank"),
                new Item(R.drawable.rabbit_stew, "rabbit_stew")});

        receipts.add(new Item[]{                                // Brewing Stand default bottom
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.blaze_rod, "blaze_rod"),
                new Item(0, "blank"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(R.drawable.brewing_stand, "brewing_stand")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(R.drawable.blaze_rod, "blaze_rod"),
                new Item(0, "blank"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.brewing_stand, "brewing_stand")});

        receipts.add(new Item[]{                                // Cauldron
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.cauldron, "cauldron")});

        receipts.add(new Item[]{                                // Glass Bottle
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
    public ArrayList<Item[]> getFoodBrewingReceipts() {
        return receipts;
    }
}
