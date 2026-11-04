package l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.᩷᩷ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 83VO */
/* JADX INFO: loaded from: classes.dex */
public final class C22318 extends C5665 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC11129 f72244;

    public C22318(AbstractC11129 abstractC11129) {
        this.f72244 = abstractC11129;
    }

    @Override // l.C5665
    /* JADX INFO: renamed from: ۙ */
    public final C19835 mo16652(int i) {
        return C19835.m45620(this.f72244.obtainAccessibilityNodeInfo(i));
    }

    @Override // l.C5665
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo16653(int i, int i2, Bundle bundle) {
        return this.f72244.performAction(i, i2, bundle);
    }

    @Override // l.C5665
    /* JADX INFO: renamed from: ᩷ */
    public final C19835 mo16654(int i) {
        AbstractC11129 abstractC11129 = this.f72244;
        int i2 = i == 2 ? abstractC11129.mAccessibilityFocusedVirtualViewId : abstractC11129.mKeyboardFocusedVirtualViewId;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return mo16652(i2);
    }
}
