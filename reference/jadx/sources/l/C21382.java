package l;

/* JADX INFO: renamed from: l.᩶ܳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75QI */
/* JADX INFO: loaded from: classes5.dex */
public final class C21382 extends AbstractC8909 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C14668 f68099 = new C14668();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C14668 f68098 = new C14668();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C14668 f68097 = new C14668();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m48620(C13791 c13791) {
        if (c13791.f43751.size() == 0) {
            return false;
        }
        C6466 c6466 = new C6466();
        AbstractC12563 first = c13791.f43750.getFirst();
        boolean z = false;
        while (first != null) {
            try {
                c6466.mo18292(first);
                first = first.m31273();
            } catch (C14668 unused) {
                C14668 c14668 = f68099;
                C24366 c24366 = new C24366(c13791, first);
                try {
                    int i = C4228.f15426[first.f40352.ordinal()];
                    if (i == 2) {
                        c24366.mo37386(first.mo31271());
                    } else if (i == 3) {
                        EnumC20768 enumC20768 = first.f40344;
                        if (enumC20768 == EnumC20768.ASSIGN) {
                            int i2 = C4228.f15427[first.mo11730().f34921.ordinal()];
                            if (i2 == 4) {
                                c24366.mo37386(first.mo11730().mo27979());
                                c24366.mo37386(first.mo11730().mo27977());
                                c24366.mo37386(first.mo11728());
                            } else if (i2 == 5) {
                                c24366.mo37386(first.mo11730().mo20366());
                                c24366.mo37386(first.mo11728());
                            } else if (i2 == 10 || i2 == 11) {
                                c24366.mo37386(first.mo11728());
                            }
                        } else if (enumC20768 == EnumC20768.FILL_ARRAY_DATA) {
                            if (m48616(first.mo11730())) {
                                throw c14668;
                            }
                            c24366.mo37386(first.mo11730());
                        }
                    }
                } catch (C14668 e) {
                    if (e == c14668) {
                        c13791.f43750.m54765(first, C4360.m13863(C23840.m53164(new AbstractC11071[0], new String[0], "Ljava/lang/NullPointerException;")));
                    } else if (e == f68098) {
                        c13791.f43750.m54765(first, C4360.m13863(C23840.m53164(new AbstractC11071[]{new C16380("divide by zero")}, new String[]{"Ljava/lang/String;"}, "Ljava/lang/ArithmeticException;")));
                    } else if (e == f68097) {
                        c13791.f43750.m54765(first, C4360.m13863(C23840.m53164(new AbstractC11071[0], new String[0], "Ljava/lang/NegativeArraySizeException;")));
                    }
                }
                AbstractC12563 abstractC12563M31273 = first.m31273();
                c13791.f43750.m54761(first);
                first = abstractC12563M31273;
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m48616(AbstractC11071 abstractC11071) {
        if (abstractC11071.f34921 == EnumC22260.CONSTANT) {
            C16380 c16380 = (C16380) abstractC11071;
            if (C16380.f53171.equals(c16380.f53172)) {
                return true;
            }
            Object obj = c16380.f53172;
            if ((obj instanceof Number) && ((Number) obj).intValue() == 0) {
                return true;
            }
        }
        return false;
    }
}
