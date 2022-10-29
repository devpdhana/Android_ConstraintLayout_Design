package com.dhana.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

import javax.net.ssl.SSLEngineResult;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    LinearLayout ChatLayout;
    LinearLayout StatusLayout;
    LinearLayout CallsLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.TabLayout);
        ChatLayout = findViewById(R.id.Chatlayout);
        StatusLayout = findViewById(R.id.Statuslayout);
        CallsLayout = findViewById(R.id.Callslayout);
        tabLayout.addTab(tabLayout.newTab().setText("Chats"));
        tabLayout.addTab(tabLayout.newTab().setText("Status"));
        tabLayout.addTab(tabLayout.newTab().setText("Calls"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()){
                    case 0: {
                        setVisible(ChatLayout, StatusLayout, CallsLayout);
                        break;
                    }
                    case 1: {
                        setVisible(StatusLayout, CallsLayout, ChatLayout);
                        break;
                    }
                    case 2:{
                        setVisible(CallsLayout,ChatLayout,StatusLayout);
                        break;
                    }

                }
                
            }


            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }

        });

    }

    private void setVisible(LinearLayout chatLayout, LinearLayout statusLayout, LinearLayout callsLayout) {
        chatLayout.setVisibility(View.VISIBLE);
        statusLayout.setVisibility(View.GONE);
        callsLayout.setVisibility(View.GONE);
    }
}