package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import l.C0067;
import l.C15529;
import l.C25227;
import l.C7525;

/* JADX INFO: loaded from: classes.dex */
public class SmoothCalendarLayoutManager extends C0067 {
    public static final float MILLISECONDS_PER_INCH = 100.0f;

    public SmoothCalendarLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
    }

    @Override // l.C0067, l.AbstractC21169
    public void smoothScrollToPosition(C25227 c25227, C15529 c15529, int i) {
        C7525 c7525 = new C7525(c25227.getContext()) { // from class: com.google.android.material.datepicker.SmoothCalendarLayoutManager.1
            @Override // l.C7525
            public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                return 100.0f / displayMetrics.densityDpi;
            }
        };
        c7525.setTargetPosition(i);
        startSmoothScroll(c7525);
    }
}
