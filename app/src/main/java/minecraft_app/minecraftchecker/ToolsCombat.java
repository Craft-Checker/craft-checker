package minecraft_app.minecraftchecker;

import java.util.ArrayList;

import la_hacks.minecraftchecker.R;

/**
 * Created by Marion on 7/19/15.
 */
public class ToolsCombat {
    private ArrayList<Item[]> receipts = new ArrayList<>();

    public ToolsCombat() {
        // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  TOOLS / COMBAT  <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

        receipts.add(new Item[]{                                // Fishing Rod
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(R.drawable.string, "string"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(R.drawable.string, "string"),
                new Item(R.drawable.fishing_rod, "fishing_rod")});

        receipts.add(new Item[]{                                // Carrot on a Stick - default bottom left
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.fishing_rod, "fishing_rod"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.carrot, "carrot"),
                new Item(0, "blank"),
                new Item(R.drawable.carrot_on_a_stick, "carrot_on_a_stick")});
        receipts.add(new Item[]{
                new Item(R.drawable.fishing_rod, "fishing_rod"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.carrot, "carrot"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.carrot_on_a_stick, "carrot_on_a_stick")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(R.drawable.fishing_rod, "fishing_rod"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.carrot, "carrot"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.carrot_on_a_stick, "carrot_on_a_stick")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.fishing_rod, "fishing_rod"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.carrot, "carrot"),
                new Item(R.drawable.carrot_on_a_stick, "carrot_on_a_stick")});

        receipts.add(new Item[]{                                // Flint and Steel - default bottom left
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.flint, "flint"),
                new Item(0, "blank"),
                new Item(R.drawable.flint_and_steel, "flint_and_steel")});
        receipts.add(new Item[]{
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.flint, "flint"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.flint_and_steel, "flint_and_steel")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.flint, "flint"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.flint_and_steel, "flint_and_steel")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.flint, "flint"),
                new Item(R.drawable.flint_and_steel, "flint_and_steel")});

        receipts.add(new Item[]{                            // Shears - default bottom left
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.shears, "shears")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.shears, "shears")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.shears, "shears")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(R.drawable.shears, "shears")});

        receipts.add(new Item[] {                               // Lead
                new Item(R.drawable.string, "string"),
                new Item(R.drawable.string, "string"),
                new Item(0, "blank"),
                new Item(R.drawable.string, "string"),
                new Item(R.drawable.slime_ball, "slime_ball"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.string, "string"),
                new Item(R.drawable.lead, "lead")});

        receipts.add(new Item[] {                               // Bucket - default bottom
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(R.drawable.bucket, "bucket")});
        receipts.add(new Item[] {
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.bucket, "bucket")});

        receipts.add(new Item[] {                               // Clock
                new Item(0, "blank"),
                new Item(R.drawable.gold, "gold"),
                new Item(0, "blank"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.redstone_dust, "redstone_dust"),
                new Item(R.drawable.gold, "gold"),
                new Item(0, "blank"),
                new Item(R.drawable.gold, "gold"),
                new Item(0, "blank"),
                new Item(R.drawable.clock, "clock")});

        receipts.add(new Item[] {                               // Compass
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.redstone_dust, "redstone_dust"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(R.drawable.compass, "compass")});

        receipts.add(new Item[] {                               // Map
                new Item(R.drawable.paper, "paper"),
                new Item(R.drawable.paper, "paper"),
                new Item(R.drawable.paper, "paper"),
                new Item(R.drawable.paper, "paper"),
                new Item(R.drawable.compass, "compass"),
                new Item(R.drawable.paper, "paper"),
                new Item(R.drawable.paper, "paper"),
                new Item(R.drawable.paper, "paper"),
                new Item(R.drawable.paper, "paper"),
                new Item(R.drawable.map, "map")});

        receipts.add(new Item[]{                                // Iron Helmet
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

        receipts.add(new Item[]{                                // Iron Chestplate
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron_chestplate, "iron_chestplate")});

        receipts.add(new Item[]{                                // Iron Leggings
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron_leggings, "iron_leggings")});

        receipts.add(new Item[]{                                // Iron Boots
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron_boots, "iron_boots")});

        receipts.add(new Item[]{                                // Gold Helmet
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.gold, "gold"),
                new Item(0, "blank"),
                new Item(R.drawable.gold, "gold"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.gold_helmet, "gold_helmet")});

        receipts.add(new Item[]{                                // Gold Chestplate
                new Item(R.drawable.gold, "gold"),
                new Item(0, "blank"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.gold_chestplate, "gold_chestplate")});

        receipts.add(new Item[]{                                // Gold Leggings
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.gold, "gold"),
                new Item(0, "blank"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.gold, "gold"),
                new Item(0, "blank"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.gold_leggings, "gold_leggings")});

        receipts.add(new Item[]{                                // Gold Boots
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.gold, "gold"),
                new Item(0, "blank"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.gold, "gold"),
                new Item(0, "blank"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.gold_boots, "gold_boots")});

        receipts.add(new Item[]{                                // Diamond Helmet
                new Item(R.drawable.diamond, "diamond"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(0, "blank"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.diamond_helmet, "diamond_helmet")});

        receipts.add(new Item[]{                                // Diamond Chestplate
                new Item(R.drawable.diamond, "diamond"),
                new Item(0, "blank"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(R.drawable.diamond_chestplate, "diamond_chestplate")});

        receipts.add(new Item[]{                                // Diamond Leggings
                new Item(R.drawable.diamond, "diamond"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(0, "blank"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(0, "blank"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(R.drawable.diamond_leggings, "diamond_leggings")});

        receipts.add(new Item[]{                                // Diamond Boots
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(0, "blank"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(0, "blank"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(R.drawable.diamond_boots, "diamond_boots")});

        receipts.add(new Item[]{                                // Leather Helmet
                new Item(R.drawable.leather, "leather"),
                new Item(R.drawable.leather, "leather"),
                new Item(R.drawable.leather, "leather"),
                new Item(R.drawable.leather, "leather"),
                new Item(0, "blank"),
                new Item(R.drawable.leather, "leather"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.leather_helmet, "leather_helmet")});

        receipts.add(new Item[]{                                // Leather Chestplate
                new Item(R.drawable.leather, "leather"),
                new Item(0, "blank"),
                new Item(R.drawable.leather, "leather"),
                new Item(R.drawable.leather, "leather"),
                new Item(R.drawable.leather, "leather"),
                new Item(R.drawable.leather, "leather"),
                new Item(R.drawable.leather, "leather"),
                new Item(R.drawable.leather, "leather"),
                new Item(R.drawable.leather, "leather"),
                new Item(R.drawable.leather_chestplate, "leather_chestplate")});

        receipts.add(new Item[]{                                // Leather Leggings
                new Item(R.drawable.leather, "leather"),
                new Item(R.drawable.leather, "leather"),
                new Item(R.drawable.leather, "leather"),
                new Item(R.drawable.leather, "leather"),
                new Item(0, "blank"),
                new Item(R.drawable.leather, "leather"),
                new Item(R.drawable.leather, "leather"),
                new Item(0, "blank"),
                new Item(R.drawable.leather, "leather"),
                new Item(R.drawable.leather_leggings, "leather_leggings")});

        receipts.add(new Item[]{                                // Leather Boots
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.leather, "leather"),
                new Item(0, "blank"),
                new Item(R.drawable.leather, "leather"),
                new Item(R.drawable.leather, "leather"),
                new Item(0, "blank"),
                new Item(R.drawable.leather, "leather"),
                new Item(R.drawable.leather_boots, "leather_boots")});

        receipts.add(new Item[] {                               // Bow
                new Item(R.drawable.string, "string"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(R.drawable.string, "string"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(R.drawable.string, "string"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(R.drawable.bow, "bow")});

        receipts.add(new Item[] {                               // Arrow - default center
                new Item(0, "blank"),
                new Item(R.drawable.flint, "flint"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.feather, "feather"),
                new Item(0, "blank"),
                new Item(R.drawable.arrow, "arrow")});
        receipts.add(new Item[] {
                new Item(R.drawable.flint, "flint"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.feather, "feather"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.arrow, "arrow")});
        receipts.add(new Item[] {
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.flint, "flint"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.feather, "feather"),
                new Item(R.drawable.arrow, "arrow")});

        receipts.add(new Item[] {                               // Wooden Sword - default to center
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_sword, "wooden_sword")});
        receipts.add(new Item[] {
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_sword, "wooden_sword")});
        receipts.add(new Item[] {
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(R.drawable.wooden_sword, "wooden_sword")});

        receipts.add(new Item[] {                               // Stone Sword - default to center
                new Item(0, "blank"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(R.drawable.stone_sword, "stone_sword")});
        receipts.add(new Item[] {
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stone_sword, "stone_sword")});
        receipts.add(new Item[] {
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(R.drawable.stone_sword, "stone_sword")});

        receipts.add(new Item[] {                               // Iron Sword - default to center
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(R.drawable.iron_sword, "iron_sword")});
        receipts.add(new Item[] {
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.iron_sword, "iron_sword")});
        receipts.add(new Item[] {
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(R.drawable.iron_sword, "iron_sword")});

        receipts.add(new Item[] {                               // Gold Sword - default to center
                new Item(0, "blank"),
                new Item(R.drawable.gold, "gold"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.gold, "gold"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(R.drawable.gold_sword, "gold_sword")});
        receipts.add(new Item[] {
                new Item(R.drawable.gold, "gold"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.gold, "gold"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.gold_sword, "gold_sword")});
        receipts.add(new Item[] {
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.gold, "gold"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.gold, "gold"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(R.drawable.gold_sword, "gold_sword")});

        receipts.add(new Item[] {                               // Diamond Sword - default to center
                new Item(0, "blank"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(R.drawable.diamond_sword, "diamond_sword")});
        receipts.add(new Item[] {
                new Item(R.drawable.diamond, "diamond"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.diamond_sword, "diamond_sword")});
        receipts.add(new Item[] {
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(R.drawable.diamond_sword, "diamond_sword")});

        receipts.add(new Item[] {                               // Wooden Pickaxe
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_pickaxe, "wooden_pickaxe")});

        receipts.add(new Item[] {                               // Stone Pickaxe
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(R.drawable.stone_pickaxe, "stone_pickaxe")});

        receipts.add(new Item[] {                               // Iron Pickaxe
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(R.drawable.iron_pickaxe, "iron_pickaxe")});

        receipts.add(new Item[] {                               // Gold Pickaxe
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.gold, "gold"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(R.drawable.gold_pickaxe, "gold_pickaxe")});

        receipts.add(new Item[] {                               // Diamond Pickaxe
                new Item(R.drawable.diamond, "diamond"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(R.drawable.diamond_pickaxe, "diamond_pickaxe")});

        receipts.add(new Item[] {                               // Wooden Shovel - default to center
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_shovel, "wooden_shovel")});
        receipts.add(new Item[] {
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_shovel, "wooden_shovel")});
        receipts.add(new Item[] {
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(R.drawable.wooden_shovel, "wooden_shovel")});

        receipts.add(new Item[] {                               // Stone Shovel - default to center
                new Item(0, "blank"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(R.drawable.stone_shovel, "stone_shovel")});
        receipts.add(new Item[] {
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stone_shovel, "stone_shovel")});
        receipts.add(new Item[] {
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(R.drawable.stone_shovel, "stone_shovel")});

        receipts.add(new Item[] {                               // Iron Shovel - default to center
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(R.drawable.iron_shovel, "iron_shovel")});
        receipts.add(new Item[] {
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.iron_shovel, "iron_shovel")});
        receipts.add(new Item[] {
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(R.drawable.iron_shovel, "iron_shovel")});

        receipts.add(new Item[] {                               // Gold Shovel - default to center
                new Item(0, "blank"),
                new Item(R.drawable.gold, "gold"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(R.drawable.gold_shovel, "gold_shovel")});
        receipts.add(new Item[] {
                new Item(R.drawable.gold, "gold"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.gold_shovel, "gold_shovel")});
        receipts.add(new Item[] {
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.gold, "gold"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(R.drawable.gold_shovel, "gold_shovel")});

        receipts.add(new Item[] {                               // Diamond Shovel - default to center
                new Item(0, "blank"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(R.drawable.diamond_shovel, "diamond_shovel")});
        receipts.add(new Item[] {
                new Item(R.drawable.diamond, "diamond"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.diamond_shovel, "diamond_shovel")});
        receipts.add(new Item[] {
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(R.drawable.diamond_shovel, "diamond_shovel")});

        receipts.add(new Item[] {                                   // Wooden Axe - default left
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_axe, "wooden_axe")});
        receipts.add(new Item[] {
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(R.drawable.wooden_axe, "wooden_axe")});

        receipts.add(new Item[] {                                   // Stone Axe - default left
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(0, "blank"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(R.drawable.stone_axe, "stone_axe")});
        receipts.add(new Item[] {
                new Item(0, "blank"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(0, "blank"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(R.drawable.stone_axe, "stone_axe")});

        receipts.add(new Item[] {                                   // Iron Axe - default left
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(R.drawable.iron_axe, "iron_axe")});
        receipts.add(new Item[] {
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(R.drawable.iron_axe, "iron_axe")});

        receipts.add(new Item[] {                                   // Gold Axe - default left
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.gold, "gold"),
                new Item(0, "blank"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(R.drawable.gold_axe, "gold_axe")});
        receipts.add(new Item[] {
                new Item(0, "blank"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.gold, "gold"),
                new Item(0, "blank"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(R.drawable.gold_axe, "gold_axe")});

        receipts.add(new Item[] {                                   // Diamond Axe - default left
                new Item(R.drawable.diamond, "diamond"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(0, "blank"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(R.drawable.diamond_axe, "diamond_axe")});
        receipts.add(new Item[] {
                new Item(0, "blank"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(0, "blank"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(R.drawable.diamond_axe, "diamond_axe")});

        receipts.add(new Item[] {                                   // Wooden Hoe - default left
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_hoe, "wooden_hoe")});
        receipts.add(new Item[] {
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(R.drawable.wooden_hoe, "wooden_hoe")});

        receipts.add(new Item[] {                                   // Stone Hoe - default left
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(R.drawable.stone_hoe, "stone_hoe")});
        receipts.add(new Item[] {
                new Item(0, "blank"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(R.drawable.stone_hoe, "stone_hoe")});

        receipts.add(new Item[] {                                   // Iron Hoe - default left
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(R.drawable.iron_hoe, "iron_hoe")});
        receipts.add(new Item[] {
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(R.drawable.iron_hoe, "iron_hoe")});

        receipts.add(new Item[] {                                   // Gold Hoe - default left
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.gold, "gold"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(R.drawable.gold_hoe, "gold_hoe")});
        receipts.add(new Item[] {
                new Item(0, "blank"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.gold, "gold"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(R.drawable.gold_hoe, "gold_hoe")});

        receipts.add(new Item[] {                                   // Diamond Hoe - default left
                new Item(R.drawable.diamond, "diamond"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(R.drawable.diamond_hoe, "diamond_hoe")});
        receipts.add(new Item[] {
                new Item(0, "blank"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(R.drawable.diamond_hoe, "diamond_hoe")});
    }
    public ArrayList<Item[]> getToolsCombatReceipts() {
        return receipts;
    }
}
