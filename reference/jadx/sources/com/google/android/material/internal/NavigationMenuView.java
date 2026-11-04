package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import l.C0067;
import l.C25227;
import l.C9898;
import l.InterfaceC11280;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuView extends C25227 implements InterfaceC11280 {
    public int getWindowAnimations() {
        return 0;
    }

    @Override // l.InterfaceC11280
    public void initialize(C9898 c9898) {
    }

    public NavigationMenuView(Context context) {
        this(context, null);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutManager(new C0067(context, 1, false));
    }
}
