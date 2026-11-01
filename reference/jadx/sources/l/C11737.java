package l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.ۨܰۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 83VO */
/* JADX INFO: loaded from: classes4.dex */
public final class C11737 extends C3660 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC2563 f39462;

    public C11737(AbstractC2563 abstractC2563) {
        this.f39462 = abstractC2563;
    }

    @Override // l.C3660
    /* JADX INFO: renamed from: ۙ */
    public final C22006 mo10793(int i) {
        return C22006.m48821(this.f39462.obtainAccessibilityNodeInfo(i));
    }

    @Override // l.C3660
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo10794(int i, int i2, Bundle bundle) {
        return this.f39462.performAction(i, i2, bundle);
    }

    @Override // l.C3660
    /* JADX INFO: renamed from: ܰ */
    public final C22006 mo10795(int i) {
        AbstractC2563 abstractC2563 = this.f39462;
        int i2 = i == 2 ? abstractC2563.mAccessibilityFocusedVirtualViewId : abstractC2563.mKeyboardFocusedVirtualViewId;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return mo10793(i2);
    }
}
