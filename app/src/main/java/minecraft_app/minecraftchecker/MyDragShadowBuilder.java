package minecraft_app.minecraftchecker;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;

/**
 * Created by Marion on 5/2/15.
 */
public class MyDragShadowBuilder extends View.DragShadowBuilder {
    private static Drawable shadow;

    public MyDragShadowBuilder(View v) {
        super(v);
        shadow = new ColorDrawable(Color.LTGRAY);
    }
    public void onProvideShadowMetrics(Point size, Point touch) {
        int width, height;
        // sets shadow width and height to half of the original view
        width = getView().getWidth() / 2;
        height = getView().getHeight() / 2;
        shadow.setBounds(0, 0, width, height);
        size.set(width, height);
        // sets touch point's position to be in the middle of the drag shadow
        touch.set(width / 2, height / 2);
    }
    public void onDrawShadow(Canvas canvas) {
        shadow.draw(canvas);
    }
}
