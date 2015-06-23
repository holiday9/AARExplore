package com.seven.aarexplore;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.seven.aartest.AARTestActivity;
import com.seven.aartest.Cal;

import org.w3c.dom.Text;


public class MainActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        TextView testCalReferneceView = (TextView) findViewById(R.id.test_add);
        Cal cal = new Cal();
        testCalReferneceView.setText("1 + 2 = " + cal.add(1,2));
    }

    @Override
    public void onClick(View v) {
         Intent intent = new Intent(this, AARTestActivity.class);
        startActivity(intent);
    }
}
