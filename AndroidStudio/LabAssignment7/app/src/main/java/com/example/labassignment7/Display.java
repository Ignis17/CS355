package com.example.labassignment7;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class Display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        // getProducts: you should query from database here instead of having a fixed list
        String products[] = {"spicy shrimp", "lemon tilapia", "grilled salmon", "cheese ravioli", "chicken teriyaki", "Tofu", "Chicken Soup", "Greek Salad", "Cesar Salad"};
        ArrayList<String> plist = new ArrayList<>(Arrays.asList(products));
        // Lookup the recyclerview in activity layout
        RecyclerView rvProducts = findViewById(R.id.productsList);
        // Set layout manager to position the items
        rvProducts.setLayoutManager(new LinearLayoutManager(this));

        // Create adapter passing in the products list
        ProductsAdapter adapter = new ProductsAdapter(plist);
        rvProducts.setAdapter(adapter);


        // retrieve argument sent from first activity
//        Intent intent = getIntent();
//        String q = intent.getStringExtra("query");
//        // query the DB and store the results on an ArrayList
//        ArrayList<String> values = queryDB(q);
//        // get ahold of listView component and display the results of the query there
//        ListView lv = findViewById(R.id.DisplayListView);
//        ArrayAdapter<String> adp = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, values);
//        lv.setAdapter(adp);



    }
    ArrayList<String> queryDB (String query) {
        ArrayList<String> list = new ArrayList<>();
        try {
            SQLiteDatabase db = openOrCreateDatabase ("H_W_6.sql", Context.MODE_PRIVATE, null);
            Cursor cursor = db.rawQuery(query, null);
            while (cursor.moveToNext()) {
                StringBuilder data = new StringBuilder();
                for (int i = 0; i < cursor.getColumnCount(); i++) {
                    if (i > 0) data.append(" || ");
                    String colvalue = cursor.getString(i);
                    data.append(colvalue);
                }
                list.add(data.toString());
            }
            cursor.close();
            db.close();
        } catch (Exception e) {
            Toast.makeText (getApplicationContext(), "Error opening/querying Database",
                    Toast.LENGTH_LONG).show();
        }
        return list;
    }

}
