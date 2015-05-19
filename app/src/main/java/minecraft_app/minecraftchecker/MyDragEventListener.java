package minecraft_app.minecraftchecker;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipDescription;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.widget.ImageView;

import la_hacks.minecraftchecker.R;

/**
 * Created by Marion on 5/11/15.
 */
public class MyDragEventListener implements View.OnDragListener {
    private ImageView imageView;
    private Activity activity;
    public MyDragEventListener(Activity activity) {
        this.activity = activity;
    }
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
                ClipData.Item clipItem = event.getClipData().getItemAt(0);

                Log.i("TEST", clipItem.getText() + " test");

                // References to all the table imageViews just in case they are needed to be changed
                // due to receipt found or result having a receipt
                ImageView topLeftView = (ImageView)activity.findViewById(R.id.top_left);
                ImageView topCenterView = (ImageView)activity.findViewById(R.id.top_center);
                ImageView topRightView = (ImageView)activity.findViewById(R.id.top_right);
                ImageView leftView = (ImageView)activity.findViewById(R.id.left);
                ImageView centerView = (ImageView)activity.findViewById(R.id.center);
                ImageView rightView = (ImageView)activity.findViewById(R.id.right);
                ImageView bottomLeftView = (ImageView)activity.findViewById(R.id.bottom_left);
                ImageView bottomCenterView = (ImageView)activity.findViewById(R.id.bottom_center);
                ImageView bottomRightView = (ImageView)activity.findViewById(R.id.bottom_right);
                ImageView resultView = (ImageView)activity.findViewById(R.id.result);

//                View view = (View)event.getLocalState();
//                ImageView temp = (ImageView)view;

                // Gets the text data from the item.
                //Drawable dragData = item.getDrawable();

                // Displays a message containing the dragged data.
               // Toast.makeText(this, "Dragged data is " + dragData, Toast.LENGTH_LONG);

                // Turns off any color tints
                //ItemMap.idResMap.get("stone");

                v.setBackgroundColor(Color.WHITE);
                int itemRes = Integer.parseInt(clipItem.getText().toString());
                ((ImageView)v).setImageResource(itemRes); // this line might not be necessary****
                //imageView.clearColorFilter();

                // Invalidates the view to force a redraw
                v.invalidate();
                //v.(temp.getDrawable().getConstantState().newDrawable());

                // Updating Table object with new item
                int currentViewId = v.getId();
                Item item = ItemMap.idResMap.get(itemRes).getCopy();
                if(currentViewId == R.id.top_left) {
                    CraftingTable.table.setTopLeft(item);
                }
                else if(currentViewId == R.id.top_center) {
                    CraftingTable.table.setTopCenter(item);
                }
                else if(currentViewId == R.id.top_right) {
                    CraftingTable.table.setTopRight(item);
                }
                else if(currentViewId == R.id.left) {
                    CraftingTable.table.setLeft(item);
                }
                else if(currentViewId == R.id.center) {
                    CraftingTable.table.setCenter(item);
                }
                else if(currentViewId == R.id.right) {
                    CraftingTable.table.setRight(item);
                }
                else if(currentViewId == R.id.bottom_left) {
                    CraftingTable.table.setBottomLeft(item);
                }
                else if(currentViewId == R.id.bottom_center) {
                    CraftingTable.table.setBottomCenter(item);
                }
                else if(currentViewId == R.id.bottom_right) {
                    CraftingTable.table.setBottomRight(item);
                }
                else if(currentViewId == R.id.result) {
                    CraftingTable.table.setResult(item);
                    Log.i("TEST", "result set to: " + item.getName());
                }


                // Please fix this whole section, doesn't behave as intended. Need to fix methods in Table class
                // and then update this part. It works well enough for now, but needs to be fine-tuned.

                // Check receipts here and update views accordingly
                //boolean resultExists = CraftingTable.table.isTableReceipt();
                Item[] receiptHolder = null;
                // Receipt exists and the last item dragged was into the result box, update accordingly
                if(CraftingTable.table.isTableReceipt() && currentViewId != R.id.result) {
                    // Set on screen table and result to match receipt
                    receiptHolder = CraftingTable.table.getMatchingReceipt();
                    topLeftView.setImageResource(receiptHolder[0].getImageRes());
                    topCenterView.setImageResource(receiptHolder[1].getImageRes());
                    topRightView.setImageResource(receiptHolder[2].getImageRes());
                    leftView.setImageResource(receiptHolder[3].getImageRes());
                    centerView.setImageResource(receiptHolder[4].getImageRes());
                    rightView.setImageResource(receiptHolder[5].getImageRes());
                    bottomLeftView.setImageResource(receiptHolder[6].getImageRes());
                    bottomCenterView.setImageResource(receiptHolder[7].getImageRes());
                    bottomRightView.setImageResource(receiptHolder[8].getImageRes());
                    resultView.setImageResource(receiptHolder[9].getImageRes());

                    // Set table object to match what is shown on-screen
                    CraftingTable.table.setTopLeft(receiptHolder[0].getCopy());
                    CraftingTable.table.setTopCenter(receiptHolder[1].getCopy());
                    CraftingTable.table.setTopRight(receiptHolder[2].getCopy());
                    CraftingTable.table.setLeft(receiptHolder[3].getCopy());
                    CraftingTable.table.setCenter(receiptHolder[4].getCopy());
                    CraftingTable.table.setRight(receiptHolder[5].getCopy());
                    CraftingTable.table.setBottomLeft(receiptHolder[6].getCopy());
                    CraftingTable.table.setBottomCenter(receiptHolder[7].getCopy());
                    CraftingTable.table.setBottomRight(receiptHolder[8].getCopy());
                    CraftingTable.table.setResult(receiptHolder[9].getCopy());
                }
                else if(CraftingTable.table.resultHasReceipt() && currentViewId == R.id.result) {
                // Set on screen table and result to match receipt
                receiptHolder = CraftingTable.table.getMatchingReceipt();
                topLeftView.setImageResource(receiptHolder[0].getImageRes());
                topCenterView.setImageResource(receiptHolder[1].getImageRes());
                topRightView.setImageResource(receiptHolder[2].getImageRes());
                leftView.setImageResource(receiptHolder[3].getImageRes());
                centerView.setImageResource(receiptHolder[4].getImageRes());
                rightView.setImageResource(receiptHolder[5].getImageRes());
                bottomLeftView.setImageResource(receiptHolder[6].getImageRes());
                bottomCenterView.setImageResource(receiptHolder[7].getImageRes());
                bottomRightView.setImageResource(receiptHolder[8].getImageRes());
                resultView.setImageResource(receiptHolder[9].getImageRes());

                // Set table object to match what is shown on-screen
                CraftingTable.table.setTopLeft(receiptHolder[0].getCopy());
                CraftingTable.table.setTopCenter(receiptHolder[1].getCopy());
                CraftingTable.table.setTopRight(receiptHolder[2].getCopy());
                CraftingTable.table.setLeft(receiptHolder[3].getCopy());
                CraftingTable.table.setCenter(receiptHolder[4].getCopy());
                CraftingTable.table.setRight(receiptHolder[5].getCopy());
                CraftingTable.table.setBottomLeft(receiptHolder[6].getCopy());
                CraftingTable.table.setBottomCenter(receiptHolder[7].getCopy());
                CraftingTable.table.setBottomRight(receiptHolder[8].getCopy());
                CraftingTable.table.setResult(receiptHolder[9].getCopy());
                }
                // If User dragged an item without a receipt to the result box, clear table
                else if(!CraftingTable.table.resultHasReceipt() && currentViewId == R.id.result) {
                    topLeftView.setImageResource(0);
                    topCenterView.setImageResource(0);
                    topRightView.setImageResource(0);
                    leftView.setImageResource(0);
                    centerView.setImageResource(0);
                    rightView.setImageResource(0);
                    bottomLeftView.setImageResource(0);
                    bottomCenterView.setImageResource(0);
                    bottomRightView.setImageResource(0);
                    resultView.setImageResource(itemRes);

                    CraftingTable.table.setTopLeft(new Item(0, "blank"));
                    CraftingTable.table.setTopCenter(new Item(0, "blank"));
                    CraftingTable.table.setTopRight(new Item(0, "blank"));
                    CraftingTable.table.setLeft(new Item(0, "blank"));
                    CraftingTable.table.setCenter(new Item(0, "blank"));
                    CraftingTable.table.setRight(new Item(0, "blank"));
                    CraftingTable.table.setBottomLeft(new Item(0, "blank"));
                    CraftingTable.table.setBottomCenter(new Item(0, "blank"));
                    CraftingTable.table.setBottomRight(new Item(0, "blank"));
                }
                // User dragged an item onto the table and there is no receipt, make result blank
                else {
                    resultView.setImageResource(0);
                    CraftingTable.table.setResult(new Item(0, "blank"));
                }

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
