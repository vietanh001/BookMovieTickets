package com.example.cinema.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.cinema.fragment.FragmentAccount;
import com.example.cinema.fragment.FragmentTicketHistory;
import com.example.cinema.fragment.FragmentHome;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FragmentHome();
            case 1:
                return new FragmentTicketHistory();
            case 2:
                return new FragmentAccount();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
