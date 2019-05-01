package com.example.labassignment7;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;
import java.util.ArrayList;

import static com.example.labassignment7.R.layout.activity_display;


public class Display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_display);
        Intent intent = getIntent();
        String q = intent.getStringExtra("query");
        // query the DB and store the results on an ArrayList
        ArrayList<String> values = queryDB(q);
        // Lookup the recyclerview in activity layout
        RecyclerView rvProducts = findViewById(R.id.productsList);
        // Set layout manager to position the items
        rvProducts.setLayoutManager(new LinearLayoutManager(this));
        // Create adapter passing in the products list
        ProductsAdapter adapter = new ProductsAdapter(values);
        rvProducts.setAdapter(adapter);
    }
    ArrayList<String> queryDB (String query) {
        ArrayList<String> list = new ArrayList<>();
        try {
            SQLiteDatabase db = openOrCreateDatabase ("foodProducts.db", Context.MODE_PRIVATE, null);
            Cursor cursor = db.rawQuery(query, null);
            while (cursor.moveToNext()) {
                StringBuilder data = new StringBuilder();
                for (int i = 0; i < cursor.getColumnCount(); i++) {
                    if (i > 0) data.append(":");
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
