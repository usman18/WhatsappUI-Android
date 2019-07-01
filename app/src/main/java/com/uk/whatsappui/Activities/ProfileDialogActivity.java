package com.uk.whatsappui.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.uk.whatsappui.R;

public class ProfileDialogActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_dialog);

        ImageView profileImage=findViewById(R.id.profile_image);
        Glide.with(this)
                .load(getIntent().getStringExtra("url"))
                .apply(new RequestOptions().placeholder(R.drawable.profile))
                .into(profileImage);

    }
}
