package l;

/* JADX INFO: renamed from: l.ܶۘۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1SF */
/* JADX INFO: loaded from: classes4.dex */
public final class C14981 extends AbstractC2279 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC21330 f48889;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C22742[] f48890;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14981(AbstractC21330 abstractC21330, int i) {
        super(i, 0);
        this.f48889 = abstractC21330;
        int i2 = 0;
        this.f48890 = new C22742[1 << i];
        while (true) {
            C22742[] c22742Arr = this.f48890;
            if (i2 >= c22742Arr.length) {
                return;
            }
            c22742Arr[i2] = new C22742(this);
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m35958() {
        int i = 0;
        while (true) {
            C22742[] c22742Arr = this.f48890;
            if (i >= c22742Arr.length) {
                return;
            }
            AbstractC12807.m31803(c22742Arr[i].f38554);
            i++;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m35959() {
        this.f48890[0].m50407();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35957() {
        AbstractC21330 abstractC21330 = this.f48889;
        AbstractC9606 abstractC9606 = abstractC21330.f69430;
        this.f48890[m6988(abstractC9606.m24486(abstractC21330.f69424 + 1), abstractC9606.m24493() - abstractC21330.f69424)].m50407();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m35956(int i, int i2, int i3, int i4, C19214 c19214) {
        AbstractC21330 abstractC21330 = this.f48889;
        int iM46486 = 0;
        int iM46487 = C20625.m46486(abstractC21330.f17778[c19214.m44132()][abstractC21330.f17782 & i4], 0);
        int iM6988 = m6988(i3, i4);
        boolean zM44136 = c19214.m44136();
        int i5 = 256;
        C22742[] c22742Arr = this.f48890;
        if (zM44136) {
            C22742 c22742 = c22742Arr[iM6988];
            int i6 = i | 256;
            do {
                iM46486 += C20625.m46486(c22742.f38554[i6 >>> 8], (i6 >>> 7) & 1);
                i6 <<= 1;
            } while (i6 < 65536);
        } else {
            C22742 c22743 = c22742Arr[iM6988];
            int i7 = i | 256;
            do {
                i2 <<= 1;
                iM46486 += C20625.m46486(c22743.f38554[(i2 & i5) + i5 + (i7 >>> 8)], (i7 >>> 7) & 1);
                i7 <<= 1;
                i5 &= ~(i2 ^ i7);
            } while (i7 < 65536);
        }
        return iM46487 + iM46486;
    }
}
