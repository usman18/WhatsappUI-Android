package com.uk.whatsappui.Activities;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;

import com.uk.whatsappui.Adapters.PagerAdapter;
import com.uk.whatsappui.R;

public class MainActivity extends AppCompatActivity {
	
	private static final String TAG = "MainActivity";
	
	private Toolbar toolbar;
	
	private ViewPager viewPager;
	private TabLayout tabLayout;
	
	
	private PagerAdapter adapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		toolbar = findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		
		tabLayout = findViewById(R.id.tablayout);
		viewPager = findViewById(R.id.viewpager);
		
		adapter = new PagerAdapter(getSupportFragmentManager());
		viewPager.setAdapter(adapter);
		
		viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
		
		tabLayout.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
			@Override
			public void onTabSelected(TabLayout.Tab tab) {
				if (tab.getPosition() == 0) {
					tab.setIcon(getResources().getDrawable(R.drawable.ic_action_camera));
				}
			}
			
			@Override
			public void onTabUnselected(TabLayout.Tab tab) {
				if (tab.getPosition() == 0) {
					tabLayout.getTabAt(0).setIcon(getResources().getDrawable(R.drawable.ic_action_camera_unselected));
				}
			}
			
			@Override
			public void onTabReselected(TabLayout.Tab tab) {
			
			}
		});
		
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.mainscreen_menu, menu);
		return super.onCreateOptionsMenu(menu);
	}
}
