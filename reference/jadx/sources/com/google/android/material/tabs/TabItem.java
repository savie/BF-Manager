package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import l.C14625;
import l.C5204;

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
        C5204 c5204M15648 = C5204.m15648(context, attributeSet, C14625.f46789);
        this.text = c5204M15648.m15659(C14625.f46258);
        this.icon = c5204M15648.m15669(C14625.f46152);
        this.customLayout = c5204M15648.m15660(C14625.f46736, 0);
        c5204M15648.m15664();
    }
}
