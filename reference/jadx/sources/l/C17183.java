package l;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܿۜܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8NM */
/* JADX INFO: loaded from: classes4.dex */
public final class C17183 implements InterfaceC10045 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f54775;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C23534 f54776;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public long f54777;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C5894 f54778;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f54779;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f54780;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C11164 f54781;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C23534[] f54782;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f54783;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C12245 f54784;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public long f54785;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f54786;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f54787;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C2460 f54788;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC15690 f54789;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean f54790;

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2751() {
    }

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

    public C17183(int i, C11164 c11164) {
        this.f54781 = c11164;
        this.f54790 = (i & 1) == 0;
        this.f54788 = new C2460(12);
        this.f54784 = new C12245();
        this.f54789 = new C20149();
        this.f54782 = new C23534[0];
        this.f54780 = -1L;
        this.f54777 = -1L;
        this.f54775 = -1;
        this.f54779 = -9223372036854775807L;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2753(InterfaceC15690 interfaceC15690) {
        this.f54787 = 0;
        if (this.f54790) {
            interfaceC15690 = new C23180(interfaceC15690, this.f54781);
        }
        this.f54789 = interfaceC15690;
        this.f54785 = -1L;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2754(InterfaceC7222 interfaceC7222) {
        C2460 c2460 = this.f54788;
        interfaceC7222.mo19210(0, 12, c2460.m7518());
        c2460.m7510(0);
        if (c2460.m7502() == 1179011410) {
            c2460.m7535(4);
            if (c2460.m7502() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2752(long j, long j2) {
        this.f54785 = -1L;
        this.f54776 = null;
        for (C23534 c23534 : this.f54782) {
            c23534.m51858(j);
        }
        if (j == 0) {
            if (this.f54782.length == 0) {
                this.f54787 = 0;
                return;
            } else {
                this.f54787 = 3;
                return;
            }
        }
        this.f54787 = 6;
    }

    /* JADX WARN: Code duplicated, block: B:148:0x0313  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d2  */
    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final int mo2750(InterfaceC7222 interfaceC7222, C0954 c0954) throws C22861 {
        boolean z;
        C23534 c23534;
        int i;
        long j;
        C23534 c23535;
        if (this.f54785 != -1) {
            long position = interfaceC7222.getPosition();
            long j2 = this.f54785;
            if (j2 < position || j2 > 262144 + position) {
                c0954.f3770 = j2;
                z = true;
            } else {
                interfaceC7222.mo19214((int) (j2 - position));
                z = false;
            }
        } else {
            z = false;
        }
        this.f54785 = -1L;
        if (z) {
            return 1;
        }
        int i2 = this.f54787;
        C23534 c23536 = null;
        C12245 c12245 = this.f54784;
        C2460 c2460 = this.f54788;
        switch (i2) {
            case 0:
                if (mo2754(interfaceC7222)) {
                    interfaceC7222.mo19214(12);
                    this.f54787 = 1;
                    return 0;
                }
                throw C22861.m50610("AVI Header List not found", (Throwable) null);
            case 1:
                interfaceC7222.readFully(c2460.m7518(), 0, 12);
                c2460.m7510(0);
                c12245.getClass();
                c12245.f40979 = c2460.m7502();
                c12245.f40980 = c2460.m7502();
                c12245.f40981 = 0;
                if (c12245.f40979 != 1414744396) {
                    throw C22861.m50610("LIST expected, found: " + c12245.f40979, (Throwable) null);
                }
                int iM7502 = c2460.m7502();
                c12245.f40981 = iM7502;
                if (iM7502 != 1819436136) {
                    throw C22861.m50610("hdrl expected, found: " + c12245.f40981, (Throwable) null);
                }
                this.f54775 = c12245.f40980;
                this.f54787 = 2;
                return 0;
            case 2:
                int i3 = this.f54775 - 4;
                C2460 c2461 = new C2460(i3);
                interfaceC7222.readFully(c2461.m7518(), 0, i3);
                C14362 c14362M34600 = C14362.m34600(1819436136, c2461);
                if (c14362M34600.getType() != 1819436136) {
                    throw C22861.m50610("Unexpected header list type " + c14362M34600.getType(), (Throwable) null);
                }
                C5894 c5894 = (C5894) c14362M34600.m34601(C5894.class);
                if (c5894 == null) {
                    throw C22861.m50610("AviHeader not found", (Throwable) null);
                }
                this.f54778 = c5894;
                this.f54779 = ((long) c5894.f20103) * ((long) c5894.f20104);
                ArrayList arrayList = new ArrayList();
                AbstractC16706 abstractC16706ListIterator = c14362M34600.f47094.listIterator(0);
                int i4 = 0;
                while (abstractC16706ListIterator.hasNext()) {
                    InterfaceC0249 interfaceC0249 = (InterfaceC0249) abstractC16706ListIterator.next();
                    if (interfaceC0249.getType() == 1819440243) {
                        C14362 c14362 = (C14362) interfaceC0249;
                        int i5 = i4 + 1;
                        C10834 c10834 = (C10834) c14362.m34601(C10834.class);
                        C1660 c1660 = (C1660) c14362.m34601(C1660.class);
                        if (c10834 == null) {
                            C0303.m1848("Missing Stream Header");
                        } else if (c1660 != null) {
                            long j3 = c10834.f36875;
                            long j4 = ((long) c10834.f36874) * 1000000;
                            long j5 = c10834.f36878;
                            String str = C17983.f57504;
                            long jM41830 = C17983.m41830(j3, j4, j5, RoundingMode.DOWN);
                            C7648 c7648 = c1660.f6626;
                            C10471 c10471M20201 = c7648.m20201();
                            c10471M20201.m26523(i4);
                            int i6 = c10834.f36879;
                            if (i6 != 0) {
                                c10471M20201.m26531(i6);
                            }
                            C9423 c9423 = (C9423) c14362.m34601(C9423.class);
                            if (c9423 != null) {
                                c10471M20201.m26495(c9423.f31927);
                            }
                            int iM17981 = C6632.m17981(c7648.f25265);
                            if (iM17981 == 1 || iM17981 == 2) {
                                InterfaceC8011 interfaceC8011Mo7684 = this.f54789.mo7684(i4, iM17981);
                                interfaceC8011Mo7684.mo8116(c10471M20201.m26497());
                                interfaceC8011Mo7684.mo8113(jM41830);
                                this.f54779 = Math.max(this.f54779, jM41830);
                                c23534 = new C23534(i4, c10834, interfaceC8011Mo7684);
                            }
                            if (c23534 != null) {
                                arrayList.add(c23534);
                            }
                            i4 = i5;
                        } else {
                            C0303.m1848("Missing Stream Format");
                        }
                        c23534 = null;
                        if (c23534 != null) {
                            arrayList.add(c23534);
                        }
                        i4 = i5;
                    }
                }
                this.f54782 = (C23534[]) arrayList.toArray(new C23534[0]);
                this.f54789.mo7696();
                this.f54787 = 3;
                return 0;
            case 3:
                if (this.f54780 != -1) {
                    long position2 = interfaceC7222.getPosition();
                    i = 16;
                    long j6 = this.f54780;
                    if (position2 != j6) {
                        this.f54785 = j6;
                        return 0;
                    }
                } else {
                    i = 16;
                }
                interfaceC7222.mo19210(0, 12, c2460.m7518());
                interfaceC7222.mo19217();
                c2460.m7510(0);
                c12245.getClass();
                c12245.f40979 = c2460.m7502();
                c12245.f40980 = c2460.m7502();
                c12245.f40981 = 0;
                int iM7503 = c2460.m7502();
                int i7 = c12245.f40979;
                if (i7 == 1179011410) {
                    interfaceC7222.mo19214(12);
                    return 0;
                }
                if (i7 != 1414744396 || iM7503 != 1769369453) {
                    this.f54785 = interfaceC7222.getPosition() + ((long) c12245.f40980) + 8;
                    return 0;
                }
                long position3 = interfaceC7222.getPosition();
                this.f54780 = position3;
                this.f54777 = position3 + ((long) c12245.f40980) + 8;
                if (!this.f54786) {
                    C5894 c5895 = this.f54778;
                    c5895.getClass();
                    if ((c5895.f20102 & i) == i) {
                        this.f54787 = 4;
                        this.f54785 = this.f54777;
                        return 0;
                    }
                    this.f54789.mo7690(new C3776(this.f54779));
                    this.f54786 = true;
                }
                this.f54785 = interfaceC7222.getPosition() + 12;
                this.f54787 = 6;
                return 0;
            case 4:
                interfaceC7222.readFully(c2460.m7518(), 0, 8);
                c2460.m7510(0);
                int iM7504 = c2460.m7502();
                int iM7505 = c2460.m7502();
                if (iM7504 == 829973609) {
                    this.f54787 = 5;
                    this.f54783 = iM7505;
                    return 0;
                }
                this.f54785 = interfaceC7222.getPosition() + ((long) iM7505);
                return 0;
            case 5:
                C2460 c2462 = new C2460(this.f54783);
                interfaceC7222.readFully(c2462.m7518(), 0, this.f54783);
                if (c2462.m7503() < 16) {
                    j = 0;
                } else {
                    int iM7500 = c2462.m7500();
                    c2462.m7535(8);
                    long jM7502 = c2462.m7502();
                    long j7 = this.f54780;
                    j = jM7502 > j7 ? 0L : j7 + 8;
                    c2462.m7510(iM7500);
                }
                while (c2462.m7503() >= 16) {
                    int iM7506 = c2462.m7502();
                    int iM7507 = c2462.m7502();
                    long jM7503 = ((long) c2462.m7502()) + j;
                    c2462.m7535(4);
                    C23534[] c23534Arr = this.f54782;
                    int length = c23534Arr.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 < length) {
                            c23535 = c23534Arr[i8];
                            if (!c23535.m51855(iM7506)) {
                                i8++;
                            }
                        } else {
                            c23535 = null;
                        }
                    }
                    if (c23535 != null) {
                        c23535.m51854(jM7503, (iM7507 & 16) == 16);
                    }
                }
                for (C23534 c23537 : this.f54782) {
                    c23537.m51853();
                }
                this.f54786 = true;
                if (this.f54782.length == 0) {
                    this.f54789.mo7690(new C3776(this.f54779));
                } else {
                    this.f54789.mo7690(new C16478(this, this.f54779));
                }
                this.f54787 = 6;
                this.f54785 = this.f54780;
                return 0;
            case 6:
                if (interfaceC7222.getPosition() >= this.f54777) {
                    return -1;
                }
                C23534 c23538 = this.f54776;
                if (c23538 != null) {
                    if (c23538.m51856(interfaceC7222)) {
                        this.f54776 = null;
                    }
                    return 0;
                }
                if ((interfaceC7222.getPosition() & 1) == 1) {
                    interfaceC7222.mo19214(1);
                }
                interfaceC7222.mo19210(0, 12, c2460.m7518());
                c2460.m7510(0);
                int iM7508 = c2460.m7502();
                if (iM7508 == 1414744396) {
                    c2460.m7510(8);
                    interfaceC7222.mo19214(c2460.m7502() == 1769369453 ? 12 : 8);
                    interfaceC7222.mo19217();
                    return 0;
                }
                int iM7509 = c2460.m7502();
                if (iM7508 == 1263424842) {
                    this.f54785 = interfaceC7222.getPosition() + ((long) iM7509) + 8;
                    return 0;
                }
                interfaceC7222.mo19214(8);
                interfaceC7222.mo19217();
                for (C23534 c23539 : this.f54782) {
                    if (c23539.m51855(iM7508)) {
                        c23536 = c23539;
                        if (c23536 == null) {
                            this.f54785 = interfaceC7222.getPosition() + ((long) iM7509);
                            return 0;
                        }
                        c23536.m51857(iM7509);
                        this.f54776 = c23536;
                        return 0;
                    }
                }
                if (c23536 == null) {
                    this.f54785 = interfaceC7222.getPosition() + ((long) iM7509);
                    return 0;
                }
                c23536.m51857(iM7509);
                this.f54776 = c23536;
                return 0;
            default:
                throw new AssertionError();
        }
    }
}
