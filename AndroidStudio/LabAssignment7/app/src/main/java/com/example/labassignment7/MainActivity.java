package com.example.labassignment7;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void allProducts(View view) {
        Intent intent = new Intent(this, Display.class);
        intent.putExtra("query", "select categoryName, ProductName, UnitPrice from " +
                "products,categories where categories.categoryID=Products.categoryID ORDER BY categoryName;");
        startActivity(intent);
        //finish();
    }

    public void categories(View view) {
        Intent intent = new Intent(this, Display.class);
        intent.putExtra("query", "select categoryName, count(ProductID) from " +
                "products,categories where categories.categoryID=Products.categoryID GROUP BY categoryName;");
        startActivity(intent);
        finish();
    }
}