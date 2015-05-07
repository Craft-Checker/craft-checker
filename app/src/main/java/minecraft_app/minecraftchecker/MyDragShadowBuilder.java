package minecraft_app.minecraftchecker;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;

import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import la_hacks.minecraftchecker.R;

/**
 * Created by Marion on 5/2/15.
 */
public class MyDragShadowBuilder extends View.DragShadowBuilder {
    private static Drawable shadow;

    private ImageView imageView;

    public MyDragShadowBuilder(View v) {
        super(v);
        imageView = (ImageView) v;
        //shadow = new ColorDrawable(Color.LTGRAY);

        //Drawable d = v.getContext().getResources().getDrawable(res);

        Drawable clone = imageView.getDrawable().getConstantState().newDrawable();
        shadow = clone;

//        ImageView image = (ImageView)findViewById(R.id.image);
//        image.setImageDrawable(d);
    }
    public void onProvideShadowMetrics(Point size, Point touch) {
        int width, height;
        // sets shadow width and height to size of the original view
        Log.i("TEST", "called");
        width = getView().getWidth();
        height = getView().getHeight();
        shadow.setBounds(0, 0, width, height);
        size.set(width, height);
        // sets touch point's position to be in the middle of the drag shadow
        touch.set(width / 2, height / 2);
    }

    public void onDrawShadow(Canvas canvas) {
        shadow.draw(canvas);
    }
}
