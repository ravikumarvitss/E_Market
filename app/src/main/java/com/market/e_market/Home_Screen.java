package com.market.e_market;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import me.relex.circleindicator.CircleIndicator;

/**
 * Created by Lenovo on 08-Jun-17.
 */
public class Home_Screen extends AppCompatActivity {

    private static ViewPager mPager;
    private static int currentPage = 0;
    private static final Integer[] XMEN= {R.drawable.image1,R.drawable.image2,
            R.drawable.image3,R.drawable.image4,R.drawable.image5};
    private ArrayList<Integer> XMENArray = new ArrayList<Integer>();


    ListView list;
    EditText search;
    String[] names={"Vegetables","Groceries and Staples","Beverges"};
    int[] imageslist={R.drawable.vegetables,R.drawable.grocery,R.drawable.beverges};

    private Customadapter adapter;
    public int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homescreen);

        list=(ListView)findViewById(R.id.list1);
        search=(EditText)findViewById(R.id.searchh);

        adapter = new Customadapter(Home_Screen.this, names, imageslist);
        list.setAdapter(adapter);
        init();
    }
    private void init() {
        for(int i=0;i<XMEN.length;i++)
            XMENArray.add(XMEN[i]);

        mPager = (ViewPager) findViewById(R.id.pager);
        mPager.setAdapter(new MyAdapter(Home_Screen.this,XMENArray));
        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);
        indicator.setViewPager(mPager);

        // Auto start of viewpager
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == XMEN.length) {
                    currentPage = 0;
                }
                mPager.setCurrentItem(currentPage++, true);
            }
        };
        Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 3500, 3500);
    }

}
