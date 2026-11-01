package l;

/* JADX INFO: renamed from: l.᩹۫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 75QI */
/* JADX INFO: loaded from: classes.dex */
public final class C22292 extends AbstractC10872 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C5358 f72826 = new C5358();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C5358 f72825 = new C5358();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C5358 f72827 = new C5358();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m49460(C9116 c9116) {
        if (c9116.f31044.size() == 0) {
            return false;
        }
        C13826 c13826 = new C13826();
        AbstractC4777 first = c9116.f31045.getFirst();
        boolean z = false;
        while (first != null) {
            try {
                c13826.mo33648(first);
                first = first.m13247();
            } catch (C5358 unused) {
                C5358 c5358 = f72826;
                C11709 c11709 = new C11709(c9116, first);
                try {
                    int i = C2535.f10041[first.f16801.ordinal()];
                    if (i == 2) {
                        c11709.mo2942(first.mo5126());
                    } else if (i == 3) {
                        EnumC2890 enumC2890 = first.f16795;
                        if (enumC2890 == EnumC2890.ASSIGN) {
                            int i2 = C2535.f10042[first.mo13244().f23823.ordinal()];
                            if (i2 == 4) {
                                c11709.mo2942(first.mo13244().mo19024());
                                c11709.mo2942(first.mo13244().mo19019());
                                c11709.mo2942(first.mo13245());
                            } else if (i2 == 5) {
                                c11709.mo2942(first.mo13244().mo19020());
                                c11709.mo2942(first.mo13245());
                            } else if (i2 == 10 || i2 == 11) {
                                c11709.mo2942(first.mo13245());
                            }
                        } else if (enumC2890 == EnumC2890.FILL_ARRAY_DATA) {
                            if (m49457(first.mo13244())) {
                                throw c5358;
                            }
                            c11709.mo2942(first.mo13244());
                        }
                    }
                } catch (C5358 e) {
                    if (e == c5358) {
                        c9116.f31045.m29526(first, C2660.m8187(C2058.m6555(new AbstractC7124[0], new String[0], "Ljava/lang/NullPointerException;")));
                    } else if (e == f72825) {
                        c9116.f31045.m29526(first, C2660.m8187(C2058.m6555(new AbstractC7124[]{new C14760("divide by zero")}, new String[]{"Ljava/lang/String;"}, "Ljava/lang/ArithmeticException;")));
                    } else if (e == f72827) {
                        c9116.f31045.m29526(first, C2660.m8187(C2058.m6555(new AbstractC7124[0], new String[0], "Ljava/lang/NegativeArraySizeException;")));
                    }
                }
                AbstractC4777 abstractC4777M13247 = first.m13247();
                c9116.f31045.m29522(first);
                first = abstractC4777M13247;
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m49457(AbstractC7124 abstractC7124) {
        if (abstractC7124.f23823 == EnumC9947.CONSTANT) {
            C14760 c14760 = (C14760) abstractC7124;
            if (C14760.f48275.equals(c14760.f48276)) {
                return true;
            }
            Object obj = c14760.f48276;
            if ((obj instanceof Number) && ((Number) obj).intValue() == 0) {
                return true;
            }
        }
        return false;
    }
}
