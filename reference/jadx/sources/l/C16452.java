package l;

/* JADX INFO: renamed from: l.ܽۛ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 3ANU */
/* JADX INFO: loaded from: classes5.dex */
public final class C16452 extends AbstractC1073 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C0223 f52903;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C13110 f52904;

    @Override // l.AbstractC1073
    /* JADX INFO: renamed from: ۙ */
    public final void mo4049(C2484 c2484) {
        C13110 c13110 = this.f52904;
        if (c13110.m32440() != null) {
            this.f52903.m1597(c2484);
            c13110.m32428();
        }
    }

    public C16452(C0223 c0223, C13110 c13110) {
        this.f52903 = c0223;
        this.f52904 = c13110;
    }

    @Override // l.InterfaceC13069
    /* JADX INFO: renamed from: ۙ */
    public final void mo7612(C5331 c5331) {
        this.f52903.m1597(c5331);
        this.f52904.m32428();
    }

    @Override // l.InterfaceC13069
    /* JADX INFO: renamed from: ܰ */
    public final C21203 mo7613(C5331 c5331) {
        AbstractC5868 abstractC5868 = this.f52903.f1403;
        if (this.f52904.m32439((InterfaceC15456) null) == null) {
            return null;
        }
        return C3936.f14652;
    }

    @Override // l.C4269
    public final String toString() {
        return "ReceiveHasNext@" + C13961.m33816(this);
    }
}
