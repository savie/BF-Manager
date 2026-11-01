package com.google.android.material.elevation;

import android.content.Context;
import com.google.android.material.color.MaterialColors;
import l.C0976;
import l.C2387;

/* JADX INFO: loaded from: classes.dex */
public enum SurfaceColors {
    SURFACE_0(C0976.f4511),
    SURFACE_1(C0976.f4347),
    SURFACE_2(C0976.f4488),
    SURFACE_3(C0976.f3827),
    SURFACE_4(C0976.f4370),
    SURFACE_5(C0976.f4229);

    public final int elevationResId;

    SurfaceColors(int i) {
        this.elevationResId = i;
    }

    public int getColor(Context context) {
        return getColorForElevation(context, context.getResources().getDimension(this.elevationResId));
    }

    public static int getColorForElevation(Context context, float f) {
        return new ElevationOverlayProvider(context).compositeOverlay(MaterialColors.getColor(context, C2387.f8699, 0), f);
    }
}
