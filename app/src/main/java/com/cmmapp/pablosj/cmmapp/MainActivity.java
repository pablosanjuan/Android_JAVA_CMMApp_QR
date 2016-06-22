package com.cmmapp.pablosj.cmmapp;

import java.util.List;
import java.util.Vector;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.WindowManager;

public class MainActivity extends FragmentActivity {

	private PagerAdapter mPagerAdapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
		WindowManager.LayoutParams.FLAG_FULLSCREEN);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.viewpager_layout);
		initialisePaging();
	}

	private void initialisePaging() {
		// TODO Auto-generated method stub
		List<Fragment> fragments = new Vector<Fragment>();
		fragments.add(Fragment.instantiate(this,Fragment1.class.getName()));
		fragments.add(Fragment.instantiate(this,Fragment2.class.getName()));
		fragments.add(Fragment.instantiate(this, Fragment4.class.getName()));
		fragments.add(Fragment.instantiate(this, Fragment5.class.getName()));
		fragments.add(Fragment.instantiate(this, Fragment3.class.getName()));
		mPagerAdapter =new PagerAdapter(this.getSupportFragmentManager(), fragments);
		ViewPager pager = (ViewPager) findViewById(R.id.viewpager);
		pager.setAdapter(mPagerAdapter);
	}

	public void siguiente_view(){
		Intent intent = new Intent(getApplicationContext(), Opciones.class);
		startActivity(intent);
	}
}
