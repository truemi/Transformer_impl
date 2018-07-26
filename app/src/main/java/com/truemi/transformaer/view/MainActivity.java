package com.truemi.transformaer.view;

import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

import com.truemi.transformaer.R;
import com.truemi.transformaer.transformerLib.MyTransformer;
import com.truemi.transformaer.transformerLib.TransType;

public class MainActivity extends AppCompatActivity {

    private ViewPager            viewpager;
    private FloatingActionButton fab;
    private RadioGroup           rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewpager = findViewById(R.id.view_pager);
        fab = findViewById(R.id.fab);
        rg = findViewById(R.id.rg);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rg.getVisibility()==View.VISIBLE){
                    rg.setVisibility(View.GONE);
                }else{
                    rg.setVisibility(View.VISIBLE);
                }
            }
        });

        viewpager.setOffscreenPageLimit(2);//设置预加载页数
        viewpager.setPageTransformer(true, MyTransformer.getMyTransformer(TransType.H3D));
        viewpager.setAdapter(new MyPagerAdapter(MainActivity.this));
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                viewpager.setAdapter(new MyPagerAdapter(MainActivity.this));
                switch (checkedId){
                    case R.id.rb1:
                        viewpager.setPageTransformer(true, MyTransformer.getMyTransformer(TransType.H3D));
                        break;
                    case R.id.rb2:
                        viewpager.setPageTransformer(true,MyTransformer.getMyTransformer(TransType.H3DINTO,30.0f));
                        break;
                    case R.id.rb3:
                        viewpager.setPageTransformer(true,MyTransformer.getMyTransformer(TransType.FADEIN));
                        break;
                    case R.id.rb4:
                        viewpager.setPageTransformer(true,MyTransformer.getMyTransformer(TransType.TANDEM));
                        break;
                    case R.id.rb5:
                        viewpager.setPageTransformer(true,MyTransformer.getMyTransformer(TransType.OVERLAP));
                        break;

                }
            }
        });

    }
}
