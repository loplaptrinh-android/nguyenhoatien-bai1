package com.nguyenhoatien.bai1;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    public class ColorListener implements View.OnClickListener {

        int color;
        TextView view;

        public ColorListener(int color, TextView view) {
            this.color = color;
            this.view = view;
        }

        public void onClick(View v) {
            view.setBackgroundColor(color);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        RadioButton radioButton =(RadioButton) findViewById(R.id.radioButton);
        RadioButton radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        RadioButton radioButton3 = (RadioButton) findViewById(R.id.radioButton3);
        final TextView txtColor = (TextView) findViewById(R.id.textView);
        button.setOnClickListener(new ColorListener(Color.RED,txtColor));
        button2.setOnClickListener(new ColorListener(Color.GREEN,txtColor));
        button3.setOnClickListener(new ColorListener(Color.YELLOW,txtColor));
        radioButton.setOnClickListener(new ColorListener(Color.RED,txtColor));
        radioButton2.setOnClickListener(new ColorListener(Color.GREEN,txtColor));
        radioButton3.setOnClickListener(new ColorListener(Color.YELLOW,txtColor));
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
