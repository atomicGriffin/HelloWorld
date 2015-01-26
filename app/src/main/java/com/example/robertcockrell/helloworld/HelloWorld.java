package com.example.robertcockrell.helloworld;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class HelloWorld extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
        final Button button = (Button) findViewById(R.id.button);
        final TextView Hello = (TextView) findViewById(R.id.Hello);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View Button) {
                Hello.setText("Hey there Rick!");
            }

        });
    }

        @Override
        public boolean onCreateOptionsMenu (Menu menu){
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_hello_world, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected (MenuItem item){
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

    public void ChangeColor(View Button){
        RelativeLayout Color = (RelativeLayout) findViewById(R.id.bg);
        Color.setBackgroundColor(0xBADA55);

    }

    }