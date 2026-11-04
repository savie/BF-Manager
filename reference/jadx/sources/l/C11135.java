package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۤ᩷۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5PI */
/* JADX INFO: loaded from: classes4.dex */
public final class C11135 implements InterfaceC15610 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f35100 = true;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23070 f35101;

    public C11135(C23070 c23070) {
        this.f35101 = c23070;
    }

    @Override // l.InterfaceC15610
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1659(int i) {
        C23070 c23070 = this.f35101;
        if (i == -1) {
            c23070.f74842.m27391(R.string.MT_Protector);
            return;
        }
        if (this.f35100) {
            c23070.f74842.m27391(R.string.MT_Protector);
            this.f35100 = false;
        }
        c23070.f74842.m27403(i);
    }

    @Override // l.InterfaceC7509
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo924() {
        return this.f35101.f74842.m27399();
    }
}
