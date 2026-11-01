package l;

import java.util.Collections;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: renamed from: l.֡᩵ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8LE */
/* JADX INFO: loaded from: classes2.dex */
public final class C0621 implements InterfaceC15440 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f2687;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f2688;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f2689;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f2690;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C7648 f2691;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f2692;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f2693;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public long f2694;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f2695;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f2696;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f2697;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String f2698;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f2699;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public InterfaceC8011 f2700;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f2701;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C11634 f2702;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C2460 f2703;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f2704;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f2705;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f2706;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f2707;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f2708;

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2891(boolean z) {
    }

    public C0621(String str, int i) {
        this.f2698 = str;
        this.f2706 = i;
        C2460 c2460 = new C2460(1024);
        this.f2703 = c2460;
        byte[] bArrM7518 = c2460.m7518();
        this.f2702 = new C11634(bArrM7518, bArrM7518.length);
        this.f2701 = -9223372036854775807L;
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2887() {
        this.f2693 = 0;
        this.f2701 = -9223372036854775807L;
        this.f2705 = false;
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2890(InterfaceC15690 interfaceC15690, C8074 c8074) {
        c8074.m21286();
        this.f2700 = interfaceC15690.mo7684(c8074.m21287(), 1);
        this.f2707 = c8074.m21288();
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2888(int i, long j) {
        this.f2701 = j;
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2889(C2460 c2460) throws C22861 {
        int iM29039;
        boolean zM29035;
        C2023.m6508(this.f2700);
        while (c2460.m7503() > 0) {
            int i = this.f2693;
            if (i != 0) {
                if (i != 1) {
                    C2460 c2461 = this.f2703;
                    C11634 c11634 = this.f2702;
                    if (i == 2) {
                        int iM7516 = ((this.f2696 & (-225)) << 8) | c2460.m7516();
                        this.f2695 = iM7516;
                        if (iM7516 > c2461.m7518().length) {
                            c2461.m7517(this.f2695);
                            byte[] bArrM7518 = c2461.m7518();
                            c11634.getClass();
                            c11634.m29038(bArrM7518.length, bArrM7518);
                        }
                        this.f2699 = 0;
                        this.f2693 = 3;
                    } else if (i == 3) {
                        int iMin = Math.min(c2460.m7503(), this.f2695 - this.f2699);
                        c2460.m7507(this.f2699, iMin, c11634.f39082);
                        int i2 = this.f2699 + iMin;
                        this.f2699 = i2;
                        if (i2 == this.f2695) {
                            c11634.m29029(0);
                            if (!c11634.m29035()) {
                                this.f2705 = true;
                                int iM290310 = c11634.m29039(1);
                                int iM290311 = iM290310 == 1 ? c11634.m29039(1) : 0;
                                this.f2690 = iM290311;
                                if (iM290311 == 0) {
                                    if (iM290310 == 1) {
                                        c11634.m29039((c11634.m29039(2) + 1) * 8);
                                    }
                                    if (!c11634.m29035()) {
                                        throw C22861.m50610((String) null, (Throwable) null);
                                    }
                                    this.f2689 = c11634.m29039(6);
                                    int iM290312 = c11634.m29039(4);
                                    int iM290313 = c11634.m29039(3);
                                    if (iM290312 != 0 || iM290313 != 0) {
                                        throw C22861.m50610((String) null, (Throwable) null);
                                    }
                                    if (iM290310 == 0) {
                                        int iM29028 = c11634.m29028();
                                        int iM29030 = c11634.m29030();
                                        C17369 c17369M16484 = C6080.m16484(c11634, true);
                                        this.f2688 = c17369M16484.f55268;
                                        this.f2704 = c17369M16484.f55267;
                                        this.f2697 = c17369M16484.f55266;
                                        int iM29031 = iM29030 - c11634.m29030();
                                        c11634.m29029(iM29028);
                                        byte[] bArr = new byte[(iM29031 + 7) / 8];
                                        c11634.m29032(iM29031, bArr);
                                        C10471 c10471 = new C10471();
                                        c10471.m26516(this.f2707);
                                        c10471.m26521("video/mp2t");
                                        c10471.m26533("audio/mp4a-latm");
                                        c10471.m26502(this.f2688);
                                        c10471.m26494(this.f2697);
                                        c10471.m26511(this.f2704);
                                        c10471.m26503(Collections.singletonList(bArr));
                                        c10471.m26509(this.f2698);
                                        c10471.m26513(this.f2706);
                                        C7648 c7648M26497 = c10471.m26497();
                                        if (!c7648M26497.equals(this.f2691)) {
                                            this.f2691 = c7648M26497;
                                            this.f2694 = 1024000000 / ((long) c7648M26497.f25260);
                                            this.f2700.mo8116(c7648M26497);
                                        }
                                    } else {
                                        int iM290314 = c11634.m29039((c11634.m29039(2) + 1) * 8);
                                        int iM29032 = c11634.m29030();
                                        C17369 c17369M16485 = C6080.m16484(c11634, true);
                                        this.f2688 = c17369M16485.f55268;
                                        this.f2704 = c17369M16485.f55267;
                                        this.f2697 = c17369M16485.f55266;
                                        c11634.m29034(iM290314 - (iM29032 - c11634.m29030()));
                                    }
                                    int iM290315 = c11634.m29039(3);
                                    this.f2687 = iM290315;
                                    if (iM290315 == 0) {
                                        c11634.m29034(8);
                                    } else if (iM290315 == 1) {
                                        c11634.m29034(9);
                                    } else if (iM290315 == 3 || iM290315 == 4 || iM290315 == 5) {
                                        c11634.m29034(6);
                                    } else if (iM290315 == 6 || iM290315 == 7) {
                                        c11634.m29034(1);
                                    } else {
                                        throw new IllegalStateException();
                                    }
                                    boolean zM29036 = c11634.m29035();
                                    this.f2708 = zM29036;
                                    this.f2692 = 0L;
                                    if (zM29036) {
                                        if (iM290310 == 1) {
                                            this.f2692 = c11634.m29039((c11634.m29039(2) + 1) * 8);
                                        } else {
                                            do {
                                                zM29035 = c11634.m29035();
                                                this.f2692 = (this.f2692 << 8) + ((long) c11634.m29039(8));
                                            } while (zM29035);
                                        }
                                    }
                                    if (c11634.m29035()) {
                                        c11634.m29034(8);
                                    }
                                } else {
                                    throw C22861.m50610((String) null, (Throwable) null);
                                }
                            } else {
                                if (this.f2705) {
                                }
                                this.f2693 = 0;
                            }
                            if (this.f2690 == 0) {
                                if (this.f2689 != 0) {
                                    throw C22861.m50610((String) null, (Throwable) null);
                                }
                                if (this.f2687 != 0) {
                                    throw C22861.m50610((String) null, (Throwable) null);
                                }
                                int i3 = 0;
                                do {
                                    iM29039 = c11634.m29039(8);
                                    i3 += iM29039;
                                } while (iM29039 == 255);
                                int iM29029 = c11634.m29028();
                                if ((iM29029 & 7) == 0) {
                                    c2461.m7510(iM29029 >> 3);
                                } else {
                                    c11634.m29032(i3 * 8, c2461.m7518());
                                    c2461.m7510(0);
                                }
                                this.f2700.mo8112(i3, c2461);
                                C2023.m6510(this.f2701 != -9223372036854775807L);
                                this.f2700.mo8114(this.f2701, 1, i3, 0, null);
                                this.f2701 += this.f2694;
                                if (this.f2708) {
                                    c11634.m29034((int) this.f2692);
                                }
                                this.f2693 = 0;
                            } else {
                                throw C22861.m50610((String) null, (Throwable) null);
                            }
                        } else {
                            continue;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int iM7517 = c2460.m7516();
                    if ((iM7517 & BERTags.FLAGS) == 224) {
                        this.f2696 = iM7517;
                        this.f2693 = 2;
                    } else if (iM7517 != 86) {
                        this.f2693 = 0;
                    }
                }
            } else if (c2460.m7516() == 86) {
                this.f2693 = 1;
            }
        }
    }
}
