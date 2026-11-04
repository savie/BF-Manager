package com.google.android.material.internal;

import android.content.Context;
import l.C8407;
import l.C9898;
import l.SubMenuC12026;

/* JADX INFO: loaded from: classes2.dex */
public class NavigationSubMenu extends SubMenuC12026 {
    public NavigationSubMenu(Context context, NavigationMenu navigationMenu, C8407 c8407) {
        super(context, navigationMenu, c8407);
    }

    @Override // l.C9898
    public void onItemsChanged(boolean z) {
        super.onItemsChanged(z);
        ((C9898) getParentMenu()).onItemsChanged(z);
    }
}
