package l;

import java.math.RoundingMode;

/* JADX INFO: renamed from: l.ܿۡܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78HC */
/* JADX INFO: loaded from: classes4.dex */
public final class C17246 implements InterfaceC6599 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f54946;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f54947;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C0312 f54948;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f54949;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f54950;

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo5382() {
        return true;
    }

    public C17246(C0312 c0312, int i, long j, long j2) {
        this.f54948 = c0312;
        this.f54946 = i;
        this.f54949 = j;
        long j3 = (j2 - j) / ((long) c0312.f1679);
        this.f54947 = j3;
        this.f54950 = m40207(j3);
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۬ */
    public final long mo5383() {
        return this.f54950;
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۙ */
    public final C12950 mo5381(long j) {
        C0312 c0312 = this.f54948;
        long j2 = (((long) c0312.f1677) * j) / (((long) this.f54946) * 1000000);
        long j3 = this.f54947;
        long jM41829 = C17983.m41829(j2, 0L, j3 - 1);
        long j4 = ((long) c0312.f1679) * jM41829;
        long j5 = this.f54949;
        long jM40207 = m40207(jM41829);
        C22828 c22828 = new C22828(jM40207, j4 + j5);
        if (jM40207 < j && jM41829 != j3 - 1) {
            long j6 = jM41829 + 1;
            return new C12950(c22828, new C22828(m40207(j6), (((long) c0312.f1679) * j6) + j5));
        }
        return new C12950(c22828, c22828);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private long m40207(long j) {
        long j2 = j * ((long) this.f54946);
        long j3 = this.f54948.f1677;
        String str = C17983.f57504;
        return C17983.m41830(j2, 1000000L, j3, RoundingMode.DOWN);
    }
}
