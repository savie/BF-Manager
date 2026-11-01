package l;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import bin.mt.plugin.api.PluginContext;
import java.io.File;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5HE */
/* JADX INFO: loaded from: classes.dex */
public final class C1977 {

    /* JADX INFO: renamed from: ۬֨᩸, reason: not valid java name and contains not printable characters */
    public static int f7413;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Context f7414;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final TypedArray f7415;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public TypedValue f7416;

    /* JADX INFO: renamed from: ۖ۬۠, reason: not valid java name and contains not printable characters */
    public static void m6349(Object obj, Object obj2) {
        ((C8067) obj).m21258((View) obj2);
    }

    /* JADX INFO: renamed from: ۗ۟᩹, reason: not valid java name and contains not printable characters */
    public static Iterator m6350(Object obj) {
        return ((AbstractC18494) obj).iterator();
    }

    /* JADX INFO: renamed from: ۛ۬ܽ, reason: not valid java name and contains not printable characters */
    public static int m6354(Object obj) {
        return ((View) obj).getId();
    }

    /* JADX INFO: renamed from: ۜ۟ۡ, reason: not valid java name and contains not printable characters */
    public static ObjectAnimator m6355(Object obj, long j) {
        return ((ObjectAnimator) obj).setDuration(j);
    }

    /* JADX INFO: renamed from: ۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static boolean m6356() {
        return false;
    }

    /* JADX INFO: renamed from: ۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m6357(Object obj) {
        C0577.m2746((String) obj);
    }

    /* JADX INFO: renamed from: ۧ֫ۤ, reason: not valid java name and contains not printable characters */
    public static void m6358(Object obj, int i) {
        ((InterfaceC16662) obj).writeByte(i);
    }

    /* JADX INFO: renamed from: ۫᩶ۜ, reason: not valid java name and contains not printable characters */
    public static Intent m6359(Object obj, int i) {
        return ((Intent) obj).addFlags(i);
    }

    /* JADX INFO: renamed from: ܶ᩷᩺, reason: not valid java name and contains not printable characters */
    public static int m6360(Object obj) {
        return ((String) obj).length();
    }

    /* JADX INFO: renamed from: ᩳۛᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m6361(Object obj) {
        return ((View) obj).requestFocus();
    }

    /* JADX INFO: renamed from: ᩳܺ᩻, reason: not valid java name and contains not printable characters */
    public static char m6362(Object obj, int i) {
        return ((String) obj).charAt(i);
    }

    /* JADX INFO: renamed from: ᩵ۡ᩻, reason: not valid java name and contains not printable characters */
    public static String m6363(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩷ܽ᩵, reason: not valid java name and contains not printable characters */
    public static boolean m6364(Object obj) {
        return ((File) obj).exists();
    }

    /* JADX INFO: renamed from: ᩷ᩴ֫, reason: not valid java name and contains not printable characters */
    public static void m6365(Object obj) {
        ((Runnable) obj).run();
    }

    /* JADX INFO: renamed from: ᩹ᩳᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m6366() {
        return C1709.m5693();
    }

    /* JADX INFO: renamed from: ᩺֨۟, reason: not valid java name and contains not printable characters */
    public static String m6367(Object obj, Object obj2) {
        return ((PluginContext) obj).getStringNullable((String) obj2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1977 m6352(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C1977(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1977 m6353(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C1977(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1977 m6351(Context context, int i, int[] iArr) {
        return new C1977(context, context.obtainStyledAttributes(i, iArr));
    }

    public C1977(Context context, TypedArray typedArray) {
        this.f7414 = context;
        this.f7415 = typedArray;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final TypedArray m6382() {
        return this.f7415;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Drawable m6370(int i) {
        int resourceId;
        TypedArray typedArray = this.f7415;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0) {
            return C15945.m37904(this.f7414, resourceId);
        }
        return typedArray.getDrawable(i);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Drawable m6378(int i) {
        int resourceId;
        TypedArray typedArray = this.f7415;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C23521.m51803().m51807(this.f7414, resourceId);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Typeface m6375(int i, int i2, AbstractC20864 abstractC20864) {
        int resourceId = this.f7415.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f7416 == null) {
            this.f7416 = new TypedValue();
        }
        return C16631.m39097(this.f7414, resourceId, this.f7416, i2, abstractC20864);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final CharSequence m6368(int i) {
        return this.f7415.getText(i);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m6388(int i) {
        return this.f7415.getString(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m6376(int i, boolean z) {
        return this.f7415.getBoolean(i, z);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m6381(int i, int i2) {
        return this.f7415.getInt(i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m6372() {
        return this.f7415.getFloat(4, -1.0f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m6373(int i) {
        return this.f7415.getColor(i, 0);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ColorStateList m6385(int i) {
        int resourceId;
        ColorStateList colorStateListM26305;
        TypedArray typedArray = this.f7415;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM26305 = C10405.m26305(this.f7414, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListM26305;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m6369(int i, int i2) {
        return this.f7415.getInteger(i, i2);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final float m6380(int i) {
        return this.f7415.getDimension(i, -1.0f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m6374(int i, int i2) {
        return this.f7415.getDimensionPixelOffset(i, i2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m6384(int i, int i2) {
        return this.f7415.getDimensionPixelSize(i, i2);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m6377(int i, int i2) {
        return this.f7415.getLayoutDimension(i, i2);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m6387(int i, int i2) {
        return this.f7415.getResourceId(i, i2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final CharSequence[] m6386() {
        return this.f7415.getTextArray(0);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m6383(int i) {
        return this.f7415.hasValue(i);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final TypedValue m6371() {
        return this.f7415.peekValue(19);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m6379() {
        this.f7415.recycle();
    }
}
