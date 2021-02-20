package com.technoabinash.customtablayout.adapter;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;

import com.technoabinash.customtablayout.fragments.ChatFragment;
import com.technoabinash.customtablayout.fragments.HomeFragment;
import com.technoabinash.customtablayout.fragments.ProfileFragment;

public class FragmentAdapter extends FragmentPagerAdapter {
    public FragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:return new HomeFragment();

            case 1:return new ChatFragment();

            case 2:return new ProfileFragment();

        }
        return new HomeFragment();
    }

    @Override
    public int getCount() {
        return 3;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title=null;
        if (position==0){
            title="HOME";
        }else if (position==1){
            title="CHAT";
        }else if (position==2){
            title="PROFILE";
        }
        return title;
    }
}
