package com.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final List<Bean>list=new ArrayList<>();
        for (int i = 0; i <20 ; i++) {
            list.add(new Bean(i+"",i+""));
        }
        ListView lv=findViewById(R.id.lv);
        Button btn=findViewById(R.id.btn);
        final Adapter adapter = new Adapter(this, list);
        lv.setAdapter(adapter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Util.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        list.add(new Bean("测测","试试"));
                        adapter.notifyDataSetChanged();
                    }
                });
            }
        });

    }
}
