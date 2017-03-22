package com.giaquino.sample.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.giaquino.sample.R;
import com.giaquino.sample.common.app.BaseActivity;


/**
 * @author Gian Darren Aquino
 */
public class ButtonActivity extends BaseActivity {

    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_activity);
    }
}
