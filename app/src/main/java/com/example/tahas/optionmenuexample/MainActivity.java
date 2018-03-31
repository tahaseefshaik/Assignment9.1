package com.example.tahas.optionmenuexample;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Context;

import java.util.zip.Inflater;



public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=(TextView)findViewById(R.id.Textid);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.option_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId()) {

            case R.id.red_id:
                textView.setTextColor(Color.RED);
                Toast.makeText(getApplicationContext(), "Red Selected", Toast.LENGTH_LONG).show();
                return true;
            case R.id.green_id:
                textView.setTextColor(Color.GREEN);
                Toast.makeText(getApplicationContext(), "Green Selected", Toast.LENGTH_LONG).show();
                return true;
            case R.id.blue_id:
                textView.setTextColor(Color.BLUE);
                Toast.makeText(getApplicationContext(), "Blue Selected", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
