package com.example.glide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class MainActivity extends AppCompatActivity {

    private ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image=findViewById(R.id.image1);

        Glide.with(this).load(R.drawable.kidz).apply(RequestOptions.circleCropTransform()).into(image);

//        Glide.with(this)
//                .load("http://goo.gl/gEgYUd")
//                .placeholder(R.drawable.placeholder)
//                .override(500,500)
//                .centerCrop()
//                .apply(RequestOptions.circleCropTransform())
//                .into(image);


      //  Glide.with(this)
//                    .load(uri)
//                    .override(200, 200)
//                    .centerCrop()
//                    .into(image1);
//
//        Glide.with(this)
//                    .load(R.drawable.home)
//                    .placeholder(R.drawable.placeholder)
//                .apply(RequestOptions.circleCropTransform())
//                    .into(image);


    }
}
