package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import l.C12025;
import l.C22006;
import l.C9494;

/* JADX INFO: loaded from: classes.dex */
public class ClickActionDelegate extends C12025 {
    public final C9494 clickAction;

    public ClickActionDelegate(Context context, int i) {
        this.clickAction = new C9494(16, context.getString(i));
    }

    @Override // l.C12025
    public void onInitializeAccessibilityNodeInfo(View view, C22006 c22006) {
        super.onInitializeAccessibilityNodeInfo(view, c22006);
        c22006.m48848(this.clickAction);
    }
}
