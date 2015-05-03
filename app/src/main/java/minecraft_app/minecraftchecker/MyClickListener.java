package minecraft_app.minecraftchecker;

import android.view.View;

/**
 * Created by Marion on 5/2/15.
 */
public class MyClickListener implements View.OnLongClickListener {

    public boolean onLongClick(View view) {
        View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);
        //view.startDrag()
        return false;
    }
}
