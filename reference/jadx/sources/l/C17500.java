package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.google.android.material.slider.BaseSlider;

/* JADX INFO: renamed from: l.ܿᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5IM */
/* JADX INFO: loaded from: classes4.dex */
public final class C17500 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f55656 = new ThreadLocal();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final int[] f55661 = {-16842910};

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final int[] f55657 = {R.attr.state_focused};

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final int[] f55659 = {R.attr.state_pressed};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int[] f55658 = {R.attr.state_checked};

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final int[] f55660 = new int[0];

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final int[] f55662 = new int[1];

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m40764(Context context, int i) {
        int[] iArr = f55662;
        iArr[0] = i;
        C1977 c1977M6352 = C1977.m6352(context, (AttributeSet) null, iArr);
        try {
            return c1977M6352.m6373(0);
        } finally {
            c1977M6352.m6379();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m40763(Context context, int i) {
        int[] iArr = f55662;
        iArr[0] = i;
        C1977 c1977M6352 = C1977.m6352(context, (AttributeSet) null, iArr);
        try {
            return c1977M6352.m6385(0);
        } finally {
            c1977M6352.m6379();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m40761(Context context, int i) {
        ColorStateList colorStateListM40763 = m40763(context, i);
        if (colorStateListM40763 != null && colorStateListM40763.isStateful()) {
            return colorStateListM40763.getColorForState(f55661, colorStateListM40763.getDefaultColor());
        }
        ThreadLocal threadLocal = f55656;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f = typedValue.getFloat();
        int iM40764 = m40764(context, i);
        return C3224.m9668(iM40764, Math.round(Color.alpha(iM40764) * f));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40762(Context context, View view) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C12108.f40539);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION)) {
                view.getClass().toString();
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
