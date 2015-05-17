package minecraft_app.minecraftchecker;

import android.content.ClipData;
import android.content.ClipDescription;
import android.widget.ArrayAdapter;
import android.content.Context;
import java.util.ArrayList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.crafting_item, parent, false);
        final ImageView imageView = (ImageView) view.findViewById(R.id.itemImage);
        final String IMAGEVIEW_TAG = "icon bitmap";
        imageView.setImageResource(items.get(position).getImageRes());
        imageView.setTag(IMAGEVIEW_TAG);
        imageView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                String[] mimeType = {ClipDescription.MIMETYPE_TEXT_PLAIN};
                ClipData.Item item = new ClipData.Item(Integer.toString(items.get(position).getImageRes()));
                ClipData dragData = new ClipData("item_res", mimeType, item);
                View.DragShadowBuilder myShadow = new MyDragShadowBuilder(imageView);
                return v.startDrag(dragData, myShadow, null, 0);
            }
        });
        return view;
    }
}
