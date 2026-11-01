package com.google.android.material.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import l.C12418;
import l.C12441;
import l.C23707;

/* JADX INFO: loaded from: classes.dex */
public final class NavigationBarMenu extends C12418 {
    public final int maxItemCount;
    public final Class viewClass;

    public NavigationBarMenu(Context context, Class cls, int i) {
        super(context);
        this.viewClass = cls;
        this.maxItemCount = i;
    }

    public int getMaxItemCount() {
        return this.maxItemCount;
    }

    @Override // l.C12418, android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.viewClass.getSimpleName().concat(" does not support submenus"));
    }

    @Override // l.C12418
    public MenuItem addInternal(int i, int i2, int i3, CharSequence charSequence) {
        if (size() + 1 <= this.maxItemCount) {
            stopDispatchingItemsChanged();
            MenuItem menuItemAddInternal = super.addInternal(i, i2, i3, charSequence);
            if (menuItemAddInternal instanceof C23707) {
                ((C23707) menuItemAddInternal).m52178(true);
            }
            startDispatchingItemsChanged();
            return menuItemAddInternal;
        }
        String simpleName = this.viewClass.getSimpleName();
        StringBuilder sbM30914 = C12441.m30914("Maximum number of items supported by ", simpleName, " is ");
        sbM30914.append(this.maxItemCount);
        sbM30914.append(". Limit can be checked with ");
        sbM30914.append(simpleName);
        sbM30914.append("#getMaxItemCount()");
        throw new IllegalArgumentException(sbM30914.toString());
    }
}
