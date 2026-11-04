package l;

import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۗܽ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 78KJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3553 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11580(int i, C19378 c19378, C20124 c20124, C19378 c19379, C19378... c19378Arr) {
        if (c19379 == null) {
            c19379 = new C19378(new InterfaceC8191[0]);
        }
        if (c19378 != null) {
            for (int i2 = 0; i2 < c19378.m44819(); i2++) {
                InterfaceC8191 interfaceC8191M44820 = c19378.m44820(i2);
                if (interfaceC8191M44820 instanceof C21859) {
                    C21859 c21859 = (C21859) interfaceC8191M44820;
                    if (!c21859.f69685.equals("com.android.capture.fps")) {
                        c19379 = c19379.m44823(c21859);
                    } else if (i == 2) {
                        c19379 = c19379.m44823(c21859);
                    }
                }
            }
        }
        for (C19378 c193710 : c19378Arr) {
            c19379 = c19379.m44822(c193710);
        }
        if (c19379.m44819() > 0) {
            c20124.m46303(c19379);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static AbstractC19435 m11583(C21287 c21287) {
        int iM48500 = c21287.m48500() + c21287.m48516();
        int iM48501 = c21287.m48500();
        int i = (iM48501 >> 24) & 255;
        AbstractC19435 c14959 = null;
        try {
            if (i == 169 || i == 253) {
                int i2 = 16777215 & iM48501;
                if (i2 == 6516084) {
                    int iM48502 = c21287.m48500();
                    if (c21287.m48500() == 1684108385) {
                        c21287.m48503(8);
                        String strM48514 = c21287.m48514(iM48502 - 16);
                        c14959 = new C14959("und", strM48514, strM48514);
                    } else {
                        C1896.m6517("Failed to parse comment attribute: " + AbstractC15145.m36443(iM48501));
                    }
                    c21287.m48510(iM48500);
                    return c14959;
                }
                if (i2 == 7233901 || i2 == 7631467) {
                    C8993 c8993M11582 = m11582(iM48501, c21287, "TIT2");
                    c21287.m48510(iM48500);
                    return c8993M11582;
                }
                if (i2 == 6516589 || i2 == 7828084) {
                    C8993 c8993M11583 = m11582(iM48501, c21287, "TCOM");
                    c21287.m48510(iM48500);
                    return c8993M11583;
                }
                if (i2 == 6578553) {
                    C8993 c8993M11584 = m11582(iM48501, c21287, "TDRC");
                    c21287.m48510(iM48500);
                    return c8993M11584;
                }
                if (i2 == 4280916) {
                    C8993 c8993M11585 = m11582(iM48501, c21287, "TPE1");
                    c21287.m48510(iM48500);
                    return c8993M11585;
                }
                if (i2 == 7630703) {
                    C8993 c8993M11586 = m11582(iM48501, c21287, "TSSE");
                    c21287.m48510(iM48500);
                    return c8993M11586;
                }
                if (i2 == 6384738) {
                    C8993 c8993M11587 = m11582(iM48501, c21287, "TALB");
                    c21287.m48510(iM48500);
                    return c8993M11587;
                }
                if (i2 == 7108978) {
                    C8993 c8993M11588 = m11582(iM48501, c21287, "USLT");
                    c21287.m48510(iM48500);
                    return c8993M11588;
                }
                if (i2 == 6776174) {
                    C8993 c8993M11589 = m11582(iM48501, c21287, "TCON");
                    c21287.m48510(iM48500);
                    return c8993M11589;
                }
                if (i2 == 6779504) {
                    C8993 c8993M115810 = m11582(iM48501, c21287, "TIT1");
                    c21287.m48510(iM48500);
                    return c8993M115810;
                }
            } else {
                if (iM48501 == 1735291493) {
                    String strM26950 = C10484.m26950(m11581(c21287) - 1);
                    if (strM26950 != null) {
                        c14959 = new C8993("TCON", null, AbstractC1928.of((Object) strM26950));
                    } else {
                        C1896.m6517("Failed to parse standard genre code");
                    }
                    c21287.m48510(iM48500);
                    return c14959;
                }
                if (iM48501 == 1684632427) {
                    C8993 c8993M11576 = m11576(iM48501, c21287, "TPOS");
                    c21287.m48510(iM48500);
                    return c8993M11576;
                }
                if (iM48501 == 1953655662) {
                    C8993 c8993M11577 = m11576(iM48501, c21287, "TRCK");
                    c21287.m48510(iM48500);
                    return c8993M11577;
                }
                if (iM48501 == 1953329263) {
                    AbstractC19435 abstractC19435M11578 = m11578(iM48501, "TBPM", c21287, true, false);
                    c21287.m48510(iM48500);
                    return abstractC19435M11578;
                }
                if (iM48501 == 1668311404) {
                    AbstractC19435 abstractC19435M11579 = m11578(iM48501, "TCMP", c21287, true, true);
                    c21287.m48510(iM48500);
                    return abstractC19435M11579;
                }
                if (iM48501 == 1668249202) {
                    C12722 c12722M11577 = m11577(c21287);
                    c21287.m48510(iM48500);
                    return c12722M11577;
                }
                if (iM48501 == 1631670868) {
                    C8993 c8993M115811 = m11582(iM48501, c21287, "TPE2");
                    c21287.m48510(iM48500);
                    return c8993M115811;
                }
                if (iM48501 == 1936682605) {
                    C8993 c8993M115812 = m11582(iM48501, c21287, "TSOT");
                    c21287.m48510(iM48500);
                    return c8993M115812;
                }
                if (iM48501 == 1936679276) {
                    C8993 c8993M115813 = m11582(iM48501, c21287, "TSOA");
                    c21287.m48510(iM48500);
                    return c8993M115813;
                }
                if (iM48501 == 1936679282) {
                    C8993 c8993M115814 = m11582(iM48501, c21287, "TSOP");
                    c21287.m48510(iM48500);
                    return c8993M115814;
                }
                if (iM48501 == 1936679265) {
                    C8993 c8993M115815 = m11582(iM48501, c21287, "TSO2");
                    c21287.m48510(iM48500);
                    return c8993M115815;
                }
                if (iM48501 == 1936679791) {
                    C8993 c8993M115816 = m11582(iM48501, c21287, "TSOC");
                    c21287.m48510(iM48500);
                    return c8993M115816;
                }
                if (iM48501 == 1920233063) {
                    AbstractC19435 abstractC19435M115710 = m11578(iM48501, "ITUNESADVISORY", c21287, false, false);
                    c21287.m48510(iM48500);
                    return abstractC19435M115710;
                }
                if (iM48501 == 1885823344) {
                    AbstractC19435 abstractC19435M115711 = m11578(iM48501, "ITUNESGAPLESS", c21287, false, true);
                    c21287.m48510(iM48500);
                    return abstractC19435M115711;
                }
                if (iM48501 == 1936683886) {
                    C8993 c8993M115817 = m11582(iM48501, c21287, "TVSHOWSORT");
                    c21287.m48510(iM48500);
                    return c8993M115817;
                }
                if (iM48501 == 1953919848) {
                    C8993 c8993M115818 = m11582(iM48501, c21287, "TVSHOW");
                    c21287.m48510(iM48500);
                    return c8993M115818;
                }
                if (iM48501 == 757935405) {
                    int i3 = -1;
                    int i4 = -1;
                    String strM48515 = null;
                    String strM48516 = null;
                    while (c21287.m48516() < iM48500) {
                        int iM48516 = c21287.m48516();
                        int iM48503 = c21287.m48500();
                        int iM48504 = c21287.m48500();
                        c21287.m48503(4);
                        if (iM48504 == 1835360622) {
                            strM48515 = c21287.m48514(iM48503 - 12);
                        } else if (iM48504 == 1851878757) {
                            strM48516 = c21287.m48514(iM48503 - 12);
                        } else {
                            if (iM48504 == 1684108385) {
                                i3 = iM48516;
                                i4 = iM48503;
                            }
                            c21287.m48503(iM48503 - 12);
                        }
                    }
                    if (strM48515 != null && strM48516 != null && i3 != -1) {
                        c21287.m48510(i3);
                        c21287.m48503(16);
                        c14959 = new C1536(strM48515, strM48516, c21287.m48514(i4 - 16));
                    }
                    c21287.m48510(iM48500);
                    return c14959;
                }
            }
            C1896.m6511("Skipped unknown metadata entry: " + AbstractC15145.m36443(iM48501));
            c21287.m48510(iM48500);
            return null;
        } catch (Throwable th) {
            c21287.m48510(iM48500);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21859 m11579(C19378 c19378, String str) {
        for (int i = 0; i < c19378.m44819(); i++) {
            InterfaceC8191 interfaceC8191M44820 = c19378.m44820(i);
            if (interfaceC8191M44820 instanceof C21859) {
                C21859 c21859 = (C21859) interfaceC8191M44820;
                if (c21859.f69685.equals(str)) {
                    return c21859;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C8993 m11582(int i, C21287 c21287, String str) {
        int iM48500 = c21287.m48500();
        if (c21287.m48500() == 1684108385) {
            c21287.m48503(8);
            return new C8993(str, null, AbstractC1928.of((Object) c21287.m48514(iM48500 - 16)));
        }
        C1896.m6517("Failed to parse text attribute: " + AbstractC15145.m36443(i));
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC19435 m11578(int i, String str, C21287 c21287, boolean z, boolean z2) {
        int iM11581 = m11581(c21287);
        if (z2) {
            iM11581 = Math.min(1, iM11581);
        }
        if (iM11581 >= 0) {
            if (z) {
                return new C8993(str, null, AbstractC1928.of((Object) Integer.toString(iM11581)));
            }
            return new C14959("und", str, Integer.toString(iM11581));
        }
        C1896.m6517("Failed to parse uint8 attribute: " + AbstractC15145.m36443(i));
        return null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int m11581(C21287 c21287) {
        int iM48500 = c21287.m48500();
        if (c21287.m48500() == 1684108385) {
            c21287.m48503(8);
            int i = iM48500 - 16;
            if (i == 1) {
                return c21287.m48493();
            }
            if (i == 2) {
                return c21287.m48494();
            }
            if (i == 3) {
                return c21287.m48501();
            }
            if (i == 4 && (c21287.m48502() & 128) == 0) {
                return c21287.m48512();
            }
        }
        C1896.m6517("Failed to parse data atom to int");
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8993 m11576(int i, C21287 c21287, String str) {
        int iM48500 = c21287.m48500();
        if (c21287.m48500() == 1684108385 && iM48500 >= 22) {
            c21287.m48503(10);
            int iM48494 = c21287.m48494();
            if (iM48494 > 0) {
                String strM33382 = C13645.m33382(iM48494, "");
                int iM48495 = c21287.m48494();
                if (iM48495 > 0) {
                    strM33382 = strM33382 + "/" + iM48495;
                }
                return new C8993(str, null, AbstractC1928.of((Object) strM33382));
            }
        }
        C1896.m6517("Failed to parse index/count attribute: " + AbstractC15145.m36443(i));
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12722 m11577(C21287 c21287) {
        String str;
        int iM48500 = c21287.m48500();
        if (c21287.m48500() != 1684108385) {
            C1896.m6517("Failed to parse cover art attribute");
            return null;
        }
        int iM48501 = c21287.m48500();
        int i = C11756.f38004;
        int i2 = iM48501 & 16777215;
        if (i2 == 13) {
            str = "image/jpeg";
        } else {
            str = i2 == 14 ? "image/png" : null;
        }
        if (str == null) {
            j$$ExternalSyntheticOutline0.m(i2, "Unrecognized cover art flags: ");
            return null;
        }
        c21287.m48503(4);
        int i3 = iM48500 - 16;
        byte[] bArr = new byte[i3];
        c21287.m48490(0, i3, bArr);
        return new C12722(3, str, null, bArr);
    }
}
