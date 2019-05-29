package com.uk.whatsappui.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.uk.whatsappui.Fragments.CallsFragment;
import com.uk.whatsappui.Fragments.CameraFragment;
import com.uk.whatsappui.Fragments.ChatsFragment;
import com.uk.whatsappui.Fragments.StatusFragment;

public class PagerAdapter extends FragmentPagerAdapter {
	
	public PagerAdapter(FragmentManager fm) {
		super(fm);
	}
	
	@Override
	public Fragment getItem(int i) {
		switch (i) {
			case 0:
				return new CameraFragment();
			case 1:
				return new ChatsFragment();
			case 2:
				return new StatusFragment();
			case 3:
				return new CallsFragment();
		}
		return null;
	}
	
	@Override
	public int getCount() {
		return 4;
	}
}
