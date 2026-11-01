package l;

import android.util.Pair;
import org.bouncycastle.math.ec.custom.sec.SecP160R1Field;

/* JADX INFO: renamed from: l.ۖ᩸ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: I8NX */
/* JADX INFO: loaded from: classes3.dex */
public final class C2801 implements InterfaceC1390 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f10657;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long[] f10658;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long[] f10659;

    @Override // l.InterfaceC1390
    /* JADX INFO: renamed from: ֨ */
    public final int mo4875() {
        return SecP160R1Field.PInv;
    }

    @Override // l.InterfaceC1390
    /* JADX INFO: renamed from: ۖ */
    public final long mo4876() {
        return -1L;
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo5382() {
        return true;
    }

    @Override // l.InterfaceC1390
    /* JADX INFO: renamed from: ܰ */
    public final long mo4877() {
        return 0L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2801 m8511(long j, C4024 c4024, long j2) {
        int[] iArr = c4024.f14884;
        int length = iArr.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += (long) (c4024.f14885 + iArr[i3]);
            j3 += (long) (c4024.f14882 + c4024.f14883[i3]);
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new C2801(j2, jArr, jArr2);
    }

    public C2801(long j, long[] jArr, long[] jArr2) {
        this.f10659 = jArr;
        this.f10658 = jArr2;
        this.f10657 = j == -9223372036854775807L ? C17983.m41827(jArr2[jArr2.length - 1]) : j;
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۙ */
    public final C12950 mo5381(long j) {
        Pair pairM8510 = m8510(C17983.m41856(C17983.m41829(j, 0L, this.f10657)), this.f10658, this.f10659);
        C22828 c22828 = new C22828(C17983.m41827(((Long) pairM8510.first).longValue()), ((Long) pairM8510.second).longValue());
        return new C12950(c22828, c22828);
    }

    @Override // l.InterfaceC1390
    /* JADX INFO: renamed from: ܰ */
    public final long mo4878(long j) {
        return C17983.m41827(((Long) m8510(j, this.f10659, this.f10658).second).longValue());
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۬ */
    public final long mo5383() {
        return this.f10657;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Pair m8510(long j, long[] jArr, long[] jArr2) {
        int iM41855 = C17983.m41855(jArr, j, true);
        long j2 = jArr[iM41855];
        long j3 = jArr2[iM41855];
        int i = iM41855 + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (j - j2) / (j4 - j2)) * (jArr2[i] - j3))) + j3));
    }
}
