package com.technoabinash.customtablayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.technoabinash.customtablayout.adapter.FragmentAdapter;

public class MainActivity extends AppCompatActivity {
TabLayout tabLayout;
ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager=findViewById(R.id.main_viewPage);
       viewPager.setAdapter(new FragmentAdapter(getSupportFragmentManager()));
       tabLayout=findViewById(R.id.main_tab_taLayout);
       tabLayout.setupWithViewPager(viewPager);


    }
}