package com.minoon.disco.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.minoon.disco.Logger;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class TopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_top);
        ButterKnife.bind(this);
        Logger.setLoggable(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_top, menu);
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

    @OnClick(R.id.a_top_btn_simple)
    public void onClickSimple(View view) {
        SimpleActivity.startActivity(this);
    }

    @OnClick(R.id.a_top_btn_collapsing_header)
    public void onCliclCollapsingHeader(View view) {
        CollapsingHeaderSampleActivity.startActivity(this);
    }
}
