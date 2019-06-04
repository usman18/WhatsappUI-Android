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
import com.uk.whatsappui.Adapters.ChatsAdapter;
import com.uk.whatsappui.Model.Chat;
import com.uk.whatsappui.R;

import java.util.ArrayList;

public class ChatsFragment extends Fragment {
	
	private ArrayList<Chat> chats;
	
	private RecyclerView rvChats;
	private ChatsAdapter adapter;
	
	@Nullable
	@Override
	public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		return inflater.inflate(R.layout.chats_layout, container, false);
	}
	
	@Override
	public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		
		initialize(view);
		populateChats();
		setAdapter();
		
	}
	
	
	private void initialize(View view) {
		
		chats = new ArrayList<>();
		rvChats = view.findViewById(R.id.rvChats);
		
	}
	
	private void populateChats() {
		//Population logic goes here
		
		chats.add(new Chat(MainActivity.profileUrls[0], "Arnold", "Sure", "8:15 PM"));
		chats.add(new Chat("Alice ", "That is superb! I am busy this week, so I'll let you know if I can make it.", "7.01 PM"));
		chats.add(new Chat(MainActivity.profileUrls[1], "Joe Rogan", "Thanks man!", "3:15 PM"));
		chats.add(new Chat(MainActivity.profileUrls[2], "Elon Musk", "Okay", "Yesterday"));
		chats.add(new Chat("G.O.A.T ", "Lets go mate. See you sharp at 6.", "5/12/19"));
		chats.add(new Chat("Rohan", "Call me when you are free", "5/14/19"));
		chats.add(new Chat("Ali", "That is lit!", "5/20/19"));
		chats.add(new Chat(MainActivity.profileUrls[3], "Conor McGregor", "I'm in Dublin. Training for July bout.", "5/22/19"));
		
	}
	
	private void setAdapter() {
		
		adapter = new ChatsAdapter(getContext(), chats);
		rvChats.setLayoutManager(new LinearLayoutManager(getContext()));
		rvChats.setAdapter(adapter);
		
	}
	
	
}
