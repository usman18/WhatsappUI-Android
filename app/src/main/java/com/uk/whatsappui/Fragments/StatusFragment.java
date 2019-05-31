package com.uk.whatsappui.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uk.whatsappui.Activities.MainActivity;
import com.uk.whatsappui.Adapters.StatusAdapter;
import com.uk.whatsappui.Model.Status;
import com.uk.whatsappui.R;

import java.util.ArrayList;

public class StatusFragment extends Fragment {
	
	private RecyclerView rvStatus;
	private StatusAdapter adapter;
	private ArrayList<Status> statusList;
	
	
	@Nullable
	@Override
	public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		return inflater.inflate(R.layout.status_layout, container, false);
	}
	
	@Override
	public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		
		statusList = new ArrayList<>();
		
		rvStatus = view.findViewById(R.id.rvStatus);
		rvStatus.setLayoutManager(new LinearLayoutManager(getContext()));
		adapter = new StatusAdapter(getContext(), statusList);
		
		statusList.add(new Status(MainActivity.profileUrls[3], "Conor McGregor", "5 minutes ago"));
		statusList.add(new Status(MainActivity.profileUrls[1], "Joe Rogan", "30 minutes ago"));
		statusList.add(new Status(MainActivity.profileUrls[2], "Elon Musk", "Today, 10:15 PM"));
		statusList.add(new Status(MainActivity.profileUrls[0], "Arnold", "Today, 6:15 AM"));
		
		rvStatus.setAdapter(adapter);
	
	
	}
}
