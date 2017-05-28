package com.radioyps.graphicdemovertices;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by yep on 27/05/17.
 */

public class GraphicsActivity extends Activity {

    // set to true to test Picture
    private static final boolean TEST_PICTURE = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void setContentView(View view) {
        if (TEST_PICTURE) {
            ViewGroup vg = new PictureLayout(this);
            vg.addView(view);
            view = vg;
        }

        super.setContentView(view);
    }

}
