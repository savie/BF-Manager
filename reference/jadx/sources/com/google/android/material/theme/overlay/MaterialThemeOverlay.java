package com.google.android.material.theme.overlay;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import l.C2387;
import l.C5716;

/* JADX INFO: loaded from: classes.dex */
public class MaterialThemeOverlay {
    public static final int[] ANDROID_THEME_OVERLAY_ATTRS = {R.attr.theme, C2387.f8592};
    public static final int[] MATERIAL_THEME_OVERLAY_ATTR = {C2387.f9170};

    public static Context wrap(Context context, AttributeSet attributeSet, int i, int i2) {
        int iObtainMaterialThemeOverlayId = obtainMaterialThemeOverlayId(context, attributeSet, i, i2);
        boolean z = (context instanceof C5716) && ((C5716) context).m15753() == iObtainMaterialThemeOverlayId;
        if (iObtainMaterialThemeOverlayId == 0 || z) {
            return context;
        }
        C5716 c5716 = new C5716(context, iObtainMaterialThemeOverlayId);
        int iObtainAndroidThemeOverlayId = obtainAndroidThemeOverlayId(context, attributeSet);
        if (iObtainAndroidThemeOverlayId != 0) {
            c5716.getTheme().applyStyle(iObtainAndroidThemeOverlayId, true);
        }
        return c5716;
    }

    public static int obtainAndroidThemeOverlayId(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ANDROID_THEME_OVERLAY_ATTRS);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    public static int obtainMaterialThemeOverlayId(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, MATERIAL_THEME_OVERLAY_ATTR, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }
}
