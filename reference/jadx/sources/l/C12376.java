package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.۫ۧ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: I5XA */
/* JADX INFO: loaded from: classes3.dex */
public final class C12376 {

    /* JADX INFO: renamed from: ֡᩸ܿ, reason: not valid java name and contains not printable characters */
    private static final short[] f41360 = {4264, 12772, 12770, 12788, 12771, 12735, 12797, 12784, 12799, 12790, 12772, 12784, 12790, 12788, 12788, 12799, 12779, 12793, 12754, 12767, 12772, 12770, 12788, 12771, 12735, 12771, 12788, 12790, 12792, 12798, 12799, 12772, 12770, 12788, 12771, 12735, 12786, 12798, 12772, 12799, 12773, 12771, 12776};

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean f41361;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f41362;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean f41363;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean f41364;

    static {
        m30788();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005b  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b6  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30788() {
        short s = f41360[0];
        if (RunnableC3388.m10064()) {
            int i = s * 17726;
            if (RunnableC0195.f1321 < 0) {
                int i2 = ((s * s) + 78552769) - i < 0 ? 20549 : 12689;
                short[] sArr = f41360;
                if (C3535.m10431() <= 0) {
                    C3577.m10565();
                    if (C1461.f5957 <= 0) {
                        if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                            C1189.m4368();
                            C1148.m4232();
                        }
                    } else if (C1189.f5284 > 0) {
                        C1189.m4368();
                        C1148.m4232();
                    } else if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                        C1189.m4368();
                        C1148.m4232();
                    }
                } else {
                    String strM4892 = C1398.m4892(sArr, 1, 13, i2);
                    if (!C1419.m4973()) {
                        short[] sArr2 = f41360;
                        if (C0278.f1572 > 0) {
                            String property = System.getProperty(strM4892, C2124.m6685(sArr2, 14, 2, i2));
                            if (!C0526.f2219) {
                                short[] sArr3 = f41360;
                                if (C3660.f13403 >= 0) {
                                    C3577.m10565();
                                    if (C1461.f5957 <= 0) {
                                        if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                                            C1189.m4368();
                                            C1148.m4232();
                                        }
                                    }
                                } else {
                                    String strM10056 = RunnableC3388.m10056(sArr3, 16, 2, i2);
                                    boolean zM5058 = C1460.m5058(strM10056, property);
                                    if (RunnableC1895.f7152) {
                                        f41363 = zM5058;
                                        short[] sArr4 = f41360;
                                        if (C3577.f13150 < 0) {
                                            String strM45020 = C19806.m45020(sArr4, 18, 2, i2);
                                            if (!zM5058) {
                                                Locale locale = Locale.getDefault();
                                                if (C1460.m5058(strM10056, locale.getLanguage())) {
                                                    f41363 = true;
                                                    f41361 = AbstractC0464.m2315(strM45020, locale.getCountry());
                                                }
                                                f41362 = false;
                                                f41364 = false;
                                                return;
                                            }
                                            String property2 = System.getProperty(C10634.m26821(f41360, 20, 11, i2));
                                            if (property2 != null) {
                                                int iM9878 = ViewTreeObserverOnPreDrawListenerC3327.m9878(property2, 95);
                                                if (iM9878 >= 0) {
                                                    property2 = C3743.m10952(property2, 0, iM9878);
                                                }
                                            } else {
                                                short[] sArr5 = f41360;
                                                if (C2124.f7782 > 0) {
                                                    property2 = System.getProperty(C0278.m1774(sArr5, 31, 12, i2), "");
                                                }
                                            }
                                            f41362 = true;
                                            boolean zM5059 = C1460.m5058(strM45020, property2);
                                            f41361 = zM5059;
                                            f41364 = zM5059;
                                            return;
                                        }
                                    }
                                }
                            }
                            if (C1189.f5284 > 0) {
                                C1189.m4368();
                                C1148.m4232();
                            } else if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                                C1189.m4368();
                                C1148.m4232();
                            }
                        } else if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                            C1189.m4368();
                            C1148.m4232();
                        }
                    }
                }
            } else if (C1189.f5284 > 0) {
                C1189.m4368();
                C1148.m4232();
            } else if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                C1189.m4368();
                C1148.m4232();
            }
        } else {
            C1189.m4368();
            C1148.m4232();
        }
        C1668.m5583();
        C0817.m3399();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m30787() {
        return f41363;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean m30789() {
        return f41361;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m30791() {
        return f41362;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m30790() {
        return f41364;
    }
}
