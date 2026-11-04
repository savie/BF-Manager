package l;

import android.util.Pair;
import org.bouncycastle.math.ec.custom.sec.SecP160R1Field;

/* JADX INFO: renamed from: l.֡ܺ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: I8NX */
/* JADX INFO: loaded from: classes3.dex */
public final class C0548 implements InterfaceC10242 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f2278;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long[] f2279;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long[] f2280;

    @Override // l.InterfaceC10242
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int mo2547() {
        return SecP160R1Field.PInv;
    }

    @Override // l.InterfaceC9060
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo2298() {
        return true;
    }

    @Override // l.InterfaceC10242
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long mo2548() {
        return 0L;
    }

    @Override // l.InterfaceC10242
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long mo2550() {
        return -1L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0548 m2546(long j, C9738 c9738, long j2) {
        int[] iArr = c9738.f31413;
        int length = iArr.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += (long) (c9738.f31416 + iArr[i3]);
            j3 += (long) (c9738.f31417 + c9738.f31415[i3]);
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new C0548(j2, jArr, jArr2);
    }

    public C0548(long j, long[] jArr, long[] jArr2) {
        this.f2280 = jArr;
        this.f2279 = jArr2;
        this.f2278 = j == -9223372036854775807L ? C7116.m19474(jArr2[jArr2.length - 1]) : j;
    }

    @Override // l.InterfaceC9060
    /* JADX INFO: renamed from: ۙ */
    public final C9805 mo2290(long j) {
        Pair pairM2545 = m2545(C7116.m19506(C7116.m19476(j, 0L, this.f2278)), this.f2279, this.f2280);
        C2349 c2349 = new C2349(C7116.m19474(((Long) pairM2545.first).longValue()), ((Long) pairM2545.second).longValue());
        return new C9805(c2349, c2349);
    }

    @Override // l.InterfaceC10242
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long mo2549(long j) {
        return C7116.m19474(((Long) m2545(j, this.f2280, this.f2279).second).longValue());
    }

    @Override // l.InterfaceC9060
    /* JADX INFO: renamed from: ۚ */
    public final long mo2295() {
        return this.f2278;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Pair m2545(long j, long[] jArr, long[] jArr2) {
        int iM19505 = C7116.m19505(jArr, j, true);
        long j2 = jArr[iM19505];
        long j3 = jArr2[iM19505];
        int i = iM19505 + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (j - j2) / (j4 - j2)) * (jArr2[i] - j3))) + j3));
    }
}
