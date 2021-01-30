package com.example.musicplayer.controller.activity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import com.example.musicplayer.R;
import com.example.musicplayer.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements NavController.OnDestinationChangedListener {
    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        NavController navController = Navigation.findNavController(
                this,
                R.id.nav_host_fragment);
        NavigationUI.setupWithNavController(mBinding.navView, navController);
        navController.addOnDestinationChangedListener(this::onDestinationChanged);
    }

    @Override
    public void onDestinationChanged(@NonNull NavController controller,
                                     @NonNull NavDestination destination,
                                     @Nullable Bundle arguments) {
        if (destination.getId() == R.id.playbackFragment) {
            mBinding.navView.setVisibility(View.GONE);
        } else {
            mBinding.navView.setVisibility(View.VISIBLE);
        }
    }
}