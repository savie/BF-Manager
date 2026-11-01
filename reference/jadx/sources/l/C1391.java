package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.֨᩸ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBFX */
/* JADX INFO: loaded from: classes2.dex */
public final class C1391 implements InterfaceC5520 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public BitSet f5791;

    @Override // l.InterfaceC5520
    /* JADX INFO: renamed from: ۙ */
    public final void mo4612(C6330 c6330) {
        if (c6330.mo17422()) {
            return;
        }
        this.f5791.set(c6330.m49955().m38400());
    }

    @Override // l.InterfaceC5520
    /* JADX INFO: renamed from: ۙ */
    public final void mo4613(C9859 c9859) {
        if (c9859.mo17422()) {
            return;
        }
        this.f5791.set(c9859.m49955().m38400());
    }

    @Override // l.InterfaceC5520
    /* JADX INFO: renamed from: ܰ */
    public final void mo4614(C6330 c6330) {
        C16251 c16251M49955 = c6330.m49955();
        if (c6330.mo17422() || c16251M49955 == null) {
            return;
        }
        this.f5791.set(c16251M49955.m38400());
    }
}
