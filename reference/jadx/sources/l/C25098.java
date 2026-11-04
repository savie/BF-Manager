package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: l.᩻ܰ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 67L9 */
/* JADX INFO: loaded from: classes.dex */
public final class C25098 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C13477 f81170 = new C13477();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15252 f81171;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19571 f81172;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C7599 f81173;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C19991 f81174;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C14764 f81175;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C17340 f81176;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C11671 f81177 = new C11671(this);

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C7312 f81178;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3163 f81179;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC16722 f81180;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C25098 m55951(C4747 c4747) {
        C25098 c25098 = (C25098) c4747.m14643(f81170);
        return c25098 == null ? new C25098(c4747) : c25098;
    }

    public C25098(C4747 c4747) {
        c4747.m14646(f81170, this);
        this.f81171 = C15252.m36599(c4747);
        this.f81175 = C14764.m35506(c4747);
        this.f81180 = (InterfaceC16722) c4747.m14642(InterfaceC16722.class);
        this.f81178 = C7312.m20023(c4747);
        this.f81172 = C19571.m45162(c4747);
        this.f81174 = C19991.m45972(c4747);
        this.f81179 = C3163.m10345(c4747);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2920 m55956(AbstractC19728 abstractC19728) {
        C2920 c2920M35515 = this.f81175.m35515(abstractC19728);
        m55958(c2920M35515);
        return c2920M35515;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55958(C2920 c2920) {
        EnumC13603 enumC13603 = c2920.f38066;
        EnumC13603 enumC13604 = EnumC13603.f43208;
        if (enumC13603 != enumC13604 && c2920.f9542 == null && c2920.f9548 == null && m55952(c2920).isEmpty()) {
            c2920.f38066 = enumC13604;
        }
        if (c2920.f38066 != enumC13604) {
            C24550 c24550 = c2920.f9544;
            if (c24550.f79584 == null && c24550.f79575 == null) {
                m55955(c2920);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55957() {
        for (C2920 c2920 : m55952(null)) {
            if (c2920.f38066 != EnumC13603.f43208) {
                C24550 c24550 = c2920.f9544;
                if (c24550.f79584 == null && c24550.f79575 == null) {
                    m55955(c2920);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C2920 m55959() {
        C2920 c2920M55948;
        try {
            InterfaceC15976 interfaceC15976M55949 = m55949(EnumC6282.SOURCE_PATH, EnumC17468.SOURCE);
            EnumC6282 enumC6282 = EnumC6282.CLASS_OUTPUT;
            InterfaceC15976 interfaceC15976M559410 = m55949(enumC6282, EnumC17468.CLASS);
            if (interfaceC15976M55949 == null) {
                interfaceC15976M55949 = interfaceC15976M559410;
            } else if (interfaceC15976M559410 != null) {
                interfaceC15976M55949 = this.f81172.m45171(interfaceC15976M55949, interfaceC15976M559410);
            }
            if (interfaceC15976M55949 == null) {
                c2920M55948 = this.f81175.f48308;
            } else {
                c2920M55948 = m55948(interfaceC15976M55949);
            }
            if (c2920M55948.f9549 == null) {
                c2920M55948.f9548 = enumC6282;
                return c2920M55948;
            }
            c2920M55948.f9559 = enumC6282;
            return c2920M55948;
        } catch (IOException e) {
            throw new Error(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C2920 m55948(InterfaceC15976 interfaceC15976) {
        AbstractC19728 abstractC19728M14936;
        int i = C1977.f6631[interfaceC15976.mo10885().ordinal()];
        C14764 c14764 = this.f81175;
        C15252 c15252 = this.f81171;
        if (i == 1) {
            abstractC19728M14936 = C4878.m14936((C4878) this.f81176.f56446, interfaceC15976);
            if (abstractC19728M14936 == null) {
                throw new C10620(c14764.m35519(c15252.f49759, c14764.f48299), interfaceC15976, this.f81174.m45975(C19859.f63827), this.f81174, this.f81179);
            }
        } else {
            if (i != 2) {
                C11972.m30019();
                throw null;
            }
            try {
                abstractC19728M14936 = c15252.f49864.m51194(m55953(interfaceC15976));
            } catch (IOException | C0141 unused) {
                abstractC19728M14936 = c15252.f49822;
            }
        }
        C2920 c2920M35515 = c14764.m35515(abstractC19728M14936);
        C24550 c24550 = c2920M35515.f9544;
        if (c24550.f79575 == null) {
            c24550.f79575 = interfaceC15976;
            EnumC6282 enumC6282 = EnumC6282.PATCH_MODULE_PATH;
            InterfaceC16722 interfaceC16722 = this.f81180;
            boolean zMo6989 = interfaceC16722.mo6989(enumC6282);
            C19571 c19571 = this.f81172;
            if (zMo6989 && abstractC19728M14936 != c15252.f49822) {
                InterfaceC24928 interfaceC24928Mo6994 = interfaceC16722.mo6994(enumC6282, abstractC19728M14936.toString());
                c2920M35515.f9549 = interfaceC24928Mo6994;
                if (interfaceC24928Mo6994 != null) {
                    EnumC6282 enumC6283 = EnumC6282.CLASS_OUTPUT;
                    EnumC17468 enumC17468 = EnumC17468.CLASS;
                    InterfaceC15976 interfaceC15976M55949 = m55949(enumC6283, enumC17468);
                    InterfaceC15976 interfaceC15976M559410 = m55949(c2920M35515.f9549, enumC17468);
                    if (interfaceC15976M559410 != null) {
                        interfaceC15976M55949 = interfaceC15976M55949 == null ? interfaceC15976M559410 : c19571.m45171(interfaceC15976M559410, interfaceC15976M55949);
                    }
                    InterfaceC15976 interfaceC15976M559411 = m55949(c2920M35515.f9549, EnumC17468.SOURCE);
                    if (interfaceC15976M559411 != null) {
                        interfaceC15976M55949 = interfaceC15976M55949 == null ? interfaceC15976M559411 : c19571.m45171(interfaceC15976M559411, interfaceC15976M55949);
                    }
                    if (interfaceC15976M55949 != null) {
                        c2920M35515.f9544.f79575 = interfaceC15976M55949;
                    }
                }
            }
            c2920M35515.f38070 = InterfaceC14852.f48554;
            c19571.m45173(c2920M35515.f9544);
        }
        return c2920M35515;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private String m55953(InterfaceC15976 interfaceC15976) throws IOException {
        if (this.f81173 == null) {
            this.f81173 = new C7599();
        }
        C7599 c7599 = this.f81173;
        c7599.getClass();
        InputStream inputStreamMo10889 = interfaceC15976.mo10889();
        try {
            String strM20764 = c7599.m20764(inputStreamMo10889);
            if (inputStreamMo10889 != null) {
                inputStreamMo10889.close();
            }
            return strM20764;
        } catch (Throwable th) {
            if (inputStreamMo10889 != null) {
                try {
                    inputStreamMo10889.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private InterfaceC15976 m55949(InterfaceC24928 interfaceC24928, EnumC17468 enumC17468) {
        if (interfaceC24928 == null) {
            return null;
        }
        InterfaceC16722 interfaceC16722 = this.f81180;
        if (interfaceC16722.mo6989(interfaceC24928)) {
            return interfaceC16722.mo6983(interfaceC24928, this.f81171.f49759.toString(), enumC17468);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private C14769 m55952(C2920 c2920) {
        C15515 c15515;
        C18499 c18499 = new C18499();
        HashMap map = new HashMap();
        EnumC6282 enumC6282 = EnumC6282.MODULE_SOURCE_PATH;
        InterfaceC16722 interfaceC16722 = this.f81180;
        boolean zMo6989 = interfaceC16722.mo6989(enumC6282);
        while (true) {
            C11671 c11671 = this.f81177;
            if (c11671.hasNext()) {
                c11671.hasNext();
                Set<InterfaceC24928> set = c11671.f37819;
                if (set != null) {
                    c11671.f37819 = null;
                    map.clear();
                    for (InterfaceC24928 interfaceC24928 : set) {
                        try {
                            AbstractC19728 abstractC19728M51194 = this.f81171.f49864.m51194(interfaceC16722.mo6996(interfaceC24928));
                            if (map.put(abstractC19728M51194, interfaceC24928) == null) {
                                C2920 c2920M35515 = this.f81175.m35515(abstractC19728M51194);
                                if (c2920M35515.f9542 == null && c2920M35515.f9548 == null) {
                                    EnumC6282 enumC6283 = EnumC6282.PATCH_MODULE_PATH;
                                    if (interfaceC16722.mo6989(enumC6283) && c2920M35515.f9549 == null) {
                                        InterfaceC24928 interfaceC24928Mo6994 = interfaceC16722.mo6994(enumC6283, c2920M35515.f38072.toString());
                                        c2920M35515.f9549 = interfaceC24928Mo6994;
                                        if (interfaceC24928Mo6994 != null && zMo6989) {
                                            EnumC6282 enumC6284 = EnumC6282.CLASS_OUTPUT;
                                            if (interfaceC16722.mo6989(enumC6284)) {
                                                c2920M35515.f9559 = interfaceC16722.mo6994(enumC6284, c2920M35515.f38072.toString());
                                            }
                                        }
                                    }
                                    if (c11671.f37818 == EnumC6282.MODULE_SOURCE_PATH) {
                                        c2920M35515.f9542 = interfaceC24928;
                                        EnumC6282 enumC6285 = EnumC6282.CLASS_OUTPUT;
                                        if (interfaceC16722.mo6989(enumC6285)) {
                                            c2920M35515.f9548 = interfaceC16722.mo6994(enumC6285, c2920M35515.f38072.toString());
                                        }
                                    } else {
                                        c2920M35515.f9548 = interfaceC24928;
                                    }
                                    EnumC6282 enumC6286 = c11671.f37818;
                                    if (enumC6286 == EnumC6282.SYSTEM_MODULES || enumC6286 == EnumC6282.UPGRADE_MODULE_PATH) {
                                        c2920M35515.f38071 |= 9007199254740992L;
                                    }
                                    if (c2920 == null || (c2920 == c2920M35515 && (c2920M35515.f9542 != null || c2920M35515.f9548 != null))) {
                                        c18499.m43089(c2920M35515);
                                    }
                                }
                            } else {
                                C7312 c7312 = this.f81178;
                                int i = C1977.f6632[c11671.f37818.ordinal()];
                                if (i == 1) {
                                    c15515 = C19859.f63875;
                                } else if (i == 2) {
                                    c15515 = C19859.f63866;
                                } else if (i == 3) {
                                    c15515 = C19859.f63811;
                                } else if (i == 4) {
                                    c15515 = C19859.f63834;
                                } else {
                                    throw new AssertionError();
                                }
                                C11040 c11040 = C22843.f74058;
                                c7312.m34525(new C11040("compiler", "duplicate.module.on.path", c15515, abstractC19728M51194));
                            }
                        } catch (IOException unused) {
                        }
                    }
                    if (c2920 != null && c18499.m43096()) {
                        return c18499.m43093();
                    }
                } else {
                    throw new NoSuchElementException();
                }
            } else {
                return c18499.m43093();
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m55955(C2920 c2920) {
        InterfaceC24928 interfaceC24928;
        try {
            InterfaceC24928 interfaceC24929 = c2920.f9559;
            EnumC17468 enumC17468 = EnumC17468.CLASS;
            InterfaceC15976 interfaceC15976M55949 = m55949(interfaceC24929, enumC17468);
            InterfaceC15976 interfaceC15976M559410 = m55949(c2920.f9549, enumC17468);
            C19571 c19571 = this.f81172;
            if (interfaceC15976M559410 != null) {
                interfaceC15976M55949 = interfaceC15976M55949 == null ? interfaceC15976M559410 : c19571.m45171(interfaceC15976M559410, interfaceC15976M55949);
            }
            InterfaceC24928 interfaceC249210 = c2920.f9549;
            EnumC17468 enumC17469 = EnumC17468.SOURCE;
            InterfaceC15976 interfaceC15976M559411 = m55949(interfaceC249210, enumC17469);
            if (interfaceC15976M559411 != null) {
                interfaceC15976M55949 = interfaceC15976M55949 == null ? interfaceC15976M559411 : c19571.m45171(interfaceC15976M559411, interfaceC15976M55949);
            }
            if (interfaceC15976M55949 == null) {
                interfaceC15976M55949 = m55949(c2920.f9548, enumC17468);
                InterfaceC15976 interfaceC15976M559412 = m55949(c2920.f9542, enumC17469);
                if (interfaceC15976M559412 != null) {
                    interfaceC15976M55949 = interfaceC15976M55949 == null ? interfaceC15976M559412 : c19571.m45171(interfaceC15976M559412, interfaceC15976M55949);
                }
            }
            if (interfaceC15976M55949 == null) {
                if (((c2920.f9542 != null || (interfaceC24928 = c2920.f9548) == null) ? null : this.f81180.mo6996(interfaceC24928)) != null) {
                    c2920.f9544.f79575 = null;
                    c2920.f38071 |= 4503599627370496L;
                    return;
                } else {
                    c2920.f38066 = EnumC13603.f43208;
                    return;
                }
            }
            C24550 c24550 = c2920.f9544;
            c24550.f79575 = interfaceC15976M55949;
            c24550.f38070 = new C5706(this, c2920);
        } catch (IOException unused) {
            c2920.f38066 = EnumC13603.f43208;
        }
    }
}
