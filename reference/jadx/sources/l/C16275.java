package l;

import android.view.View;

/* JADX INFO: renamed from: l.ܶᩳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: L4L2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16275 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m38609(C15529 c15529, AbstractC9016 abstractC9016, View view, View view2, AbstractC21169 abstractC21169, boolean z, boolean z2) {
        int iMax;
        if (abstractC21169.getChildCount() == 0 || c15529.m37184() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMin = Math.min(abstractC21169.getPosition(view), abstractC21169.getPosition(view2));
        int iMax2 = Math.max(abstractC21169.getPosition(view), abstractC21169.getPosition(view2));
        if (z2) {
            iMax = Math.max(0, (c15529.m37184() - iMax2) - 1);
        } else {
            iMax = Math.max(0, iMin);
        }
        if (!z) {
            return iMax;
        }
        return Math.round((iMax * (Math.abs(abstractC9016.mo3268(view2) - abstractC9016.mo3280(view)) / (Math.abs(abstractC21169.getPosition(view) - abstractC21169.getPosition(view2)) + 1))) + (abstractC9016.mo3273() - abstractC9016.mo3280(view)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m38608(C15529 c15529, AbstractC9016 abstractC9016, View view, View view2, AbstractC21169 abstractC21169, boolean z) {
        if (abstractC21169.getChildCount() == 0 || c15529.m37184() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(abstractC21169.getPosition(view) - abstractC21169.getPosition(view2)) + 1;
        }
        return Math.min(abstractC9016.mo3272(), abstractC9016.mo3268(view2) - abstractC9016.mo3280(view));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m38610(C15529 c15529, AbstractC9016 abstractC9016, View view, View view2, AbstractC21169 abstractC21169, boolean z) {
        if (abstractC21169.getChildCount() == 0 || c15529.m37184() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return c15529.m37184();
        }
        return (int) (((abstractC9016.mo3268(view2) - abstractC9016.mo3280(view)) / (Math.abs(abstractC21169.getPosition(view) - abstractC21169.getPosition(view2)) + 1)) * c15529.m37184());
    }
}
