package com.github.paolorotolo.appintroexample.animations;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.Toast;

import com.github.paolorotolo.appintro.AppIntro2Fragment;
import com.github.paolorotolo.appintroexample.BaseIntro2;
import com.github.paolorotolo.appintroexample.R;
import com.github.paolorotolo.appintroexample.util.Helper;

import java.util.ArrayList;

/**
 * Created by Girish on 18/01/16.
 */
public class ColorAnimation extends BaseIntro2 {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(AppIntro2Fragment.newInstance("Title 1",
                "Description here...\nYeah, I've added this fragment programmatically",
                R.drawable.ic_slide1, Color.TRANSPARENT));

        addSlide(AppIntro2Fragment.newInstance("HTML Description",
                Helper.fromHtml("<b>Description bold...</b><br><i>Description italic...</i>"),
                R.drawable.ic_slide1, Color.TRANSPARENT));

        addSlide(AppIntro2Fragment.newInstance("HTML Description",
                Helper.fromHtml("<b>Description bold...</b><br><i>Description italic...</i>"),
                R.drawable.ic_slide1, Color.TRANSPARENT));

        ArrayList<Integer> colors = new ArrayList<>();
        colors.add(Color.parseColor("#FF566A"));
        colors.add(Color.parseColor("#50EB8F"));
        colors.add(Color.parseColor("#3A8BBB"));
        setAnimationColors(colors);
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);

        loadMainActivity();
        Toast.makeText(getApplicationContext(), getString(R.string.skip),
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);

        loadMainActivity();
    }

    public void getStarted(View v) {
        loadMainActivity();
    }
}
