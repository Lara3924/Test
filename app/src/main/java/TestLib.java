package com.test.lib;

import android.content.Context;
import android.widget.Toast;

public class TestLib {
    
    private Context context;
    
    public TestLib(Context context) {
        this.context = context;
    }
    
    public void showToast() {
        Toast.makeText(context, "Test Lib", Toast.LENGTH_SHORT).show();
    }
}
