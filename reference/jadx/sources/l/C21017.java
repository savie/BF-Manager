package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.bouncycastle.crypto.digests.SkeinEngine;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.᩷ܿۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 542M */
/* JADX INFO: loaded from: classes4.dex */
public final class C21017 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final C16576 f68413 = new C16576();

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC18154 f68414 = new C6906();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final EnumC23528 f68415;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C5870 f68416;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23800 f68417;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean f68419;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C16886 f68420;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f68421;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C16886 f68423;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public AbstractC11242[] f68424;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C18258 f68425;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C16886 f68428;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C20414 f68429;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C3836 f68430;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f68431;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C20145 f68432;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C2714 f68433;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f68434;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C5206 f68435;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C9399 f68436;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C16886 f68438;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final EnumC11909 f68439;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13464 f68440;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C13174 f68441;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C16826 f68442;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C2008 f68443;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C23942 f68444;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Set f68446;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C23549 f68447;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public char f68448;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public HashMap f68422 = new HashMap();

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public HashMap f68427 = new HashMap();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC18195 f68418 = new C1261(this);

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public AbstractC6160 f68426 = new C23135();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C10391 f68437 = new C10391();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C16973 f68445 = new C16973(3);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m47206(long j) {
        short s = (short) (j & 7);
        if (s == 0) {
            return 2;
        }
        if (s != 2) {
            return s != 4 ? 0 : 1;
        }
        return 3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ boolean m47234(C21017 c21017, AbstractC23903 abstractC23903) {
        c21017.getClass();
        return m47236(abstractC23903);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m47232(C21017 c21017, C11867 c11867) {
        c21017.getClass();
        return C20318.stream(c21017.m47352(c11867.f75167.f53222)).anyMatch(new C6056(0, c21017));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22492 m47271(C19670 c19670, AbstractC11242 abstractC11242) {
        return (C22492) this.f68422.get(new C2068(c19670, abstractC11242));
    }

    /* JADX WARN: Code duplicated, block: B:49:0x014d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0322 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0324  */
    /* JADX WARN: Code duplicated, block: B:97:0x0326  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47288(final AbstractC8774 abstractC8774, final C18258 c18258, C18258 c18259, C22492 c22492) {
        boolean zM52393;
        boolean z;
        C14065 c14065;
        C5909 c5909;
        long j = c18258.f77447;
        if ((2147487744L & j) == 0) {
            long j2 = c18259.f77447;
            if ((ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF & j2) != 0) {
                return;
            }
            long j3 = j & 8;
            C20414 c20414 = this.f68429;
            if (j3 != 0 && (j2 & 8) == 0) {
                AbstractC8774 abstractC8774M9440 = C3128.m9440(c18258, abstractC8774, false);
                C14377 c14377M47209 = m47209(c18258, c18259);
                C5909 c59010 = C23879.f77204;
                c20414.m48199(abstractC8774M9440, new C5909("compiler", "override.static", c14377M47209));
                c18258.f77447 |= 35184372088832L;
                return;
            }
            if ((16 & j2) != 0 || (j3 == 0 && (j2 & 8) != 0)) {
                AbstractC8774 abstractC8774M9441 = C3128.m9440(c18258, abstractC8774, false);
                C14377 c14377M472010 = m47209(c18258, c18259);
                EnumSet enumSetM21884 = C8360.m21884(c18259.f77447 & 24);
                C5909 c59011 = C23879.f77204;
                c20414.m48199(abstractC8774M9441, new C5909("compiler", "override.meth", c14377M472010, enumSetM21884));
                c18258.f77447 |= 35184372088832L;
                return;
            }
            if ((c18258.f77448.mo20276() & 8192) != 0) {
                return;
            }
            if (m47206(c18258.f77447) > m47206(c18259.f77447)) {
                AbstractC8774 abstractC8774M9442 = C3128.m9440(c18258, abstractC8774, false);
                if ((c18259.f77447 & 7) == 0) {
                    C14377 c14377M472011 = m47209(c18258, c18259);
                    C5909 c59012 = C23879.f77204;
                    c5909 = new C5909("compiler", "override.weaker.access", c14377M472011, "package");
                } else {
                    C14377 c14377M472012 = m47209(c18258, c18259);
                    EnumSet enumSetM21885 = C8360.m21884(c18259.f77447 & 7);
                    C5909 c59013 = C23879.f77204;
                    c5909 = new C5909("compiler", "override.weaker.access", c14377M472012, enumSetM21885);
                }
                c20414.m48199(abstractC8774M9442, c5909);
                c18258.f77447 |= 35184372088832L;
                return;
            }
            AbstractC16579 abstractC16579 = c22492.f77449;
            C23800 c23800 = this.f68417;
            AbstractC16579 abstractC16579M52409 = c23800.m52409(c18258, abstractC16579);
            AbstractC16579 abstractC16579M524010 = c23800.m52409(c18259, c22492.f77449);
            C21825 c21825Mo1938 = abstractC16579M52409.mo1938();
            C21825 c21825Mo1939 = abstractC16579M524010.mo1938();
            AbstractC16579 abstractC16579Mo16235 = abstractC16579M52409.mo16235();
            AbstractC16579 abstractC16579M52371 = c23800.m52371(abstractC16579M524010.mo16235(), c21825Mo1939, c21825Mo1938);
            C10391 c10391 = this.f68437;
            c10391.m26289();
            if (c23800.m52399(abstractC16579M52409.mo16235(), abstractC16579M52371)) {
                zM52393 = true;
            } else if (abstractC16579M52409.mo16235().mo9481() || abstractC16579M52371.mo9481()) {
                zM52393 = false;
            } else if (c23800.m52394(abstractC16579M52409, abstractC16579M524010, true)) {
                zM52393 = c23800.m52393(abstractC16579M52409.mo16235(), abstractC16579M52371, c10391);
            } else {
                if (!c23800.m52400(abstractC16579M52409.mo16235(), abstractC16579M52371, c10391)) {
                    if (c23800.m52413(abstractC16579M52409.mo16235(), c23800.m52402(abstractC16579M52371), true)) {
                        c10391.mo21748(EnumC0597.UNCHECKED);
                    } else {
                        zM52393 = false;
                    }
                }
                zM52393 = true;
            }
            if (!zM52393) {
                if ((c18258.f77447 & 8) == 0 || (c18259.f77447 & 8) == 0) {
                    AbstractC8774 abstractC8774M9443 = C3128.m9440(c18258, abstractC8774, false);
                    C14377 c14377M472013 = m47209(c18258, c18259);
                    C5909 c59014 = C23879.f77204;
                    c20414.m48199(abstractC8774M9443, new C5909("compiler", "override.incompatible.ret", c14377M472013, abstractC16579Mo16235, abstractC16579M52371));
                    c18258.f77447 |= 35184372088832L;
                    return;
                }
                AbstractC8774 abstractC8774M9444 = C3128.m9440(c18258, abstractC8774, false);
                AbstractC23903 abstractC23903M52708 = c18258.m52708();
                AbstractC23903 abstractC23903M52709 = c18259.m52708();
                C14377 c14377 = C14707.f48054;
                C14377 c14378 = new C14377("compiler", "cant.hide", c18258, abstractC23903M52708, c18259, abstractC23903M52709);
                C5909 c59015 = C23879.f77204;
                c20414.m48199(abstractC8774M9444, new C5909("compiler", "override.incompatible.ret", c14378, abstractC16579Mo16235, abstractC16579M52371));
                c18258.f77447 |= 35184372088832L;
                return;
            }
            if (c10391.m26293(EnumC0597.UNCHECKED)) {
                AbstractC8774 abstractC8774M9445 = C3128.m9440(c18258, abstractC8774, false);
                C14377 c14377M47245 = m47245(c18258, c18259);
                C14065 c14066 = C9768.f32836;
                m47346(abstractC8774M9445, new C14065("compiler", "override.unchecked.ret", c14377M47245, abstractC16579Mo16235, abstractC16579M52371));
            }
            C21825 c21825M52380 = c23800.m52380(abstractC16579M524010.mo33524(), c21825Mo1939, c21825Mo1938);
            C21825 c21825M47253 = m47253(abstractC16579M52409.mo33524(), c23800.m52424(c21825M52380));
            C21825 c21825M47254 = m47253(abstractC16579M52409.mo33524(), c21825M52380);
            if (c21825M47253.m48595()) {
                AbstractC8774 abstractC8774M9446 = C3128.m9440(c18258, abstractC8774, false);
                C14377 c14377M472014 = m47209(c18258, c18259);
                AbstractC16579 abstractC165710 = (AbstractC16579) c21825M47254.f70876;
                C5909 c59016 = C23879.f77204;
                c20414.m48199(abstractC8774M9446, new C5909("compiler", "override.meth.doesnt.throw", c14377M472014, abstractC165710));
                c18258.f77447 |= 35184372088832L;
                return;
            }
            if (c21825M47254.m48595()) {
                AbstractC8774 abstractC8774M9447 = C3128.m9440(c18258, abstractC8774, false);
                C14377 c14377M472015 = m47209(c18258, c18259);
                AbstractC16579 abstractC165711 = (AbstractC16579) c21825M47254.f70876;
                C14065 c14067 = C9768.f32836;
                m47346(abstractC8774M9447, new C14065("compiler", "override.unchecked.thrown", c14377M472015, abstractC165711));
                return;
            }
            if (((c18258.f77447 ^ c18259.f77447) & 17179869184L) != 0 && this.f68442.m39467(EnumC0597.OVERRIDES)) {
                AbstractC8774 abstractC8774M9448 = C3128.m9440(c18258, abstractC8774, false);
                if ((17179869184L & c18258.f77447) != 0) {
                    C14377 c14377M47240 = m47240(c18258, c18259);
                    C14065 c14068 = C9768.f32836;
                    c14065 = new C14065("compiler", "override.varargs.missing", c14377M47240);
                } else {
                    C14377 c14377M47241 = m47240(c18258, c18259);
                    C14065 c14069 = C9768.f32836;
                    c14065 = new C14065("compiler", "override.varargs.extra", c14377M47241);
                }
                c20414.m48204(abstractC8774M9448, c14065);
            }
            if ((c18259.f77447 & 2147483648L) != 0) {
                AbstractC8774 abstractC8774M9449 = C3128.m9440(c18258, abstractC8774, false);
                C14377 c14377M47246 = m47245(c18258, c18259);
                C14065 c140610 = C9768.f32836;
                c20414.m48204(abstractC8774M9449, new C14065("compiler", "override.bridge", c14377M47246));
            }
            C22492 c22492M52720 = c18259.m52720();
            AbstractC16579 abstractC16579M52432 = c23800.m52432(c22492.f77449);
            if (abstractC16579M52432.m39001(EnumC6617.CLASS)) {
                C18258 c18258M42451 = c18259.m42451((C22492) abstractC16579M52432.f53222, c23800, false);
                if (c22492M52720 != null) {
                    c22492M52720.mo49994();
                    if ((c22492M52720.f77447 & 512) != 0) {
                        if (c23800.m52439(c22492.f77449).contains(c22492M52720.f77449) || c18258M42451 == null) {
                            z = false;
                        } else {
                            z = true;
                        }
                    } else if (c18258M42451 != c18259) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else if (c18258M42451 != c18259) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
            if (z) {
                return;
            }
            C16826 c16826M39465 = this.f68442.m39465(c18258);
            C16826 c16826 = this.f68442;
            this.f68442 = c16826M39465;
            try {
                m47273(new Supplier() { // from class: l.ܿ۫ۤ
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return C3128.m9440(c18258, abstractC8774, false);
                    }
                }, c18258, c18259);
            } finally {
                this.f68442 = c16826;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21017 m47211(C12343 c12343) {
        C21017 c21017 = (C21017) c12343.m30656(f68413);
        return c21017 == null ? new C21017(c12343) : c21017;
    }

    public C21017(C12343 c12343) {
        c12343.m30659(f68413, this);
        this.f68444 = C23942.m52776(c12343);
        C20414 c20414M46161 = C20414.m46161(c12343);
        this.f68429 = c20414M46161;
        this.f68432 = C20145.m45505(c12343);
        this.f68430 = C3836.m11131(c12343);
        this.f68436 = C9399.m24138(c12343);
        this.f68416 = C5870.m16083(c12343);
        this.f68441 = C13174.m32565(c12343);
        this.f68417 = C23800.m52336(c12343);
        this.f68435 = C5206.m14386(c12343);
        this.f68447 = C23549.m51906(c12343);
        C14770 c14770M35395 = C14770.m35395(c12343);
        this.f68442 = C16826.m39463(c12343);
        this.f68440 = (InterfaceC13464) c12343.m30655(InterfaceC13464.class);
        EnumC11909 enumC11909M29706 = EnumC11909.m29706(c12343);
        this.f68439 = enumC11909M29706;
        EnumC14128.m34159(c12343);
        this.f68419 = c14770M35395.m35407("warnOnAccessToMembers");
        this.f68448 = EnumC14128.m34159(c12343).m34166();
        this.f68415 = EnumC23528.m51835(c12343);
        this.f68443 = C2008.m6467(c12343);
        C16826 c16826 = this.f68442;
        EnumC0597 enumC0597 = EnumC0597.DEPRECATION;
        boolean zM39467 = c16826.m39467(enumC0597);
        C16826 c16827 = this.f68442;
        EnumC0597 enumC0598 = EnumC0597.REMOVAL;
        boolean zM39468 = c16827.m39467(enumC0598);
        C16826 c16828 = this.f68442;
        EnumC0597 enumC0599 = EnumC0597.UNCHECKED;
        boolean zM39469 = c16828.m39467(enumC0599);
        this.f68420 = new C16886(c20414M46161, null, zM39467, "deprecated", enumC0597);
        this.f68438 = new C16886(c20414M46161, null, zM39468, "removal", enumC0598);
        this.f68428 = new C16886(c20414M46161, null, zM39469, "unchecked", enumC0599);
        this.f68423 = new C16886(c20414M46161, null, false, "sunapi", null);
        this.f68433 = C2714.m8268(c12343);
        this.f68421 = EnumC14026.f46096.m33945(enumC11909M29706);
        this.f68434 = EnumC14026.f46103.m33945(enumC11909M29706);
        this.f68431 = EnumC14026.f46102.m33945(enumC11909M29706);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47300(final AbstractC16579 abstractC16579, final AbstractC23903 abstractC23903, final C4603 c4603, final C21825 c21825, final C21825 c21826, final boolean z, C19524 c19524) {
        char c;
        C4603 c4604;
        if (abstractC16579.m39005(c19524.f62771)) {
            c19524.m44595(C21825.of((Object) abstractC16579), new InterfaceC18383() { // from class: l.ۨܿۤ
                @Override // l.InterfaceC18383
                /* JADX INFO: renamed from: ۙ */
                public final void mo969(C19524 c19525) {
                    boolean z2 = z;
                    this.f39757.m47300(c19525.m44587(abstractC16579), abstractC23903, c4603, c21825, c21826, z2, c19525);
                }
            });
            return;
        }
        C21825 c21825Mo33523 = abstractC16579.mo33523();
        C21825 c21825Mo33524 = abstractC23903.f77449.mo33523();
        if (c21825Mo33524.m48596() != c21825Mo33523.m48596()) {
            c21825Mo33524 = c21825Mo33523;
        }
        AbstractC16579 abstractC165710 = z ? (AbstractC16579) c21825Mo33523.last() : null;
        AbstractC11242 abstractC11242 = abstractC23903.f77453;
        AbstractC11242 abstractC11243 = this.f68444.f77632;
        C3836 c3836 = this.f68430;
        if (abstractC11242 == abstractC11243 && abstractC23903.f77448 == c3836.f14289) {
            c21825Mo33523 = c21825Mo33523.f70877.f70877;
            c21825Mo33524 = c21825Mo33524.f70877.f70877;
        }
        if ((abstractC23903.mo20276() & 144115188075855872L) != 0) {
            c21825Mo33523 = c21825Mo33523.f70877;
            c21825Mo33524 = c21825Mo33524.f70877;
        }
        C23800 c23800 = this.f68417;
        if (c21825 != null) {
            C21825 c21827 = c21825;
            C21825 c21828 = c21825Mo33523;
            C21825 c21829 = c21825Mo33524;
            while (c21828.f70876 != abstractC165710) {
                AbstractC8774 abstractC8774 = (AbstractC8774) c21827.f70876;
                abstractC8774.getClass();
                m47216(abstractC8774.f30190, (AbstractC16579) c21828.f70876, new C8318(this, abstractC8774, "unchecked.assign", abstractC8774.f30190, (AbstractC16579) c21829.f70876));
                c21827 = c21827.f70877;
                c21828 = c21828.f70877;
                c21829 = c21829.f70877;
            }
            c = 0;
            if (z) {
                AbstractC16579 abstractC16579M52416 = c23800.m52416(abstractC165710);
                for (C21825 c218210 = c21827; c218210.f70877 != null; c218210 = c218210.f70877) {
                    AbstractC8774 abstractC8775 = (AbstractC8774) c218210.f70876;
                    abstractC8775.getClass();
                    m47216(abstractC8775.f30190, abstractC16579M52416, new C8318(this, abstractC8775, "unchecked.assign", abstractC8775.f30190, abstractC16579M52416));
                }
            } else if ((abstractC23903.mo20276() & 70385924046848L) == 17179869184L) {
                AbstractC16579 abstractC165711 = (AbstractC16579) abstractC16579.mo33523().last();
                AbstractC16579 abstractC165712 = (AbstractC16579) c21826.last();
                if (c23800.m52400(abstractC165712, c23800.m52416(abstractC165711), c23800.f76946) && !c23800.m52399(c23800.m52402(abstractC165711), c23800.m52402(abstractC165712))) {
                    AbstractC5930 abstractC5930 = (AbstractC5930) c21825.last();
                    abstractC5930.getClass();
                    AbstractC16579 abstractC16579M52417 = c23800.m52416(abstractC165711);
                    C14065 c14065 = C9768.f32836;
                    this.f68429.m48204(abstractC5930, new C14065("compiler", "inexact.non-varargs.call", abstractC16579M52417, abstractC165711));
                }
            }
        } else {
            c = 0;
        }
        if (z) {
            AbstractC16579 abstractC165713 = (AbstractC16579) abstractC16579.mo33523().last();
            if (c23800.m52436(abstractC165713) || (abstractC23903.mo10880().m52702(c3836.f14273.f53222) != null && m47248(abstractC23903))) {
                c4604 = c4603;
            } else {
                c4604 = c4603;
                AbstractC8774 abstractC8776 = c4604.f16296;
                abstractC8776.getClass();
                C14065 c14066 = C9768.f32836;
                Object[] objArr = new Object[1];
                objArr[c] = abstractC165713;
                m47346(abstractC8776, new C14065("compiler", "unchecked.generic.array.creation", objArr));
            }
            C3128.m9448(c23800.m52416(abstractC165713), c4604.f16296);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16826 m47268(C16826 c16826) {
        C16826 c16827 = this.f68442;
        this.f68442 = c16826;
        return c16827;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18258 m47269(C18258 c18258) {
        C18258 c18259 = this.f68425;
        this.f68425 = c18258;
        return c18259;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47297(InterfaceC12260 interfaceC12260, C14065 c14065) {
        if (this.f68442.m39468(EnumC0597.PREVIEW)) {
            return;
        }
        this.f68443.m6472(interfaceC12260, c14065);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m47346(InterfaceC12260 interfaceC12260, C14065 c14065) {
        if (this.f68442.m39468(EnumC0597.UNCHECKED)) {
            return;
        }
        this.f68428.m39552(interfaceC12260, c14065);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m47333(InterfaceC12260 interfaceC12260, C14065 c14065) {
        C16826 c16826 = this.f68442;
        EnumC0597 enumC0597 = EnumC0597.VARARGS;
        if (c16826.m39467(enumC0597)) {
            this.f68429.m48203(enumC0597, interfaceC12260, c14065);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47315(C23570 c23570, C14065 c14065) {
        C16826 c16826 = this.f68442;
        EnumC0597 enumC0597 = EnumC0597.STATIC;
        if (c16826.m39467(enumC0597)) {
            this.f68429.m48203(enumC0597, c23570, c14065);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47225(C21017 c21017, InterfaceC12260 interfaceC12260) {
        C16826 c16826 = c21017.f68442;
        EnumC0597 enumC0597 = EnumC0597.DIVZERO;
        if (c16826.m39467(enumC0597)) {
            c21017.f68429.m48203(enumC0597, interfaceC12260, C9768.f32834);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m47342() {
        this.f68420.m39551();
        this.f68438.m39551();
        this.f68428.m39551();
        this.f68423.m39551();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m47261(InterfaceC12260 interfaceC12260, C4146 c4146) {
        EnumC0264 enumC0264 = EnumC0264.NON_DEFERRABLE;
        AbstractC23903 abstractC23903 = c4146.f15170;
        C11948 c11948M11788 = c4146.m11788();
        C5909 c5909 = C23879.f77204;
        this.f68429.m48193(enumC0264, interfaceC12260, new C5909("compiler", "cant.access", abstractC23903, c11948M11788));
        return this.f68430.f14261;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m47262(InterfaceC12260 interfaceC12260, C11948 c11948, Object obj) {
        boolean z = obj instanceof AbstractC16579;
        C3836 c3836 = this.f68430;
        C20414 c20414 = this.f68429;
        if (z && ((AbstractC16579) obj).m39001(EnumC6617.VOID)) {
            c20414.m48199(interfaceC12260, C23879.f77280);
            return c3836.f14261;
        }
        C5909 c5909 = C23879.f77204;
        c20414.m48199(interfaceC12260, new C5909("compiler", "type.found.req", obj, c11948));
        return this.f68417.m52440(z ? (AbstractC16579) obj : c3836.f14261);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m47347(InterfaceC12260 interfaceC12260, AbstractC23903 abstractC23903) {
        C5909 c5909 = C23879.f77204;
        this.f68429.m48199(interfaceC12260, new C5909("compiler", "cant.ref.before.ctor.called", abstractC23903));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47298(InterfaceC12260 interfaceC12260, AbstractC23903 abstractC23903) {
        if (abstractC23903.f77449.mo1926()) {
            return;
        }
        AbstractC23903 abstractC23903M52708 = abstractC23903.m52708();
        EnumC10477 enumC10477 = abstractC23903M52708.f77452;
        EnumC10477 enumC10478 = EnumC10477.f35879;
        C20414 c20414 = this.f68429;
        if (enumC10477 == enumC10478 && ((C18258) abstractC23903M52708).m42450()) {
            EnumC7654 enumC7654M38160 = C16121.m38160(abstractC23903);
            EnumC7654 enumC7654M38161 = C16121.m38160(abstractC23903.m52708());
            EnumC7654 enumC7654M38162 = C16121.m38160(abstractC23903.m52708().m52720());
            C22492 c22492M52720 = abstractC23903.m52708().m52720();
            C5909 c5909 = C23879.f77204;
            c20414.m48199(interfaceC12260, new C5909("compiler", "already.defined.in.clinit", enumC7654M38160, abstractC23903, enumC7654M38161, enumC7654M38162, c22492M52720));
            return;
        }
        if (abstractC23903M52708.f77452 == enumC10478) {
            long j = abstractC23903.f77448.f77447;
            if ((68719476736L & j) != 0 && (j & 2305843009213693952L) != 0) {
                return;
            }
        }
        EnumC7654 enumC7654M38163 = C16121.m38160(abstractC23903);
        EnumC7654 enumC7654M38164 = C16121.m38160(abstractC23903.m52708());
        AbstractC23903 abstractC23903M52709 = abstractC23903.m52708();
        C5909 c59010 = C23879.f77204;
        c20414.m48199(interfaceC12260, new C5909("compiler", "already.defined", enumC7654M38163, abstractC23903, enumC7654M38164, abstractC23903M52709));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47273(final Supplier supplier, AbstractC23903 abstractC23903, final AbstractC23903 abstractC23904) {
        if ((abstractC23904.f77447 & 36028797018963968L) == 0 && (!abstractC23904.mo44803() || abstractC23903.mo44803())) {
            return;
        }
        if ((abstractC23904.mo44804() != abstractC23903.mo44804() || abstractC23904.mo44804() == null) && abstractC23904.f77452 != EnumC10477.f35867) {
            this.f68433.m8272(new InterfaceC11888() { // from class: l.ܽ۫ۤ
                @Override // l.InterfaceC11888
                /* JADX INFO: renamed from: ۙ */
                public final void mo5925() {
                    C21017.m47217(this.f53365, supplier, abstractC23904);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47293(InterfaceC12260 interfaceC12260, C6263 c6263, AbstractC9462 abstractC9462) {
        AbstractC23903 abstractC23903;
        AbstractC23903 abstractC23904;
        Iterator it = abstractC9462.m9327(c6263.f77453).iterator();
        while (it.hasNext() && (abstractC23904 = (abstractC23903 = (AbstractC23903) it.next()).f77448) == c6263.f77448) {
            if (abstractC23903.f77452 == EnumC10477.f35878 && abstractC23904.f77452.m26580(C21059.f68591) && c6263.f77453 != this.f68444.f77652) {
                m47298(interfaceC12260, abstractC23903);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47283(C8753 c8753, C22492 c22492, AbstractC9462 abstractC9462) {
        for (AbstractC23903 abstractC23903 : abstractC9462.m9327(c22492.f77453)) {
            if (abstractC23903.f77448 != c22492.f77448) {
                return;
            }
            if (abstractC23903.f77452 == EnumC10477.f35865 && !abstractC23903.f77449.m39001(EnumC6617.TYPEVAR) && abstractC23903.f77448.f77452.m26580(C21059.f68591) && c22492.f77453 != this.f68444.f77652) {
                m47298(c8753, abstractC23903);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m47320(C8753 c8753, AbstractC11242 abstractC11242, AbstractC9462 abstractC9462) {
        AbstractC11242 abstractC11243;
        Iterator it = abstractC9462.mo3803(abstractC11242, null, EnumC10167.NON_RECURSIVE).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C23942 c23942 = this.f68444;
            if (zHasNext) {
                AbstractC23903 abstractC23903 = (AbstractC23903) it.next();
                if (abstractC23903.f77452 == EnumC10477.f35865 && abstractC23903.f77453 != c23942.f77652) {
                    m47298(c8753, abstractC23903);
                    return false;
                }
            } else {
                for (AbstractC23903 abstractC23904 = abstractC9462.f11719; abstractC23904 != null; abstractC23904 = abstractC23904.f77448) {
                    if (abstractC23904.f77452 == EnumC10477.f35865 && (abstractC11243 = abstractC23904.f77453) == abstractC11242 && abstractC11243 != c23942.f77652) {
                        m47298(c8753, abstractC23904);
                        return true;
                    }
                }
                return true;
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC11242 m47330(C22492 c22492) {
        AbstractC11242 abstractC11242 = c22492.f77448.m52720().f73414;
        String string = abstractC11242.toString();
        C2068 c2068 = new C2068(abstractC11242, c22492.f77453);
        HashMap map = this.f68427;
        Integer num = (Integer) map.get(c2068);
        int iIntValue = num == null ? 1 : num.intValue();
        while (true) {
            StringBuilder sbM23356 = C9023.m23356(string);
            sbM23356.append(this.f68448);
            sbM23356.append(iIntValue);
            sbM23356.append((Object) c22492.f77453);
            AbstractC11242 abstractC11242M17389 = this.f68444.f77631.m17389(sbM23356.toString());
            if (m47271(c22492.m52724().f25392, abstractC11242M17389) == null) {
                map.put(c2068, Integer.valueOf(iIntValue + 1));
                return abstractC11242M17389;
            }
            iIntValue++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47306(C22492 c22492) {
        AbstractC23903 abstractC23903 = c22492.f77448;
        if (abstractC23903 == null || abstractC23903.f77452 == EnumC10477.f35876) {
            return;
        }
        this.f68427.remove(new C2068(abstractC23903.m52720().f73414, c22492.f77453));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47272() {
        this.f68422.clear();
        this.f68427.clear();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m47254(C22492 c22492) {
        this.f68422.put(new C2068(c22492.m52724().f25392, c22492.f73414), c22492);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C22492 m47341(C22492 c22492) {
        return (C22492) this.f68422.get(new C2068(c22492.m52724().f25392, c22492.f73414));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m47328(C22492 c22492) {
        this.f68422.remove(new C2068(c22492.m52724().f25392, c22492.f73414));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m47266(final InterfaceC12260 interfaceC12260, final AbstractC16579 abstractC16579, final AbstractC16579 abstractC165710, final InterfaceC18195 interfaceC18195) {
        C19524 c19524Mo4574 = interfaceC18195.mo4574();
        if (abstractC165710.m39005(c19524Mo4574.f62771) || abstractC16579.m39005(c19524Mo4574.f62771)) {
            c19524Mo4574.m44595(C21825.of((Object) abstractC165710, (Object) abstractC16579), new InterfaceC18383() { // from class: l.᩹ܿۤ
                @Override // l.InterfaceC18383
                /* JADX INFO: renamed from: ۙ */
                public final void mo969(C19524 c19524) {
                    this.f73196.m47266(interfaceC12260, c19524.m44587(abstractC16579), c19524.m44587(abstractC165710), interfaceC18195);
                }
            });
        }
        if (abstractC165710.m39001(EnumC6617.ERROR)) {
            return abstractC165710;
        }
        if (abstractC165710.m39001(EnumC6617.NONE) || interfaceC18195.mo2933(abstractC16579, abstractC165710, interfaceC18195.mo4573(interfaceC12260, abstractC16579, abstractC165710))) {
            return abstractC16579;
        }
        boolean zMo9484 = abstractC16579.mo9484();
        C23800 c23800 = this.f68417;
        C23549 c23549 = this.f68447;
        if (zMo9484 && abstractC165710.mo9484()) {
            C14377 c14377 = C14707.f48054;
            interfaceC18195.mo2545(interfaceC12260, c23549.m51910(new C14377("compiler", "possible.loss.of.precision", abstractC16579, abstractC165710)));
            return c23800.m52440(abstractC16579);
        }
        interfaceC18195.mo2545(interfaceC12260, c23549.m51910(C14707.m35237(abstractC16579, abstractC165710)));
        return c23800.m52440(abstractC16579);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47274(final C2422 c2422) {
        AbstractC23903 abstractC23903M9471;
        if (c2422.f30190.mo1926()) {
            return;
        }
        if (!this.f68417.m52399(c2422.f9708.f30190, c2422.f9707.f30190) || C3128.m9465(c2422.f9707)) {
            return;
        }
        AbstractC5930 abstractC5930M9461 = C3128.m9461(c2422.f9708);
        if (!abstractC5930M9461.m22847(EnumC18651.f60539) || (abstractC23903M9471 = C3128.m9471(((C15434) abstractC5930M9461).f50296)) == null || abstractC23903M9471.f77452 != EnumC10477.f35879 || (abstractC23903M9471.mo20276() & 137438953472L) == 0) {
            this.f68433.m8272(new InterfaceC11888() { // from class: l.᩷۫ۤ
                @Override // l.InterfaceC11888
                /* JADX INFO: renamed from: ۙ */
                public final void mo5925() {
                    C21017.m47218(this.f67805, c2422);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47218(C21017 c21017, C2422 c2422) {
        C16826 c16826 = c21017.f68442;
        EnumC0597 enumC0597 = EnumC0597.CAST;
        if (c16826.m39467(enumC0597)) {
            C20414 c20414 = c21017.f68429;
            AbstractC16579 abstractC16579 = c2422.f9707.f30190;
            C14065 c14065 = C9768.f32836;
            c20414.m48203(enumC0597, c2422, new C14065("compiler", "redundant.cast", abstractC16579));
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m47251(InterfaceC12260 interfaceC12260, AbstractC16579 abstractC16579) {
        if (!abstractC16579.m39001(EnumC6617.VOID)) {
            return abstractC16579;
        }
        this.f68429.m48199(interfaceC12260, C23879.f77310);
        return this.f68417.m52440(abstractC16579);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m47263(InterfaceC12260 interfaceC12260, AbstractC16579 abstractC16579) {
        Object objM51910;
        if (abstractC16579.m39001(EnumC6617.CLASS) || abstractC16579.m39001(EnumC6617.ARRAY) || abstractC16579.m39001(EnumC6617.ERROR)) {
            return abstractC16579;
        }
        C14377 c14377 = C14707.f48048;
        C23549 c23549 = this.f68447;
        C11948 c11948M51910 = c23549.m51910(c14377);
        if (abstractC16579.m39001(EnumC6617.TYPEVAR)) {
            objM51910 = abstractC16579;
            objM51910 = c23549.m51910(new C14377("compiler", "type.parameter", abstractC16579));
        }
        objM51910 = abstractC16579;
        return m47262(interfaceC12260, c11948M51910, objM51910);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m47338(InterfaceC12260 interfaceC12260, AbstractC16579 abstractC16579) {
        Object objM51910;
        if (abstractC16579.m39001(EnumC6617.CLASS) || abstractC16579.m39001(EnumC6617.ERROR)) {
            return abstractC16579;
        }
        C14377 c14377 = C14707.f48079;
        C23549 c23549 = this.f68447;
        C11948 c11948M51910 = c23549.m51910(c14377);
        if (abstractC16579.m39001(EnumC6617.TYPEVAR)) {
            objM51910 = abstractC16579;
            objM51910 = c23549.m51910(new C14377("compiler", "type.parameter", abstractC16579));
        }
        objM51910 = abstractC16579;
        return m47262(interfaceC12260, c11948M51910, objM51910);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m47252(InterfaceC12260 interfaceC12260, AbstractC16579 abstractC16579) {
        AbstractC16579 abstractC16579M47263 = m47263(interfaceC12260, abstractC16579);
        boolean zM39001 = abstractC16579M47263.m39001(EnumC6617.CLASS);
        C20414 c20414 = this.f68429;
        C23800 c23800 = this.f68417;
        if (!zM39001) {
            if (!abstractC16579M47263.m39001(EnumC6617.ARRAY) || c23800.m52436(((C8777) abstractC16579M47263).f30194)) {
                return abstractC16579M47263;
            }
            c20414.m48199(interfaceC12260, C23879.f77326);
            return c23800.m52440(abstractC16579M47263);
        }
        if ((abstractC16579M47263.f53222.mo20276() & 1536) != 0) {
            AbstractC0618 abstractC0618 = abstractC16579M47263.f53222;
            C5909 c5909 = C23879.f77204;
            c20414.m48199(interfaceC12260, new C5909("compiler", "abstract.cant.be.instantiated", abstractC0618));
            return c23800.m52440(abstractC16579M47263);
        }
        if ((abstractC16579M47263.f53222.mo20276() & 16384) != 0) {
            c20414.m48199(interfaceC12260, C23879.f77342);
            return c23800.m52440(abstractC16579M47263);
        }
        return m47267(interfaceC12260, abstractC16579M47263, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m47267(InterfaceC12260 interfaceC12260, AbstractC16579 abstractC16579, boolean z) {
        AbstractC16579 abstractC16579M47338 = m47338(interfaceC12260, abstractC16579);
        if (z && abstractC16579M47338.mo1942()) {
            for (C21825 c21825Mo1938 = abstractC16579M47338.mo1938(); c21825Mo1938.m48595(); c21825Mo1938 = c21825Mo1938.f70877) {
                if (((AbstractC16579) c21825Mo1938.f70876).m39001(EnumC6617.WILDCARD)) {
                    return m47262(interfaceC12260, this.f68447.m51910(C14707.f48059), c21825Mo1938.f70876);
                }
            }
        }
        return abstractC16579M47338;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m47256(InterfaceC12260 interfaceC12260, AbstractC16579 abstractC16579) {
        return abstractC16579.mo1937() ? abstractC16579 : m47262(interfaceC12260, this.f68447.m51910(C14707.f48112), abstractC16579);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47304(C21825 c21825, C21825 c21826) {
        while (c21826.m48595()) {
            AbstractC5930 abstractC5930 = (AbstractC5930) c21825.f70876;
            abstractC5930.getClass();
            c21826.f70876 = m47256(abstractC5930, (AbstractC16579) c21826.f70876);
            c21825 = c21825.f70877;
            c21826 = c21826.f70877;
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m47337(InterfaceC12260 interfaceC12260, AbstractC16579 abstractC16579) {
        return (abstractC16579.mo1937() || abstractC16579.m39001(EnumC6617.BOT)) ? abstractC16579 : m47262(interfaceC12260, this.f68447.m51910(C14707.f48112), abstractC16579);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m47321(AbstractC8774 abstractC8774, long j, long j2, long j3) {
        long j4 = j2 & j;
        if (j4 != 0) {
            long j5 = j & j3;
            if (j5 != 0) {
                long j6 = 1;
                long j7 = 1;
                while ((j7 & j4) == 0) {
                    j7 <<= 1;
                }
                EnumSet enumSetM21884 = C8360.m21884(j7);
                while ((j6 & j5) == 0) {
                    j6 <<= 1;
                }
                EnumSet enumSetM21885 = C8360.m21884(j6);
                C5909 c5909 = C23879.f77204;
                this.f68429.m48199(abstractC8774, new C5909("compiler", "illegal.combination.of.modifiers", enumSetM21884, enumSetM21885));
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m47260(C8378 c8378, AbstractC16579 abstractC16579) {
        if (!C3128.m9473(c8378) || abstractC16579.mo1926()) {
            AbstractC5930 abstractC5930 = c8378.f29095;
            abstractC5930.getClass();
            return m47267((InterfaceC12260) abstractC5930, abstractC16579, true);
        }
        C8753 c8753 = c8378.f29098;
        C20414 c20414 = this.f68429;
        if (c8753 != null) {
            EnumC14026 enumC14026 = EnumC14026.f46093;
            EnumC11909 enumC11909 = this.f68439;
            if (!enumC14026.m33945(enumC11909)) {
                EnumC0264 enumC0264 = EnumC0264.SOURCE_LEVEL;
                AbstractC5930 abstractC5931 = c8378.f29095;
                abstractC5931.getClass();
                C14377 c14377M33947 = enumC14026.m33947(enumC11909.f39974);
                C5909 c5909 = C23879.f77204;
                c20414.m48193(enumC0264, abstractC5931, new C5909("compiler", "cant.apply.diamond.1", abstractC16579, c14377M33947));
            }
        }
        boolean zIsEmpty = abstractC16579.f53222.f77449.mo1938().isEmpty();
        C23800 c23800 = this.f68417;
        if (zIsEmpty) {
            AbstractC5930 abstractC5932 = c8378.f29095;
            abstractC5932.getClass();
            C14377 c14377 = C14707.f48054;
            C14377 c14378 = new C14377("compiler", "diamond.non.generic", abstractC16579);
            C5909 c59010 = C23879.f77204;
            c20414.m48199(abstractC5932, new C5909("compiler", "cant.apply.diamond.1", abstractC16579, c14378));
            return c23800.m52440(abstractC16579);
        }
        C21825 c21825 = c8378.f29096;
        if (c21825 == null || !c21825.m48595()) {
            return abstractC16579;
        }
        AbstractC5930 abstractC5933 = c8378.f29095;
        abstractC5933.getClass();
        C14377 c14379 = C14707.f48054;
        C14377 c143710 = new C14377("compiler", "diamond.and.explicit.params", abstractC16579);
        C5909 c59011 = C23879.f77204;
        c20414.m48199(abstractC5933, new C5909("compiler", "cant.apply.diamond.1", abstractC16579, c143710));
        return c23800.m52440(abstractC16579);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m47242(AbstractC16579 abstractC16579) {
        AbstractC18154 abstractC18154 = f68414;
        abstractC18154.getClass();
        return ((Boolean) abstractC16579.mo1928(abstractC18154, (Object) null)).booleanValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47309(C23195 c23195) {
        C11948 c11948M51910;
        C18258 c18258 = c23195.f75263;
        C3836 c3836 = this.f68430;
        AbstractC16579 abstractC16579 = c3836.f14273;
        AbstractC16579 abstractC165710 = c3836.f14273;
        boolean z = c18258.m52702((AbstractC23903) abstractC16579.f53222) != null;
        boolean zMo24653 = c18258.mo24653();
        C23800 c23800 = this.f68417;
        AbstractC16579 abstractC16579M52416 = zMo24653 ? c23800.m52416(((C6656) c23195.f75270.last()).f30190) : null;
        C23549 c23549 = this.f68447;
        if (z && !m47248(c18258)) {
            C20414 c20414 = this.f68429;
            if (abstractC16579M52416 != null) {
                if (EnumC14026.f46121.m33945(this.f68439)) {
                    c11948M51910 = c23549.m51910(new C14377("compiler", "varargs.trustme.on.virtual.varargs", c18258));
                } else {
                    c11948M51910 = c23549.m51910(new C14377("compiler", "varargs.trustme.on.virtual.varargs.final.only", c18258));
                }
                AbstractC0618 abstractC0618 = abstractC165710.f53222;
                C5909 c5909 = C23879.f77204;
                c20414.m48199(c23195, new C5909("compiler", "varargs.invalid.trustme.anno", abstractC0618, c11948M51910));
                return;
            }
            AbstractC0618 abstractC0619 = abstractC165710.f53222;
            C14377 c14377 = C14707.f48054;
            C14377 c14378 = new C14377("compiler", "varargs.trustme.on.non.varargs.meth", c18258);
            C5909 c59010 = C23879.f77204;
            c20414.m48199(c23195, new C5909("compiler", "varargs.invalid.trustme.anno", abstractC0619, c14378));
            return;
        }
        if (z && abstractC16579M52416 != null && c23800.m52436(abstractC16579M52416)) {
            AbstractC0618 abstractC06110 = abstractC165710.f53222;
            C14377 c14379 = C14707.f48054;
            C11948 c11948M51911 = c23549.m51910(new C14377("compiler", "varargs.trustme.on.reifiable.varargs", abstractC16579M52416));
            C14065 c14065 = C9768.f32836;
            m47333(c23195, new C14065("compiler", "varargs.redundant.trustme.anno", abstractC06110, c11948M51911));
            return;
        }
        if (z || abstractC16579M52416 == null || c23800.m52436(abstractC16579M52416)) {
            return;
        }
        InterfaceC12260 interfaceC12260 = (C6656) c23195.f75270.f70876;
        interfaceC12260.getClass();
        C14065 c14066 = C9768.f32836;
        m47346(interfaceC12260, new C14065("compiler", "unchecked.varargs.non.reifiable.type", abstractC16579M52416));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean m47248(AbstractC23903 abstractC23903) {
        if ((abstractC23903.mo20276() & 17179869184L) != 0) {
            if (abstractC23903.m52713()) {
                return true;
            }
            if ((abstractC23903.mo20276() & ((long) ((EnumC14026.f46121.m33945(this.f68439) ? 2 : 0) | 24))) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m47264(InterfaceC12260 interfaceC12260, AbstractC16579 abstractC16579, AbstractC11242 abstractC11242) {
        boolean zM39001 = abstractC16579.m39001(EnumC6617.BOT);
        C20414 c20414 = this.f68429;
        C23800 c23800 = this.f68417;
        if (zM39001) {
            c20414.m48199(interfaceC12260, C23879.m52620(abstractC11242, C14707.f48103));
            return c23800.m52440(abstractC16579);
        }
        if (abstractC16579.m39001(EnumC6617.VOID)) {
            c20414.m48199(interfaceC12260, C23879.m52620(abstractC11242, C14707.f48070));
            return c23800.m52440(abstractC16579);
        }
        return c23800.m52408(abstractC16579, c23800.m52410(abstractC16579)).mo5593();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47216(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710, C10391 c10391) {
        C23800 c23800 = this.f68417;
        if (!c23800.m52363(abstractC16579, abstractC165710, c10391) && abstractC165710.mo12731() && c23800.m52413(abstractC16579, c23800.m52432(abstractC165710), true)) {
            for (C21825 c21825M52439 = c23800.m52439(abstractC165710); c21825M52439.m48595() && c23800.m52400(abstractC16579, (AbstractC16579) c21825M52439.f70876, c10391); c21825M52439 = c21825M52439.f70877) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m47324(AbstractC16579 abstractC16579) {
        return m47204(abstractC16579) == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public AbstractC16579 m47204(AbstractC16579 abstractC16579) {
        C23800 c23800;
        C21825 c21825Mo1943 = abstractC16579.f53222.f77449.mo1943();
        C21825 c21825Mo1944 = abstractC16579.mo1943();
        C21825 c21825Mo1938 = abstractC16579.mo1938();
        C21825 c21825Mo1939 = abstractC16579.f53222.f77449.mo1938();
        C19003 c19003 = new C19003();
        while (true) {
            boolean zM48595 = c21825Mo1938.m48595();
            c23800 = this.f68417;
            if (!zM48595 || !c21825Mo1939.m48595()) {
                break;
            }
            c19003.m43723(c23800.m52371(((AbstractC16579) c21825Mo1939.f70876).mo18112(), c21825Mo1943, c21825Mo1944));
            c21825Mo1938 = c21825Mo1938.f70877;
            c21825Mo1939 = c21825Mo1939.f70877;
        }
        C21825 c21825Mo19310 = abstractC16579.mo1938();
        for (C21825 c21825M52425 = c23800.m52425(c21825Mo1943, c21825Mo1943, c23800.m52419(abstractC16579).mo1943()); c21825Mo19310.m48595() && c21825M52425.m48595(); c21825M52425 = c21825M52425.f70877) {
            ((AbstractC16579) c21825Mo19310.f70876).mo2035((C22929) c21825M52425.f70876);
            c21825Mo19310 = c21825Mo19310.f70877;
        }
        C21825 c21825Mo19311 = abstractC16579.mo1938();
        C21825 c21825M43726 = c19003.m43726();
        while (true) {
            boolean zM48596 = c21825Mo19311.m48595();
            AbstractC6160 abstractC6160 = this.f68426;
            if (zM48596 && c21825M43726.m48595()) {
                AbstractC16579 abstractC165710 = (AbstractC16579) c21825Mo19311.f70876;
                if (!((Boolean) abstractC6160.m17162(abstractC165710)).booleanValue() && !((AbstractC16579) c21825M43726.f70876).mo1926()) {
                    AbstractC16579 abstractC165711 = (AbstractC16579) c21825M43726.f70876;
                    boolean zM52358 = true;
                    if (!abstractC165710.mo2037()) {
                        if (abstractC165710.m39001(EnumC6617.WILDCARD)) {
                            if (abstractC165710.mo2036()) {
                                zM52358 = c23800.m52412(abstractC165711, c23800.m52415(abstractC165710), c23800.f76946);
                            } else if (abstractC165710.mo2034()) {
                                zM52358 = true ^ c23800.m52358(c23800.m52433(abstractC165710), abstractC165711);
                            }
                        } else {
                            zM52358 = c23800.m52413(C23800.m52343(abstractC165710), abstractC165711, true);
                        }
                    }
                    if (!zM52358) {
                        return (AbstractC16579) c21825Mo19311.f70876;
                    }
                }
                c21825Mo19311 = c21825Mo19311.f70877;
                c21825M43726 = c21825M43726.f70877;
            } else {
                C21825 c21825Mo19312 = abstractC16579.mo1938();
                C21825 c21825M43727 = c19003.m43726();
                for (AbstractC16579 abstractC165712 : c23800.m52419(abstractC16579).mo1938()) {
                    if (abstractC165712.m39001(EnumC6617.TYPEVAR) && abstractC165712.mo18112().mo1926() && !((AbstractC16579) c21825M43727.f70876).mo1926() && !((Boolean) abstractC6160.m17162((AbstractC16579) c21825Mo19312.f70876)).booleanValue()) {
                        return (AbstractC16579) c21825Mo19312.f70876;
                    }
                    c21825M43727 = c21825M43727.f70877;
                    c21825Mo19312 = c21825Mo19312.f70877;
                }
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47295(final InterfaceC12260 interfaceC12260, final C7675 c7675) {
        c7675.mo49994();
        if (c7675.f25395.m9329()) {
            c7675.mo49994();
            if ((c7675.f77447 & 4503599627370496L) == 0) {
                this.f68433.m8272(new InterfaceC11888() { // from class: l.֫۫ۤ
                    @Override // l.InterfaceC11888
                    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                    public final void mo5925() {
                        C21017.m47226(this.f6983, interfaceC12260, c7675);
                    }
                });
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x012b A[EDGE_INSN: B:78:0x012b->B:80:0x012e BREAK  A[LOOP:0: B:71:0x0111->B:194:?]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m47257(final AbstractC8774 abstractC8774, long j, AbstractC23903 abstractC23903, AbstractC8774 abstractC8775) {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        int i = C21723.f70429[abstractC23903.f77452.ordinal()];
        C20414 c20414 = this.f68429;
        if (i != 1) {
            C2714 c2714 = this.f68433;
            if (i == 2) {
                j2 = 512;
                j6 = 2;
                if (abstractC23903.f77453 != this.f68444.f77632) {
                    long j12 = abstractC23903.f77448.f77447;
                    if ((j12 & 512) == 0) {
                        j7 = (j12 & 2305843009213693952L) != 0 ? 3135L : 3391L;
                        j8 = j7;
                        j6 = 0;
                    } else if ((j12 & 8192) == 0 && (j & 8796093022218L) != 0) {
                        j6 = (j & 2) != 0 ? 0L : 1L;
                        if ((j & 8796093022208L) != 0) {
                            j6 |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
                        }
                        j8 = 8796093025291L;
                    } else {
                        j6 = 1025;
                        j8 = j6;
                    }
                } else if ((abstractC23903.f77448.f77447 & 16384) != 0) {
                    j8 = j6;
                } else {
                    j7 = 7;
                    j8 = j7;
                    j6 = 0;
                }
                if ((j & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) != 0) {
                    InterfaceC12260 interfaceC12260M8270 = c2714.m8270((InterfaceC12260) abstractC8774);
                    try {
                        c2714.m8272(new InterfaceC11888() { // from class: l.᩻۫ۤ
                            @Override // l.InterfaceC11888
                            /* JADX INFO: renamed from: ۙ */
                            public final void mo5925() {
                                C21017.m47223(this.f76672, abstractC8774);
                            }
                        });
                        c2714.m8270(interfaceC12260M8270);
                    } catch (Throwable th) {
                        c2714.m8270(interfaceC12260M8270);
                        throw th;
                    }
                }
                if (((j | j6) & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) == 0 || (j & 8796093022208L) != 0) {
                    j9 = abstractC23903.f77448.f77447;
                } else {
                    j10 = j6;
                }
                j5 = j8;
                j4 = j10;
            } else if (i == 3) {
                boolean zM26580 = abstractC23903.f77448.f77452.m26580(C21059.f68591);
                boolean z = this.f68434;
                j6 = 8;
                if (zM26580 || (abstractC23903.m52728() && (j & 8192) != 0)) {
                    j2 = 512;
                    boolean z2 = (abstractC23903.f77453.isEmpty() || ((j & 2305843009213693952L) == 0 && (j & 16384) == 0 && (j & 512) == 0)) ? false : true;
                    j8 = (((j & 8) != 0 || z2) && z && (j & 8192) == 0) ? 24088L : 23568L;
                    if (!z2) {
                        j6 = 0;
                    }
                } else {
                    AbstractC23903 abstractC23904 = abstractC23903.f77448;
                    if (abstractC23904.f77452 == EnumC10477.f35865) {
                        j8 = ((j & 8) != 0 && z && (j & 8192) == 0) ? -4611686018427363809L : -4611686018427363817L;
                        j2 = 512;
                        if (abstractC23904.f77448.f77452 == EnumC10477.f35867 || (abstractC23904.f77447 & 8) != 0) {
                            j8 |= 8;
                        } else if (!z && ((j & 16384) != 0 || (j & 2305843009213693952L) != 0)) {
                            c20414.m48199(abstractC8774, C23879.f77233);
                        }
                        if ((j & 2305843009213710848L) == 0) {
                        }
                    } else {
                        j2 = 512;
                        j8 = -4611686018427355631L;
                    }
                    j6 = 0;
                }
                if ((j & j2) != 0) {
                    j6 |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
                }
                if ((j & 16384) != 0) {
                    j8 &= 4611686018427386863L;
                    if (!abstractC8775.m22847(EnumC18651.f60468)) {
                        j11 = 0;
                        break;
                    }
                    C4083 c4083 = new C4083();
                    c4083.f14996 = false;
                    Iterator it = ((C8753) abstractC8775).f30090.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            j11 = 16;
                            break;
                        }
                        ((AbstractC8774) it.next()).mo1802(c4083);
                        if (c4083.f14996) {
                            if (!this.f68431) {
                                j11 = 0;
                                break;
                            }
                            j11 = SkeinEngine.UbiTweak.T1_FIRST;
                            break;
                        }
                    }
                    j6 |= j11;
                }
                if ((j & 2305843009213693952L) != 0) {
                    j8 &= -1025;
                    j6 |= 16;
                }
                if ((j & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) != 0) {
                    InterfaceC12260 interfaceC12260M8271 = c2714.m8270((InterfaceC12260) abstractC8774);
                    try {
                        c2714.m8272(new InterfaceC11888() { // from class: l.᩻۫ۤ
                            @Override // l.InterfaceC11888
                            /* JADX INFO: renamed from: ۙ */
                            public final void mo5925() {
                                C21017.m47223(this.f76672, abstractC8774);
                            }
                        });
                        c2714.m8270(interfaceC12260M8271);
                    } catch (Throwable th2) {
                        c2714.m8270(interfaceC12260M8271);
                        throw th2;
                    }
                }
                j9 = abstractC23903.f77448.f77447;
            } else {
                throw new AssertionError();
            }
            j10 = j6 | (j9 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX);
            j5 = j8;
            j4 = j10;
        } else {
            j2 = 512;
            if (!abstractC8775.m22847(EnumC18651.f60554) || ((C6656) abstractC8775).f22482 == null) {
                AbstractC23903 abstractC23905 = abstractC23903.f77448;
                if (abstractC23905.f77452 != EnumC10477.f35865) {
                    j3 = 8589934608L;
                } else if ((abstractC23905.f77447 & 512) != 0) {
                    j4 = 25;
                    j5 = 25;
                } else {
                    j3 = 16607;
                }
            } else {
                j3 = 8589934592L;
            }
            j5 = j3;
            j4 = 0;
        }
        long j13 = j & (-4611677222334361601L) & (~j5);
        if (j13 == 0) {
            EnumC10477 enumC10477 = abstractC23903.f77452;
            EnumC10477 enumC10478 = EnumC10477.f35865;
            if ((enumC10477 == enumC10478 || m47321(abstractC8774, j, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS, 8796093022218L)) && m47321(abstractC8774, j, 10L, 8796093022208L) && m47321(abstractC8774, j, 1536L, 304L) && m47321(abstractC8774, j, 1L, 6L) && m47321(abstractC8774, j, 2L, 5L) && m47321(abstractC8774, j, 16L, 64L) && ((abstractC23903.f77452 == enumC10478 || m47321(abstractC8774, j, 1280L, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX)) && m47321(abstractC8774, j, 16L, -4611686018427387904L) && m47321(abstractC8774, j, SkeinEngine.UbiTweak.T1_FIRST, -9223372036854775792L))) {
                m47321(abstractC8774, j, SkeinEngine.UbiTweak.T1_FIRST, 8192L);
            }
        } else if ((j13 & j2) != 0) {
            c20414.m48199(abstractC8774, (j & 8192) != 0 ? C23879.f77258 : C23879.f77318);
            j5 |= j2;
        } else {
            EnumSet enumSetM21884 = C8360.m21884(j13);
            C5909 c5909 = C23879.f77204;
            c20414.m48199(abstractC8774, new C5909("compiler", "mod.not.allowed.here", enumSetM21884));
        }
        return (j & (4611677222334361600L | j5)) | j4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m47223(C21017 c21017, AbstractC8774 abstractC8774) {
        C16826 c16826 = c21017.f68442;
        EnumC0597 enumC0597 = EnumC0597.STRICTFP;
        if (c16826.m39467(enumC0597)) {
            c21017.f68429.m48203(enumC0597, abstractC8774, C9768.f32852);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47287(AbstractC8774 abstractC8774, C4603 c4603, boolean z) {
        new C7612(this, c4603).m20150(abstractC8774, z, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47303(C21825 c21825, C4603 c4603) {
        while (c21825.m48595()) {
            m47287((AbstractC8774) c21825.f70876, c4603, true);
            c21825 = c21825.f70877;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47285(AbstractC8774 abstractC8774, C4603 c4603) {
        C23195 c23195;
        C16826 c16826 = this.f68442;
        EnumC0597 enumC0597 = EnumC0597.RAW;
        if (c16826.m39467(enumC0597) && abstractC8774.f30190.m39001(EnumC6617.CLASS) && !C3128.m9473(abstractC8774)) {
            if (!(c4603.f16301.f30093.isEmpty() && (c23195 = c4603.f16294) != null && c23195.f75272 == this.f68444.f77632) && abstractC8774.f30190.mo1936()) {
                AbstractC16579 abstractC16579 = abstractC8774.f30190;
                AbstractC16579 abstractC165710 = abstractC16579.f53222.f77449;
                C14065 c14065 = C9768.f32836;
                this.f68429.m48203(enumC0597, abstractC8774, new C14065("compiler", "raw.class.use", abstractC16579, abstractC165710));
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m47255(AbstractC16579 abstractC16579, C21825 c21825) {
        while (c21825.m48595()) {
            if (this.f68417.m52413(abstractC16579, (AbstractC16579) c21825.f70876, true)) {
                return true;
            }
            c21825 = c21825.f70877;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m47336(AbstractC16579 abstractC16579, C21825 c21825) {
        while (c21825.m48595()) {
            AbstractC16579 abstractC165710 = (AbstractC16579) c21825.f70876;
            C23800 c23800 = this.f68417;
            if (c23800.m52413(abstractC16579, abstractC165710, true) || c23800.m52413((AbstractC16579) c21825.f70876, abstractC16579, true)) {
                return true;
            }
            c21825 = c21825.f70877;
        }
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21825 m47339(AbstractC16579 abstractC16579, C21825 c21825) {
        return m47255(abstractC16579, c21825) ? c21825 : m47270(abstractC16579, c21825).m48597(abstractC16579);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21825 m47270(AbstractC16579 abstractC16579, C21825 c21825) {
        if (!c21825.isEmpty()) {
            C21825 c21825M47270 = m47270(abstractC16579, c21825.f70877);
            if (this.f68417.m52413((AbstractC16579) c21825.f70876, abstractC16579, true)) {
                return c21825M47270;
            }
            if (c21825M47270 != c21825.f70877) {
                return c21825M47270.m48597((AbstractC16579) c21825.f70876);
            }
        }
        return c21825;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C21825 m47326(C21825 c21825, C21825 c21826) {
        while (c21826.m48595()) {
            c21825 = m47339((AbstractC16579) c21826.f70876, c21825);
            c21826 = c21826.f70877;
        }
        return c21825;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21825 m47340(C21825 c21825, C21825 c21826) {
        while (c21826.m48595()) {
            c21825 = m47270((AbstractC16579) c21826.f70876, c21825);
            c21826 = c21826.f70877;
        }
        return c21825;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C21825 m47331(C21825 c21825, C21825 c21826) {
        C21825 c21825M48588 = C21825.m48588();
        for (C21825 c21827 = c21825; c21827.m48595(); c21827 = c21827.f70877) {
            if (m47255((AbstractC16579) c21827.f70876, c21826)) {
                c21825M48588 = m47339((AbstractC16579) c21827.f70876, c21825M48588);
            }
        }
        while (c21826.m48595()) {
            if (m47255((AbstractC16579) c21826.f70876, c21825)) {
                c21825M48588 = m47339((AbstractC16579) c21826.f70876, c21825M48588);
            }
            c21826 = c21826.f70877;
        }
        return c21825M48588;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m47351(AbstractC16579 abstractC16579) {
        boolean zM39001 = abstractC16579.m39001(EnumC6617.TYPEVAR);
        C23800 c23800 = this.f68417;
        if (zM39001) {
            return m47351(c23800.m52432(abstractC16579));
        }
        if (abstractC16579.m39001(EnumC6617.CLASS)) {
            C22492 c22492 = (C22492) abstractC16579.f53222;
            if (c22492.f77452 == EnumC10477.f35866) {
                return true;
            }
            C3836 c3836 = this.f68430;
            return c22492.mo50008((AbstractC23903) c3836.f14278.f53222, c23800) || c22492.mo50008((AbstractC23903) c3836.f14233.f53222, c23800);
        }
        return abstractC16579.m39001(EnumC6617.BOT);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C21825 m47253(C21825 c21825, C21825 c21826) {
        C21825 c21825M48588 = C21825.m48588();
        while (c21825.m48595()) {
            AbstractC16579 abstractC16579 = (AbstractC16579) c21825.f70876;
            if (!m47351(abstractC16579) && !m47255(abstractC16579, c21826)) {
                c21825M48588 = c21825M48588.m48597((AbstractC16579) c21825.f70876);
            }
            c21825 = c21825.f70877;
        }
        return c21825M48588;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14377 m47209(C18258 c18258, C18258 c18259) {
        AbstractC23903 abstractC23903M52708 = c18258.m52708();
        AbstractC23903 abstractC23903M52709 = c18259.m52708();
        if ((c18259.f77448.mo20276() & 512) == 0) {
            C14377 c14377 = C14707.f48054;
            return new C14377("compiler", "cant.override", c18258, abstractC23903M52708, c18259, abstractC23903M52709);
        }
        if ((c18258.f77448.mo20276() & 512) == 0) {
            C14377 c14378 = C14707.f48054;
            return new C14377("compiler", "cant.implement", c18258, abstractC23903M52708, c18259, abstractC23903M52709);
        }
        C14377 c14379 = C14707.f48054;
        return new C14377("compiler", "clashes.with", c18258, abstractC23903M52708, c18259, abstractC23903M52709);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C14377 m47245(C18258 c18258, C18258 c18259) {
        AbstractC23903 abstractC23903M52708 = c18258.m52708();
        AbstractC23903 abstractC23903M52709 = c18259.m52708();
        if ((c18259.f77448.mo20276() & 512) == 0) {
            C14377 c14377 = C14707.f48054;
            return new C14377("compiler", "unchecked.override", c18258, abstractC23903M52708, c18259, abstractC23903M52709);
        }
        if ((c18258.f77448.mo20276() & 512) == 0) {
            C14377 c14378 = C14707.f48054;
            return new C14377("compiler", "unchecked.implement", c18258, abstractC23903M52708, c18259, abstractC23903M52709);
        }
        C14377 c14379 = C14707.f48054;
        return new C14377("compiler", "unchecked.clash.with", c18258, abstractC23903M52708, c18259, abstractC23903M52709);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C14377 m47240(C18258 c18258, C18258 c18259) {
        AbstractC23903 abstractC23903M52708 = c18258.m52708();
        AbstractC23903 abstractC23903M52709 = c18259.m52708();
        if ((c18259.f77448.mo20276() & 512) == 0) {
            C14377 c14377 = C14707.f48054;
            return new C14377("compiler", "varargs.override", c18258, abstractC23903M52708, c18259, abstractC23903M52709);
        }
        if ((c18258.f77448.mo20276() & 512) == 0) {
            C14377 c14378 = C14707.f48054;
            return new C14377("compiler", "varargs.implement", c18258, abstractC23903M52708, c18259, abstractC23903M52709);
        }
        C14377 c14379 = C14707.f48054;
        return new C14377("compiler", "varargs.clash.with", c18258, abstractC23903M52708, c18259, abstractC23903M52709);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m47322(InterfaceC12260 interfaceC12260, AbstractC16579 abstractC16579, AbstractC16579 abstractC165710, AbstractC16579 abstractC165711) {
        AbstractC16579 abstractC16579M52419;
        AbstractC16579 abstractC16579M524110;
        HashMap map;
        boolean z;
        AbstractC23903 abstractC23903;
        HashMap map2;
        Iterator it;
        long j;
        Iterator it2;
        HashMap map3;
        Iterator it3;
        long j2;
        Iterator it4;
        Iterator it5;
        Iterator it6;
        Iterator it7;
        long jMo20276 = abstractC165711.f53222.mo20276() & 16777216;
        C23800 c23800 = this.f68417;
        long j3 = 0;
        if (jMo20276 != 0) {
            abstractC16579M52419 = c23800.m52419(abstractC16579);
            abstractC16579M524110 = c23800.m52419(abstractC165710);
        } else {
            abstractC16579M52419 = abstractC16579;
            abstractC16579M524110 = abstractC165710;
        }
        HashMap map4 = new HashMap();
        m47214(abstractC16579M52419, map4);
        if (abstractC16579M52419 == abstractC16579M524110) {
            map = map4;
        } else {
            map = new HashMap();
            m47215(abstractC16579M524110, map4, map);
        }
        Iterator it8 = map4.values().iterator();
        loop0: while (true) {
            boolean z2 = false;
            Predicate predicate = null;
            if (!it8.hasNext()) {
                z = false;
                abstractC23903 = null;
                break;
            }
            AbstractC16579 abstractC165712 = (AbstractC16579) it8.next();
            Iterator it9 = map.values().iterator();
            while (it9.hasNext()) {
                AbstractC16579 abstractC165713 = (AbstractC16579) it9.next();
                Iterator it10 = abstractC165712.f53222.mo20272().mo3802(predicate, EnumC10167.NON_RECURSIVE).iterator();
                while (true) {
                    if (!it10.hasNext()) {
                        map2 = map;
                        it = it8;
                        j = j3;
                        it2 = it9;
                        z = false;
                        abstractC23903 = null;
                        break;
                    }
                    AbstractC23903 abstractC23904 = (AbstractC23903) it10.next();
                    if (abstractC23904.f77452 == EnumC10477.f35879 && abstractC23904.mo42454((AbstractC23903) abstractC165711.f53222, c23800) && (abstractC23904.mo20276() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == j3) {
                        C18258 c18258M42451 = ((C18258) abstractC23904).m42451(abstractC165711.f53222, c23800, z2);
                        C10391 c10391 = c23800.f76946;
                        if (c18258M42451 == null || (c18258M42451.f77447 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0) {
                            Iterator it11 = abstractC165713.f53222.mo20272().m9327(abstractC23904.f77453).iterator();
                            AbstractC16579 abstractC16579M52409 = null;
                            while (true) {
                                if (it11.hasNext()) {
                                    abstractC23903 = (AbstractC23903) it11.next();
                                    if (abstractC23904 == abstractC23903) {
                                        map2 = map;
                                    } else {
                                        map2 = map;
                                        if (abstractC23903.f77452 == EnumC10477.f35879 && abstractC23903.mo42454((AbstractC23903) abstractC165711.f53222, c23800)) {
                                            j = 0;
                                            if ((abstractC23903.mo20276() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0) {
                                                if (abstractC16579M52409 == null) {
                                                    abstractC16579M52409 = c23800.m52409(abstractC23904, abstractC165712);
                                                }
                                                AbstractC16579 abstractC16579M524010 = c23800.m52409(abstractC23903, abstractC165713);
                                                boolean zM52417 = c23800.m52417(abstractC16579M52409, abstractC16579M524010);
                                                it = it8;
                                                it6 = it11;
                                                C20414 c20414 = this.f68429;
                                                if (zM52417) {
                                                    C21825 c21825Mo1938 = abstractC16579M52409.mo1938();
                                                    it7 = it10;
                                                    C21825 c21825Mo1939 = abstractC16579M524010.mo1938();
                                                    it2 = it9;
                                                    AbstractC16579 abstractC16579Mo16235 = abstractC16579M52409.mo16235();
                                                    AbstractC16579 abstractC16579M52371 = c23800.m52371(abstractC16579M524010.mo16235(), c21825Mo1939, c21825Mo1938);
                                                    if (!c23800.m52399(abstractC16579Mo16235, abstractC16579M52371) && ((abstractC16579Mo16235.mo9482() || abstractC16579M52371.mo9482() || (!c23800.m52393(abstractC16579Mo16235, abstractC16579M52371, c10391) && !c23800.m52393(abstractC16579M52371, abstractC16579Mo16235, c10391))) && !m47325(abstractC23904, abstractC23903, abstractC165711))) {
                                                        AbstractC11242 abstractC11242 = abstractC23903.f77453;
                                                        C21825 c21825Mo33523 = c23800.m52409(abstractC23903, abstractC165713).mo33523();
                                                        C14377 c14377 = C14707.f48054;
                                                        C14377 c14378 = new C14377("compiler", "incompatible.diff.ret", abstractC11242, c21825Mo33523);
                                                        C5909 c5909 = C23879.f77204;
                                                        c20414.m48199(interfaceC12260, new C5909("compiler", "types.incompatible", abstractC165712, abstractC165713, c14378));
                                                        z = false;
                                                        break;
                                                    }
                                                } else {
                                                    it7 = it10;
                                                    it2 = it9;
                                                    C18901 c18901 = new C18901(this, ((C22492) abstractC165711.f53222).f77449);
                                                    if (c18901.m43565(abstractC23904) && c18901.m43565(abstractC23903) && c23800.m52394(abstractC23904.mo50006(c23800), abstractC23903.mo50006(c23800), true) && !m47325(abstractC23904, abstractC23903, abstractC165711)) {
                                                        AbstractC11242 abstractC11243 = abstractC23904.f77453;
                                                        C21825 c21825 = c23800.m52409(abstractC23904, abstractC165711).mo27295().f45367;
                                                        AbstractC23903 abstractC23903M52708 = abstractC23904.m52708();
                                                        AbstractC11242 abstractC11244 = abstractC23903.f77453;
                                                        C21825 c21826 = c23800.m52409(abstractC23903, abstractC165711).mo27295().f45367;
                                                        AbstractC23903 abstractC23903M52709 = abstractC23903.m52708();
                                                        C5909 c59010 = C23879.f77204;
                                                        c20414.m48199(interfaceC12260, new C5909("compiler", "name.clash.same.erasure.no.override", abstractC11243, c21825, abstractC23903M52708, abstractC11244, c21826, abstractC23903M52709));
                                                        z = false;
                                                        break;
                                                    }
                                                }
                                            } else {
                                                it = it8;
                                                it6 = it11;
                                                it7 = it10;
                                                it2 = it9;
                                            }
                                        }
                                        map = map2;
                                        it8 = it;
                                        it11 = it6;
                                        it10 = it7;
                                        it9 = it2;
                                    }
                                    it = it8;
                                    it6 = it11;
                                    it7 = it10;
                                    it2 = it9;
                                    map = map2;
                                    it8 = it;
                                    it11 = it6;
                                    it10 = it7;
                                    it9 = it2;
                                }
                            }
                        }
                        map3 = map;
                        it3 = it8;
                        it4 = it10;
                        it5 = it9;
                        j2 = 0;
                        z2 = false;
                    } else {
                        map3 = map;
                        it3 = it8;
                        j2 = j3;
                        it4 = it10;
                        it5 = it9;
                    }
                    map = map3;
                    j3 = j2;
                    it8 = it3;
                    it10 = it4;
                    it9 = it5;
                }
                if (abstractC23903 != null) {
                    break loop0;
                }
                z2 = false;
                predicate = null;
                map = map2;
                j3 = j;
                it8 = it;
                it9 = it2;
            }
        }
        if (abstractC23903 == null) {
            return true;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47214(AbstractC16579 abstractC16579, HashMap map) {
        if (abstractC16579.m39001(EnumC6617.CLASS) && map.put(abstractC16579.f53222, abstractC16579) == null) {
            C23800 c23800 = this.f68417;
            m47214(c23800.m52432(abstractC16579), map);
            Iterator it = c23800.m52439(abstractC16579).iterator();
            while (it.hasNext()) {
                m47214((AbstractC16579) it.next(), map);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47215(AbstractC16579 abstractC16579, HashMap map, HashMap map2) {
        if (abstractC16579.m39001(EnumC6617.CLASS) && map.get(abstractC16579.f53222) == null && map2.put(abstractC16579.f53222, abstractC16579) == null) {
            C23800 c23800 = this.f68417;
            m47215(c23800.m52432(abstractC16579), map, map2);
            Iterator it = c23800.m52439(abstractC16579).iterator();
            while (it.hasNext()) {
                m47215((AbstractC16579) it.next(), map, map2);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m47325(AbstractC23903 abstractC23903, AbstractC23903 abstractC23904, AbstractC16579 abstractC16579) {
        HashMap map = new HashMap();
        C23800 c23800 = this.f68417;
        AbstractC16579 abstractC16579M52409 = c23800.m52409(abstractC23903, abstractC16579);
        AbstractC16579 abstractC16579M524010 = c23800.m52409(abstractC23904, abstractC16579);
        m47214(abstractC16579, map);
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            for (AbstractC23903 abstractC23905 : ((AbstractC16579) it.next()).f53222.mo20272().m9327(abstractC23903.f77453)) {
                if (abstractC23905 != abstractC23903 && abstractC23905 != abstractC23904 && abstractC23905.f77452 == EnumC10477.f35879 && (abstractC23905.mo20276() & 2147487744L) == 0) {
                    AbstractC16579 abstractC16579M524011 = c23800.m52409(abstractC23905, abstractC16579);
                    if (c23800.m52417(abstractC16579M524011, abstractC16579M52409) && c23800.m52417(abstractC16579M524011, abstractC16579M524010) && c23800.m52365(abstractC16579M524011, abstractC16579M52409) && c23800.m52365(abstractC16579M524011, abstractC16579M524010)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [l.۫۟۟, l.᩺᩵۟] */
    /* JADX WARN: Type inference failed for: r13v1, types: [l.۫۟۟] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r5v0, types: [l.᩶᩷۟, l.᩸ۤ۟] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47276(C4603 c4603, final C23195 c23195, C18258 c18258) {
        C5909 c5909;
        C22492 c22492 = (C22492) c18258.f77448;
        c22492.mo49994();
        long j = c22492.f77447 & 16384;
        ?? r5 = this.f68429;
        C3836 c3836 = this.f68430;
        C23800 c23800 = this.f68417;
        if (j != 0 && this.f68444.f77553.equals(c18258.f77453) && c18258.mo42453(c3836.f14274, c22492, c23800, false)) {
            r5.m48199(c23195, C23879.f77223);
            return;
        }
        if (this.f68434 && c22492.m50010() && C9030.stream(c22492.m50004()).filter(new Predicate() { // from class: l.֡۫ۤ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C8512.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo9645negate() {
                return C8512.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C8512.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                C18258 c18259 = ((C16142) obj).f52153;
                return c18259 == c23195.f75263 && (c18259.f77447 & 16777216) == 0;
            }
        }).findFirst().isPresent()) {
            return;
        }
        for (AbstractC16579 abstractC16579M52432 = c22492.f77449; abstractC16579M52432.m39001(EnumC6617.CLASS); abstractC16579M52432 = c23800.m52432(abstractC16579M52432)) {
            if (abstractC16579M52432 != c22492.f77449) {
                m47313((C23195) c23195, abstractC16579M52432, c22492, c18258);
            }
            Iterator it = c23800.m52439(abstractC16579M52432).iterator();
            while (it.hasNext()) {
                m47313((C23195) c23195, (AbstractC16579) it.next(), c22492, c18258);
            }
        }
        boolean z = c18258.m52702((AbstractC23903) c3836.f14217.f53222) != null;
        if (z || !(!((C22990) c4603.f16299).f74711 || c18258.m52713() || (c18258.f77447 & 7) == 2)) {
            if (c18258.f77452 == EnumC10477.f35879 && !c18258.mo22992()) {
                AbstractC0618 abstractC0618 = (AbstractC0618) c18258.f77448;
                for (AbstractC16579 abstractC16579 : c23800.m52398(abstractC0618.f77449)) {
                    if (abstractC16579 != abstractC0618.f77449) {
                        for (AbstractC23903 abstractC23903 : abstractC16579.f53222.mo20272().m9327(c18258.f77453)) {
                            if (!abstractC23903.mo22992() && c18258.mo42453(abstractC23903, abstractC0618, c23800, true)) {
                                return;
                            }
                        }
                    }
                }
            }
            for (C5224 c5224 : c23195.f75267.f70566) {
                if (c5224.f18121.f30190.f53222 == c3836.f14217.f53222) {
                    c23195 = c5224;
                    break;
                }
            }
            if (z) {
                c5909 = c18258.mo22992() ? C23879.f77239 : C23879.f77197;
            } else {
                C5909 c59010 = C23879.f77204;
                c5909 = new C5909("compiler", "anonymous.diamond.method.does.not.override.superclass", C14707.f48098);
            }
            r5.m48199(c23195, c5909);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47313(C23195 c23195, AbstractC16579 abstractC16579, C22492 c22492, C18258 c18258) {
        for (AbstractC23903 abstractC23903 : abstractC16579.f53222.mo20272().m9327(c18258.f77453)) {
            if (c18258.mo42453(abstractC23903, c22492, this.f68417, false) && (abstractC23903.mo20276() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) == 0) {
                m47288(c23195, c18258, (C18258) abstractC23903, c22492);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47289(AbstractC8774 abstractC8774, C22492 c22492) {
        C21825 c21825M52439;
        C3836 c3836 = this.f68430;
        AbstractC16579 abstractC16579 = c3836.f14275;
        AbstractC16579 abstractC165710 = c3836.f14275;
        if (c22492 == ((C22492) abstractC16579.f53222) || c22492.m52721() || c22492.m52717()) {
            return;
        }
        c22492.mo49994();
        if ((c22492.f77447 & 8192) == 0) {
            c22492.mo49994();
            if ((c22492.f77447 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0) {
                return;
            }
            boolean zIsEmpty = c22492.f77453.isEmpty();
            C23800 c23800 = this.f68417;
            if (!zIsEmpty || (c21825M52439 = c23800.m52439(c22492.f77449)) == null || c21825M52439.isEmpty() || ((AbstractC16579) c21825M52439.f70876).f53222 != c3836.f14248.f53222) {
                C16826 c16826 = this.f68442;
                EnumC0597 enumC0597 = EnumC0597.OVERRIDES;
                if (c16826.m39467(enumC0597)) {
                    AbstractC9462 abstractC9462Mo20272 = abstractC165710.f53222.mo20272();
                    C23942 c23942 = this.f68444;
                    C18258 c18258 = (C18258) abstractC9462Mo20272.mo3804(c23942.f77561, (Predicate) null);
                    C18258 c18259 = (C18258) abstractC165710.f53222.mo20272().mo3804(c23942.f77648, (Predicate) null);
                    C16973 c16973 = this.f68445;
                    C18258 c18258M52374 = c23800.m52374(c18258, (AbstractC0618) c22492, false, (Predicate) c16973);
                    boolean z = c18258M52374 != null && c18258M52374.f77448 == c22492;
                    boolean z2 = c23800.m52374(c18259, (AbstractC0618) c22492, false, (Predicate) c16973) != c18259;
                    if (!z || z2) {
                        return;
                    }
                    C14065 c14065 = C9768.f32836;
                    this.f68429.m48203(enumC0597, abstractC8774, new C14065("compiler", "override.equals.but.not.hashcode", c22492));
                }
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47301(C18255 c18255) {
        AbstractC5930 abstractC5930;
        C23570 c23570;
        AbstractC11242 abstractC11242;
        AbstractC5930 abstractC5931;
        InterfaceC12260 interfaceC12260;
        C6171.m17171(c18255.f58256.f77453);
        if (this.f68442.m39467(EnumC0597.MODULE)) {
            AbstractC5930 abstractC5932 = c18255.f58253;
            while (abstractC5930 != null) {
                int i = C21723.f70427[abstractC5930.mo1803().ordinal()];
                if (i == 1) {
                    c23570 = (C23570) abstractC5930;
                    abstractC11242 = c23570.f76356;
                    abstractC5931 = c23570.f76357;
                } else if (i == 2) {
                    abstractC11242 = ((C3107) abstractC5930).f11715;
                    abstractC5931 = null;
                } else {
                    abstractC5930 = abstractC5932;
                    throw new AssertionError("Unexpected qualified identifier: " + abstractC5930.toString());
                }
                if (abstractC11242 != null) {
                    abstractC5930 = abstractC5932;
                    interfaceC12260 = c23570;
                    String string = abstractC11242.toString();
                    int length = string.length();
                    if (length <= 0 || !Character.isDigit(string.charAt(length - 1))) {
                        abstractC5930 = abstractC5932;
                        interfaceC12260 = abstractC5930;
                    } else {
                        abstractC5930 = abstractC5932;
                        interfaceC12260 = abstractC5930;
                        EnumC0597 enumC0597 = EnumC0597.MODULE;
                        C14065 c14065 = C9768.f32836;
                        this.f68429.m48203(enumC0597, interfaceC12260, new C14065("compiler", "poor.choice.for.module.name", abstractC11242));
                    }
                } else {
                    abstractC5930 = abstractC5932;
                    interfaceC12260 = c23570;
                    abstractC5930 = abstractC5932;
                    interfaceC12260 = abstractC5930;
                }
                abstractC5930 = abstractC5931;
            }
            abstractC5930 = abstractC5932;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47308(C22492 c22492, InterfaceC12260 interfaceC12260) {
        C23800 c23800 = this.f68417;
        C18258 c18258M52375 = c23800.m52375(c22492);
        if (c18258M52375 != null) {
            C18258 c18258 = new C18258(c18258M52375.f77447, c18258M52375.f77453, c23800.m52409(c18258M52375, c22492.f77449), c18258M52375.f77448);
            AbstractC23903 abstractC23903M52708 = c18258.m52708();
            C5909 c5909 = C23879.f77204;
            this.f68429.m48199(interfaceC12260, new C5909("compiler", "does.not.override.abstract", c22492, c18258, abstractC23903M52708));
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m47353(InterfaceC12260 interfaceC12260, AbstractC16579 abstractC16579) {
        m47250(interfaceC12260, abstractC16579);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47305(C22179 c22179, C22929 c22929) {
        m47229(c22179, c22929, C21825.m48588());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47229(C22179 c22179, AbstractC16579 abstractC16579, C21825 c21825) {
        EnumC6617 enumC6617 = EnumC6617.TYPEVAR;
        if (!abstractC16579.m39001(enumC6617) || (abstractC16579.f53222.mo20276() & 268435456) == 0) {
            boolean zContains = c21825.contains(abstractC16579);
            C23800 c23800 = this.f68417;
            if (zContains) {
                ((C22929) abstractC16579).mo18111(c23800.m52440(abstractC16579));
                C5909 c5909 = C23879.f77204;
                this.f68429.m48199(c22179, new C5909("compiler", "cyclic.inheritance", abstractC16579));
            } else if (abstractC16579.m39001(enumC6617)) {
                C22929 c22929 = (C22929) abstractC16579;
                C21825 c21825M48597 = c21825.m48597(c22929);
                Iterator it = c23800.m52381(c22929).iterator();
                while (it.hasNext()) {
                    m47229(c22179, (AbstractC16579) it.next(), c21825M48597);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0089  */
    /* JADX WARN: Code duplicated, block: B:40:0x009c  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a0  */
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private boolean m47250(InterfaceC12260 interfaceC12260, AbstractC16579 abstractC16579) {
        boolean zM47250;
        AbstractC0618 abstractC0618 = abstractC16579.f53222;
        long j = abstractC0618.f77447;
        if ((j & 1073741824) != 0) {
            return true;
        }
        if ((j & 134217728) != 0) {
            m47241((C22492) abstractC0618, interfaceC12260);
        } else {
            if (!abstractC0618.f77449.mo1926()) {
                try {
                    abstractC0618.f77447 = 134217728 | abstractC0618.f77447;
                    if (abstractC0618.f77449.m39001(EnumC6617.CLASS)) {
                        C0309 c0309 = (C0309) abstractC0618.f77449;
                        C21825 c21825 = c0309.f1658;
                        zM47250 = true;
                        if (c21825 != null) {
                            while (c21825.m48595()) {
                                zM47250 &= m47250(interfaceC12260, (AbstractC16579) c21825.f70876);
                                c21825 = c21825.f70877;
                            }
                        }
                        AbstractC16579 abstractC165710 = c0309.f1654;
                        if (abstractC165710 != null && abstractC165710 != null && abstractC165710.m39001(EnumC6617.CLASS)) {
                            zM47250 &= m47250(interfaceC12260, abstractC165710);
                        }
                        AbstractC23903 abstractC23903 = abstractC0618.f77448;
                        if (abstractC23903.f77452 == EnumC10477.f35865) {
                            zM47250 &= m47250(interfaceC12260, abstractC23903.f77449);
                        }
                    } else {
                        zM47250 = true;
                    }
                    abstractC0618.f77447 = (-134217729) & abstractC0618.f77447;
                } catch (Throwable th) {
                    abstractC0618.f77447 = (-134217729) & abstractC0618.f77447;
                    throw th;
                }
            }
            if (zM47250) {
                zM47250 = (abstractC0618.f77447 & 268435456) != 0 && abstractC0618.f77451.mo1180();
            }
            if (zM47250) {
                abstractC0618.f77447 |= 1073741824;
            }
            return zM47250;
        }
        zM47250 = true;
        if (zM47250) {
            zM47250 = (abstractC0618.f77447 & 268435456) != 0 && abstractC0618.f77451.mo1180();
        }
        if (zM47250) {
            abstractC0618.f77447 |= 1073741824;
        }
        return zM47250;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void m47241(C22492 c22492, InterfaceC12260 interfaceC12260) {
        C5909 c5909 = C23879.f77204;
        this.f68429.m48199(interfaceC12260, new C5909("compiler", "cyclic.inheritance", c22492));
        AbstractC16579 abstractC16579 = c22492.f77449;
        C23800 c23800 = this.f68417;
        for (C21825 c21825M52439 = c23800.m52439(abstractC16579); c21825M52439.m48595(); c21825M52439 = c21825M52439.f70877) {
            c21825M52439.f70876 = new C5954((C22492) ((AbstractC16579) c21825M52439.f70876).f53222, AbstractC16579.f53219);
        }
        AbstractC16579 abstractC16579M52432 = c23800.m52432(c22492.f77449);
        if (abstractC16579M52432.m39001(EnumC6617.CLASS)) {
            ((C0309) c22492.f77449).f1654 = new C5954((C22492) abstractC16579M52432.f53222, AbstractC16579.f53219);
        }
        c22492.f77449 = new C5954(c22492, c22492.f77449);
        c22492.f77447 |= 1073741824;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47290(AbstractC8774 abstractC8774, C22492 c22492, C22492 c22493) {
        C18258 c18258;
        C18258 c18258M42451;
        AbstractC16579 abstractC16579 = c22493.f77449;
        C23800 c23800 = this.f68417;
        for (C21825 c21825M52398 = c23800.m52398(abstractC16579); c21825M52398.m48595(); c21825M52398 = c21825M52398.f70877) {
            C22492 c22494 = (C22492) ((AbstractC16579) c21825M52398.f70876).f53222;
            c22494.mo49994();
            if ((c22494.f77447 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0) {
                c22494.mo49994();
                for (AbstractC23903 abstractC23903 : c22494.f73417.mo3802((Predicate) null, EnumC10167.NON_RECURSIVE)) {
                    if (abstractC23903.f77452 == EnumC10477.f35879 && (abstractC23903.mo20276() & 1032) == ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS && (c18258M42451 = (c18258 = (C18258) abstractC23903).m42451(c22492, c23800, false)) != null && c18258M42451 != c18258) {
                        long jMo20276 = c18258M42451.f77448.mo20276() & 512;
                        c22492.mo49994();
                        if (jMo20276 == (512 & c22492.f77447)) {
                            m47288(abstractC8774, c18258M42451, c18258, c22492);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m47334(InterfaceC12260 interfaceC12260, AbstractC16579 abstractC16579) {
        long j;
        C23800 c23800 = this.f68417;
        C21825 c21825M52439 = c23800.m52439(abstractC16579);
        AbstractC16579 abstractC16579M52432 = c23800.m52432(abstractC16579);
        long j2 = 0;
        if (abstractC16579M52432.m39001(EnumC6617.CLASS) && (abstractC16579M52432.f53222.mo20276() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0) {
            c21825M52439 = c21825M52439.m48597(abstractC16579M52432);
        }
        for (C21825 c21825 = c21825M52439; c21825.m48595(); c21825 = c21825.f70877) {
            if (!((AbstractC16579) c21825.f70876).mo1938().isEmpty()) {
                AbstractC16579 abstractC165710 = (AbstractC16579) c21825.f70876;
                if (!m47322(interfaceC12260, abstractC165710, abstractC165710, abstractC16579)) {
                    return;
                }
            }
            for (C21825 c21826 = c21825M52439; c21826 != c21825; c21826 = c21826.f70877) {
                if (!m47322(interfaceC12260, (AbstractC16579) c21825.f70876, (AbstractC16579) c21826.f70876, abstractC16579)) {
                    return;
                }
            }
        }
        AbstractC16579 abstractC16579M52433 = c23800.m52432(abstractC16579);
        if (abstractC16579M52433.m39001(EnumC6617.CLASS)) {
            for (AbstractC16579 abstractC16579M52434 = abstractC16579M52433; abstractC16579M52434.m39001(EnumC6617.CLASS) && abstractC16579M52434.f53222.f77449.mo1942(); abstractC16579M52434 = c23800.m52432(abstractC16579M52434)) {
                for (AbstractC23903 abstractC23903 : abstractC16579M52434.f53222.mo20272().mo3802((Predicate) null, EnumC10167.NON_RECURSIVE)) {
                    if (abstractC23903.f77452 == EnumC10477.f35879) {
                        long j3 = 2147487752L;
                        if ((abstractC23903.mo20276() & 2147487752L) == j2 && abstractC23903.mo42454((AbstractC23903) abstractC16579.f53222, c23800)) {
                            boolean z = true;
                            if (((C18258) abstractC23903).m42451(abstractC16579.f53222, c23800, true) == abstractC23903) {
                                AbstractC16579 abstractC16579M52409 = c23800.m52409(abstractC23903, abstractC16579M52434);
                                int iM48596 = abstractC16579M52409.mo33523().m48596();
                                if (abstractC16579M52409 != abstractC23903.f77449) {
                                    AbstractC16579 abstractC16579M52435 = abstractC16579M52433;
                                    while (abstractC16579M52435.m39001(EnumC6617.CLASS)) {
                                        for (AbstractC23903 abstractC23904 : abstractC16579M52435.f53222.mo20272().m9327(abstractC23903.f77453)) {
                                            if (abstractC23904 == abstractC23903) {
                                                j = j3;
                                            } else if (abstractC23904.f77452 == EnumC10477.f35879) {
                                                j = 2147487752L;
                                                if ((abstractC23904.mo20276() & 2147487752L) == 0 && abstractC23904.f77449.mo33523().m48596() == iM48596 && abstractC23904.mo42454((AbstractC23903) abstractC16579.f53222, c23800) && ((C18258) abstractC23904).m42451(abstractC16579.f53222, c23800, z) == abstractC23904) {
                                                    if (c23800.m52417(abstractC16579M52409, c23800.m52409(abstractC23904, abstractC16579M52435))) {
                                                        C5909 c5909 = C23879.f77204;
                                                        Object[] objArr = new Object[5];
                                                        objArr[0] = abstractC23903;
                                                        objArr[z ? 1 : 0] = abstractC16579M52434;
                                                        objArr[2] = abstractC23904;
                                                        objArr[3] = abstractC16579M52435;
                                                        objArr[4] = abstractC16579M52433;
                                                        this.f68429.m48199(interfaceC12260, new C5909("compiler", "concrete.inheritance.conflict", objArr));
                                                    }
                                                    z = true;
                                                }
                                            } else {
                                                j = 2147487752L;
                                            }
                                            j3 = j;
                                        }
                                        abstractC16579M52435 = c23800.m52432(abstractC16579M52435);
                                        z = true;
                                    }
                                    j2 = 0;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m47349(C23195 c23195, AbstractC16579 abstractC16579, C18258 c18258) {
        C18901 c18901 = new C18901(this, abstractC16579);
        C21825 c21825M48588 = C21825.m48588();
        final ArrayList<AbstractC23903> arrayList = new ArrayList();
        C23800 c23800 = this.f68417;
        boolean z = false;
        C0356.forEach(c23800.m52366(abstractC16579, false).mo3803(c18258.f77453, c18901, EnumC10167.RECURSIVE), new Consumer() { // from class: l.۫۫ۤ
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj) {
                arrayList.add((AbstractC23903) obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C1455.$default$andThen(this, consumer);
            }
        });
        boolean z2 = false;
        for (AbstractC23903 abstractC23903 : arrayList) {
            if (c18258.mo42453(abstractC23903, abstractC16579.f53222, c23800, z)) {
                if (abstractC23903 != c18258) {
                    c21825M48588 = C21825.m48588();
                    z2 = true;
                }
                for (AbstractC23903 abstractC23904 : arrayList) {
                    if (abstractC23904 != abstractC23903) {
                        if (!c23800.m52429(c18258.f77449, c23800.m52409(abstractC23904, abstractC16579), EnumC14026.f46123.m33945(this.f68439)) && c23800.m52394(abstractC23904.mo50006(c23800), abstractC23903.mo50006(c23800), true)) {
                            c18258.f77447 |= 4398046511104L;
                            C20414 c20414 = this.f68429;
                            if (abstractC23903 == c18258) {
                                AbstractC11242 abstractC11242 = abstractC23903.f77453;
                                C21825 c21825 = c23800.m52409(abstractC23903, abstractC16579).mo27295().f45367;
                                AbstractC23903 abstractC23903M52708 = abstractC23903.m52708();
                                AbstractC11242 abstractC11243 = abstractC23904.f77453;
                                C21825 c21826 = c23800.m52409(abstractC23904, abstractC16579).mo27295().f45367;
                                AbstractC23903 abstractC23903M52709 = abstractC23904.m52708();
                                C5909 c5909 = C23879.f77204;
                                c20414.m48199(c23195, new C5909("compiler", "name.clash.same.erasure.no.override", abstractC11242, c21825, abstractC23903M52708, abstractC11243, c21826, abstractC23903M52709));
                                return;
                            }
                            C0309 c0309 = (C0309) abstractC16579;
                            String str = c0309.mo16236() ? "interface" : Name.LABEL;
                            AbstractC11242 abstractC11244 = c0309.f53222.f77453;
                            AbstractC11242 abstractC11245 = abstractC23903.f77453;
                            C21825 c21827 = c23800.m52409(abstractC23903, abstractC16579).mo27295().f45367;
                            AbstractC23903 abstractC23903M527010 = abstractC23903.m52708();
                            AbstractC11242 abstractC11246 = abstractC23904.f77453;
                            C21825 c21828 = c23800.m52409(abstractC23904, abstractC16579).mo27295().f45367;
                            AbstractC23903 abstractC23903M527011 = abstractC23904.m52708();
                            C5909 c59010 = C23879.f77204;
                            c20414.m48199(c23195, new C5909("compiler", "name.clash.same.erasure.no.override.1", str, abstractC11244, abstractC11245, c21827, abstractC23903M527010, abstractC11246, c21828, abstractC23903M527011));
                            return;
                        }
                        z = false;
                    }
                }
            } else if (abstractC23903 != c18258 && !z2) {
                c21825M48588 = c21825M48588.m48597((C18258) abstractC23903);
            }
        }
        if (z2) {
            return;
        }
        Iterator it = c21825M48588.iterator();
        while (it.hasNext()) {
            m47312(c23195, abstractC16579, c18258, (C18258) it.next());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47311(C23195 c23195, AbstractC16579 abstractC16579, C18258 c18258) {
        C18901 c18901 = new C18901(this, abstractC16579);
        C23800 c23800 = this.f68417;
        for (AbstractC23903 abstractC23903 : c23800.m52366(abstractC16579, true).mo3803(c18258.f77453, c18901, EnumC10167.RECURSIVE)) {
            if (!c23800.m52429(c18258.f77449, c23800.m52409(abstractC23903, abstractC16579), EnumC14026.f46123.m33945(this.f68439))) {
                if (c23800.m52394(abstractC23903.mo50006(c23800), c18258.mo50006(c23800), true)) {
                    AbstractC23903 abstractC23903M52708 = c18258.m52708();
                    AbstractC23903 abstractC23903M52709 = abstractC23903.m52708();
                    C5909 c5909 = C23879.f77204;
                    this.f68429.m48199(c23195, new C5909("compiler", "name.clash.same.erasure.no.hide", c18258, abstractC23903M52708, abstractC23903, abstractC23903M52709));
                    return;
                }
                m47312(c23195, abstractC16579, c18258, (C18258) abstractC23903);
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m47327(InterfaceC12260 interfaceC12260, AbstractC16579 abstractC16579) {
        char c;
        AbstractC23903 abstractC23903;
        C14377 c14377;
        C9024 c9024 = new C9024(this, abstractC16579);
        C23800 c23800 = this.f68417;
        for (AbstractC23903 abstractC23904 : c23800.m52366(abstractC16579, false).mo3802(c9024, EnumC10167.RECURSIVE)) {
            int i = 1;
            C6171.m17176(abstractC23904.f77452 == EnumC10477.f35879);
            C21825 c21825M52376 = c23800.m52376(abstractC16579, (C18258) abstractC23904);
            if (c21825M52376.m48596() > 1) {
                C19003 c19003 = new C19003();
                C19003 c19004 = new C19003();
                Iterator it = c21825M52376.iterator();
                while (true) {
                    if (it.hasNext()) {
                        C18258 c18258 = (C18258) it.next();
                        long j = c18258.f77447;
                        if ((8796093022208L & j) != 0) {
                            c19004.m43723(c18258);
                        } else if ((j & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0) {
                            c19003.m43723(c18258);
                        }
                        if (c19004.m43722() && c19003.size() + c19004.size() >= 2) {
                            AbstractC23903 abstractC23905 = (AbstractC23903) c19004.first();
                            if (c19004.size() > i) {
                                abstractC23903 = (AbstractC23903) c19004.m43726().f70877.f70876;
                                EnumC7654 enumC7654M38160 = C16121.m38160(abstractC16579.f53222);
                                AbstractC11242 abstractC11242 = abstractC23904.f77453;
                                C21825 c21825Mo33523 = c23800.m52409(abstractC23904, abstractC16579).mo33523();
                                AbstractC23903 abstractC23903M52708 = abstractC23905.m52708();
                                AbstractC23903 abstractC23903M52709 = abstractC23903.m52708();
                                C14377 c14378 = C14707.f48054;
                                c = 1;
                                c14377 = new C14377("compiler", "incompatible.unrelated.defaults", enumC7654M38160, abstractC16579, abstractC11242, c21825Mo33523, abstractC23903M52708, abstractC23903M52709);
                            } else {
                                c = 1;
                                abstractC23903 = (AbstractC23903) c19003.first();
                                EnumC7654 enumC7654M38161 = C16121.m38160(abstractC16579.f53222);
                                AbstractC11242 abstractC11243 = abstractC23904.f77453;
                                C21825 c21825Mo33524 = c23800.m52409(abstractC23904, abstractC16579).mo33523();
                                AbstractC23903 abstractC23903M527010 = abstractC23905.m52708();
                                AbstractC23903 abstractC23903M527011 = abstractC23903.m52708();
                                C14377 c14379 = C14707.f48054;
                                c14377 = new C14377("compiler", "incompatible.abstract.default", enumC7654M38161, abstractC16579, abstractC11243, c21825Mo33524, abstractC23903M527010, abstractC23903M527011);
                            }
                            AbstractC16579 abstractC165710 = abstractC23905.m52708().f77449;
                            AbstractC16579 abstractC165711 = abstractC23903.m52708().f77449;
                            C5909 c5909 = C23879.f77204;
                            Object[] objArr = new Object[3];
                            objArr[0] = abstractC165710;
                            objArr[c] = abstractC165711;
                            objArr[2] = c14377;
                            this.f68429.m48199(interfaceC12260, new C5909("compiler", "types.incompatible", objArr));
                            break;
                        }
                        i = 1;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47312(C23195 c23195, AbstractC16579 abstractC16579, C18258 c18258, C18258 c18259) {
        if (c18258 != c18259 && EnumC14026.f46107.m33945(this.f68439) && this.f68442.m39467(EnumC0597.OVERLOADS) && (c18258.f77447 & 281474976710656L) == 0 && (c18259.f77447 & 281474976710656L) == 0) {
            C23800 c23800 = this.f68417;
            AbstractC16579 abstractC16579M52409 = c23800.m52409(c18258, abstractC16579);
            AbstractC16579 abstractC16579M524010 = c23800.m52409(c18259, abstractC16579);
            EnumC6617 enumC6617 = EnumC6617.FORALL;
            if (abstractC16579M52409.m39001(enumC6617) && abstractC16579M524010.m39001(enumC6617)) {
                C10894 c10894 = (C10894) abstractC16579M52409;
                C10894 c10895 = (C10894) abstractC16579M524010;
                if (c23800.m52391(c10894, c10895)) {
                    abstractC16579M524010 = c23800.m52371(abstractC16579M524010, c10895.f37076, c10894.f37076);
                }
            }
            int iMax = Math.max(abstractC16579M52409.mo33523().m48596(), abstractC16579M524010.mo33523().m48596());
            C21825 c21825Mo33523 = abstractC16579M52409.mo33523();
            C20145 c20145 = this.f68432;
            C21825 c21825M45528 = c20145.m45528(c21825Mo33523, (AbstractC23903) c18258, iMax, true);
            C21825 c21825M45529 = c20145.m45528(abstractC16579M524010.mo33523(), (AbstractC23903) c18259, iMax, true);
            if (c21825M45528.m48596() != c21825M45529.m48596()) {
                return;
            }
            boolean z = false;
            while (c21825M45528.m48595() && c21825M45529.m48595()) {
                AbstractC16579 abstractC165710 = (AbstractC16579) c21825M45528.f70876;
                AbstractC16579 abstractC165711 = (AbstractC16579) c21825M45529.f70876;
                if (!c23800.m52413(abstractC165711, abstractC165710, true) && !c23800.m52413(abstractC165710, abstractC165711, true)) {
                    if (!c23800.m52404(abstractC165710) || !c23800.m52404(abstractC165711) || c23800.m52431(abstractC165710).mo33523().m48596() <= 0 || c23800.m52431(abstractC165710).mo33523().m48596() != c23800.m52431(abstractC165711).mo33523().m48596()) {
                        return;
                    } else {
                        z = true;
                    }
                }
                c21825M45528 = c21825M45528.f70877;
                c21825M45529 = c21825M45529.f70877;
            }
            if (z) {
                c18258.f77447 |= 281474976710656L;
                c18259.f77447 |= 281474976710656L;
                EnumC0597 enumC0597 = EnumC0597.OVERLOADS;
                AbstractC23903 abstractC23903M52708 = c18258.m52708();
                AbstractC23903 abstractC23903M52709 = c18259.m52708();
                C14065 c14065 = C9768.f32836;
                this.f68429.m48203(enumC0597, c23195, new C14065("compiler", "potentially.ambiguous.overload", c18258, abstractC23903M52708, c18259, abstractC23903M52709));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47280(AbstractC5930 abstractC5930, boolean z) {
        if (!this.f68419) {
            C16826 c16826 = this.f68442;
            EnumC0597 enumC0597 = EnumC0597.SERIAL;
            if (!c16826.m39467(enumC0597) || this.f68442.m39468(enumC0597) || !z) {
                return;
            }
        }
        AbstractC23903 abstractC23903M9471 = C3128.m9471(abstractC5930);
        if (abstractC23903M9471.f77452.m26580(C21059.f68591)) {
            if (abstractC23903M9471.f77452 == EnumC10477.f35878) {
                if ((abstractC23903M9471.mo20276() & 8589934592L) != 0 || abstractC23903M9471.m52728()) {
                    return;
                }
                AbstractC11242 abstractC11242 = abstractC23903M9471.f77453;
                C23942 c23942 = this.f68444;
                if (abstractC11242 == c23942.f77533 || abstractC11242 == c23942.f77638) {
                    return;
                }
            }
            AbstractC16579 abstractC16579 = abstractC23903M9471.f77448.f77449;
            C3836 c3836 = this.f68430;
            if (this.f68417.m52413(abstractC16579, c3836.f14268, true) || abstractC23903M9471.m52724() == c3836.f14227) {
                return;
            }
            for (AbstractC23903 abstractC23903 = abstractC23903M9471; abstractC23903.f77452 != EnumC10477.f35867; abstractC23903 = abstractC23903.f77448) {
                if ((abstractC23903.mo20276() & 1) == 0) {
                    C20414 c20414 = this.f68429;
                    if (!z) {
                        C14065 c14065 = C9768.f32836;
                        c20414.m48204(abstractC5930, new C14065("compiler", "access.to.member.from.serializable.element", abstractC23903M9471));
                        return;
                    }
                    String string = abstractC23903M9471.m52724().f25396.toString();
                    if (string.startsWith("java.") || string.startsWith("javax.") || string.startsWith("sun.") || string.contains(".internal.")) {
                        EnumC0597 enumC0598 = EnumC0597.SERIAL;
                        C14065 c14066 = C9768.f32836;
                        c20414.m48203(enumC0598, abstractC5930, new C14065("compiler", "access.to.member.from.serializable.lambda", abstractC23903M9471));
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47292(InterfaceC12260 interfaceC12260, HashMap map, AbstractC16579 abstractC16579) {
        if (abstractC16579.mo1926()) {
            return;
        }
        C23800 c23800 = this.f68417;
        for (C21825 c21825M52439 = c23800.m52439(abstractC16579); c21825M52439.m48595(); c21825M52439 = c21825M52439.f70877) {
            AbstractC16579 abstractC165710 = (AbstractC16579) c21825M52439.f70876;
            EnumC6617 enumC6617 = EnumC6617.CLASS;
            if (!abstractC16579.m39001(enumC6617) || abstractC165710.m39001(enumC6617)) {
                AbstractC16579 abstractC165711 = (AbstractC16579) map.put(abstractC165710.f53222, abstractC165710);
                if (abstractC165711 != null) {
                    C21825 c21825Mo1943 = abstractC165711.mo1943();
                    C21825 c21825Mo1944 = abstractC165710.mo1943();
                    if (!c23800.m52430(c21825Mo1943, c21825Mo1944)) {
                        AbstractC0618 abstractC0618 = abstractC165710.f53222;
                        String strM38994 = AbstractC16579.m38994(c21825Mo1943);
                        String strM38995 = AbstractC16579.m38994(c21825Mo1944);
                        C5909 c5909 = C23879.f77204;
                        this.f68429.m48199(interfaceC12260, new C5909("compiler", "cant.inherit.diff.arg", abstractC0618, strM38994, strM38995));
                    }
                }
                m47292(interfaceC12260, map, abstractC165710);
            }
        }
        AbstractC16579 abstractC16579M52432 = c23800.m52432(abstractC16579);
        EnumC6617 enumC6618 = EnumC6617.CLASS;
        if ((!abstractC16579.m39001(enumC6618) || abstractC16579M52432.m39001(enumC6618)) && abstractC16579M52432 != AbstractC16579.f53219) {
            m47292(interfaceC12260, map, abstractC16579M52432);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47278(AbstractC5930 abstractC5930, AbstractC16579 abstractC16579, HashSet hashSet) {
        if (hashSet.contains(abstractC16579)) {
            this.f68429.m48199(abstractC5930, C23879.f77341);
        } else {
            hashSet.add(abstractC16579);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m47344(AbstractC8774 abstractC8774) {
        if (abstractC8774 != null) {
            m47329(abstractC8774, abstractC8774.f30190);
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m47329(InterfaceC12260 interfaceC12260, AbstractC16579 abstractC16579) {
        if (abstractC16579.mo9481()) {
            return;
        }
        C3836 c3836 = this.f68430;
        AbstractC16579 abstractC165710 = c3836.f14220;
        C23800 c23800 = this.f68417;
        if (!c23800.m52399(abstractC16579, abstractC165710) && (abstractC16579.f53222.mo20276() & 16384) == 0 && (abstractC16579.f53222.mo20276() & 8192) == 0 && C23800.m52352(abstractC16579).f53222 != c3836.f14283.f53222) {
            if (c23800.m52434(abstractC16579) && !c23800.m52434(c23800.m52416(abstractC16579))) {
                m47329(interfaceC12260, c23800.m52416(abstractC16579));
            } else {
                this.f68429.m48199(interfaceC12260, C23879.f77237);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47314(C23195 c23195, C18258 c18258) {
        C23800 c23800;
        AbstractC16579 abstractC16579M52432 = this.f68430.f14266;
        while (abstractC16579M52432.m39001(EnumC6617.CLASS)) {
            Iterator it = abstractC16579M52432.f53222.mo20272().m9327(c18258.f77453).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c23800 = this.f68417;
                if (zHasNext) {
                    AbstractC23903 abstractC23903 = (AbstractC23903) it.next();
                    if (abstractC23903.f77452 == EnumC10477.f35879 && (abstractC23903.mo20276() & 5) != 0 && c23800.m52417(c18258.f77449, abstractC23903.f77449)) {
                        C5909 c5909 = C23879.f77204;
                        this.f68429.m48199(c23195, new C5909("compiler", "intf.annotation.member.clash", abstractC23903, abstractC16579M52432));
                    }
                }
            }
            abstractC16579M52432 = c23800.m52432(abstractC16579M52432);
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0126  */
    /* JADX WARN: Code duplicated, block: B:75:0x012f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0131  */
    /* JADX WARN: Code duplicated, block: B:78:0x0137  */
    /* JADX WARN: Code duplicated, block: B:83:0x014e  */
    /* JADX WARN: Code duplicated, block: B:88:0x016a  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47317(AbstractC23903 abstractC23903, AbstractC8774 abstractC8774, C21825 c21825) {
        Set set;
        boolean z;
        boolean z2;
        C21783 c21783M9433;
        C19003 c19003;
        Iterator it = c21825.iterator();
        while (it.hasNext()) {
            C5224 c5224 = (C5224) it.next();
            c5224.mo1802(new C13257(this));
            boolean z3 = (abstractC23903.f77447 & 2305843009213693952L) != 0 || (abstractC23903.m52720() != null && abstractC23903.m52720().m50010());
            boolean z4 = (2305843009213693952L & abstractC23903.f77447) != 0 && abstractC8774.m22847(EnumC18651.f60554) && abstractC23903.f77448.f77452 == EnumC10477.f35865;
            int i = 2;
            C23942 c23942 = this.f68444;
            C20414 c20414 = this.f68429;
            if (z4) {
                AbstractC11242[] abstractC11242ArrM47352 = m47352(c5224.f18121.f30190.f53222);
                int length = abstractC11242ArrM47352.length;
                boolean z5 = false;
                for (int i2 = 0; i2 < length; i2++) {
                    AbstractC11242 abstractC11242 = abstractC11242ArrM47352[i2];
                    z5 = abstractC11242 == c23942.f77577 || abstractC11242 == c23942.f77581 || abstractC11242 == c23942.f77532 || abstractC11242 == c23942.f77585 || abstractC11242 == c23942.f77555;
                    if (z5) {
                        break;
                    }
                }
                if (!z5) {
                    c20414.m48199(c5224, C23879.f77187);
                } else {
                    C16142 c16142M49998 = ((C22492) abstractC23903.f77448).m49998((C6263) abstractC23903);
                    C14731 c14731M52709 = c16142M49998.m52709();
                    if (c14731M52709 == null || c14731M52709.m35284()) {
                        c16142M49998.m52703((C21825) C9030.stream(abstractC23903.mo20271()).filter(new C12197(i, this)).collect(C21825.m48587()));
                    }
                }
            }
            boolean zMo2877 = c5224.f30190.f53222.mo2877();
            C3836 c3836 = this.f68430;
            if (zMo2877) {
                C11521 c11521M47259 = m47259(c5224, abstractC23903);
                if (!c11521M47259.isEmpty()) {
                    Set set2 = (Set) c11521M47259.get();
                    boolean z6 = set2.isEmpty() || (set2.size() == 1 && set2.contains(c23942.f77585));
                    if (z3) {
                        set = set2;
                        z = (abstractC23903.f77447 & 16777216) != 0;
                        if (z || !z6) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (set.isEmpty() || z2) {
                            if (z2) {
                                c21783M9433 = C3128.m9433(abstractC8774);
                                if (c21783M9433 != null && set.isEmpty()) {
                                    c19003 = new C19003();
                                    for (C5224 c5225 : c21783M9433.f70566) {
                                        if (c5225 != c5224) {
                                            c19003.m43723(c5225);
                                        }
                                    }
                                    c21783M9433.f70566 = c19003.m43726();
                                }
                                abstractC23903.m52709().m35280(c5224.f18119);
                            } else {
                                c20414.m48199(c5224, C23879.f77187);
                            }
                        }
                        if (z && !z4 && c5224.f30190.f53222 == c3836.f14273.f53222 && abstractC8774.m22847(EnumC18651.f60478)) {
                            AbstractC0618 abstractC0618 = c3836.f14273.f53222;
                            C14377 c14377 = C14707.f48054;
                            C14377 c14378 = new C14377("compiler", "varargs.trustme.on.non.varargs.accessor", abstractC23903);
                            C5909 c5909 = C23879.f77204;
                            c20414.m48199(c5224, new C5909("compiler", "varargs.invalid.trustme.anno", abstractC0618, c14378));
                        }
                    } else {
                        set = set2;
                    }
                    if (z) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (set.isEmpty()) {
                        if (z2) {
                            c21783M9433 = C3128.m9433(abstractC8774);
                            if (c21783M9433 != null) {
                                c19003 = new C19003();
                                while (r10.hasNext()) {
                                    if (c5225 != c5224) {
                                        c19003.m43723(c5225);
                                    }
                                }
                                c21783M9433.f70566 = c19003.m43726();
                            }
                            abstractC23903.m52709().m35280(c5224.f18119);
                        } else {
                            c20414.m48199(c5224, C23879.f77187);
                        }
                    } else if (z2) {
                        c21783M9433 = C3128.m9433(abstractC8774);
                        if (c21783M9433 != null) {
                            c19003 = new C19003();
                            while (r10.hasNext()) {
                                if (c5225 != c5224) {
                                    c19003.m43723(c5225);
                                }
                            }
                            c21783M9433.f70566 = c19003.m43726();
                        }
                        abstractC23903.m52709().m35280(c5224.f18119);
                    } else {
                        c20414.m48199(c5224, C23879.f77187);
                    }
                    if (z) {
                        AbstractC0618 abstractC0619 = c3836.f14273.f53222;
                        C14377 c14379 = C14707.f48054;
                        C14377 c143710 = new C14377("compiler", "varargs.trustme.on.non.varargs.accessor", abstractC23903);
                        C5909 c59010 = C23879.f77204;
                        c20414.m48199(c5224, new C5909("compiler", "varargs.invalid.trustme.anno", abstractC0619, c143710));
                    }
                }
            }
            if (c5224.f18121.f30190.f53222 == c3836.f14303.f53222) {
                if (abstractC23903.f77452 != EnumC10477.f35865) {
                    c20414.m48199(c5224, C23879.f77232);
                } else if (!abstractC23903.m52721() || (abstractC23903.mo20276() & 8192) != 0) {
                    C14377 c143711 = C14707.f48054;
                    C14377 c143712 = new C14377("compiler", "not.a.functional.intf", abstractC23903);
                    C5909 c59011 = C23879.f77204;
                    c20414.m48199(c5224, new C5909("compiler", "bad.functional.intf.anno.1", c143712));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m47231(C21017 c21017, AbstractC11242 abstractC11242) {
        return abstractC11242 == c21017.f68444.f77555;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m47343(C5224 c5224, boolean z) {
        C6171.m17171(c5224.f30190);
        c5224.mo1802(new C13257(this));
        if (!c5224.m22847(EnumC18651.f60508) || c5224.f18121.f30190.mo1926() || m47319(c5224, z)) {
            return;
        }
        AbstractC16579 abstractC16579 = c5224.f30190;
        C5909 c5909 = C23879.f77204;
        this.f68429.m48199(c5224, new C5909("compiler", "annotation.type.not.applicable.to.type", abstractC16579));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47307(C22492 c22492, C11867 c11867, C5224 c5224) {
        AbstractC16579 abstractC16579;
        Set setM47202;
        Set setM47203;
        C23942 c23942;
        AbstractC16579 abstractC165710 = c11867.f75167;
        C3836 c3836 = this.f68430;
        AbstractC16579 abstractC165711 = c3836.f14222;
        AbstractC16579 abstractC165712 = c3836.f14251;
        AbstractC16579 abstractC165713 = c3836.f14242;
        C23800 c23800 = this.f68417;
        C6171.m17176(c23800.m52399(abstractC165710, abstractC165711));
        C21825 c21825 = c11867.f39809;
        boolean zIsEmpty = c21825.isEmpty();
        C23942 c23943 = this.f68444;
        if (zIsEmpty) {
            abstractC16579 = null;
        } else {
            C6171.m17176(((C18258) ((C2068) c21825.f70876).f7664).f77453 == c23943.f77643);
            abstractC16579 = ((C13984) ((C2068) c21825.f70876).f7665).f45980;
        }
        if (abstractC16579 == null) {
            return;
        }
        AbstractC0618 abstractC0618 = abstractC16579.f53222;
        AbstractC23903 abstractC23903Mo3804 = abstractC0618.mo20272().mo3804(c23943.f77643, (Predicate) null);
        C20414 c20414 = this.f68429;
        if (abstractC23903Mo3804 != null && abstractC23903Mo3804.f77452 == EnumC10477.f35879) {
            AbstractC16579 abstractC16579Mo16235 = ((C18258) abstractC23903Mo3804).f77449.mo16235();
            if (!abstractC16579Mo16235.m39001(EnumC6617.ARRAY) || !c23800.m52399(((C8777) abstractC16579Mo16235).f30194, c22492.f77449)) {
                C8777 c8777M52406 = c23800.m52406(c22492.f77449);
                C5909 c5909 = C23879.f77204;
                c20414.m48199(c5224, new C5909("compiler", "invalid.repeatable.annotation.value.return", abstractC0618, abstractC16579Mo16235, c8777M52406));
            }
        } else {
            C5909 c59010 = C23879.f77204;
            c20414.m48199(c5224, new C5909("compiler", "invalid.repeatable.annotation.no.value", abstractC0618));
        }
        AbstractC0618 abstractC0619 = abstractC16579.f53222;
        EnumC1282 enumC1282M52418 = c23800.m52418(abstractC0619);
        EnumC1282 enumC1282M52419 = c23800.m52418((AbstractC0618) c22492);
        int i = C21723.f70426[enumC1282M52419.ordinal()];
        if (i == 1 ? enumC1282M52418 != EnumC1282.RUNTIME : !(i != 2 || enumC1282M52418 != EnumC1282.SOURCE)) {
            String strName = enumC1282M52418.name();
            String strName2 = enumC1282M52419.name();
            C5909 c59011 = C23879.f77204;
            c20414.m48199(c5224, new C5909("compiler", "invalid.repeatable.annotation.retention", abstractC0619, strName, c22492, strName2));
        }
        AbstractC0618 abstractC06110 = abstractC16579.f53222;
        if (c22492.m52702(abstractC165713.f53222) != null && abstractC06110.m52702(abstractC165713.f53222) == null) {
            C5909 c59012 = C23879.f77204;
            c20414.m48199(c5224, new C5909("compiler", "invalid.repeatable.annotation.not.documented", abstractC06110, c22492));
        }
        AbstractC0618 abstractC06111 = abstractC16579.f53222;
        if (c22492.m52702(abstractC165712.f53222) != null && abstractC06111.m52702(abstractC165712.f53222) == null) {
            C5909 c59013 = C23879.f77204;
            c20414.m48199(c5224, new C5909("compiler", "invalid.repeatable.annotation.not.inherited", abstractC06111, c22492));
        }
        AbstractC0618 abstractC06112 = abstractC16579.f53222;
        C4810 c4810M47258 = m47258(abstractC06112);
        if (c4810M47258 == null) {
            setM47202 = m47202();
        } else {
            HashSet hashSet = new HashSet();
            for (AbstractC23156 abstractC23156 : c4810M47258.f16902) {
                if (abstractC23156 instanceof C5516) {
                    hashSet.add(((C5516) abstractC23156).f18928.f77453);
                }
            }
            setM47202 = hashSet;
        }
        C4810 c4810M47259 = m47258((AbstractC0618) c22492);
        if (c4810M47259 == null) {
            setM47203 = m47202();
        } else {
            HashSet hashSet2 = new HashSet();
            for (AbstractC23156 abstractC23157 : c4810M47259.f16902) {
                if (abstractC23157 instanceof C5516) {
                    hashSet2.add(((C5516) abstractC23157).f18928.f77453);
                }
            }
            setM47203 = hashSet2;
        }
        Iterator it = setM47202.iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                c23942 = c23943;
                break;
            }
            AbstractC11242 abstractC11242 = (AbstractC11242) it.next();
            Iterator it2 = setM47203.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    c23942 = c23943;
                    C5909 c59014 = C23879.f77204;
                    c20414.m48199(c5224, new C5909("compiler", "invalid.repeatable.annotation.incompatible.target", abstractC06112, c22492));
                    break loop0;
                }
                AbstractC11242 abstractC11243 = (AbstractC11242) it2.next();
                if (abstractC11243 == abstractC11242) {
                    break;
                }
                C23942 c23944 = c23943;
                AbstractC11242 abstractC11244 = c23944.f77634;
                AbstractC11242 abstractC11245 = c23944.f77554;
                if (abstractC11243 == abstractC11244 && abstractC11242 == abstractC11245) {
                    c23943 = c23944;
                    break;
                }
                if (abstractC11243 == c23944.f77585 && (abstractC11242 == abstractC11244 || abstractC11242 == abstractC11245 || abstractC11242 == c23944.f77578)) {
                    c23943 = c23944;
                    break;
                }
                c23943 = c23944;
            }
        }
        AbstractC0618 abstractC06113 = abstractC16579.f53222;
        AbstractC9462 abstractC9462Mo20272 = abstractC06113.mo20272();
        abstractC9462Mo20272.getClass();
        for (AbstractC23903 abstractC23903 : abstractC9462Mo20272.mo3802((Predicate) null, EnumC10167.RECURSIVE)) {
            if (abstractC23903.f77453 != c23942.f77643 && abstractC23903.f77452 == EnumC10477.f35879 && ((C18258) abstractC23903).f58258 == null) {
                C5909 c59015 = C23879.f77204;
                c20414.m48199(c5224, new C5909("compiler", "invalid.repeatable.annotation.elem.nondefault", abstractC06113, abstractC23903));
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private Set m47202() {
        if (this.f68446 == null) {
            AbstractC11242[] abstractC11242ArrM47243 = m47243();
            HashSet hashSet = new HashSet(abstractC11242ArrM47243.length);
            for (AbstractC11242 abstractC11242 : abstractC11242ArrM47243) {
                C13638.requireNonNull(abstractC11242);
                if (!hashSet.add(abstractC11242)) {
                    throw new IllegalArgumentException("duplicate element: " + ((Object) abstractC11242));
                }
            }
            this.f68446 = C0561.unmodifiableSet(hashSet);
        }
        return this.f68446;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m47319(C5224 c5224, final boolean z) {
        C21825 c21825M14388 = this.f68435.m14388(c5224.f18121.f30190.f53222);
        if (c21825M14388 == null) {
            return false;
        }
        return C9030.stream(c21825M14388).anyMatch(new Predicate() { // from class: l.ܺ۫ۤ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C8512.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo9645negate() {
                return C8512.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C8512.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C21017.m47235(this.f51623, z, (AbstractC23156) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m47235(C21017 c21017, boolean z, AbstractC23156 abstractC23156) {
        AbstractC11242 abstractC11242 = ((C5516) abstractC23156).f18928.f77453;
        C23942 c23942 = c21017.f68444;
        if (abstractC11242 != c23942.f77585) {
            return z && abstractC11242 == c23942.f77578;
        }
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC11242[] m47352(AbstractC0618 abstractC0618) {
        C4810 c4810M47258 = m47258(abstractC0618);
        if (c4810M47258 != null) {
            AbstractC23156[] abstractC23156Arr = c4810M47258.f16902;
            AbstractC11242[] abstractC11242Arr = new AbstractC11242[abstractC23156Arr.length];
            for (int i = 0; i < abstractC23156Arr.length; i++) {
                AbstractC23156 abstractC23156 = abstractC23156Arr[i];
                if (!(abstractC23156 instanceof C5516)) {
                    return new AbstractC11242[0];
                }
                abstractC11242Arr[i] = ((C5516) abstractC23156).f18928.f77453;
            }
            return abstractC11242Arr;
        }
        return m47243();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11521 m47259(C5224 c5224, AbstractC23903 abstractC23903) {
        AbstractC11242[] abstractC11242ArrM47243;
        EnumC10477 enumC10477;
        EnumC10477 enumC10478;
        C21017 c21017 = this;
        C4810 c4810M47258 = c21017.m47258(c5224.f18121.f30190.f53222);
        HashSet hashSet = new HashSet();
        int i = 0;
        if (c4810M47258 != null) {
            AbstractC23156[] abstractC23156Arr = c4810M47258.f16902;
            AbstractC11242[] abstractC11242Arr = new AbstractC11242[abstractC23156Arr.length];
            for (int i2 = 0; i2 < abstractC23156Arr.length; i2++) {
                AbstractC23156 abstractC23156 = abstractC23156Arr[i2];
                if (!(abstractC23156 instanceof C5516)) {
                    return C11521.empty();
                }
                abstractC11242Arr[i2] = ((C5516) abstractC23156).f18928.f77453;
            }
            abstractC11242ArrM47243 = abstractC11242Arr;
        } else {
            abstractC11242ArrM47243 = m47243();
        }
        int length = abstractC11242ArrM47243.length;
        while (i < length) {
            AbstractC11242 abstractC11242 = abstractC11242ArrM47243[i];
            C23942 c23942 = c21017.f68444;
            AbstractC11242 abstractC11243 = c23942.f77634;
            AbstractC11242 abstractC11244 = c23942.f77578;
            AbstractC11242 abstractC11245 = c23942.f77585;
            AbstractC11242 abstractC11246 = c23942.f77554;
            AbstractC11242 abstractC11247 = c23942.f77569;
            AbstractC11242 abstractC11248 = c23942.f77550;
            AbstractC11242 abstractC11249 = c23942.f77581;
            AbstractC11242 abstractC112410 = c23942.f77532;
            AbstractC11242 abstractC112411 = c23942.f77555;
            if (abstractC11242 == abstractC11243) {
                if (abstractC23903.f77452 == EnumC10477.f35865) {
                    hashSet.add(abstractC11243);
                }
            } else {
                AbstractC11242 abstractC112412 = c23942.f77577;
                if (abstractC11242 == abstractC112412) {
                    if (abstractC23903.f77452 == EnumC10477.f35878 && abstractC23903.f77448.f77452 != EnumC10477.f35879) {
                        hashSet.add(abstractC112412);
                    }
                } else if (abstractC11242 == abstractC112411) {
                    if (abstractC23903.mo17325() == EnumC1923.RECORD_COMPONENT) {
                        hashSet.add(abstractC112411);
                    }
                } else if (abstractC11242 == abstractC112410) {
                    if (abstractC23903.f77452 == EnumC10477.f35879 && !abstractC23903.m52713()) {
                        hashSet.add(abstractC112410);
                    }
                } else if (abstractC11242 == abstractC11249) {
                    if (abstractC23903.f77452 == EnumC10477.f35878 && abstractC23903.f77448.f77452 == EnumC10477.f35879 && (abstractC23903.mo20276() & 8589934592L) != 0) {
                        hashSet.add(abstractC11249);
                    }
                } else if (abstractC11242 == abstractC11248) {
                    if (abstractC23903.f77452 == EnumC10477.f35879 && abstractC23903.m52713()) {
                        hashSet.add(abstractC11248);
                    }
                } else if (abstractC11242 == abstractC11247) {
                    if (abstractC23903.f77452 == EnumC10477.f35878 && abstractC23903.f77448.f77452 == EnumC10477.f35879 && (abstractC23903.mo20276() & 8589934592L) == 0) {
                        hashSet.add(abstractC11247);
                    }
                } else if (abstractC11242 == abstractC11246) {
                    if (abstractC23903.f77452 == EnumC10477.f35865 && (abstractC23903.mo20276() & 8192) != 0) {
                        hashSet.add(abstractC11246);
                    }
                } else {
                    AbstractC11242 abstractC112413 = c23942.f77540;
                    if (abstractC11242 == abstractC112413) {
                        if (abstractC23903.f77452 == EnumC10477.f35867) {
                            hashSet.add(abstractC112413);
                        }
                    } else if (abstractC11242 == abstractC11245) {
                        EnumC10477 enumC10479 = abstractC23903.f77452;
                        EnumC10477 enumC104710 = EnumC10477.f35878;
                        if ((enumC10479 != enumC104710 || abstractC23903.f77448.f77452 != EnumC10477.f35879 || !abstractC23903.f77449.m39001(EnumC6617.NONE)) && ((enumC10477 = abstractC23903.f77452) == EnumC10477.f35865 || enumC10477 == enumC104710 || ((enumC10477 == (enumC10478 = EnumC10477.f35879) && !abstractC23903.m52713() && !abstractC23903.f77449.mo16235().m39001(EnumC6617.VOID)) || (abstractC23903.f77452 == enumC10478 && abstractC23903.m52713())))) {
                            hashSet.add(abstractC11245);
                        }
                    } else if (abstractC11242 == abstractC11244) {
                        if (abstractC23903.f77452 == EnumC10477.f35865 && abstractC23903.f77449.m39001(EnumC6617.TYPEVAR)) {
                            hashSet.add(abstractC11244);
                        }
                    } else {
                        AbstractC11242 abstractC112414 = c23942.f77618;
                        if (abstractC11242 == abstractC112414) {
                            if (abstractC23903.f77452 == EnumC10477.f35868) {
                                hashSet.add(abstractC112414);
                            }
                        } else {
                            return C11521.empty();
                        }
                    }
                }
            }
            i++;
            c21017 = this;
        }
        return C11521.of(hashSet);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4810 m47258(AbstractC0618 abstractC0618) {
        C11867 c11867Mo38252 = abstractC0618.mo2884().mo38252();
        if (c11867Mo38252 == null) {
            return null;
        }
        AbstractC23156 abstractC23156M29574 = c11867Mo38252.m29574(this.f68444.f77643);
        if (abstractC23156M29574 instanceof C4810) {
            return (C4810) abstractC23156M29574;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private AbstractC11242[] m47243() {
        if (this.f68424 == null) {
            ArrayList arrayList = new ArrayList();
            C23942 c23942 = this.f68444;
            arrayList.add(c23942.f77540);
            arrayList.add(c23942.f77634);
            arrayList.add(c23942.f77577);
            arrayList.add(c23942.f77532);
            arrayList.add(c23942.f77550);
            arrayList.add(c23942.f77554);
            arrayList.add(c23942.f77569);
            arrayList.add(c23942.f77581);
            if (this.f68434) {
                arrayList.add(c23942.f77555);
            }
            if (this.f68421) {
                arrayList.add(c23942.f77618);
            }
            this.f68424 = (AbstractC11242[]) arrayList.toArray(new AbstractC11242[0]);
        }
        return this.f68424;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m47318(C5224 c5224) {
        C20414 c20414 = this.f68429;
        C7714 c7714 = new C7714(c20414);
        try {
            return m47247(c5224);
        } finally {
            c20414.m46175(c7714);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:46:0x010f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0141  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean m47247(C5224 c5224) {
        C20414 c20414;
        boolean z;
        C5909 c5909;
        C16163 c16163Mo2884 = c5224.f18121.f30190.f53222.mo2884();
        LinkedHashSet<C18258> linkedHashSetMo38253 = c16163Mo2884.mo38253();
        Iterator it = c5224.f18122.iterator();
        boolean z2 = true;
        while (true) {
            boolean zHasNext = it.hasNext();
            c20414 = this.f68429;
            if (!zHasNext) {
                break;
            }
            AbstractC8774 abstractC8774 = (AbstractC8774) it.next();
            if (abstractC8774.m22847(EnumC18651.f60510)) {
                C3812 c3812 = (C3812) abstractC8774;
                AbstractC23903 abstractC23903M9471 = C3128.m9471(c3812.f14145);
                if (abstractC23903M9471 != null && !abstractC23903M9471.f77449.mo1926() && !linkedHashSetMo38253.remove(abstractC23903M9471)) {
                    AbstractC5930 abstractC5930 = c3812.f14145;
                    abstractC5930.getClass();
                    AbstractC11242 abstractC11242 = abstractC23903M9471.f77453;
                    AbstractC16579 abstractC16579 = c5224.f30190;
                    C5909 c59010 = C23879.f77204;
                    c20414.m48199(abstractC5930, new C5909("compiler", "duplicate.annotation.member.value", abstractC11242, abstractC16579));
                    z2 = false;
                }
            }
        }
        C21825 c21825M48588 = C21825.m48588();
        LinkedHashSet linkedHashSetMo38257 = c16163Mo2884.mo38257();
        for (C18258 c18258 : linkedHashSetMo38253) {
            if (!c18258.f77449.mo1926() && !linkedHashSetMo38257.contains(c18258)) {
                c21825M48588 = c21825M48588.m48591(c18258.f77453);
            }
        }
        C21825 c21825M48589 = c21825M48588.m48589();
        if (c21825M48589.m48595()) {
            if (c21825M48589.m48596() > 1) {
                AbstractC16579 abstractC165710 = c5224.f30190;
                C5909 c59011 = C23879.f77204;
                c5909 = new C5909("compiler", "annotation.missing.default.value.1", abstractC165710, c21825M48589);
            } else {
                AbstractC16579 abstractC165711 = c5224.f30190;
                C5909 c59012 = C23879.f77204;
                c5909 = new C5909("compiler", "annotation.missing.default.value", abstractC165711, c21825M48589);
            }
            c20414.m48199(c5224, c5909);
            z2 = false;
        }
        if (z2) {
            if (c5224.f18121.f30190.f53222 == this.f68430.f14231.f53222) {
                C21825 c21825 = c5224.f18122;
                if (c21825.f70877 == null) {
                    z = true;
                } else if (((AbstractC5930) c21825.f70876).m22847(EnumC18651.f60510)) {
                    C3812 c3813 = (C3812) c5224.f18122.f70876;
                    if (C3128.m9471(c3813.f14145).f77453 != this.f68444.f77643) {
                        z = false;
                    } else {
                        AbstractC5930 abstractC5931 = c3813.f14146;
                        if (abstractC5931.m22847(EnumC18651.f60567)) {
                            HashSet hashSet = new HashSet();
                            boolean z3 = true;
                            for (AbstractC8774 abstractC8775 : ((C18961) abstractC5931).f61399) {
                                if (!hashSet.add(C3128.m9471(abstractC8775))) {
                                    abstractC8775.getClass();
                                    c20414.m48199(abstractC8775, C23879.f77211);
                                    z3 = false;
                                }
                            }
                            z = z3;
                        } else {
                            z = false;
                        }
                    }
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47316(AbstractC23903 abstractC23903, AbstractC8774 abstractC8774) {
        C16826 c16826 = this.f68442;
        EnumC0597 enumC0597 = EnumC0597.DEP_ANN;
        boolean zM39467 = c16826.m39467(enumC0597);
        C20414 c20414 = this.f68429;
        C3836 c3836 = this.f68430;
        if (zM39467 && abstractC23903.m52701() && (abstractC23903.mo20276() & 131072) != 0 && !c3836.f14253.mo1926() && abstractC23903.m52702(c3836.f14253.f53222) == null) {
            c20414.m48203(enumC0597, abstractC8774, C9768.f32846);
        }
        C16826 c16827 = this.f68442;
        EnumC0597 enumC0598 = EnumC0597.DEPRECATION;
        if (!c16827.m39467(enumC0598) || abstractC23903.m52701() || c3836.f14253.mo1926() || abstractC23903.m52702(c3836.f14253.f53222) == null) {
            return;
        }
        EnumC7654 enumC7654M38160 = C16121.m38160(abstractC23903);
        C14065 c14065 = C9768.f32836;
        c20414.m48203(enumC0598, abstractC8774, new C14065("compiler", "deprecated.annotation.has.no.effect", enumC7654M38160));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47217(C21017 c21017, Supplier supplier, AbstractC23903 abstractC23903) {
        InterfaceC12260 interfaceC12260 = (InterfaceC12260) supplier.get();
        C16886 c16886 = c21017.f68420;
        C16886 c16887 = c21017.f68438;
        if ((abstractC23903.f77447 & 36028797018963968L) != 0) {
            if (c21017.f68442.m39468(EnumC0597.REMOVAL)) {
                return;
            }
            if (abstractC23903.f77452 == EnumC10477.f35868) {
                C14065 c14065 = C9768.f32836;
                c16887.m39552(interfaceC12260, new C14065("compiler", "has.been.deprecated.for.removal.module", abstractC23903));
                return;
            } else {
                AbstractC23903 abstractC23903M52708 = abstractC23903.m52708();
                C14065 c14066 = C9768.f32836;
                c16887.m39552(interfaceC12260, new C14065("compiler", "has.been.deprecated.for.removal", abstractC23903, abstractC23903M52708));
                return;
            }
        }
        if (c21017.f68442.m39468(EnumC0597.DEPRECATION)) {
            return;
        }
        if (abstractC23903.f77452 == EnumC10477.f35868) {
            C14065 c14067 = C9768.f32836;
            c16886.m39552(interfaceC12260, new C14065("compiler", "has.been.deprecated.module", abstractC23903));
        } else {
            AbstractC23903 abstractC23903M52709 = abstractC23903.m52708();
            C14065 c14068 = C9768.f32836;
            c16886.m39552(interfaceC12260, new C14065("compiler", "has.been.deprecated", abstractC23903, abstractC23903M52709));
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m47335(final AbstractC23903 abstractC23903, final AbstractC8774 abstractC8774) {
        if ((abstractC23903.mo20276() & 274877906944L) != 0) {
            this.f68433.m8272(new InterfaceC11888() { // from class: l.ۚܿۤ
                @Override // l.InterfaceC11888
                /* JADX INFO: renamed from: ۙ */
                public final void mo5925() {
                    C21017.m47228(this.f18890, abstractC8774, abstractC23903);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47228(C21017 c21017, InterfaceC12260 interfaceC12260, AbstractC23903 abstractC23903) {
        C20414 c20414 = c21017.f68429;
        C14065 c14065 = C9768.f32836;
        c20414.m48200(interfaceC12260, new C14065("compiler", "sun.proprietary", abstractC23903));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m47350(AbstractC23903 abstractC23903, AbstractC8774 abstractC8774) {
        EnumC23528 enumC23528 = EnumC23528.f76172;
        EnumC23528 enumC23529 = this.f68415;
        if (enumC23529 == enumC23528 || (abstractC23903.mo20276() & 35184372088832L) == 0) {
            return;
        }
        C5909 c5909 = C23879.f77204;
        this.f68429.m48199(abstractC8774, new C5909("compiler", "not.in.profile", abstractC23903, enumC23529));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47299(final InterfaceC12260 interfaceC12260, AbstractC23903 abstractC23903, final AbstractC23903 abstractC23904) {
        long jMo20276 = abstractC23904.mo20276() & 72057594037927936L;
        C2008 c2008 = this.f68443;
        if (jMo20276 != 0 && abstractC23904.m52724().f25392 != abstractC23903.m52724().f25392) {
            long jMo20277 = abstractC23904.mo20276() & 288230376151711744L;
            C2714 c2714 = this.f68433;
            if (jMo20277 == 0) {
                if (!c2008.m6473()) {
                    C5909 c5909 = C23879.f77204;
                    this.f68429.m48199(interfaceC12260, new C5909("compiler", "is.preview", abstractC23904));
                } else {
                    c2008.m6476();
                    c2714.m8272(new InterfaceC11888() { // from class: l.ۙܿۤ
                        @Override // l.InterfaceC11888
                        /* JADX INFO: renamed from: ۙ */
                        public final void mo5925() {
                            C14065 c14065 = C9768.f32836;
                            this.f16842.m47297(interfaceC12260, new C14065("compiler", "is.preview", abstractC23904));
                        }
                    });
                }
            } else {
                c2714.m8272(new InterfaceC11888() { // from class: l.ܰܿۤ
                    @Override // l.InterfaceC11888
                    /* JADX INFO: renamed from: ۙ */
                    public final void mo5925() {
                        C14065 c14065 = C9768.f32836;
                        this.f45931.m47297(interfaceC12260, new C14065("compiler", "is.preview.reflective", abstractC23904));
                    }
                });
            }
        }
        c2008.getClass();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47310(C23195 c23195, AbstractC16579 abstractC16579) {
        int i = C21723.f70425[abstractC16579.mo1933().ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            m47310(c23195, this.f68417.m52416(abstractC16579));
            return;
        }
        if ((abstractC16579.f53222.mo20276() & 8192) != 0) {
            AbstractC0618 abstractC0618 = abstractC16579.f53222;
            long j = abstractC0618.f77447;
            if ((j & 34359738368L) != 0) {
                return;
            }
            if ((j & 134217728) != 0) {
                C5909 c5909 = C23879.f77204;
                this.f68429.m48199(c23195, new C5909("compiler", "cyclic.annotation.element", abstractC0618));
                return;
            }
            try {
                abstractC0618.f77447 = j | 134217728;
                for (AbstractC23903 abstractC23903 : abstractC0618.mo20272().mo3802((Predicate) null, EnumC10167.NON_RECURSIVE)) {
                    if (abstractC23903.f77452 == EnumC10477.f35879) {
                        m47310(c23195, ((C18258) abstractC23903).f77449.mo16235());
                    }
                }
                abstractC0618.f77447 = (abstractC0618.f77447 & (-134217729)) | 34359738368L;
            } catch (Throwable th) {
                abstractC0618.f77447 = (abstractC0618.f77447 & (-134217729)) | 34359738368L;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47281(C8753 c8753) {
        HashMap map = new HashMap();
        for (C21825 c21825 = c8753.f30090; c21825.m48595(); c21825 = c21825.f70877) {
            C15434 c15434M9452 = C3128.m9452((AbstractC8774) c21825.f70876);
            if (c15434M9452 != null) {
                C23195 c23195 = (C23195) c21825.f70876;
                if (C3128.m9472(c15434M9452.f50296) == this.f68444.f77533) {
                    map.put(c23195.f75263, C3128.m9471(c15434M9452.f50296));
                } else {
                    c23195.f75263.f77447 |= 1073741824;
                }
            }
        }
        for (AbstractC23903 abstractC23903 : (AbstractC23903[]) map.keySet().toArray(new AbstractC23903[0])) {
            m47212(c8753, abstractC23903, map);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47212(C8753 c8753, AbstractC23903 abstractC23903, HashMap map) {
        if (abstractC23903 != null) {
            long j = abstractC23903.f77447;
            if ((j & 1073741824) == 0) {
                if ((j & 134217728) != 0) {
                    this.f68429.m48199(C3128.m9440(abstractC23903, c8753, false), C23879.f77188);
                } else {
                    abstractC23903.f77447 = j | 134217728;
                    m47212(c8753, (AbstractC23903) map.remove(abstractC23903), map);
                    abstractC23903.f77447 &= -134217729;
                }
                abstractC23903.f77447 |= 1073741824;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47296(final InterfaceC12260 interfaceC12260, C10498 c10498, AbstractC16579 abstractC16579) {
        if (abstractC16579.mo24292() != null && abstractC16579.mo1933().m17953(EnumC6617.LONG) && ((Number) abstractC16579.mo24292()).longValue() == 0) {
            int i = c10498.f35962;
            if (i == 108 || i == 112 || i == 109 || i == 113) {
                this.f68433.m8272(new InterfaceC11888() { // from class: l.ۗ۫ۤ
                    @Override // l.InterfaceC11888
                    /* JADX INFO: renamed from: ۙ */
                    public final void mo5925() {
                        C21017.m47225(this.f12039, interfaceC12260);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47277(C4849 c4849) {
        if (c4849.f17075.m22847(EnumC18651.f60506) && c4849.f17077 == null) {
            C16826 c16826 = this.f68442;
            EnumC0597 enumC0597 = EnumC0597.EMPTY;
            if (c16826.m39467(enumC0597)) {
                AbstractC14728 abstractC14728 = c4849.f17075;
                abstractC14728.getClass();
                this.f68429.m48203(enumC0597, abstractC14728, C9768.f32854);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m47323(InterfaceC12260 interfaceC12260, AbstractC23903 abstractC23903, AbstractC9462 abstractC9462) {
        EnumC10477 enumC10477;
        if (!abstractC23903.f77449.mo1926()) {
            AbstractC11242 abstractC11242 = abstractC23903.f77448.f77453;
            C23942 c23942 = this.f68444;
            if (abstractC11242 != c23942.f77623) {
                for (AbstractC23903 abstractC23904 : abstractC9462.mo3803(abstractC23903.f77453, null, EnumC10167.NON_RECURSIVE)) {
                    if (abstractC23903 != abstractC23904 && (abstractC23904.mo20276() & 4398046511104L) == 0 && (enumC10477 = abstractC23903.f77452) == abstractC23904.f77452 && abstractC23903.f77453 != c23942.f77652) {
                        EnumC10477 enumC10478 = EnumC10477.f35879;
                        C23800 c23800 = this.f68417;
                        if (enumC10477 != enumC10478 || c23800.m52394(abstractC23903.f77449, abstractC23904.f77449, true) || c23800.m52394(c23800.m52402(abstractC23903.f77449), c23800.m52402(abstractC23904.f77449), true)) {
                            long jMo20276 = abstractC23903.mo20276() & 17179869184L;
                            long jMo20277 = abstractC23904.mo20276() & 17179869184L;
                            C20414 c20414 = this.f68429;
                            if (jMo20276 != jMo20277) {
                                abstractC23903.f77447 = 4398046511104L | abstractC23903.f77447;
                                if (abstractC23903.f77449.mo1926() || abstractC23904.f77449.mo1926()) {
                                    break;
                                    break;
                                }
                                AbstractC23903 abstractC23903M52708 = abstractC23904.m52708();
                                C5909 c5909 = C23879.f77204;
                                c20414.m48199(interfaceC12260, new C5909("compiler", "array.and.varargs", abstractC23903, abstractC23904, abstractC23903M52708));
                                return true;
                            }
                            if (abstractC23903.f77452 == enumC10478 && !c23800.m52394(abstractC23903.f77449, abstractC23904.f77449, false)) {
                                if (!abstractC23903.f77449.mo1926() && !abstractC23904.f77449.mo1926()) {
                                    C5909 c59010 = C23879.f77204;
                                    c20414.m48199(interfaceC12260, new C5909("compiler", "name.clash.same.erasure", abstractC23903, abstractC23904));
                                }
                                abstractC23903.f77447 |= 4398046511104L;
                                return true;
                            }
                            if ((abstractC23903.mo20276() & 576460752303423488L) != 0 && (abstractC23904.mo20276() & 576460752303423488L) != 0 && (abstractC23904.mo20276() & 1152921504606846976L) == 0) {
                                if (!abstractC23903.f77449.mo1926()) {
                                    c20414.m48199(interfaceC12260, C23879.f77247);
                                    abstractC23903.f77447 |= 4398046511104L;
                                }
                            } else {
                                m47298(interfaceC12260, abstractC23904);
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m47332(C10164 c10164) {
        C14023 c14023;
        AbstractC3110 abstractC3110;
        AbstractC9462 abstractC9462M24222 = AbstractC9462.m24222(c10164.f34721);
        AbstractC9462 abstractC9462M24223 = AbstractC9462.m24222(c10164.f34721);
        AbstractC3110 abstractC3111 = c10164.f34723;
        for (AbstractC8774 abstractC8774 : c10164.f34727) {
            if (abstractC8774.m22847(EnumC18651.f60517) && (abstractC3110 = (c14023 = (C14023) abstractC8774).f46088) != null) {
                for (AbstractC23903 abstractC23903 : abstractC3110.mo3802(new C20168(), EnumC10167.RECURSIVE)) {
                    if (c14023.f46087) {
                        m47213(c14023, abstractC9462M24222, abstractC9462M24223, abstractC3111, abstractC23903, true);
                        abstractC9462M24223.mo24224(abstractC23903);
                    } else {
                        m47213(c14023, abstractC9462M24222, abstractC9462M24223, abstractC3111, abstractC23903, false);
                        abstractC9462M24222.mo24224(abstractC23903);
                    }
                }
                c14023.f46088 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47213(C14023 c14023, AbstractC3110 abstractC3110, AbstractC3110 abstractC3111, AbstractC3110 abstractC3112, AbstractC23903 abstractC23903, boolean z) {
        C9375 c9375 = new C9375(1, abstractC23903);
        AbstractC23903 abstractC23903Mo3804 = abstractC3110.mo3804(abstractC23903.f77453, c9375);
        AbstractC23903 abstractC23903Mo3805 = (abstractC23903Mo3804 != null || z) ? null : abstractC3111.mo3804(abstractC23903.f77453, c9375);
        C20414 c20414 = this.f68429;
        if (abstractC23903Mo3804 == null && abstractC23903Mo3805 == null) {
            AbstractC23903 abstractC23903Mo3806 = abstractC3112.mo3804(abstractC23903.f77453, c9375);
            if (abstractC23903Mo3806 != null) {
                C5909 c5909 = C23879.f77204;
                c20414.m48199(c14023, new C5909("compiler", "already.defined.this.unit", abstractC23903Mo3806));
                return;
            }
            return;
        }
        if (abstractC23903Mo3804 != null) {
            C5909 c59010 = C23879.f77204;
            c20414.m48199(c14023, new C5909("compiler", "already.defined.single.import", abstractC23903Mo3804));
        } else {
            C5909 c59011 = C23879.f77204;
            c20414.m48199(c14023, new C5909("compiler", "already.defined.static.single.import", abstractC23903Mo3805));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47284(AbstractC8774 abstractC8774) {
        AbstractC8774 abstractC8775 = abstractC8774;
        while (abstractC8775.m22847(EnumC18651.f60473)) {
            C23570 c23570 = (C23570) abstractC8775;
            if (c23570.f76355.f77448.mo20270() != C3128.m9471(c23570.f76357).mo20270()) {
                abstractC8774.getClass();
                AbstractC23903 abstractC23903M9471 = C3128.m9471(abstractC8774);
                C5909 c5909 = C23879.f77204;
                this.f68429.m48199(abstractC8774, new C5909("compiler", "import.requires.canonical", abstractC23903M9471));
                return;
            }
            abstractC8775 = c23570.f76357;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47286(AbstractC8774 abstractC8774, C4603 c4603, C22492 c22492) {
        if (this.f68442.m39467(EnumC0597.AUXILIARYCLASS)) {
            c22492.mo49994();
            if ((c22492.f77447 & 17592186044416L) == 0 || !this.f68432.m45551(c4603, (AbstractC0618) c22492, false) || this.f68440.mo22150(c22492.f73415, c4603.f16295.f34725)) {
                return;
            }
            InterfaceC2173 interfaceC2173 = c22492.f73415;
            C14065 c14065 = C9768.f32836;
            this.f68429.m48204(abstractC8774, new C14065("compiler", "auxiliary.class.accessed.from.outside.of.its.source.file", c22492, interfaceC2173));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m47348(final C22492 c22492, final InterfaceC12260 interfaceC12260) {
        if (this.f68442.m39467(EnumC0597.MISSING_EXPLICIT_CTOR)) {
            c22492.mo49994();
            if ((c22492.f77447 & 2305843009213710336L) != 0 || c22492.f77453.isEmpty()) {
                return;
            }
            c22492.mo49994();
            if ((c22492.f77447 & 5) == 0 || !EnumC14026.f46096.m33945(this.f68439)) {
                return;
            }
            int i = C21723.f70430[c22492.m50012().ordinal()];
            if (i == 1 || i == 2) {
                return;
            }
            if (i == 4) {
                for (AbstractC23903 abstractC23903 = c22492.f77448; abstractC23903 != null && abstractC23903.f77452 == EnumC10477.f35865; abstractC23903 = abstractC23903.f77448) {
                    if ((abstractC23903.mo20276() & 5) == 0) {
                        return;
                    }
                }
            }
            final C7675 c7675M52724 = c22492.m52724();
            if (c7675M52724.m20275()) {
                return;
            }
            final C19670 c19670 = c7675M52724.f25392;
            for (C5537 c5537 : c19670.f63142) {
                if (c5537.f18986.equals(c7675M52724)) {
                    C21825 c21825 = c5537.f18987;
                    if (c21825 != null && !c21825.isEmpty()) {
                        return;
                    }
                    this.f68433.m8272(new InterfaceC11888() { // from class: l.ۢ۫ۤ
                        @Override // l.InterfaceC11888
                        /* JADX INFO: renamed from: ۙ */
                        public final void mo5925() {
                            C21017.m47227(this.f32307, interfaceC12260, c22492, c7675M52724, c19670);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47227(C21017 c21017, InterfaceC12260 interfaceC12260, C22492 c22492, C7675 c7675, C19670 c19670) {
        C16826 c16826 = c21017.f68442;
        EnumC0597 enumC0597 = EnumC0597.MISSING_EXPLICIT_CTOR;
        if (c16826.m39467(enumC0597)) {
            C20414 c20414 = c21017.f68429;
            C14065 c14065 = C9768.f32836;
            c20414.m48203(enumC0597, interfaceC12260, new C14065("compiler", "missing-explicit-ctor", c22492, c7675, c19670));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m47265(InterfaceC12260 interfaceC12260, AbstractC16579 abstractC16579, AbstractC16579 abstractC165710) {
        C8318 c8318 = new C8318(this, interfaceC12260, "unchecked.cast.to.type", abstractC16579, abstractC165710);
        C23800 c23800 = this.f68417;
        if (c23800.m52412(abstractC16579, abstractC165710, c8318)) {
            return abstractC165710;
        }
        ((C1261) this.f68418).mo2545(interfaceC12260, this.f68447.m51910(C14707.m35237(abstractC16579, abstractC165710)));
        return c23800.m52440(abstractC16579);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, l.ۡ۠۟] */
    /* JADX WARN: Type inference failed for: r6v1, types: [l.۫۟۟] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r7v4, types: [l.᩶᩷۟, l.᩸ۤ۟] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47282(C8753 c8753, C22492 c22492) {
        C3836 c3836 = this.f68430;
        if (c22492.m52702(c3836.f14303.f53222) != null) {
            try {
                this.f68417.m52385((AbstractC0618) c22492);
            } catch (C23945 e) {
                c8753.getClass();
                for (C5224 c5224 : c8753.f30089.f70566) {
                    if (c5224.f18121.f30190.f53222 == c3836.f14303.f53222) {
                        c8753 = c5224;
                        break;
                    }
                }
                C11948 c11948M52780 = e.m52780();
                C5909 c5909 = C23879.f77204;
                this.f68429.m48199(c8753, new C5909("compiler", "bad.functional.intf.anno.1", c11948M52780));
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m47345(C10164 c10164) {
        AbstractC23903 abstractC23903M9471;
        for (C14023 c14023 : c10164.m25896()) {
            if (c14023.f46087 && c14023.f46089.m22847(EnumC18651.f60473)) {
                C23570 c23570 = (C23570) c14023.f46089;
                if (c23570.f76356 != this.f68444.f77589 && (abstractC23903M9471 = C3128.m9471(c23570.f76357)) != null && abstractC23903M9471.f77452 == EnumC10477.f35865) {
                    AbstractC0618 abstractC0618 = (AbstractC0618) C3128.m9471(c23570.f76357);
                    if (!m47230(abstractC0618, abstractC0618, c10164.f34721, c23570.f76356, new HashSet())) {
                        AbstractC11242 abstractC11242 = c23570.f76356;
                        EnumC7654 enumC7654M38160 = C16121.m38160(abstractC0618);
                        C14377 c14377 = C14707.f48054;
                        C14377 c14378 = new C14377("compiler", "location", enumC7654M38160, abstractC0618, null);
                        C5909 c5909 = C23879.f77204;
                        this.f68429.m48199(c14023, new C5909("compiler", "cant.resolve.location", EnumC7654.STATIC, abstractC11242, null, null, c14378));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47291(C10164 c10164) {
        for (C14023 c14023 : c10164.m25896()) {
            if (!c14023.f46087 && C3128.m9472(c14023.f46089) == this.f68444.f77589) {
                AbstractC0618 abstractC0618 = ((C23570) c14023.f46089).f76357.f30190.f53222;
                if (abstractC0618.f77452 == EnumC10477.f35867 && abstractC0618.mo20272().m9329() && (!EnumC14026.f46109.m33945(this.f68439) || !abstractC0618.mo20273())) {
                    EnumC0264 enumC0264 = EnumC0264.RESOLVE_ERROR;
                    int i = c14023.f30189;
                    C5909 c5909 = C23879.f77204;
                    this.f68429.m48192(enumC0264, i, new C5909("compiler", "doesnt.exist", abstractC0618));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m47230(AbstractC0618 abstractC0618, AbstractC0618 abstractC0619, C7675 c7675, AbstractC11242 abstractC11242, HashSet hashSet) {
        if (abstractC0618 == null || !hashSet.add(abstractC0618)) {
            return false;
        }
        AbstractC16579 abstractC16579 = abstractC0618.f77449;
        C23800 c23800 = this.f68417;
        if (m47230(c23800.m52432(abstractC16579).f53222, abstractC0619, c7675, abstractC11242, hashSet)) {
            return true;
        }
        Iterator it = c23800.m52439(abstractC0618.f77449).iterator();
        while (it.hasNext()) {
            if (m47230(((AbstractC16579) it.next()).f53222, abstractC0619, c7675, abstractC11242, hashSet)) {
                return true;
            }
        }
        for (AbstractC23903 abstractC23903 : abstractC0618.mo20272().m9327(abstractC11242)) {
            if (abstractC23903.mo22992() && m47237(abstractC23903, c7675) && abstractC23903.m52704(abstractC0619, c23800)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m47237(AbstractC23903 abstractC23903, C7675 c7675) {
        try {
            int iMo20276 = (int) (abstractC23903.mo20276() & 7);
            if (iMo20276 != 0) {
                if (iMo20276 == 2) {
                    return false;
                }
                if (iMo20276 != 4) {
                    return true;
                }
            }
            return abstractC23903.m52724() == c7675;
        } catch (C16100 e) {
            throw e;
        } catch (C4146 unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47275(C4603 c4603, C8753 c8753) {
        C5537 c5537M47207;
        C10164 c10164 = c4603.f16295;
        C19670 c19670 = c10164.f34730;
        C3836 c3836 = this.f68430;
        if (c19670 == c3836.f14288 || c19670 == c3836.f14249) {
            return;
        }
        C22492 c22492 = c8753.f30086;
        c22492.mo49994();
        if ((c22492.f77447 & 16777216) == 0 && (c5537M47207 = m47207(c10164.f34721)) != null && c5537M47207.f18987 == null) {
            new C15374(this, c4603, c8753, c10164).mo1065(c8753);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5537 m47207(C7675 c7675) {
        for (C5537 c5537 : c7675.f25392.f63142) {
            if (c5537.f18986 == c7675) {
                return c5537;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m47236(AbstractC23903 abstractC23903) {
        while (abstractC23903.f77452 != EnumC10477.f35867) {
            if ((abstractC23903.mo20276() & 1) == 0 && (abstractC23903.mo20276() & 4) == 0) {
                return false;
            }
            abstractC23903 = abstractC23903.f77448;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47221(C21017 c21017, AbstractC5930 abstractC5930, AbstractC23903 abstractC23903, C7675 c7675, boolean z) {
        C21825 c21825;
        C20414 c20414 = c21017.f68429;
        if (!m47236(abstractC23903) && !z) {
            EnumC0597 enumC0597 = EnumC0597.EXPORTS;
            EnumC7654 enumC7654M38160 = C16121.m38160(abstractC23903);
            C19670 c19670 = abstractC23903.m52724().f25392;
            C14065 c14065 = C9768.f32836;
            c20414.m48203(enumC0597, abstractC5930, new C14065("compiler", "leaks.not.accessible", enumC7654M38160, abstractC23903, c19670));
            return;
        }
        C7675 c7675M52724 = abstractC23903.m52724();
        C5537 c5537M47207 = m47207(c7675M52724);
        C5537 c5537M47208 = m47207(c7675);
        if (c5537M47207 == null) {
            EnumC0597 enumC0598 = EnumC0597.EXPORTS;
            EnumC7654 enumC7654M38161 = C16121.m38160(abstractC23903);
            C19670 c19671 = abstractC23903.m52724().f25392;
            C14065 c14066 = C9768.f32836;
            c20414.m48203(enumC0598, abstractC5930, new C14065("compiler", "leaks.not.accessible.unexported", enumC7654M38161, abstractC23903, c19671));
            return;
        }
        C21825 c21826 = c5537M47207.f18987;
        if (c21826 != null && ((c21825 = c5537M47208.f18987) == null || !c21826.containsAll(c21825))) {
            EnumC0597 enumC0599 = EnumC0597.EXPORTS;
            EnumC7654 enumC7654M38162 = C16121.m38160(abstractC23903);
            C19670 c19672 = abstractC23903.m52724().f25392;
            C14065 c14067 = C9768.f32836;
            c20414.m48203(enumC0599, abstractC5930, new C14065("compiler", "leaks.not.accessible.unexported.qualified", enumC7654M38162, abstractC23903, c19672));
        }
        C19670 c19673 = c7675M52724.f25392;
        C19670 c19674 = c7675.f25392;
        if (c19673 == c19674 || c19673 == c21017.f68430.f14235) {
            return;
        }
        C21825 c21825Of = C21825.of((Object) c19674);
        while (c21825Of.m48595()) {
            C19670 c19675 = (C19670) c21825Of.f70876;
            c21825Of = c21825Of.f70877;
            if (c19675 == c7675M52724.f25392) {
                return;
            }
            if ((c19675.f77447 & 4503599627370496L) == 0) {
                for (C6948 c6948 : c19675.f63134) {
                    if (c6948.f23370.contains(EnumC23177.TRANSITIVE)) {
                        c21825Of = c21825Of.m48597(c6948.f23371);
                    }
                }
            }
        }
        EnumC0597 enumC05910 = EnumC0597.EXPORTS;
        EnumC7654 enumC7654M38163 = C16121.m38160(abstractC23903);
        C19670 c19676 = abstractC23903.m52724().f25392;
        C14065 c14068 = C9768.f32836;
        c20414.m48203(enumC05910, abstractC5930, new C14065("compiler", "leaks.not.accessible.not.required.transitive", enumC7654M38163, abstractC23903, c19676));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47279(final AbstractC5930 abstractC5930, final C19670 c19670) {
        if (c19670.f77452 != EnumC10477.f35868) {
            this.f68433.m8272(new InterfaceC11888() { // from class: l.ܳ۫ۤ
                @Override // l.InterfaceC11888
                /* JADX INFO: renamed from: ۙ */
                public final void mo5925() {
                    C21017.m47220(this.f47568, abstractC5930, c19670);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47220(C21017 c21017, AbstractC5930 abstractC5930, C19670 c19670) {
        C16826 c16826 = c21017.f68442;
        EnumC0597 enumC0597 = EnumC0597.MODULE;
        if (c16826.m39467(enumC0597)) {
            C20414 c20414 = c21017.f68429;
            C14065 c14065 = C9768.f32836;
            c20414.m48203(enumC0597, abstractC5930, new C14065("compiler", "module.not.found", c19670));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47226(C21017 c21017, InterfaceC12260 interfaceC12260, C7675 c7675) {
        if (c21017.f68442.m39467(EnumC0597.OPENS)) {
            C20414 c20414 = c21017.f68429;
            C14065 c14065 = C9768.f32836;
            c20414.m48204(interfaceC12260, new C14065("compiler", "package.empty.or.not.found", c7675));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47294(final InterfaceC12260 interfaceC12260, final C6948 c6948) {
        if ((c6948.f23371.f77447 & 4503599627370496L) != 0) {
            this.f68433.m8272(new InterfaceC11888() { // from class: l.ۧ۫ۤ
                @Override // l.InterfaceC11888
                /* JADX INFO: renamed from: ۙ */
                public final void mo5925() {
                    C21017.m47222(this.f37415, c6948, interfaceC12260);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47222(C21017 c21017, C6948 c6948, InterfaceC12260 interfaceC12260) {
        C20414 c20414 = c21017.f68429;
        if (c6948.f23370.contains(EnumC23177.TRANSITIVE) && c21017.f68442.m39467(EnumC0597.REQUIRES_TRANSITIVE_AUTOMATIC)) {
            c20414.m48204(interfaceC12260, C9768.f32839);
        } else if (c21017.f68442.m39467(EnumC0597.REQUIRES_AUTOMATIC)) {
            c20414.m48204(interfaceC12260, C9768.f32842);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47302(C21825 c21825) {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean zM22847 = false;
        boolean z5 = false;
        while (c21825.m48595()) {
            C18630 c18630 = (C18630) c21825.f70876;
            for (AbstractC8047 abstractC8047 : c18630.f60400) {
                boolean zMo16200 = abstractC8047.mo16200();
                C20414 c20414 = this.f68429;
                if (zMo16200) {
                    if (C3128.m9470((AbstractC5930) abstractC8047)) {
                        if (z4 && !zM22847 && !z5) {
                            c20414.m48199(abstractC8047, C23879.f77250);
                        }
                        z3 = true;
                    } else {
                        if (z4 && !z5) {
                            c20414.m48199(abstractC8047, C23879.f77250);
                        }
                        z = true;
                    }
                } else if (abstractC8047.m22847(EnumC18651.f60565)) {
                    if (z4 && !z5) {
                        c20414.m48199(abstractC8047, C23879.f77250);
                    }
                    z2 = true;
                } else {
                    zM22847 = abstractC8047.m22847(EnumC18651.f60568);
                    if (z4 || z || z2 || (z3 && (!zM22847 || z5))) {
                        c20414.m48199(abstractC8047, C23879.f77229);
                    }
                    z4 = true;
                }
            }
            boolean z6 = c18630.f60402 == EnumC13425.STATEMENT ? c18630.f60399 : false;
            if (c18630.f60403.m48595()) {
                z4 &= z6;
                zM22847 &= z6;
                z2 = false;
                z3 &= z6;
                z = false;
            }
            z5 = c18630.f60403.m48595() && z6;
            c21825 = c21825.f70877;
        }
    }
}
