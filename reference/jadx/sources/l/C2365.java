package l;

/* JADX INFO: renamed from: l.ۖۜܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: F8IP */
/* JADX INFO: loaded from: classes2.dex */
public final class C2365 implements InterfaceC6599 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f8357;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C16532 f8358;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C16532 f8359;

    public C2365(long j, long[] jArr, long[] jArr2) {
        C2023.m6507(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length > 0 && jArr2[0] > 0) {
            int i = length + 1;
            C16532 c16532 = new C16532(i);
            this.f8359 = c16532;
            C16532 c16533 = new C16532(i);
            this.f8358 = c16533;
            c16532.m38907(0L);
            c16533.m38907(0L);
        } else {
            this.f8359 = new C16532(length);
            this.f8358 = new C16532(length);
        }
        this.f8359.m38908(jArr);
        this.f8358.m38908(jArr2);
        this.f8357 = j;
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo5382() {
        return this.f8358.m38905() > 0;
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۬ */
    public final long mo5383() {
        return this.f8357;
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۙ */
    public final C12950 mo5381(long j) {
        C16532 c16532 = this.f8358;
        if (c16532.m38905() != 0) {
            int iM41823 = C17983.m41823(c16532, j);
            long jM38906 = c16532.m38906(iM41823);
            C16532 c16533 = this.f8359;
            C22828 c22828 = new C22828(jM38906, c16533.m38906(iM41823));
            if (jM38906 == j || iM41823 == c16532.m38905() - 1) {
                return new C12950(c22828, c22828);
            }
            int i = iM41823 + 1;
            return new C12950(c22828, new C22828(c16532.m38906(i), c16533.m38906(i)));
        }
        C22828 c22829 = C22828.f74276;
        return new C12950(c22829, c22829);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7187(long j, long j2) {
        C16532 c16532 = this.f8358;
        int iM38905 = c16532.m38905();
        C16532 c16533 = this.f8359;
        if (iM38905 == 0 && j > 0) {
            c16533.m38907(0L);
            c16532.m38907(0L);
        }
        c16533.m38907(j2);
        c16532.m38907(j);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m7189(long j) {
        C16532 c16532 = this.f8358;
        if (c16532.m38905() == 0) {
            return -9223372036854775807L;
        }
        return c16532.m38906(C17983.m41823(this.f8359, j));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m7188(long j) {
        C16532 c16532 = this.f8358;
        return c16532.m38905() != 0 && j - c16532.m38906(c16532.m38905() - 1) < 100000;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m7186(long j) {
        this.f8357 = j;
    }
}
