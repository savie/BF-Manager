package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import l.C1977;
import l.C8033;

/* JADX INFO: loaded from: classes.dex */
public class TabItem extends View {
    public final int customLayout;
    public final Drawable icon;
    public final CharSequence text;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C1977 c1977M6352 = C1977.m6352(context, attributeSet, C8033.f26790);
        this.text = c1977M6352.m6368(C8033.f27428);
        this.icon = c1977M6352.m6370(C8033.f27161);
        this.customLayout = c1977M6352.m6387(C8033.f28118, 0);
        c1977M6352.m6379();
    }
}
