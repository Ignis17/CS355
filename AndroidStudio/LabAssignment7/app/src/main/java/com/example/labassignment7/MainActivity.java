package com.example.labassignment7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.Arrays;

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
        //finish();
    }

    public void players(View view) {
        Intent intent = new Intent(this, Display.class);
        intent.putExtra("query", "SELECT Player_Name FROM Players, Teams WHERE " +
                "Players.Team_ID = 1 AND Teams.Team_ID = 1;");
        startActivity(intent);
        //finish();
    }

    public void teams(View view) {
        Intent intent = new Intent(this, Display.class);
        intent.putExtra("query", "SELECT Player_Name, Age FROM Players,Teams WHERE " +
                "(Players.Team_ID =  Teams.Team_ID) AND (Players.Age >= 30);");
        startActivity(intent);
        //finish();
    }

    public void extra(View view) {
        Intent intent = new Intent(this, Display.class);
        intent.putExtra("query", "SELECT * FROM Teams");
        startActivity(intent);
        finish();
    }
}

