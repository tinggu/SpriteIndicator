package me.tinggu.spriteindicator.sample.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.tinggu.spriteindicator.SpriteIndicator;
import me.tinggu.spriteindicator.sample.DemoPagerAdapter;
import me.tinggu.spriteindicator.sample.R;

public class CustomAnimationFragment extends Fragment {

    @Nullable @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_custom_animation_demo, container, false);
    }

    @Override public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        ViewPager viewpager = (ViewPager) view.findViewById(R.id.viewpager);
        SpriteIndicator indicator = (SpriteIndicator) view.findViewById(R.id.indicator);
        viewpager.setAdapter(new DemoPagerAdapter());
        indicator.setViewPager(viewpager);
    }
}
