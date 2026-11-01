package l;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: l.᩵᩵ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98SV */
/* JADX INFO: loaded from: classes5.dex */
public final class C19673 implements InterfaceC15440 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final float[] f63159 = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C8384 f63160;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC8011 f63161;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C23906 f63162;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18967 f63163;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f63164;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C2460 f63165;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f63166;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f63167;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f63168;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean[] f63169 = new boolean[4];

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C10191 f63170;

    public C19673(C10191 c10191) {
        this.f63170 = c10191;
        C18967 c18967 = new C18967();
        c18967.f61416 = new byte[128];
        this.f63163 = c18967;
        this.f63164 = -9223372036854775807L;
        this.f63162 = new C23906(178);
        this.f63165 = new C2460();
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2887() {
        C11551.m28855(this.f63169);
        this.f63163.m43668();
        C8384 c8384 = this.f63160;
        if (c8384 != null) {
            c8384.m22012();
        }
        C23906 c23906 = this.f63162;
        if (c23906 != null) {
            c23906.m52733();
        }
        this.f63167 = 0L;
        this.f63164 = -9223372036854775807L;
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2890(InterfaceC15690 interfaceC15690, C8074 c8074) {
        c8074.m21286();
        this.f63168 = c8074.m21288();
        InterfaceC8011 interfaceC8011Mo7684 = interfaceC15690.mo7684(c8074.m21287(), 2);
        this.f63161 = interfaceC8011Mo7684;
        this.f63160 = new C8384(interfaceC8011Mo7684);
        this.f63170.m25968(interfaceC15690, c8074);
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2888(int i, long j) {
        this.f63164 = j;
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2889(C2460 c2460) {
        C18967 c18967;
        C23906 c23906;
        int i;
        float f;
        C2023.m6508(this.f63160);
        C2023.m6508(this.f63161);
        int iM7500 = c2460.m7500();
        int iM7509 = c2460.m7509();
        byte[] bArrM7518 = c2460.m7518();
        this.f63167 += (long) c2460.m7503();
        this.f63161.mo8112(c2460.m7503(), c2460);
        while (true) {
            int iM28847 = C11551.m28847(iM7500, iM7509, bArrM7518, this.f63169);
            c18967 = this.f63163;
            c23906 = this.f63162;
            if (iM28847 == iM7509) {
                break;
            }
            int i2 = iM28847 + 3;
            int i3 = c2460.m7518()[i2] & 255;
            int i4 = iM28847 - iM7500;
            if (!this.f63166) {
                if (i4 > 0) {
                    c18967.m43669(iM7500, iM28847, bArrM7518);
                }
                if (c18967.m43670(i3, i4 < 0 ? -i4 : 0)) {
                    InterfaceC8011 interfaceC8011 = this.f63161;
                    int i5 = c18967.f61417;
                    String str = this.f63168;
                    str.getClass();
                    byte[] bArrCopyOf = Arrays.copyOf(c18967.f61416, c18967.f61418);
                    C11634 c11634 = new C11634(bArrCopyOf, bArrCopyOf.length);
                    c11634.m29043(i5);
                    c11634.m29043(4);
                    c11634.m29042();
                    c11634.m29034(8);
                    if (c11634.m29035()) {
                        c11634.m29034(4);
                        c11634.m29034(3);
                    }
                    int iM29039 = c11634.m29039(4);
                    if (iM29039 == 15) {
                        int iM290310 = c11634.m29039(8);
                        int iM290311 = c11634.m29039(8);
                        if (iM290311 == 0) {
                            C0303.m1848("Invalid aspect ratio");
                            f = 1.0f;
                        } else {
                            f = iM290310 / iM290311;
                        }
                    } else if (iM29039 < 7) {
                        f = f63159[iM29039];
                    } else {
                        C0303.m1848("Invalid aspect ratio");
                        f = 1.0f;
                    }
                    int i6 = 2;
                    if (c11634.m29035()) {
                        c11634.m29034(2);
                        c11634.m29034(1);
                        if (c11634.m29035()) {
                            c11634.m29034(15);
                            c11634.m29042();
                            c11634.m29034(15);
                            c11634.m29042();
                            c11634.m29034(15);
                            c11634.m29042();
                            c11634.m29034(3);
                            c11634.m29034(11);
                            c11634.m29042();
                            c11634.m29034(15);
                            c11634.m29042();
                            i6 = 2;
                        }
                    }
                    if (c11634.m29039(i6) != 0) {
                        C0303.m1848("Unhandled video object layer shape");
                    }
                    c11634.m29042();
                    int iM290312 = c11634.m29039(16);
                    c11634.m29042();
                    if (c11634.m29035()) {
                        if (iM290312 == 0) {
                            C0303.m1848("Invalid vop_increment_time_resolution");
                        } else {
                            int i7 = 0;
                            for (int i8 = iM290312 - 1; i8 > 0; i8 >>= 1) {
                                i7++;
                            }
                            c11634.m29034(i7);
                        }
                    }
                    c11634.m29042();
                    int iM290313 = c11634.m29039(13);
                    c11634.m29042();
                    int iM290314 = c11634.m29039(13);
                    c11634.m29042();
                    c11634.m29042();
                    C10471 c10471 = new C10471();
                    c10471.m26516(str);
                    c10471.m26521("video/mp2t");
                    c10471.m26533("video/mp4v-es");
                    c10471.m26525(iM290313);
                    c10471.m26534(iM290314);
                    c10471.m26519(f);
                    c10471.m26503(Collections.singletonList(bArrCopyOf));
                    interfaceC8011.mo8116(c10471.m26497());
                    this.f63166 = true;
                }
            }
            this.f63160.m22013(iM7500, iM28847, bArrM7518);
            if (c23906 != null) {
                if (i4 > 0) {
                    c23906.m52730(iM7500, iM28847, bArrM7518);
                    i = 0;
                } else {
                    i = -i4;
                }
                if (c23906.m52732(i)) {
                    int iM28848 = C11551.m28848(c23906.f77457, c23906.f77460);
                    String str2 = C17983.f57504;
                    byte[] bArr = c23906.f77460;
                    C2460 c2461 = this.f63165;
                    c2461.m7508(iM28848, bArr);
                    this.f63170.m25967(this.f63164, c2461);
                }
                if (i3 == 178 && c2460.m7518()[iM28847 + 2] == 1) {
                    c23906.m52734(i3);
                }
            }
            int i9 = iM7509 - iM28847;
            this.f63160.m22015(this.f63167 - ((long) i9), i9, this.f63166);
            this.f63160.m22014(i3, this.f63164);
            iM7500 = i2;
        }
        if (!this.f63166) {
            c18967.m43669(iM7500, iM7509, bArrM7518);
        }
        this.f63160.m22013(iM7500, iM7509, bArrM7518);
        if (c23906 != null) {
            c23906.m52730(iM7500, iM7509, bArrM7518);
        }
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2891(boolean z) {
        C2023.m6508(this.f63160);
        if (z) {
            this.f63160.m22015(this.f63167, 0, this.f63166);
            this.f63160.m22012();
        }
    }
}
