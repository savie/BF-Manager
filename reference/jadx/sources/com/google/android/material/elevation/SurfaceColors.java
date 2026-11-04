package com.google.android.material.elevation;

import android.content.Context;
import com.google.android.material.color.MaterialColors;
import l.C11642;
import l.C17609;

/* JADX INFO: loaded from: classes.dex */
public enum SurfaceColors {
    SURFACE_0(C17609.f57278),
    SURFACE_1(C17609.f57608),
    SURFACE_2(C17609.f57821),
    SURFACE_3(C17609.f57727),
    SURFACE_4(C17609.f57161),
    SURFACE_5(C17609.f57397);

    public final int elevationResId;

    SurfaceColors(int i) {
        this.elevationResId = i;
    }

    public int getColor(Context context) {
        return getColorForElevation(context, context.getResources().getDimension(this.elevationResId));
    }

    public static int getColorForElevation(Context context, float f) {
        return new ElevationOverlayProvider(context).compositeOverlay(MaterialColors.getColor(context, C11642.f36968, 0), f);
    }
}
