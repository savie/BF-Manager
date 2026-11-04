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

/* JADX INFO: renamed from: l.ۡܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5IM */
/* JADX INFO: loaded from: classes3.dex */
public final class C9457 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f30659 = new ThreadLocal();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final int[] f30662 = {-16842910};

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final int[] f30663 = {R.attr.state_focused};

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final int[] f30661 = {R.attr.state_pressed};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int[] f30657 = {R.attr.state_checked};

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final int[] f30658 = new int[0];

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final int[] f30660 = new int[1];

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m24833(Context context, int i) {
        int[] iArr = f30660;
        iArr[0] = i;
        C5204 c5204M15648 = C5204.m15648(context, (AttributeSet) null, iArr);
        try {
            return c5204M15648.m15651(0);
        } finally {
            c5204M15648.m15664();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m24832(Context context, int i) {
        int[] iArr = f30660;
        iArr[0] = i;
        C5204 c5204M15648 = C5204.m15648(context, (AttributeSet) null, iArr);
        try {
            return c5204M15648.m15666(0);
        } finally {
            c5204M15648.m15664();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m24830(Context context, int i) {
        ColorStateList colorStateListM24832 = m24832(context, i);
        if (colorStateListM24832 != null && colorStateListM24832.isStateful()) {
            return colorStateListM24832.getColorForState(f30662, colorStateListM24832.getDefaultColor());
        }
        ThreadLocal threadLocal = f30659;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f = typedValue.getFloat();
        int iM24833 = m24833(context, i);
        return C19988.m45964(iM24833, Math.round(Color.alpha(iM24833) * f));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24831(Context context, View view) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C10401.f33085);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION)) {
                view.getClass().toString();
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
