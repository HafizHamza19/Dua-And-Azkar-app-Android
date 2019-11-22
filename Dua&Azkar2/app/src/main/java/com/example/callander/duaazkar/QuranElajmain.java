package com.example.callander.duaazkar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuranElajmain extends ActionBarActivity {
    ViewPager mViewPager;
    Button Next,Previous;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_elajmain);
        mViewPager=(ViewPager)findViewById(R.id.pager);
        mViewPager.setAdapter(new SamplePagerAdapter(getSupportFragmentManager()));
        Next=(Button)findViewById(R.id.Next);
        Previous=(Button)findViewById(R.id.Previous);
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int currentItem = mViewPager.getCurrentItem();
                mViewPager.setCurrentItem(currentItem+1); //(currentItem-1)
            }
        });
        Previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int currentItem = mViewPager.getCurrentItem();
                mViewPager.setCurrentItem(currentItem-1); //(currentItem-1)
            }
        });

    }



    public class SamplePagerAdapter extends FragmentPagerAdapter {
        public SamplePagerAdapter(FragmentManager fm) {
            super(fm);
        }
        @Override
        public Fragment getItem(int position) {
            /** Show a Fragment based on the position of the current screen */
            if (position == 0) {
                return new ElajF1();
            }
            if(position == 1){
                return new ElajF2();
            }
            if(position == 2){
                return new ElajF3();
            }
            if(position == 3){
                return new ElajF4();
            }
            else
                return new ElajF5();

        }

        @Override
        public int getCount() {
            // Show 2 total pages.
            return 5;
        }
    }
}

