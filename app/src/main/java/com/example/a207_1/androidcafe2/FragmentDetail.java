package com.example.a207_1.androidcafe2;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.jetbrains.annotations.Nullable;


/**
 * Created by 207-1 on 19/01/2018.
 */

public class FragmentDetail extends Fragment {
    private TextView dtvName,dtvDescription;
    private ImageView imgItem;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_detail,null);
        imgItem = (ImageView) view.findViewById(R.id.img_Item);
        dtvName = (TextView) view.findViewById(R.id.tvName);
        dtvDescription = (TextView) view.findViewById(R.id.tvDescription);
        return view;
    }

    public void displayData(Menu menu){
        String imageUrl = "http://560057.youcanlearnit.net/services/images/"+menu.getImage();
        // Log.d("CHECK IMG Path", imageUrl);

        Glide.with(this).load(imageUrl).into(imgItem);
        dtvName.setText(menu.getItemName());
        dtvDescription.setText(menu.getDescription());
    }
}
