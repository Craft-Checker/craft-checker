package minecraft_app.minecraftchecker;

import android.widget.ArrayAdapter;
import android.content.Context;
import java.util.ArrayList;
import la_hacks.minecraftchecker.R;  // Need this because refactoring apparently didn't work

/**
 * Created by Marion on 4/26/15.
 */
public class ItemAdapter extends ArrayAdapter<Item> {

    private Context context;
    private ArrayList<Item> items;

    public ItemAdapter(Context context, ArrayList<Item> items) {
        super(context, R.layout.crafting_item, items);
        this.context = context;
        this.items = items;
    }
}
