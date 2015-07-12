package minecraft_app.minecraftchecker;

//import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.graphics.Typeface;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import la_hacks.minecraftchecker.R;


public class CraftingTable extends Activity {

    private ArrayList<Item> buildingDecorItems;
    private ArrayList<Item> redstoneMechanismItems;
    private ArrayList<Item> foodBrewingItems;
    private ArrayList<Item> toolsCombatItems;
    private ArrayList<Item> materialsMiscItems;
    private ItemAdapter buildingDecorAdapter;
    private ItemAdapter redstoneMechanismAdapter;
    private ItemAdapter foodBrewingAdapter;
    private ItemAdapter toolsCombatAdapter;
    private ItemAdapter materialMiscAdapter;
    public static Table table = new Table();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crafting_table);

    // Populating lists that will appear when buttons are clicked
        buildingDecorItems = new ArrayList<Item>();
        redstoneMechanismItems = new ArrayList<Item>();
        foodBrewingItems = new ArrayList<Item>();
        toolsCombatItems = new ArrayList<Item>();
        materialsMiscItems = new ArrayList<Item>();
    // Building/Decor

        Item item_torch = new Item(R.drawable.torch, "torch");
        Item item_jack_o_lantern = new Item(R.drawable.jack_o_lantern, "jack-o-lantern");
        Item item_glowstone = new Item(R.drawable.glowstone, "glowstone");
        Item item_sea_lantern = new Item(R.drawable.sea_lantern, "sea_lantern");
        Item item_wood_door = new Item(R.drawable.wood_door, "wood_door");
        Item item_iron_door = new Item(R.drawable.iron_door, "iron_door");
        Item item_chest = new Item(R.drawable.chest, "chest");
        Item item_ender_chest =  new Item(R.drawable.ender_chest, "ender_chest");
        Item item_crafting_table = new Item(R.drawable.crafting_table, "crafting_table");
        Item item_furnace = new Item(R.drawable.furnace, "furnace");
        Item item_glass_pane = new Item(R.drawable.glass_pane, "glass_pane");
        Item item_glass = new Item(R.drawable.glass, "glass");
        Item item_beacon = new Item(R.drawable.beacon, "beacon");
        Item item_enchantment_table = new Item(R.drawable.enchantment_table, "enchantment_table");
        Item item_anvil = new Item(R.drawable.anvil, "anvil");
        Item item_flower_pot = new Item(R.drawable.flower_pot, "flower_pot");
        Item item_ladder = new Item(R.drawable.ladder, "ladder");
        Item item_fence = new Item(R.drawable.fence, "fence");
        Item item_nether_brick_fence = new Item(R.drawable.nether_brick_fence, "nether_brick_fence");
        Item item_fence_gate = new Item(R.drawable.fence_gate, "fence_gate");
        Item item_iron_bars = new Item(R.drawable.iron_bars, "iron_bars");
        Item item_sign = new Item(R.drawable.sign, "sign");
        Item item_bed = new Item(R.drawable.bed, "bed");
        Item item_painting = new Item(R.drawable.painting, "painting");
        Item item_banner = new Item(R.drawable.banner, "banner");
        Item item_item_frame = new Item(R.drawable.item_frame, "item_frame");
        Item item_armor_stand = new Item(R.drawable.armor_stand, "armor_stand");
        Item item_bookshelf = new Item(R.drawable.bookshelf, "bookshelf");
        Item item_cobblestone = new Item(R.drawable.cobblestone, "cobblestone");
        Item item_stone = new Item(R.drawable.stone, "stone");
        Item item_stone_brick = new Item(R.drawable.stone_brick, "stone_brick");
        Item item_chiseled_stone_brick = new Item(R.drawable.chiseled_stone_brick, "chiseled_stone_brick");
        Item item_brick = new Item(R.drawable.brick, "brick");
        Item item_nether_brick_block = new Item(R.drawable.nether_brick_block, "nether_brick_block");
        Item item_dirt = new Item(R.drawable.dirt, "dirt");
        Item item_gravel = new Item(R.drawable.gravel, "gravel");
        Item item_coarse_dirt = new Item(R.drawable.coarse_dirt, "coarse_dirt");
        Item item_sand = new Item(R.drawable.sand, "sand");
        Item item_sandstone = new Item(R.drawable.sandstone, "sandstone");
        Item item_chiseled_sandstone = new Item(R.drawable.chiseled_sandstone, "chiseled_sandstone");
        Item item_wooden_slab =  new Item(R.drawable.wooden_slab, "wooden_slab");
        Item item_stone_slab = new Item(R.drawable.stone_slab, "stone_slab");
        Item item_stone_brick_slab = new Item(R.drawable.stone_brick_slab, "stone_brick_slab");
        Item item_sandstone_slab = new Item(R.drawable.sandstone_slab, "sandstone_slab");

        ItemMap.idResMap.put(R.drawable.torch, item_torch);
        ItemMap.idResMap.put(R.drawable.jack_o_lantern, item_jack_o_lantern);
        ItemMap.idResMap.put(R.drawable.glowstone, item_glowstone);
        ItemMap.idResMap.put(R.drawable.sea_lantern, item_sea_lantern);
        ItemMap.idResMap.put(R.drawable.wood_door, item_wood_door);
        ItemMap.idResMap.put(R.drawable.iron_door, item_iron_door);
        ItemMap.idResMap.put(R.drawable.chest, item_chest);
        ItemMap.idResMap.put(R.drawable.ender_chest, item_ender_chest);
        ItemMap.idResMap.put(R.drawable.crafting_table, item_crafting_table);
        ItemMap.idResMap.put(R.drawable.furnace, item_furnace);
        ItemMap.idResMap.put(R.drawable.glass_pane, item_glass_pane);
        ItemMap.idResMap.put(R.drawable.glass, item_glass);
        ItemMap.idResMap.put(R.drawable.beacon, item_beacon);
        ItemMap.idResMap.put(R.drawable.enchantment_table, item_enchantment_table);
        ItemMap.idResMap.put(R.drawable.anvil, item_anvil);
        ItemMap.idResMap.put(R.drawable.flower_pot, item_flower_pot);
        ItemMap.idResMap.put(R.drawable.ladder, item_ladder);
        ItemMap.idResMap.put(R.drawable.fence, item_fence);
        ItemMap.idResMap.put(R.drawable.nether_brick_fence, item_nether_brick_fence);
        ItemMap.idResMap.put(R.drawable.fence_gate, item_fence_gate);
        ItemMap.idResMap.put(R.drawable.iron_bars, item_iron_bars);
        ItemMap.idResMap.put(R.drawable.sign, item_sign);
        ItemMap.idResMap.put(R.drawable.bed, item_bed);
        ItemMap.idResMap.put(R.drawable.painting, item_painting);
        ItemMap.idResMap.put(R.drawable.banner, item_banner);
        ItemMap.idResMap.put(R.drawable.item_frame, item_item_frame);
        ItemMap.idResMap.put(R.drawable.armor_stand, item_armor_stand);
        ItemMap.idResMap.put(R.drawable.bookshelf, item_bookshelf);
        ItemMap.idResMap.put(R.drawable.cobblestone, item_cobblestone);
        ItemMap.idResMap.put(R.drawable.stone, item_stone);
        ItemMap.idResMap.put(R.drawable.stone_brick, item_stone_brick);
        ItemMap.idResMap.put(R.drawable.chiseled_stone_brick, item_chiseled_stone_brick);
        ItemMap.idResMap.put(R.drawable.brick, item_brick);
        ItemMap.idResMap.put(R.drawable.nether_brick_block, item_nether_brick_block);
        ItemMap.idResMap.put(R.drawable.dirt, item_dirt);
        ItemMap.idResMap.put(R.drawable.gravel, item_gravel);
        ItemMap.idResMap.put(R.drawable.coarse_dirt, item_coarse_dirt);
        ItemMap.idResMap.put(R.drawable.sand, item_sand);
        ItemMap.idResMap.put(R.drawable.sandstone, item_sandstone);
        ItemMap.idResMap.put(R.drawable.chiseled_sandstone, item_chiseled_sandstone);
        ItemMap.idResMap.put(R.drawable.wooden_slab, item_wooden_slab);
        ItemMap.idResMap.put(R.drawable.stone_slab, item_stone_slab);
        ItemMap.idResMap.put(R.drawable.stone_brick_slab, item_stone_brick_slab);
        ItemMap.idResMap.put(R.drawable.sandstone_slab, item_sandstone_slab);

        buildingDecorItems.add(item_torch);
        buildingDecorItems.add(item_jack_o_lantern);
        buildingDecorItems.add(item_glowstone);
        buildingDecorItems.add(item_sea_lantern);
        buildingDecorItems.add(item_wood_door);
        buildingDecorItems.add(item_iron_door);
        buildingDecorItems.add(item_chest);
        buildingDecorItems.add(item_ender_chest);
        buildingDecorItems.add(item_crafting_table);
        buildingDecorItems.add(item_furnace);
        buildingDecorItems.add(item_glass_pane);
        buildingDecorItems.add(item_glass);
        buildingDecorItems.add(item_beacon);
        buildingDecorItems.add(item_enchantment_table);
        buildingDecorItems.add(item_anvil);
        buildingDecorItems.add(item_flower_pot);
        buildingDecorItems.add(item_ladder);
        buildingDecorItems.add(item_fence);
        buildingDecorItems.add(item_nether_brick_fence);
        buildingDecorItems.add(item_fence_gate);
        buildingDecorItems.add(item_iron_bars);
        buildingDecorItems.add(item_sign);
        buildingDecorItems.add(item_bed);
        buildingDecorItems.add(item_painting);
        buildingDecorItems.add(item_banner);
        buildingDecorItems.add(item_item_frame);
        buildingDecorItems.add(item_armor_stand);
        buildingDecorItems.add(item_bookshelf);
        buildingDecorItems.add(item_cobblestone);
        buildingDecorItems.add(item_stone);
        buildingDecorItems.add(item_stone_brick);
        buildingDecorItems.add(item_chiseled_stone_brick);
        buildingDecorItems.add(item_brick);
        buildingDecorItems.add(item_nether_brick_block);
        buildingDecorItems.add(item_dirt);
        buildingDecorItems.add(item_gravel);
        buildingDecorItems.add(item_coarse_dirt);
        buildingDecorItems.add(item_sand);
        buildingDecorItems.add(item_sandstone);
        buildingDecorItems.add(item_chiseled_sandstone);
        buildingDecorItems.add(item_wooden_slab);
        buildingDecorItems.add(item_stone_slab);
        buildingDecorItems.add(item_stone_brick_slab);
        buildingDecorItems.add(item_sandstone_slab);

    // Redstone/Mechanism

        Item item_redstone_dust = new Item(R.drawable.redstone_dust, "redstone_dust");
        Item item_redstone_torch =  new Item(R.drawable.redstone_torch, "redstone_torch");
        Item item_boat = new Item(R.drawable.boat, "boat");
        Item item_minecart = new Item(R.drawable.minecart, "minecart");
        Item item_powered_minecart = new Item(R.drawable.powered_minecart, "powered_minecart");
        Item item_storage_minecart = new Item(R.drawable.storage_minecart, "storage_minecart");
        Item item_minecart_with_hopper = new Item(R.drawable.minecart_with_hopper, "minecart_with_hopper");
        Item item_minecart_with_tnt = new Item(R.drawable.minecart_with_tnt, "minecart_with_tnt");
        Item item_rails = new Item(R.drawable.rails, "rails");
        Item item_powered_rail = new Item(R.drawable.powered_rail, "powered_rail");
        Item item_detector_rail = new Item(R.drawable.detector_rail, "detector_rail");
        Item item_activator_rail = new Item(R.drawable.activator_rail, "activator_rail");
        Item item_tnt = new Item(R.drawable.tnt, "tnt");
        Item item_jukebox = new Item(R.drawable.jukebox, "jukebox");
        Item item_note_block = new Item(R.drawable.note_block, "note_block");
        Item item_redstone_lamp = new Item(R.drawable.redstone_lamp, "redstone_lamp");
        Item item_daylight_sensor = new Item(R.drawable.daylight_sensor, "daylight_sensor");
        Item item_redstone_repeater = new Item(R.drawable.redstone_repeater, "redstone_repeater");
        Item item_redstone_comparator = new Item(R.drawable.redstone_comparator, "redstone_comparator");
        Item item_trapdoor = new Item(R.drawable.trapdoor, "trapdoor");
        Item item_iron_trapdoor = new Item(R.drawable.iron_trapdoor, "iron_trapdoor");
        Item item_wood_pressure_plate = new Item(R.drawable.wood_pressure_plate, "wood_pressure_plate");
        Item item_stone_pressure_plate = new Item(R.drawable.stone_pressure_plate, "stone_pressure_plate");
        Item item_light_weighted_pressure_plate = new Item(R.drawable.light_weighted_pressure_plate, "light_weighted_pressure_plate");
        Item item_heavy_weighted_pressure_plate = new Item(R.drawable.heavy_weighted_pressure_plate, "heavy_weighted_pressure_plate");
        Item item_lever = new Item(R.drawable.lever, "lever");
        Item item_wooden_button = new Item(R.drawable.wooden_button, "wooden_button");
        Item item_stone_button = new Item(R.drawable.stone_button, "stone_button");
        Item item_piston = new Item(R.drawable.piston, "piston");
        Item item_sticky_piston = new Item(R.drawable.sticky_piston, "sticky_piston");
        Item item_dispenser = new Item(R.drawable.dispenser, "dispenser");
        Item item_dropper = new Item(R.drawable.dropper, "dropper");
        Item item_hopper = new Item(R.drawable.hopper, "hopper");
        Item item_tripwire_hook = new Item(R.drawable.tripwire_hook, "tripwire_hook");
        Item item_trapped_chest = new Item(R.drawable.trapped_chest, "trapped_chest");

        ItemMap.idResMap.put(R.drawable.redstone_dust, item_redstone_dust);
        ItemMap.idResMap.put(R.drawable.redstone_torch, item_redstone_torch);
        ItemMap.idResMap.put(R.drawable.boat, item_boat);
        ItemMap.idResMap.put(R.drawable.minecart, item_minecart);
        ItemMap.idResMap.put(R.drawable.powered_minecart, item_powered_minecart);
        ItemMap.idResMap.put(R.drawable.storage_minecart, item_storage_minecart);
        ItemMap.idResMap.put(R.drawable.minecart_with_hopper, item_minecart_with_hopper);
        ItemMap.idResMap.put(R.drawable.minecart_with_tnt, item_minecart_with_tnt);
        ItemMap.idResMap.put(R.drawable.rails, item_rails);
        ItemMap.idResMap.put(R.drawable.powered_rail, item_powered_rail);
        ItemMap.idResMap.put(R.drawable.detector_rail, item_detector_rail);
        ItemMap.idResMap.put(R.drawable.activator_rail, item_activator_rail);
        ItemMap.idResMap.put(R.drawable.tnt, item_tnt);
        ItemMap.idResMap.put(R.drawable.jukebox, item_jukebox);
        ItemMap.idResMap.put(R.drawable.note_block, item_note_block);
        ItemMap.idResMap.put(R.drawable.redstone_lamp, item_redstone_lamp);
        ItemMap.idResMap.put(R.drawable.daylight_sensor, item_daylight_sensor);
        ItemMap.idResMap.put(R.drawable.redstone_repeater, item_redstone_repeater);
        ItemMap.idResMap.put(R.drawable.redstone_comparator, item_redstone_comparator);
        ItemMap.idResMap.put(R.drawable.trapdoor, item_trapdoor);
        ItemMap.idResMap.put(R.drawable.iron_trapdoor, item_iron_trapdoor);
        ItemMap.idResMap.put(R.drawable.wood_pressure_plate, item_wood_pressure_plate);
        ItemMap.idResMap.put(R.drawable.stone_pressure_plate, item_stone_pressure_plate);
        ItemMap.idResMap.put(R.drawable.light_weighted_pressure_plate, item_light_weighted_pressure_plate);
        ItemMap.idResMap.put(R.drawable.heavy_weighted_pressure_plate, item_heavy_weighted_pressure_plate);
        ItemMap.idResMap.put(R.drawable.lever, item_lever);
        ItemMap.idResMap.put(R.drawable.wooden_button, item_wooden_button);
        ItemMap.idResMap.put(R.drawable.stone_button, item_stone_button);
        ItemMap.idResMap.put(R.drawable.piston, item_piston);
        ItemMap.idResMap.put(R.drawable.sticky_piston, item_sticky_piston);
        ItemMap.idResMap.put(R.drawable.dispenser, item_dispenser);
        ItemMap.idResMap.put(R.drawable.dropper, item_dropper);
        ItemMap.idResMap.put(R.drawable.hopper, item_hopper);
        ItemMap.idResMap.put(R.drawable.tripwire_hook, item_tripwire_hook);
        ItemMap.idResMap.put(R.drawable.trapped_chest, item_trapped_chest);

        redstoneMechanismItems.add(item_redstone_dust);
        redstoneMechanismItems.add(item_redstone_torch);
        redstoneMechanismItems.add(item_boat);
        redstoneMechanismItems.add(item_minecart);
        redstoneMechanismItems.add(item_powered_minecart);
        redstoneMechanismItems.add(item_storage_minecart);
        redstoneMechanismItems.add(item_minecart_with_hopper);
        redstoneMechanismItems.add(item_minecart_with_tnt);
        redstoneMechanismItems.add(item_rails);
        redstoneMechanismItems.add(item_powered_rail);
        redstoneMechanismItems.add(item_detector_rail);
        redstoneMechanismItems.add(item_activator_rail);
        redstoneMechanismItems.add(item_tnt);
        redstoneMechanismItems.add(item_jukebox);
        redstoneMechanismItems.add(item_note_block);
        redstoneMechanismItems.add(item_redstone_lamp);
        redstoneMechanismItems.add(item_daylight_sensor);
        redstoneMechanismItems.add(item_redstone_repeater);
        redstoneMechanismItems.add(item_redstone_comparator);
        redstoneMechanismItems.add(item_trapdoor);
        redstoneMechanismItems.add(item_iron_trapdoor);
        redstoneMechanismItems.add(item_wood_pressure_plate);
        redstoneMechanismItems.add(item_stone_pressure_plate);
        redstoneMechanismItems.add(item_light_weighted_pressure_plate);
        redstoneMechanismItems.add(item_heavy_weighted_pressure_plate);
        redstoneMechanismItems.add(item_lever);
        redstoneMechanismItems.add(item_wooden_button);
        redstoneMechanismItems.add(item_stone_button);
        redstoneMechanismItems.add(item_piston);
        redstoneMechanismItems.add(item_sticky_piston);
        redstoneMechanismItems.add(item_dispenser);
        redstoneMechanismItems.add(item_dropper);
        redstoneMechanismItems.add(item_hopper);
        redstoneMechanismItems.add(item_tripwire_hook);
        redstoneMechanismItems.add(item_trapped_chest);

    // Food/Brewing

        Item item_sugar = new Item(R.drawable.sugar, "sugar");
        Item item_sugar_cane = new Item(R.drawable.sugar_cane, "sugar_cane");
        Item item_milk = new Item(R.drawable.milk, "milk");
        Item item_egg = new Item(R.drawable.egg, "egg");
        Item item_cake = new Item(R.drawable.cake, "cake");
        Item item_cocoa_beans = new Item(R.drawable.cocoa_beans, "cocoa_beans");
        Item item_red_mushroom = new Item(R.drawable.red_mushroom, "red_mushroom");
        Item item_brown_mushroom = new Item(R.drawable.brown_mushroom, "brown_mushroom");
        Item item_apple = new Item(R.drawable.apple, "apple");
        Item item_golden_apple = new Item(R.drawable.golden_apple, "golden_apple");
        Item item_enchanted_golden_apple = new Item(R.drawable.enchanted_golden_apple, "enchanted_golden_apple");
        Item item_pumpkin =  new Item(R.drawable.pumpkin, "pumpkin");
        Item item_pumpkin_seeds = new Item(R.drawable.pumpkin_seeds, "pumpkin_seeds");
        Item item_pumpkin_pie = new Item(R.drawable.pumpkin_pie, "pumpkin_pie");
        Item item_melon = new Item(R.drawable.melon, "melon");
        Item item_melon_seeds = new Item(R.drawable.melon_seeds, "melon_seeds");
        Item item_melon_slice = new Item(R.drawable.melon_slice, "melon_slice");
        Item item_glistering_melon = new Item(R.drawable.glistering_melon, "glistering_melon");
        Item item_wheat = new Item(R.drawable.wheat, "wheat");
        Item item_hay_bale = new Item(R.drawable.hay_bale, "hay_bale");
        Item item_bread = new Item(R.drawable.bread, "bread");
        Item item_cookie = new Item(R.drawable.cookie, "cookie");
        Item item_carrot = new Item(R.drawable.carrot, "carrot");
        Item item_golden_carrot = new Item(R.drawable.golden_carrot, "golden_carrot");
        Item item_baked_potato = new Item(R.drawable.baked_potato, "baked_potato");
        Item item_cooked_rabbit = new Item(R.drawable.cooked_rabbit, "cooked_rabbit");
        Item item_blaze_rod = new Item(R.drawable.blaze_rod, "blaze_rod");
        Item item_blaze_powder = new Item(R.drawable.blaze_powder, "blaze_powder");
        Item item_spider_eye = new Item(R.drawable.spider_eye, "spider_eye");
        Item item_fermented_spider_eye = new Item(R.drawable.fermented_spider_eye, "fermented_spider_eye");
        Item item_slime_ball = new Item(R.drawable.slime_ball, "slime_ball");
        Item item_magma_creme = new Item(R.drawable.magma_cream, "magma_creme");
        Item item_bowl = new Item(R.drawable.bowl, "bowl");
        Item item_mushroom_stew = new Item(R.drawable.mushroom_stew, "mushroom_stew");
        Item item_rabbit_stew = new Item(R.drawable.rabbit_stew, "rabbit_stew");
        Item item_glass_bottle = new Item(R.drawable.glass_bottle, "glass_bottle");
        Item item_brewing_stand = new Item(R.drawable.brewing_stand, "brewing_stand");
        Item item_cauldron = new Item(R.drawable.cauldron, "cauldron");

        ItemMap.idResMap.put(R.drawable.sugar, item_sugar);
        ItemMap.idResMap.put(R.drawable.sugar_cane, item_sugar_cane);
        ItemMap.idResMap.put(R.drawable.milk, item_milk);
        ItemMap.idResMap.put(R.drawable.egg, item_egg);
        ItemMap.idResMap.put(R.drawable.cake, item_cake);
        ItemMap.idResMap.put(R.drawable.cocoa_beans, item_cocoa_beans);
        ItemMap.idResMap.put(R.drawable.red_mushroom, item_red_mushroom);
        ItemMap.idResMap.put(R.drawable.brown_mushroom, item_brown_mushroom);
        ItemMap.idResMap.put(R.drawable.apple, item_apple);
        ItemMap.idResMap.put(R.drawable.golden_apple, item_golden_apple);
        ItemMap.idResMap.put(R.drawable.enchanted_golden_apple, item_enchanted_golden_apple);
        ItemMap.idResMap.put(R.drawable.pumpkin, item_pumpkin);
        ItemMap.idResMap.put(R.drawable.pumpkin_seeds, item_pumpkin_seeds);
        ItemMap.idResMap.put(R.drawable.pumpkin_pie, item_pumpkin_pie);
        ItemMap.idResMap.put(R.drawable.melon, item_melon);
        ItemMap.idResMap.put(R.drawable.melon_seeds, item_melon_seeds);
        ItemMap.idResMap.put(R.drawable.melon_slice, item_melon_slice);
        ItemMap.idResMap.put(R.drawable.glistering_melon, item_glistering_melon);
        ItemMap.idResMap.put(R.drawable.wheat, item_wheat);
        ItemMap.idResMap.put(R.drawable.hay_bale, item_hay_bale);
        ItemMap.idResMap.put(R.drawable.bread, item_bread);
        ItemMap.idResMap.put(R.drawable.cookie, item_cookie);
        ItemMap.idResMap.put(R.drawable.carrot, item_carrot);
        ItemMap.idResMap.put(R.drawable.golden_carrot, item_golden_carrot);
        ItemMap.idResMap.put(R.drawable.baked_potato, item_baked_potato);
        ItemMap.idResMap.put(R.drawable.cooked_rabbit, item_cooked_rabbit);
        ItemMap.idResMap.put(R.drawable.blaze_rod, item_blaze_rod);
        ItemMap.idResMap.put(R.drawable.blaze_powder, item_blaze_powder);
        ItemMap.idResMap.put(R.drawable.spider_eye, item_spider_eye);
        ItemMap.idResMap.put(R.drawable.fermented_spider_eye, item_fermented_spider_eye);
        ItemMap.idResMap.put(R.drawable.slime_ball, item_slime_ball);
        ItemMap.idResMap.put(R.drawable.magma_cream, item_magma_creme);
        ItemMap.idResMap.put(R.drawable.bowl, item_bowl);
        ItemMap.idResMap.put(R.drawable.mushroom_stew, item_mushroom_stew);
        ItemMap.idResMap.put(R.drawable.rabbit_stew, item_rabbit_stew);
        ItemMap.idResMap.put(R.drawable.glass_bottle, item_glass_bottle);
        ItemMap.idResMap.put(R.drawable.brewing_stand, item_brewing_stand);
        ItemMap.idResMap.put(R.drawable.cauldron, item_cauldron);

        foodBrewingItems.add(item_sugar);
        foodBrewingItems.add(item_sugar_cane);
        foodBrewingItems.add(item_milk);
        foodBrewingItems.add(item_egg);
        foodBrewingItems.add(item_cake);
        foodBrewingItems.add(item_cocoa_beans);
        foodBrewingItems.add(item_red_mushroom);
        foodBrewingItems.add(item_brown_mushroom);
        foodBrewingItems.add(item_apple);
        foodBrewingItems.add(item_golden_apple);
        foodBrewingItems.add(item_enchanted_golden_apple);
        foodBrewingItems.add(item_pumpkin);
        foodBrewingItems.add(item_pumpkin_seeds);
        foodBrewingItems.add(item_pumpkin_pie);
        foodBrewingItems.add(item_melon);
        foodBrewingItems.add(item_melon_seeds);
        foodBrewingItems.add(item_melon_slice);
        foodBrewingItems.add(item_glistering_melon);
        foodBrewingItems.add(item_wheat);
        foodBrewingItems.add(item_hay_bale);
        foodBrewingItems.add(item_bread);
        foodBrewingItems.add(item_cookie);
        foodBrewingItems.add(item_carrot);
        foodBrewingItems.add(item_golden_carrot);
        foodBrewingItems.add(item_baked_potato);
        foodBrewingItems.add(item_cooked_rabbit);
        foodBrewingItems.add(item_blaze_rod);
        foodBrewingItems.add(item_blaze_powder);
        foodBrewingItems.add(item_spider_eye);
        foodBrewingItems.add(item_fermented_spider_eye);
        foodBrewingItems.add(item_slime_ball);
        foodBrewingItems.add(item_magma_creme);
        foodBrewingItems.add(item_bowl);
        foodBrewingItems.add(item_mushroom_stew);
        foodBrewingItems.add(item_rabbit_stew);
        foodBrewingItems.add(item_glass_bottle);
        foodBrewingItems.add(item_brewing_stand);
        foodBrewingItems.add(item_cauldron);

    // Tools/Combat

        Item item_fishing_rod = new Item(R.drawable.fishing_rod, "fishing_rod");
        Item item_carrot_on_a_stick = new Item(R.drawable.carrot_on_a_stick, "carrot_on_a_stick");
        Item item_flint_and_steel = new Item(R.drawable.flint_and_steel, "flint_and_steel");
        Item item_shears =  new Item(R.drawable.shears, "shears");
        Item item_lead =  new Item(R.drawable.lead, "lead");
        Item item_bucket = new Item(R.drawable.bucket, "bucket");
        Item item_clock = new Item(R.drawable.clock, "clock");
        Item item_compass = new Item(R.drawable.compass, "compass");
        Item item_map = new Item(R.drawable.map, "map");
        Item item_iron_helmet = new Item(R.drawable.iron_helmet, "iron_helmet");
        Item item_iron_chestplate = new Item(R.drawable.iron_chestplate, "iron_chestplate");
        Item item_iron_leggings = new Item(R.drawable.iron_leggings, "iron_leggings");
        Item item_iron_boots = new Item(R.drawable.iron_boots, "iron_boots");
        Item item_diamond_helmet = new Item(R.drawable.diamond_helmet, "diamond_helmet");
        Item item_diamond_chestplate = new Item(R.drawable.diamond_chestplate, "diamond_chestplate");
        Item item_diamond_leggings = new Item(R.drawable.diamond_leggings, "diamond_leggings");
        Item item_diamond_boots = new Item(R.drawable.diamond_boots, "diamond_boots");
        Item item_gold_helmet = new Item(R.drawable.gold_helmet, "gold_helmet");
        Item item_gold_chestplate = new Item(R.drawable.gold_chestplate, "gold_chestplate");
        Item item_gold_leggings = new Item(R.drawable.gold_leggings, "gold_leggings");
        Item item_gold_boots = new Item(R.drawable.gold_boots, "gold_boots");
        Item item_leather_helmet = new Item(R.drawable.leather_helmet, "leather_helmet");
        Item item_leather_chestplate = new Item(R.drawable.leather_chestplate, "leather_chestplate");
        Item item_leather_leggings = new Item(R.drawable.leather_leggings, "leather_leggings");
        Item item_leather_boots = new Item(R.drawable.leather_boots, "leather_boots");
        Item item_bow = new Item(R.drawable.bow, "bow");
        Item item_arrow = new Item(R.drawable.arrow, "arrow");
        Item item_wooden_sword = new Item(R.drawable.wooden_sword, "wooden_sword");
        Item item_stone_sword = new Item(R.drawable.stone_sword, "stone_sword");
        Item item_iron_sword = new Item(R.drawable.iron_sword, "iron_sword");
        Item item_gold_sword = new Item(R.drawable.gold_sword, "gold_sword");
        Item item_diamond_sword = new Item(R.drawable.diamond_sword, "diamond_sword");
        Item item_wooden_pickaxe = new Item(R.drawable.wooden_pickaxe, "wooden_pickaxe");
        Item item_stone_pickaxe = new Item(R.drawable.stone_pickaxe, "stone_pickaxe");
        Item item_iron_pickaxe = new Item(R.drawable.iron_pickaxe, "iron_pickaxe");
        Item item_gold_pickaxe = new Item(R.drawable.gold_pickaxe, "gold_pickaxe");
        Item item_diamond_pickaxe = new Item(R.drawable.diamond_pickaxe, "diamond_pickaxe");
        Item item_wooden_shovel = new Item(R.drawable.wooden_shovel, "wooden_shovel");
        Item item_stone_shovel = new Item(R.drawable.stone_shovel, "stone_shovel");
        Item item_iron_shovel = new Item(R.drawable.iron_shovel, "iron_shovel");
        Item item_gold_shovel = new Item(R.drawable.gold_shovel, "gold_shovel");
        Item item_diamond_shovel = new Item(R.drawable.diamond_shovel, "diamond_shovel");
        Item item_wooden_axe = new Item(R.drawable.wooden_axe, "wooden_axe");
        Item item_stone_axe = new Item(R.drawable.stone_axe, "stone_axe");
        Item item_iron_axe = new Item(R.drawable.iron_axe, "iron_axe");
        Item item_gold_axe = new Item(R.drawable.gold_axe, "gold_axe");
        Item item_diamond_axe = new Item(R.drawable.diamond_axe, "diamond_axe");
        Item item_wooden_hoe = new Item(R.drawable.wooden_hoe, "wooden_hoe");
        Item item_stone_hoe = new Item(R.drawable.stone_hoe, "stone_hoe");
        Item item_iron_hoe = new Item(R.drawable.iron_hoe, "iron_hoe");
        Item item_gold_hoe = new Item(R.drawable.gold_hoe, "gold_hoe");
        Item item_diamond_hoe = new Item(R.drawable.diamond_hoe, "diamond_hoe");

        ItemMap.idResMap.put(R.drawable.fishing_rod, item_fishing_rod);
        ItemMap.idResMap.put(R.drawable.carrot_on_a_stick, item_carrot_on_a_stick);
        ItemMap.idResMap.put(R.drawable.flint_and_steel, item_flint_and_steel);
        ItemMap.idResMap.put(R.drawable.shears, item_shears);
        ItemMap.idResMap.put(R.drawable.lead, item_lead);
        ItemMap.idResMap.put(R.drawable.bucket, item_bucket);
        ItemMap.idResMap.put(R.drawable.clock, item_clock);
        ItemMap.idResMap.put(R.drawable.compass, item_compass);
        ItemMap.idResMap.put(R.drawable.map, item_map);
        ItemMap.idResMap.put(R.drawable.iron_helmet, item_iron_helmet);
        ItemMap.idResMap.put(R.drawable.iron_chestplate, item_iron_chestplate);
        ItemMap.idResMap.put(R.drawable.iron_leggings, item_iron_leggings);
        ItemMap.idResMap.put(R.drawable.iron_boots, item_iron_boots);
        ItemMap.idResMap.put(R.drawable.diamond_helmet, item_diamond_helmet);
        ItemMap.idResMap.put(R.drawable.diamond_chestplate, item_diamond_chestplate);
        ItemMap.idResMap.put(R.drawable.diamond_leggings, item_diamond_leggings);
        ItemMap.idResMap.put(R.drawable.diamond_boots, item_diamond_boots);
        ItemMap.idResMap.put(R.drawable.gold_helmet, item_gold_helmet);
        ItemMap.idResMap.put(R.drawable.gold_chestplate, item_gold_chestplate);
        ItemMap.idResMap.put(R.drawable.gold_leggings, item_gold_leggings);
        ItemMap.idResMap.put(R.drawable.gold_boots, item_gold_boots);
        ItemMap.idResMap.put(R.drawable.leather_helmet, item_leather_helmet);
        ItemMap.idResMap.put(R.drawable.leather_chestplate, item_leather_chestplate);
        ItemMap.idResMap.put(R.drawable.leather_leggings, item_leather_leggings);
        ItemMap.idResMap.put(R.drawable.leather_boots, item_leather_boots);
        ItemMap.idResMap.put(R.drawable.bow, item_bow);
        ItemMap.idResMap.put(R.drawable.arrow, item_arrow);
        ItemMap.idResMap.put(R.drawable.wooden_sword, item_wooden_sword);
        ItemMap.idResMap.put(R.drawable.stone_sword, item_stone_sword);
        ItemMap.idResMap.put(R.drawable.iron_sword, item_iron_sword);
        ItemMap.idResMap.put(R.drawable.gold_sword, item_gold_sword);
        ItemMap.idResMap.put(R.drawable.diamond_sword, item_diamond_sword);
        ItemMap.idResMap.put(R.drawable.wooden_pickaxe, item_wooden_pickaxe);
        ItemMap.idResMap.put(R.drawable.stone_pickaxe, item_stone_pickaxe);
        ItemMap.idResMap.put(R.drawable.iron_pickaxe, item_iron_pickaxe);
        ItemMap.idResMap.put(R.drawable.gold_pickaxe, item_gold_pickaxe);
        ItemMap.idResMap.put(R.drawable.diamond_pickaxe, item_diamond_pickaxe);
        ItemMap.idResMap.put(R.drawable.wooden_shovel, item_wooden_shovel);
        ItemMap.idResMap.put(R.drawable.stone_shovel, item_stone_shovel);
        ItemMap.idResMap.put(R.drawable.iron_shovel, item_iron_shovel);
        ItemMap.idResMap.put(R.drawable.gold_shovel, item_gold_shovel);
        ItemMap.idResMap.put(R.drawable.diamond_shovel, item_diamond_shovel);
        ItemMap.idResMap.put(R.drawable.wooden_axe, item_wooden_axe);
        ItemMap.idResMap.put(R.drawable.stone_axe, item_stone_axe);
        ItemMap.idResMap.put(R.drawable.iron_axe, item_iron_axe);
        ItemMap.idResMap.put(R.drawable.gold_axe, item_gold_axe);
        ItemMap.idResMap.put(R.drawable.diamond_axe, item_diamond_axe);
        ItemMap.idResMap.put(R.drawable.wooden_hoe, item_wooden_hoe);
        ItemMap.idResMap.put(R.drawable.stone_hoe, item_stone_hoe);
        ItemMap.idResMap.put(R.drawable.iron_hoe, item_iron_hoe);
        ItemMap.idResMap.put(R.drawable.gold_hoe, item_gold_hoe);
        ItemMap.idResMap.put(R.drawable.diamond_hoe, item_diamond_hoe);

        toolsCombatItems.add(item_fishing_rod);
        toolsCombatItems.add(item_carrot_on_a_stick);
        toolsCombatItems.add(item_flint_and_steel);
        toolsCombatItems.add(item_shears);
        toolsCombatItems.add(item_lead);
        toolsCombatItems.add(item_bucket);
        toolsCombatItems.add(item_clock);
        toolsCombatItems.add(item_compass);
        toolsCombatItems.add(item_map);
        toolsCombatItems.add(item_iron_helmet);
        toolsCombatItems.add(item_iron_chestplate);
        toolsCombatItems.add(item_iron_leggings);
        toolsCombatItems.add(item_iron_boots);
        toolsCombatItems.add(item_diamond_helmet);
        toolsCombatItems.add(item_diamond_chestplate);
        toolsCombatItems.add(item_diamond_leggings);
        toolsCombatItems.add(item_diamond_boots);
        toolsCombatItems.add(item_gold_helmet);
        toolsCombatItems.add(item_gold_chestplate);
        toolsCombatItems.add(item_gold_leggings);
        toolsCombatItems.add(item_gold_boots);
        toolsCombatItems.add(item_leather_helmet);
        toolsCombatItems.add(item_leather_chestplate);
        toolsCombatItems.add(item_leather_leggings);
        toolsCombatItems.add(item_leather_boots);
        toolsCombatItems.add(item_bow);
        toolsCombatItems.add(item_arrow);
        toolsCombatItems.add(item_wooden_sword);
        toolsCombatItems.add(item_stone_sword);
        toolsCombatItems.add(item_iron_sword);
        toolsCombatItems.add(item_gold_sword);
        toolsCombatItems.add(item_diamond_sword);
        toolsCombatItems.add(item_wooden_pickaxe);
        toolsCombatItems.add(item_stone_pickaxe);
        toolsCombatItems.add(item_iron_pickaxe);
        toolsCombatItems.add(item_gold_pickaxe);
        toolsCombatItems.add(item_diamond_pickaxe);
        toolsCombatItems.add(item_wooden_shovel);
        toolsCombatItems.add(item_stone_shovel);
        toolsCombatItems.add(item_iron_shovel);
        toolsCombatItems.add(item_gold_shovel);
        toolsCombatItems.add(item_diamond_shovel);
        toolsCombatItems.add(item_wooden_axe);
        toolsCombatItems.add(item_stone_axe);
        toolsCombatItems.add(item_iron_axe);
        toolsCombatItems.add(item_gold_axe);
        toolsCombatItems.add(item_diamond_axe);
        toolsCombatItems.add(item_wooden_hoe);
        toolsCombatItems.add(item_stone_hoe);
        toolsCombatItems.add(item_iron_hoe);
        toolsCombatItems.add(item_gold_hoe);
        toolsCombatItems.add(item_diamond_hoe);


    // Materials/Misc
        Item item_flint = new Item(R.drawable.flint, "flint");
        Item item_coal = new Item(R.drawable.coal, "coal");
        Item item_block_of_coal = new Item(R.drawable.block_of_coal, "block_of_coal");
        Item item_gunpowder = new Item(R.drawable.gunpowder, "gunpowder");
        Item item_glowstone_dust = new Item(R.drawable.glowstone_dust, "glowstone_dust");
        Item item_string = new Item(R.drawable.string, "string");
        Item item_stick = new Item(R.drawable.stick, "stick");
        Item item_wooden_plank = new Item(R.drawable.wooden_plank, "wooden_plank");
        Item item_wood = new Item(R.drawable.wood, "wood");
        Item item_feather = new Item(R.drawable.feather, "feather");
        Item item_paper = new Item(R.drawable.paper, "paper");
        Item item_book = new Item(R.drawable.book, "book");
        Item item_book_and_quill = new Item(R.drawable.book_and_quill, "book_and_quill");
        Item item_nether_brick = new Item(R.drawable.nether_brick, "nether_brick");
        Item item_clay_brick = new Item(R.drawable.clay_brick, "clay_brick");
        Item item_clay = new Item(R.drawable.clay, "clay");
        Item item_clay_block = new Item(R.drawable.clay_block, "clay_block");
        Item item_nether_quartz = new Item(R.drawable.nether_quartz, "nether_quartz");
        Item item_nether_star = new Item(R.drawable.nether_star, "nether_star");
        Item item_leather = new Item(R.drawable.leather, "leather");
        Item item_gold_nugget = new Item(R.drawable.gold_nugget, "gold_nugget");
        Item item_iron = new Item(R.drawable.iron, "iron");
        Item item_gold = new Item(R.drawable.gold, "gold");
        Item item_diamond = new Item(R.drawable.diamond, "diamond");
        Item item_iron_block = new Item(R.drawable.iron_block, "iron_block");
        Item item_gold_block = new Item(R.drawable.gold_block, "gold_block");
        Item item_diamond_block = new Item(R.drawable.diamond_block, "diamond_block");
        Item item_obsidian = new Item(R.drawable.obsidian, "obsidian");
        Item item_ender_pearl = new Item(R.drawable.ender_pearl, "ender_pearl");
        Item item_eye_of_ender = new Item(R.drawable.eye_of_ender, "eye_of_ender");
        Item item_prismarine_crystals = new Item(R.drawable.prismarine_crystals, "prismarine_crystals");
        Item item_prismarine_shard = new Item(R.drawable.prismarine_shard, "prismarine_shard");
        Item item_ink_sac = new Item(R.drawable.ink_sac, "ink_sac");
        Item item_wool = new Item(R.drawable.wool, "wool");

        ItemMap.idResMap.put(R.drawable.flint, item_flint);
        ItemMap.idResMap.put(R.drawable.coal, item_coal);
        ItemMap.idResMap.put(R.drawable.block_of_coal, item_block_of_coal);
        ItemMap.idResMap.put(R.drawable.gunpowder, item_gunpowder);
        ItemMap.idResMap.put(R.drawable.glowstone_dust, item_glowstone_dust);
        ItemMap.idResMap.put(R.drawable.string, item_string);
        ItemMap.idResMap.put(R.drawable.stick, item_stick);
        ItemMap.idResMap.put(R.drawable.wooden_plank, item_wooden_plank);
        ItemMap.idResMap.put(R.drawable.wood, item_wood);
        ItemMap.idResMap.put(R.drawable.feather, item_feather);
        ItemMap.idResMap.put(R.drawable.paper, item_paper);
        ItemMap.idResMap.put(R.drawable.book, item_book);
        ItemMap.idResMap.put(R.drawable.book_and_quill, item_book_and_quill);
        ItemMap.idResMap.put(R.drawable.nether_brick, item_nether_brick);
        ItemMap.idResMap.put(R.drawable.clay_brick, item_clay_brick);
        ItemMap.idResMap.put(R.drawable.clay, item_clay);
        ItemMap.idResMap.put(R.drawable.clay_block, item_clay_block);
        ItemMap.idResMap.put(R.drawable.nether_quartz, item_nether_quartz);
        ItemMap.idResMap.put(R.drawable.nether_star, item_nether_star);
        ItemMap.idResMap.put(R.drawable.leather, item_leather);
        ItemMap.idResMap.put(R.drawable.gold_nugget, item_gold_nugget);
        ItemMap.idResMap.put(R.drawable.iron, item_iron);
        ItemMap.idResMap.put(R.drawable.gold, item_gold);
        ItemMap.idResMap.put(R.drawable.diamond, item_diamond);
        ItemMap.idResMap.put(R.drawable.iron_block, item_iron_block);
        ItemMap.idResMap.put(R.drawable.gold_block, item_gold_block);
        ItemMap.idResMap.put(R.drawable.diamond_block, item_diamond_block);
        ItemMap.idResMap.put(R.drawable.obsidian, item_obsidian);
        ItemMap.idResMap.put(R.drawable.ender_pearl, item_ender_pearl);
        ItemMap.idResMap.put(R.drawable.eye_of_ender, item_eye_of_ender);
        ItemMap.idResMap.put(R.drawable.prismarine_crystals, item_prismarine_crystals);
        ItemMap.idResMap.put(R.drawable.prismarine_shard, item_prismarine_shard);
        ItemMap.idResMap.put(R.drawable.ink_sac, item_ink_sac);
        ItemMap.idResMap.put(R.drawable.wool, item_wool);

        materialsMiscItems.add(item_flint);
        materialsMiscItems.add(item_coal);
        materialsMiscItems.add(item_block_of_coal);
        materialsMiscItems.add(item_gunpowder);
        materialsMiscItems.add(item_glowstone_dust);
        materialsMiscItems.add(item_string);
        materialsMiscItems.add(item_stick);
        materialsMiscItems.add(item_wooden_plank);
        materialsMiscItems.add(item_wood);
        materialsMiscItems.add(item_feather);
        materialsMiscItems.add(item_paper);
        materialsMiscItems.add(item_book);
        materialsMiscItems.add(item_book_and_quill);
        materialsMiscItems.add(item_nether_brick);
        materialsMiscItems.add(item_clay_brick);
        materialsMiscItems.add(item_clay);
        materialsMiscItems.add(item_clay_block);
        materialsMiscItems.add(item_nether_quartz);
        materialsMiscItems.add(item_nether_star);
        materialsMiscItems.add(item_leather);
        materialsMiscItems.add(item_gold_nugget);
        materialsMiscItems.add(item_iron);
        materialsMiscItems.add(item_gold);
        materialsMiscItems.add(item_diamond);
        materialsMiscItems.add(item_iron_block);
        materialsMiscItems.add(item_gold_block);
        materialsMiscItems.add(item_diamond_block);
        materialsMiscItems.add(item_obsidian);
        materialsMiscItems.add(item_ender_pearl);
        materialsMiscItems.add(item_eye_of_ender);
        materialsMiscItems.add(item_prismarine_crystals);
        materialsMiscItems.add(item_prismarine_shard);
        materialsMiscItems.add(item_ink_sac);
        materialsMiscItems.add(item_wool);

        // Assign adapters
        buildingDecorAdapter = new ItemAdapter(this, buildingDecorItems);
        redstoneMechanismAdapter = new ItemAdapter(this, redstoneMechanismItems);
        foodBrewingAdapter = new ItemAdapter(this, foodBrewingItems);
        toolsCombatAdapter = new ItemAdapter(this, toolsCombatItems);
        materialMiscAdapter =  new ItemAdapter(this, materialsMiscItems);

        Typeface typeFace = Typeface.createFromAsset(getAssets(), "minecraft_font.ttf");

        // Result Text Box

        final TextView resultText = (TextView) findViewById(R.id.resultText);
        resultText.setTypeface(typeFace);
        final ImageView bd_image = (ImageView) findViewById(R.id.bd_imageView);
        final ImageView rm_image = (ImageView) findViewById(R.id.rm_imageView);
        final ImageView fb_image = (ImageView) findViewById(R.id.fb_imageView);
        final ImageView tc_image = (ImageView) findViewById(R.id.tc_imageView);
        final ImageView mm_image = (ImageView) findViewById(R.id.mm_imageView);

        // Button listeners:
        final ListView list = (ListView)findViewById(R.id.listViewForCategory);
        list.setAdapter(buildingDecorAdapter); // default inital list shown
        bd_image.setImageResource(R.drawable.double_right_arrow);

        Button buildingDecorButton = (Button) findViewById(R.id.building_decor);
        buildingDecorButton.setTypeface(typeFace);
        buildingDecorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.setAdapter(buildingDecorAdapter);
                bd_image.setImageResource(R.drawable.double_right_arrow);
                rm_image.setImageResource(android.R.color.transparent);
                fb_image.setImageResource(android.R.color.transparent);
                tc_image.setImageResource(android.R.color.transparent);
                mm_image.setImageResource(android.R.color.transparent);
            }
        });
        Button redstoneMechanismButton = (Button) findViewById(R.id.redstone_mechanism);
        redstoneMechanismButton.setTypeface(typeFace);
        redstoneMechanismButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.setAdapter(redstoneMechanismAdapter);
                bd_image.setImageResource(android.R.color.transparent);
                rm_image.setImageResource(R.drawable.double_right_arrow);
                fb_image.setImageResource(android.R.color.transparent);
                tc_image.setImageResource(android.R.color.transparent);
                mm_image.setImageResource(android.R.color.transparent);
            }
        });
        Button foodBrewingButton = (Button) findViewById(R.id.food_brewing);
        foodBrewingButton.setTypeface(typeFace);
        foodBrewingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.setAdapter(foodBrewingAdapter);
                bd_image.setImageResource(android.R.color.transparent);
                rm_image.setImageResource(android.R.color.transparent);
                fb_image.setImageResource(R.drawable.double_right_arrow);
                tc_image.setImageResource(android.R.color.transparent);
                mm_image.setImageResource(android.R.color.transparent);
            }
        });
        Button toolsCombatButton = (Button) findViewById(R.id.tools_combat);
        toolsCombatButton.setTypeface(typeFace);
        toolsCombatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.setAdapter(toolsCombatAdapter);
                bd_image.setImageResource(android.R.color.transparent);
                rm_image.setImageResource(android.R.color.transparent);
                fb_image.setImageResource(android.R.color.transparent);
                tc_image.setImageResource(R.drawable.double_right_arrow);
                mm_image.setImageResource(android.R.color.transparent);
            }
        });
        Button materialsMiscButton = (Button) findViewById(R.id.materials_misc);
        materialsMiscButton.setTypeface(typeFace);
        materialsMiscButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.setAdapter(materialMiscAdapter);
                bd_image.setImageResource(android.R.color.transparent);
                rm_image.setImageResource(android.R.color.transparent);
                fb_image.setImageResource(android.R.color.transparent);
                tc_image.setImageResource(android.R.color.transparent);
                mm_image.setImageResource(R.drawable.double_right_arrow);
            }
        });

        // Crafting table drop listeners
        final ImageView topLeft = (ImageView)findViewById(R.id.top_left);
        topLeft.setOnDragListener(new MyDragEventListener(this));

        final ImageView topCenter = (ImageView)findViewById(R.id.top_center);
        topCenter.setOnDragListener(new MyDragEventListener(this));

        final ImageView topRight = (ImageView)findViewById(R.id.top_right);
        topRight.setOnDragListener(new MyDragEventListener(this));

        final ImageView left = (ImageView)findViewById(R.id.left);
        left.setOnDragListener(new MyDragEventListener(this));

        final ImageView center = (ImageView)findViewById(R.id.center);
        center.setOnDragListener(new MyDragEventListener(this));

        final ImageView right = (ImageView)findViewById(R.id.right);
        right.setOnDragListener(new MyDragEventListener(this));

        final ImageView bottomLeft = (ImageView)findViewById(R.id.bottom_left);
        bottomLeft.setOnDragListener(new MyDragEventListener(this));

        final ImageView bottomCenter = (ImageView)findViewById(R.id.bottom_center);
        bottomCenter.setOnDragListener(new MyDragEventListener(this));

        final ImageView bottomRight = (ImageView)findViewById(R.id.bottom_right);
        bottomRight.setOnDragListener(new MyDragEventListener(this));

        final ImageView result = (ImageView)findViewById(R.id.result);
        result.setOnDragListener(new MyDragEventListener(this));

        // Clear Button
        // Reset entire table and result box and set TextView to blank
        Button clear = (Button)findViewById(R.id.clear);
        clear.setTypeface(typeFace);
        clear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                topLeft.setImageResource(android.R.color.transparent);
                topCenter.setImageResource(android.R.color.transparent);
                topRight.setImageResource(android.R.color.transparent);
                left.setImageResource(android.R.color.transparent);
                center.setImageResource(android.R.color.transparent);
                right.setImageResource(android.R.color.transparent);
                bottomLeft.setImageResource(android.R.color.transparent);
                bottomCenter.setImageResource(android.R.color.transparent);
                bottomRight.setImageResource(android.R.color.transparent);
                result.setImageResource(android.R.color.transparent);
                table.clearTable();
                resultText.setText("");
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_crafting_table, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
