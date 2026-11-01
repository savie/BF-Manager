package l;

import java.math.RoundingMode;

/* JADX INFO: renamed from: l.ܺۡܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8OA */
/* JADX INFO: loaded from: classes4.dex */
public final class C15836 implements InterfaceC20774 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final InterfaceC8011 f51252;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f51253;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15690 f51254;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f51255;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f51256;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C0312 f51257;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C7648 f51258;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f51259;

    public C15836(InterfaceC15690 interfaceC15690, InterfaceC8011 interfaceC8011, C0312 c0312, String str, int i) throws C22861 {
        this.f51254 = interfaceC15690;
        this.f51252 = interfaceC8011;
        this.f51257 = c0312;
        int i2 = c0312.f1680;
        int i3 = c0312.f1677;
        int i4 = (c0312.f1676 * i2) / 8;
        int i5 = c0312.f1679;
        if (i5 != i4) {
            throw C22861.m50610("Expected block size: " + i4 + "; got: " + i5, (Throwable) null);
        }
        int i6 = i3 * i4;
        int i7 = i6 * 8;
        int iMax = Math.max(i4, i6 / 10);
        this.f51259 = iMax;
        C10471 c10471 = new C10471();
        c10471.m26521("audio/wav");
        c10471.m26533(str);
        c10471.m26515(i7);
        c10471.m26528(i7);
        c10471.m26531(iMax);
        c10471.m26494(i2);
        c10471.m26511(i3);
        c10471.m26512(i);
        this.f51258 = c10471.m26497();
    }

    @Override // l.InterfaceC20774
    /* JADX INFO: renamed from: ۙ */
    public final void mo19637(long j) {
        this.f51255 = j;
        this.f51253 = 0;
        this.f51256 = 0L;
    }

    @Override // l.InterfaceC20774
    /* JADX INFO: renamed from: ۙ */
    public final void mo19636(int i, long j) {
        C17246 c17246 = new C17246(this.f51257, 1, i, j);
        this.f51254.mo7690(c17246);
        C7648 c7648 = this.f51258;
        InterfaceC8011 interfaceC8011 = this.f51252;
        interfaceC8011.mo8116(c7648);
        interfaceC8011.mo8113(c17246.mo5383());
    }

    @Override // l.InterfaceC20774
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo19638(InterfaceC7222 interfaceC7222, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.f51253) < (i2 = this.f51259)) {
            int iMo8111 = this.f51252.mo8111((InterfaceC6942) interfaceC7222, (int) Math.min(i2 - i, j2), true);
            if (iMo8111 == -1) {
                j2 = 0;
            } else {
                this.f51253 += iMo8111;
                j2 -= (long) iMo8111;
            }
        }
        C0312 c0312 = this.f51257;
        int i3 = c0312.f1679;
        int i4 = this.f51253 / i3;
        if (i4 > 0) {
            long j3 = this.f51255;
            long j4 = this.f51256;
            long j5 = c0312.f1677;
            String str = C17983.f57504;
            long jM41830 = j3 + C17983.m41830(j4, 1000000L, j5, RoundingMode.DOWN);
            int i5 = i4 * i3;
            int i6 = this.f51253 - i5;
            this.f51252.mo8114(jM41830, 1, i5, i6, null);
            this.f51256 += (long) i4;
            this.f51253 = i6;
        }
        return j2 <= 0;
    }
}
