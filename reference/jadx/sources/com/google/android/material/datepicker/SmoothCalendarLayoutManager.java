package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import l.C13115;
import l.C16082;
import l.C17492;
import l.C3941;

/* JADX INFO: loaded from: classes.dex */
public class SmoothCalendarLayoutManager extends C13115 {
    public static final float MILLISECONDS_PER_INCH = 100.0f;

    public SmoothCalendarLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
    }

    @Override // l.C13115, l.AbstractC5498
    public void smoothScrollToPosition(C17492 c17492, C16082 c16082, int i) {
        C3941 c3941 = new C3941(c17492.getContext()) { // from class: com.google.android.material.datepicker.SmoothCalendarLayoutManager.1
            @Override // l.C3941
            public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                return 100.0f / displayMetrics.densityDpi;
            }
        };
        c3941.setTargetPosition(i);
        startSmoothScroll(c3941);
    }
}
