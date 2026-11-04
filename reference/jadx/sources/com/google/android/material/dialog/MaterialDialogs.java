package com.google.android.material.dialog;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import com.google.android.material.internal.ThemeEnforcement;
import l.C14625;
import l.C17609;

/* JADX INFO: loaded from: classes.dex */
public class MaterialDialogs {
    public static InsetDrawable insetDrawable(Drawable drawable, Rect rect) {
        return new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom);
    }

    public static Rect getDialogBackgroundInsets(Context context, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, null, C14625.f47250, i, i2, new int[0]);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C14625.f47090, context.getResources().getDimensionPixelSize(C17609.f57565));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C14625.f47569, context.getResources().getDimensionPixelSize(C17609.f57330));
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C14625.f46346, context.getResources().getDimensionPixelSize(C17609.f57635));
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C14625.f47783, context.getResources().getDimensionPixelSize(C17609.f57777));
        typedArrayObtainStyledAttributes.recycle();
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = dimensionPixelSize3;
        }
        return new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
    }
}
