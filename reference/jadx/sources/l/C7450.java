package l;

import android.net.Uri;

/* JADX INFO: renamed from: l.۟ۨܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8TB */
/* JADX INFO: loaded from: classes3.dex */
public final class C7450 extends AbstractC16511 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final Object f24821 = new Object();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C13689 f24822;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f24823;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long f24824;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C23876 f24825;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f24826;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f24827;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long f24828;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f24829 = -9223372036854775807L;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final long f24830;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f24831;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f24832;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Object f24833;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final long f24834;

    @Override // l.AbstractC16511
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo19928() {
        return 1;
    }

    @Override // l.AbstractC16511
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo19929() {
        return 1;
    }

    static {
        C20348 c20348 = new C20348();
        c20348.m45918("SinglePeriodTimeline");
        c20348.m45916(Uri.EMPTY);
        c20348.m45915();
    }

    public C7450(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, C13426 c13426, C13689 c13689, C23876 c23876) {
        this.f24824 = j;
        this.f24831 = j2;
        this.f24828 = j3;
        this.f24830 = j4;
        this.f24832 = j5;
        this.f24834 = j6;
        this.f24823 = z;
        this.f24827 = z2;
        this.f24826 = z3;
        this.f24833 = c13426;
        c13689.getClass();
        this.f24822 = c13689;
        this.f24825 = c23876;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c A[PHI: r1
      0x002c: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v6 long) binds: [B:3:0x000c, B:5:0x0010, B:7:0x0016, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC16511
    /* JADX INFO: renamed from: ۙ */
    public final C0282 mo14810(int i, C0282 c0282, long j) {
        long j2;
        C2023.m6503(i, 1);
        long j3 = this.f24834;
        boolean z = this.f24827;
        if (!z || this.f24826 || j == 0) {
            j2 = j3;
        } else {
            long j4 = this.f24830;
            if (j4 != -9223372036854775807L) {
                j3 += j;
                if (j3 <= j4) {
                    j2 = j3;
                }
            }
            j2 = -9223372036854775807L;
        }
        Object obj = C0282.f1577;
        c0282.m1797(this.f24822, this.f24833, this.f24824, this.f24831, this.f24829, this.f24823, z, this.f24825, j2, this.f24830, this.f24832);
        return c0282;
    }

    @Override // l.AbstractC16511
    /* JADX INFO: renamed from: ۙ */
    public final C20039 mo5920(int i, C20039 c20039, boolean z) {
        C2023.m6503(i, 1);
        Object obj = z ? f24821 : null;
        long j = -this.f24832;
        c20039.getClass();
        c20039.m45388(null, obj, 0, this.f24828, j, C3392.f12527, false);
        return c20039;
    }

    @Override // l.AbstractC16511
    /* JADX INFO: renamed from: ۙ */
    public final int mo14959(Object obj) {
        return f24821.equals(obj) ? 0 : -1;
    }

    @Override // l.AbstractC16511
    /* JADX INFO: renamed from: ۙ */
    public final Object mo14960(int i) {
        C2023.m6503(i, 1);
        return f24821;
    }
}
