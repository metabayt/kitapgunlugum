package com.example.bim_yazilim.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatDrawableManager;
import android.widget.Button;

/**
 * Created by BIM-YAZILIM on 11.05.2017.
 */

@SuppressLint("AppCompatCustomView")
public class kart extends Button {
    boolean acikMi = false;
    int resimID;
    int arkaPlanID;

    public kart(Context context,int id) {
        super(context);
        arkaPlanID = R.drawable.back;
        int onPlanID=0;
        Drawable arkaYuz = AppCompatDrawableManager.get().getDrawable(context, arkaPlanID);
        Drawable onYuz = AppCompatDrawableManager.get().getDrawable(context,onPlanID);
        setBackground(arkaYuz);

    }
}
