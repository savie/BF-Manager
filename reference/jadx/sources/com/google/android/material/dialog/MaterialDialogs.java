package com.google.android.material.dialog;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import com.google.android.material.internal.ThemeEnforcement;
import l.C0976;
import l.C8033;

/* JADX INFO: loaded from: classes.dex */
public class MaterialDialogs {
    public static InsetDrawable insetDrawable(Drawable drawable, Rect rect) {
        return new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom);
    }

    public static Rect getDialogBackgroundInsets(Context context, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, null, C8033.f27451, i, i2, new int[0]);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C8033.f27504, context.getResources().getDimensionPixelSize(C0976.f3852));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C8033.f27822, context.getResources().getDimensionPixelSize(C0976.f4254));
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C8033.f27875, context.getResources().getDimensionPixelSize(C0976.f4561));
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C8033.f26866, context.getResources().getDimensionPixelSize(C0976.f3994));
        typedArrayObtainStyledAttributes.recycle();
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = dimensionPixelSize3;
        }
        return new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
    }
}
