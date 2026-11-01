package l;

/* JADX INFO: renamed from: l.ۧ᩸ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78KJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C11269 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28235(int i, C0987 c0987, C10471 c10471, C0987 c0988, C0987... c0987Arr) {
        if (c0988 == null) {
            c0988 = new C0987(new InterfaceC22155[0]);
        }
        if (c0987 != null) {
            for (int i2 = 0; i2 < c0987.m3789(); i2++) {
                InterfaceC22155 interfaceC22155M3793 = c0987.m3793(i2);
                if (interfaceC22155M3793 instanceof C19395) {
                    C19395 c19395 = (C19395) interfaceC22155M3793;
                    if (!c19395.f62529.equals("com.android.capture.fps")) {
                        c0988 = c0988.m3792(c19395);
                    } else if (i == 2) {
                        c0988 = c0988.m3792(c19395);
                    }
                }
            }
        }
        for (C0987 c0989 : c0987Arr) {
            c0988 = c0988.m3791(c0989);
        }
        if (c0988.m3789() > 0) {
            c10471.m26504(c0988);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static AbstractC22370 m28237(C2460 c2460) {
        int iM7499 = c2460.m7499() + c2460.m7500();
        int iM74910 = c2460.m7499();
        int i = (iM74910 >> 24) & 255;
        AbstractC22370 c4730 = null;
        try {
            if (i == 169 || i == 253) {
                int i2 = 16777215 & iM74910;
                if (i2 == 6516084) {
                    int iM74911 = c2460.m7499();
                    if (c2460.m7499() == 1684108385) {
                        c2460.m7535(8);
                        String strM7522 = c2460.m7522(iM74911 - 16);
                        c4730 = new C4730("und", strM7522, strM7522);
                    } else {
                        C0303.m1848("Failed to parse comment attribute: " + AbstractC20806.m46786(iM74910));
                    }
                    c2460.m7510(iM7499);
                    return c4730;
                }
                if (i2 == 7233901 || i2 == 7631467) {
                    C23076 c23076M28238 = m28238(iM74910, c2460, "TIT2");
                    c2460.m7510(iM7499);
                    return c23076M28238;
                }
                if (i2 == 6516589 || i2 == 7828084) {
                    C23076 c23076M28239 = m28238(iM74910, c2460, "TCOM");
                    c2460.m7510(iM7499);
                    return c23076M28239;
                }
                if (i2 == 6578553) {
                    C23076 c23076M282310 = m28238(iM74910, c2460, "TDRC");
                    c2460.m7510(iM7499);
                    return c23076M282310;
                }
                if (i2 == 4280916) {
                    C23076 c23076M282311 = m28238(iM74910, c2460, "TPE1");
                    c2460.m7510(iM7499);
                    return c23076M282311;
                }
                if (i2 == 7630703) {
                    C23076 c23076M282312 = m28238(iM74910, c2460, "TSSE");
                    c2460.m7510(iM7499);
                    return c23076M282312;
                }
                if (i2 == 6384738) {
                    C23076 c23076M282313 = m28238(iM74910, c2460, "TALB");
                    c2460.m7510(iM7499);
                    return c23076M282313;
                }
                if (i2 == 7108978) {
                    C23076 c23076M282314 = m28238(iM74910, c2460, "USLT");
                    c2460.m7510(iM7499);
                    return c23076M282314;
                }
                if (i2 == 6776174) {
                    C23076 c23076M282315 = m28238(iM74910, c2460, "TCON");
                    c2460.m7510(iM7499);
                    return c23076M282315;
                }
                if (i2 == 6779504) {
                    C23076 c23076M282316 = m28238(iM74910, c2460, "TIT1");
                    c2460.m7510(iM7499);
                    return c23076M282316;
                }
            } else {
                if (iM74910 == 1735291493) {
                    String strM4397 = C1202.m4397(m28236(c2460) - 1);
                    if (strM4397 != null) {
                        c4730 = new C23076("TCON", null, AbstractC22433.of((Object) strM4397));
                    } else {
                        C0303.m1848("Failed to parse standard genre code");
                    }
                    c2460.m7510(iM7499);
                    return c4730;
                }
                if (iM74910 == 1684632427) {
                    C23076 c23076M28234 = m28234(iM74910, c2460, "TPOS");
                    c2460.m7510(iM7499);
                    return c23076M28234;
                }
                if (iM74910 == 1953655662) {
                    C23076 c23076M28235 = m28234(iM74910, c2460, "TRCK");
                    c2460.m7510(iM7499);
                    return c23076M28235;
                }
                if (iM74910 == 1953329263) {
                    AbstractC22370 abstractC22370M28233 = m28233(iM74910, "TBPM", c2460, true, false);
                    c2460.m7510(iM7499);
                    return abstractC22370M28233;
                }
                if (iM74910 == 1668311404) {
                    AbstractC22370 abstractC22370M28234 = m28233(iM74910, "TCMP", c2460, true, true);
                    c2460.m7510(iM7499);
                    return abstractC22370M28234;
                }
                if (iM74910 == 1668249202) {
                    C14839 c14839M28231 = m28231(c2460);
                    c2460.m7510(iM7499);
                    return c14839M28231;
                }
                if (iM74910 == 1631670868) {
                    C23076 c23076M282317 = m28238(iM74910, c2460, "TPE2");
                    c2460.m7510(iM7499);
                    return c23076M282317;
                }
                if (iM74910 == 1936682605) {
                    C23076 c23076M282318 = m28238(iM74910, c2460, "TSOT");
                    c2460.m7510(iM7499);
                    return c23076M282318;
                }
                if (iM74910 == 1936679276) {
                    C23076 c23076M282319 = m28238(iM74910, c2460, "TSOA");
                    c2460.m7510(iM7499);
                    return c23076M282319;
                }
                if (iM74910 == 1936679282) {
                    C23076 c23076M282320 = m28238(iM74910, c2460, "TSOP");
                    c2460.m7510(iM7499);
                    return c23076M282320;
                }
                if (iM74910 == 1936679265) {
                    C23076 c23076M282321 = m28238(iM74910, c2460, "TSO2");
                    c2460.m7510(iM7499);
                    return c23076M282321;
                }
                if (iM74910 == 1936679791) {
                    C23076 c23076M282322 = m28238(iM74910, c2460, "TSOC");
                    c2460.m7510(iM7499);
                    return c23076M282322;
                }
                if (iM74910 == 1920233063) {
                    AbstractC22370 abstractC22370M28235 = m28233(iM74910, "ITUNESADVISORY", c2460, false, false);
                    c2460.m7510(iM7499);
                    return abstractC22370M28235;
                }
                if (iM74910 == 1885823344) {
                    AbstractC22370 abstractC22370M28236 = m28233(iM74910, "ITUNESGAPLESS", c2460, false, true);
                    c2460.m7510(iM7499);
                    return abstractC22370M28236;
                }
                if (iM74910 == 1936683886) {
                    C23076 c23076M282323 = m28238(iM74910, c2460, "TVSHOWSORT");
                    c2460.m7510(iM7499);
                    return c23076M282323;
                }
                if (iM74910 == 1953919848) {
                    C23076 c23076M282324 = m28238(iM74910, c2460, "TVSHOW");
                    c2460.m7510(iM7499);
                    return c23076M282324;
                }
                if (iM74910 == 757935405) {
                    int i3 = -1;
                    int i4 = -1;
                    String strM7523 = null;
                    String strM7524 = null;
                    while (c2460.m7500() < iM7499) {
                        int iM7500 = c2460.m7500();
                        int iM74912 = c2460.m7499();
                        int iM74913 = c2460.m7499();
                        c2460.m7535(4);
                        if (iM74913 == 1835360622) {
                            strM7523 = c2460.m7522(iM74912 - 12);
                        } else if (iM74913 == 1851878757) {
                            strM7524 = c2460.m7522(iM74912 - 12);
                        } else {
                            if (iM74913 == 1684108385) {
                                i3 = iM7500;
                                i4 = iM74912;
                            }
                            c2460.m7535(iM74912 - 12);
                        }
                    }
                    if (strM7523 != null && strM7524 != null && i3 != -1) {
                        c2460.m7510(i3);
                        c2460.m7535(16);
                        c4730 = new C13198(strM7523, strM7524, c2460.m7522(i4 - 16));
                    }
                    c2460.m7510(iM7499);
                    return c4730;
                }
            }
            C0303.m1849("Skipped unknown metadata entry: " + AbstractC20806.m46786(iM74910));
            c2460.m7510(iM7499);
            return null;
        } catch (Throwable th) {
            c2460.m7510(iM7499);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19395 m28232(C0987 c0987, String str) {
        for (int i = 0; i < c0987.m3789(); i++) {
            InterfaceC22155 interfaceC22155M3793 = c0987.m3793(i);
            if (interfaceC22155M3793 instanceof C19395) {
                C19395 c19395 = (C19395) interfaceC22155M3793;
                if (c19395.f62529.equals(str)) {
                    return c19395;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C23076 m28238(int i, C2460 c2460, String str) {
        int iM7499 = c2460.m7499();
        if (c2460.m7499() == 1684108385) {
            c2460.m7535(8);
            return new C23076(str, null, AbstractC22433.of((Object) c2460.m7522(iM7499 - 16)));
        }
        C0303.m1848("Failed to parse text attribute: " + AbstractC20806.m46786(i));
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC22370 m28233(int i, String str, C2460 c2460, boolean z, boolean z2) {
        int iM28236 = m28236(c2460);
        if (z2) {
            iM28236 = Math.min(1, iM28236);
        }
        if (iM28236 >= 0) {
            if (z) {
                return new C23076(str, null, AbstractC22433.of((Object) Integer.toString(iM28236)));
            }
            return new C4730("und", str, Integer.toString(iM28236));
        }
        C0303.m1848("Failed to parse uint8 attribute: " + AbstractC20806.m46786(i));
        return null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int m28236(C2460 c2460) {
        int iM7499 = c2460.m7499();
        if (c2460.m7499() == 1684108385) {
            c2460.m7535(8);
            int i = iM7499 - 16;
            if (i == 1) {
                return c2460.m7516();
            }
            if (i == 2) {
                return c2460.m7519();
            }
            if (i == 3) {
                return c2460.m7525();
            }
            if (i == 4 && (c2460.m7534() & 128) == 0) {
                return c2460.m7531();
            }
        }
        C0303.m1848("Failed to parse data atom to int");
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23076 m28234(int i, C2460 c2460, String str) {
        int iM7499 = c2460.m7499();
        if (c2460.m7499() == 1684108385 && iM7499 >= 22) {
            c2460.m7535(10);
            int iM7519 = c2460.m7519();
            if (iM7519 > 0) {
                String strM22141 = C8479.m22141(iM7519, "");
                int iM75110 = c2460.m7519();
                if (iM75110 > 0) {
                    strM22141 = strM22141 + "/" + iM75110;
                }
                return new C23076(str, null, AbstractC22433.of((Object) strM22141));
            }
        }
        C0303.m1848("Failed to parse index/count attribute: " + AbstractC20806.m46786(i));
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14839 m28231(C2460 c2460) {
        String str;
        int iM7499 = c2460.m7499();
        if (c2460.m7499() != 1684108385) {
            C0303.m1848("Failed to parse cover art attribute");
            return null;
        }
        int iM74910 = c2460.m7499();
        int i = C20441.f66270;
        int i2 = iM74910 & 16777215;
        if (i2 == 13) {
            str = "image/jpeg";
        } else {
            str = i2 == 14 ? "image/png" : null;
        }
        if (str == null) {
            C7309.m19506(i2, "Unrecognized cover art flags: ");
            return null;
        }
        c2460.m7535(4);
        int i3 = iM7499 - 16;
        byte[] bArr = new byte[i3];
        c2460.m7507(0, i3, bArr);
        return new C14839(3, str, null, bArr);
    }
}
