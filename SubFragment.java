package com.example.andoutakayuki.activitypractice;

import android.app.Fragment;
import android.os.Bundle;

/**
 * Created by andoutakayuki on 15/07/09.
 */
public class SubFragment extends Fragment{
    public SubFragment(){

    }
    public static Fragment createInstance(int hoge){
        Fragment fragment = new SubFragment();
        Bundle args = new Bundle();
        args.putInt("hoge", hoge);
        fragment.setArguments(args);
        return fragment;
    }
}
