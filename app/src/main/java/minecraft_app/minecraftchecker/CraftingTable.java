package minecraft_app.minecraftchecker;

//import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

import la_hacks.minecraftchecker.R;


public class CraftingTable extends Activity {

    private ArrayList<Item> buildingDecorItems;
    private ArrayList<Item> redstoneTransportItems;
    private ArrayList<Item> foodBrewingItems;
    private ArrayList<Item> toolsCombatItems;
    private ArrayList<Item> materialsMiscItems;
    private ItemAdapter buildingDecorAdapter;
    private ItemAdapter redstoneTransportAdapter;
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
        redstoneTransportItems = new ArrayList<Item>();
        foodBrewingItems = new ArrayList<Item>();
        toolsCombatItems = new ArrayList<Item>();
        materialsMiscItems = new ArrayList<Item>();
    // Building/Decor

        Item item_cobblestone = new Item(R.drawable.cobblestone, "cobblestone");
        Item item_stone = new Item(R.drawable.stone, "stone");
        Item item_dirt = new Item(R.drawable.dirt, "dirt");
        Item item_sand = new Item(R.drawable.sand, "sand");
        Item item_wood = new Item(R.drawable.wood, "wood");
        Item item_glass = new Item(R.drawable.glass, "glass");

        ItemMap.idResMap.put(R.drawable.cobblestone, item_cobblestone);
        ItemMap.idResMap.put(R.drawable.stone, item_stone);
        ItemMap.idResMap.put(R.drawable.dirt, item_dirt);
        ItemMap.idResMap.put(R.drawable.sand, item_sand);
        ItemMap.idResMap.put(R.drawable.wood, item_wood);
        ItemMap.idResMap.put(R.drawable.glass, item_glass);

        buildingDecorItems.add(item_cobblestone);
        buildingDecorItems.add(item_stone);
        buildingDecorItems.add(item_dirt);
        buildingDecorItems.add(item_sand);
        buildingDecorItems.add(item_wood);
        buildingDecorItems.add(item_glass);

    // Redstone/Transportation

        Item item_redstone_dust = new Item(R.drawable.redstone_dust, "redstone_dust");
        Item item_redstone_torch =  new Item(R.drawable.redstone_torch, "redstone_torch");
        Item item_redstone_repeater = new Item(R.drawable.redstone_repeater, "redstone_repeater");
        Item item_rails = new Item(R.drawable.rails, "rails");
        Item item_powered_rail = new Item(R.drawable.powered_rail, "powered_rail");
        Item item_boat = new Item(R.drawable.boat, "boat");


        ItemMap.idResMap.put(R.drawable.redstone_dust, item_redstone_dust);
        ItemMap.idResMap.put(R.drawable.redstone_torch, item_redstone_torch);
        ItemMap.idResMap.put(R.drawable.redstone_repeater, item_redstone_repeater);
        ItemMap.idResMap.put(R.drawable.rails, item_rails);
        ItemMap.idResMap.put(R.drawable.powered_rail, item_powered_rail);
        ItemMap.idResMap.put(R.drawable.boat, item_boat);

        redstoneTransportItems.add(item_redstone_dust);
        redstoneTransportItems.add(item_redstone_torch);
        redstoneTransportItems.add(item_redstone_repeater);
        redstoneTransportItems.add(item_rails);
        redstoneTransportItems.add(item_powered_rail);
        redstoneTransportItems.add(item_boat);

    // Food/Brewing

        // Note to self: You cannot "craft" many food items, consider omitting many of these
        Item item_bread = new Item(R.drawable.bread, "bread");
        Item item_steak = new Item(R.drawable.steak, "steak");
        Item item_cookie = new Item(R.drawable.cookie, "cookie");
        Item item_carrot = new Item(R.drawable.carrot, "carrot");
        Item item_potato = new Item(R.drawable.potato, "potato");
        Item item_glass_bottle = new Item(R.drawable.glass_bottle, "glass_bottle");

        ItemMap.idResMap.put(R.drawable.bread, item_bread);
        ItemMap.idResMap.put(R.drawable.steak, item_steak);
        ItemMap.idResMap.put(R.drawable.cookie, item_cookie);
        ItemMap.idResMap.put(R.drawable.carrot, item_carrot);
        ItemMap.idResMap.put(R.drawable.potato, item_potato);
        ItemMap.idResMap.put(R.drawable.glass_bottle, item_glass_bottle);

        foodBrewingItems.add(item_bread);
        foodBrewingItems.add(item_steak);
        foodBrewingItems.add(item_cookie);
        foodBrewingItems.add(item_carrot);
        foodBrewingItems.add(item_potato);
        foodBrewingItems.add(item_glass_bottle);

    // Tools/Combat

        Item item_iron_helmet = new Item(R.drawable.iron_helmet, "iron_helmet");
        Item item_iron_chestplate = new Item(R.drawable.iron_chestplate, "iron_chestplate");
        Item item_iron_leggings = new Item(R.drawable.iron_leggings, "iron_leggings");
        Item item_iron_boots = new Item(R.drawable.iron_boots, "iron_boots");
        Item item_diamond_helmet = new Item(R.drawable.diamond_helmet, "diamond_helmet");
        Item item_diamond_chestplate = new Item(R.drawable.diamond_chestplate, "diamond_chestplate");
        Item item_diamond_leggings = new Item(R.drawable.diamond_leggings, "diamond_leggings");
        Item item_diamond_boots = new Item(R.drawable.diamond_boots, "diamond_boots");

        ItemMap.idResMap.put(R.drawable.iron_helmet, item_iron_helmet);
        ItemMap.idResMap.put(R.drawable.iron_chestplate, item_iron_chestplate);
        ItemMap.idResMap.put(R.drawable.iron_leggings, item_iron_leggings);
        ItemMap.idResMap.put(R.drawable.iron_boots, item_iron_boots);
        ItemMap.idResMap.put(R.drawable.diamond_helmet, item_diamond_helmet);
        ItemMap.idResMap.put(R.drawable.diamond_chestplate, item_diamond_chestplate);
        ItemMap.idResMap.put(R.drawable.diamond_leggings, item_diamond_leggings);
        ItemMap.idResMap.put(R.drawable.diamond_boots, item_diamond_boots);

        toolsCombatItems.add(item_iron_helmet);
        toolsCombatItems.add(item_iron_chestplate);
        toolsCombatItems.add(item_iron_leggings);
        toolsCombatItems.add(item_iron_boots);
        toolsCombatItems.add(item_diamond_helmet);
        toolsCombatItems.add(item_diamond_chestplate);
        toolsCombatItems.add(item_diamond_leggings);
        toolsCombatItems.add(item_diamond_boots);


    // Materials/Misc
        Item item_coal = new Item(R.drawable.coal, "coal");
        Item item_stick = new Item(R.drawable.stick, "stick");
        Item item_leather = new Item(R.drawable.leather, "leather");
        Item item_iron = new Item(R.drawable.iron, "iron");
        Item item_gold = new Item(R.drawable.gold, "gold");
        Item item_diamond = new Item(R.drawable.diamond, "diamond");

        ItemMap.idResMap.put(R.drawable.coal, item_coal);
        ItemMap.idResMap.put(R.drawable.stick, item_stick);
        ItemMap.idResMap.put(R.drawable.leather, item_leather);
        ItemMap.idResMap.put(R.drawable.iron, item_iron);
        ItemMap.idResMap.put(R.drawable.gold, item_gold);
        ItemMap.idResMap.put(R.drawable.diamond, item_diamond);

        materialsMiscItems.add(item_coal);
        materialsMiscItems.add(item_stick);
        materialsMiscItems.add(item_leather);
        materialsMiscItems.add(item_iron);
        materialsMiscItems.add(item_gold);
        materialsMiscItems.add(item_diamond);

        // Assign adapters
        buildingDecorAdapter = new ItemAdapter(this, buildingDecorItems);
        redstoneTransportAdapter = new ItemAdapter(this, redstoneTransportItems);
        foodBrewingAdapter = new ItemAdapter(this, foodBrewingItems);
        toolsCombatAdapter = new ItemAdapter(this, toolsCombatItems);
        materialMiscAdapter =  new ItemAdapter(this, materialsMiscItems);

        // Button listeners:

        final ListView list = (ListView)findViewById(R.id.listViewForCategory);
        list.setAdapter(buildingDecorAdapter); // default inital list shown
        Button buildingDecorButton = (Button) findViewById(R.id.building_decor);
        buildingDecorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.setAdapter(buildingDecorAdapter);
            }
        });
        Button redstoneTransportButton = (Button) findViewById(R.id.redstone_transport);
        redstoneTransportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.setAdapter(redstoneTransportAdapter);
            }
        });
        Button foodBrewingButton = (Button) findViewById(R.id.food_brewing);
        foodBrewingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.setAdapter(foodBrewingAdapter);
            }
        });
        Button toolsCombatButton = (Button) findViewById(R.id.tools_combat);
        toolsCombatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.setAdapter(toolsCombatAdapter);
            }
        });
        Button materialsMiscButton = (Button) findViewById(R.id.materials_misc);
        materialsMiscButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.setAdapter(materialMiscAdapter);
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
        // Reset entire table and result box
        Button clear = (Button)findViewById(R.id.clear);
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
