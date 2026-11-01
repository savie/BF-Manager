package l;

/* JADX INFO: renamed from: l.۫᩸ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8QR */
/* JADX INFO: loaded from: classes3.dex */
public final class C12680 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C0684 f42336;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f42337;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f42338;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7648 f42339;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f42340;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f42342;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f42344;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8011 f42345;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C4107 f42348;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C13281 f42341 = new C13281();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C2460 f42346 = new C2460();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C2460 f42343 = new C2460(1);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C2460 f42347 = new C2460();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m31537() {
        C13281 c13281 = this.f42341;
        c13281.f44114 = 0;
        c13281.f44106 = 0L;
        c13281.f44117 = false;
        c13281.f44109 = false;
        c13281.f44104 = false;
        c13281.f44113 = null;
        this.f42342 = 0;
        this.f42337 = 0;
        this.f42344 = 0;
        this.f42338 = 0;
        this.f42340 = false;
    }

    public C12680(InterfaceC8011 interfaceC8011, C4107 c4107, C0684 c0684, C7648 c7648) {
        this.f42345 = interfaceC8011;
        this.f42348 = c4107;
        this.f42336 = c0684;
        this.f42339 = c7648;
        m31541(c4107, c0684);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31541(C4107 c4107, C0684 c0684) {
        this.f42348 = c4107;
        this.f42336 = c0684;
        this.f42345.mo8116(this.f42339);
        m31537();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31542(C8354 c8354) {
        C22453 c22453 = this.f42348.f15054;
        C0684 c0684 = this.f42341.f44103;
        String str = C17983.f57504;
        C1285 c1285M49946 = c22453.m49946(c0684.f2861);
        C8354 c8354M21875 = c8354.m21875(c1285M49946 != null ? c1285M49946.f5532 : null);
        C10471 c10471M20201 = this.f42339.m20201();
        c10471M20201.m26506(c8354M21875);
        this.f42345.mo8116(c10471M20201.m26497());
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m31544() {
        if (!this.f42340) {
            return this.f42348.f15049[this.f42342];
        }
        return this.f42341.f44112[this.f42342];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m31545() {
        if (!this.f42340) {
            return this.f42348.f15050[this.f42342];
        }
        return this.f42341.f44108[this.f42337];
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m31538() {
        if (!this.f42340) {
            return this.f42348.f15056[this.f42342];
        }
        return this.f42341.f44116[this.f42342];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m31539() {
        int i;
        if (!this.f42340) {
            i = this.f42348.f15055[this.f42342];
        } else {
            i = this.f42341.f44118[this.f42342] ? 1 : 0;
        }
        return m31543() != null ? i | 1073741824 : i;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m31546() {
        this.f42342++;
        if (!this.f42340) {
            return false;
        }
        int i = this.f42344 + 1;
        this.f42344 = i;
        int[] iArr = this.f42341.f44115;
        int i2 = this.f42337;
        if (i != iArr[i2]) {
            return true;
        }
        this.f42337 = i2 + 1;
        this.f42344 = 0;
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m31540(int i, int i2) {
        C2460 c2460;
        C1285 c1285M31543 = m31543();
        if (c1285M31543 == null) {
            return 0;
        }
        int length = c1285M31543.f5530;
        C13281 c13281 = this.f42341;
        if (length != 0) {
            c2460 = c13281.f44110;
        } else {
            byte[] bArr = c1285M31543.f5534;
            String str = C17983.f57504;
            int length2 = bArr.length;
            C2460 c2461 = this.f42347;
            c2461.m7508(length2, bArr);
            length = bArr.length;
            c2460 = c2461;
        }
        boolean z = c13281.f44109 && c13281.f44107[this.f42342];
        boolean z2 = z || i2 != 0;
        C2460 c2462 = this.f42343;
        c2462.m7518()[0] = (byte) ((z2 ? 128 : 0) | length);
        c2462.m7510(0);
        InterfaceC8011 interfaceC8011 = this.f42345;
        interfaceC8011.mo8115(c2462, 1, 1);
        interfaceC8011.mo8115(c2460, length, 1);
        if (!z2) {
            return length + 1;
        }
        C2460 c2463 = this.f42346;
        if (!z) {
            c2463.m7517(8);
            byte[] bArrM7518 = c2463.m7518();
            bArrM7518[0] = 0;
            bArrM7518[1] = 1;
            bArrM7518[2] = (byte) 0;
            bArrM7518[3] = (byte) (i2 & 255);
            bArrM7518[4] = (byte) ((i >> 24) & 255);
            bArrM7518[5] = (byte) ((i >> 16) & 255);
            bArrM7518[6] = (byte) ((i >> 8) & 255);
            bArrM7518[7] = (byte) (i & 255);
            interfaceC8011.mo8115(c2463, 8, 1);
            return length + 9;
        }
        C2460 c2464 = c13281.f44110;
        int iM7519 = c2464.m7519();
        c2464.m7535(-2);
        int i3 = (iM7519 * 6) + 2;
        if (i2 != 0) {
            c2463.m7517(i3);
            byte[] bArrM7519 = c2463.m7518();
            c2464.m7507(0, i3, bArrM7519);
            int i4 = (((bArrM7519[2] & 255) << 8) | (bArrM7519[3] & 255)) + i2;
            bArrM7519[2] = (byte) ((i4 >> 8) & 255);
            bArrM7519[3] = (byte) (i4 & 255);
        } else {
            c2463 = c2464;
        }
        interfaceC8011.mo8115(c2463, i3, 1);
        return length + 1 + i3;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C1285 m31543() {
        if (!this.f42340) {
            return null;
        }
        C13281 c13281 = this.f42341;
        C0684 c0684 = c13281.f44103;
        String str = C17983.f57504;
        int i = c0684.f2861;
        C1285 c1285M49946 = c13281.f44113;
        if (c1285M49946 == null) {
            c1285M49946 = this.f42348.f15054.m49946(i);
        }
        if (c1285M49946 == null || !c1285M49946.f5533) {
            return null;
        }
        return c1285M49946;
    }
}
