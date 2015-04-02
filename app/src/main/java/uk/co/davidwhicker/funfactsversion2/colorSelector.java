package uk.co.davidwhicker.funfactsversion2;

import android.graphics.Color;
import android.util.Log;

import java.util.Random;

/**
 * Created by DavidWhicker on 30/03/15.
 */
public class colorSelector {


    public String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };


    public int getColor(){


        String color = mColors[new Random().nextInt(mColors.length)];
        int colorInt = Color.parseColor(color);

        return colorInt;
    }
}
