package com.cmmapp.pablosj.cmmapp;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Fragment1 extends Fragment {

	TextView deslizar , f1_txt1, f1_txt2, f1_txt3;
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		// TODO Auto-generated method stub

		View v = inflater.inflate(R.layout.fragement1_layout,container,false);
		Typeface font = Typeface.createFromAsset(getActivity().getAssets(),"Equal-Regular.otf");
		deslizar = (TextView) v.findViewById(R.id.deslizar);
		f1_txt1 = (TextView) v.findViewById(R.id.f1_txt1);
		f1_txt2 = (TextView) v.findViewById(R.id.f1_txt2);
		f1_txt3 = (TextView) v.findViewById(R.id.f1_txt3);

		deslizar.setTypeface(font);
		f1_txt1.setTypeface(font);
		f1_txt2.setTypeface(font);
		f1_txt3.setTypeface(font);
		return v;
	}
}