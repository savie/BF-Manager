package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۢۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3BDE */
/* JADX INFO: loaded from: classes4.dex */
public final class C10107 extends C4142 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C10107 f32378 = new C10107();

    @Override // l.C4142
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC1159 mo13268(C18312 c18312, int i, String str, int i2, int i3) {
        int i4 = 0;
        if (i == 0) {
            if (str == "BootstrapMethods") {
                if (i3 < 2) {
                    m26061();
                    throw null;
                }
                C22460 c22460M42713 = c18312.m42713();
                int iM50641 = c22460M42713.m50641(i2);
                int i5 = i2 + 2;
                int i6 = i3 - 2;
                C9230 c9230M42711 = c18312.m42711();
                C1028 c1028M42710 = c18312.m42710();
                C20791 c20791 = new C20791(iM50641);
                for (int i7 = 0; i7 < iM50641; i7++) {
                    if (i6 < 4) {
                        throw new C7125("truncated attribute", null);
                    }
                    int iM50642 = c22460M42713.m50641(i5);
                    int iM50643 = c22460M42713.m50641(i5 + 2);
                    i5 += 4;
                    i6 -= 4;
                    if (i6 < iM50643 * 2) {
                        throw new C7125("truncated attribute", null);
                    }
                    C23775 c23775 = new C23775(iM50643);
                    int i8 = 0;
                    while (i8 < iM50643) {
                        c23775.mo31602(i8, c9230M42711.get(c22460M42713.m50641(i5)));
                        i8++;
                        i5 += 2;
                        i6 -= 2;
                    }
                    c23775.mo15005();
                    c20791.m47574(i7, c1028M42710, (C21165) c9230M42711.get(iM50642), c23775);
                }
                c20791.mo15005();
                if (i6 == 0) {
                    return new C21034(c20791);
                }
                m26062(i6);
                throw null;
            }
            if (str == "Deprecated") {
                if (i3 == 0) {
                    return new C7609("Deprecated");
                }
                m26062(0);
                throw null;
            }
            if (str == "EnclosingMethod") {
                if (i3 != 4) {
                    m26062(4);
                    throw null;
                }
                C22460 c22460M42714 = c18312.m42713();
                C9230 c9230M42712 = c18312.m42711();
                C1028 c1028 = (C1028) c9230M42712.get(c22460M42714.m50641(i2));
                int iM50644 = c22460M42714.m50641(i2 + 2);
                return new C18796(c1028, (C0282) (iM50644 != 0 ? c9230M42712.get(iM50644) : null));
            }
            if (str == "InnerClasses") {
                if (i3 < 2) {
                    m26061();
                    throw null;
                }
                C22460 c22460M42715 = c18312.m42713();
                C9230 c9230M42713 = c18312.m42711();
                int iM50645 = c22460M42715.m50641(i2);
                int i9 = i2 + 2;
                int i10 = iM50645 * 8;
                if (i3 - 2 != i10) {
                    m26062(i10 + 2);
                    throw null;
                }
                C17061 c17061 = new C17061(iM50645);
                while (i4 < iM50645) {
                    int iM50646 = c22460M42715.m50641(i9);
                    int iM50647 = c22460M42715.m50641(i9 + 2);
                    int iM50648 = c22460M42715.m50641(i9 + 4);
                    c17061.m40197(i4, (C1028) c9230M42713.get(iM50646), (C1028) (iM50647 == 0 ? null : c9230M42713.get(iM50647)), (C9976) (iM50648 == 0 ? null : c9230M42713.get(iM50648)), c22460M42715.m50641(i9 + 6));
                    i9 += 8;
                    i4++;
                }
                c17061.mo15005();
                return new C0897(c17061);
            }
            if (str == "RuntimeInvisibleAnnotations") {
                return m26064(c18312, i2, i3);
            }
            if (str == "RuntimeVisibleAnnotations") {
                return m26063(c18312, i2, i3);
            }
            if (str == "Synthetic") {
                if (i3 == 0) {
                    return new C15569("Synthetic");
                }
                m26062(0);
                throw null;
            }
            if (str == "Signature") {
                return m26065(c18312, i2, i3);
            }
            if (str == "SourceDebugExtension") {
                return new C23029(new C9976(c18312.m42713().m50638(i2, i2 + i3)));
            }
            if (str == "SourceFile") {
                if (i3 == 2) {
                    return new C20045((C9976) c18312.m42711().get(c18312.m42713().m50641(i2)));
                }
                m26062(2);
                throw null;
            }
        } else if (i == 1) {
            if (str == "ConstantValue") {
                if (i3 == 2) {
                    return new C0151((AbstractC2519) c18312.m42711().get(c18312.m42713().m50641(i2)));
                }
                m26062(2);
                throw null;
            }
            if (str == "Deprecated") {
                if (i3 == 0) {
                    return new C7609("Deprecated");
                }
                m26062(0);
                throw null;
            }
            if (str == "RuntimeInvisibleAnnotations") {
                return m26064(c18312, i2, i3);
            }
            if (str == "RuntimeVisibleAnnotations") {
                return m26063(c18312, i2, i3);
            }
            if (str == "Signature") {
                return m26065(c18312, i2, i3);
            }
            if (str == "Synthetic") {
                if (i3 == 0) {
                    return new C15569("Synthetic");
                }
                m26062(0);
                throw null;
            }
        } else if (i == 2) {
            if (str == "AnnotationDefault") {
                if (i3 >= 2) {
                    return new C14320(i3, new C24280(c18312, i2, i3).m54293());
                }
                m26061();
                throw null;
            }
            if (str == "Code") {
                if (i3 < 12) {
                    m26061();
                    throw null;
                }
                C22460 c22460M42716 = c18312.m42713();
                C9230 c9230M42714 = c18312.m42711();
                int iM50649 = c22460M42716.m50641(i2);
                int iM506410 = c22460M42716.m50641(i2 + 2);
                int iM506411 = c22460M42716.m50643(i2 + 4);
                int i11 = i2 + 8;
                int i12 = i3 - 8;
                if (i12 < iM506411 + 4) {
                    throw new C7125("truncated attribute", null);
                }
                int i13 = i11 + iM506411;
                int i14 = i12 - iM506411;
                C8112 c8112 = new C8112(c22460M42716.m50638(i11, i13), c9230M42714);
                int iM506412 = c22460M42716.m50641(i13);
                C4383 c4383 = iM506412 == 0 ? C4383.f15791 : new C4383(iM506412);
                int i15 = i13 + 2;
                int i16 = i14 - 2;
                if (i16 < (iM506412 * 8) + 2) {
                    throw new C7125("truncated attribute", null);
                }
                while (i4 < iM506412) {
                    int iM506413 = c22460M42716.m50641(i15);
                    int iM506414 = c22460M42716.m50641(i15 + 2);
                    int iM506415 = c22460M42716.m50641(i15 + 4);
                    int iM506416 = c22460M42716.m50641(i15 + 6);
                    c4383.m13992(i4, iM506413, iM506414, iM506415, (C1028) (iM506416 == 0 ? null : c9230M42714.get(iM506416)));
                    i15 += 8;
                    i16 -= 8;
                    i4++;
                }
                c4383.mo15005();
                C14582 c14582 = new C14582(c18312, 3, i15, this);
                C13836 c13836M35182 = c14582.m35182();
                c13836M35182.mo15005();
                int iM35181 = c14582.m35181() - i15;
                if (iM35181 == i16) {
                    return new C18050(iM50649, iM506410, c8112, c4383, c13836M35182);
                }
                m26062((i15 - i2) + iM35181);
                throw null;
            }
            if (str == "Deprecated") {
                if (i3 == 0) {
                    return new C7609("Deprecated");
                }
                m26062(0);
                throw null;
            }
            if (str == "Exceptions") {
                if (i3 < 2) {
                    m26061();
                    throw null;
                }
                int iM506417 = c18312.m42713().m50641(i2);
                int i17 = i2 + 2;
                int i18 = iM506417 * 2;
                if (i3 - 2 == i18) {
                    return new C9845(c18312.m42702(i17, iM506417));
                }
                m26062(i18 + 2);
                throw null;
            }
            if (str == "RuntimeInvisibleAnnotations") {
                return m26064(c18312, i2, i3);
            }
            if (str == "RuntimeVisibleAnnotations") {
                return m26063(c18312, i2, i3);
            }
            if (str == "RuntimeInvisibleParameterAnnotations") {
                if (i3 >= 2) {
                    return new C13574("RuntimeInvisibleParameterAnnotations", new C24280(c18312, i2, i3).m54295(EnumC7300.BUILD), i3);
                }
                m26061();
                throw null;
            }
            if (str == "RuntimeVisibleParameterAnnotations") {
                if (i3 >= 2) {
                    return new C22283("RuntimeVisibleParameterAnnotations", new C24280(c18312, i2, i3).m54295(EnumC7300.RUNTIME), i3);
                }
                m26061();
                throw null;
            }
            if (str == "Signature") {
                return m26065(c18312, i2, i3);
            }
            if (str == "Synthetic") {
                if (i3 == 0) {
                    return new C15569("Synthetic");
                }
                m26062(0);
                throw null;
            }
        } else if (i == 3) {
            if (str == "LineNumberTable") {
                if (i3 < 2) {
                    m26061();
                    throw null;
                }
                C22460 c22460M42717 = c18312.m42713();
                int iM506418 = c22460M42717.m50641(i2);
                int i19 = i2 + 2;
                int i20 = iM506418 * 4;
                if (i3 - 2 != i20) {
                    m26062(i20 + 2);
                    throw null;
                }
                C2891 c2891 = new C2891(iM506418);
                while (i4 < iM506418) {
                    c2891.m9515(i4, c22460M42717.m50641(i19), c22460M42717.m50641(i19 + 2));
                    i19 += 4;
                    i4++;
                }
                c2891.mo15005();
                return new C9099(c2891);
            }
            if (str == "LocalVariableTable") {
                if (i3 >= 2) {
                    C22460 c22460M42718 = c18312.m42713();
                    return new C2388("LocalVariableTable", m26060(c22460M42718.m50638(i2 + 2, i2 + i3), c18312.m42711(), c22460M42718.m50641(i2), false));
                }
                m26061();
                throw null;
            }
            if (str == "LocalVariableTypeTable") {
                if (i3 >= 2) {
                    C22460 c22460M42719 = c18312.m42713();
                    return new C8354("LocalVariableTypeTable", m26060(c22460M42719.m50638(i2 + 2, i2 + i3), c18312.m42711(), c22460M42719.m50641(i2), true));
                }
                m26061();
                throw null;
            }
        }
        C22460 c22460M427110 = c18312.m42713();
        c18312.m42711();
        return new C17807(str, c22460M427110, i2, i3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7366 m26060(C22460 c22460, C9230 c9230, int i, boolean z) {
        C9976 c9976;
        C9976 c9977;
        int i2 = i * 10;
        if (c22460.m50636() == i2) {
            C21714 c21714 = new C21714(new C10525(c22460));
            C7366 c7366 = new C7366(i);
            for (int i3 = 0; i3 < i; i3++) {
                try {
                    int unsignedShort = c21714.readUnsignedShort();
                    int unsignedShort2 = c21714.readUnsignedShort();
                    int unsignedShort3 = c21714.readUnsignedShort();
                    int unsignedShort4 = c21714.readUnsignedShort();
                    int unsignedShort5 = c21714.readUnsignedShort();
                    C9976 c9978 = (C9976) c9230.get(unsignedShort3);
                    C9976 c9979 = (C9976) c9230.get(unsignedShort4);
                    if (z) {
                        c9977 = null;
                        c9976 = c9979;
                    } else {
                        c9976 = null;
                        c9977 = c9979;
                    }
                    c7366.m20229(i3, unsignedShort, unsignedShort2, c9978, c9977, c9976, unsignedShort5);
                } catch (IOException e) {
                    throw new RuntimeException("shouldn't happen", e);
                }
            }
            c7366.mo15005();
            return c7366;
        }
        m26062(i2 + 2);
        throw null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C6863 m26064(C18312 c18312, int i, int i2) {
        if (i2 >= 2) {
            return new C6863("RuntimeInvisibleAnnotations", new C24280(c18312, i, i2).m54294(EnumC7300.BUILD), i2);
        }
        m26061();
        throw null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C5129 m26063(C18312 c18312, int i, int i2) {
        if (i2 >= 2) {
            return new C5129("RuntimeVisibleAnnotations", new C24280(c18312, i, i2).m54294(EnumC7300.RUNTIME), i2);
        }
        m26061();
        throw null;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C11094 m26065(C18312 c18312, int i, int i2) {
        if (i2 != 2) {
            m26062(2);
            throw null;
        }
        return new C11094((C9976) c18312.m42711().get(c18312.m42713().m50641(i)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26061() {
        throw new C7125("severely truncated attribute", null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26062(int i) {
        throw new C7125("bad attribute length; expected length ".concat(C5306.m15938(i)), null);
    }
}
