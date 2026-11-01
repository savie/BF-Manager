package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۨܿ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5PI */
/* JADX INFO: loaded from: classes4.dex */
public final class C11855 implements InterfaceC22438 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f39774 = true;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2681 f39775;

    public C11855(C2681 c2681) {
        this.f39775 = c2681;
    }

    @Override // l.InterfaceC22438
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo29544(int i) {
        C2681 c2681 = this.f39775;
        if (i == -1) {
            c2681.f10360.m5830(R.string.MT_Protector);
            return;
        }
        if (this.f39774) {
            c2681.f10360.m5830(R.string.MT_Protector);
            this.f39774 = false;
        }
        c2681.f10360.m5840(i);
    }

    @Override // l.InterfaceC5614
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2357() {
        return this.f39775.f10360.m5824();
    }
}
