package com.example.fdm.customviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    MenuItem menuItem;
    MenuItem menuItem1;
    MenuItem menuItem2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menuItem = getView(R.id.menu);
        menuItem1 = getView(R.id.menu1);
        menuItem2 = getView(R.id.menu2);
        menuItem.setOnClickListener(this);
        menuItem1.setOnClickListener(this);
        menuItem2.setOnClickListener(this);

        menuItem1.setMenuTextRight("0.00元");
        menuItem2.setMenuTextRight("古铜色会员");
    }

    public <T extends View> T getView(int id) {
        return (T) findViewById(id);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.menu:
                Toast.makeText(this, "蚂蚁花呗", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu1:
                Toast.makeText(this, "余额", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu2:
                Toast.makeText(this, "蚂蚁会员", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
