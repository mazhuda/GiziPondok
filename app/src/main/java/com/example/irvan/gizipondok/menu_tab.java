package com.example.irvan.gizipondok;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.readystatesoftware.android.sqliteassethelper.BuildConfig;

public class menu_tab extends AppCompatActivity {
    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;
    static FragmentTabHost mTabHost;

    public static class PlaceholderFragment extends Fragment {
        private static final String ARG_SECTION_NUMBER = "section_number";

        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            if (getArguments().getInt(ARG_SECTION_NUMBER) == 1) {
                mTabHost = new FragmentTabHost(getActivity());
                mTabHost.setup(getActivity(), getChildFragmentManager(), R.id.main_content);
                return inflater.inflate(R.layout.activity_menu_2125_ts, container, false);
            }
            if (getArguments().getInt(ARG_SECTION_NUMBER) == 2) {
                return inflater.inflate(R.layout.fragment_tab2, container, false);
            }
            return inflater.inflate(R.layout.fragment_tab3, container, false);
        }

//        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//            mTabHost = new FragmentTabHost(getActivity());
//            mTabHost.setup(getActivity(), getChildFragmentManager(), R.id.main_content);
//
//            mTabHost.addTab(mTabHost.newTabSpec("simple").setIndicator("Simple"), menu_tab.class, null);
//            mTabHost.addTab(mTabHost.newTabSpec("contacts").setIndicator("Contacts"), menu_tab.class, null);
//            mTabHost.addTab(mTabHost.newTabSpec("throttle").setIndicator("Throttle"),  menu_tab.class, null);
//
//            return mTabHost;
//        }
//
//        public void onDestroyView() {
//            super.onDestroyView();
//            mTabHost = null;
//        }

    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {
        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        public Fragment getItem(int position) {
            return PlaceholderFragment.newInstance(position + 1);
        }

        public int getCount() {
            return 3;
        }

        public CharSequence getPageTitle(int position) {
            switch (position) {
                case R.styleable.View_android_theme /*0*/:
                    return "Deskripsi";
                case R.styleable.View_android_focusable /*1*/:
                    return "Petunjuk";
                case BuildConfig.VERSION_CODE /*2*/:
                    return "Pengembang";
                default:
                    return null;
            }
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);
        //setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        this.mViewPager = (ViewPager) findViewById(R.id.container);
        this.mViewPager.setAdapter(this.mSectionsPagerAdapter);
        ((TabLayout) findViewById(R.id.tab)).setupWithViewPager(this.mViewPager);
    }

}
