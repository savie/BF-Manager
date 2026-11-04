package l;

import android.os.Build;

/* JADX INFO: renamed from: l.ܶܶۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WY */
/* JADX INFO: loaded from: classes5.dex */
public final class C16174 extends AbstractC12507 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C15600 f52506;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int[] f52507 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38403(int... iArr) {
        this.f52507 = iArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38402(C15600 c15600) {
        this.f52506 = c15600;
    }

    @Override // l.AbstractC12507
    /* JADX INFO: renamed from: ۙ */
    public final void mo31060(InterfaceC16982 interfaceC16982) {
        if (Build.VERSION.SDK_INT >= 34) {
            C16920.m39901(interfaceC16982.mo40047(), C16920.m39900(C17666.m41324(C16920.m39899(), null, 0, null, Boolean.FALSE), this.f52507, this.f52506));
        } else {
            C16920.m39901(interfaceC16982.mo40047(), C16920.m39900(C16920.m39899(), this.f52507, this.f52506));
        }
    }
}
