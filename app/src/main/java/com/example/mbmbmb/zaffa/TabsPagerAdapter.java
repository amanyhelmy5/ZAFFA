package com.example.mbmbmb.zaffa;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by mbmbmb on 7/11/2017.
 */
public class TabsPagerAdapter extends FragmentPagerAdapter {
    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {

        switch (index) {
            case 0:
                return new Home();
            case 1:
                return new Show();
            case 2:
                return new Posts();
        }

        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "الرئيسية";
            case 1:
                return "المعرض";
            case 2:
                return "مشاركات";
        }

        return super.getPageTitle(position);

    }

    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 3;
    }

}
