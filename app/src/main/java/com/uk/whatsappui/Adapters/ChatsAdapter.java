package com.uk.whatsappui.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.uk.whatsappui.Model.Chat;
import com.uk.whatsappui.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ChatsAdapter extends RecyclerView.Adapter<ChatsAdapter.ChatsViewHolder> {
	
	private Context context;
	private ArrayList<Chat> chats;
	
	public ChatsAdapter(Context context, ArrayList<Chat> chats) {
		this.context = context;
		this.chats = chats;
	}
	
	@NonNull
	@Override
	public ChatsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
		return new ChatsViewHolder(LayoutInflater.from(context).inflate(R.layout.chat_row, viewGroup, false));
	}
	
	@Override
	public void onBindViewHolder(@NonNull ChatsViewHolder chatsViewHolder, int i) {
		
		Chat chat = chats.get(i);
		
		Glide.with(context)
			.load(chat.getImage())
			.apply(new RequestOptions().placeholder(R.drawable.profile))
			.into(chatsViewHolder.profilePic);
		
		chatsViewHolder.tvName.setText(chat.getName());
		chatsViewHolder.tvMsg.setText(chat.getLastMessage());
		chatsViewHolder.tvTime.setText(chat.getLastMessageTime());
		
		
	}
	
	@Override
	public int getItemCount() {
		if (chats != null) {
			return chats.size();
		}
		return 0;
	}
	
	class ChatsViewHolder extends RecyclerView.ViewHolder {
		CircleImageView profilePic;
		TextView tvName;
		TextView tvMsg;
		TextView tvTime;
		
		
		ChatsViewHolder(@NonNull View itemView) {
			super(itemView);
		
			
			profilePic = itemView.findViewById(R.id.profile_image);
			tvName = itemView.findViewById(R.id.tvName);
			tvMsg = itemView.findViewById(R.id.tvLastMsg);
			tvTime = itemView.findViewById(R.id.tvTime);
			
		}
	}
}
