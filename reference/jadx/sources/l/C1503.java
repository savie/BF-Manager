package l;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: R9NW */
/* JADX INFO: loaded from: classes2.dex */
public final class C1503 extends C2436 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f6076 = 0;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final PathInterpolator f6077 = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C6590 f6075 = new C6590();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final DecelerateInterpolator f6078 = new DecelerateInterpolator();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Interpolator m5190(int i, C15844 c15844, C15844 c15845) {
        if ((i & 8) != 0) {
            if (c15844.m37673(8).f45913 > c15845.m37673(8).f45913) {
                return f6077;
            }
            return f6075;
        }
        return f6078;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static WindowInsets m5189(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.MT_Protector) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5193(View view, C5259 c5259, WindowInsets windowInsets, boolean z) {
        AbstractC17026 abstractC17026M5191 = m5191(view);
        if (abstractC17026M5191 != null) {
            abstractC17026M5191.mDispachedInsets = windowInsets;
            if (!z) {
                abstractC17026M5191.onPrepare(c5259);
                z = abstractC17026M5191.getDispatchMode() == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m5193(viewGroup.getChildAt(i), c5259, windowInsets, z);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5194(View view, C5259 c5259, C12088 c12088) {
        AbstractC17026 abstractC17026M5191 = m5191(view);
        if (abstractC17026M5191 != null) {
            abstractC17026M5191.onStart(c5259, c12088);
            if (abstractC17026M5191.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m5194(viewGroup.getChildAt(i), c5259, c12088);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5195(View view, C15844 c15844, List list) {
        AbstractC17026 abstractC17026M5191 = m5191(view);
        if (abstractC17026M5191 != null) {
            c15844 = abstractC17026M5191.onProgress(c15844, list);
            if (abstractC17026M5191.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m5195(viewGroup.getChildAt(i), c15844, list);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5192(View view, C5259 c5259) {
        AbstractC17026 abstractC17026M5191 = m5191(view);
        if (abstractC17026M5191 != null) {
            abstractC17026M5191.onEnd(c5259);
            if (abstractC17026M5191.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m5192(viewGroup.getChildAt(i), c5259);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC17026 m5191(View view) {
        Object tag = view.getTag(R.id.MT_Protector);
        if (tag instanceof ViewOnApplyWindowInsetsListenerC14205) {
            return ((ViewOnApplyWindowInsetsListenerC14205) tag).f46589;
        }
        return null;
    }
}
