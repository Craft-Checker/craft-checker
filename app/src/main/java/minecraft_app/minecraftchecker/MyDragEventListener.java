package minecraft_app.minecraftchecker;

import android.content.ClipData;
import android.content.ClipDescription;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Marion on 5/11/15.
 */
public class MyDragEventListener implements View.OnDragListener {
    private ImageView imageView;

    public boolean onDrag(View v, DragEvent event) {
        final int action = event.getAction();
        switch(action) {
            case DragEvent.ACTION_DRAG_STARTED:
                if (event.getClipDescription().hasMimeType(ClipDescription.MIMETYPE_TEXT_PLAIN)) {
                    v.setBackgroundColor(Color.BLUE);
                    // Invalidate the view to force a redraw in the new tint
                    v.invalidate();

                    // returns true to indicate that the View can accept the dragged data.
                    return true;

                }

                // Returns false. During the current drag and drop operation, this View will
                // not receive events again until ACTION_DRAG_ENDED is sent.
                return false;

            case DragEvent.ACTION_DRAG_ENTERED:

                // Applies a green tint to the View. Return true; the return value is ignored.

                v.setBackgroundColor(Color.GREEN);


                // Invalidate the view to force a redraw in the new tint
                v.invalidate();

                return true;

            case DragEvent.ACTION_DRAG_LOCATION:

                // Ignore the event
                return true;

            case DragEvent.ACTION_DRAG_EXITED:

                // Re-sets the color tint to blue. Returns true; the return value is ignored.
                v.setBackgroundColor(Color.BLUE);

                // Invalidate the view to force a redraw in the new tint
                v.invalidate();

                return true;

            case DragEvent.ACTION_DROP:

                // Gets the item containing the dragged data
                ClipData.Item item = event.getClipData().getItemAt(0);

                Log.i("TEST", item.getText() + " test");

//                View view = (View)event.getLocalState();
//                ImageView temp = (ImageView)view;

                // Gets the text data from the item.
                //Drawable dragData = item.getDrawable();

                // Displays a message containing the dragged data.
               // Toast.makeText(this, "Dragged data is " + dragData, Toast.LENGTH_LONG);

                // Turns off any color tints
                //ItemMap.idResMap.get("stone");

                v.setBackgroundColor(Color.WHITE);
                ((ImageView)v).setImageResource(Integer.parseInt(item.getText().toString()));
                //imageView.clearColorFilter();

                // Invalidates the view to force a redraw
                v.invalidate();
                //v.(temp.getDrawable().getConstantState().newDrawable());

                // Returns true. DragEvent.getResult() will return true.
                return true;

            case DragEvent.ACTION_DRAG_ENDED:

                // Turns off any color tinting
                v.setBackgroundColor(Color.WHITE);

                // Invalidates the view to force a redraw
                v.invalidate();

                // Does a getResult(), and displays what happened.
               /* if (event.getResult()) {
                    Toast.makeText(this, "The drop was handled.", Toast.LENGTH_LONG);

                } else {
                    Toast.makeText(this, "The drop didn't work.", Toast.LENGTH_LONG);

                }*/

                // returns true; the value is ignored.
                return true;

            // An unknown action type was received.
            default:
                Log.e("DragDrop Example", "Unknown action type received by OnDragListener.");
                break;
        }

        return false;
        }
}