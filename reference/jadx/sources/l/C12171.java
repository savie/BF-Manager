package l;

/* JADX INFO: renamed from: l.ۨۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: IBF1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12171 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21122[] f39144;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C21122[] f39145;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C21122[] f39146;

    public C12171(C9757 c9757) {
        int iM37668 = c9757.m25432().m37668();
        this.f39145 = new C21122[iM37668];
        this.f39146 = new C21122[iM37668];
        this.f39144 = new C21122[iM37668];
        C14978 c14978M25432 = c9757.m25432();
        int size = c14978M25432.size();
        for (int i = 0; i < size; i++) {
            C22438 c22438M31620get = c14978M25432.m31620get(i);
            int iMo31292 = c22438M31620get.mo31292();
            this.f39145[iMo31292] = new C21122(c22438M31620get.m50596().m31617get(0).m40433(), false);
            C9012 c9012M40433 = c22438M31620get.m50594().m40433();
            this.f39146[iMo31292] = new C21122(c9012M40433, false);
            this.f39144[iMo31292] = new C21122(c9012M40433, false);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C21122 m30438(C22438 c22438) {
        return this.f39145[c22438.mo31292()];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21122 m30436(int i) {
        return this.f39145[i];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C21122 m30439(C22438 c22438) {
        return this.f39146[c22438.mo31292()];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21122 m30437(C22438 c22438) {
        return this.f39144[c22438.mo31292()];
    }
}
