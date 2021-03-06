package com.example.richa.myappportfolio;

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

    public void runSpotifyStreamer(View view) {
        Toast.makeText(this,"Spotify Streamer",Toast.LENGTH_SHORT).show();
    }

    public void runScoresApp(View view) {
        Toast.makeText(this,"Scores App",Toast.LENGTH_SHORT).show();
    }

    public void runLibraryApp(View view) {
        Toast.makeText(this,"Library App",Toast.LENGTH_SHORT).show();
    }
    public void runBuildItBigger(View view) {
        Toast.makeText(this,"Build It Bigger",Toast.LENGTH_SHORT).show();
    }
    public void runXyzReader(View view) {
        Toast.makeText(this,"XYZ Reader",Toast.LENGTH_SHORT).show();
    }
    public void runCapstone(View view) {
        Toast.makeText(this,"Capstone Project",Toast.LENGTH_SHORT).show();
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
