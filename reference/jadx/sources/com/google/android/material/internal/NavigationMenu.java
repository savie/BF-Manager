package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import l.C12418;
import l.C23707;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenu extends C12418 {
    public NavigationMenu(Context context) {
        super(context);
    }

    @Override // l.C12418, android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C23707 c23707 = (C23707) addInternal(i, i2, i3, charSequence);
        NavigationSubMenu navigationSubMenu = new NavigationSubMenu(getContext(), this, c23707);
        c23707.m52173(navigationSubMenu);
        return navigationSubMenu;
    }
}
