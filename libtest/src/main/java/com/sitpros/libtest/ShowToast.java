package com.sitpros.libtest;

import android.app.Activity;
import android.widget.Toast;

public class ShowToast {

    public static void showToast(Activity activity){
        Toast.makeText(activity, "First Dependency", Toast.LENGTH_SHORT).show();
    }
}
