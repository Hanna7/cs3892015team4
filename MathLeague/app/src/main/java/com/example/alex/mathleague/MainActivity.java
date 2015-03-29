package com.example.alex.mathleague;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView playB = (TextView) this.findViewById(R.id.playButton);
        TextView settingB = (TextView) this.findViewById(R.id.settingButton);
        TextView helpB = (TextView) this.findViewById(R.id.helpButton);

        playB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Show Game List", Toast.LENGTH_SHORT).show();
                Intent it = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(it);
            }
        });

        settingB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Show Setting List", Toast.LENGTH_SHORT).show();
                Intent it = new Intent(getApplicationContext(), ThirdActivity.class);
                startActivity(it);
            }
        });

        helpB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Show Help List", Toast.LENGTH_SHORT).show();
                Intent it = new Intent(getApplicationContext(), FourthActivity.class);
                startActivity(it);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
