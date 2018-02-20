package com.example.android.miwok;


import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

/**
 * Created by SoOrAj on 20-02-2018.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    // tab titles
    private String[] tabTitles = new String[]{"Numbers", "Color", "Phrases","Family"};


    // overriding getPageTitle()
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {

            return new NumbersFragment();
        } else if (position == 1){
            return new ColorsFragment();}
        else if (position == 2){
                return new FamilyFragment();
        } else {
            return new PhrasesFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
