package com.example.dolphinmpos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SaleActivity extends AppCompatActivity {

    TextView viewCart;
    ArrayList<String> listItems=new ArrayList<String>();

     ArrayAdapter<String> adapter;
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
    String[] listviewQty = new String[]{
            "10", "10", "10", "10",
            "10", "10", "10", "10",
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getSupportActionBar().hide();
        setContentView(R.layout.activity_sale);
        viewCart=findViewById(R.id.viewcartTextView);

        List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();

        for (int i = 0; i < 8; i++) {
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("listview_items", listviewItems[i]);
            hm.put("listview_price", listviewPrice[i]);
            hm.put("listview_qty", listviewQty[i]);
            hm.put("listview_image", Integer.toString(listviewImage[i]));
            aList.add(hm);
        }

        String[] from = {"listview_image", "listview_items", "listview_price","listview_qty"};
        int[] to = {R.id.listview_image, R.id.listview_item, R.id.listview_price,R.id.listview_Qty};

        SimpleAdapter simpleAdapter = new SimpleAdapter(getBaseContext(), aList, R.layout.product_list, from, to);
        ListView androidListView = (ListView) findViewById(R.id.productList);
        androidListView.setAdapter(simpleAdapter);

viewCart.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent=new Intent(v.getContext(),CheckoutActivity.class);
        startActivity(intent);
    }
});

    }

}