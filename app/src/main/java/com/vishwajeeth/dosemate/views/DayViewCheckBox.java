package com.vishwajeeth.dosemate.views;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.content.ContextCompat;

import com.vishwajeeth.dosemate.R;

/**
 * Created by vishwajeeth on 13/07/17.
 */

public class DayViewCheckBox extends AppCompatCheckBox {

    private final Context context;

    public DayViewCheckBox(Context context) {
        super(context);
        this.context = context;
    }

    public DayViewCheckBox(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
    }

    @Override
    public void setChecked(boolean t){
        if(t) {
            this.setTextColor(Color.WHITE);
        } else {
            this.setTextColor(ContextCompat.getColor(getContext(), R.color.colorPrimary));
        }
        super.setChecked(t);
    }
}
