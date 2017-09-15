package com.example.xyzreader.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by aniru on 9/15/2017.
 */

public class ThreeTwoImageView extends android.support.v7.widget.AppCompatImageView {

    public ThreeTwoImageView(Context context){
        super(context);
    }

    public ThreeTwoImageView(Context context, AttributeSet attributeSet){
        super(context, attributeSet);
    }

    public ThreeTwoImageView(Context context, AttributeSet attributeSet, int defStyle){
        super(context, attributeSet, defStyle);
    }

    @Override
    protected void onMeasure(int widthSpec, int heightSpec){

        int twoThreeHeight = MeasureSpec.getSize(widthSpec) * 2/3;
        int twoThreeHeightSpec = MeasureSpec.makeMeasureSpec(twoThreeHeight,MeasureSpec.EXACTLY);
        super.onMeasure(widthSpec, twoThreeHeightSpec );

    }
}
