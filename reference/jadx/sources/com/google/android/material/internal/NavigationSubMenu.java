package com.google.android.material.internal;

import android.content.Context;
import l.C12418;
import l.C23707;
import l.SubMenuC7915;

/* JADX INFO: loaded from: classes2.dex */
public class NavigationSubMenu extends SubMenuC7915 {
    public NavigationSubMenu(Context context, NavigationMenu navigationMenu, C23707 c23707) {
        super(context, navigationMenu, c23707);
    }

    @Override // l.C12418
    public void onItemsChanged(boolean z) {
        super.onItemsChanged(z);
        ((C12418) getParentMenu()).onItemsChanged(z);
    }
}
