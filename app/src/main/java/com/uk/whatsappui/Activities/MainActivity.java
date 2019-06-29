package com.uk.whatsappui.Activities;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

import com.uk.whatsappui.Adapters.PagerAdapter;
import com.uk.whatsappui.R;

public class MainActivity extends AppCompatActivity {
	
	private static final String TAG = "MainActivity";
	
	//Random image urls
	public static final String[] profileUrls = {"https://blog.rackspace.com/wp-content/uploads/2018/09/pumping-iron-arnold-schwarzenegger-1-1108x0-c-default-696x522.jpg",
		"https://www.rollingstone.com/wp-content/uploads/2018/06/rs-213329-R1247_FEA_Rogen_A.jpg?crop=900:600&width=440",
		"https://assets.entrepreneur.com/content/3x2/2000/20170118220227-GettyImages-471763092.jpeg",
		"https://static.ffx.io/images/$zoom_0.238%2C$multiply_1%2C$ratio_1.776846%2C$width_1059%2C$x_0%2C$y_55/t_crop_custom/w_800/q_86%2Cf_auto/cf3f16e35b79207935da03f7b4a7e7d6e484ff71"
	};
	
	private Toolbar toolbar;
	
	private FloatingActionButton mainFab;
	private FloatingActionButton miniFab;
	
	private ViewPager viewPager;
	private TabLayout tabLayout;
	
	private PagerAdapter adapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
			setTheme(R.style.App_Dark);
		}
		setContentView(R.layout.activity_main);
		
		initialize();
		setUpViewPager();
		
	}
	
	private void initialize() {
	
		toolbar = findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		
		tabLayout = findViewById(R.id.tablayout);
		
		
		viewPager = findViewById(R.id.viewpager);
		
		mainFab = findViewById(R.id.mainFab);
		miniFab = findViewById(R.id.miniFab);
		
		miniFab.setVisibility(View.GONE);               //Default
		
	}
	
	private void setUpViewPager() {
		
		adapter = new PagerAdapter(getSupportFragmentManager());
		viewPager.setAdapter(adapter);
		
		
		viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
		viewPager.setCurrentItem(1);            //Default selection is chats screen
		
		tabLayout.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
			@Override
			public void onTabSelected(TabLayout.Tab tab) {
				
				if (viewPager.getCurrentItem() != tab.getPosition()) {
					//Loading appropriate fragment just in case
					viewPager.setCurrentItem(tab.getPosition());
				}
				
				if (tab.getPosition() == 0) {   //Camera Fragment
					tab.setIcon(getResources().getDrawable(R.drawable.ic_action_camera));
					
					miniFab.setVisibility(View.GONE);
					mainFab.setVisibility(View.GONE);
					
				} else if (tab.getPosition() == 1) {    //Chats Fragment
					
					miniFab.setVisibility(View.GONE);
					mainFab.setVisibility(View.VISIBLE);
					mainFab.setImageResource(R.drawable.ic_message);
					
				} else if (tab.getPosition() == 2) {    //Status Fragment
					
					miniFab.setVisibility(View.VISIBLE);
					mainFab.setVisibility(View.VISIBLE);
					mainFab.setImageResource(R.drawable.ic_photo_camera);
					
				} else if (tab.getPosition() == 3) {    //Calls Fragment
					
					miniFab.setVisibility(View.GONE);
					mainFab.setVisibility(View.VISIBLE);
					mainFab.setImageResource(R.drawable.ic_call);
					
				}
				
				
			}
			
			@Override
			public void onTabUnselected(TabLayout.Tab tab) {
				if (tab.getPosition() == 0) {
					tabLayout.getTabAt(0).setIcon(getResources().getDrawable(R.drawable.ic_action_camera));
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
