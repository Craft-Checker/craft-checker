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
    private BuildLists lists;
    public static Table table = new Table();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crafting_table);

    // Populating lists that will appear when buttons are clicked
    // Note: Population is now done in BuildLists class and the
    // results are returned here

        lists = new BuildLists();
        buildingDecorItems = lists.getBuildingDecorItems();
        redstoneMechanismItems = lists.getRedstoneMechanismItems();
        foodBrewingItems = lists.getFoodBrewingItems();
        toolsCombatItems = lists.getToolsCombatItems();
        materialsMiscItems = lists.getMaterialsMiscItems();

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
