package l;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ۖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: R9NW */
/* JADX INFO: loaded from: classes3.dex */
public final class C2528 extends C10688 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final PathInterpolator f8074 = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C5603 f8075 = new C5603();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final DecelerateInterpolator f8076 = new DecelerateInterpolator();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f8077 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Interpolator m8432(int i, C3977 c3977, C3977 c3978) {
        if ((i & 8) != 0) {
            if (c3977.m12817(8).f42405 > c3978.m12817(8).f42405) {
                return f8074;
            }
            return f8075;
        }
        return f8076;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static WindowInsets m8431(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.MT_Protector) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8436(View view, C22623 c22623, WindowInsets windowInsets, boolean z) {
        AbstractC7749 abstractC7749M8433 = m8433(view);
        if (abstractC7749M8433 != null) {
            abstractC7749M8433.mDispachedInsets = windowInsets;
            if (!z) {
                abstractC7749M8433.onPrepare(c22623);
                z = abstractC7749M8433.getDispatchMode() == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m8436(viewGroup.getChildAt(i), c22623, windowInsets, z);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8437(View view, C22623 c22623, C0291 c0291) {
        AbstractC7749 abstractC7749M8433 = m8433(view);
        if (abstractC7749M8433 != null) {
            abstractC7749M8433.onStart(c22623, c0291);
            if (abstractC7749M8433.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m8437(viewGroup.getChildAt(i), c22623, c0291);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8434(View view, C3977 c3977, List list) {
        AbstractC7749 abstractC7749M8433 = m8433(view);
        if (abstractC7749M8433 != null) {
            c3977 = abstractC7749M8433.onProgress(c3977, list);
            if (abstractC7749M8433.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m8434(viewGroup.getChildAt(i), c3977, list);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8435(View view, C22623 c22623) {
        AbstractC7749 abstractC7749M8433 = m8433(view);
        if (abstractC7749M8433 != null) {
            abstractC7749M8433.onEnd(c22623);
            if (abstractC7749M8433.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m8435(viewGroup.getChildAt(i), c22623);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC7749 m8433(View view) {
        Object tag = view.getTag(R.id.MT_Protector);
        if (tag instanceof ViewOnApplyWindowInsetsListenerC9239) {
            return ((ViewOnApplyWindowInsetsListenerC9239) tag).f30086;
        }
        return null;
    }
}
