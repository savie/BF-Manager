package com.google.android.material.drawable;

import android.graphics.drawable.Drawable;
import l.C19122;

/* JADX INFO: loaded from: classes.dex */
public class ScaledDrawableWrapper extends C19122 {
    public final int height;
    public final int width;

    public ScaledDrawableWrapper(Drawable drawable, int i, int i2) {
        super(drawable);
        this.width = i;
        this.height = i2;
    }

    @Override // l.C19122, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.width;
    }

    @Override // l.C19122, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.height;
    }
}
