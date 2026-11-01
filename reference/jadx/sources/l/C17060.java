package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܿۖܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3BDE */
/* JADX INFO: loaded from: classes4.dex */
public final class C17060 extends C7182 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C17060 f54469 = new C17060();

    @Override // l.C7182
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC5771 mo19115(C19883 c19883, int i, String str, int i2, int i3) {
        int i4 = 0;
        if (i == 0) {
            if (str == "BootstrapMethods") {
                if (i3 < 2) {
                    m39840();
                    throw null;
                }
                C14009 c14009M45129 = c19883.m45129();
                int iM33871 = c14009M45129.m33871(i2);
                int i5 = i2 + 2;
                int i6 = i3 - 2;
                C11083 c11083M45133 = c19883.m45133();
                C6143 c6143M45140 = c19883.m45140();
                C8157 c8157 = new C8157(iM33871);
                for (int i7 = 0; i7 < iM33871; i7++) {
                    if (i6 < 4) {
                        throw new C1537("truncated attribute", null);
                    }
                    int iM33872 = c14009M45129.m33871(i5);
                    int iM33873 = c14009M45129.m33871(i5 + 2);
                    i5 += 4;
                    i6 -= 4;
                    if (i6 < iM33873 * 2) {
                        throw new C1537("truncated attribute", null);
                    }
                    C18034 c18034 = new C18034(iM33873);
                    int i8 = 0;
                    while (i8 < iM33873) {
                        c18034.mo15257(i8, c11083M45133.get(c14009M45129.m33871(i5)));
                        i8++;
                        i5 += 2;
                        i6 -= 2;
                    }
                    c18034.mo9637();
                    c8157.m21468(i7, c6143M45140, (C16022) c11083M45133.get(iM33872), c18034);
                }
                c8157.mo9637();
                if (i6 == 0) {
                    return new C15981(c8157);
                }
                m39841(i6);
                throw null;
            }
            if (str == "Deprecated") {
                if (i3 == 0) {
                    return new C16686("Deprecated");
                }
                m39841(0);
                throw null;
            }
            if (str == "EnclosingMethod") {
                if (i3 != 4) {
                    m39841(4);
                    throw null;
                }
                C14009 c14009M451210 = c19883.m45129();
                C11083 c11083M45134 = c19883.m45133();
                C6143 c6143 = (C6143) c11083M45134.get(c14009M451210.m33871(i2));
                int iM33874 = c14009M451210.m33871(i2 + 2);
                return new C12453(c6143, (C0498) (iM33874 != 0 ? c11083M45134.get(iM33874) : null));
            }
            if (str == "InnerClasses") {
                if (i3 < 2) {
                    m39840();
                    throw null;
                }
                C14009 c14009M451211 = c19883.m45129();
                C11083 c11083M45135 = c19883.m45133();
                int iM33875 = c14009M451211.m33871(i2);
                int i9 = i2 + 2;
                int i10 = iM33875 * 8;
                if (i3 - 2 != i10) {
                    m39841(i10 + 2);
                    throw null;
                }
                C22974 c22974 = new C22974(iM33875);
                while (i4 < iM33875) {
                    int iM33876 = c14009M451211.m33871(i9);
                    int iM33877 = c14009M451211.m33871(i9 + 2);
                    int iM33878 = c14009M451211.m33871(i9 + 4);
                    c22974.m50814(i4, (C6143) c11083M45135.get(iM33876), (C6143) (iM33877 == 0 ? null : c11083M45135.get(iM33877)), (C17432) (iM33878 == 0 ? null : c11083M45135.get(iM33878)), c14009M451211.m33871(i9 + 6));
                    i9 += 8;
                    i4++;
                }
                c22974.mo9637();
                return new C6102(c22974);
            }
            if (str == "RuntimeInvisibleAnnotations") {
                return m39843(c19883, i2, i3);
            }
            if (str == "RuntimeVisibleAnnotations") {
                return m39842(c19883, i2, i3);
            }
            if (str == "Synthetic") {
                if (i3 == 0) {
                    return new C5334("Synthetic");
                }
                m39841(0);
                throw null;
            }
            if (str == "Signature") {
                return m39838(c19883, i2, i3);
            }
            if (str == "SourceDebugExtension") {
                return new C11685(new C17432(c19883.m45129().m33866(i2, i2 + i3)));
            }
            if (str == "SourceFile") {
                if (i3 == 2) {
                    return new C2511((C17432) c19883.m45133().get(c19883.m45129().m33871(i2)));
                }
                m39841(2);
                throw null;
            }
        } else if (i == 1) {
            if (str == "ConstantValue") {
                if (i3 == 2) {
                    return new C0457((AbstractC23783) c19883.m45133().get(c19883.m45129().m33871(i2)));
                }
                m39841(2);
                throw null;
            }
            if (str == "Deprecated") {
                if (i3 == 0) {
                    return new C16686("Deprecated");
                }
                m39841(0);
                throw null;
            }
            if (str == "RuntimeInvisibleAnnotations") {
                return m39843(c19883, i2, i3);
            }
            if (str == "RuntimeVisibleAnnotations") {
                return m39842(c19883, i2, i3);
            }
            if (str == "Signature") {
                return m39838(c19883, i2, i3);
            }
            if (str == "Synthetic") {
                if (i3 == 0) {
                    return new C5334("Synthetic");
                }
                m39841(0);
                throw null;
            }
        } else if (i == 2) {
            if (str == "AnnotationDefault") {
                if (i3 >= 2) {
                    return new C20919(i3, new C10005(c19883, i2, i3).m25279());
                }
                m39840();
                throw null;
            }
            if (str == "Code") {
                if (i3 < 12) {
                    m39840();
                    throw null;
                }
                C14009 c14009M451212 = c19883.m45129();
                C11083 c11083M45136 = c19883.m45133();
                int iM33879 = c14009M451212.m33871(i2);
                int iM338710 = c14009M451212.m33871(i2 + 2);
                int iM33870 = c14009M451212.m33870(i2 + 4);
                int i11 = i2 + 8;
                int i12 = i3 - 8;
                if (i12 < iM33870 + 4) {
                    throw new C1537("truncated attribute", null);
                }
                int i13 = i11 + iM33870;
                int i14 = i12 - iM33870;
                C16624 c16624 = new C16624(c14009M451212.m33866(i11, i13), c11083M45136);
                int iM338711 = c14009M451212.m33871(i13);
                C7451 c7451 = iM338711 == 0 ? C7451.f24835 : new C7451(iM338711);
                int i15 = i13 + 2;
                int i16 = i14 - 2;
                if (i16 < (iM338711 * 8) + 2) {
                    throw new C1537("truncated attribute", null);
                }
                while (i4 < iM338711) {
                    int iM338712 = c14009M451212.m33871(i15);
                    int iM338713 = c14009M451212.m33871(i15 + 2);
                    int iM338714 = c14009M451212.m33871(i15 + 4);
                    int iM338715 = c14009M451212.m33871(i15 + 6);
                    c7451.m19931(i4, iM338712, iM338713, iM338714, (C6143) (iM338715 == 0 ? null : c11083M45136.get(iM338715)));
                    i15 += 8;
                    i16 -= 8;
                    i4++;
                }
                c7451.mo9637();
                C20588 c20588 = new C20588(c19883, 3, i15, this);
                C9300 c9300M46447 = c20588.m46447();
                c9300M46447.mo9637();
                int iM46446 = c20588.m46446() - i15;
                if (iM46446 == i16) {
                    return new C20214(iM33879, iM338710, c16624, c7451, c9300M46447);
                }
                m39841((i15 - i2) + iM46446);
                throw null;
            }
            if (str == "Deprecated") {
                if (i3 == 0) {
                    return new C16686("Deprecated");
                }
                m39841(0);
                throw null;
            }
            if (str == "Exceptions") {
                if (i3 < 2) {
                    m39840();
                    throw null;
                }
                int iM338716 = c19883.m45129().m33871(i2);
                int i17 = i2 + 2;
                int i18 = iM338716 * 2;
                if (i3 - 2 == i18) {
                    return new C17391(c19883.m45132(i17, iM338716));
                }
                m39841(i18 + 2);
                throw null;
            }
            if (str == "RuntimeInvisibleAnnotations") {
                return m39843(c19883, i2, i3);
            }
            if (str == "RuntimeVisibleAnnotations") {
                return m39842(c19883, i2, i3);
            }
            if (str == "RuntimeInvisibleParameterAnnotations") {
                if (i3 >= 2) {
                    return new C9631("RuntimeInvisibleParameterAnnotations", new C10005(c19883, i2, i3).m25280(EnumC14363.BUILD), i3);
                }
                m39840();
                throw null;
            }
            if (str == "RuntimeVisibleParameterAnnotations") {
                if (i3 >= 2) {
                    return new C4628("RuntimeVisibleParameterAnnotations", new C10005(c19883, i2, i3).m25280(EnumC14363.RUNTIME), i3);
                }
                m39840();
                throw null;
            }
            if (str == "Signature") {
                return m39838(c19883, i2, i3);
            }
            if (str == "Synthetic") {
                if (i3 == 0) {
                    return new C5334("Synthetic");
                }
                m39841(0);
                throw null;
            }
        } else if (i == 3) {
            if (str == "LineNumberTable") {
                if (i3 < 2) {
                    m39840();
                    throw null;
                }
                C14009 c14009M451213 = c19883.m45129();
                int iM338717 = c14009M451213.m33871(i2);
                int i19 = i2 + 2;
                int i20 = iM338717 * 4;
                if (i3 - 2 != i20) {
                    m39841(i20 + 2);
                    throw null;
                }
                C23680 c23680 = new C23680(iM338717);
                while (i4 < iM338717) {
                    c23680.m52140(i4, c14009M451213.m33871(i19), c14009M451213.m33871(i19 + 2));
                    i19 += 4;
                    i4++;
                }
                c23680.mo9637();
                return new C11042(c23680);
            }
            if (str == "LocalVariableTable") {
                if (i3 >= 2) {
                    C14009 c14009M451214 = c19883.m45129();
                    return new C23742("LocalVariableTable", m39839(c14009M451214.m33866(i2 + 2, i2 + i3), c19883.m45133(), c14009M451214.m33871(i2), false));
                }
                m39840();
                throw null;
            }
            if (str == "LocalVariableTypeTable") {
                if (i3 >= 2) {
                    C14009 c14009M451215 = c19883.m45129();
                    return new C14570("LocalVariableTypeTable", m39839(c14009M451215.m33866(i2 + 2, i2 + i3), c19883.m45133(), c14009M451215.m33871(i2), true));
                }
                m39840();
                throw null;
            }
        }
        C14009 c14009M451216 = c19883.m45129();
        c19883.m45133();
        return new C15213(str, c14009M451216, i2, i3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1806 m39839(C14009 c14009, C11083 c11083, int i, boolean z) {
        C17432 c17432;
        C17432 c17433;
        int i2 = i * 10;
        if (c14009.m33864() == i2) {
            C3402 c3402 = new C3402(new C4835(c14009));
            C1806 c1806 = new C1806(i);
            for (int i3 = 0; i3 < i; i3++) {
                try {
                    int unsignedShort = c3402.readUnsignedShort();
                    int unsignedShort2 = c3402.readUnsignedShort();
                    int unsignedShort3 = c3402.readUnsignedShort();
                    int unsignedShort4 = c3402.readUnsignedShort();
                    int unsignedShort5 = c3402.readUnsignedShort();
                    C17432 c17434 = (C17432) c11083.get(unsignedShort3);
                    C17432 c17435 = (C17432) c11083.get(unsignedShort4);
                    if (z) {
                        c17433 = null;
                        c17432 = c17435;
                    } else {
                        c17432 = null;
                        c17433 = c17435;
                    }
                    c1806.m5896(i3, unsignedShort, unsignedShort2, c17434, c17433, c17432, unsignedShort5);
                } catch (IOException e) {
                    throw new RuntimeException("shouldn't happen", e);
                }
            }
            c1806.mo9637();
            return c1806;
        }
        m39841(i2 + 2);
        throw null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C1868 m39843(C19883 c19883, int i, int i2) {
        if (i2 >= 2) {
            return new C1868("RuntimeInvisibleAnnotations", new C10005(c19883, i, i2).m25278(EnumC14363.BUILD), i2);
        }
        m39840();
        throw null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C3279 m39842(C19883 c19883, int i, int i2) {
        if (i2 >= 2) {
            return new C3279("RuntimeVisibleAnnotations", new C10005(c19883, i, i2).m25278(EnumC14363.RUNTIME), i2);
        }
        m39840();
        throw null;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C13802 m39838(C19883 c19883, int i, int i2) {
        if (i2 != 2) {
            m39841(2);
            throw null;
        }
        return new C13802((C17432) c19883.m45133().get(c19883.m45129().m33871(i)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39840() {
        throw new C1537("severely truncated attribute", null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39841(int i) {
        throw new C1537("bad attribute length; expected length ".concat(C22475.m49978(i)), null);
    }
}
