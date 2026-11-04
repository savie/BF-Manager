package com.google.android.material.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import l.C22783;
import l.C8407;
import l.C9898;

/* JADX INFO: loaded from: classes.dex */
public final class NavigationBarMenu extends C9898 {
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

    @Override // l.C9898, android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.viewClass.getSimpleName().concat(" does not support submenus"));
    }

    @Override // l.C9898
    public MenuItem addInternal(int i, int i2, int i3, CharSequence charSequence) {
        if (size() + 1 <= this.maxItemCount) {
            stopDispatchingItemsChanged();
            MenuItem menuItemAddInternal = super.addInternal(i, i2, i3, charSequence);
            if (menuItemAddInternal instanceof C8407) {
                ((C8407) menuItemAddInternal).m22592(true);
            }
            startDispatchingItemsChanged();
            return menuItemAddInternal;
        }
        String simpleName = this.viewClass.getSimpleName();
        StringBuilder sbM51387 = C22783.m51387("Maximum number of items supported by ", simpleName, " is ");
        sbM51387.append(this.maxItemCount);
        sbM51387.append(". Limit can be checked with ");
        sbM51387.append(simpleName);
        sbM51387.append("#getMaxItemCount()");
        throw new IllegalArgumentException(sbM51387.toString());
    }
}
