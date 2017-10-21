package com.example.michael.adino.Utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;

import com.example.michael.adino.Add.AddActivity;
import com.example.michael.adino.Home.MainPageActivity;
import com.example.michael.adino.Notifications.NotificationsActivity;
import com.example.michael.adino.Profile.ProfileActivity;
import com.example.michael.adino.R;
import com.example.michael.adino.Search.SearchActivity;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

/**
 * Created by michael on 18/10/2017.
 */

public class BottomNavViewHelper {

    private static final String TAG = "BottomNavView1";

    public static void setupBottomNavView(BottomNavigationViewEx bottomNavigationViewEx){

        Log.d(TAG, "setupBottomNavView: Setting up bottom nav");
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);
    }

    public static void enableNavigation(final Context context, BottomNavigationViewEx view){
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                try {
                    switch (item.getItemId()) {
                        case R.id.ic_house:
                            Intent intent1 = new Intent(context, MainPageActivity.class); //ACTIVITY_NUM 0
                            context.startActivity(intent1);
                            break;
                        case R.id.ic_search:
                            Intent intent2 = new Intent(context, SearchActivity.class); //ACTIVITY_NUM 1
                            context.startActivity(intent2);
                            break;
                        case R.id.ic_add:
                            Intent intent3 = new Intent(context, AddActivity.class); //ACTIVITY_NUM 2
                            context.startActivity(intent3);
                            break;
                        case R.id.ic_notifications:
                            Intent intent4 = new Intent(context, NotificationsActivity.class); //ACTIVITY_NUM 3
                            context.startActivity(intent4);
                            break;
                        case R.id.ic_settings:
                            Intent intent5 = new Intent(context, ProfileActivity.class); //ACTIVITY_NUM 4
                            context.startActivity(intent5);
                            break;
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
                return false;
            }
        });
    }
}
