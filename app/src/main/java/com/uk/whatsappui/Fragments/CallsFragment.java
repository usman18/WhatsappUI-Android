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
import com.uk.whatsappui.Adapters.CallsAdapter;
import com.uk.whatsappui.Model.Call;
import com.uk.whatsappui.R;

import java.util.ArrayList;

public class CallsFragment extends Fragment {
	
	private ArrayList<Call> calls;
	private RecyclerView rvCalls;
	private CallsAdapter callsAdapter;
	
	@Nullable
	@Override
	public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		return inflater.inflate(R.layout.calls_layout, container, false);
	}
	
	@Override
	public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		
		
		initialize(view);
		populateCalls();
		setCallsAdapter();
		
	}
	
	private void initialize(View view) {
		rvCalls = view.findViewById(R.id.rvCalls);
		calls = new ArrayList<>();
		
	}
	
	
	private void populateCalls() {
		//Population logic goes here
		
		calls.add(new Call(MainActivity.profileUrls[0], "Arnold", "2:00 PM", Call.AUDIO));
		calls.add(new Call(MainActivity.profileUrls[2], "Elon", "Yesterday, 8:00 PM", Call.VIDEO));
		calls.add(new Call("Rohan", "Yesterday, 10:15 AM", Call.AUDIO));
		
	}
	
	private void setCallsAdapter() {
		
		rvCalls.setLayoutManager(new LinearLayoutManager(getContext()));
		callsAdapter = new CallsAdapter(getContext(), calls);
		rvCalls.setAdapter(callsAdapter);
		
	}
	
	
}
