package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: l.᩻ᩴۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 67L9 */
/* JADX INFO: loaded from: classes.dex */
public final class C23882 {

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final C16576 f77360 = new C16576();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C9285 f77361;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13464 f77362;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C23942 f77363;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0576 f77364;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C20414 f77365;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C3836 f77366;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C23549 f77367;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C21410 f77368;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C4831 f77369;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C11182 f77370 = new C11182(this);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23882 m52634(C12343 c12343) {
        C23882 c23882 = (C23882) c12343.m30656(f77360);
        return c23882 == null ? new C23882(c12343) : c23882;
    }

    public C23882(C12343 c12343) {
        c12343.m30659(f77360, this);
        this.f77363 = C23942.m52776(c12343);
        this.f77366 = C3836.m11131(c12343);
        this.f77362 = (InterfaceC13464) c12343.m30655(InterfaceC13464.class);
        this.f77365 = C20414.m46161(c12343);
        this.f77364 = C0576.m2728(c12343);
        this.f77367 = C23549.m51906(c12343);
        this.f77369 = C4831.m13414(c12343);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19670 m52639(AbstractC11242 abstractC11242) {
        C19670 c19670M11146 = this.f77366.m11146(abstractC11242);
        m52641(c19670M11146);
        return c19670M11146;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52641(C19670 c19670) {
        EnumC10477 enumC10477 = c19670.f77452;
        EnumC10477 enumC10478 = EnumC10477.f35866;
        if (enumC10477 != enumC10478 && c19670.f63138 == null && c19670.f63152 == null && m52635(c19670).isEmpty()) {
            c19670.f77452 = enumC10478;
        }
        if (c19670.f77452 != enumC10478) {
            C22492 c22492 = c19670.f63139;
            if (c22492.f73415 == null && c22492.f73422 == null) {
                m52638(c19670);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52640() {
        for (C19670 c19670 : m52635(null)) {
            if (c19670.f77452 != EnumC10477.f35866) {
                C22492 c22492 = c19670.f63139;
                if (c22492.f73415 == null && c22492.f73422 == null) {
                    m52638(c19670);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C19670 m52642() {
        C19670 c19670M52633;
        try {
            InterfaceC2173 interfaceC2173M52632 = m52632(EnumC3584.SOURCE_PATH, EnumC11347.SOURCE);
            EnumC3584 enumC3584 = EnumC3584.CLASS_OUTPUT;
            InterfaceC2173 interfaceC2173M52633 = m52632(enumC3584, EnumC11347.CLASS);
            if (interfaceC2173M52632 == null) {
                interfaceC2173M52632 = interfaceC2173M52633;
            } else if (interfaceC2173M52633 != null) {
                interfaceC2173M52632 = this.f77364.m2735(interfaceC2173M52632, interfaceC2173M52633);
            }
            if (interfaceC2173M52632 == null) {
                c19670M52633 = this.f77366.f14288;
            } else {
                c19670M52633 = m52633(interfaceC2173M52632);
            }
            if (c19670M52633.f63143 == null) {
                c19670M52633.f63152 = enumC3584;
                return c19670M52633;
            }
            c19670M52633.f63136 = enumC3584;
            return c19670M52633;
        } catch (IOException e) {
            throw new Error(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C19670 m52633(InterfaceC2173 interfaceC2173) {
        AbstractC11242 abstractC11242M39711;
        int i = C6242.f21178[interfaceC2173.mo6760().ordinal()];
        C3836 c3836 = this.f77366;
        C23942 c23942 = this.f77363;
        if (i == 1) {
            abstractC11242M39711 = C16949.m39711((C16949) this.f77361.f31543, interfaceC2173);
            if (abstractC11242M39711 == null) {
                throw new C16100(c3836.m11147(c23942.f77609, c3836.f14216), interfaceC2173, this.f77367.m51910(C14707.f48083), this.f77367, this.f77369);
            }
        } else {
            if (i != 2) {
                C6171.m17170();
                throw null;
            }
            try {
                abstractC11242M39711 = c23942.f77631.m17389(m52636(interfaceC2173));
            } catch (IOException | C15061 unused) {
                abstractC11242M39711 = c23942.f77652;
            }
        }
        C19670 c19670M11146 = c3836.m11146(abstractC11242M39711);
        C22492 c22492 = c19670M11146.f63139;
        if (c22492.f73422 == null) {
            c22492.f73422 = interfaceC2173;
            EnumC3584 enumC3584 = EnumC3584.PATCH_MODULE_PATH;
            InterfaceC13464 interfaceC13464 = this.f77362;
            boolean zMo32953 = interfaceC13464.mo32953(enumC3584);
            C0576 c0576 = this.f77364;
            if (zMo32953 && abstractC11242M39711 != c23942.f77652) {
                InterfaceC4290 interfaceC4290Mo32957 = interfaceC13464.mo32957(enumC3584, abstractC11242M39711.toString());
                c19670M11146.f63143 = interfaceC4290Mo32957;
                if (interfaceC4290Mo32957 != null) {
                    EnumC3584 enumC3585 = EnumC3584.CLASS_OUTPUT;
                    EnumC11347 enumC11347 = EnumC11347.CLASS;
                    InterfaceC2173 interfaceC2173M52632 = m52632(enumC3585, enumC11347);
                    InterfaceC2173 interfaceC2173M52633 = m52632(c19670M11146.f63143, enumC11347);
                    if (interfaceC2173M52633 != null) {
                        interfaceC2173M52632 = interfaceC2173M52632 == null ? interfaceC2173M52633 : c0576.m2735(interfaceC2173M52633, interfaceC2173M52632);
                    }
                    InterfaceC2173 interfaceC2173M52634 = m52632(c19670M11146.f63143, EnumC11347.SOURCE);
                    if (interfaceC2173M52634 != null) {
                        interfaceC2173M52632 = interfaceC2173M52632 == null ? interfaceC2173M52634 : c0576.m2735(interfaceC2173M52634, interfaceC2173M52632);
                    }
                    if (interfaceC2173M52632 != null) {
                        c19670M11146.f63139.f73422 = interfaceC2173M52632;
                    }
                }
            }
            c19670M11146.f77451 = InterfaceC13320.f44208;
            c0576.m2739(c19670M11146.f63139);
        }
        return c19670M11146;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private String m52636(InterfaceC2173 interfaceC2173) throws IOException {
        if (this.f77368 == null) {
            this.f77368 = new C21410();
        }
        C21410 c21410 = this.f77368;
        c21410.getClass();
        InputStream inputStreamMo10167 = interfaceC2173.mo10167();
        try {
            String strM47953 = c21410.m47953(inputStreamMo10167);
            if (inputStreamMo10167 != null) {
                inputStreamMo10167.close();
            }
            return strM47953;
        } catch (Throwable th) {
            if (inputStreamMo10167 != null) {
                try {
                    inputStreamMo10167.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private InterfaceC2173 m52632(InterfaceC4290 interfaceC4290, EnumC11347 enumC11347) {
        if (interfaceC4290 == null) {
            return null;
        }
        InterfaceC13464 interfaceC13464 = this.f77362;
        if (interfaceC13464.mo32953(interfaceC4290)) {
            return interfaceC13464.mo32950(interfaceC4290, this.f77363.f77609.toString(), enumC11347);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private C21825 m52635(C19670 c19670) {
        C14377 c14377;
        C19003 c19003 = new C19003();
        HashMap map = new HashMap();
        EnumC3584 enumC3584 = EnumC3584.MODULE_SOURCE_PATH;
        InterfaceC13464 interfaceC13464 = this.f77362;
        boolean zMo32953 = interfaceC13464.mo32953(enumC3584);
        while (true) {
            C11182 c11182 = this.f77370;
            if (c11182.hasNext()) {
                c11182.hasNext();
                Set<InterfaceC4290> set = c11182.f37878;
                if (set != null) {
                    c11182.f37878 = null;
                    map.clear();
                    for (InterfaceC4290 interfaceC4290 : set) {
                        try {
                            AbstractC11242 abstractC11242M17389 = this.f77363.f77631.m17389(interfaceC13464.mo32946(interfaceC4290));
                            if (map.put(abstractC11242M17389, interfaceC4290) == null) {
                                C19670 c19670M11146 = this.f77366.m11146(abstractC11242M17389);
                                if (c19670M11146.f63138 == null && c19670M11146.f63152 == null) {
                                    EnumC3584 enumC3585 = EnumC3584.PATCH_MODULE_PATH;
                                    if (interfaceC13464.mo32953(enumC3585) && c19670M11146.f63143 == null) {
                                        InterfaceC4290 interfaceC4290Mo32957 = interfaceC13464.mo32957(enumC3585, c19670M11146.f77453.toString());
                                        c19670M11146.f63143 = interfaceC4290Mo32957;
                                        if (interfaceC4290Mo32957 != null && zMo32953) {
                                            EnumC3584 enumC3586 = EnumC3584.CLASS_OUTPUT;
                                            if (interfaceC13464.mo32953(enumC3586)) {
                                                c19670M11146.f63136 = interfaceC13464.mo32957(enumC3586, c19670M11146.f77453.toString());
                                            }
                                        }
                                    }
                                    if (c11182.f37874 == EnumC3584.MODULE_SOURCE_PATH) {
                                        c19670M11146.f63138 = interfaceC4290;
                                        EnumC3584 enumC3587 = EnumC3584.CLASS_OUTPUT;
                                        if (interfaceC13464.mo32953(enumC3587)) {
                                            c19670M11146.f63152 = interfaceC13464.mo32957(enumC3587, c19670M11146.f77453.toString());
                                        }
                                    } else {
                                        c19670M11146.f63152 = interfaceC4290;
                                    }
                                    EnumC3584 enumC3588 = c11182.f37874;
                                    if (enumC3588 == EnumC3584.SYSTEM_MODULES || enumC3588 == EnumC3584.UPGRADE_MODULE_PATH) {
                                        c19670M11146.f77447 |= 9007199254740992L;
                                    }
                                    if (c19670 == null || (c19670 == c19670M11146 && (c19670M11146.f63138 != null || c19670M11146.f63152 != null))) {
                                        c19003.m43723(c19670M11146);
                                    }
                                }
                            } else {
                                C20414 c20414 = this.f77365;
                                int i = C6242.f21179[c11182.f37874.ordinal()];
                                if (i == 1) {
                                    c14377 = C14707.f48105;
                                } else if (i == 2) {
                                    c14377 = C14707.f48040;
                                } else if (i == 3) {
                                    c14377 = C14707.f48095;
                                } else if (i == 4) {
                                    c14377 = C14707.f48081;
                                } else {
                                    throw new AssertionError();
                                }
                                C5909 c5909 = C23879.f77204;
                                c20414.m48197(new C5909("compiler", "duplicate.module.on.path", c14377, abstractC11242M17389));
                            }
                        } catch (IOException unused) {
                        }
                    }
                    if (c19670 != null && c19003.m43722()) {
                        return c19003.m43726();
                    }
                } else {
                    throw new NoSuchElementException();
                }
            } else {
                return c19003.m43726();
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m52638(C19670 c19670) {
        InterfaceC4290 interfaceC4290;
        try {
            InterfaceC4290 interfaceC4291 = c19670.f63136;
            EnumC11347 enumC11347 = EnumC11347.CLASS;
            InterfaceC2173 interfaceC2173M52632 = m52632(interfaceC4291, enumC11347);
            InterfaceC2173 interfaceC2173M52633 = m52632(c19670.f63143, enumC11347);
            C0576 c0576 = this.f77364;
            if (interfaceC2173M52633 != null) {
                interfaceC2173M52632 = interfaceC2173M52632 == null ? interfaceC2173M52633 : c0576.m2735(interfaceC2173M52633, interfaceC2173M52632);
            }
            InterfaceC4290 interfaceC4292 = c19670.f63143;
            EnumC11347 enumC11348 = EnumC11347.SOURCE;
            InterfaceC2173 interfaceC2173M52634 = m52632(interfaceC4292, enumC11348);
            if (interfaceC2173M52634 != null) {
                interfaceC2173M52632 = interfaceC2173M52632 == null ? interfaceC2173M52634 : c0576.m2735(interfaceC2173M52634, interfaceC2173M52632);
            }
            if (interfaceC2173M52632 == null) {
                interfaceC2173M52632 = m52632(c19670.f63152, enumC11347);
                InterfaceC2173 interfaceC2173M52635 = m52632(c19670.f63138, enumC11348);
                if (interfaceC2173M52635 != null) {
                    interfaceC2173M52632 = interfaceC2173M52632 == null ? interfaceC2173M52635 : c0576.m2735(interfaceC2173M52635, interfaceC2173M52632);
                }
            }
            if (interfaceC2173M52632 == null) {
                if (((c19670.f63138 != null || (interfaceC4290 = c19670.f63152) == null) ? null : this.f77362.mo32946(interfaceC4290)) != null) {
                    c19670.f63139.f73422 = null;
                    c19670.f77447 |= 4503599627370496L;
                    return;
                } else {
                    c19670.f77452 = EnumC10477.f35866;
                    return;
                }
            }
            C22492 c22492 = c19670.f63139;
            c22492.f73422 = interfaceC2173M52632;
            c22492.f77451 = new C17531(this, c19670);
        } catch (IOException unused) {
            c19670.f77452 = EnumC10477.f35866;
        }
    }
}
