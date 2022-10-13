package com.example.categorydetailapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class FoodAdapter extends ArrayAdapter<Food>{
    public FoodAdapter(Context context, ArrayList<Food> musicList){
        super(context, 0 ,musicList);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Food myFood = getItem(position);
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()) .inflate(R.layout.food_row_layout, parent, false);
        }
        TextView tvFoodName = (TextView) convertView.findViewById(R.id.foodName);
        TextView tvFoodPrice = (TextView) convertView.findViewById(R.id.foodPrice);
        TextView tvFoodDesc = (TextView) convertView.findViewById(R.id.foodDesc);

        tvFoodName.setText(myFood.getName());
        tvFoodPrice.setText("$"+ myFood.getPrice());
        tvFoodDesc.setText(myFood.getDesc());

        return convertView;
    }

}
