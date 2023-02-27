package com.snackbars;

import android.content.Context;
import android.widget.Toast;

public class CustomSnackBars {
    public static void showCustomToast(Context context){
        Toast.makeText(context, "My testing amazing toast ", Toast.LENGTH_LONG).show();
    }
}
