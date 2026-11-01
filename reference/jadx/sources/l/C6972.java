package l;

import java.util.concurrent.atomic.AtomicInteger;
import org.bouncycastle.crypto.generators.Poly1305KeyGenerator;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: l.ۜ᩵ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8NN */
/* JADX INFO: loaded from: classes3.dex */
public final class C6972 implements InterfaceC15440 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C2460 f23449;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C7648 f23450;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public InterfaceC8011 f23451;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f23452;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f23453;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f23454;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String f23457;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f23459;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f23460;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f23464;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public long f23465;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f23463 = 0;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f23461 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f23455 = new AtomicInteger();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f23456 = -1;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f23462 = -1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f23458 = "video/mp2t";

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2891(boolean z) {
    }

    public C6972(String str, int i, int i2) {
        this.f23449 = new C2460(new byte[i2]);
        this.f23457 = str;
        this.f23454 = i;
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2887() {
        this.f23463 = 0;
        this.f23452 = 0;
        this.f23460 = 0;
        this.f23461 = -9223372036854775807L;
        this.f23455.set(0);
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2890(InterfaceC15690 interfaceC15690, C8074 c8074) {
        c8074.m21286();
        this.f23453 = c8074.m21288();
        this.f23451 = interfaceC15690.mo7684(c8074.m21287(), 1);
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2888(int i, long j) {
        this.f23461 = j;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x01b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x01b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:67:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:70:0x01cf  */
    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2889(C2460 c2460) throws C22861 {
        int i;
        char c;
        byte b;
        int i2;
        char c2;
        char c3;
        boolean z;
        int i3;
        int i4;
        byte b2;
        int i5;
        byte b3;
        int i6;
        byte b4;
        C2023.m6508(this.f23451);
        while (c2460.m7503() > 0) {
            int i7 = this.f23463;
            C2460 c2461 = this.f23449;
            switch (i7) {
                case 0:
                    while (c2460.m7503() > 0) {
                        int i8 = this.f23460 << 8;
                        this.f23460 = i8;
                        int iM7516 = i8 | c2460.m7516();
                        this.f23460 = iM7516;
                        if (iM7516 == 2147385345 || iM7516 == -25230976 || iM7516 == 536864768 || iM7516 == -14745368) {
                            i = 1;
                        } else if (iM7516 == 1683496997 || iM7516 == 622876772) {
                            i = 2;
                        } else if (iM7516 == 1078008818 || iM7516 == -233094848) {
                            i = 3;
                        } else {
                            i = (iM7516 == 1908687592 || iM7516 == -398277519) ? 4 : 0;
                        }
                        this.f23464 = i;
                        if (i != 0) {
                            byte[] bArrM7518 = c2461.m7518();
                            int i9 = this.f23460;
                            bArrM7518[0] = (byte) ((i9 >> 24) & 255);
                            bArrM7518[1] = (byte) ((i9 >> 16) & 255);
                            bArrM7518[2] = (byte) ((i9 >> 8) & 255);
                            bArrM7518[3] = (byte) (i9 & 255);
                            this.f23452 = 4;
                            this.f23460 = 0;
                            int i10 = this.f23464;
                            if (i10 != 3 && i10 != 4) {
                                if (i10 == 1) {
                                    this.f23463 = 1;
                                } else {
                                    this.f23463 = 2;
                                }
                            }
                            this.f23463 = 4;
                        }
                        break;
                    }
                    break;
                case 1:
                    if (m18751(c2460, c2461.m7518(), 18)) {
                        byte[] bArrM7519 = c2461.m7518();
                        if (this.f23450 == null) {
                            c = 7;
                            C7648 c7648M22430 = C8634.m22430(this.f23454, this.f23453, this.f23457, this.f23458, bArrM7519);
                            this.f23450 = c7648M22430;
                            this.f23451.mo8116(c7648M22430);
                        } else {
                            c = 7;
                        }
                        byte b5 = bArrM7519[0];
                        if (b5 != -2) {
                            if (b5 == -1) {
                                i6 = ((3 & bArrM7519[c]) << 12) | ((bArrM7519[6] & 255) << 4);
                                b4 = bArrM7519[9];
                            } else if (b5 == 31) {
                                i6 = ((bArrM7519[c] & 255) << 4) | ((bArrM7519[6] & 3) << 12);
                                b4 = bArrM7519[8];
                            } else {
                                c2 = 5;
                                i2 = ((bArrM7519[5] & 3) << 12) | ((bArrM7519[6] & 255) << 4);
                                b = bArrM7519[c];
                            }
                            c3 = 5;
                            i3 = (i6 | ((b4 & 60) >> 2)) + 1;
                            z = true;
                            if (z) {
                                i3 = (i3 * 16) / 14;
                            }
                            this.f23459 = i3;
                            if (b5 != -2) {
                                if (b5 != -1) {
                                    i4 = (bArrM7519[4] & 7) << 4;
                                    b3 = bArrM7519[c];
                                } else if (b5 != 31) {
                                    i4 = (bArrM7519[c3] & 7) << 4;
                                    b3 = bArrM7519[6];
                                } else {
                                    i4 = (bArrM7519[4] & 1) << 6;
                                    b2 = bArrM7519[c3];
                                }
                                i5 = b3 & 60;
                                this.f23465 = C17039.m39818(C17983.m41826(this.f23450.f25260, (((i5 >> 2) | i4) + 1) * 32));
                                c2461.m7510(0);
                                this.f23451.mo8112(18, c2461);
                                this.f23463 = 6;
                            } else {
                                i4 = (bArrM7519[c3] & 1) << 6;
                                b2 = bArrM7519[4];
                            }
                            i5 = b2 & Poly1305KeyGenerator.R_MASK_LOW_2;
                            this.f23465 = C17039.m39818(C17983.m41826(this.f23450.f25260, (((i5 >> 2) | i4) + 1) * 32));
                            c2461.m7510(0);
                            this.f23451.mo8112(18, c2461);
                            this.f23463 = 6;
                        } else {
                            int i11 = ((3 & bArrM7519[4]) << 12) | ((bArrM7519[c] & 255) << 4);
                            b = bArrM7519[6];
                            i2 = i11;
                            c2 = 5;
                        }
                        i3 = (i2 | ((b & 240) >> 4)) + 1;
                        c3 = c2;
                        z = false;
                        if (z) {
                            i3 = (i3 * 16) / 14;
                        }
                        this.f23459 = i3;
                        if (b5 != -2) {
                            if (b5 != -1) {
                                i4 = (bArrM7519[4] & 7) << 4;
                                b3 = bArrM7519[c];
                            } else if (b5 != 31) {
                                i4 = (bArrM7519[c3] & 7) << 4;
                                b3 = bArrM7519[6];
                            } else {
                                i4 = (bArrM7519[4] & 1) << 6;
                                b2 = bArrM7519[c3];
                            }
                            i5 = b3 & 60;
                            this.f23465 = C17039.m39818(C17983.m41826(this.f23450.f25260, (((i5 >> 2) | i4) + 1) * 32));
                            c2461.m7510(0);
                            this.f23451.mo8112(18, c2461);
                            this.f23463 = 6;
                        } else {
                            i4 = (bArrM7519[c3] & 1) << 6;
                            b2 = bArrM7519[4];
                        }
                        i5 = b2 & Poly1305KeyGenerator.R_MASK_LOW_2;
                        this.f23465 = C17039.m39818(C17983.m41826(this.f23450.f25260, (((i5 >> 2) | i4) + 1) * 32));
                        c2461.m7510(0);
                        this.f23451.mo8112(18, c2461);
                        this.f23463 = 6;
                        break;
                    }
                    break;
                case 2:
                    if (m18751(c2460, c2461.m7518(), 7)) {
                        this.f23456 = C8634.m22433(c2461.m7518());
                        this.f23463 = 3;
                    }
                    break;
                case 3:
                    if (m18751(c2460, c2461.m7518(), this.f23456)) {
                        C19217 c19217M22434 = C8634.m22434(c2461.m7518());
                        m18750(c19217M22434);
                        this.f23459 = c19217M22434.f62073;
                        long j = c19217M22434.f62074;
                        if (j == -9223372036854775807L) {
                            j = 0;
                        }
                        this.f23465 = j;
                        c2461.m7510(0);
                        this.f23451.mo8112(this.f23456, c2461);
                        this.f23463 = 6;
                    }
                    break;
                case 4:
                    if (m18751(c2460, c2461.m7518(), 6)) {
                        int iM22428 = C8634.m22428(c2461.m7518());
                        this.f23462 = iM22428;
                        int i12 = this.f23452;
                        if (i12 > iM22428) {
                            int i13 = i12 - iM22428;
                            this.f23452 = i12 - i13;
                            c2460.m7510(c2460.m7500() - i13);
                        }
                        this.f23463 = 5;
                    }
                    break;
                case 5:
                    if (m18751(c2460, c2461.m7518(), this.f23462)) {
                        C19217 c19217M22432 = C8634.m22432(c2461.m7518(), this.f23455);
                        if (this.f23464 == 3) {
                            m18750(c19217M22432);
                        }
                        this.f23459 = c19217M22432.f62073;
                        long j2 = c19217M22432.f62074;
                        if (j2 == -9223372036854775807L) {
                            j2 = 0;
                        }
                        this.f23465 = j2;
                        c2461.m7510(0);
                        this.f23451.mo8112(this.f23462, c2461);
                        this.f23463 = 6;
                    }
                    break;
                case 6:
                    int iMin = Math.min(c2460.m7503(), this.f23459 - this.f23452);
                    this.f23451.mo8112(iMin, c2460);
                    int i14 = this.f23452 + iMin;
                    this.f23452 = i14;
                    if (i14 == this.f23459) {
                        C2023.m6510(this.f23461 != -9223372036854775807L);
                        this.f23451.mo8114(this.f23461, this.f23464 == 4 ? 0 : 1, this.f23459, 0, null);
                        this.f23461 += this.f23465;
                        this.f23463 = 0;
                    }
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m18751(C2460 c2460, byte[] bArr, int i) {
        int iMin = Math.min(c2460.m7503(), i - this.f23452);
        c2460.m7507(this.f23452, iMin, bArr);
        int i2 = this.f23452 + iMin;
        this.f23452 = i2;
        return i2 == i;
    }

    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m18750(C19217 c19217) {
        int i = c19217.f62072;
        String str = c19217.f62070;
        int i2 = c19217.f62071;
        if (i == -2147483647 || i2 == -1) {
            return;
        }
        C7648 c7648 = this.f23450;
        if (c7648 != null && i2 == c7648.f25249 && i == c7648.f25260 && str.equals(c7648.f25265)) {
            return;
        }
        C7648 c7649 = this.f23450;
        C10471 c10471 = c7649 == null ? new C10471() : c7649.m20201();
        c10471.m26516(this.f23453);
        c10471.m26521(this.f23458);
        c10471.m26533(str);
        c10471.m26494(i2);
        c10471.m26511(i);
        c10471.m26509(this.f23457);
        c10471.m26513(this.f23454);
        C7648 c7648M26497 = c10471.m26497();
        this.f23450 = c7648M26497;
        this.f23451.mo8116(c7648M26497);
    }
}
