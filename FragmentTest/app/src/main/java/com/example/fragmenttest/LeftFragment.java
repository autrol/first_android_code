package com.example.fragmenttest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by yangzhinian on 2017/8/5.
 */

public class LeftFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//      inflate()的作用就是将一个用xml定义的布局文件查找出来。
//      注意与findViewById()的区别，inflate是加载一个布局文件，而findViewById则是从布局文件中查找一个控件。
        View view = inflater.inflate(R.layout.left_fragment, container, false);
        return view;
    }
}
