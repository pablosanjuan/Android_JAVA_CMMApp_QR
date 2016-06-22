package com.cmmapp.pablosj.cmmapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Fragment3 extends Fragment implements View.OnClickListener {

	private  Button siguiente;
	TextView deslizar;
	private TextView f3_txt1;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub

		View v = inflater.inflate(R.layout.fragment3_layout,container,false);
		Typeface font = Typeface.createFromAsset(getActivity().getAssets(),"Equal-Regular.otf");
		siguiente = (Button) v.findViewById(R.id.siguiente);
		siguiente.setTypeface(font);
		siguiente.setOnClickListener(this);
		f3_txt1 = (TextView) v.findViewById(R.id.f3_txt1);
		deslizar = (TextView) v.findViewById(R.id.deslizar);
		deslizar.setTypeface(font);
		f3_txt1.setTypeface(font);
		return v;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()){
			case R.id.siguiente:
				Intent intent = new Intent(getActivity(), Opciones.class);
				startActivity(intent);
				break;
		}
	}
}