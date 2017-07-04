package com.giaquino.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.giaquino.sample.common.app.BaseActivity;
import com.giaquino.sample.ui.ButtonActivity;
import com.giaquino.sample.ui.LayoutActivity;

public class MainActivity extends BaseActivity {

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main_activity);
    Button buttons = (Button) findViewById(R.id.main_buttons);
    buttons.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        startActivity(new Intent(MainActivity.this, ButtonActivity.class));
      }
    });
    Button layouts = (Button) findViewById(R.id.main_layouts);
    layouts.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        startActivity(new Intent(MainActivity.this, LayoutActivity.class));
      }
    });
  }
}
