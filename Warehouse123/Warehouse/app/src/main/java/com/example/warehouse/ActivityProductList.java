package com.example.warehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ActivityProductList extends AppCompatActivity {

    int[] IMAGES={R.drawable.lekarz};
    String exp;
    String[] NAMES = {"exp"};
    String[] DESCRIPTIONS = {"exp"};


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);

        ListView listView = (ListView) findViewById(R.id.listView);
        CustomAdapter customAdapter=new CustomAdapter();
        listView.setAdapter(customAdapter);


    }

    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {


            convertView = getLayoutInflater().inflate(R.layout.customlayout,null);

            ImageView imageView=(ImageView)convertView.findViewById(R.id.imageView);
            TextView textView_name=(TextView)convertView.findViewById(R.id.textView_name);
            TextView textView_desc=(TextView)convertView.findViewById(R.id.textView_desc);
            imageView.setImageResource(IMAGES[position]);
            textView_name.setText(NAMES[position]);
            textView_desc.setText(DESCRIPTIONS[position]);

            return convertView;
        }
    }









}



