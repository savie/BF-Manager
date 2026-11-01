package l;

import android.R;

/* JADX INFO: renamed from: l.֨ۗܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1OQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0850 extends AbstractC3154 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21312 f3495;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8601 f3496 = new C2261(this);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8601 f3494 = new C5084(this);

    public C0850(C21312 c21312) {
        this.f3495 = c21312;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3462() {
        int itemCount;
        int i = R.id.accessibilityActionPageLeft;
        C21312 c21312 = this.f3495;
        C5031.m13973(R.id.accessibilityActionPageLeft, c21312);
        C5031.m13973(R.id.accessibilityActionPageRight, c21312);
        C5031.m13973(R.id.accessibilityActionPageUp, c21312);
        C5031.m13973(R.id.accessibilityActionPageDown, c21312);
        if (c21312.f69345.getAdapter() == null || (itemCount = c21312.f69345.getAdapter().getItemCount()) == 0 || !c21312.m47805()) {
            return;
        }
        int iM47796 = c21312.m47796();
        InterfaceC8601 interfaceC8601 = this.f3494;
        InterfaceC8601 interfaceC8602 = this.f3496;
        if (iM47796 == 0) {
            boolean z = c21312.f69353.getLayoutDirection() == 1;
            int i2 = z ? R.id.accessibilityActionPageLeft : R.id.accessibilityActionPageRight;
            if (z) {
                i = R.id.accessibilityActionPageRight;
            }
            if (c21312.f69354 < itemCount - 1) {
                C5031.m13988(c21312, new C9494(i2, (String) null), null, interfaceC8602);
            }
            if (c21312.f69354 > 0) {
                C5031.m13988(c21312, new C9494(i, (String) null), null, interfaceC8601);
                return;
            }
            return;
        }
        if (c21312.f69354 < itemCount - 1) {
            C5031.m13988(c21312, new C9494(R.id.accessibilityActionPageDown, (String) null), null, interfaceC8602);
        }
        if (c21312.f69354 > 0) {
            C5031.m13988(c21312, new C9494(R.id.accessibilityActionPageUp, (String) null), null, interfaceC8601);
        }
    }
}
