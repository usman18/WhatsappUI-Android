package com.uk.whatsappui.Activities;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.uk.whatsappui.Adapters.PagerAdapter;
import com.uk.whatsappui.R;

public class MainActivity extends AppCompatActivity {
	
	private ViewPager viewPager;
	private TabLayout tabLayout;
	
	private PagerAdapter adapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		tabLayout = findViewById(R.id.tablayout);
		viewPager = findViewById(R.id.viewpager);
		
		adapter = new PagerAdapter(getSupportFragmentManager());
		viewPager.setAdapter(adapter);
		
		viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
		
		tabLayout.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
			@Override
			public void onTabSelected(TabLayout.Tab tab) {

			}
			
			@Override
			public void onTabUnselected(TabLayout.Tab tab) {
			
			}
			
			@Override
			public void onTabReselected(TabLayout.Tab tab) {
			
			}
		});
		
//		tabLayout.setupWithViewPager(viewPager);
		
		
	}
}
