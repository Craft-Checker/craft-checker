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
        buildingDecorItems.add(new Item(R.drawable.cobblestone));
        buildingDecorItems.add(new Item(R.drawable.stone));
        buildingDecorItems.add(new Item(R.drawable.dirt));
        buildingDecorItems.add(new Item(R.drawable.sand));
        buildingDecorItems.add(new Item(R.drawable.wood));
        buildingDecorItems.add(new Item(R.drawable.glass));

    // Redstone/Transportation
        redstoneTransportItems.add(new Item(R.drawable.redstone_dust));
        redstoneTransportItems.add(new Item(R.drawable.redstone_torch));
        redstoneTransportItems.add(new Item(R.drawable.redstone_repeater));
        redstoneTransportItems.add(new Item(R.drawable.rails));
        redstoneTransportItems.add(new Item(R.drawable.powered_rail));
        redstoneTransportItems.add(new Item(R.drawable.boat));

    // Food/Brewing
        foodBrewingItems.add(new Item(R.drawable.bread));
        foodBrewingItems.add(new Item(R.drawable.steak));
        foodBrewingItems.add(new Item(R.drawable.cookie));
        foodBrewingItems.add(new Item(R.drawable.carrot));
        foodBrewingItems.add(new Item(R.drawable.potato));
        foodBrewingItems.add(new Item(R.drawable.glass_bottle));

    // Tools/Combat
        toolsCombatItems.add(new Item(R.drawable.iron_helmet));
        toolsCombatItems.add(new Item(R.drawable.iron_chestplate));
        toolsCombatItems.add(new Item(R.drawable.iron_leggings));
        toolsCombatItems.add(new Item(R.drawable.iron_boots));
        toolsCombatItems.add(new Item(R.drawable.diamond_helmet));
        toolsCombatItems.add(new Item(R.drawable.diamond_chestplate));
        toolsCombatItems.add(new Item(R.drawable.diamond_leggings));
        toolsCombatItems.add(new Item(R.drawable.diamond_boots));

    // Materials/Misc
        materialsMiscItems.add(new Item(R.drawable.coal));
        materialsMiscItems.add(new Item(R.drawable.stick));
        materialsMiscItems.add(new Item(R.drawable.leather));
        materialsMiscItems.add(new Item(R.drawable.iron));
        materialsMiscItems.add(new Item(R.drawable.gold));
        materialsMiscItems.add(new Item(R.drawable.diamond));

        buildingDecorAdapter = new ItemAdapter(this, buildingDecorItems);
        redstoneTransportAdapter = new ItemAdapter(this, redstoneTransportItems);
        foodBrewingAdapter = new ItemAdapter(this, foodBrewingItems);
        toolsCombatAdapter = new ItemAdapter(this, toolsCombatItems);
        materialMiscAdapter =  new ItemAdapter(this, materialsMiscItems);

        // Button listeners:

        final ListView list = (ListView)findViewById(R.id.listViewForCategory);
        list.setAdapter(buildingDecorAdapter); // default for now, later default will be blank
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
        ImageView topLeft = (ImageView)findViewById(R.id.top_left);
        topLeft.setOnDragListener(new MyDragEventListener());

        ImageView topCenter = (ImageView)findViewById(R.id.top_center);
        topCenter.setOnDragListener(new MyDragEventListener());

        ImageView topRight = (ImageView)findViewById(R.id.top_right);
        topRight.setOnDragListener(new MyDragEventListener());

        ImageView left = (ImageView)findViewById(R.id.left);
        left.setOnDragListener(new MyDragEventListener());

        ImageView center = (ImageView)findViewById(R.id.center);
        center.setOnDragListener(new MyDragEventListener());

        ImageView right = (ImageView)findViewById(R.id.right);
        right.setOnDragListener(new MyDragEventListener());

        ImageView bottomLeft = (ImageView)findViewById(R.id.bottom_left);
        bottomLeft.setOnDragListener(new MyDragEventListener());

        ImageView bottomCenter = (ImageView)findViewById(R.id.bottom_center);
        bottomCenter.setOnDragListener(new MyDragEventListener());

        ImageView bottomRight = (ImageView)findViewById(R.id.bottom_right);
        bottomRight.setOnDragListener(new MyDragEventListener());
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
