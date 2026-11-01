package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩷ۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Z9MW */
/* JADX INFO: loaded from: classes5.dex */
public final class C20803 implements InterfaceC22920 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f67630;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f67631 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f67632;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15865 f67633;

    public C20803(C15865 c15865, C9474 c9474) {
        this.f67633 = c15865;
        this.f67632 = c9474.m24283();
    }

    @Override // l.InterfaceC22920
    /* JADX INFO: renamed from: ۙ */
    public final void mo1828(int i) {
        long j = this.f67631 + ((long) i);
        this.f67631 = j;
        long j2 = this.f67632;
        if (j2 > 0) {
            this.f67633.f51338.m45594(j, j2);
        }
    }

    @Override // l.InterfaceC22920
    /* JADX INFO: renamed from: ܰ */
    public final void mo1829(int i) {
        boolean z = this.f67630;
        C15865 c15865 = this.f67633;
        if (!z) {
            this.f67630 = true;
            c15865.f51338.m45586(R.string.MT_Protector);
        }
        c15865.f51338.m45591(i);
    }

    @Override // l.InterfaceC22920
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo1827() {
        return this.f67633.f51338.m5824();
    }
}
