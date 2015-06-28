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
        // When adding an item, the "default" receipt for an item is the first receipt added for that item
        // The default receipt is used when the receipt for an item is to be generated on the table


// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  BUILDING / DECOR  <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

        receipts.add(new Item[]{                                // Torch (6 different positions)
                new Item(0, "blank"),                           // default to bottom center
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.coal, "coal"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(R.drawable.torch, "torch")});
        receipts.add(new Item[]{
                new Item(R.drawable.coal, "coal"),                           // Top left
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.torch, "torch")});
        receipts.add(new Item[]{
                new Item(0, "blank"),                                                          // Top middle
                new Item(R.drawable.coal, "coal"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.torch, "torch")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),                                                          // Top right
                new Item(R.drawable.coal, "coal"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.torch, "torch")});
        receipts.add(new Item[]{
                new Item(0, "blank"),                                                          // Bottom left
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.coal, "coal"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.torch, "torch")});
        receipts.add(new Item[]{
                new Item(0, "blank"),                                                          // Bottom right
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.coal, "coal"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(R.drawable.torch, "torch")});

        receipts.add(new Item[]{                                // Jack-O-Lantern - default bottom center
                new Item(0, "blank"),                           // Note: String spelling of "jack-o-lantern"
                new Item(0, "blank"),                           // uses dashes instead of underscores****
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.pumpkin, "pumpkin"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.torch, "torch"),
                new Item(0, "blank"),
                new Item(R.drawable.jack_o_lantern, "jack-o-lantern")});
        receipts.add(new Item[]{
                new Item(R.drawable.pumpkin, "pumpkin"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.torch, "torch"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.jack_o_lantern, "jack-o-lantern")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(R.drawable.pumpkin, "pumpkin"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.torch, "torch"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.jack_o_lantern, "jack-o-lantern")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.pumpkin, "pumpkin"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.torch, "torch"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.jack_o_lantern, "jack-o-lantern")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.pumpkin, "pumpkin"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.torch, "torch"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.jack_o_lantern, "jack-o-lantern")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.pumpkin, "pumpkin"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.torch, "torch"),
                new Item(R.drawable.jack_o_lantern, "jack-o-lantern")});

        receipts.add(new Item[]{                                    // Wood Door - default left
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(R.drawable.wood_door, "wood_door")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wood_door, "wood_door")});

        receipts.add(new Item[]{                                    // Iron Door - default left
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(R.drawable.iron_door, "iron_door")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron_door, "iron_door")});

        receipts.add(new Item[]{                                    // Chest
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.chest, "chest")});

        receipts.add(new Item[]{                                    // Ender Chest
                new Item(R.drawable.obsidian, "obsidian"),
                new Item(R.drawable.obsidian, "obsidian"),
                new Item(R.drawable.obsidian, "obsidian"),
                new Item(R.drawable.obsidian, "obsidian"),
                new Item(R.drawable.eye_of_ender, "eye_of_ender"),
                new Item(R.drawable.obsidian, "obsidian"),
                new Item(R.drawable.obsidian, "obsidian"),
                new Item(R.drawable.obsidian, "obsidian"),
                new Item(R.drawable.obsidian, "obsidian"),
                new Item(R.drawable.ender_chest, "ender_chest")});

        receipts.add(new Item[]{                                    // Crafting Table - default bottom left
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(R.drawable.crafting_table, "crafting_table")});
        receipts.add(new Item[]{
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.crafting_table, "crafting_table")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.crafting_table, "crafting_table")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.crafting_table, "crafting_table")});

        receipts.add(new Item[]{                                    // Furnace
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(0, "blank"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(R.drawable.furnace, "furnace")});

// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  REDSTONE / MECHANISM  <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

        receipts.add(new Item[]{                                // Redstone Torch (6 different positions)
                new Item(0, "blank"),                           // default to bottom center
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.redstone_dust, "redstone_dust"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(R.drawable.redstone_torch, "redstone_torch")});
        receipts.add(new Item[]{
                new Item(R.drawable.redstone_dust, "redstone_dust"),                           // Top left
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.redstone_torch, "redstone_torch")});
        receipts.add(new Item[]{
                new Item(0, "blank"),                                                          // Top middle
                new Item(R.drawable.redstone_dust, "redstone_dust"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.redstone_torch, "redstone_torch")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),                                                          // Top right
                new Item(R.drawable.redstone_dust, "redstone_dust"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.redstone_torch, "redstone_torch")});
        receipts.add(new Item[]{
                new Item(0, "blank"),                                                          // Bottom left
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.redstone_dust, "redstone_dust"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.redstone_torch, "redstone_torch")});
        receipts.add(new Item[]{
                new Item(0, "blank"),                                                          // Bottom right
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.redstone_dust, "redstone_dust"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(R.drawable.redstone_torch, "redstone_torch")});

        receipts.add(new Item[]{                                // Boat - default to bottom
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.boat, "boat")});
        receipts.add(new Item[]{
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.boat, "boat")});

        receipts.add(new Item[]{                                // Minecart - default bottom
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.minecart, "minecart")});
        receipts.add(new Item[]{
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.minecart, "minecart")});

        receipts.add(new Item[]{                                // Powered Minecart - default bottom center
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.furnace, "furnace"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.minecart, "minecart"),
                new Item(0, "blank"),
                new Item(R.drawable.powered_minecart, "powered_minecart")});
        receipts.add(new Item[]{
                new Item(R.drawable.furnace, "furnace"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.minecart, "minecart"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.powered_minecart, "powered_minecart")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(R.drawable.furnace, "furnace"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.minecart, "minecart"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.powered_minecart, "powered_minecart")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.furnace, "furnace"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.minecart, "minecart"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.powered_minecart, "powered_minecart")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.furnace, "furnace"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.minecart, "minecart"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.powered_minecart, "powered_minecart")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.furnace, "furnace"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.minecart, "minecart"),
                new Item(R.drawable.powered_minecart, "powered_minecart")});

        receipts.add(new Item[]{                                // Storage Minecart - default bottom center
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.chest, "chest"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.minecart, "minecart"),
                new Item(0, "blank"),
                new Item(R.drawable.storage_minecart, "storage_minecart")});
        receipts.add(new Item[]{
                new Item(R.drawable.chest, "chest"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.minecart, "minecart"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.storage_minecart, "storage_minecart")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(R.drawable.chest, "chest"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.minecart, "minecart"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.storage_minecart, "storage_minecart")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.chest, "chest"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.minecart, "minecart"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.storage_minecart, "storage_minecart")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.chest, "chest"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.minecart, "minecart"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.storage_minecart, "storage_minecart")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.chest, "chest"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.minecart, "minecart"),
                new Item(R.drawable.storage_minecart, "storage_minecart")});

        receipts.add(new Item[]{                                // Minecart with Hopper - default bottom center
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.hopper, "hopper"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.minecart, "minecart"),
                new Item(0, "blank"),
                new Item(R.drawable.minecart_with_hopper, "minecart_with_hopper")});
        receipts.add(new Item[]{
                new Item(R.drawable.hopper, "hopper"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.minecart, "minecart"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.minecart_with_hopper, "minecart_with_hopper")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(R.drawable.hopper, "hopper"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.minecart, "minecart"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.minecart_with_hopper, "minecart_with_hopper")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.hopper, "hopper"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.minecart, "minecart"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.minecart_with_hopper, "minecart_with_hopper")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.hopper, "hopper"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.minecart, "minecart"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.minecart_with_hopper, "minecart_with_hopper")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.hopper, "hopper"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.minecart, "minecart"),
                new Item(R.drawable.minecart_with_hopper, "minecart_with_hopper")});

        receipts.add(new Item[]{                                // Minecart with TNT - default bottom center
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.tnt, "tnt"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.minecart, "minecart"),
                new Item(0, "blank"),
                new Item(R.drawable.minecart_with_tnt, "minecart_with_tnt")});
        receipts.add(new Item[]{
                new Item(R.drawable.tnt, "tnt"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.minecart, "minecart"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.minecart_with_tnt, "minecart_with_tnt")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(R.drawable.tnt, "tnt"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.minecart, "minecart"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.minecart_with_tnt, "minecart_with_tnt")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.tnt, "tnt"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.minecart, "minecart"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.minecart_with_tnt, "minecart_with_tnt")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.tnt, "tnt"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.minecart, "minecart"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.minecart_with_tnt, "minecart_with_tnt")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.tnt, "tnt"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.minecart, "minecart"),
                new Item(R.drawable.minecart_with_tnt, "minecart_with_tnt")});

        receipts.add(new Item[]{                                // Rails
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.stick, "stick"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.rails, "rails")});

        receipts.add(new Item[]{                                // Powered Rail
                new Item(R.drawable.gold, "gold"),
                new Item(0, "blank"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.stick, "stick"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.redstone_dust, "redstone_dust"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.powered_rail, "powered_rail")});

        receipts.add(new Item[]{                                // Detector Rail
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.stone_pressure_plate, "stone_pressure_plate"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.redstone_dust, "redstone_dust"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.detector_rail, "detector_rail")});

        receipts.add(new Item[]{                                // Activator Rail
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.stick, "stick"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.redstone_torch, "redstone_torch"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.stick, "stick"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.activator_rail, "activator_rail")});

        receipts.add(new Item[]{                                // TNT
                new Item(R.drawable.gunpowder, "gunpowder"),
                new Item(R.drawable.sand, "sand"),
                new Item(R.drawable.gunpowder, "gunpowder"),
                new Item(R.drawable.sand, "sand"),
                new Item(R.drawable.gunpowder, "gunpowder"),
                new Item(R.drawable.sand, "sand"),
                new Item(R.drawable.gunpowder, "gunpowder"),
                new Item(R.drawable.sand, "sand"),
                new Item(R.drawable.gunpowder, "gunpowder"),
                new Item(R.drawable.tnt, "tnt")});

        receipts.add(new Item[]{                                // Jukebox
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.diamond, "diamond"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.jukebox, "jukebox")});

        receipts.add(new Item[]{                                // Note Block
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.redstone_dust, "redstone_dust"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.note_block, "note_block")});

        receipts.add(new Item[]{                                // Redstone Lamp
                new Item(0, "blank"),
                new Item(R.drawable.redstone_dust, "redstone_dust"),
                new Item(0, "blank"),
                new Item(R.drawable.redstone_dust, "redstone_dust"),
                new Item(R.drawable.glowstone, "glowstone"),
                new Item(R.drawable.redstone_dust, "redstone_dust"),
                new Item(0, "blank"),
                new Item(R.drawable.redstone_dust, "redstone_dust"),
                new Item(0, "blank"),
                new Item(R.drawable.redstone_lamp, "redstone_lamp")});

        receipts.add(new Item[]{                                // Daylight Sensor
                new Item(R.drawable.glass, "glass"),
                new Item(R.drawable.glass, "glass"),
                new Item(R.drawable.glass, "glass"),
                new Item(R.drawable.nether_quartz, "nether_quartz"),
                new Item(R.drawable.nether_quartz, "nether_quartz"),
                new Item(R.drawable.nether_quartz, "nether_quartz"),
                new Item(R.drawable.wooden_slab, "wooden_slab"),
                new Item(R.drawable.wooden_slab, "wooden_slab"),
                new Item(R.drawable.wooden_slab, "wooden_slab"),
                new Item(R.drawable.daylight_sensor, "daylight_sensor")});

        receipts.add(new Item[]{                                // Redstone Repeater - default bottom
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.redstone_torch, "redstone_torch"),
                new Item(R.drawable.redstone_dust, "redstone_dust"),
                new Item(R.drawable.redstone_torch, "redstone_torch"),
                new Item(R.drawable.stone, "stone"),
                new Item(R.drawable.stone, "stone"),
                new Item(R.drawable.stone, "stone"),
                new Item(R.drawable.redstone_repeater, "redstone_repeater")});
        receipts.add(new Item[]{
                new Item(R.drawable.redstone_torch, "redstone_torch"),
                new Item(R.drawable.redstone_dust, "redstone_dust"),
                new Item(R.drawable.redstone_torch, "redstone_torch"),
                new Item(R.drawable.stone, "stone"),
                new Item(R.drawable.stone, "stone"),
                new Item(R.drawable.stone, "stone"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.redstone_repeater, "redstone_repeater")});

        receipts.add(new Item[]{                                // Redstone Comparator
                new Item(0, "blank"),
                new Item(R.drawable.redstone_torch, "redstone_torch"),
                new Item(0, "blank"),
                new Item(R.drawable.redstone_torch, "redstone_torch"),
                new Item(R.drawable.nether_quartz, "nether_quartz"),
                new Item(R.drawable.redstone_torch, "redstone_torch"),
                new Item(R.drawable.stone, "stone"),
                new Item(R.drawable.stone, "stone"),
                new Item(R.drawable.stone, "stone"),
                new Item(R.drawable.redstone_comparator, "redstone_comparator")});

        receipts.add(new Item[]{                                // Trapdoor - default bottom
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.trapdoor, "trapdoor")});
        receipts.add(new Item[]{
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.trapdoor, "trapdoor")});

        receipts.add(new Item[]{                                // Iron Trapdoor - default bottom left
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(R.drawable.iron_trapdoor, "iron_trapdoor")});
        receipts.add(new Item[]{
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.iron_trapdoor, "iron_trapdoor")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.iron_trapdoor, "iron_trapdoor")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron_trapdoor, "iron_trapdoor")});

        receipts.add(new Item[]{                                // Wood Pressure Plate - default center left
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wood_pressure_plate, "wood_pressure_plate")});
        receipts.add(new Item[]{
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wood_pressure_plate, "wood_pressure_plate")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wood_pressure_plate, "wood_pressure_plate")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wood_pressure_plate, "wood_pressure_plate")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(R.drawable.wood_pressure_plate, "wood_pressure_plate")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wood_pressure_plate, "wood_pressure_plate")});

        receipts.add(new Item[]{                                // Stone Pressure Plate - default center left
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stone, "stone"),
                new Item(R.drawable.stone, "stone"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stone_pressure_plate, "stone_pressure_plate")});
        receipts.add(new Item[]{
                new Item(R.drawable.stone, "stone"),
                new Item(R.drawable.stone, "stone"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stone_pressure_plate, "stone_pressure_plate")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(R.drawable.stone, "stone"),
                new Item(R.drawable.stone, "stone"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stone_pressure_plate, "stone_pressure_plate")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stone, "stone"),
                new Item(R.drawable.stone, "stone"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stone_pressure_plate, "stone_pressure_plate")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stone, "stone"),
                new Item(R.drawable.stone, "stone"),
                new Item(0, "blank"),
                new Item(R.drawable.stone_pressure_plate, "stone_pressure_plate")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stone, "stone"),
                new Item(R.drawable.stone, "stone"),
                new Item(R.drawable.stone_pressure_plate, "stone_pressure_plate")});

        receipts.add(new Item[]{                                // Light Weighted Pressure Plate - default center left
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.gold, "gold"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.light_weighted_pressure_plate, "light_weighted_pressure_plate")});
        receipts.add(new Item[]{
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.gold, "gold"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.light_weighted_pressure_plate, "light_weighted_pressure_plate")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.gold, "gold"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.light_weighted_pressure_plate, "light_weighted_pressure_plate")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.gold, "gold"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.light_weighted_pressure_plate, "light_weighted_pressure_plate")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.gold, "gold"),
                new Item(0, "blank"),
                new Item(R.drawable.light_weighted_pressure_plate, "light_weighted_pressure_plate")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.gold, "gold"),
                new Item(R.drawable.light_weighted_pressure_plate, "light_weighted_pressure_plate")});

        receipts.add(new Item[]{                                // Heavy Weighted Pressure Plate - default center left
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.heavy_weighted_pressure_plate, "heavy_weighted_pressure_plate")});
        receipts.add(new Item[]{
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.heavy_weighted_pressure_plate, "heavy_weighted_pressure_plate")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.heavy_weighted_pressure_plate, "heavy_weighted_pressure_plate")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.heavy_weighted_pressure_plate, "heavy_weighted_pressure_plate")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(R.drawable.heavy_weighted_pressure_plate, "heavy_weighted_pressure_plate")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.heavy_weighted_pressure_plate, "heavy_weighted_pressure_plate")});

        receipts.add(new Item[]{                                // Lever - default bottom center
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(0, "blank"),
                new Item(R.drawable.lever, "lever")});
        receipts.add(new Item[]{
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.lever, "lever")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.lever, "lever")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.lever, "lever")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.lever, "lever")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(R.drawable.lever, "lever")});

        receipts.add(new Item[]{                                // Wooden Button - Default to center
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_button, "wooden_button")});
        receipts.add(new Item[]{
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_button, "wooden_button")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_button, "wooden_button")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_button, "wooden_button")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_button, "wooden_button")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_button, "wooden_button")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_button, "wooden_button")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_button, "wooden_button")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_button, "wooden_button")});

        receipts.add(new Item[]{                                // Stone Button - Default to center
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stone, "stone"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stone_button, "stone_button")});
        receipts.add(new Item[]{
                new Item(R.drawable.stone, "stone"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stone_button, "stone_button")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(R.drawable.stone, "stone"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stone_button, "stone_button")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stone, "stone"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stone_button, "stone_button")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stone, "stone"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stone_button, "stone_button")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stone, "stone"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stone_button, "stone_button")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stone, "stone"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stone_button, "stone_button")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stone, "stone"),
                new Item(0, "blank"),
                new Item(R.drawable.stone_button, "stone_button")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stone, "stone"),
                new Item(R.drawable.stone_button, "stone_button")});

        receipts.add(new Item[]{                                // Piston
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(R.drawable.redstone_dust, "redstone_dust"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(R.drawable.piston, "piston")});

        receipts.add(new Item[]{                                // Sticky Piston - default bottom center
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.slime_ball, "slime_ball"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.piston, "piston"),
                new Item(0, "blank"),
                new Item(R.drawable.sticky_piston, "sticky_piston")});
        receipts.add(new Item[]{
                new Item(R.drawable.slime_ball, "slime_ball"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.piston, "piston"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.sticky_piston, "sticky_piston")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(R.drawable.slime_ball, "slime_ball"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.piston, "piston"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.sticky_piston, "sticky_piston")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.slime_ball, "slime_ball"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.piston, "piston"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.sticky_piston, "sticky_piston")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.slime_ball, "slime_ball"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.piston, "piston"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.sticky_piston, "sticky_piston")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.slime_ball, "slime_ball"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.piston, "piston"),
                new Item(R.drawable.sticky_piston, "sticky_piston")});

        receipts.add(new Item[]{                                // Dispenser
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(R.drawable.bow, "bow"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(R.drawable.redstone_dust, "redstone_dust"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(R.drawable.dispenser, "dispenser")});

        receipts.add(new Item[]{                                // Dropper
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(0, "blank"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(R.drawable.redstone_dust, "redstone_dust"),
                new Item(R.drawable.cobblestone, "cobblestone"),
                new Item(R.drawable.dropper, "dropper")});

        receipts.add(new Item[]{                                // Hopper
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.iron, "iron"),
                new Item(R.drawable.chest, "chest"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(R.drawable.hopper, "hopper")});

        receipts.add(new Item[] {                               // Tripwire Hook - default center
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(R.drawable.tripwire_hook, "tripwire_hook")});
        receipts.add(new Item[] {
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.tripwire_hook, "tripwire_hook")});
        receipts.add(new Item[] {
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.iron, "iron"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.stick, "stick"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.wooden_plank, "wooden_plank"),
                new Item(R.drawable.tripwire_hook, "tripwire_hook")});

        receipts.add(new Item[]{                                // Trapped Chest - default center left
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.tripwire_hook, "tripwire_hook"),
                new Item(R.drawable.chest, "chest"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.trapped_chest, "trapped_chest")});
        receipts.add(new Item[]{
                new Item(R.drawable.tripwire_hook, "tripwire_hook"),
                new Item(R.drawable.chest, "chest"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.trapped_chest, "trapped_chest")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(R.drawable.tripwire_hook, "tripwire_hook"),
                new Item(R.drawable.chest, "chest"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.trapped_chest, "trapped_chest")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.tripwire_hook, "tripwire_hook"),
                new Item(R.drawable.chest, "chest"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.trapped_chest, "trapped_chest")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.tripwire_hook, "tripwire_hook"),
                new Item(R.drawable.chest, "chest"),
                new Item(0, "blank"),
                new Item(R.drawable.trapped_chest, "trapped_chest")});
        receipts.add(new Item[]{
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(0, "blank"),
                new Item(R.drawable.tripwire_hook, "tripwire_hook"),
                new Item(R.drawable.chest, "chest"),
                new Item(R.drawable.trapped_chest, "trapped_chest")});

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

// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  MATERIALS / MISC  <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

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
    public ArrayList<Item[]> getReceipts() {
        return this.receipts;
    }
}
