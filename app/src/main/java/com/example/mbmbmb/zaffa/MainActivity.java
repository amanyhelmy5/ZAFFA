package com.example.mbmbmb.zaffa;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private ViewPager viewPager;
    private TabsPagerAdapter mAdapter;
    TextView mTextView;

ImageView imageView,imageView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.text);
        viewPager = (ViewPager) findViewById(R.id.pageviewr);
        viewPager.setAdapter(new TabsPagerAdapter(getSupportFragmentManager()));
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab);
        tabLayout.setupWithViewPager(viewPager);

    }
               @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

}
