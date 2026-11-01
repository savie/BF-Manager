package l;

import android.view.View;

/* JADX INFO: renamed from: l.᩻ܿܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: L4L2 */
/* JADX INFO: loaded from: classes.dex */
public final class C23843 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m52563(C16082 c16082, AbstractC21581 abstractC21581, View view, View view2, AbstractC5498 abstractC5498, boolean z, boolean z2) {
        int iMax;
        if (abstractC5498.getChildCount() == 0 || c16082.m38108() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMin = Math.min(abstractC5498.getPosition(view), abstractC5498.getPosition(view2));
        int iMax2 = Math.max(abstractC5498.getPosition(view), abstractC5498.getPosition(view2));
        if (z2) {
            iMax = Math.max(0, (c16082.m38108() - iMax2) - 1);
        } else {
            iMax = Math.max(0, iMin);
        }
        if (!z) {
            return iMax;
        }
        return Math.round((iMax * (Math.abs(abstractC21581.mo36475(view2) - abstractC21581.mo36473(view)) / (Math.abs(abstractC5498.getPosition(view) - abstractC5498.getPosition(view2)) + 1))) + (abstractC21581.mo36483() - abstractC21581.mo36473(view)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m52562(C16082 c16082, AbstractC21581 abstractC21581, View view, View view2, AbstractC5498 abstractC5498, boolean z) {
        if (abstractC5498.getChildCount() == 0 || c16082.m38108() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(abstractC5498.getPosition(view) - abstractC5498.getPosition(view2)) + 1;
        }
        return Math.min(abstractC21581.mo36471(), abstractC21581.mo36475(view2) - abstractC21581.mo36473(view));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m52564(C16082 c16082, AbstractC21581 abstractC21581, View view, View view2, AbstractC5498 abstractC5498, boolean z) {
        if (abstractC5498.getChildCount() == 0 || c16082.m38108() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return c16082.m38108();
        }
        return (int) (((abstractC21581.mo36475(view2) - abstractC21581.mo36473(view)) / (Math.abs(abstractC5498.getPosition(view) - abstractC5498.getPosition(view2)) + 1)) * c16082.m38108());
    }
}
