package com.example.st.pmitvstar;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
    ListView list;
    String[] web = {
            "Android Alpha",
            "Android Beta",
            "Android Cupcake",
            "Android Donut",
            "Android Eclair",
            "Android Froyo",
            "Android Gingerbread",
            "Android Honeycomb",
            "Android Ice Cream Sandwich",
            "Android Jelly Bean",
            "Android Ktikat",
            "Android Lollipop",
            "Android Marshmallow",
            "Android Nougat",
            "Android Oreo"
    } ;
    Integer[] imageId = {
            R.drawable.alpha,
            R.drawable.beta,
            R.drawable.cupcake,
            R.drawable.donut,
            R.drawable.eclair,
            R.drawable.froyo,
            R.drawable.gingerbread,
            R.drawable.honeycomb,
            R.drawable.ics,
            R.drawable.jellybean,
            R.drawable.kitkat,
            R.drawable.lollipop,
            R.drawable.marshmallow,
            R.drawable.nougat,
            R.drawable.oreo

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomList adapter = new
                CustomList(MainActivity.this, web, imageId);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(MainActivity.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

            }
        });

    }

}
