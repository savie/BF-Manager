package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.bouncycastle.crypto.digests.SkeinEngine;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.᩷۬᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 542M */
/* JADX INFO: loaded from: classes.dex */
public final class C22092 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final C13477 f71190 = new C13477();

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC1100 f71191 = new C0267();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C4812 f71192;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C14764 f71193;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C4812 f71194;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C12221 f71195;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C15252 f71197;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f71198;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C6147 f71199;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C7312 f71200;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C4812 f71201;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C22010 f71202;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C24705 f71203;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public char f71204;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C4812 f71205;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f71206;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC19728[] f71207;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C12863 f71209;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f71210;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Set f71212;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16722 f71213;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C15846 f71214;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final EnumC5865 f71216;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final EnumC20820 f71217;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C15400 f71219;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C17638 f71220;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f71221;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C14528 f71223;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C10377 f71224;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C19991 f71225;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public HashMap f71218 = new HashMap();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public HashMap f71208 = new HashMap();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC1013 f71222 = new C14436(this);

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public AbstractC1584 f71196 = new C7725();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C1083 f71211 = new C1083();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C20404 f71215 = new C20404(0);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m49909(long j) {
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
    public static /* bridge */ /* synthetic */ boolean m49936(C22092 c22092, AbstractC11781 abstractC11781) {
        c22092.getClass();
        return m49933(abstractC11781);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m49938(C22092 c22092, C23892 c23892) {
        c22092.getClass();
        return C13847.stream(c22092.m50055(c23892.f69124.f73596)).anyMatch(new C10576(3, c22092));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24550 m49973(C2920 c2920, AbstractC19728 abstractC19728) {
        return (C24550) this.f71218.get(new C5558(c2920, abstractC19728));
    }

    /* JADX WARN: Code duplicated, block: B:49:0x014d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0322 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0324  */
    /* JADX WARN: Code duplicated, block: B:97:0x0326  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50000(final AbstractC8036 abstractC8036, final C10377 c10377, C10377 c10378, C24550 c24550) {
        boolean zM55116;
        boolean z;
        C25213 c25213;
        C11040 c11040;
        long j = c10377.f38071;
        if ((2147487744L & j) == 0) {
            long j2 = c10378.f38071;
            if ((ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF & j2) != 0) {
                return;
            }
            long j3 = j & 8;
            C7312 c7312 = this.f71200;
            if (j3 != 0 && (j2 & 8) == 0) {
                AbstractC8036 abstractC8036M28325 = C11239.m28325(c10377, abstractC8036, false);
                C15515 c15515M49911 = m49911(c10377, c10378);
                C11040 c11041 = C22843.f74058;
                c7312.m34520(abstractC8036M28325, new C11040("compiler", "override.static", c15515M49911));
                c10377.f38071 |= 35184372088832L;
                return;
            }
            if ((16 & j2) != 0 || (j3 == 0 && (j2 & 8) != 0)) {
                AbstractC8036 abstractC8036M28326 = C11239.m28325(c10377, abstractC8036, false);
                C15515 c15515M49912 = m49911(c10377, c10378);
                EnumSet enumSetM8159 = C2417.m8159(c10378.f38071 & 24);
                C11040 c11042 = C22843.f74058;
                c7312.m34520(abstractC8036M28326, new C11040("compiler", "override.meth", c15515M49912, enumSetM8159));
                c10377.f38071 |= 35184372088832L;
                return;
            }
            if ((c10377.f38069.mo29591() & 8192) != 0) {
                return;
            }
            if (m49909(c10377.f38071) > m49909(c10378.f38071)) {
                AbstractC8036 abstractC8036M28327 = C11239.m28325(c10377, abstractC8036, false);
                if ((c10378.f38071 & 7) == 0) {
                    C15515 c15515M49913 = m49911(c10377, c10378);
                    C11040 c11043 = C22843.f74058;
                    c11040 = new C11040("compiler", "override.weaker.access", c15515M49913, "package");
                } else {
                    C15515 c15515M49914 = m49911(c10377, c10378);
                    EnumSet enumSetM81510 = C2417.m8159(c10378.f38071 & 7);
                    C11040 c11044 = C22843.f74058;
                    c11040 = new C11040("compiler", "override.weaker.access", c15515M49914, enumSetM81510);
                }
                c7312.m34520(abstractC8036M28327, c11040);
                c10377.f38071 |= 35184372088832L;
                return;
            }
            AbstractC22664 abstractC22664 = c24550.f38067;
            C24705 c24705 = this.f71203;
            AbstractC22664 abstractC22664M55126 = c24705.m55126(c10377, abstractC22664);
            AbstractC22664 abstractC22664M55127 = c24705.m55126(c10378, c24550.f38067);
            C14769 c14769Mo15882 = abstractC22664M55126.mo15882();
            C14769 c14769Mo15883 = abstractC22664M55127.mo15882();
            AbstractC22664 abstractC22664Mo31585 = abstractC22664M55126.mo31585();
            AbstractC22664 abstractC22664M55103 = c24705.m55103(abstractC22664M55127.mo31585(), c14769Mo15883, c14769Mo15882);
            C1083 c1083 = this.f71211;
            c1083.m4080();
            if (c24705.m55149(abstractC22664M55126.mo31585(), abstractC22664M55103)) {
                zM55116 = true;
            } else if (abstractC22664M55126.mo31585().mo40452() || abstractC22664M55103.mo40452()) {
                zM55116 = false;
            } else if (c24705.m55117(abstractC22664M55126, abstractC22664M55127, true)) {
                zM55116 = c24705.m55116(abstractC22664M55126.mo31585(), abstractC22664M55103, c1083);
            } else {
                if (!c24705.m55150(abstractC22664M55126.mo31585(), abstractC22664M55103, c1083)) {
                    if (c24705.m55131(abstractC22664M55126.mo31585(), c24705.m55132(abstractC22664M55103), true)) {
                        c1083.mo4085(EnumC19876.UNCHECKED);
                    } else {
                        zM55116 = false;
                    }
                }
                zM55116 = true;
            }
            if (!zM55116) {
                if ((c10377.f38071 & 8) == 0 || (c10378.f38071 & 8) == 0) {
                    AbstractC8036 abstractC8036M28328 = C11239.m28325(c10377, abstractC8036, false);
                    C15515 c15515M49915 = m49911(c10377, c10378);
                    C11040 c11045 = C22843.f74058;
                    c7312.m34520(abstractC8036M28328, new C11040("compiler", "override.incompatible.ret", c15515M49915, abstractC22664Mo31585, abstractC22664M55103));
                    c10377.f38071 |= 35184372088832L;
                    return;
                }
                AbstractC8036 abstractC8036M28329 = C11239.m28325(c10377, abstractC8036, false);
                AbstractC11781 abstractC11781M29579 = c10377.m29579();
                AbstractC11781 abstractC11781M295710 = c10378.m29579();
                C15515 c15515 = C19859.f63823;
                C15515 c15516 = new C15515("compiler", "cant.hide", c10377, abstractC11781M29579, c10378, abstractC11781M295710);
                C11040 c11046 = C22843.f74058;
                c7312.m34520(abstractC8036M28329, new C11040("compiler", "override.incompatible.ret", c15516, abstractC22664Mo31585, abstractC22664M55103));
                c10377.f38071 |= 35184372088832L;
                return;
            }
            if (c1083.m4084(EnumC19876.UNCHECKED)) {
                AbstractC8036 abstractC8036M283210 = C11239.m28325(c10377, abstractC8036, false);
                C15515 c15515M49950 = m49950(c10377, c10378);
                C25213 c25214 = C13146.f42046;
                m50048(abstractC8036M283210, new C25213("compiler", "override.unchecked.ret", c15515M49950, abstractC22664Mo31585, abstractC22664M55103));
            }
            C14769 c14769M55095 = c24705.m55095(abstractC22664M55127.mo50622(), c14769Mo15883, c14769Mo15882);
            C14769 c14769M50056 = m50056(abstractC22664M55126.mo50622(), c24705.m55154(c14769M55095));
            C14769 c14769M50057 = m50056(abstractC22664M55126.mo50622(), c14769M55095);
            if (c14769M50056.m35550()) {
                AbstractC8036 abstractC8036M283211 = C11239.m28325(c10377, abstractC8036, false);
                C15515 c15515M49916 = m49911(c10377, c10378);
                AbstractC22664 abstractC22665 = (AbstractC22664) c14769M50057.f48335;
                C11040 c11047 = C22843.f74058;
                c7312.m34520(abstractC8036M283211, new C11040("compiler", "override.meth.doesnt.throw", c15515M49916, abstractC22665));
                c10377.f38071 |= 35184372088832L;
                return;
            }
            if (c14769M50057.m35550()) {
                AbstractC8036 abstractC8036M283212 = C11239.m28325(c10377, abstractC8036, false);
                C15515 c15515M49917 = m49911(c10377, c10378);
                AbstractC22664 abstractC22666 = (AbstractC22664) c14769M50057.f48335;
                C25213 c25215 = C13146.f42046;
                m50048(abstractC8036M283212, new C25213("compiler", "override.unchecked.thrown", c15515M49917, abstractC22666));
                return;
            }
            if (((c10377.f38071 ^ c10378.f38071) & 17179869184L) != 0 && this.f71219.m36878(EnumC19876.OVERRIDES)) {
                AbstractC8036 abstractC8036M283213 = C11239.m28325(c10377, abstractC8036, false);
                if ((17179869184L & c10377.f38071) != 0) {
                    C15515 c15515M49942 = m49942(c10377, c10378);
                    C25213 c25216 = C13146.f42046;
                    c25213 = new C25213("compiler", "override.varargs.missing", c15515M49942);
                } else {
                    C15515 c15515M49943 = m49942(c10377, c10378);
                    C25213 c25217 = C13146.f42046;
                    c25213 = new C25213("compiler", "override.varargs.extra", c15515M49943);
                }
                c7312.m34531(abstractC8036M283213, c25213);
            }
            if ((c10378.f38071 & 2147483648L) != 0) {
                AbstractC8036 abstractC8036M283214 = C11239.m28325(c10377, abstractC8036, false);
                C15515 c15515M49951 = m49950(c10377, c10378);
                C25213 c25218 = C13146.f42046;
                c7312.m34531(abstractC8036M283214, new C25213("compiler", "override.bridge", c15515M49951));
            }
            C24550 c24550M29558 = c10378.m29558();
            AbstractC22664 abstractC22664M55137 = c24705.m55137(c24550.f38067);
            if (abstractC22664M55137.m51067(EnumC21172.CLASS)) {
                C10377 c10377M26687 = c10378.m26687((C24550) abstractC22664M55137.f73596, c24705, false);
                if (c24550M29558 != null) {
                    c24550M29558.mo29590();
                    if ((c24550M29558.f38071 & 512) != 0) {
                        if (c24705.m55144(c24550.f38067).contains(c24550M29558.f38067) || c10377M26687 == null) {
                            z = false;
                        } else {
                            z = true;
                        }
                    } else if (c10377M26687 != c10378) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else if (c10377M26687 != c10378) {
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
            C15400 c15400M36876 = this.f71219.m36876(c10377);
            C15400 c15400 = this.f71219;
            this.f71219 = c15400M36876;
            try {
                m49975(new Supplier() { // from class: l.ۚۜ᩺
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return C11239.m28325(c10377, abstractC8036, false);
                    }
                }, c10377, c10378);
            } finally {
                this.f71219 = c15400;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22092 m49912(C4747 c4747) {
        C22092 c22092 = (C22092) c4747.m14643(f71190);
        return c22092 == null ? new C22092(c4747) : c22092;
    }

    public C22092(C4747 c4747) {
        c4747.m14646(f71190, this);
        this.f71197 = C15252.m36599(c4747);
        C7312 c7312M20023 = C7312.m20023(c4747);
        this.f71200 = c7312M20023;
        this.f71202 = C22010.m49750(c4747);
        this.f71193 = C14764.m35506(c4747);
        this.f71214 = C15846.m37791(c4747);
        this.f71209 = C12863.m31895(c4747);
        this.f71223 = C14528.m35047(c4747);
        this.f71203 = C24705.m55066(c4747);
        this.f71195 = C12221.m30493(c4747);
        this.f71225 = C19991.m45972(c4747);
        C13015 c13015M32421 = C13015.m32421(c4747);
        this.f71219 = C15400.m36873(c4747);
        this.f71213 = (InterfaceC16722) c4747.m14642(InterfaceC16722.class);
        EnumC20820 enumC20820M47625 = EnumC20820.m47625(c4747);
        this.f71217 = enumC20820M47625;
        EnumC16305.m38659(c4747);
        this.f71210 = c13015M32421.m32432("warnOnAccessToMembers");
        this.f71204 = EnumC16305.m38659(c4747).m38664();
        this.f71216 = EnumC5865.m17070(c4747);
        this.f71220 = C17638.m41289(c4747);
        C15400 c15400 = this.f71219;
        EnumC19876 enumC19876 = EnumC19876.DEPRECATION;
        boolean zM36878 = c15400.m36878(enumC19876);
        C15400 c15401 = this.f71219;
        EnumC19876 enumC19877 = EnumC19876.REMOVAL;
        boolean zM36879 = c15401.m36878(enumC19877);
        C15400 c15402 = this.f71219;
        EnumC19876 enumC19878 = EnumC19876.UNCHECKED;
        boolean zM368710 = c15402.m36878(enumC19878);
        this.f71194 = new C4812(c7312M20023, null, zM36878, "deprecated", enumC19876);
        this.f71192 = new C4812(c7312M20023, null, zM36879, "removal", enumC19877);
        this.f71201 = new C4812(c7312M20023, null, zM368710, "unchecked", enumC19878);
        this.f71205 = new C4812(c7312M20023, null, false, "sunapi", null);
        this.f71199 = C6147.m17745(c4747);
        this.f71198 = EnumC3666.f12544.m11915(enumC20820M47625);
        this.f71221 = EnumC3666.f12546.m11915(enumC20820M47625);
        this.f71206 = EnumC3666.f12578.m11915(enumC20820M47625);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50015(final AbstractC22664 abstractC22664, final AbstractC11781 abstractC11781, final C3168 c3168, final C14769 c14769, final C14769 c147610, final boolean z, C2596 c2596) {
        char c;
        C3168 c3169;
        if (abstractC22664.m51073(c2596.f8340)) {
            c2596.m8700(C14769.of((Object) abstractC22664), new InterfaceC10382() { // from class: l.ۨۜ᩺
                @Override // l.InterfaceC10382
                /* JADX INFO: renamed from: ۙ */
                public final void mo2127(C2596 c2597) {
                    boolean z2 = z;
                    this.f39215.m50015(c2597.m8696(abstractC22664), abstractC11781, c3168, c14769, c147610, z2, c2597);
                }
            });
            return;
        }
        C14769 c14769Mo50621 = abstractC22664.mo50621();
        C14769 c14769Mo50622 = abstractC11781.f38067.mo50621();
        if (c14769Mo50622.m35551() != c14769Mo50621.m35551()) {
            c14769Mo50622 = c14769Mo50621;
        }
        AbstractC22664 abstractC22665 = z ? (AbstractC22664) c14769Mo50621.last() : null;
        AbstractC19728 abstractC19728 = abstractC11781.f38072;
        AbstractC19728 abstractC19729 = this.f71197.f49865;
        C14764 c14764 = this.f71193;
        if (abstractC19728 == abstractC19729 && abstractC11781.f38069 == c14764.f48309) {
            c14769Mo50621 = c14769Mo50621.f48336.f48336;
            c14769Mo50622 = c14769Mo50622.f48336.f48336;
        }
        if ((abstractC11781.mo29591() & 144115188075855872L) != 0) {
            c14769Mo50621 = c14769Mo50621.f48336;
            c14769Mo50622 = c14769Mo50622.f48336;
        }
        C24705 c24705 = this.f71203;
        if (c14769 != null) {
            C14769 c147611 = c14769;
            C14769 c147612 = c14769Mo50621;
            C14769 c147613 = c14769Mo50622;
            while (c147612.f48335 != abstractC22665) {
                AbstractC8036 abstractC8036 = (AbstractC8036) c147611.f48335;
                abstractC8036.getClass();
                m49932(abstractC8036.f26659, (AbstractC22664) c147612.f48335, new C2504(this, abstractC8036, "unchecked.assign", abstractC8036.f26659, (AbstractC22664) c147613.f48335));
                c147611 = c147611.f48336;
                c147612 = c147612.f48336;
                c147613 = c147613.f48336;
            }
            c = 0;
            if (z) {
                AbstractC22664 abstractC22664M55120 = c24705.m55120(abstractC22665);
                for (C14769 c147614 = c147611; c147614.f48336 != null; c147614 = c147614.f48336) {
                    AbstractC8036 abstractC8037 = (AbstractC8036) c147614.f48335;
                    abstractC8037.getClass();
                    m49932(abstractC8037.f26659, abstractC22664M55120, new C2504(this, abstractC8037, "unchecked.assign", abstractC8037.f26659, abstractC22664M55120));
                }
            } else if ((abstractC11781.mo29591() & 70385924046848L) == 17179869184L) {
                AbstractC22664 abstractC22666 = (AbstractC22664) abstractC22664.mo50621().last();
                AbstractC22664 abstractC22667 = (AbstractC22664) c147610.last();
                if (c24705.m55150(abstractC22667, c24705.m55120(abstractC22666), c24705.f79958) && !c24705.m55149(c24705.m55132(abstractC22666), c24705.m55132(abstractC22667))) {
                    AbstractC22295 abstractC22295 = (AbstractC22295) c14769.last();
                    abstractC22295.getClass();
                    AbstractC22664 abstractC22664M55121 = c24705.m55120(abstractC22666);
                    C25213 c25213 = C13146.f42046;
                    this.f71200.m34531(abstractC22295, new C25213("compiler", "inexact.non-varargs.call", abstractC22664M55121, abstractC22666));
                }
            }
        } else {
            c = 0;
        }
        if (z) {
            AbstractC22664 abstractC22668 = (AbstractC22664) abstractC22664.mo50621().last();
            if (c24705.m55151(abstractC22668) || (abstractC11781.mo10410().m29565(c14764.f48295.f73596) != null && m49952(abstractC11781))) {
                c3169 = c3168;
            } else {
                c3169 = c3168;
                AbstractC8036 abstractC8038 = c3169.f10273;
                abstractC8038.getClass();
                C25213 c25214 = C13146.f42046;
                Object[] objArr = new Object[1];
                objArr[c] = abstractC22668;
                m50048(abstractC8038, new C25213("compiler", "unchecked.generic.array.creation", objArr));
            }
            C11239.m28334(c24705.m55120(abstractC22668), c3169.f10273);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15400 m49962(C15400 c15400) {
        C15400 c15401 = this.f71219;
        this.f71219 = c15400;
        return c15401;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10377 m49960(C10377 c10377) {
        C10377 c10378 = this.f71224;
        this.f71224 = c10377;
        return c10378;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49986(InterfaceC5075 interfaceC5075, C25213 c25213) {
        if (this.f71219.m36879(EnumC19876.PREVIEW)) {
            return;
        }
        this.f71220.m41293(interfaceC5075, c25213);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m50048(InterfaceC5075 interfaceC5075, C25213 c25213) {
        if (this.f71219.m36879(EnumC19876.UNCHECKED)) {
            return;
        }
        this.f71201.m14840(interfaceC5075, c25213);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m50032(InterfaceC5075 interfaceC5075, C25213 c25213) {
        C15400 c15400 = this.f71219;
        EnumC19876 enumC19876 = EnumC19876.VARARGS;
        if (c15400.m36878(enumC19876)) {
            this.f71200.m34532(enumC19876, interfaceC5075, c25213);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50016(C23041 c23041, C25213 c25213) {
        C15400 c15400 = this.f71219;
        EnumC19876 enumC19876 = EnumC19876.STATIC;
        if (c15400.m36878(enumC19876)) {
            this.f71200.m34532(enumC19876, c23041, c25213);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49920(C22092 c22092, InterfaceC5075 interfaceC5075) {
        C15400 c15400 = c22092.f71219;
        EnumC19876 enumC19876 = EnumC19876.DIVZERO;
        if (c15400.m36878(enumC19876)) {
            c22092.f71200.m34532(enumC19876, interfaceC5075, C13146.f42063);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m50046() {
        this.f71194.m14839();
        this.f71192.m14839();
        this.f71201.m14839();
        this.f71205.m14839();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m49966(InterfaceC5075 interfaceC5075, C21566 c21566) {
        EnumC6984 enumC6984 = EnumC6984.NON_DEFERRABLE;
        AbstractC11781 abstractC11781 = c21566.f68881;
        C17007 c17007M49041 = c21566.m49041();
        C11040 c11040 = C22843.f74058;
        this.f71200.m34523(enumC6984, interfaceC5075, new C11040("compiler", "cant.access", abstractC11781, c17007M49041));
        return this.f71193.f48263;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m49965(InterfaceC5075 interfaceC5075, C17007 c17007, Object obj) {
        boolean z = obj instanceof AbstractC22664;
        C14764 c14764 = this.f71193;
        C7312 c7312 = this.f71200;
        if (z && ((AbstractC22664) obj).m51067(EnumC21172.VOID)) {
            c7312.m34520(interfaceC5075, C22843.f74187);
            return c14764.f48263;
        }
        C11040 c11040 = C22843.f74058;
        c7312.m34520(interfaceC5075, new C11040("compiler", "type.found.req", obj, c17007));
        return this.f71203.m55139(z ? (AbstractC22664) obj : c14764.f48263);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m50047(InterfaceC5075 interfaceC5075, AbstractC11781 abstractC11781) {
        C11040 c11040 = C22843.f74058;
        this.f71200.m34520(interfaceC5075, new C11040("compiler", "cant.ref.before.ctor.called", abstractC11781));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49983(InterfaceC5075 interfaceC5075, AbstractC11781 abstractC11781) {
        if (abstractC11781.f38067.mo9329()) {
            return;
        }
        AbstractC11781 abstractC11781M29579 = abstractC11781.m29579();
        EnumC13603 enumC13603 = abstractC11781M29579.f38066;
        EnumC13603 enumC13604 = EnumC13603.f43218;
        C7312 c7312 = this.f71200;
        if (enumC13603 == enumC13604 && ((C10377) abstractC11781M29579).m26693()) {
            EnumC4960 enumC4960M27726 = C10925.m27726(abstractC11781);
            EnumC4960 enumC4960M27727 = C10925.m27726(abstractC11781.m29579());
            EnumC4960 enumC4960M27728 = C10925.m27726(abstractC11781.m29579().m29558());
            C24550 c24550M29558 = abstractC11781.m29579().m29558();
            C11040 c11040 = C22843.f74058;
            c7312.m34520(interfaceC5075, new C11040("compiler", "already.defined.in.clinit", enumC4960M27726, abstractC11781, enumC4960M27727, enumC4960M27728, c24550M29558));
            return;
        }
        if (abstractC11781M29579.f38066 == enumC13604) {
            long j = abstractC11781.f38069.f38071;
            if ((68719476736L & j) != 0 && (j & 2305843009213693952L) != 0) {
                return;
            }
        }
        EnumC4960 enumC4960M27729 = C10925.m27726(abstractC11781);
        EnumC4960 enumC4960M277210 = C10925.m27726(abstractC11781.m29579());
        AbstractC11781 abstractC11781M295710 = abstractC11781.m29579();
        C11040 c11041 = C22843.f74058;
        c7312.m34520(interfaceC5075, new C11040("compiler", "already.defined", enumC4960M27729, abstractC11781, enumC4960M277210, abstractC11781M295710));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49975(final Supplier supplier, AbstractC11781 abstractC11781, final AbstractC11781 abstractC11782) {
        if ((abstractC11782.f38071 & 36028797018963968L) == 0 && (!abstractC11782.mo9560() || abstractC11781.mo9560())) {
            return;
        }
        if ((abstractC11782.mo9564() != abstractC11781.mo9564() || abstractC11782.mo9564() == null) && abstractC11782.f38066 != EnumC13603.f43219) {
            this.f71199.m17749(new InterfaceC12112() { // from class: l.ܳۜ᩺
                @Override // l.InterfaceC12112
                /* JADX INFO: renamed from: ۙ */
                public final void mo6201() {
                    C22092.m49918(this.f49563, supplier, abstractC11782);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49981(InterfaceC5075 interfaceC5075, C5816 c5816, AbstractC17836 abstractC17836) {
        AbstractC11781 abstractC11781;
        AbstractC11781 abstractC11782;
        Iterator it = abstractC17836.m38842(c5816.f38072).iterator();
        while (it.hasNext() && (abstractC11782 = (abstractC11781 = (AbstractC11781) it.next()).f38069) == c5816.f38069) {
            if (abstractC11781.f38066 == EnumC13603.f43205 && abstractC11782.f38066.m33349(C22114.f71276) && c5816.f38072 != this.f71197.f49822) {
                m49983(interfaceC5075, abstractC11781);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49995(C7926 c7926, C24550 c24550, AbstractC17836 abstractC17836) {
        for (AbstractC11781 abstractC11781 : abstractC17836.m38842(c24550.f38072)) {
            if (abstractC11781.f38069 != c24550.f38069) {
                return;
            }
            if (abstractC11781.f38066 == EnumC13603.f43213 && !abstractC11781.f38067.m51067(EnumC21172.TYPEVAR) && abstractC11781.f38069.f38066.m33349(C22114.f71276) && c24550.f38072 != this.f71197.f49822) {
                m49983(c7926, abstractC11781);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m50022(C7926 c7926, AbstractC19728 abstractC19728, AbstractC17836 abstractC17836) {
        AbstractC19728 abstractC19729;
        Iterator it = abstractC17836.mo7473(abstractC19728, null, EnumC13908.NON_RECURSIVE).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C15252 c15252 = this.f71197;
            if (zHasNext) {
                AbstractC11781 abstractC11781 = (AbstractC11781) it.next();
                if (abstractC11781.f38066 == EnumC13603.f43213 && abstractC11781.f38072 != c15252.f49822) {
                    m49983(c7926, abstractC11781);
                    return false;
                }
            } else {
                for (AbstractC11781 abstractC11782 = abstractC17836.f53083; abstractC11782 != null; abstractC11782 = abstractC11782.f38069) {
                    if (abstractC11782.f38066 == EnumC13603.f43213 && (abstractC19729 = abstractC11782.f38072) == abstractC19728 && abstractC19729 != c15252.f49822) {
                        m49983(c7926, abstractC11782);
                        return true;
                    }
                }
                return true;
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC19728 m50030(C24550 c24550) {
        AbstractC19728 abstractC19728 = c24550.f38069.m29558().f79578;
        String string = abstractC19728.toString();
        C5558 c5558 = new C5558(abstractC19728, c24550.f38072);
        HashMap map = this.f71208;
        Integer num = (Integer) map.get(c5558);
        int iIntValue = num == null ? 1 : num.intValue();
        while (true) {
            StringBuilder sbM27333 = C10732.m27333(string);
            sbM27333.append(this.f71204);
            sbM27333.append(iIntValue);
            sbM27333.append((Object) c24550.f38072);
            AbstractC19728 abstractC19728M51194 = this.f71197.f49864.m51194(sbM27333.toString());
            if (m49973(c24550.m29564().f44618, abstractC19728M51194) == null) {
                map.put(c5558, Integer.valueOf(iIntValue + 1));
                return abstractC19728M51194;
            }
            iIntValue++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50017(C24550 c24550) {
        AbstractC11781 abstractC11781 = c24550.f38069;
        if (abstractC11781 == null || abstractC11781.f38066 == EnumC13603.f43211) {
            return;
        }
        this.f71208.remove(new C5558(abstractC11781.m29558().f79578, c24550.f38072));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49974() {
        this.f71218.clear();
        this.f71208.clear();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m50058(C24550 c24550) {
        this.f71218.put(new C5558(c24550.m29564().f44618, c24550.f79578), c24550);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C24550 m50045(C24550 c24550) {
        return (C24550) this.f71218.get(new C5558(c24550.m29564().f44618, c24550.f79578));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m50041(C24550 c24550) {
        this.f71218.remove(new C5558(c24550.m29564().f44618, c24550.f79578));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m49970(final InterfaceC5075 interfaceC5075, final AbstractC22664 abstractC22664, final AbstractC22664 abstractC22665, final InterfaceC1013 interfaceC1013) {
        C2596 c2596Mo2276 = interfaceC1013.mo2276();
        if (abstractC22665.m51073(c2596Mo2276.f8340) || abstractC22664.m51073(c2596Mo2276.f8340)) {
            c2596Mo2276.m8700(C14769.of((Object) abstractC22665, (Object) abstractC22664), new InterfaceC10382() { // from class: l.ۘۜ᩺
                @Override // l.InterfaceC10382
                /* JADX INFO: renamed from: ۙ */
                public final void mo2127(C2596 c2596) {
                    this.f13660.m49970(interfaceC5075, c2596.m8696(abstractC22664), c2596.m8696(abstractC22665), interfaceC1013);
                }
            });
        }
        if (abstractC22665.m51067(EnumC21172.ERROR)) {
            return abstractC22665;
        }
        if (abstractC22665.m51067(EnumC21172.NONE) || interfaceC1013.mo3911(abstractC22664, abstractC22665, interfaceC1013.mo3909(interfaceC5075, abstractC22664, abstractC22665))) {
            return abstractC22664;
        }
        boolean zMo40455 = abstractC22664.mo40455();
        C24705 c24705 = this.f71203;
        C19991 c19991 = this.f71225;
        if (zMo40455 && abstractC22665.mo40455()) {
            C15515 c15515 = C19859.f63823;
            interfaceC1013.mo3910(interfaceC5075, c19991.m45975(new C15515("compiler", "possible.loss.of.precision", abstractC22664, abstractC22665)));
            return c24705.m55139(abstractC22664);
        }
        interfaceC1013.mo3910(interfaceC5075, c19991.m45975(C19859.m45718(abstractC22664, abstractC22665)));
        return c24705.m55139(abstractC22664);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50010(final C16985 c16985) {
        AbstractC11781 abstractC11781M28352;
        if (c16985.f26659.mo9329()) {
            return;
        }
        if (!this.f71203.m55149(c16985.f55515.f26659, c16985.f55514.f26659) || C11239.m28357(c16985.f55514)) {
            return;
        }
        AbstractC22295 abstractC22295M28353 = C11239.m28353(c16985.f55515);
        if (!abstractC22295M28353.m21911(EnumC21461.f68526) || (abstractC11781M28352 = C11239.m28352(((C24533) abstractC22295M28353).f79554)) == null || abstractC11781M28352.f38066 != EnumC13603.f43218 || (abstractC11781M28352.mo29591() & 137438953472L) == 0) {
            this.f71199.m17749(new InterfaceC12112() { // from class: l.᩷ۜ᩺
                @Override // l.InterfaceC12112
                /* JADX INFO: renamed from: ۙ */
                public final void mo6201() {
                    C22092.m49926(this.f70732, c16985);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49926(C22092 c22092, C16985 c16985) {
        C15400 c15400 = c22092.f71219;
        EnumC19876 enumC19876 = EnumC19876.CAST;
        if (c15400.m36878(enumC19876)) {
            C7312 c7312 = c22092.f71200;
            AbstractC22664 abstractC22664 = c16985.f55514.f26659;
            C25213 c25213 = C13146.f42046;
            c7312.m34532(enumC19876, c16985, new C25213("compiler", "redundant.cast", abstractC22664));
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m50037(InterfaceC5075 interfaceC5075, AbstractC22664 abstractC22664) {
        if (!abstractC22664.m51067(EnumC21172.VOID)) {
            return abstractC22664;
        }
        this.f71200.m34520(interfaceC5075, C22843.f74142);
        return this.f71203.m55139(abstractC22664);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m49967(InterfaceC5075 interfaceC5075, AbstractC22664 abstractC22664) {
        Object objM45975;
        if (abstractC22664.m51067(EnumC21172.CLASS) || abstractC22664.m51067(EnumC21172.ARRAY) || abstractC22664.m51067(EnumC21172.ERROR)) {
            return abstractC22664;
        }
        C15515 c15515 = C19859.f63881;
        C19991 c19991 = this.f71225;
        C17007 c17007M45975 = c19991.m45975(c15515);
        if (abstractC22664.m51067(EnumC21172.TYPEVAR)) {
            objM45975 = abstractC22664;
            objM45975 = c19991.m45975(new C15515("compiler", "type.parameter", abstractC22664));
        }
        objM45975 = abstractC22664;
        return m49965(interfaceC5075, c17007M45975, objM45975);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m50044(InterfaceC5075 interfaceC5075, AbstractC22664 abstractC22664) {
        Object objM45975;
        if (abstractC22664.m51067(EnumC21172.CLASS) || abstractC22664.m51067(EnumC21172.ERROR)) {
            return abstractC22664;
        }
        C15515 c15515 = C19859.f63843;
        C19991 c19991 = this.f71225;
        C17007 c17007M45975 = c19991.m45975(c15515);
        if (abstractC22664.m51067(EnumC21172.TYPEVAR)) {
            objM45975 = abstractC22664;
            objM45975 = c19991.m45975(new C15515("compiler", "type.parameter", abstractC22664));
        }
        objM45975 = abstractC22664;
        return m49965(interfaceC5075, c17007M45975, objM45975);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m50057(InterfaceC5075 interfaceC5075, AbstractC22664 abstractC22664) {
        AbstractC22664 abstractC22664M49967 = m49967(interfaceC5075, abstractC22664);
        boolean zM51067 = abstractC22664M49967.m51067(EnumC21172.CLASS);
        C7312 c7312 = this.f71200;
        C24705 c24705 = this.f71203;
        if (!zM51067) {
            if (!abstractC22664M49967.m51067(EnumC21172.ARRAY) || c24705.m55151(((C2832) abstractC22664M49967).f9333)) {
                return abstractC22664M49967;
            }
            c7312.m34520(interfaceC5075, C22843.f74179);
            return c24705.m55139(abstractC22664M49967);
        }
        if ((abstractC22664M49967.f73596.mo29591() & 1536) != 0) {
            AbstractC22970 abstractC22970 = abstractC22664M49967.f73596;
            C11040 c11040 = C22843.f74058;
            c7312.m34520(interfaceC5075, new C11040("compiler", "abstract.cant.be.instantiated", abstractC22970));
            return c24705.m55139(abstractC22664M49967);
        }
        if ((abstractC22664M49967.f73596.mo29591() & 16384) != 0) {
            c7312.m34520(interfaceC5075, C22843.f74134);
            return c24705.m55139(abstractC22664M49967);
        }
        return m49971(interfaceC5075, abstractC22664M49967, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m49971(InterfaceC5075 interfaceC5075, AbstractC22664 abstractC22664, boolean z) {
        AbstractC22664 abstractC22664M50044 = m50044(interfaceC5075, abstractC22664);
        if (z && abstractC22664M50044.mo9330()) {
            for (C14769 c14769Mo15882 = abstractC22664M50044.mo15882(); c14769Mo15882.m35550(); c14769Mo15882 = c14769Mo15882.f48336) {
                if (((AbstractC22664) c14769Mo15882.f48335).m51067(EnumC21172.WILDCARD)) {
                    return m49965(interfaceC5075, this.f71225.m45975(C19859.f63871), c14769Mo15882.f48335);
                }
            }
        }
        return abstractC22664M50044;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m49958(InterfaceC5075 interfaceC5075, AbstractC22664 abstractC22664) {
        return abstractC22664.mo9326() ? abstractC22664 : m49965(interfaceC5075, this.f71225.m45975(C19859.f63858), abstractC22664);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50007(C14769 c14769, C14769 c147610) {
        while (c147610.m35550()) {
            AbstractC22295 abstractC22295 = (AbstractC22295) c14769.f48335;
            abstractC22295.getClass();
            c147610.f48335 = m49958(abstractC22295, (AbstractC22664) c147610.f48335);
            c14769 = c14769.f48336;
            c147610 = c147610.f48336;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m50028(InterfaceC5075 interfaceC5075, AbstractC22664 abstractC22664) {
        return (abstractC22664.mo9326() || abstractC22664.m51067(EnumC21172.BOT)) ? abstractC22664 : m49965(interfaceC5075, this.f71225.m45975(C19859.f63858), abstractC22664);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m50023(AbstractC8036 abstractC8036, long j, long j2, long j3) {
        long j4 = j2 & j;
        if (j4 != 0) {
            long j5 = j & j3;
            if (j5 != 0) {
                long j6 = 1;
                long j7 = 1;
                while ((j7 & j4) == 0) {
                    j7 <<= 1;
                }
                EnumSet enumSetM8159 = C2417.m8159(j7);
                while ((j6 & j5) == 0) {
                    j6 <<= 1;
                }
                EnumSet enumSetM81510 = C2417.m8159(j6);
                C11040 c11040 = C22843.f74058;
                this.f71200.m34520(abstractC8036, new C11040("compiler", "illegal.combination.of.modifiers", enumSetM8159, enumSetM81510));
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m49972(C18565 c18565, AbstractC22664 abstractC22664) {
        if (!C11239.m28349(c18565) || abstractC22664.mo9329()) {
            AbstractC22295 abstractC22295 = c18565.f60323;
            abstractC22295.getClass();
            return m49971((InterfaceC5075) abstractC22295, abstractC22664, true);
        }
        C7926 c7926 = c18565.f60319;
        C7312 c7312 = this.f71200;
        if (c7926 != null) {
            EnumC3666 enumC3666 = EnumC3666.f12554;
            EnumC20820 enumC20820 = this.f71217;
            if (!enumC3666.m11915(enumC20820)) {
                EnumC6984 enumC6984 = EnumC6984.SOURCE_LEVEL;
                AbstractC22295 abstractC22296 = c18565.f60323;
                abstractC22296.getClass();
                C15515 c15515M11916 = enumC3666.m11916(enumC20820.f66685);
                C11040 c11040 = C22843.f74058;
                c7312.m34523(enumC6984, abstractC22296, new C11040("compiler", "cant.apply.diamond.1", abstractC22664, c15515M11916));
            }
        }
        boolean zIsEmpty = abstractC22664.f73596.f38067.mo15882().isEmpty();
        C24705 c24705 = this.f71203;
        if (zIsEmpty) {
            AbstractC22295 abstractC22297 = c18565.f60323;
            abstractC22297.getClass();
            C15515 c15515 = C19859.f63823;
            C15515 c15516 = new C15515("compiler", "diamond.non.generic", abstractC22664);
            C11040 c11041 = C22843.f74058;
            c7312.m34520(abstractC22297, new C11040("compiler", "cant.apply.diamond.1", abstractC22664, c15516));
            return c24705.m55139(abstractC22664);
        }
        C14769 c14769 = c18565.f60320;
        if (c14769 == null || !c14769.m35550()) {
            return abstractC22664;
        }
        AbstractC22295 abstractC22298 = c18565.f60323;
        abstractC22298.getClass();
        C15515 c15517 = C19859.f63823;
        C15515 c15518 = new C15515("compiler", "diamond.and.explicit.params", abstractC22664);
        C11040 c11042 = C22843.f74058;
        c7312.m34520(abstractC22298, new C11040("compiler", "cant.apply.diamond.1", abstractC22664, c15518));
        return c24705.m55139(abstractC22664);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m49945(AbstractC22664 abstractC22664) {
        AbstractC1100 abstractC1100 = f71191;
        abstractC1100.getClass();
        return ((Boolean) abstractC22664.mo9324(abstractC1100, (Object) null)).booleanValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49987(C6633 c6633) {
        C17007 c17007M45975;
        C10377 c10377 = c6633.f22152;
        C14764 c14764 = this.f71193;
        AbstractC22664 abstractC22664 = c14764.f48295;
        AbstractC22664 abstractC22665 = c14764.f48295;
        boolean z = c10377.m29565((AbstractC11781) abstractC22664.f73596) != null;
        boolean zMo5574 = c10377.mo5574();
        C24705 c24705 = this.f71203;
        AbstractC22664 abstractC22664M55120 = zMo5574 ? c24705.m55120(((C12510) c6633.f22145.last()).f26659) : null;
        C19991 c19991 = this.f71225;
        if (z && !m49952(c10377)) {
            C7312 c7312 = this.f71200;
            if (abstractC22664M55120 != null) {
                if (EnumC3666.f12577.m11915(this.f71217)) {
                    c17007M45975 = c19991.m45975(new C15515("compiler", "varargs.trustme.on.virtual.varargs", c10377));
                } else {
                    c17007M45975 = c19991.m45975(new C15515("compiler", "varargs.trustme.on.virtual.varargs.final.only", c10377));
                }
                AbstractC22970 abstractC22970 = abstractC22665.f73596;
                C11040 c11040 = C22843.f74058;
                c7312.m34520(c6633, new C11040("compiler", "varargs.invalid.trustme.anno", abstractC22970, c17007M45975));
                return;
            }
            AbstractC22970 abstractC22971 = abstractC22665.f73596;
            C15515 c15515 = C19859.f63823;
            C15515 c15516 = new C15515("compiler", "varargs.trustme.on.non.varargs.meth", c10377);
            C11040 c11041 = C22843.f74058;
            c7312.m34520(c6633, new C11040("compiler", "varargs.invalid.trustme.anno", abstractC22971, c15516));
            return;
        }
        if (z && abstractC22664M55120 != null && c24705.m55151(abstractC22664M55120)) {
            AbstractC22970 abstractC22972 = abstractC22665.f73596;
            C15515 c15517 = C19859.f63823;
            C17007 c17007M45976 = c19991.m45975(new C15515("compiler", "varargs.trustme.on.reifiable.varargs", abstractC22664M55120));
            C25213 c25213 = C13146.f42046;
            m50032(c6633, new C25213("compiler", "varargs.redundant.trustme.anno", abstractC22972, c17007M45976));
            return;
        }
        if (z || abstractC22664M55120 == null || c24705.m55151(abstractC22664M55120)) {
            return;
        }
        InterfaceC5075 interfaceC5075 = (C12510) c6633.f22145.f48335;
        interfaceC5075.getClass();
        C25213 c25214 = C13146.f42046;
        m50048(interfaceC5075, new C25213("compiler", "unchecked.varargs.non.reifiable.type", abstractC22664M55120));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean m49952(AbstractC11781 abstractC11781) {
        if ((abstractC11781.mo29591() & 17179869184L) != 0) {
            if (abstractC11781.m29570()) {
                return true;
            }
            if ((abstractC11781.mo29591() & ((long) ((EnumC3666.f12577.m11915(this.f71217) ? 2 : 0) | 24))) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m49968(InterfaceC5075 interfaceC5075, AbstractC22664 abstractC22664, AbstractC19728 abstractC19728) {
        boolean zM51067 = abstractC22664.m51067(EnumC21172.BOT);
        C7312 c7312 = this.f71200;
        C24705 c24705 = this.f71203;
        if (zM51067) {
            c7312.m34520(interfaceC5075, C22843.m51555(abstractC19728, C19859.f63873));
            return c24705.m55139(abstractC22664);
        }
        if (abstractC22664.m51067(EnumC21172.VOID)) {
            c7312.m34520(interfaceC5075, C22843.m51555(abstractC19728, C19859.f63848));
            return c24705.m55139(abstractC22664);
        }
        return c24705.m55127(abstractC22664, c24705.m55125(abstractC22664)).mo4935();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m49932(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665, C1083 c1083) {
        C24705 c24705 = this.f71203;
        if (!c24705.m55170(abstractC22664, abstractC22665, c1083) && abstractC22665.mo18914() && c24705.m55131(abstractC22664, c24705.m55137(abstractC22665), true)) {
            for (C14769 c14769M55144 = c24705.m55144(abstractC22665); c14769M55144.m35550() && c24705.m55150(abstractC22664, (AbstractC22664) c14769M55144.f48335, c1083); c14769M55144 = c14769M55144.f48336) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m50027(AbstractC22664 abstractC22664) {
        return m49956(abstractC22664) == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC22664 m49956(AbstractC22664 abstractC22664) {
        C24705 c24705;
        C14769 c14769Mo9323 = abstractC22664.f73596.f38067.mo9323();
        C14769 c14769Mo9324 = abstractC22664.mo9323();
        C14769 c14769Mo15882 = abstractC22664.mo15882();
        C14769 c14769Mo15883 = abstractC22664.f73596.f38067.mo15882();
        C18499 c18499 = new C18499();
        while (true) {
            boolean zM35550 = c14769Mo15882.m35550();
            c24705 = this.f71203;
            if (!zM35550 || !c14769Mo15883.m35550()) {
                break;
            }
            c18499.m43089(c24705.m55103(((AbstractC22664) c14769Mo15883.f48335).mo19992(), c14769Mo9323, c14769Mo9324));
            c14769Mo15882 = c14769Mo15882.f48336;
            c14769Mo15883 = c14769Mo15883.f48336;
        }
        C14769 c14769Mo15884 = abstractC22664.mo15882();
        for (C14769 c14769M55155 = c24705.m55155(c14769Mo9323, c14769Mo9323, c24705.m55158(abstractC22664).mo9323()); c14769Mo15884.m35550() && c14769M55155.m35550(); c14769M55155 = c14769M55155.f48336) {
            ((AbstractC22664) c14769Mo15884.f48335).mo27318((C17969) c14769M55155.f48335);
            c14769Mo15884 = c14769Mo15884.f48336;
        }
        C14769 c14769Mo15885 = abstractC22664.mo15882();
        C14769 c14769M43093 = c18499.m43093();
        while (true) {
            boolean zM35551 = c14769Mo15885.m35550();
            AbstractC1584 abstractC1584 = this.f71196;
            if (zM35551 && c14769M43093.m35550()) {
                AbstractC22664 abstractC22665 = (AbstractC22664) c14769Mo15885.f48335;
                if (!((Boolean) abstractC1584.m5601(abstractC22665)).booleanValue() && !((AbstractC22664) c14769M43093.f48335).mo9329()) {
                    AbstractC22664 abstractC22666 = (AbstractC22664) c14769M43093.f48335;
                    boolean zM55136 = true;
                    if (!abstractC22665.mo27319()) {
                        if (abstractC22665.m51067(EnumC21172.WILDCARD)) {
                            if (abstractC22665.mo27317()) {
                                zM55136 = c24705.m55130(abstractC22666, c24705.m55123(abstractC22665), c24705.f79958);
                            } else if (abstractC22665.mo27320()) {
                                zM55136 = true ^ c24705.m55136(c24705.m55084(abstractC22665), abstractC22666);
                            }
                        } else {
                            zM55136 = c24705.m55131(C24705.m55074(abstractC22665), abstractC22666, true);
                        }
                    }
                    if (!zM55136) {
                        return (AbstractC22664) c14769Mo15885.f48335;
                    }
                }
                c14769Mo15885 = c14769Mo15885.f48336;
                c14769M43093 = c14769M43093.f48336;
            } else {
                C14769 c14769Mo15886 = abstractC22664.mo15882();
                C14769 c14769M43094 = c18499.m43093();
                for (AbstractC22664 abstractC22667 : c24705.m55158(abstractC22664).mo15882()) {
                    if (abstractC22667.m51067(EnumC21172.TYPEVAR) && abstractC22667.mo19992().mo9329() && !((AbstractC22664) c14769M43094.f48335).mo9329() && !((Boolean) abstractC1584.m5601((AbstractC22664) c14769Mo15886.f48335)).booleanValue()) {
                        return (AbstractC22664) c14769Mo15886.f48335;
                    }
                    c14769M43094 = c14769M43094.f48336;
                    c14769Mo15886 = c14769Mo15886.f48336;
                }
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49985(final InterfaceC5075 interfaceC5075, final C14106 c14106) {
        c14106.mo29590();
        if (c14106.f44616.m38843()) {
            c14106.mo29590();
            if ((c14106.f38071 & 4503599627370496L) == 0) {
                this.f71199.m17749(new InterfaceC12112() { // from class: l.ܺۜ᩺
                    @Override // l.InterfaceC12112
                    /* JADX INFO: renamed from: ۙ */
                    public final void mo6201() {
                        C22092.m49922(this.f53858, interfaceC5075, c14106);
                    }
                });
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x012b A[EDGE_INSN: B:78:0x012b->B:80:0x012e BREAK  A[LOOP:0: B:71:0x0111->B:194:?]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m49959(final AbstractC8036 abstractC8036, long j, AbstractC11781 abstractC11781, AbstractC8036 abstractC8037) {
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
        int i = C9961.f32016[abstractC11781.f38066.ordinal()];
        C7312 c7312 = this.f71200;
        if (i != 1) {
            C6147 c6147 = this.f71199;
            if (i == 2) {
                j2 = 512;
                j6 = 2;
                if (abstractC11781.f38072 != this.f71197.f49865) {
                    long j12 = abstractC11781.f38069.f38071;
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
                } else if ((abstractC11781.f38069.f38071 & 16384) != 0) {
                    j8 = j6;
                } else {
                    j7 = 7;
                    j8 = j7;
                    j6 = 0;
                }
                if ((j & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) != 0) {
                    InterfaceC5075 interfaceC5075M17747 = c6147.m17747((InterfaceC5075) abstractC8036);
                    try {
                        c6147.m17749(new InterfaceC12112() { // from class: l.ۧۜ᩺
                            @Override // l.InterfaceC12112
                            /* JADX INFO: renamed from: ۙ */
                            public final void mo6201() {
                                C22092.m49924(this.f35973, abstractC8036);
                            }
                        });
                        c6147.m17747(interfaceC5075M17747);
                    } catch (Throwable th) {
                        c6147.m17747(interfaceC5075M17747);
                        throw th;
                    }
                }
                if (((j | j6) & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) == 0 || (j & 8796093022208L) != 0) {
                    j9 = abstractC11781.f38069.f38071;
                } else {
                    j10 = j6;
                }
                j5 = j8;
                j4 = j10;
            } else if (i == 3) {
                boolean zM33349 = abstractC11781.f38069.f38066.m33349(C22114.f71276);
                boolean z = this.f71221;
                j6 = 8;
                if (zM33349 || (abstractC11781.m29602() && (j & 8192) != 0)) {
                    j2 = 512;
                    boolean z2 = (abstractC11781.f38072.isEmpty() || ((j & 2305843009213693952L) == 0 && (j & 16384) == 0 && (j & 512) == 0)) ? false : true;
                    j8 = (((j & 8) != 0 || z2) && z && (j & 8192) == 0) ? 24088L : 23568L;
                    if (!z2) {
                        j6 = 0;
                    }
                } else {
                    AbstractC11781 abstractC11782 = abstractC11781.f38069;
                    if (abstractC11782.f38066 == EnumC13603.f43213) {
                        j8 = ((j & 8) != 0 && z && (j & 8192) == 0) ? -4611686018427363809L : -4611686018427363817L;
                        j2 = 512;
                        if (abstractC11782.f38069.f38066 == EnumC13603.f43219 || (abstractC11782.f38071 & 8) != 0) {
                            j8 |= 8;
                        } else if (!z && ((j & 16384) != 0 || (j & 2305843009213693952L) != 0)) {
                            c7312.m34520(abstractC8036, C22843.f74052);
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
                    if (!abstractC8037.m21911(EnumC21461.f68501)) {
                        j11 = 0;
                        break;
                    }
                    C18166 c18166 = new C18166();
                    c18166.f59387 = false;
                    Iterator it = ((C7926) abstractC8037).f26344.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            j11 = 16;
                            break;
                        }
                        ((AbstractC8036) it.next()).mo2284(c18166);
                        if (c18166.f59387) {
                            if (!this.f71206) {
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
                    InterfaceC5075 interfaceC5075M17748 = c6147.m17747((InterfaceC5075) abstractC8036);
                    try {
                        c6147.m17749(new InterfaceC12112() { // from class: l.ۧۜ᩺
                            @Override // l.InterfaceC12112
                            /* JADX INFO: renamed from: ۙ */
                            public final void mo6201() {
                                C22092.m49924(this.f35973, abstractC8036);
                            }
                        });
                        c6147.m17747(interfaceC5075M17748);
                    } catch (Throwable th2) {
                        c6147.m17747(interfaceC5075M17748);
                        throw th2;
                    }
                }
                j9 = abstractC11781.f38069.f38071;
            } else {
                throw new AssertionError();
            }
            j10 = j6 | (j9 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX);
            j5 = j8;
            j4 = j10;
        } else {
            j2 = 512;
            if (!abstractC8037.m21911(EnumC21461.f68538) || ((C12510) abstractC8037).f40169 == null) {
                AbstractC11781 abstractC11783 = abstractC11781.f38069;
                if (abstractC11783.f38066 != EnumC13603.f43213) {
                    j3 = 8589934608L;
                } else if ((abstractC11783.f38071 & 512) != 0) {
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
            EnumC13603 enumC13603 = abstractC11781.f38066;
            EnumC13603 enumC13604 = EnumC13603.f43213;
            if ((enumC13603 == enumC13604 || m50023(abstractC8036, j, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS, 8796093022218L)) && m50023(abstractC8036, j, 10L, 8796093022208L) && m50023(abstractC8036, j, 1536L, 304L) && m50023(abstractC8036, j, 1L, 6L) && m50023(abstractC8036, j, 2L, 5L) && m50023(abstractC8036, j, 16L, 64L) && ((abstractC11781.f38066 == enumC13604 || m50023(abstractC8036, j, 1280L, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX)) && m50023(abstractC8036, j, 16L, -4611686018427387904L) && m50023(abstractC8036, j, SkeinEngine.UbiTweak.T1_FIRST, -9223372036854775792L))) {
                m50023(abstractC8036, j, SkeinEngine.UbiTweak.T1_FIRST, 8192L);
            }
        } else if ((j13 & j2) != 0) {
            c7312.m34520(abstractC8036, (j & 8192) != 0 ? C22843.f74100 : C22843.f74199);
            j5 |= j2;
        } else {
            EnumSet enumSetM8159 = C2417.m8159(j13);
            C11040 c11040 = C22843.f74058;
            c7312.m34520(abstractC8036, new C11040("compiler", "mod.not.allowed.here", enumSetM8159));
        }
        return (j & (4611677222334361600L | j5)) | j4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49924(C22092 c22092, AbstractC8036 abstractC8036) {
        C15400 c15400 = c22092.f71219;
        EnumC19876 enumC19876 = EnumC19876.STRICTFP;
        if (c15400.m36878(enumC19876)) {
            c22092.f71200.m34532(enumC19876, abstractC8036, C13146.f42045);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49999(AbstractC8036 abstractC8036, C3168 c3168, boolean z) {
        new C4938(this, c3168).m15145(abstractC8036, z, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50006(C14769 c14769, C3168 c3168) {
        while (c14769.m35550()) {
            m49999((AbstractC8036) c14769.f48335, c3168, true);
            c14769 = c14769.f48336;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49997(AbstractC8036 abstractC8036, C3168 c3168) {
        C6633 c6633;
        C15400 c15400 = this.f71219;
        EnumC19876 enumC19876 = EnumC19876.RAW;
        if (c15400.m36878(enumC19876) && abstractC8036.f26659.m51067(EnumC21172.CLASS) && !C11239.m28349(abstractC8036)) {
            if (!(c3168.f10279.f26346.isEmpty() && (c6633 = c3168.f10277) != null && c6633.f22150 == this.f71197.f49865) && abstractC8036.f26659.mo9328()) {
                AbstractC22664 abstractC22664 = abstractC8036.f26659;
                AbstractC22664 abstractC22665 = abstractC22664.f73596.f38067;
                C25213 c25213 = C13146.f42046;
                this.f71200.m34532(enumC19876, abstractC8036, new C25213("compiler", "raw.class.use", abstractC22664, abstractC22665));
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m50059(AbstractC22664 abstractC22664, C14769 c14769) {
        while (c14769.m35550()) {
            if (this.f71203.m55131(abstractC22664, (AbstractC22664) c14769.f48335, true)) {
                return true;
            }
            c14769 = c14769.f48336;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m50035(AbstractC22664 abstractC22664, C14769 c14769) {
        while (c14769.m35550()) {
            AbstractC22664 abstractC22665 = (AbstractC22664) c14769.f48335;
            C24705 c24705 = this.f71203;
            if (c24705.m55131(abstractC22664, abstractC22665, true) || c24705.m55131((AbstractC22664) c14769.f48335, abstractC22664, true)) {
                return true;
            }
            c14769 = c14769.f48336;
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C14769 m50043(AbstractC22664 abstractC22664, C14769 c14769) {
        return m50059(abstractC22664, c14769) ? c14769 : m49961(abstractC22664, c14769).m35552(abstractC22664);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14769 m49961(AbstractC22664 abstractC22664, C14769 c14769) {
        if (!c14769.isEmpty()) {
            C14769 c14769M49961 = m49961(abstractC22664, c14769.f48336);
            if (this.f71203.m55131((AbstractC22664) c14769.f48335, abstractC22664, true)) {
                return c14769M49961;
            }
            if (c14769M49961 != c14769.f48336) {
                return c14769M49961.m35552((AbstractC22664) c14769.f48335);
            }
        }
        return c14769;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C14769 m50039(C14769 c14769, C14769 c147610) {
        while (c147610.m35550()) {
            c14769 = m50043((AbstractC22664) c147610.f48335, c14769);
            c147610 = c147610.f48336;
        }
        return c14769;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C14769 m50042(C14769 c14769, C14769 c147610) {
        while (c147610.m35550()) {
            c14769 = m49961((AbstractC22664) c147610.f48335, c14769);
            c147610 = c147610.f48336;
        }
        return c14769;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C14769 m50029(C14769 c14769, C14769 c147610) {
        C14769 c14769M35543 = C14769.m35543();
        for (C14769 c147611 = c14769; c147611.m35550(); c147611 = c147611.f48336) {
            if (m50059((AbstractC22664) c147611.f48335, c147610)) {
                c14769M35543 = m50043((AbstractC22664) c147611.f48335, c14769M35543);
            }
        }
        while (c147610.m35550()) {
            if (m50059((AbstractC22664) c147610.f48335, c14769)) {
                c14769M35543 = m50043((AbstractC22664) c147610.f48335, c14769M35543);
            }
            c147610 = c147610.f48336;
        }
        return c14769M35543;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m50054(AbstractC22664 abstractC22664) {
        boolean zM51067 = abstractC22664.m51067(EnumC21172.TYPEVAR);
        C24705 c24705 = this.f71203;
        if (zM51067) {
            return m50054(c24705.m55137(abstractC22664));
        }
        if (abstractC22664.m51067(EnumC21172.CLASS)) {
            C24550 c24550 = (C24550) abstractC22664.f73596;
            if (c24550.f38066 == EnumC13603.f43208) {
                return true;
            }
            C14764 c14764 = this.f71193;
            return c24550.mo29596((AbstractC11781) c14764.f48301.f73596, c24705) || c24550.mo29596((AbstractC11781) c14764.f48254.f73596, c24705);
        }
        return abstractC22664.m51067(EnumC21172.BOT);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C14769 m50056(C14769 c14769, C14769 c147610) {
        C14769 c14769M35543 = C14769.m35543();
        while (c14769.m35550()) {
            AbstractC22664 abstractC22664 = (AbstractC22664) c14769.f48335;
            if (!m50054(abstractC22664) && !m50059(abstractC22664, c147610)) {
                c14769M35543 = c14769M35543.m35552((AbstractC22664) c14769.f48335);
            }
            c14769 = c14769.f48336;
        }
        return c14769M35543;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15515 m49911(C10377 c10377, C10377 c10378) {
        AbstractC11781 abstractC11781M29579 = c10377.m29579();
        AbstractC11781 abstractC11781M295710 = c10378.m29579();
        if ((c10378.f38069.mo29591() & 512) == 0) {
            C15515 c15515 = C19859.f63823;
            return new C15515("compiler", "cant.override", c10377, abstractC11781M29579, c10378, abstractC11781M295710);
        }
        if ((c10377.f38069.mo29591() & 512) == 0) {
            C15515 c15516 = C19859.f63823;
            return new C15515("compiler", "cant.implement", c10377, abstractC11781M29579, c10378, abstractC11781M295710);
        }
        C15515 c15517 = C19859.f63823;
        return new C15515("compiler", "clashes.with", c10377, abstractC11781M29579, c10378, abstractC11781M295710);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C15515 m49950(C10377 c10377, C10377 c10378) {
        AbstractC11781 abstractC11781M29579 = c10377.m29579();
        AbstractC11781 abstractC11781M295710 = c10378.m29579();
        if ((c10378.f38069.mo29591() & 512) == 0) {
            C15515 c15515 = C19859.f63823;
            return new C15515("compiler", "unchecked.override", c10377, abstractC11781M29579, c10378, abstractC11781M295710);
        }
        if ((c10377.f38069.mo29591() & 512) == 0) {
            C15515 c15516 = C19859.f63823;
            return new C15515("compiler", "unchecked.implement", c10377, abstractC11781M29579, c10378, abstractC11781M295710);
        }
        C15515 c15517 = C19859.f63823;
        return new C15515("compiler", "unchecked.clash.with", c10377, abstractC11781M29579, c10378, abstractC11781M295710);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C15515 m49942(C10377 c10377, C10377 c10378) {
        AbstractC11781 abstractC11781M29579 = c10377.m29579();
        AbstractC11781 abstractC11781M295710 = c10378.m29579();
        if ((c10378.f38069.mo29591() & 512) == 0) {
            C15515 c15515 = C19859.f63823;
            return new C15515("compiler", "varargs.override", c10377, abstractC11781M29579, c10378, abstractC11781M295710);
        }
        if ((c10377.f38069.mo29591() & 512) == 0) {
            C15515 c15516 = C19859.f63823;
            return new C15515("compiler", "varargs.implement", c10377, abstractC11781M29579, c10378, abstractC11781M295710);
        }
        C15515 c15517 = C19859.f63823;
        return new C15515("compiler", "varargs.clash.with", c10377, abstractC11781M29579, c10378, abstractC11781M295710);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m50021(InterfaceC5075 interfaceC5075, AbstractC22664 abstractC22664, AbstractC22664 abstractC22665, AbstractC22664 abstractC22666) {
        AbstractC22664 abstractC22664M55158;
        AbstractC22664 abstractC22664M55159;
        HashMap map;
        boolean z;
        AbstractC11781 abstractC11781;
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
        long jMo29591 = abstractC22666.f73596.mo29591() & 16777216;
        C24705 c24705 = this.f71203;
        long j3 = 0;
        if (jMo29591 != 0) {
            abstractC22664M55158 = c24705.m55158(abstractC22664);
            abstractC22664M55159 = c24705.m55158(abstractC22665);
        } else {
            abstractC22664M55158 = abstractC22664;
            abstractC22664M55159 = abstractC22665;
        }
        HashMap map4 = new HashMap();
        m49930(abstractC22664M55158, map4);
        if (abstractC22664M55158 == abstractC22664M55159) {
            map = map4;
        } else {
            map = new HashMap();
            m49931(abstractC22664M55159, map4, map);
        }
        Iterator it8 = map4.values().iterator();
        loop0: while (true) {
            boolean z2 = false;
            Predicate predicate = null;
            if (!it8.hasNext()) {
                z = false;
                abstractC11781 = null;
                break;
            }
            AbstractC22664 abstractC22667 = (AbstractC22664) it8.next();
            Iterator it9 = map.values().iterator();
            while (it9.hasNext()) {
                AbstractC22664 abstractC22668 = (AbstractC22664) it9.next();
                Iterator it10 = abstractC22667.f73596.mo29571().mo7472(predicate, EnumC13908.NON_RECURSIVE).iterator();
                while (true) {
                    if (!it10.hasNext()) {
                        map2 = map;
                        it = it8;
                        j = j3;
                        it2 = it9;
                        z = false;
                        abstractC11781 = null;
                        break;
                    }
                    AbstractC11781 abstractC11782 = (AbstractC11781) it10.next();
                    if (abstractC11782.f38066 == EnumC13603.f43218 && abstractC11782.mo26690((AbstractC11781) abstractC22666.f73596, c24705) && (abstractC11782.mo29591() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == j3) {
                        C10377 c10377M26687 = ((C10377) abstractC11782).m26687(abstractC22666.f73596, c24705, z2);
                        C1083 c1083 = c24705.f79958;
                        if (c10377M26687 == null || (c10377M26687.f38071 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0) {
                            Iterator it11 = abstractC22668.f73596.mo29571().m38842(abstractC11782.f38072).iterator();
                            AbstractC22664 abstractC22664M55126 = null;
                            while (true) {
                                if (it11.hasNext()) {
                                    abstractC11781 = (AbstractC11781) it11.next();
                                    if (abstractC11782 == abstractC11781) {
                                        map2 = map;
                                    } else {
                                        map2 = map;
                                        if (abstractC11781.f38066 == EnumC13603.f43218 && abstractC11781.mo26690((AbstractC11781) abstractC22666.f73596, c24705)) {
                                            j = 0;
                                            if ((abstractC11781.mo29591() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0) {
                                                if (abstractC22664M55126 == null) {
                                                    abstractC22664M55126 = c24705.m55126(abstractC11782, abstractC22667);
                                                }
                                                AbstractC22664 abstractC22664M55127 = c24705.m55126(abstractC11781, abstractC22668);
                                                boolean zM55121 = c24705.m55121(abstractC22664M55126, abstractC22664M55127);
                                                it = it8;
                                                it6 = it11;
                                                C7312 c7312 = this.f71200;
                                                if (zM55121) {
                                                    C14769 c14769Mo15882 = abstractC22664M55126.mo15882();
                                                    it7 = it10;
                                                    C14769 c14769Mo15883 = abstractC22664M55127.mo15882();
                                                    it2 = it9;
                                                    AbstractC22664 abstractC22664Mo31585 = abstractC22664M55126.mo31585();
                                                    AbstractC22664 abstractC22664M55103 = c24705.m55103(abstractC22664M55127.mo31585(), c14769Mo15883, c14769Mo15882);
                                                    if (!c24705.m55149(abstractC22664Mo31585, abstractC22664M55103) && ((abstractC22664Mo31585.mo40456() || abstractC22664M55103.mo40456() || (!c24705.m55116(abstractC22664Mo31585, abstractC22664M55103, c1083) && !c24705.m55116(abstractC22664M55103, abstractC22664Mo31585, c1083))) && !m50024(abstractC11782, abstractC11781, abstractC22666))) {
                                                        AbstractC19728 abstractC19728 = abstractC11781.f38072;
                                                        C14769 c14769Mo50621 = c24705.m55126(abstractC11781, abstractC22668).mo50621();
                                                        C15515 c15515 = C19859.f63823;
                                                        C15515 c15516 = new C15515("compiler", "incompatible.diff.ret", abstractC19728, c14769Mo50621);
                                                        C11040 c11040 = C22843.f74058;
                                                        c7312.m34520(interfaceC5075, new C11040("compiler", "types.incompatible", abstractC22667, abstractC22668, c15516));
                                                        z = false;
                                                        break;
                                                    }
                                                } else {
                                                    it7 = it10;
                                                    it2 = it9;
                                                    C9215 c9215 = new C9215(this, ((C24550) abstractC22666.f73596).f38067);
                                                    if (c9215.m24385(abstractC11782) && c9215.m24385(abstractC11781) && c24705.m55117(abstractC11782.mo29576(c24705), abstractC11781.mo29576(c24705), true) && !m50024(abstractC11782, abstractC11781, abstractC22666)) {
                                                        AbstractC19728 abstractC19729 = abstractC11782.f38072;
                                                        C14769 c14769 = c24705.m55126(abstractC11782, abstractC22666).mo15883().f75155;
                                                        AbstractC11781 abstractC11781M29579 = abstractC11782.m29579();
                                                        AbstractC19728 abstractC197210 = abstractC11781.f38072;
                                                        C14769 c147610 = c24705.m55126(abstractC11781, abstractC22666).mo15883().f75155;
                                                        AbstractC11781 abstractC11781M295710 = abstractC11781.m29579();
                                                        C11040 c11041 = C22843.f74058;
                                                        c7312.m34520(interfaceC5075, new C11040("compiler", "name.clash.same.erasure.no.override", abstractC19729, c14769, abstractC11781M29579, abstractC197210, c147610, abstractC11781M295710));
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
                if (abstractC11781 != null) {
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
        if (abstractC11781 == null) {
            return true;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m49930(AbstractC22664 abstractC22664, HashMap map) {
        if (abstractC22664.m51067(EnumC21172.CLASS) && map.put(abstractC22664.f73596, abstractC22664) == null) {
            C24705 c24705 = this.f71203;
            m49930(c24705.m55137(abstractC22664), map);
            Iterator it = c24705.m55144(abstractC22664).iterator();
            while (it.hasNext()) {
                m49930((AbstractC22664) it.next(), map);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m49931(AbstractC22664 abstractC22664, HashMap map, HashMap map2) {
        if (abstractC22664.m51067(EnumC21172.CLASS) && map.get(abstractC22664.f73596) == null && map2.put(abstractC22664.f73596, abstractC22664) == null) {
            C24705 c24705 = this.f71203;
            m49931(c24705.m55137(abstractC22664), map, map2);
            Iterator it = c24705.m55144(abstractC22664).iterator();
            while (it.hasNext()) {
                m49931((AbstractC22664) it.next(), map, map2);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m50024(AbstractC11781 abstractC11781, AbstractC11781 abstractC11782, AbstractC22664 abstractC22664) {
        HashMap map = new HashMap();
        C24705 c24705 = this.f71203;
        AbstractC22664 abstractC22664M55126 = c24705.m55126(abstractC11781, abstractC22664);
        AbstractC22664 abstractC22664M55127 = c24705.m55126(abstractC11782, abstractC22664);
        m49930(abstractC22664, map);
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            for (AbstractC11781 abstractC11783 : ((AbstractC22664) it.next()).f73596.mo29571().m38842(abstractC11781.f38072)) {
                if (abstractC11783 != abstractC11781 && abstractC11783 != abstractC11782 && abstractC11783.f38066 == EnumC13603.f43218 && (abstractC11783.mo29591() & 2147487744L) == 0) {
                    AbstractC22664 abstractC22664M55128 = c24705.m55126(abstractC11783, abstractC22664);
                    if (c24705.m55121(abstractC22664M55128, abstractC22664M55126) && c24705.m55121(abstractC22664M55128, abstractC22664M55127) && c24705.m55086(abstractC22664M55128, abstractC22664M55126) && c24705.m55086(abstractC22664M55128, abstractC22664M55127)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [l.ۙᩳۘ, l.ۛ᩶ۘ] */
    /* JADX WARN: Type inference failed for: r13v1, types: [l.ۙᩳۘ] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r5v0, types: [l.ۜᩳۘ, l.ܰ֡ۘ] */
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
    public final void m49977(C3168 c3168, final C6633 c6633, C10377 c10377) {
        C11040 c11040;
        C24550 c24550 = (C24550) c10377.f38069;
        c24550.mo29590();
        long j = c24550.f38071 & 16384;
        ?? r5 = this.f71200;
        C14764 c14764 = this.f71193;
        C24705 c24705 = this.f71203;
        if (j != 0 && this.f71197.f49756.equals(c10377.f38072) && c10377.mo26689(c14764.f48285, c24550, c24705, false)) {
            r5.m34520(c6633, C22843.f74107);
            return;
        }
        if (this.f71221 && c24550.m54827() && C1170.stream(c24550.m54835()).filter(new Predicate() { // from class: l.ᩴۜ᩺
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19025.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo7134negate() {
                return C19025.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19025.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                C10377 c10378 = ((C22224) obj).f71601;
                return c10378 == c6633.f22152 && (c10378.f38071 & 16777216) == 0;
            }
        }).findFirst().isPresent()) {
            return;
        }
        for (AbstractC22664 abstractC22664M55137 = c24550.f38067; abstractC22664M55137.m51067(EnumC21172.CLASS); abstractC22664M55137 = c24705.m55137(abstractC22664M55137)) {
            if (abstractC22664M55137 != c24550.f38067) {
                m49992((C6633) c6633, abstractC22664M55137, c24550, c10377);
            }
            Iterator it = c24705.m55144(abstractC22664M55137).iterator();
            while (it.hasNext()) {
                m49992((C6633) c6633, (AbstractC22664) it.next(), c24550, c10377);
            }
        }
        boolean z = c10377.m29565((AbstractC11781) c14764.f48300.f73596) != null;
        if (z || !(!((C7768) c3168.f10272).f25568 || c10377.m29570() || (c10377.f38071 & 7) == 2)) {
            if (c10377.f38066 == EnumC13603.f43218 && !c10377.mo7874()) {
                AbstractC22970 abstractC22970 = (AbstractC22970) c10377.f38069;
                for (AbstractC22664 abstractC22664 : c24705.m55146(abstractC22970.f38067)) {
                    if (abstractC22664 != abstractC22970.f38067) {
                        for (AbstractC11781 abstractC11781 : abstractC22664.f73596.mo29571().m38842(c10377.f38072)) {
                            if (!abstractC11781.mo7874() && c10377.mo26689(abstractC11781, abstractC22970, c24705, true)) {
                                return;
                            }
                        }
                    }
                }
            }
            for (C17621 c17621 : c6633.f22144.f15824) {
                if (c17621.f57962.f26659.f73596 == c14764.f48300.f73596) {
                    c6633 = c17621;
                    break;
                }
            }
            if (z) {
                c11040 = c10377.mo7874() ? C22843.f74116 : C22843.f74126;
            } else {
                C11040 c11041 = C22843.f74058;
                c11040 = new C11040("compiler", "anonymous.diamond.method.does.not.override.superclass", C19859.f63859);
            }
            r5.m34520(c6633, c11040);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49992(C6633 c6633, AbstractC22664 abstractC22664, C24550 c24550, C10377 c10377) {
        for (AbstractC11781 abstractC11781 : abstractC22664.f73596.mo29571().m38842(c10377.f38072)) {
            if (c10377.mo26689(abstractC11781, c24550, this.f71203, false) && (abstractC11781.mo29591() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) == 0) {
                m50000(c6633, c10377, (C10377) abstractC11781, c24550);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50001(AbstractC8036 abstractC8036, C24550 c24550) {
        C14769 c14769M55144;
        C14764 c14764 = this.f71193;
        AbstractC22664 abstractC22664 = c14764.f48286;
        AbstractC22664 abstractC22665 = c14764.f48286;
        if (c24550 == ((C24550) abstractC22664.f73596) || c24550.m29587() || c24550.m29588()) {
            return;
        }
        c24550.mo29590();
        if ((c24550.f38071 & 8192) == 0) {
            c24550.mo29590();
            if ((c24550.f38071 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0) {
                return;
            }
            boolean zIsEmpty = c24550.f38072.isEmpty();
            C24705 c24705 = this.f71203;
            if (!zIsEmpty || (c14769M55144 = c24705.m55144(c24550.f38067)) == null || c14769M55144.isEmpty() || ((AbstractC22664) c14769M55144.f48335).f73596 != c14764.f48277.f73596) {
                C15400 c15400 = this.f71219;
                EnumC19876 enumC19876 = EnumC19876.OVERRIDES;
                if (c15400.m36878(enumC19876)) {
                    AbstractC17836 abstractC17836Mo29571 = abstractC22665.f73596.mo29571();
                    C15252 c15252 = this.f71197;
                    C10377 c10377 = (C10377) abstractC17836Mo29571.mo7474(c15252.f49845, (Predicate) null);
                    C10377 c10378 = (C10377) abstractC22665.f73596.mo29571().mo7474(c15252.f49834, (Predicate) null);
                    C20404 c20404 = this.f71215;
                    C10377 c10377M55090 = c24705.m55090(c10377, (AbstractC22970) c24550, false, (Predicate) c20404);
                    boolean z = c10377M55090 != null && c10377M55090.f38069 == c24550;
                    boolean z2 = c24705.m55090(c10378, (AbstractC22970) c24550, false, (Predicate) c20404) != c10378;
                    if (!z || z2) {
                        return;
                    }
                    C25213 c25213 = C13146.f42046;
                    this.f71200.m34532(enumC19876, abstractC8036, new C25213("compiler", "override.equals.but.not.hashcode", c24550));
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
    public final void m50008(C14835 c14835) {
        AbstractC22295 abstractC22295;
        C23041 c23041;
        AbstractC19728 abstractC19728;
        AbstractC22295 abstractC22296;
        InterfaceC5075 interfaceC5075;
        C11972.m30021(c14835.f48524.f38072);
        if (this.f71219.m36878(EnumC19876.MODULE)) {
            AbstractC22295 abstractC22297 = c14835.f48522;
            while (abstractC22295 != null) {
                int i = C9961.f32015[abstractC22295.mo2285().ordinal()];
                if (i == 1) {
                    c23041 = (C23041) abstractC22295;
                    abstractC19728 = c23041.f74774;
                    abstractC22296 = c23041.f74776;
                } else if (i == 2) {
                    abstractC19728 = ((C5887) abstractC22295).f20169;
                    abstractC22296 = null;
                } else {
                    abstractC22295 = abstractC22297;
                    throw new AssertionError("Unexpected qualified identifier: " + abstractC22295.toString());
                }
                if (abstractC19728 != null) {
                    abstractC22295 = abstractC22297;
                    interfaceC5075 = c23041;
                    String string = abstractC19728.toString();
                    int length = string.length();
                    if (length <= 0 || !Character.isDigit(string.charAt(length - 1))) {
                        abstractC22295 = abstractC22297;
                        interfaceC5075 = abstractC22295;
                    } else {
                        abstractC22295 = abstractC22297;
                        interfaceC5075 = abstractC22295;
                        EnumC19876 enumC19876 = EnumC19876.MODULE;
                        C25213 c25213 = C13146.f42046;
                        this.f71200.m34532(enumC19876, interfaceC5075, new C25213("compiler", "poor.choice.for.module.name", abstractC19728));
                    }
                } else {
                    abstractC22295 = abstractC22297;
                    interfaceC5075 = c23041;
                    abstractC22295 = abstractC22297;
                    interfaceC5075 = abstractC22295;
                }
                abstractC22295 = abstractC22296;
            }
            abstractC22295 = abstractC22297;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50018(C24550 c24550, InterfaceC5075 interfaceC5075) {
        C24705 c24705 = this.f71203;
        C10377 c10377M55091 = c24705.m55091(c24550);
        if (c10377M55091 != null) {
            C10377 c10377 = new C10377(c10377M55091.f38071, c10377M55091.f38072, c24705.m55126(c10377M55091, c24550.f38067), c10377M55091.f38069);
            AbstractC11781 abstractC11781M29579 = c10377.m29579();
            C11040 c11040 = C22843.f74058;
            this.f71200.m34520(interfaceC5075, new C11040("compiler", "does.not.override.abstract", c24550, c10377, abstractC11781M29579));
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m50038(InterfaceC5075 interfaceC5075, AbstractC22664 abstractC22664) {
        m49957(interfaceC5075, abstractC22664);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50009(C16239 c16239, C17969 c17969) {
        m49917(c16239, c17969, C14769.m35543());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m49917(C16239 c16239, AbstractC22664 abstractC22664, C14769 c14769) {
        EnumC21172 enumC21172 = EnumC21172.TYPEVAR;
        if (!abstractC22664.m51067(enumC21172) || (abstractC22664.f73596.mo29591() & 268435456) == 0) {
            boolean zContains = c14769.contains(abstractC22664);
            C24705 c24705 = this.f71203;
            if (zContains) {
                ((C17969) abstractC22664).mo19991(c24705.m55139(abstractC22664));
                C11040 c11040 = C22843.f74058;
                this.f71200.m34520(c16239, new C11040("compiler", "cyclic.inheritance", abstractC22664));
            } else if (abstractC22664.m51067(enumC21172)) {
                C17969 c17969 = (C17969) abstractC22664;
                C14769 c14769M35552 = c14769.m35552(c17969);
                Iterator it = c24705.m55097(c17969).iterator();
                while (it.hasNext()) {
                    m49917(c16239, (AbstractC22664) it.next(), c14769M35552);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0089  */
    /* JADX WARN: Code duplicated, block: B:40:0x009c  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a0  */
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private boolean m49957(InterfaceC5075 interfaceC5075, AbstractC22664 abstractC22664) {
        boolean zM49957;
        AbstractC22970 abstractC22970 = abstractC22664.f73596;
        long j = abstractC22970.f38071;
        if ((j & 1073741824) != 0) {
            return true;
        }
        if ((j & 134217728) != 0) {
            m49944((C24550) abstractC22970, interfaceC5075);
        } else {
            if (!abstractC22970.f38067.mo9329()) {
                try {
                    abstractC22970.f38071 = 134217728 | abstractC22970.f38071;
                    if (abstractC22970.f38067.m51067(EnumC21172.CLASS)) {
                        C10510 c10510 = (C10510) abstractC22970.f38067;
                        C14769 c14769 = c10510.f33437;
                        zM49957 = true;
                        if (c14769 != null) {
                            while (c14769.m35550()) {
                                zM49957 &= m49957(interfaceC5075, (AbstractC22664) c14769.f48335);
                                c14769 = c14769.f48336;
                            }
                        }
                        AbstractC22664 abstractC22665 = c10510.f33442;
                        if (abstractC22665 != null && abstractC22665 != null && abstractC22665.m51067(EnumC21172.CLASS)) {
                            zM49957 &= m49957(interfaceC5075, abstractC22665);
                        }
                        AbstractC11781 abstractC11781 = abstractC22970.f38069;
                        if (abstractC11781.f38066 == EnumC13603.f43213) {
                            zM49957 &= m49957(interfaceC5075, abstractC11781.f38067);
                        }
                    } else {
                        zM49957 = true;
                    }
                    abstractC22970.f38071 = (-134217729) & abstractC22970.f38071;
                } catch (Throwable th) {
                    abstractC22970.f38071 = (-134217729) & abstractC22970.f38071;
                    throw th;
                }
            }
            if (zM49957) {
                zM49957 = (abstractC22970.f38071 & 268435456) != 0 && abstractC22970.f38070.mo11630();
            }
            if (zM49957) {
                abstractC22970.f38071 |= 1073741824;
            }
            return zM49957;
        }
        zM49957 = true;
        if (zM49957) {
            zM49957 = (abstractC22970.f38071 & 268435456) != 0 && abstractC22970.f38070.mo11630();
        }
        if (zM49957) {
            abstractC22970.f38071 |= 1073741824;
        }
        return zM49957;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void m49944(C24550 c24550, InterfaceC5075 interfaceC5075) {
        C11040 c11040 = C22843.f74058;
        this.f71200.m34520(interfaceC5075, new C11040("compiler", "cyclic.inheritance", c24550));
        AbstractC22664 abstractC22664 = c24550.f38067;
        C24705 c24705 = this.f71203;
        for (C14769 c14769M55144 = c24705.m55144(abstractC22664); c14769M55144.m35550(); c14769M55144 = c14769M55144.f48336) {
            c14769M55144.f48335 = new C12748((C24550) ((AbstractC22664) c14769M55144.f48335).f73596, AbstractC22664.f73590);
        }
        AbstractC22664 abstractC22664M55137 = c24705.m55137(c24550.f38067);
        if (abstractC22664M55137.m51067(EnumC21172.CLASS)) {
            ((C10510) c24550.f38067).f33442 = new C12748((C24550) abstractC22664M55137.f73596, AbstractC22664.f73590);
        }
        c24550.f38067 = new C12748(c24550, c24550.f38067);
        c24550.f38071 |= 1073741824;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50002(AbstractC8036 abstractC8036, C24550 c24550, C24550 c24551) {
        C10377 c10377;
        C10377 c10377M26687;
        AbstractC22664 abstractC22664 = c24551.f38067;
        C24705 c24705 = this.f71203;
        for (C14769 c14769M55146 = c24705.m55146(abstractC22664); c14769M55146.m35550(); c14769M55146 = c14769M55146.f48336) {
            C24550 c24552 = (C24550) ((AbstractC22664) c14769M55146.f48335).f73596;
            c24552.mo29590();
            if ((c24552.f38071 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0) {
                c24552.mo29590();
                for (AbstractC11781 abstractC11781 : c24552.f79576.mo7472((Predicate) null, EnumC13908.NON_RECURSIVE)) {
                    if (abstractC11781.f38066 == EnumC13603.f43218 && (abstractC11781.mo29591() & 1032) == ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS && (c10377M26687 = (c10377 = (C10377) abstractC11781).m26687(c24550, c24705, false)) != null && c10377M26687 != c10377) {
                        long jMo29591 = c10377M26687.f38069.mo29591() & 512;
                        c24550.mo29590();
                        if (jMo29591 == (512 & c24550.f38071)) {
                            m50000(abstractC8036, c10377M26687, c10377, c24550);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m50031(InterfaceC5075 interfaceC5075, AbstractC22664 abstractC22664) {
        long j;
        C24705 c24705 = this.f71203;
        C14769 c14769M55144 = c24705.m55144(abstractC22664);
        AbstractC22664 abstractC22664M55137 = c24705.m55137(abstractC22664);
        long j2 = 0;
        if (abstractC22664M55137.m51067(EnumC21172.CLASS) && (abstractC22664M55137.f73596.mo29591() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0) {
            c14769M55144 = c14769M55144.m35552(abstractC22664M55137);
        }
        for (C14769 c14769 = c14769M55144; c14769.m35550(); c14769 = c14769.f48336) {
            if (!((AbstractC22664) c14769.f48335).mo15882().isEmpty()) {
                AbstractC22664 abstractC22665 = (AbstractC22664) c14769.f48335;
                if (!m50021(interfaceC5075, abstractC22665, abstractC22665, abstractC22664)) {
                    return;
                }
            }
            for (C14769 c147610 = c14769M55144; c147610 != c14769; c147610 = c147610.f48336) {
                if (!m50021(interfaceC5075, (AbstractC22664) c14769.f48335, (AbstractC22664) c147610.f48335, abstractC22664)) {
                    return;
                }
            }
        }
        AbstractC22664 abstractC22664M55138 = c24705.m55137(abstractC22664);
        if (abstractC22664M55138.m51067(EnumC21172.CLASS)) {
            for (AbstractC22664 abstractC22664M55139 = abstractC22664M55138; abstractC22664M55139.m51067(EnumC21172.CLASS) && abstractC22664M55139.f73596.f38067.mo9330(); abstractC22664M55139 = c24705.m55137(abstractC22664M55139)) {
                for (AbstractC11781 abstractC11781 : abstractC22664M55139.f73596.mo29571().mo7472((Predicate) null, EnumC13908.NON_RECURSIVE)) {
                    if (abstractC11781.f38066 == EnumC13603.f43218) {
                        long j3 = 2147487752L;
                        if ((abstractC11781.mo29591() & 2147487752L) == j2 && abstractC11781.mo26690((AbstractC11781) abstractC22664.f73596, c24705)) {
                            boolean z = true;
                            if (((C10377) abstractC11781).m26687(abstractC22664.f73596, c24705, true) == abstractC11781) {
                                AbstractC22664 abstractC22664M55126 = c24705.m55126(abstractC11781, abstractC22664M55139);
                                int iM35551 = abstractC22664M55126.mo50621().m35551();
                                if (abstractC22664M55126 != abstractC11781.f38067) {
                                    AbstractC22664 abstractC22664M551310 = abstractC22664M55138;
                                    while (abstractC22664M551310.m51067(EnumC21172.CLASS)) {
                                        for (AbstractC11781 abstractC11782 : abstractC22664M551310.f73596.mo29571().m38842(abstractC11781.f38072)) {
                                            if (abstractC11782 == abstractC11781) {
                                                j = j3;
                                            } else if (abstractC11782.f38066 == EnumC13603.f43218) {
                                                j = 2147487752L;
                                                if ((abstractC11782.mo29591() & 2147487752L) == 0 && abstractC11782.f38067.mo50621().m35551() == iM35551 && abstractC11782.mo26690((AbstractC11781) abstractC22664.f73596, c24705) && ((C10377) abstractC11782).m26687(abstractC22664.f73596, c24705, z) == abstractC11782) {
                                                    if (c24705.m55121(abstractC22664M55126, c24705.m55126(abstractC11782, abstractC22664M551310))) {
                                                        C11040 c11040 = C22843.f74058;
                                                        Object[] objArr = new Object[5];
                                                        objArr[0] = abstractC11781;
                                                        objArr[z ? 1 : 0] = abstractC22664M55139;
                                                        objArr[2] = abstractC11782;
                                                        objArr[3] = abstractC22664M551310;
                                                        objArr[4] = abstractC22664M55138;
                                                        this.f71200.m34520(interfaceC5075, new C11040("compiler", "concrete.inheritance.conflict", objArr));
                                                    }
                                                    z = true;
                                                }
                                            } else {
                                                j = 2147487752L;
                                            }
                                            j3 = j;
                                        }
                                        abstractC22664M551310 = c24705.m55137(abstractC22664M551310);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m50049(C6633 c6633, AbstractC22664 abstractC22664, C10377 c10377) {
        C9215 c9215 = new C9215(this, abstractC22664);
        C14769 c14769M35543 = C14769.m35543();
        ArrayList<AbstractC11781> arrayList = new ArrayList();
        C24705 c24705 = this.f71203;
        boolean z = false;
        C4937.forEach(c24705.m55106(abstractC22664, false).mo7473(c10377.f38072, c9215, EnumC13908.RECURSIVE), new C12945(0 == true ? 1 : 0, arrayList));
        boolean z2 = false;
        for (AbstractC11781 abstractC11781 : arrayList) {
            if (c10377.mo26689(abstractC11781, abstractC22664.f73596, c24705, z)) {
                if (abstractC11781 != c10377) {
                    c14769M35543 = C14769.m35543();
                    z2 = true;
                }
                for (AbstractC11781 abstractC11782 : arrayList) {
                    if (abstractC11782 != abstractC11781) {
                        if (!c24705.m55165(c10377.f38067, c24705.m55126(abstractC11782, abstractC22664), EnumC3666.f12574.m11915(this.f71217)) && c24705.m55117(abstractC11782.mo29576(c24705), abstractC11781.mo29576(c24705), true)) {
                            c10377.f38071 |= 4398046511104L;
                            C7312 c7312 = this.f71200;
                            if (abstractC11781 == c10377) {
                                AbstractC19728 abstractC19728 = abstractC11781.f38072;
                                C14769 c14769 = c24705.m55126(abstractC11781, abstractC22664).mo15883().f75155;
                                AbstractC11781 abstractC11781M29579 = abstractC11781.m29579();
                                AbstractC19728 abstractC19729 = abstractC11782.f38072;
                                C14769 c147610 = c24705.m55126(abstractC11782, abstractC22664).mo15883().f75155;
                                AbstractC11781 abstractC11781M295710 = abstractC11782.m29579();
                                C11040 c11040 = C22843.f74058;
                                c7312.m34520(c6633, new C11040("compiler", "name.clash.same.erasure.no.override", abstractC19728, c14769, abstractC11781M29579, abstractC19729, c147610, abstractC11781M295710));
                                return;
                            }
                            C10510 c10510 = (C10510) abstractC22664;
                            String str = c10510.mo31586() ? "interface" : Name.LABEL;
                            AbstractC19728 abstractC197210 = c10510.f73596.f38072;
                            AbstractC19728 abstractC197211 = abstractC11781.f38072;
                            C14769 c147611 = c24705.m55126(abstractC11781, abstractC22664).mo15883().f75155;
                            AbstractC11781 abstractC11781M295711 = abstractC11781.m29579();
                            AbstractC19728 abstractC197212 = abstractC11782.f38072;
                            C14769 c147612 = c24705.m55126(abstractC11782, abstractC22664).mo15883().f75155;
                            AbstractC11781 abstractC11781M295712 = abstractC11782.m29579();
                            C11040 c11041 = C22843.f74058;
                            c7312.m34520(c6633, new C11040("compiler", "name.clash.same.erasure.no.override.1", str, abstractC197210, abstractC197211, c147611, abstractC11781M295711, abstractC197212, c147612, abstractC11781M295712));
                            return;
                        }
                        z = false;
                    }
                }
            } else if (abstractC11781 != c10377 && !z2) {
                c14769M35543 = c14769M35543.m35552((C10377) abstractC11781);
            }
        }
        if (z2) {
            return;
        }
        Iterator it = c14769M35543.iterator();
        while (it.hasNext()) {
            m49991(c6633, abstractC22664, c10377, (C10377) it.next());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49990(C6633 c6633, AbstractC22664 abstractC22664, C10377 c10377) {
        C9215 c9215 = new C9215(this, abstractC22664);
        C24705 c24705 = this.f71203;
        for (AbstractC11781 abstractC11781 : c24705.m55106(abstractC22664, true).mo7473(c10377.f38072, c9215, EnumC13908.RECURSIVE)) {
            if (!c24705.m55165(c10377.f38067, c24705.m55126(abstractC11781, abstractC22664), EnumC3666.f12574.m11915(this.f71217))) {
                if (c24705.m55117(abstractC11781.mo29576(c24705), c10377.mo29576(c24705), true)) {
                    AbstractC11781 abstractC11781M29579 = c10377.m29579();
                    AbstractC11781 abstractC11781M295710 = abstractC11781.m29579();
                    C11040 c11040 = C22843.f74058;
                    this.f71200.m34520(c6633, new C11040("compiler", "name.clash.same.erasure.no.hide", c10377, abstractC11781M29579, abstractC11781, abstractC11781M295710));
                    return;
                }
                m49991(c6633, abstractC22664, c10377, (C10377) abstractC11781);
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m50040(InterfaceC5075 interfaceC5075, AbstractC22664 abstractC22664) {
        char c;
        AbstractC11781 abstractC11781;
        C15515 c15515;
        C6979 c6979 = new C6979(this, abstractC22664);
        C24705 c24705 = this.f71203;
        for (AbstractC11781 abstractC11782 : c24705.m55106(abstractC22664, false).mo7472(c6979, EnumC13908.RECURSIVE)) {
            int i = 1;
            C11972.m30026(abstractC11782.f38066 == EnumC13603.f43218);
            C14769 c14769M55098 = c24705.m55098(abstractC22664, (C10377) abstractC11782);
            if (c14769M55098.m35551() > 1) {
                C18499 c18499 = new C18499();
                C18499 c184910 = new C18499();
                Iterator it = c14769M55098.iterator();
                while (true) {
                    if (it.hasNext()) {
                        C10377 c10377 = (C10377) it.next();
                        long j = c10377.f38071;
                        if ((8796093022208L & j) != 0) {
                            c184910.m43089(c10377);
                        } else if ((j & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0) {
                            c18499.m43089(c10377);
                        }
                        if (c184910.m43096() && c18499.size() + c184910.size() >= 2) {
                            AbstractC11781 abstractC11783 = (AbstractC11781) c184910.first();
                            if (c184910.size() > i) {
                                abstractC11781 = (AbstractC11781) c184910.m43093().f48336.f48335;
                                EnumC4960 enumC4960M27726 = C10925.m27726(abstractC22664.f73596);
                                AbstractC19728 abstractC19728 = abstractC11782.f38072;
                                C14769 c14769Mo50621 = c24705.m55126(abstractC11782, abstractC22664).mo50621();
                                AbstractC11781 abstractC11781M29579 = abstractC11783.m29579();
                                AbstractC11781 abstractC11781M295710 = abstractC11781.m29579();
                                C15515 c15516 = C19859.f63823;
                                c = 1;
                                c15515 = new C15515("compiler", "incompatible.unrelated.defaults", enumC4960M27726, abstractC22664, abstractC19728, c14769Mo50621, abstractC11781M29579, abstractC11781M295710);
                            } else {
                                c = 1;
                                abstractC11781 = (AbstractC11781) c18499.first();
                                EnumC4960 enumC4960M27727 = C10925.m27726(abstractC22664.f73596);
                                AbstractC19728 abstractC19729 = abstractC11782.f38072;
                                C14769 c14769Mo50622 = c24705.m55126(abstractC11782, abstractC22664).mo50621();
                                AbstractC11781 abstractC11781M295711 = abstractC11783.m29579();
                                AbstractC11781 abstractC11781M295712 = abstractC11781.m29579();
                                C15515 c15517 = C19859.f63823;
                                c15515 = new C15515("compiler", "incompatible.abstract.default", enumC4960M27727, abstractC22664, abstractC19729, c14769Mo50622, abstractC11781M295711, abstractC11781M295712);
                            }
                            AbstractC22664 abstractC22665 = abstractC11783.m29579().f38067;
                            AbstractC22664 abstractC22666 = abstractC11781.m29579().f38067;
                            C11040 c11040 = C22843.f74058;
                            Object[] objArr = new Object[3];
                            objArr[0] = abstractC22665;
                            objArr[c] = abstractC22666;
                            objArr[2] = c15515;
                            this.f71200.m34520(interfaceC5075, new C11040("compiler", "types.incompatible", objArr));
                            break;
                        }
                        i = 1;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49991(C6633 c6633, AbstractC22664 abstractC22664, C10377 c10377, C10377 c10378) {
        if (c10377 != c10378 && EnumC3666.f12542.m11915(this.f71217) && this.f71219.m36878(EnumC19876.OVERLOADS) && (c10377.f38071 & 281474976710656L) == 0 && (c10378.f38071 & 281474976710656L) == 0) {
            C24705 c24705 = this.f71203;
            AbstractC22664 abstractC22664M55126 = c24705.m55126(c10377, abstractC22664);
            AbstractC22664 abstractC22664M55127 = c24705.m55126(c10378, abstractC22664);
            EnumC21172 enumC21172 = EnumC21172.FORALL;
            if (abstractC22664M55126.m51067(enumC21172) && abstractC22664M55127.m51067(enumC21172)) {
                C5291 c5291 = (C5291) abstractC22664M55126;
                C5291 c5292 = (C5291) abstractC22664M55127;
                if (c24705.m55112(c5291, c5292)) {
                    abstractC22664M55127 = c24705.m55103(abstractC22664M55127, c5292.f18620, c5291.f18620);
                }
            }
            int iMax = Math.max(abstractC22664M55126.mo50621().m35551(), abstractC22664M55127.mo50621().m35551());
            C14769 c14769Mo50621 = abstractC22664M55126.mo50621();
            C22010 c22010 = this.f71202;
            C14769 c14769M49783 = c22010.m49783(c14769Mo50621, (AbstractC11781) c10377, iMax, true);
            C14769 c14769M49784 = c22010.m49783(abstractC22664M55127.mo50621(), (AbstractC11781) c10378, iMax, true);
            if (c14769M49783.m35551() != c14769M49784.m35551()) {
                return;
            }
            boolean z = false;
            while (c14769M49783.m35550() && c14769M49784.m35550()) {
                AbstractC22664 abstractC22665 = (AbstractC22664) c14769M49783.f48335;
                AbstractC22664 abstractC22666 = (AbstractC22664) c14769M49784.f48335;
                if (!c24705.m55131(abstractC22666, abstractC22665, true) && !c24705.m55131(abstractC22665, abstractC22666, true)) {
                    if (!c24705.m55087(abstractC22665) || !c24705.m55087(abstractC22666) || c24705.m55143(abstractC22665).mo50621().m35551() <= 0 || c24705.m55143(abstractC22665).mo50621().m35551() != c24705.m55143(abstractC22666).mo50621().m35551()) {
                        return;
                    } else {
                        z = true;
                    }
                }
                c14769M49783 = c14769M49783.f48336;
                c14769M49784 = c14769M49784.f48336;
            }
            if (z) {
                c10377.f38071 |= 281474976710656L;
                c10378.f38071 |= 281474976710656L;
                EnumC19876 enumC19876 = EnumC19876.OVERLOADS;
                AbstractC11781 abstractC11781M29579 = c10377.m29579();
                AbstractC11781 abstractC11781M295710 = c10378.m29579();
                C25213 c25213 = C13146.f42046;
                this.f71200.m34532(enumC19876, c6633, new C25213("compiler", "potentially.ambiguous.overload", c10377, abstractC11781M29579, c10378, abstractC11781M295710));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50014(AbstractC22295 abstractC22295, boolean z) {
        if (!this.f71210) {
            C15400 c15400 = this.f71219;
            EnumC19876 enumC19876 = EnumC19876.SERIAL;
            if (!c15400.m36878(enumC19876) || this.f71219.m36879(enumC19876) || !z) {
                return;
            }
        }
        AbstractC11781 abstractC11781M28352 = C11239.m28352(abstractC22295);
        if (abstractC11781M28352.f38066.m33349(C22114.f71276)) {
            if (abstractC11781M28352.f38066 == EnumC13603.f43205) {
                if ((abstractC11781M28352.mo29591() & 8589934592L) != 0 || abstractC11781M28352.m29602()) {
                    return;
                }
                AbstractC19728 abstractC19728 = abstractC11781M28352.f38072;
                C15252 c15252 = this.f71197;
                if (abstractC19728 == c15252.f49836 || abstractC19728 == c15252.f49851) {
                    return;
                }
            }
            AbstractC22664 abstractC22664 = abstractC11781M28352.f38069.f38067;
            C14764 c14764 = this.f71193;
            if (this.f71203.m55131(abstractC22664, c14764.f48313, true) || abstractC11781M28352.m29564() == c14764.f48284) {
                return;
            }
            for (AbstractC11781 abstractC11781 = abstractC11781M28352; abstractC11781.f38066 != EnumC13603.f43219; abstractC11781 = abstractC11781.f38069) {
                if ((abstractC11781.mo29591() & 1) == 0) {
                    C7312 c7312 = this.f71200;
                    if (!z) {
                        C25213 c25213 = C13146.f42046;
                        c7312.m34531(abstractC22295, new C25213("compiler", "access.to.member.from.serializable.element", abstractC11781M28352));
                        return;
                    }
                    String string = abstractC11781M28352.m29564().f44619.toString();
                    if (string.startsWith("java.") || string.startsWith("javax.") || string.startsWith("sun.") || string.contains(".internal.")) {
                        EnumC19876 enumC19877 = EnumC19876.SERIAL;
                        C25213 c25214 = C13146.f42046;
                        c7312.m34532(enumC19877, abstractC22295, new C25213("compiler", "access.to.member.from.serializable.lambda", abstractC11781M28352));
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49979(InterfaceC5075 interfaceC5075, HashMap map, AbstractC22664 abstractC22664) {
        if (abstractC22664.mo9329()) {
            return;
        }
        C24705 c24705 = this.f71203;
        for (C14769 c14769M55144 = c24705.m55144(abstractC22664); c14769M55144.m35550(); c14769M55144 = c14769M55144.f48336) {
            AbstractC22664 abstractC22665 = (AbstractC22664) c14769M55144.f48335;
            EnumC21172 enumC21172 = EnumC21172.CLASS;
            if (!abstractC22664.m51067(enumC21172) || abstractC22665.m51067(enumC21172)) {
                AbstractC22664 abstractC22666 = (AbstractC22664) map.put(abstractC22665.f73596, abstractC22665);
                if (abstractC22666 != null) {
                    C14769 c14769Mo9323 = abstractC22666.mo9323();
                    C14769 c14769Mo9324 = abstractC22665.mo9323();
                    if (!c24705.m55162(c14769Mo9323, c14769Mo9324)) {
                        AbstractC22970 abstractC22970 = abstractC22665.f73596;
                        String strM51063 = AbstractC22664.m51063(c14769Mo9323);
                        String strM51064 = AbstractC22664.m51063(c14769Mo9324);
                        C11040 c11040 = C22843.f74058;
                        this.f71200.m34520(interfaceC5075, new C11040("compiler", "cant.inherit.diff.arg", abstractC22970, strM51063, strM51064));
                    }
                }
                m49979(interfaceC5075, map, abstractC22665);
            }
        }
        AbstractC22664 abstractC22664M55137 = c24705.m55137(abstractC22664);
        EnumC21172 enumC21173 = EnumC21172.CLASS;
        if ((!abstractC22664.m51067(enumC21173) || abstractC22664M55137.m51067(enumC21173)) && abstractC22664M55137 != AbstractC22664.f73590) {
            m49979(interfaceC5075, map, abstractC22664M55137);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50013(AbstractC22295 abstractC22295, AbstractC22664 abstractC22664, HashSet hashSet) {
        if (hashSet.contains(abstractC22664)) {
            this.f71200.m34520(abstractC22295, C22843.f74138);
        } else {
            hashSet.add(abstractC22664);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m50036(InterfaceC5075 interfaceC5075, AbstractC22664 abstractC22664) {
        if (abstractC22664.mo40452()) {
            return;
        }
        C14764 c14764 = this.f71193;
        AbstractC22664 abstractC22665 = c14764.f48282;
        C24705 c24705 = this.f71203;
        if (!c24705.m55149(abstractC22664, abstractC22665) && (abstractC22664.f73596.mo29591() & 16384) == 0 && (abstractC22664.f73596.mo29591() & 8192) == 0 && C24705.m55078(abstractC22664).f73596 != c14764.f48317.f73596) {
            if (c24705.m55142(abstractC22664) && !c24705.m55142(c24705.m55120(abstractC22664))) {
                m50036(interfaceC5075, c24705.m55120(abstractC22664));
            } else {
                this.f71200.m34520(interfaceC5075, C22843.f74051);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49988(C6633 c6633, C10377 c10377) {
        C24705 c24705;
        AbstractC22664 abstractC22664M55137 = this.f71193.f48311;
        while (abstractC22664M55137.m51067(EnumC21172.CLASS)) {
            Iterator it = abstractC22664M55137.f73596.mo29571().m38842(c10377.f38072).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c24705 = this.f71203;
                if (zHasNext) {
                    AbstractC11781 abstractC11781 = (AbstractC11781) it.next();
                    if (abstractC11781.f38066 == EnumC13603.f43218 && (abstractC11781.mo29591() & 5) != 0 && c24705.m55121(c10377.f38067, abstractC11781.f38067)) {
                        C11040 c11040 = C22843.f74058;
                        this.f71200.m34520(c6633, new C11040("compiler", "intf.annotation.member.clash", abstractC11781, abstractC22664M55137));
                    }
                }
            }
            abstractC22664M55137 = c24705.m55137(abstractC22664M55137);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50004(AbstractC11781 abstractC11781, AbstractC8036 abstractC8036, C14769 c14769) {
        char c;
        Iterator it = c14769.iterator();
        while (it.hasNext()) {
            C17621 c17621 = (C17621) it.next();
            c17621.mo2284(new C21150(this));
            boolean z = (abstractC11781.f38071 & 2305843009213693952L) != 0 || (abstractC11781.m29558() != null && abstractC11781.m29558().m54827());
            boolean z2 = (2305843009213693952L & abstractC11781.f38071) != 0 && abstractC8036.m21911(EnumC21461.f68538) && abstractC11781.f38069.f38066 == EnumC13603.f43213;
            C15252 c15252 = this.f71197;
            C7312 c7312 = this.f71200;
            if (z2) {
                AbstractC19728[] abstractC19728ArrM50055 = m50055(c17621.f57962.f26659.f73596);
                int length = abstractC19728ArrM50055.length;
                boolean z3 = false;
                for (int i = 0; i < length; i++) {
                    AbstractC19728 abstractC19728 = abstractC19728ArrM50055[i];
                    z3 = abstractC19728 == c15252.f49804 || abstractC19728 == c15252.f49780 || abstractC19728 == c15252.f49835 || abstractC19728 == c15252.f49777 || abstractC19728 == c15252.f49769;
                    if (z3) {
                        break;
                    }
                }
                c = 0;
                if (!z3) {
                    c7312.m34520(c17621, C22843.f74189);
                } else {
                    C22224 c22224M54828 = ((C24550) abstractC11781.f38069).m54828((C5816) abstractC11781);
                    C25208 c25208M29572 = c22224M54828.m29572();
                    if (c25208M29572 == null || c25208M29572.m56202()) {
                        c22224M54828.m29566((C14769) C1170.stream(abstractC11781.mo29568()).filter(new Predicate() { // from class: l.᩸ۜ᩺
                            @Override // java.util.function.Predicate
                            public /* synthetic */ Predicate and(Predicate predicate) {
                                return C19025.$default$and(this, predicate);
                            }

                            @Override // java.util.function.Predicate
                            /* JADX INFO: renamed from: negate */
                            public /* synthetic */ Predicate mo7134negate() {
                                return C19025.$default$negate(this);
                            }

                            public /* synthetic */ Predicate or(Predicate predicate) {
                                return C19025.$default$or(this, predicate);
                            }

                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj) {
                                return C22092.m49938(this.f73550, (C23892) obj);
                            }
                        }).collect(C14769.m35544()));
                    }
                }
            } else {
                c = 0;
            }
            boolean zMo51844 = c17621.f26659.f73596.mo51844();
            C14764 c14764 = this.f71193;
            if (zMo51844) {
                C15867 c15867M49963 = m49963(c17621, abstractC11781);
                if (!c15867M49963.isEmpty()) {
                    Set set = (Set) c15867M49963.get();
                    boolean z4 = set.isEmpty() || (set.size() == 1 && set.contains(c15252.f49777));
                    boolean z5 = z && (abstractC11781.f38071 & 16777216) != 0;
                    boolean z6 = z5 && z4;
                    if (set.isEmpty() || z6) {
                        if (z6) {
                            C4395 c4395M28317 = C11239.m28317(abstractC8036);
                            if (c4395M28317 != null && set.isEmpty()) {
                                C18499 c18499 = new C18499();
                                for (C17621 c17622 : c4395M28317.f15824) {
                                    if (c17622 != c17621) {
                                        c18499.m43089(c17622);
                                    }
                                }
                                c4395M28317.f15824 = c18499.m43093();
                            }
                            abstractC11781.m29572().m56191(c17621.f57963);
                        } else {
                            c7312.m34520(c17621, C22843.f74189);
                        }
                    }
                    if (z5 && !z2 && c17621.f26659.f73596 == c14764.f48295.f73596 && abstractC8036.m21911(EnumC21461.f68505)) {
                        AbstractC22970 abstractC22970 = c14764.f48295.f73596;
                        C15515 c15515 = C19859.f63823;
                        Object[] objArr = new Object[1];
                        objArr[c] = abstractC11781;
                        C15515 c15516 = new C15515("compiler", "varargs.trustme.on.non.varargs.accessor", objArr);
                        C11040 c11040 = C22843.f74058;
                        Object[] objArr2 = new Object[2];
                        objArr2[c] = abstractC22970;
                        objArr2[1] = c15516;
                        c7312.m34520(c17621, new C11040("compiler", "varargs.invalid.trustme.anno", objArr2));
                    }
                }
            }
            if (c17621.f57962.f26659.f73596 == c14764.f48267.f73596) {
                if (abstractC11781.f38066 != EnumC13603.f43213) {
                    c7312.m34520(c17621, C22843.f74047);
                } else if (!abstractC11781.m29587() || (abstractC11781.mo29591() & 8192) != 0) {
                    C15515 c15517 = C19859.f63823;
                    Object[] objArr3 = new Object[1];
                    objArr3[c] = abstractC11781;
                    C15515 c15518 = new C15515("compiler", "not.a.functional.intf", objArr3);
                    C11040 c11041 = C22843.f74058;
                    Object[] objArr4 = new Object[1];
                    objArr4[c] = c15518;
                    c7312.m34520(c17621, new C11040("compiler", "bad.functional.intf.anno.1", objArr4));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m49937(C22092 c22092, AbstractC19728 abstractC19728) {
        return abstractC19728 == c22092.f71197.f49769;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m50051(C17621 c17621, boolean z) {
        C11972.m30021(c17621.f26659);
        c17621.mo2284(new C21150(this));
        if (!c17621.m21911(EnumC21461.f68474) || c17621.f57962.f26659.mo9329() || m50026(c17621, z)) {
            return;
        }
        AbstractC22664 abstractC22664 = c17621.f26659;
        C11040 c11040 = C22843.f74058;
        this.f71200.m34520(c17621, new C11040("compiler", "annotation.type.not.applicable.to.type", abstractC22664));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50019(C24550 c24550, C23892 c23892, C17621 c17621) {
        AbstractC22664 abstractC22664;
        Set setM49954;
        Set setM49955;
        C15252 c15252;
        AbstractC22664 abstractC22665 = c23892.f69124;
        C14764 c14764 = this.f71193;
        AbstractC22664 abstractC22666 = c14764.f48266;
        AbstractC22664 abstractC22667 = c14764.f48261;
        AbstractC22664 abstractC22668 = c14764.f48320;
        C24705 c24705 = this.f71203;
        C11972.m30026(c24705.m55149(abstractC22665, abstractC22666));
        C14769 c14769 = c23892.f77372;
        boolean zIsEmpty = c14769.isEmpty();
        C15252 c15253 = this.f71197;
        if (zIsEmpty) {
            abstractC22664 = null;
        } else {
            C11972.m30026(((C10377) ((C5558) c14769.f48335).f19300).f38072 == c15253.f49766);
            abstractC22664 = ((C16432) ((C5558) c14769.f48335).f19301).f53314;
        }
        if (abstractC22664 == null) {
            return;
        }
        AbstractC22970 abstractC22970 = abstractC22664.f73596;
        AbstractC11781 abstractC11781Mo7474 = abstractC22970.mo29571().mo7474(c15253.f49766, (Predicate) null);
        C7312 c7312 = this.f71200;
        if (abstractC11781Mo7474 != null && abstractC11781Mo7474.f38066 == EnumC13603.f43218) {
            AbstractC22664 abstractC22664Mo31585 = ((C10377) abstractC11781Mo7474).f38067.mo31585();
            if (!abstractC22664Mo31585.m51067(EnumC21172.ARRAY) || !c24705.m55149(((C2832) abstractC22664Mo31585).f9333, c24550.f38067)) {
                C2832 c2832M55122 = c24705.m55122(c24550.f38067);
                C11040 c11040 = C22843.f74058;
                c7312.m34520(c17621, new C11040("compiler", "invalid.repeatable.annotation.value.return", abstractC22970, abstractC22664Mo31585, c2832M55122));
            }
        } else {
            C11040 c11041 = C22843.f74058;
            c7312.m34520(c17621, new C11040("compiler", "invalid.repeatable.annotation.no.value", abstractC22970));
        }
        AbstractC22970 abstractC22971 = abstractC22664.f73596;
        EnumC6738 enumC6738M55153 = c24705.m55153(abstractC22971);
        EnumC6738 enumC6738M55154 = c24705.m55153((AbstractC22970) c24550);
        int i = C9961.f32012[enumC6738M55154.ordinal()];
        if (i == 1 ? enumC6738M55153 != EnumC6738.RUNTIME : !(i != 2 || enumC6738M55153 != EnumC6738.SOURCE)) {
            String strName = enumC6738M55153.name();
            String strName2 = enumC6738M55154.name();
            C11040 c11042 = C22843.f74058;
            c7312.m34520(c17621, new C11040("compiler", "invalid.repeatable.annotation.retention", abstractC22971, strName, c24550, strName2));
        }
        AbstractC22970 abstractC22972 = abstractC22664.f73596;
        if (c24550.m29565(abstractC22668.f73596) != null && abstractC22972.m29565(abstractC22668.f73596) == null) {
            C11040 c11043 = C22843.f74058;
            c7312.m34520(c17621, new C11040("compiler", "invalid.repeatable.annotation.not.documented", abstractC22972, c24550));
        }
        AbstractC22970 abstractC22973 = abstractC22664.f73596;
        if (c24550.m29565(abstractC22667.f73596) != null && abstractC22973.m29565(abstractC22667.f73596) == null) {
            C11040 c11044 = C22843.f74058;
            c7312.m34520(c17621, new C11040("compiler", "invalid.repeatable.annotation.not.inherited", abstractC22973, c24550));
        }
        AbstractC22970 abstractC22974 = abstractC22664.f73596;
        C17924 c17924M49964 = m49964(abstractC22974);
        if (c17924M49964 == null) {
            setM49954 = m49954();
        } else {
            HashSet hashSet = new HashSet();
            for (AbstractC21654 abstractC21654 : c17924M49964.f58709) {
                if (abstractC21654 instanceof C20908) {
                    hashSet.add(((C20908) abstractC21654).f66917.f38072);
                }
            }
            setM49954 = hashSet;
        }
        C17924 c17924M49965 = m49964((AbstractC22970) c24550);
        if (c17924M49965 == null) {
            setM49955 = m49954();
        } else {
            HashSet hashSet2 = new HashSet();
            for (AbstractC21654 abstractC21655 : c17924M49965.f58709) {
                if (abstractC21655 instanceof C20908) {
                    hashSet2.add(((C20908) abstractC21655).f66917.f38072);
                }
            }
            setM49955 = hashSet2;
        }
        Iterator it = setM49954.iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                c15252 = c15253;
                break;
            }
            AbstractC19728 abstractC19728 = (AbstractC19728) it.next();
            Iterator it2 = setM49955.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    c15252 = c15253;
                    C11040 c11045 = C22843.f74058;
                    c7312.m34520(c17621, new C11040("compiler", "invalid.repeatable.annotation.incompatible.target", abstractC22974, c24550));
                    break loop0;
                }
                AbstractC19728 abstractC19729 = (AbstractC19728) it2.next();
                if (abstractC19729 == abstractC19728) {
                    break;
                }
                C15252 c15254 = c15253;
                AbstractC19728 abstractC197210 = c15254.f49847;
                AbstractC19728 abstractC197211 = c15254.f49768;
                if (abstractC19729 == abstractC197210 && abstractC19728 == abstractC197211) {
                    c15253 = c15254;
                    break;
                }
                if (abstractC19729 == c15254.f49777 && (abstractC19728 == abstractC197210 || abstractC19728 == abstractC197211 || abstractC19728 == c15254.f49805)) {
                    c15253 = c15254;
                    break;
                }
                c15253 = c15254;
            }
        }
        AbstractC22970 abstractC22975 = abstractC22664.f73596;
        AbstractC17836 abstractC17836Mo29571 = abstractC22975.mo29571();
        abstractC17836Mo29571.getClass();
        for (AbstractC11781 abstractC11781 : abstractC17836Mo29571.mo7472((Predicate) null, EnumC13908.RECURSIVE)) {
            if (abstractC11781.f38072 != c15252.f49766 && abstractC11781.f38066 == EnumC13603.f43218 && ((C10377) abstractC11781).f33011 == null) {
                C11040 c11046 = C22843.f74058;
                c7312.m34520(c17621, new C11040("compiler", "invalid.repeatable.annotation.elem.nondefault", abstractC22975, abstractC11781));
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private Set m49954() {
        if (this.f71212 == null) {
            AbstractC19728[] abstractC19728ArrM49946 = m49946();
            HashSet hashSet = new HashSet(abstractC19728ArrM49946.length);
            for (AbstractC19728 abstractC19728 : abstractC19728ArrM49946) {
                C17359.requireNonNull(abstractC19728);
                if (!hashSet.add(abstractC19728)) {
                    throw new IllegalArgumentException("duplicate element: " + ((Object) abstractC19728));
                }
            }
            this.f71212 = C4681.unmodifiableSet(hashSet);
        }
        return this.f71212;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m50026(C17621 c17621, final boolean z) {
        C14769 c14769M30494 = this.f71195.m30494(c17621.f57962.f26659.f73596);
        if (c14769M30494 == null) {
            return false;
        }
        return C1170.stream(c14769M30494).anyMatch(new Predicate() { // from class: l.ۤۜ᩺
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19025.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo7134negate() {
                return C19025.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19025.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C22092.m49939(this.f33999, z, (AbstractC21654) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m49939(C22092 c22092, boolean z, AbstractC21654 abstractC21654) {
        AbstractC19728 abstractC19728 = ((C20908) abstractC21654).f66917.f38072;
        C15252 c15252 = c22092.f71197;
        if (abstractC19728 != c15252.f49777) {
            return z && abstractC19728 == c15252.f49805;
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC19728[] m50055(AbstractC22970 abstractC22970) {
        C17924 c17924M49964 = m49964(abstractC22970);
        if (c17924M49964 != null) {
            AbstractC21654[] abstractC21654Arr = c17924M49964.f58709;
            AbstractC19728[] abstractC19728Arr = new AbstractC19728[abstractC21654Arr.length];
            for (int i = 0; i < abstractC21654Arr.length; i++) {
                AbstractC21654 abstractC21654 = abstractC21654Arr[i];
                if (!(abstractC21654 instanceof C20908)) {
                    return new AbstractC19728[0];
                }
                abstractC19728Arr[i] = ((C20908) abstractC21654).f66917.f38072;
            }
            return abstractC19728Arr;
        }
        return m49946();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15867 m49963(C17621 c17621, AbstractC11781 abstractC11781) {
        AbstractC19728[] abstractC19728ArrM49946;
        EnumC13603 enumC13603;
        EnumC13603 enumC13604;
        C22092 c22092 = this;
        C17924 c17924M49964 = c22092.m49964(c17621.f57962.f26659.f73596);
        HashSet hashSet = new HashSet();
        int i = 0;
        if (c17924M49964 != null) {
            AbstractC21654[] abstractC21654Arr = c17924M49964.f58709;
            AbstractC19728[] abstractC19728Arr = new AbstractC19728[abstractC21654Arr.length];
            for (int i2 = 0; i2 < abstractC21654Arr.length; i2++) {
                AbstractC21654 abstractC21654 = abstractC21654Arr[i2];
                if (!(abstractC21654 instanceof C20908)) {
                    return C15867.empty();
                }
                abstractC19728Arr[i2] = ((C20908) abstractC21654).f66917.f38072;
            }
            abstractC19728ArrM49946 = abstractC19728Arr;
        } else {
            abstractC19728ArrM49946 = m49946();
        }
        int length = abstractC19728ArrM49946.length;
        while (i < length) {
            AbstractC19728 abstractC19728 = abstractC19728ArrM49946[i];
            C15252 c15252 = c22092.f71197;
            AbstractC19728 abstractC19729 = c15252.f49847;
            AbstractC19728 abstractC197210 = c15252.f49805;
            AbstractC19728 abstractC197211 = c15252.f49777;
            AbstractC19728 abstractC197212 = c15252.f49768;
            AbstractC19728 abstractC197213 = c15252.f49866;
            AbstractC19728 abstractC197214 = c15252.f49753;
            AbstractC19728 abstractC197215 = c15252.f49780;
            AbstractC19728 abstractC197216 = c15252.f49835;
            AbstractC19728 abstractC197217 = c15252.f49769;
            if (abstractC19728 == abstractC19729) {
                if (abstractC11781.f38066 == EnumC13603.f43213) {
                    hashSet.add(abstractC19729);
                }
            } else {
                AbstractC19728 abstractC197218 = c15252.f49804;
                if (abstractC19728 == abstractC197218) {
                    if (abstractC11781.f38066 == EnumC13603.f43205 && abstractC11781.f38069.f38066 != EnumC13603.f43218) {
                        hashSet.add(abstractC197218);
                    }
                } else if (abstractC19728 == abstractC197217) {
                    if (abstractC11781.mo9558() == EnumC5296.RECORD_COMPONENT) {
                        hashSet.add(abstractC197217);
                    }
                } else if (abstractC19728 == abstractC197216) {
                    if (abstractC11781.f38066 == EnumC13603.f43218 && !abstractC11781.m29570()) {
                        hashSet.add(abstractC197216);
                    }
                } else if (abstractC19728 == abstractC197215) {
                    if (abstractC11781.f38066 == EnumC13603.f43205 && abstractC11781.f38069.f38066 == EnumC13603.f43218 && (abstractC11781.mo29591() & 8589934592L) != 0) {
                        hashSet.add(abstractC197215);
                    }
                } else if (abstractC19728 == abstractC197214) {
                    if (abstractC11781.f38066 == EnumC13603.f43218 && abstractC11781.m29570()) {
                        hashSet.add(abstractC197214);
                    }
                } else if (abstractC19728 == abstractC197213) {
                    if (abstractC11781.f38066 == EnumC13603.f43205 && abstractC11781.f38069.f38066 == EnumC13603.f43218 && (abstractC11781.mo29591() & 8589934592L) == 0) {
                        hashSet.add(abstractC197213);
                    }
                } else if (abstractC19728 == abstractC197212) {
                    if (abstractC11781.f38066 == EnumC13603.f43213 && (abstractC11781.mo29591() & 8192) != 0) {
                        hashSet.add(abstractC197212);
                    }
                } else {
                    AbstractC19728 abstractC197219 = c15252.f49787;
                    if (abstractC19728 == abstractC197219) {
                        if (abstractC11781.f38066 == EnumC13603.f43219) {
                            hashSet.add(abstractC197219);
                        }
                    } else if (abstractC19728 == abstractC197211) {
                        EnumC13603 enumC13605 = abstractC11781.f38066;
                        EnumC13603 enumC13606 = EnumC13603.f43205;
                        if ((enumC13605 != enumC13606 || abstractC11781.f38069.f38066 != EnumC13603.f43218 || !abstractC11781.f38067.m51067(EnumC21172.NONE)) && ((enumC13603 = abstractC11781.f38066) == EnumC13603.f43213 || enumC13603 == enumC13606 || ((enumC13603 == (enumC13604 = EnumC13603.f43218) && !abstractC11781.m29570() && !abstractC11781.f38067.mo31585().m51067(EnumC21172.VOID)) || (abstractC11781.f38066 == enumC13604 && abstractC11781.m29570())))) {
                            hashSet.add(abstractC197211);
                        }
                    } else if (abstractC19728 == abstractC197210) {
                        if (abstractC11781.f38066 == EnumC13603.f43213 && abstractC11781.f38067.m51067(EnumC21172.TYPEVAR)) {
                            hashSet.add(abstractC197210);
                        }
                    } else {
                        AbstractC19728 abstractC197220 = c15252.f49746;
                        if (abstractC19728 == abstractC197220) {
                            if (abstractC11781.f38066 == EnumC13603.f43214) {
                                hashSet.add(abstractC197220);
                            }
                        } else {
                            return C15867.empty();
                        }
                    }
                }
            }
            i++;
            c22092 = this;
        }
        return C15867.of(hashSet);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17924 m49964(AbstractC22970 abstractC22970) {
        C23892 c23892Mo45423 = abstractC22970.mo51845().mo45423();
        if (c23892Mo45423 == null) {
            return null;
        }
        AbstractC21654 abstractC21654M53392 = c23892Mo45423.m53392(this.f71197.f49766);
        if (abstractC21654M53392 instanceof C17924) {
            return (C17924) abstractC21654M53392;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private AbstractC19728[] m49946() {
        if (this.f71207 == null) {
            ArrayList arrayList = new ArrayList();
            C15252 c15252 = this.f71197;
            arrayList.add(c15252.f49787);
            arrayList.add(c15252.f49847);
            arrayList.add(c15252.f49804);
            arrayList.add(c15252.f49835);
            arrayList.add(c15252.f49753);
            arrayList.add(c15252.f49768);
            arrayList.add(c15252.f49866);
            arrayList.add(c15252.f49780);
            if (this.f71221) {
                arrayList.add(c15252.f49769);
            }
            if (this.f71198) {
                arrayList.add(c15252.f49746);
            }
            this.f71207 = (AbstractC19728[]) arrayList.toArray(new AbstractC19728[0]);
        }
        return this.f71207;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m50025(C17621 c17621) {
        C7312 c7312 = this.f71200;
        C9548 c9548 = new C9548(c7312);
        try {
            return m49953(c17621);
        } finally {
            c7312.m20036(c9548);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:46:0x010f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0141  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean m49953(C17621 c17621) {
        C7312 c7312;
        boolean z;
        C11040 c11040;
        C19723 c19723Mo51845 = c17621.f57962.f26659.f73596.mo51845();
        LinkedHashSet<C10377> linkedHashSetMo45417 = c19723Mo51845.mo45417();
        Iterator it = c17621.f57964.iterator();
        boolean z2 = true;
        while (true) {
            boolean zHasNext = it.hasNext();
            c7312 = this.f71200;
            if (!zHasNext) {
                break;
            }
            AbstractC8036 abstractC8036 = (AbstractC8036) it.next();
            if (abstractC8036.m21911(EnumC21461.f68452)) {
                C20605 c20605 = (C20605) abstractC8036;
                AbstractC11781 abstractC11781M28352 = C11239.m28352(c20605.f66030);
                if (abstractC11781M28352 != null && !abstractC11781M28352.f38067.mo9329() && !linkedHashSetMo45417.remove(abstractC11781M28352)) {
                    AbstractC22295 abstractC22295 = c20605.f66030;
                    abstractC22295.getClass();
                    AbstractC19728 abstractC19728 = abstractC11781M28352.f38072;
                    AbstractC22664 abstractC22664 = c17621.f26659;
                    C11040 c11041 = C22843.f74058;
                    c7312.m34520(abstractC22295, new C11040("compiler", "duplicate.annotation.member.value", abstractC19728, abstractC22664));
                    z2 = false;
                }
            }
        }
        C14769 c14769M35543 = C14769.m35543();
        LinkedHashSet linkedHashSetMo45421 = c19723Mo51845.mo45421();
        for (C10377 c10377 : linkedHashSetMo45417) {
            if (!c10377.f38067.mo9329() && !linkedHashSetMo45421.contains(c10377)) {
                c14769M35543 = c14769M35543.m35546(c10377.f38072);
            }
        }
        C14769 c14769M35554 = c14769M35543.m35554();
        if (c14769M35554.m35550()) {
            if (c14769M35554.m35551() > 1) {
                AbstractC22664 abstractC22665 = c17621.f26659;
                C11040 c11042 = C22843.f74058;
                c11040 = new C11040("compiler", "annotation.missing.default.value.1", abstractC22665, c14769M35554);
            } else {
                AbstractC22664 abstractC22666 = c17621.f26659;
                C11040 c11043 = C22843.f74058;
                c11040 = new C11040("compiler", "annotation.missing.default.value", abstractC22666, c14769M35554);
            }
            c7312.m34520(c17621, c11040);
            z2 = false;
        }
        if (z2) {
            if (c17621.f57962.f26659.f73596 == this.f71193.f48252.f73596) {
                C14769 c14769 = c17621.f57964;
                if (c14769.f48336 == null) {
                    z = true;
                } else if (((AbstractC22295) c14769.f48335).m21911(EnumC21461.f68452)) {
                    C20605 c20606 = (C20605) c17621.f57964.f48335;
                    if (C11239.m28352(c20606.f66030).f38072 != this.f71197.f49766) {
                        z = false;
                    } else {
                        AbstractC22295 abstractC22296 = c20606.f66031;
                        if (abstractC22296.m21911(EnumC21461.f68554)) {
                            HashSet hashSet = new HashSet();
                            boolean z3 = true;
                            for (AbstractC8036 abstractC8037 : ((C21549) abstractC22296).f68827) {
                                if (!hashSet.add(C11239.m28352(abstractC8037))) {
                                    abstractC8037.getClass();
                                    c7312.m34520(abstractC8037, C22843.f74172);
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
    public final void m50003(AbstractC11781 abstractC11781, AbstractC8036 abstractC8036) {
        C15400 c15400 = this.f71219;
        EnumC19876 enumC19876 = EnumC19876.DEP_ANN;
        boolean zM36878 = c15400.m36878(enumC19876);
        C7312 c7312 = this.f71200;
        C14764 c14764 = this.f71193;
        if (zM36878 && abstractC11781.m29560() && (abstractC11781.mo29591() & 131072) != 0 && !c14764.f48258.mo9329() && abstractC11781.m29565(c14764.f48258.f73596) == null) {
            c7312.m34532(enumC19876, abstractC8036, C13146.f42056);
        }
        C15400 c15401 = this.f71219;
        EnumC19876 enumC19877 = EnumC19876.DEPRECATION;
        if (!c15401.m36878(enumC19877) || abstractC11781.m29560() || c14764.f48258.mo9329() || abstractC11781.m29565(c14764.f48258.f73596) == null) {
            return;
        }
        EnumC4960 enumC4960M27726 = C10925.m27726(abstractC11781);
        C25213 c25213 = C13146.f42046;
        c7312.m34532(enumC19877, abstractC8036, new C25213("compiler", "deprecated.annotation.has.no.effect", enumC4960M27726));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49918(C22092 c22092, Supplier supplier, AbstractC11781 abstractC11781) {
        InterfaceC5075 interfaceC5075 = (InterfaceC5075) supplier.get();
        C4812 c4812 = c22092.f71194;
        C4812 c4813 = c22092.f71192;
        if ((abstractC11781.f38071 & 36028797018963968L) != 0) {
            if (c22092.f71219.m36879(EnumC19876.REMOVAL)) {
                return;
            }
            if (abstractC11781.f38066 == EnumC13603.f43214) {
                C25213 c25213 = C13146.f42046;
                c4813.m14840(interfaceC5075, new C25213("compiler", "has.been.deprecated.for.removal.module", abstractC11781));
                return;
            } else {
                AbstractC11781 abstractC11781M29579 = abstractC11781.m29579();
                C25213 c25214 = C13146.f42046;
                c4813.m14840(interfaceC5075, new C25213("compiler", "has.been.deprecated.for.removal", abstractC11781, abstractC11781M29579));
                return;
            }
        }
        if (c22092.f71219.m36879(EnumC19876.DEPRECATION)) {
            return;
        }
        if (abstractC11781.f38066 == EnumC13603.f43214) {
            C25213 c25215 = C13146.f42046;
            c4812.m14840(interfaceC5075, new C25213("compiler", "has.been.deprecated.module", abstractC11781));
        } else {
            AbstractC11781 abstractC11781M295710 = abstractC11781.m29579();
            C25213 c25216 = C13146.f42046;
            c4812.m14840(interfaceC5075, new C25213("compiler", "has.been.deprecated", abstractC11781, abstractC11781M295710));
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m50033(final AbstractC11781 abstractC11781, final AbstractC8036 abstractC8036) {
        if ((abstractC11781.mo29591() & 274877906944L) != 0) {
            this.f71199.m17749(new InterfaceC12112() { // from class: l.᩺ۜ᩺
                @Override // l.InterfaceC12112
                /* JADX INFO: renamed from: ۙ */
                public final void mo6201() {
                    C22092.m49921(this.f78135, abstractC8036, abstractC11781);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49921(C22092 c22092, InterfaceC5075 interfaceC5075, AbstractC11781 abstractC11781) {
        C7312 c7312 = c22092.f71200;
        C25213 c25213 = C13146.f42046;
        c7312.m34521(interfaceC5075, new C25213("compiler", "sun.proprietary", abstractC11781));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m50050(AbstractC11781 abstractC11781, AbstractC8036 abstractC8036) {
        EnumC5865 enumC5865 = EnumC5865.f20115;
        EnumC5865 enumC5866 = this.f71216;
        if (enumC5866 == enumC5865 || (abstractC11781.mo29591() & 35184372088832L) == 0) {
            return;
        }
        C11040 c11040 = C22843.f74058;
        this.f71200.m34520(abstractC8036, new C11040("compiler", "not.in.profile", abstractC11781, enumC5866));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49984(final InterfaceC5075 interfaceC5075, AbstractC11781 abstractC11781, final AbstractC11781 abstractC11782) {
        long jMo29591 = abstractC11782.mo29591() & 72057594037927936L;
        C17638 c17638 = this.f71220;
        if (jMo29591 != 0 && abstractC11782.m29564().f44618 != abstractC11781.m29564().f44618) {
            long jMo29592 = abstractC11782.mo29591() & 288230376151711744L;
            C6147 c6147 = this.f71199;
            if (jMo29592 == 0) {
                if (!c17638.m41295()) {
                    C11040 c11040 = C22843.f74058;
                    this.f71200.m34520(interfaceC5075, new C11040("compiler", "is.preview", abstractC11782));
                } else {
                    c17638.m41298();
                    c6147.m17749(new InterfaceC12112() { // from class: l.᩹ۜ᩺
                        @Override // l.InterfaceC12112
                        /* JADX INFO: renamed from: ۙ */
                        public final void mo6201() {
                            C25213 c25213 = C13146.f42046;
                            this.f75717.m49986(interfaceC5075, new C25213("compiler", "is.preview", abstractC11782));
                        }
                    });
                }
            } else {
                c6147.m17749(new InterfaceC12112() { // from class: l.ۗۜ᩺
                    @Override // l.InterfaceC12112
                    /* JADX INFO: renamed from: ۙ */
                    public final void mo6201() {
                        C25213 c25213 = C13146.f42046;
                        this.f10583.m49986(interfaceC5075, new C25213("compiler", "is.preview.reflective", abstractC11782));
                    }
                });
            }
        }
        c17638.getClass();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49989(C6633 c6633, AbstractC22664 abstractC22664) {
        int i = C9961.f32017[abstractC22664.mo9097().ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            m49989(c6633, this.f71203.m55120(abstractC22664));
            return;
        }
        if ((abstractC22664.f73596.mo29591() & 8192) != 0) {
            AbstractC22970 abstractC22970 = abstractC22664.f73596;
            long j = abstractC22970.f38071;
            if ((j & 34359738368L) != 0) {
                return;
            }
            if ((j & 134217728) != 0) {
                C11040 c11040 = C22843.f74058;
                this.f71200.m34520(c6633, new C11040("compiler", "cyclic.annotation.element", abstractC22970));
                return;
            }
            try {
                abstractC22970.f38071 = j | 134217728;
                for (AbstractC11781 abstractC11781 : abstractC22970.mo29571().mo7472((Predicate) null, EnumC13908.NON_RECURSIVE)) {
                    if (abstractC11781.f38066 == EnumC13603.f43218) {
                        m49989(c6633, ((C10377) abstractC11781).f38067.mo31585());
                    }
                }
                abstractC22970.f38071 = (abstractC22970.f38071 & (-134217729)) | 34359738368L;
            } catch (Throwable th) {
                abstractC22970.f38071 = (abstractC22970.f38071 & (-134217729)) | 34359738368L;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49993(C7926 c7926) {
        HashMap map = new HashMap();
        for (C14769 c14769 = c7926.f26344; c14769.m35550(); c14769 = c14769.f48336) {
            C24533 c24533M28350 = C11239.m28350((AbstractC8036) c14769.f48335);
            if (c24533M28350 != null) {
                C6633 c6633 = (C6633) c14769.f48335;
                if (C11239.m28319(c24533M28350.f79554) == this.f71197.f49836) {
                    map.put(c6633.f22152, C11239.m28352(c24533M28350.f79554));
                } else {
                    c6633.f22152.f38071 |= 1073741824;
                }
            }
        }
        for (AbstractC11781 abstractC11781 : (AbstractC11781[]) map.keySet().toArray(new AbstractC11781[0])) {
            m49915(c7926, abstractC11781, map);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m49915(C7926 c7926, AbstractC11781 abstractC11781, HashMap map) {
        if (abstractC11781 != null) {
            long j = abstractC11781.f38071;
            if ((j & 1073741824) == 0) {
                if ((j & 134217728) != 0) {
                    this.f71200.m34520(C11239.m28325(abstractC11781, c7926, false), C22843.f74194);
                } else {
                    abstractC11781.f38071 = j | 134217728;
                    m49915(c7926, (AbstractC11781) map.remove(abstractC11781), map);
                    abstractC11781.f38071 &= -134217729;
                }
                abstractC11781.f38071 |= 1073741824;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49982(final InterfaceC5075 interfaceC5075, C7395 c7395, AbstractC22664 abstractC22664) {
        if (abstractC22664.mo39105() != null && abstractC22664.mo9097().m48309(EnumC21172.LONG) && ((Number) abstractC22664.mo39105()).longValue() == 0) {
            int i = c7395.f24375;
            if (i == 108 || i == 112 || i == 109 || i == 113) {
                this.f71199.m17749(new InterfaceC12112() { // from class: l.ܶۜ᩺
                    @Override // l.InterfaceC12112
                    /* JADX INFO: renamed from: ۙ */
                    public final void mo6201() {
                        C22092.m49920(this.f51735, interfaceC5075);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49976(C2158 c2158) {
        if (c2158.f7115.m21911(EnumC21461.f68478) && c2158.f7116 == null) {
            C15400 c15400 = this.f71219;
            EnumC19876 enumC19876 = EnumC19876.EMPTY;
            if (c15400.m36878(enumC19876)) {
                AbstractC19969 abstractC19969 = c2158.f7115;
                abstractC19969.getClass();
                this.f71200.m34532(enumC19876, abstractC19969, C13146.f42054);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m50020(InterfaceC5075 interfaceC5075, AbstractC11781 abstractC11781, AbstractC17836 abstractC17836) {
        EnumC13603 enumC13603;
        if (!abstractC11781.f38067.mo9329()) {
            AbstractC19728 abstractC19728 = abstractC11781.f38069.f38072;
            C15252 c15252 = this.f71197;
            if (abstractC19728 != c15252.f49840) {
                for (AbstractC11781 abstractC11782 : abstractC17836.mo7473(abstractC11781.f38072, null, EnumC13908.NON_RECURSIVE)) {
                    if (abstractC11781 != abstractC11782 && (abstractC11782.mo29591() & 4398046511104L) == 0 && (enumC13603 = abstractC11781.f38066) == abstractC11782.f38066 && abstractC11781.f38072 != c15252.f49822) {
                        EnumC13603 enumC13604 = EnumC13603.f43218;
                        C24705 c24705 = this.f71203;
                        if (enumC13603 != enumC13604 || c24705.m55117(abstractC11781.f38067, abstractC11782.f38067, true) || c24705.m55117(c24705.m55132(abstractC11781.f38067), c24705.m55132(abstractC11782.f38067), true)) {
                            long jMo29591 = abstractC11781.mo29591() & 17179869184L;
                            long jMo29592 = abstractC11782.mo29591() & 17179869184L;
                            C7312 c7312 = this.f71200;
                            if (jMo29591 != jMo29592) {
                                abstractC11781.f38071 = 4398046511104L | abstractC11781.f38071;
                                if (abstractC11781.f38067.mo9329() || abstractC11782.f38067.mo9329()) {
                                    break;
                                    break;
                                }
                                AbstractC11781 abstractC11781M29579 = abstractC11782.m29579();
                                C11040 c11040 = C22843.f74058;
                                c7312.m34520(interfaceC5075, new C11040("compiler", "array.and.varargs", abstractC11781, abstractC11782, abstractC11781M29579));
                                return true;
                            }
                            if (abstractC11781.f38066 == enumC13604 && !c24705.m55117(abstractC11781.f38067, abstractC11782.f38067, false)) {
                                if (!abstractC11781.f38067.mo9329() && !abstractC11782.f38067.mo9329()) {
                                    C11040 c11041 = C22843.f74058;
                                    c7312.m34520(interfaceC5075, new C11040("compiler", "name.clash.same.erasure", abstractC11781, abstractC11782));
                                }
                                abstractC11781.f38071 |= 4398046511104L;
                                return true;
                            }
                            if ((abstractC11781.mo29591() & 576460752303423488L) != 0 && (abstractC11782.mo29591() & 576460752303423488L) != 0 && (abstractC11782.mo29591() & 1152921504606846976L) == 0) {
                                if (!abstractC11781.f38067.mo9329()) {
                                    c7312.m34520(interfaceC5075, C22843.f74078);
                                    abstractC11781.f38071 |= 4398046511104L;
                                }
                            } else {
                                m49983(interfaceC5075, abstractC11782);
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

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m50034(C19113 c19113) {
        C11852 c11852;
        AbstractC16344 abstractC16344;
        AbstractC17836 abstractC17836M41689 = AbstractC17836.m41689(c19113.f61858);
        AbstractC17836 abstractC17836M416810 = AbstractC17836.m41689(c19113.f61858);
        AbstractC16344 abstractC16345 = c19113.f61855;
        for (AbstractC8036 abstractC8036 : c19113.f61857) {
            if (abstractC8036.m21911(EnumC21461.f68480) && (abstractC16344 = (c11852 = (C11852) abstractC8036).f38179) != null) {
                for (AbstractC11781 abstractC11781 : abstractC16344.mo7472(new C15025(5), EnumC13908.RECURSIVE)) {
                    if (c11852.f38180) {
                        m49916(c11852, abstractC17836M41689, abstractC17836M416810, abstractC16345, abstractC11781, true);
                        abstractC17836M416810.mo7481(abstractC11781);
                    } else {
                        m49916(c11852, abstractC17836M41689, abstractC17836M416810, abstractC16345, abstractC11781, false);
                        abstractC17836M41689.mo7481(abstractC11781);
                    }
                }
                c11852.f38179 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m49916(C11852 c11852, AbstractC16344 abstractC16344, AbstractC16344 abstractC16345, AbstractC16344 abstractC16346, AbstractC11781 abstractC11781, boolean z) {
        C13064 c13064 = new C13064(3, abstractC11781);
        AbstractC11781 abstractC11781Mo7474 = abstractC16344.mo7474(abstractC11781.f38072, c13064);
        AbstractC11781 abstractC11781Mo7475 = (abstractC11781Mo7474 != null || z) ? null : abstractC16345.mo7474(abstractC11781.f38072, c13064);
        C7312 c7312 = this.f71200;
        if (abstractC11781Mo7474 == null && abstractC11781Mo7475 == null) {
            AbstractC11781 abstractC11781Mo7476 = abstractC16346.mo7474(abstractC11781.f38072, c13064);
            if (abstractC11781Mo7476 != null) {
                C11040 c11040 = C22843.f74058;
                c7312.m34520(c11852, new C11040("compiler", "already.defined.this.unit", abstractC11781Mo7476));
                return;
            }
            return;
        }
        if (abstractC11781Mo7474 != null) {
            C11040 c11041 = C22843.f74058;
            c7312.m34520(c11852, new C11040("compiler", "already.defined.single.import", abstractC11781Mo7474));
        } else {
            C11040 c11042 = C22843.f74058;
            c7312.m34520(c11852, new C11040("compiler", "already.defined.static.single.import", abstractC11781Mo7475));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49996(AbstractC8036 abstractC8036) {
        AbstractC8036 abstractC8037 = abstractC8036;
        while (abstractC8037.m21911(EnumC21461.f68485)) {
            C23041 c23041 = (C23041) abstractC8037;
            if (c23041.f74775.f38069.mo29582() != C11239.m28352(c23041.f74776).mo29582()) {
                abstractC8036.getClass();
                AbstractC11781 abstractC11781M28352 = C11239.m28352(abstractC8036);
                C11040 c11040 = C22843.f74058;
                this.f71200.m34520(abstractC8036, new C11040("compiler", "import.requires.canonical", abstractC11781M28352));
                return;
            }
            abstractC8037 = c23041.f74776;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49998(AbstractC8036 abstractC8036, C3168 c3168, C24550 c24550) {
        if (this.f71219.m36878(EnumC19876.AUXILIARYCLASS)) {
            c24550.mo29590();
            if ((c24550.f38071 & 17592186044416L) == 0 || !this.f71202.m49791(c3168, (AbstractC22970) c24550, false) || this.f71213.mo6988(c24550.f79584, c3168.f10275.f61856)) {
                return;
            }
            InterfaceC15976 interfaceC15976 = c24550.f79584;
            C25213 c25213 = C13146.f42046;
            this.f71200.m34531(abstractC8036, new C25213("compiler", "auxiliary.class.accessed.from.outside.of.its.source.file", c24550, interfaceC15976));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m50053(final C24550 c24550, final InterfaceC5075 interfaceC5075) {
        if (this.f71219.m36878(EnumC19876.MISSING_EXPLICIT_CTOR)) {
            c24550.mo29590();
            if ((c24550.f38071 & 2305843009213710336L) != 0 || c24550.f38072.isEmpty()) {
                return;
            }
            c24550.mo29590();
            if ((c24550.f38071 & 5) == 0 || !EnumC3666.f12544.m11915(this.f71217)) {
                return;
            }
            int i = C9961.f32014[c24550.m54836().ordinal()];
            if (i == 1 || i == 2) {
                return;
            }
            if (i == 4) {
                for (AbstractC11781 abstractC11781 = c24550.f38069; abstractC11781 != null && abstractC11781.f38066 == EnumC13603.f43213; abstractC11781 = abstractC11781.f38069) {
                    if ((abstractC11781.mo29591() & 5) == 0) {
                        return;
                    }
                }
            }
            final C14106 c14106M29564 = c24550.m29564();
            if (c14106M29564.m34259()) {
                return;
            }
            final C2920 c2920 = c14106M29564.f44618;
            for (C24047 c24047 : c2920.f9546) {
                if (c24047.f77785.equals(c14106M29564)) {
                    C14769 c14769 = c24047.f77786;
                    if (c14769 != null && !c14769.isEmpty()) {
                        return;
                    }
                    this.f71199.m17749(new InterfaceC12112() { // from class: l.ܽۜ᩺
                        @Override // l.InterfaceC12112
                        /* JADX INFO: renamed from: ۙ */
                        public final void mo6201() {
                            C22092.m49923(this.f56633, interfaceC5075, c24550, c14106M29564, c2920);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49923(C22092 c22092, InterfaceC5075 interfaceC5075, C24550 c24550, C14106 c14106, C2920 c2920) {
        C15400 c15400 = c22092.f71219;
        EnumC19876 enumC19876 = EnumC19876.MISSING_EXPLICIT_CTOR;
        if (c15400.m36878(enumC19876)) {
            C7312 c7312 = c22092.f71200;
            C25213 c25213 = C13146.f42046;
            c7312.m34532(enumC19876, interfaceC5075, new C25213("compiler", "missing-explicit-ctor", c24550, c14106, c2920));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m49969(InterfaceC5075 interfaceC5075, AbstractC22664 abstractC22664, AbstractC22664 abstractC22665) {
        C2504 c2504 = new C2504(this, interfaceC5075, "unchecked.cast.to.type", abstractC22664, abstractC22665);
        C24705 c24705 = this.f71203;
        if (c24705.m55130(abstractC22664, abstractC22665, c2504)) {
            return abstractC22665;
        }
        ((C14436) this.f71222).mo3910(interfaceC5075, this.f71225.m45975(C19859.m45718(abstractC22664, abstractC22665)));
        return c24705.m55139(abstractC22664);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, l.۟ܰۘ] */
    /* JADX WARN: Type inference failed for: r6v1, types: [l.ۙᩳۘ] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r7v4, types: [l.ۜᩳۘ, l.ܰ֡ۘ] */
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
    public final void m49994(C7926 c7926, C24550 c24550) {
        C14764 c14764 = this.f71193;
        if (c24550.m29565(c14764.f48267.f73596) != null) {
            try {
                this.f71203.m55092((AbstractC22970) c24550);
            } catch (C11540 e) {
                c7926.getClass();
                for (C17621 c17621 : c7926.f26341.f15824) {
                    if (c17621.f57962.f26659.f73596 == c14764.f48267.f73596) {
                        c7926 = c17621;
                        break;
                    }
                }
                C17007 c17007M29044 = e.m29044();
                C11040 c11040 = C22843.f74058;
                this.f71200.m34520(c7926, new C11040("compiler", "bad.functional.intf.anno.1", c17007M29044));
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m50052(C19113 c19113) {
        AbstractC11781 abstractC11781M28352;
        for (C11852 c11852 : c19113.m44239()) {
            if (c11852.f38180 && c11852.f38181.m21911(EnumC21461.f68485)) {
                C23041 c23041 = (C23041) c11852.f38181;
                if (c23041.f74774 != this.f71197.f49751 && (abstractC11781M28352 = C11239.m28352(c23041.f74776)) != null && abstractC11781M28352.f38066 == EnumC13603.f43213) {
                    AbstractC22970 abstractC22970 = (AbstractC22970) C11239.m28352(c23041.f74776);
                    if (!m49940(abstractC22970, abstractC22970, c19113.f61858, c23041.f74774, new HashSet())) {
                        AbstractC19728 abstractC19728 = c23041.f74774;
                        EnumC4960 enumC4960M27726 = C10925.m27726(abstractC22970);
                        C15515 c15515 = C19859.f63823;
                        C15515 c15516 = new C15515("compiler", "location", enumC4960M27726, abstractC22970, null);
                        C11040 c11040 = C22843.f74058;
                        this.f71200.m34520(c11852, new C11040("compiler", "cant.resolve.location", EnumC4960.STATIC, abstractC19728, null, null, c15516));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50011(C19113 c19113) {
        for (C11852 c11852 : c19113.m44239()) {
            if (!c11852.f38180 && C11239.m28319(c11852.f38181) == this.f71197.f49751) {
                AbstractC22970 abstractC22970 = ((C23041) c11852.f38181).f74776.f26659.f73596;
                if (abstractC22970.f38066 == EnumC13603.f43219 && abstractC22970.mo29571().m38843() && (!EnumC3666.f12559.m11915(this.f71217) || !abstractC22970.mo7873())) {
                    EnumC6984 enumC6984 = EnumC6984.RESOLVE_ERROR;
                    int i = c11852.f26658;
                    C11040 c11040 = C22843.f74058;
                    this.f71200.m34522(enumC6984, i, new C11040("compiler", "doesnt.exist", abstractC22970));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m49940(AbstractC22970 abstractC22970, AbstractC22970 abstractC22971, C14106 c14106, AbstractC19728 abstractC19728, HashSet hashSet) {
        if (abstractC22970 == null || !hashSet.add(abstractC22970)) {
            return false;
        }
        AbstractC22664 abstractC22664 = abstractC22970.f38067;
        C24705 c24705 = this.f71203;
        if (m49940(c24705.m55137(abstractC22664).f73596, abstractC22971, c14106, abstractC19728, hashSet)) {
            return true;
        }
        Iterator it = c24705.m55144(abstractC22970.f38067).iterator();
        while (it.hasNext()) {
            if (m49940(((AbstractC22664) it.next()).f73596, abstractC22971, c14106, abstractC19728, hashSet)) {
                return true;
            }
        }
        for (AbstractC11781 abstractC11781 : abstractC22970.mo29571().m38842(abstractC19728)) {
            if (abstractC11781.mo7874() && m49934(abstractC11781, c14106) && abstractC11781.m29567(abstractC22971, c24705)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m49934(AbstractC11781 abstractC11781, C14106 c14106) {
        try {
            int iMo29591 = (int) (abstractC11781.mo29591() & 7);
            if (iMo29591 != 0) {
                if (iMo29591 == 2) {
                    return false;
                }
                if (iMo29591 != 4) {
                    return true;
                }
            }
            return abstractC11781.m29564() == c14106;
        } catch (C10620 e) {
            throw e;
        } catch (C21566 unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49978(C3168 c3168, C7926 c7926) {
        C24047 c24047M49914;
        C19113 c19113 = c3168.f10275;
        C2920 c2920 = c19113.f61859;
        C14764 c14764 = this.f71193;
        if (c2920 == c14764.f48308 || c2920 == c14764.f48278) {
            return;
        }
        C24550 c24550 = c7926.f26345;
        c24550.mo29590();
        if ((c24550.f38071 & 16777216) == 0 && (c24047M49914 = m49914(c19113.f61858)) != null && c24047M49914.f77786 == null) {
            new C18912(this, c3168, c7926, c19113).mo1505(c7926);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24047 m49914(C14106 c14106) {
        for (C24047 c24047 : c14106.f44618.f9546) {
            if (c24047.f77785 == c14106) {
                return c24047;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m49933(AbstractC11781 abstractC11781) {
        while (abstractC11781.f38066 != EnumC13603.f43219) {
            if ((abstractC11781.mo29591() & 1) == 0 && (abstractC11781.mo29591() & 4) == 0) {
                return false;
            }
            abstractC11781 = abstractC11781.f38069;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49929(C22092 c22092, AbstractC22295 abstractC22295, AbstractC11781 abstractC11781, C14106 c14106, boolean z) {
        C14769 c14769;
        C7312 c7312 = c22092.f71200;
        if (!m49933(abstractC11781) && !z) {
            EnumC19876 enumC19876 = EnumC19876.EXPORTS;
            EnumC4960 enumC4960M27726 = C10925.m27726(abstractC11781);
            C2920 c2920 = abstractC11781.m29564().f44618;
            C25213 c25213 = C13146.f42046;
            c7312.m34532(enumC19876, abstractC22295, new C25213("compiler", "leaks.not.accessible", enumC4960M27726, abstractC11781, c2920));
            return;
        }
        C14106 c14106M29564 = abstractC11781.m29564();
        C24047 c24047M49914 = m49914(c14106M29564);
        C24047 c24047M49915 = m49914(c14106);
        if (c24047M49914 == null) {
            EnumC19876 enumC19877 = EnumC19876.EXPORTS;
            EnumC4960 enumC4960M27727 = C10925.m27726(abstractC11781);
            C2920 c2921 = abstractC11781.m29564().f44618;
            C25213 c25214 = C13146.f42046;
            c7312.m34532(enumC19877, abstractC22295, new C25213("compiler", "leaks.not.accessible.unexported", enumC4960M27727, abstractC11781, c2921));
            return;
        }
        C14769 c147610 = c24047M49914.f77786;
        if (c147610 != null && ((c14769 = c24047M49915.f77786) == null || !c147610.containsAll(c14769))) {
            EnumC19876 enumC19878 = EnumC19876.EXPORTS;
            EnumC4960 enumC4960M27728 = C10925.m27726(abstractC11781);
            C2920 c2922 = abstractC11781.m29564().f44618;
            C25213 c25215 = C13146.f42046;
            c7312.m34532(enumC19878, abstractC22295, new C25213("compiler", "leaks.not.accessible.unexported.qualified", enumC4960M27728, abstractC11781, c2922));
        }
        C2920 c2923 = c14106M29564.f44618;
        C2920 c2924 = c14106.f44618;
        if (c2923 == c2924 || c2923 == c22092.f71193.f48304) {
            return;
        }
        C14769 c14769Of = C14769.of((Object) c2924);
        while (c14769Of.m35550()) {
            C2920 c2925 = (C2920) c14769Of.f48335;
            c14769Of = c14769Of.f48336;
            if (c2925 == c14106M29564.f44618) {
                return;
            }
            if ((c2925.f38071 & 4503599627370496L) == 0) {
                for (C0180 c0180 : c2925.f9551) {
                    if (c0180.f1261.contains(EnumC7638.TRANSITIVE)) {
                        c14769Of = c14769Of.m35552(c0180.f1262);
                    }
                }
            }
        }
        EnumC19876 enumC19879 = EnumC19876.EXPORTS;
        EnumC4960 enumC4960M27729 = C10925.m27726(abstractC11781);
        C2920 c2926 = abstractC11781.m29564().f44618;
        C25213 c25216 = C13146.f42046;
        c7312.m34532(enumC19879, abstractC22295, new C25213("compiler", "leaks.not.accessible.not.required.transitive", enumC4960M27729, abstractC11781, c2926));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50012(final AbstractC22295 abstractC22295, final C2920 c2920) {
        if (c2920.f38066 != EnumC13603.f43214) {
            this.f71199.m17749(new InterfaceC12112() { // from class: l.᩻ۜ᩺
                @Override // l.InterfaceC12112
                /* JADX INFO: renamed from: ۙ */
                public final void mo6201() {
                    C22092.m49928(this.f80508, abstractC22295, c2920);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49928(C22092 c22092, AbstractC22295 abstractC22295, C2920 c2920) {
        C15400 c15400 = c22092.f71219;
        EnumC19876 enumC19876 = EnumC19876.MODULE;
        if (c15400.m36878(enumC19876)) {
            C7312 c7312 = c22092.f71200;
            C25213 c25213 = C13146.f42046;
            c7312.m34532(enumC19876, abstractC22295, new C25213("compiler", "module.not.found", c2920));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49922(C22092 c22092, InterfaceC5075 interfaceC5075, C14106 c14106) {
        if (c22092.f71219.m36878(EnumC19876.OPENS)) {
            C7312 c7312 = c22092.f71200;
            C25213 c25213 = C13146.f42046;
            c7312.m34531(interfaceC5075, new C25213("compiler", "package.empty.or.not.found", c14106));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49980(final InterfaceC5075 interfaceC5075, final C0180 c0180) {
        if ((c0180.f1262.f38071 & 4503599627370496L) != 0) {
            this.f71199.m17749(new InterfaceC12112() { // from class: l.֫ۜ᩺
                @Override // l.InterfaceC12112
                /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                public final void mo6201() {
                    C22092.m49919(this.f5990, c0180, interfaceC5075);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49919(C22092 c22092, C0180 c0180, InterfaceC5075 interfaceC5075) {
        C7312 c7312 = c22092.f71200;
        if (c0180.f1261.contains(EnumC7638.TRANSITIVE) && c22092.f71219.m36878(EnumC19876.REQUIRES_TRANSITIVE_AUTOMATIC)) {
            c7312.m34531(interfaceC5075, C13146.f42065);
        } else if (c22092.f71219.m36878(EnumC19876.REQUIRES_AUTOMATIC)) {
            c7312.m34531(interfaceC5075, C13146.f42048);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50005(C14769 c14769) {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean zM21911 = false;
        boolean z5 = false;
        while (c14769.m35550()) {
            C21351 c21351 = (C21351) c14769.f48335;
            for (AbstractC18367 abstractC18367 : c21351.f68007) {
                boolean zMo9536 = abstractC18367.mo9536();
                C7312 c7312 = this.f71200;
                if (zMo9536) {
                    if (C11239.m28351((AbstractC22295) abstractC18367)) {
                        if (z4 && !zM21911 && !z5) {
                            c7312.m34520(abstractC18367, C22843.f74071);
                        }
                        z3 = true;
                    } else {
                        if (z4 && !z5) {
                            c7312.m34520(abstractC18367, C22843.f74071);
                        }
                        z = true;
                    }
                } else if (abstractC18367.m21911(EnumC21461.f68552)) {
                    if (z4 && !z5) {
                        c7312.m34520(abstractC18367, C22843.f74071);
                    }
                    z2 = true;
                } else {
                    zM21911 = abstractC18367.m21911(EnumC21461.f68486);
                    if (z4 || z || z2 || (z3 && (!zM21911 || z5))) {
                        c7312.m34520(abstractC18367, C22843.f74202);
                    }
                    z4 = true;
                }
            }
            boolean z6 = c21351.f68011 == EnumC24528.STATEMENT ? c21351.f68010 : false;
            if (c21351.f68009.m35550()) {
                z4 &= z6;
                zM21911 &= z6;
                z2 = false;
                z3 &= z6;
                z = false;
            }
            z5 = c21351.f68009.m35550() && z6;
            c14769 = c14769.f48336;
        }
    }
}
