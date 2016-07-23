package soy.jperez.android.tipcalc;

import android.app.Application;

/**
 * Created by Jonatan on 12/07/2016.
 */
public class TipCalcApp extends Application {
 private  final static  String ABOUT_URL = "https://jperez.soy";

    public  String getAboutUrl() {
        return ABOUT_URL;
    }
}
