package com.example.bigyoung.diyradiobutton;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.bigyoung.diyradiobutton.utils.RadioButtonRestoreUtils;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.cool_mode)
    RadioButton mCoolMode;
    @BindView(R.id.warm_mode)
    RadioButton mWarmMode;
    @BindView(R.id.drying_mode)
    RadioButton mDryingMode;
    @BindView(R.id.cloud_mode)
    RadioButton mCloudMode;
    @BindView(R.id.mode_group)
    RadioGroup mModeGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mModeGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                switch (checkedId){
                    //相关操作
                }
                //this 代表的是OnCheckedChangeListener对象
                RadioButtonRestoreUtils.restoredRadioButton(checkedId,group,this,MainActivity.this);
            }
        });
    }
}
