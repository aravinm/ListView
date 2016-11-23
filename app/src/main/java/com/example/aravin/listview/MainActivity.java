package com.example.aravin.listview;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import static android.widget.ArrayAdapter.createFromResource;

public class MainActivity extends AppCompatActivity {

    ListView l;
    ArrayAdapter<CharSequence> arr;
    boolean y = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        l = (ListView) findViewById(R.id.list);
        arr = createFromResource(this, R.array.food, android.R.layout.simple_spinner_dropdown_item);
        l.setAdapter(arr);


        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long la) {
//                if(y != true)
                    Toast.makeText(getApplicationContext(),l.getItemAtPosition(i).toString(),Toast.LENGTH_SHORT).show();

//                y = false;
            }
        });
    }


}
