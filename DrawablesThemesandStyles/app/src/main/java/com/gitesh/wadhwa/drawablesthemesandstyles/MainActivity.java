package com.gitesh.wadhwa.drawablesthemesandstyles;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doImage(View view) {
        Toast.makeText(this,"Image Button Clicked",Toast.LENGTH_SHORT).show();

    }
}
