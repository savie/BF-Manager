package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import l.C12418;
import l.C13115;
import l.C17492;
import l.InterfaceC12854;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuView extends C17492 implements InterfaceC12854 {
    public int getWindowAnimations() {
        return 0;
    }

    @Override // l.InterfaceC12854
    public void initialize(C12418 c12418) {
    }

    public NavigationMenuView(Context context) {
        this(context, null);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutManager(new C13115(context, 1, false));
    }
}
