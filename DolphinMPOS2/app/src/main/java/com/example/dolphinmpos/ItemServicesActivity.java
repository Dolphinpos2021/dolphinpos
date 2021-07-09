package com.example.dolphinmpos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ItemServicesActivity extends AppCompatActivity {

    ArrayAdapter<String> adapter;
    ListView viewCart;
    Button addItemBtn;

    String[] listviewItems = new String[]{
            "Item 1", "Item 2", "Item 3", "Item 4",
            "Item 5", "Item 6", "Item 7", "Item 8",
    };


    int[] listviewImage = new int[]{
            R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background,
    };

    String[] listviewPrice = new String[]{
            "$100", "$100", "$100", "$100",
            "$100", "$100", "$100", "$100",
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getSupportActionBar().hide();
        setContentView(R.layout.activity_item_services);
        addItemBtn=findViewById(R.id.addItemBtn);

        List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();

        for (int i = 0; i < 8; i++) {
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("listview_items", listviewItems[i]);
            hm.put("listview_price", listviewPrice[i]);
            hm.put("listview_image", Integer.toString(listviewImage[i]));
            aList.add(hm);
        }

        String[] from = {"listview_image", "listview_items", "listview_price"};
        int[] to = {R.id.listview_image, R.id.listview_item, R.id.listview_price};

        SimpleAdapter simpleAdapter = new SimpleAdapter(getBaseContext(), aList, R.layout.product_list, from, to);
        ListView androidListView = (ListView) findViewById(R.id.productList);
        androidListView.setAdapter(simpleAdapter);

        addItemBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),AddItemActivity.class);
                startActivity(intent);
            }
        });
    }
}