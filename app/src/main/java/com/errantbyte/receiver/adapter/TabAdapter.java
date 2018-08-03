package com.errantbyte.receiver.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.errantbyte.receiver.fragment.ExampleFragment;

public class TabAdapter extends FragmentPagerAdapter {

    private String[] tabs;

    public TabAdapter(FragmentManager fm) {
        super(fm);
        tabs = new String[] {
                "One",
                "Two",
                "Three"
        };
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public Fragment getItem(int i) {
        return ExampleFragment.getInstance();
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}
