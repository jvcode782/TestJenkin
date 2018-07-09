package com.barquecontech.appfont;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;


public class CustomTextView extends TextView {

    Context context;

    public CustomTextView (Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.context = context;
    }

    public CustomTextView (Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;

    }

    public CustomTextView (Context context) {
        super(context);
        this.context = context;
    }

    public void setTypeface() {
        super.setTypeface(Typeface.createFromAsset(getContext().getAssets(), "OpenSans-Semibold.ttf"));
//
//        if (style == 1) {
//            super.setTypeface(Typeface.createFromAsset(getContext().getAssets(), "OpenSans-Semibold.ttf"));
//        } else if (style == 2) {
//            super.setTypeface(Typeface.createFromAsset(getContext().getAssets(), "OpenSans-Semibold.ttf"));
//        } else if (style == 3) {
//            super.setTypeface(Typeface.createFromAsset(getContext().getAssets(), "OpenSans-Semibold.ttf"));
//        }
    }

}