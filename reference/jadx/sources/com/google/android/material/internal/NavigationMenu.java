package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import l.C8407;
import l.C9898;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenu extends C9898 {
    public NavigationMenu(Context context) {
        super(context);
    }

    @Override // l.C9898, android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C8407 c8407 = (C8407) addInternal(i, i2, i3, charSequence);
        NavigationSubMenu navigationSubMenu = new NavigationSubMenu(getContext(), this, c8407);
        c8407.m22589(navigationSubMenu);
        return navigationSubMenu;
    }
}
