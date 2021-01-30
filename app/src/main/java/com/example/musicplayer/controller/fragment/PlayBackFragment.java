package com.example.musicplayer.controller.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.musicplayer.R;
import com.example.musicplayer.databinding.FragmentPlayBackBinding;

public class PlayBackFragment extends Fragment {
    private FragmentPlayBackBinding mBinding;

    public static PlayBackFragment newInstance() {
        PlayBackFragment fragment = new PlayBackFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mBinding = DataBindingUtil.inflate(
                inflater,
                R.layout.fragment_play_back,
                container,
                false);
        return mBinding.getRoot();
    }
}