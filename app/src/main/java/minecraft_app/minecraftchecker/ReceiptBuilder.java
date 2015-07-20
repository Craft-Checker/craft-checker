package minecraft_app.minecraftchecker;

import java.util.ArrayList;

import la_hacks.minecraftchecker.R;

/**
 * Created by Marion on 5/18/15.
 *
 * This class is specifically for all of the crafting receipts.
 * It builds the data to be used in the Table class
 */
public class ReceiptBuilder {
    private ArrayList<Item[]> receipts = new ArrayList<>(); // Master list of receipts
    private BuildingDecor buildingDecor;
    private RedstoneMechanism redstoneMechanism;
    private FoodBrewing foodBrewing;
    private ToolsCombat toolsCombat;
    private MaterialsMisc materialsMisc;

    ArrayList<Item[]> buildingDecorReceipts;
    ArrayList<Item[]> redstoneMechanismReceipts;
    ArrayList<Item[]> foodBrewingReceipts;
    ArrayList<Item[]> toolsCombatReceipts;
    ArrayList<Item[]> materialsMiscReceipts;

    public ReceiptBuilder() {
        // For each category of receipts, a class is initialized and builds an ArrayList of receipts for that
        // category. These lists are then iterated through and added to this receipt builder as the master
        // list of receipts. It's basically the database.
        // When adding an item, the "default" receipt for an item is the first receipt added for that item
        // The default receipt is used when the receipt for an item is to be generated on the table
        //
        // Note: After realizing how many receipts there are and how complicated they are, it would be a
        // very good idea to use an actual database to prevent these huge lists of code for creating the
        // receipts. It would then be easier to take advantage of patterns in some receipts.

        buildingDecor = new BuildingDecor();
        redstoneMechanism = new RedstoneMechanism();
        foodBrewing = new FoodBrewing();
        toolsCombat = new ToolsCombat();
        materialsMisc = new MaterialsMisc();

        buildingDecorReceipts = buildingDecor.getBuildingDecorReceipts();
        redstoneMechanismReceipts = redstoneMechanism.getRedstoneMechanismReceipts();
        foodBrewingReceipts = foodBrewing.getFoodBrewingReceipts();
        toolsCombatReceipts = toolsCombat.getToolsCombatReceipts();
        materialsMiscReceipts = materialsMisc.getMaterialsMiscReceipts();

        for(int i = 0; i < buildingDecorReceipts.size(); i++) {
            receipts.add(buildingDecorReceipts.get(i));
        }
        for(int i = 0; i < redstoneMechanismReceipts.size(); i++) {
            receipts.add(redstoneMechanismReceipts.get(i));
        }
        for(int i = 0; i < foodBrewingReceipts.size(); i++) {
            receipts.add(foodBrewingReceipts.get(i));
        }
        for(int i = 0; i < toolsCombatReceipts.size(); i++) {
            receipts.add(toolsCombatReceipts.get(i));
        }
        for(int i = 0; i < materialsMiscReceipts.size(); i++) {
            receipts.add(materialsMiscReceipts.get(i));
        }

    }
    public ArrayList<Item[]> getReceipts() {
        return this.receipts;
    }
}
