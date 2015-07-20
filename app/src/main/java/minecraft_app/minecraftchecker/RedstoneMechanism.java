package minecraft_app.minecraftchecker;

import java.util.ArrayList;

import la_hacks.minecraftchecker.R;

/**
 * Created by Marion on 7/19/15.
 */
public class RedstoneMechanism {
    private ArrayList<Item[]> receipts = new ArrayList<>();

    public RedstoneMechanism() {
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
    }
    public ArrayList<Item[]> getRedstoneMechanismReceipts() {
        return receipts;
    }
}
