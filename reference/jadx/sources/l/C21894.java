package l;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* JADX INFO: renamed from: l.᩸᩺ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8UK */
/* JADX INFO: loaded from: classes5.dex */
public final class C21894 implements InterfaceC10045 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C21664 f71017;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f71018;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC15690 f71019;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C9858 f71020;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f71021;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f71022;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC7222 f71024;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C8489 f71025;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C2460 f71023 = new C2460(2);

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f71016 = -1;

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC10045 mo2755() {
        return this;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ᩹ */
    public final List mo2756() {
        return AbstractC22433.of();
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2754(InterfaceC7222 interfaceC7222) throws EOFException, InterruptedIOException {
        C14984 c14984 = (C14984) interfaceC7222;
        if (m48685(c14984) == 65496) {
            int iM48685 = m48685(c14984);
            this.f71022 = iM48685;
            if (iM48685 == 65504) {
                C2460 c2460 = this.f71023;
                c2460.m7517(2);
                c14984.mo19219(false, 0, 2, c2460.m7518());
                c14984.mo19218(c2460.m7519() - 2, false);
                this.f71022 = m48685(c14984);
            }
            if (this.f71022 == 65505) {
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2753(InterfaceC15690 interfaceC15690) {
        this.f71019 = interfaceC15690;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x0172  */
    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final int mo2750(InterfaceC7222 interfaceC7222, C0954 c0954) throws C22861 {
        String strM7514;
        C21664 c21664;
        C19072 c19072M26771;
        long j;
        int i = this.f71021;
        C2460 c2460 = this.f71023;
        if (i == 0) {
            c2460.m7517(2);
            interfaceC7222.readFully(c2460.m7518(), 0, 2);
            int iM7519 = c2460.m7519();
            this.f71022 = iM7519;
            if (iM7519 == 65498) {
                if (this.f71016 != -1) {
                    this.f71021 = 4;
                    return 0;
                }
                m48686();
                return 0;
            }
            if ((iM7519 >= 65488 && iM7519 <= 65497) || iM7519 == 65281) {
                return 0;
            }
            this.f71021 = 1;
            return 0;
        }
        if (i == 1) {
            c2460.m7517(2);
            interfaceC7222.readFully(c2460.m7518(), 0, 2);
            this.f71018 = c2460.m7519() - 2;
            this.f71021 = 2;
            return 0;
        }
        if (i != 2) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.f71025 == null || interfaceC7222 != this.f71024) {
                    this.f71024 = interfaceC7222;
                    this.f71025 = new C8489(interfaceC7222, this.f71016);
                }
                C9858 c9858 = this.f71020;
                c9858.getClass();
                int iMo2750 = c9858.mo2750(this.f71025, c0954);
                if (iMo2750 == 1) {
                    c0954.f3770 += this.f71016;
                }
                return iMo2750;
            }
            long position = interfaceC7222.getPosition();
            long j2 = this.f71016;
            if (position != j2) {
                c0954.f3770 = j2;
                return 1;
            }
            if (!interfaceC7222.mo19219(true, 0, 1, c2460.m7518())) {
                m48686();
                return 0;
            }
            interfaceC7222.mo19217();
            if (this.f71020 == null) {
                this.f71020 = new C9858(InterfaceC13302.f44171, 8);
            }
            C8489 c8489 = new C8489(interfaceC7222, this.f71016);
            this.f71025 = c8489;
            if (!this.f71020.mo2754(c8489)) {
                m48686();
                return 0;
            }
            C9858 c9859 = this.f71020;
            long j3 = this.f71016;
            InterfaceC15690 interfaceC15690 = this.f71019;
            interfaceC15690.getClass();
            c9859.mo2753(new C9195(j3, interfaceC15690));
            C21664 c21665 = this.f71017;
            c21665.getClass();
            InterfaceC15690 interfaceC15691 = this.f71019;
            interfaceC15691.getClass();
            InterfaceC8011 interfaceC8011Mo7684 = interfaceC15691.mo7684(1024, 4);
            C10471 c10471 = new C10471();
            c10471.m26521("image/jpeg");
            c10471.m26504(new C0987(c21665));
            interfaceC8011Mo7684.mo8116(c10471.m26497());
            this.f71021 = 5;
            return 0;
        }
        if (this.f71022 == 65505) {
            C2460 c2461 = new C2460(this.f71018);
            interfaceC7222.readFully(c2461.m7518(), 0, this.f71018);
            if (this.f71017 == null && "http://ns.adobe.com/xap/1.0/".equals(c2461.m7514()) && (strM7514 = c2461.m7514()) != null) {
                long length = interfaceC7222.getLength();
                if (length == -1 || (c19072M26771 = C10606.m26771(strM7514)) == null) {
                    c21664 = null;
                } else {
                    List list = c19072M26771.f61640;
                    if (list.size() < 2) {
                        c21664 = null;
                    } else {
                        int size = list.size() - 1;
                        boolean zEquals = false;
                        long j4 = -1;
                        long j5 = -1;
                        long j6 = -1;
                        long j7 = -1;
                        while (size >= 0) {
                            C18366 c18366 = (C18366) list.get(size);
                            zEquals |= "video/mp4".equals(c18366.f58574);
                            if (size == 0) {
                                length -= c18366.f58573;
                                j = 0;
                            } else {
                                j = length - c18366.f58572;
                            }
                            if (zEquals && j != length) {
                                j7 = length - j;
                                zEquals = false;
                                j6 = j;
                            }
                            if (size == 0) {
                                j5 = length;
                                j4 = j;
                            }
                            size--;
                            length = j;
                        }
                        if (j6 == -1 || j7 == -1 || j4 == -1 || j5 == -1) {
                            c21664 = null;
                        } else {
                            c21664 = new C21664(j4, j5, c19072M26771.f61641, j6, j7);
                        }
                    }
                }
                this.f71017 = c21664;
                if (c21664 != null) {
                    this.f71016 = c21664.f70258;
                }
            }
        } else {
            interfaceC7222.mo19214(this.f71018);
        }
        this.f71021 = 0;
        return 0;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2752(long j, long j2) {
        if (j == 0) {
            this.f71021 = 0;
            this.f71020 = null;
        } else if (this.f71021 == 5) {
            C9858 c9858 = this.f71020;
            c9858.getClass();
            c9858.mo2752(j, j2);
        }
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2751() {
        C9858 c9858 = this.f71020;
        if (c9858 != null) {
            c9858.getClass();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m48685(C14984 c14984) {
        C2460 c2460 = this.f71023;
        c2460.m7517(2);
        c14984.mo19219(false, 0, 2, c2460.m7518());
        return c2460.m7519();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m48686() {
        InterfaceC15690 interfaceC15690 = this.f71019;
        interfaceC15690.getClass();
        interfaceC15690.mo7696();
        this.f71019.mo7690(new C3776(-9223372036854775807L));
        this.f71021 = 6;
    }
}
