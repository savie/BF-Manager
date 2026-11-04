package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* JADX INFO: renamed from: l.ۙ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: O5HE */
/* JADX INFO: loaded from: classes2.dex */
public final class C5204 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Context f18360;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final TypedArray f18361;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public TypedValue f18362;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5204 m15648(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C5204(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5204 m15649(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C5204(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5204 m15647(Context context, int i, int[] iArr) {
        return new C5204(context, context.obtainStyledAttributes(i, iArr));
    }

    public C5204(Context context, TypedArray typedArray) {
        this.f18360 = context;
        this.f18361 = typedArray;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final TypedArray m15658() {
        return this.f18361;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Drawable m15669(int i) {
        int resourceId;
        TypedArray typedArray = this.f18361;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0) {
            return C0385.m2186(this.f18360, resourceId);
        }
        return typedArray.getDrawable(i);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Drawable m15663(int i) {
        int resourceId;
        TypedArray typedArray = this.f18361;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C8581.m23071().m23075(this.f18360, resourceId);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Typeface m15653(int i, int i2, AbstractC7727 abstractC7727) {
        int resourceId = this.f18361.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f18362 == null) {
            this.f18362 = new TypedValue();
        }
        return C9217.m24388(this.f18360, resourceId, this.f18362, i2, abstractC7727);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final CharSequence m15659(int i) {
        return this.f18361.getText(i);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m15661(int i) {
        return this.f18361.getString(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m15654(int i, boolean z) {
        return this.f18361.getBoolean(i, z);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m15657(int i, int i2) {
        return this.f18361.getInt(i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m15650() {
        return this.f18361.getFloat(4, -1.0f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m15651(int i) {
        return this.f18361.getColor(i, 0);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ColorStateList m15666(int i) {
        int resourceId;
        ColorStateList colorStateListM20564;
        TypedArray typedArray = this.f18361;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM20564 = C7508.m20564(this.f18360, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListM20564;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m15668(int i, int i2) {
        return this.f18361.getInteger(i, i2);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final float m15656(int i) {
        return this.f18361.getDimension(i, -1.0f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m15652(int i, int i2) {
        return this.f18361.getDimensionPixelOffset(i, i2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m15665(int i, int i2) {
        return this.f18361.getDimensionPixelSize(i, i2);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m15662(int i, int i2) {
        return this.f18361.getLayoutDimension(i, i2);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m15660(int i, int i2) {
        return this.f18361.getResourceId(i, i2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final CharSequence[] m15667() {
        return this.f18361.getTextArray(0);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m15655(int i) {
        return this.f18361.hasValue(i);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final TypedValue m15670() {
        return this.f18361.peekValue(19);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m15664() {
        this.f18361.recycle();
    }
}
