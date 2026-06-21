package com.microsoft.embeddedsocial.sdk;

import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

public interface INavigationDrawerHandler {
    Fragment getFragment();
    void setUp(int fragmentId, DrawerLayout drawerLayout);
    int getBackgroundColor();
    int getWidth();
    boolean displayToolbar();
}
