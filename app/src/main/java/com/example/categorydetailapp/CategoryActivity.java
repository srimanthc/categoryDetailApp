package com.example.categorydetailapp;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class CategoryActivity extends AppCompatActivity {
    public static final String DETAIL_CHOICE = "chosen Detailed object-Food in this case";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        Intent intent = getIntent();

        ArrayList<Food> dataToDisplay = intent.getParcelableArrayListExtra(MainActivity.ARRAYLIST_VALUES);

        FoodAdapter foodAdapter = new FoodAdapter(this, dataToDisplay);
        ListView listView = (ListView) findViewById(R.id.categoryOptions);
        listView.setAdapter(foodAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(CategoryActivity.this, DetailActivity.class);
                intent.putExtra(DETAIL_CHOICE, dataToDisplay.get(position));
                startActivity(intent);
            }
        });
    }
}
