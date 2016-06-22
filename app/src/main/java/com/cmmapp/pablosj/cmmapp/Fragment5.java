package com.cmmapp.pablosj.cmmapp;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Fragment5 extends Fragment {

    TextView deslizar , f5_txt1, f5_txt2;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub

        View v = inflater.inflate(R.layout.activity_fragment5,container,false);
        Typeface font = Typeface.createFromAsset(getActivity().getAssets(),"Equal-Regular.otf");
        deslizar = (TextView) v.findViewById(R.id.deslizar);
        f5_txt1 = (TextView) v.findViewById(R.id.f5_txt1);
        f5_txt2 = (TextView) v.findViewById(R.id.f5_txt2);

        deslizar.setTypeface(font);
        f5_txt1.setTypeface(font);
        f5_txt2.setTypeface(font);
        return v;
    }
}