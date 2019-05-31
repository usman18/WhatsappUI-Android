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
		
		for (int i = 0; i < 5; i++) {
			statusList.add(new Status("Robert", "10 minutes ago"));
		}
		
		rvStatus.setAdapter(adapter);
	
	
	}
}
