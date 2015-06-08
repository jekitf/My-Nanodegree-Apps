package com.example.myappportfolio.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    /** Called when the user touches the button */
    public void sendMessage(View view) {
        // Do something in response to button click

        Context context = getApplicationContext();
        String text = "This button will launch my ";
        int id=view.getId();

        if (id==findViewById(R.id.spotify_streamer).getId()) {
            text += "spotify streamer";
        }
        else if (id==findViewById(R.id.scores_app).getId()) {
            text += "scores app";
        }
        else if (id==findViewById(R.id.library_app).getId()) {
            text += "library app";
        }
        else if (id==findViewById(R.id.build_it_bigger).getId()) {
            text += "build it bigger";
        }
        else if (id==findViewById(R.id.xyz_reader).getId()) {
            text += "xyz reader";
        }
        else if (id==findViewById(R.id.capstone_my_own_app).getId()) {
            text += "capstone my own app";
        }

        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
