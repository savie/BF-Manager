package l;

import java.io.IOException;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.֡ᩳۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P7M1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0576 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final C16576 f2500 = new C16576();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C4831 f2501;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC11242 f2502;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C23549 f2503;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17573 f2504;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13464 f2506;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f2507;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f2510;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C4146 f2511;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final AbstractC2380 f2512;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f2513;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C23942 f2514;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f2515;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C0429 f2516;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C3836 f2517;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f2519;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC4290 f2520;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C20414 f2521;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public InterfaceC13320 f2508 = InterfaceC13320.f44208;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public InterfaceC2173 f2505 = null;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C18280 f2509 = new C18280(11, this);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f2518 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13320 m2737() {
        return this.f2509;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0576 m2728(C12343 c12343) {
        C0576 c0576 = (C0576) c12343.m30656(f2500);
        return c0576 == null ? new C0576(c12343) : c0576;
    }

    public C0576(C12343 c12343) {
        AbstractC11242 abstractC11242M17389;
        c12343.m30659(f2500, this);
        this.f2516 = C0429.m2220(c12343);
        C23942 c23942M52776 = C23942.m52776(c12343);
        this.f2514 = c23942M52776;
        this.f2517 = C3836.m11131(c12343);
        InterfaceC13464 interfaceC13464 = (InterfaceC13464) c12343.m30655(InterfaceC13464.class);
        this.f2506 = interfaceC13464;
        this.f2512 = AbstractC2380.m7237(c12343);
        if (interfaceC13464 == null) {
            throw new AssertionError("FileManager initialization error");
        }
        this.f2503 = C23549.m51906(c12343);
        C4831 c4831M13414 = C4831.m13414(c12343);
        this.f2501 = c4831M13414;
        this.f2521 = C20414.m46161(c12343);
        this.f2504 = C17573.m40852(c12343);
        C14770 c14770M35395 = C14770.m35395(c12343);
        this.f2507 = c14770M35395.m35408(EnumC19730.f63380);
        this.f2513 = c14770M35395.m35404("dev");
        this.f2515 = "source".equals(c14770M35395.m35397("-Xprefer"));
        this.f2510 = c14770M35395.m35408(EnumC19730.f63387);
        if (c14770M35395.m35407("failcomplete")) {
            abstractC11242M17389 = c23942M52776.f77631.m17389(c14770M35395.m35397("failcomplete"));
        } else {
            abstractC11242M17389 = null;
        }
        this.f2502 = abstractC11242M17389;
        EnumC23528.m51835(c12343);
        C4146 c4146 = new C4146(null, new C21744(), c4831M13414);
        this.f2511 = c4146;
        c4146.setStackTrace(new StackTraceElement[0]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2729(final C0576 c0576, AbstractC23903 abstractC23903) {
        AbstractC2380 abstractC2380 = c0576.f2512;
        C17573 c17573 = c0576.f2504;
        EnumC10477 enumC10477 = abstractC23903.f77452;
        if (enumC10477 == EnumC10477.f35865) {
            try {
                C22492 c22492 = (C22492) abstractC23903;
                abstractC2380.mo7239(c22492, EnumC5992.CLASS_READER);
                c17573.m40875();
                c22492.f73417 = new C0993((AbstractC23903) c22492);
                m2733(c22492.f77448);
                c0576.m2734(c22492);
                c0576.m2739(c22492);
                c17573.m40877();
                abstractC2380.mo7238();
            } catch (Throwable th) {
                c17573.m40877();
                abstractC2380.mo7238();
                throw th;
            }
        } else if (enumC10477 == EnumC10477.f35867) {
            try {
                c0576.m2730((C7675) abstractC23903);
            } catch (IOException e) {
                C4146 c4146 = new C4146(abstractC23903, new Supplier() { // from class: l.᩵ᩳۤ
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        C23549 c23549 = this.f62998.f2503;
                        String localizedMessage = e.getLocalizedMessage();
                        C14377 c14377 = C14707.f48054;
                        return c23549.m51910(new C14377("compiler", "exception.message", localizedMessage));
                    }
                }, c0576.f2501);
                c4146.m11789(e);
                throw c4146;
            }
        }
        if (c0576.f2516.f1984) {
            return;
        }
        c17573.m40874();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2733(AbstractC23903 abstractC23903) {
        if (abstractC23903.f77452 != EnumC10477.f35867) {
            m2733(abstractC23903.f77448);
        }
        abstractC23903.mo49994();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m2734(C22492 c22492) {
        AbstractC23903 abstractC23903 = c22492.f77448;
        if (abstractC23903.f77452 == EnumC10477.f35867) {
            for (AbstractC11242 abstractC11242 : C17281.m40244(C17281.m40243(c22492.f77453))) {
                AbstractC23903 abstractC23903Mo3804 = abstractC23903.mo20272().mo3804(abstractC11242, (Predicate) null);
                if (abstractC23903Mo3804 == null) {
                    abstractC23903Mo3804 = this.f2517.m11155(c22492.m52724().f25392, AbstractC0618.m2875(abstractC11242, abstractC23903));
                }
                if (abstractC23903Mo3804 != null) {
                    abstractC23903Mo3804.mo49994();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2739(C22492 c22492) {
        C0429 c0429 = this.f2516;
        AbstractC11242 abstractC11242 = c22492.f73419;
        C4831 c4831 = this.f2501;
        if (this.f2502 == abstractC11242) {
            throw new C4146(c22492, new Supplier() { // from class: l.ᩴᩳۤ
                @Override // java.util.function.Supplier
                public final Object get() {
                    return this.f61216.f2503.m51910(C14707.f48053);
                }
            }, c4831);
        }
        InterfaceC2173 interfaceC2173 = c22492.f73422;
        int i = 1;
        if (interfaceC2173 != null) {
            InterfaceC2173 interfaceC2174 = this.f2505;
            AbstractC23903 abstractC23903 = c22492.f77448;
            try {
                try {
                    if (c0429.f1984) {
                        C6171.m17174("Filling " + interfaceC2173.toUri() + " during " + interfaceC2174);
                        throw null;
                    }
                    this.f2505 = interfaceC2173;
                    if (this.f2507) {
                        this.f2521.m46183("loading", interfaceC2173.getName());
                    }
                    if (interfaceC2173.mo6760() == EnumC11347.CLASS) {
                        c0429.m2238(c22492);
                        c22492.f77447 = c22492.f77447;
                    } else if (!this.f2508.mo1180()) {
                        this.f2508.mo1179(c22492);
                    } else {
                        throw new IllegalStateException("Source completer required to read " + interfaceC2173.toUri());
                    }
                    this.f2505 = interfaceC2174;
                    return;
                } catch (C16100 e) {
                    c22492.f77448 = abstractC23903;
                    AbstractC9462 abstractC9462 = c22492.f73417;
                    C1612 c1612 = new C1612(2);
                    abstractC9462.getClass();
                    C0356.forEach(abstractC9462.mo3802(c1612, EnumC10167.RECURSIVE), new C8339());
                    c22492.f73419 = abstractC11242;
                    c22492.f77453 = C17281.m40243(abstractC11242);
                    c22492.m49996();
                    throw e;
                }
            } catch (Throwable th) {
                this.f2505 = interfaceC2174;
                throw th;
            }
        }
        C17906 c17906 = new C17906(i, this, c22492);
        if (!this.f2513) {
            throw new C4146(c22492, c17906, c4831);
        }
        C4146 c4146 = this.f2511;
        c4146.f15170 = c22492;
        c4146.m11790(c17906);
        throw c4146;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22492 m2738(final C19670 c19670, final AbstractC11242 abstractC11242) {
        C6171.m17171(c19670);
        AbstractC11242 abstractC11242M28210 = abstractC11242.m28210(0, abstractC11242.m28208((byte) 46));
        C3836 c3836 = this.f2517;
        C7675 c7675M11152 = c3836.m11152(c19670, abstractC11242M28210);
        C6171.m17172(c7675M11152.f25392, new Supplier() { // from class: l.ᩳᩳۤ
            @Override // java.util.function.Supplier
            public final Object get() {
                return "msym=" + c19670 + "; flatName=" + ((Object) abstractC11242);
            }
        });
        boolean z = c3836.m11155(c7675M11152.f25392, abstractC11242) == null;
        C22492 c22492M11148 = c3836.m11148(c7675M11152.f25392, abstractC11242);
        if (c22492M11148.f73417 != null) {
            return c22492M11148;
        }
        try {
            c22492M11148.mo49994();
            return c22492M11148;
        } catch (C4146 e) {
            if (z) {
                c3836.m11141(c7675M11152.f25392, abstractC11242);
                e.f15169.m13417(c22492M11148);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2173 m2735(InterfaceC2173 interfaceC2173, InterfaceC2173 interfaceC2174) {
        if (this.f2515) {
            return interfaceC2173.mo6760() == EnumC11347.SOURCE ? interfaceC2173 : interfaceC2174;
        }
        return interfaceC2173.mo10163() > interfaceC2174.mo10163() ? interfaceC2173 : interfaceC2174;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2732(C7675 c7675, boolean z) {
        char c;
        EnumC11347 enumC11347 = EnumC11347.CLASS;
        EnumC11347 enumC11348 = EnumC11347.SOURCE;
        EnumSet enumSetOf = EnumSet.of(enumC11347, enumC11348);
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) enumSetOf);
        enumSetCopyOf.remove(enumC11348);
        boolean zIsEmpty = enumSetCopyOf.isEmpty();
        EnumSet enumSetCopyOf2 = EnumSet.copyOf((Collection) enumSetOf);
        enumSetCopyOf2.remove(enumC11347);
        boolean zIsEmpty2 = enumSetCopyOf2.isEmpty();
        InterfaceC13464 interfaceC13464 = this.f2506;
        boolean z2 = z && interfaceC13464.mo32953(EnumC3584.SOURCE_PATH);
        if (this.f2507 && this.f2518) {
            this.f2518 = false;
            if (interfaceC13464 instanceof InterfaceC0762) {
                InterfaceC0762 interfaceC0762 = (InterfaceC0762) interfaceC13464;
                C20414 c20414 = this.f2521;
                if (!z2 || zIsEmpty2) {
                    if (!zIsEmpty2) {
                        C21825 c21825M48588 = C21825.m48588();
                        Iterator it = interfaceC0762.mo3278(EnumC3584.CLASS_PATH).iterator();
                        while (it.hasNext()) {
                            c21825M48588 = c21825M48588.m48597((InterfaceC3800) it.next());
                        }
                        c20414.m46183("sourcepath", c21825M48588.m48589().m48590(","));
                    }
                    c = 0;
                } else {
                    C21825 c21825M48589 = C21825.m48588();
                    Iterator it2 = interfaceC0762.mo3278(EnumC3584.SOURCE_PATH).iterator();
                    while (it2.hasNext()) {
                        c21825M48589 = c21825M48589.m48597((InterfaceC3800) it2.next());
                    }
                    c = 0;
                    c20414.m46183("sourcepath", c21825M48589.m48589().m48590(","));
                }
                if (!zIsEmpty) {
                    C21825 c21825M485810 = C21825.m48588();
                    Iterator it3 = interfaceC0762.mo3278(EnumC3584.PLATFORM_CLASS_PATH).iterator();
                    while (it3.hasNext()) {
                        c21825M485810 = c21825M485810.m48597((InterfaceC3800) it3.next());
                    }
                    Iterator it4 = interfaceC0762.mo3278(EnumC3584.CLASS_PATH).iterator();
                    while (it4.hasNext()) {
                        c21825M485810 = c21825M485810.m48597((InterfaceC3800) it4.next());
                    }
                    Object[] objArr = new Object[1];
                    objArr[c] = c21825M485810.m48589().m48590(",");
                    c20414.m46183("classpath", objArr);
                }
            }
        }
        String string = c7675.f25396.toString();
        if (!zIsEmpty2 && !z2) {
            InterfaceC4290 interfaceC4290 = EnumC3584.CLASS_PATH;
            m2731(c7675, interfaceC4290, m2736(interfaceC4290, c7675, string, enumSetOf));
            return;
        }
        if (!zIsEmpty) {
            InterfaceC4290 interfaceC4291 = EnumC3584.CLASS_PATH;
            m2731(c7675, interfaceC4291, m2736(interfaceC4291, c7675, string, enumSetCopyOf));
        }
        if (zIsEmpty2) {
            return;
        }
        InterfaceC4290 interfaceC4292 = EnumC3584.SOURCE_PATH;
        m2731(c7675, interfaceC4292, m2736(interfaceC4292, c7675, string, enumSetCopyOf2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2730(C7675 c7675) {
        AbstractC9462 abstractC9462 = c7675.f25395;
        AbstractC11242 abstractC11242 = c7675.f25396;
        if (abstractC9462 == null) {
            c7675.f25395 = new C10873(c7675);
        }
        C19670 c19670 = c7675.f25392;
        C6171.m17172(c19670, new C21434(c7675, 1));
        c19670.mo49994();
        if (c19670 == this.f2517.f14249) {
            this.f2519 = false;
            if (this.f2510) {
                m2732(c7675, true);
                this.f2519 = true;
                InterfaceC4290 interfaceC4290 = EnumC3584.PLATFORM_CLASS_PATH;
                m2731(c7675, interfaceC4290, m2736(interfaceC4290, c7675, abstractC11242.toString(), EnumSet.of(EnumC11347.CLASS)));
                return;
            }
            InterfaceC4290 interfaceC4291 = EnumC3584.PLATFORM_CLASS_PATH;
            m2731(c7675, interfaceC4291, m2736(interfaceC4291, c7675, abstractC11242.toString(), EnumSet.of(EnumC11347.CLASS)));
            m2732(c7675, true);
            return;
        }
        if (c19670.f63152 != EnumC3584.CLASS_PATH) {
            EnumC11347 enumC11347 = EnumC11347.CLASS;
            EnumC11347 enumC11348 = EnumC11347.SOURCE;
            EnumSet enumSetOf = EnumSet.of(enumC11347, enumC11348);
            EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) enumSetOf);
            enumSetCopyOf.remove(enumC11348);
            boolean zIsEmpty = enumSetCopyOf.isEmpty();
            EnumSet enumSetCopyOf2 = EnumSet.copyOf((Collection) enumSetOf);
            enumSetCopyOf2.remove(enumC11347);
            boolean zIsEmpty2 = enumSetCopyOf2.isEmpty();
            String string = abstractC11242.toString();
            InterfaceC4290 interfaceC4292 = c19670.f63152;
            InterfaceC4290 interfaceC4293 = c19670.f63138;
            InterfaceC4290 interfaceC4294 = c19670.f63143;
            InterfaceC4290 interfaceC4295 = c19670.f63136;
            boolean z = this.f2519;
            try {
                this.f2519 = false;
                if (!zIsEmpty && interfaceC4295 != null) {
                    m2731(c7675, interfaceC4295, m2736(interfaceC4295, c7675, string, enumSetCopyOf));
                }
                if ((!zIsEmpty || !zIsEmpty2) && interfaceC4294 != null) {
                    EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC11347.class);
                    enumSetNoneOf.addAll(enumSetCopyOf);
                    enumSetNoneOf.addAll(enumSetCopyOf2);
                    m2731(c7675, interfaceC4294, m2736(interfaceC4294, c7675, string, enumSetNoneOf));
                }
                this.f2519 = true;
                if (!zIsEmpty && interfaceC4292 != null) {
                    m2731(c7675, interfaceC4292, m2736(interfaceC4292, c7675, string, enumSetCopyOf));
                }
                if (!zIsEmpty2 && interfaceC4293 != null) {
                    m2731(c7675, interfaceC4293, m2736(interfaceC4293, c7675, string, enumSetCopyOf2));
                }
                return;
            } finally {
                this.f2519 = z;
            }
        }
        m2732(c7675, c19670.f63138 == EnumC3584.SOURCE_PATH);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2731(C7675 c7675, InterfaceC4290 interfaceC4290, C9045 c9045) {
        C22492 c22492M11149;
        InterfaceC2173 interfaceC2173;
        this.f2520 = interfaceC4290;
        Iterator it = c9045.iterator();
        while (true) {
            C10456 c10456 = (C10456) it;
            if (!c10456.hasNext()) {
                return;
            }
            InterfaceC2173 interfaceC2174 = (InterfaceC2173) c10456.next();
            int i = C7633.f25202[interfaceC2174.mo6760().ordinal()];
            if (i == 2 || i == 3) {
                InterfaceC4290 interfaceC4291 = this.f2520;
                InterfaceC13464 interfaceC13464 = this.f2506;
                String strMo32948 = interfaceC13464.mo32948(interfaceC4291, interfaceC2174);
                String strSubstring = strMo32948.substring(strMo32948.lastIndexOf(".") + 1);
                if (EnumC12508.m31065(strSubstring) || strSubstring.equals("package-info")) {
                    if ((c7675.f77447 & X931RNG.BLOCK128_RESEED_MAX) == 0) {
                        for (AbstractC23903 abstractC23903 = c7675; abstractC23903 != null && abstractC23903.f77452 == EnumC10477.f35867; abstractC23903 = abstractC23903.f77448) {
                            abstractC23903.f77447 |= X931RNG.BLOCK128_RESEED_MAX;
                        }
                    }
                    int i2 = interfaceC2174.mo6760() == EnumC11347.CLASS ? 33554432 : 67108864;
                    String strMo32949 = interfaceC13464.mo32948(this.f2520, interfaceC2174);
                    String strSubstring2 = strMo32949.substring(strMo32949.lastIndexOf(".") + 1);
                    C23942 c23942 = this.f2514;
                    AbstractC11242 abstractC11242M17389 = c23942.f77631.m17389(strSubstring2);
                    boolean z = abstractC11242M17389 == c23942.f77545;
                    if (z) {
                        c22492M11149 = c7675.f25394;
                    } else {
                        c22492M11149 = (C22492) ((C10873) c7675.f25395).m27242(abstractC11242M17389, null).f72486;
                    }
                    if (c22492M11149 == null) {
                        c22492M11149 = this.f2517.m11149(c7675.f25392, abstractC11242M17389, c7675);
                        if (c22492M11149.f73422 == null) {
                            c22492M11149.f73422 = interfaceC2174;
                        }
                        if (z) {
                            c7675.f25394 = c22492M11149;
                        } else if (c22492M11149.f77448 == c7675) {
                            c7675.f25395.mo24224(c22492M11149);
                        }
                    } else if (!this.f2519 && (interfaceC2173 = c22492M11149.f73422) != null) {
                        long j = c22492M11149.f77447;
                        if ((((long) i2) & j) == 0 && (j & 100663296) != 0) {
                            c22492M11149.f73422 = m2735(interfaceC2174, interfaceC2173);
                        }
                    }
                    c22492M11149.f77447 = ((long) i2) | c22492M11149.f77447;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9045 m2736(InterfaceC4290 interfaceC4290, C7675 c7675, String str, EnumSet enumSet) {
        return new C9045(this, this.f2506.mo32947(interfaceC4290, str, (Set) EnumSet.allOf(EnumC11347.class), false), c7675, enumSet);
    }
}
