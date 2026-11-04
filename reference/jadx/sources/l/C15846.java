package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ܶۙۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: S424 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15846 extends AbstractC0578 {

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final C13477 f51522 = new C13477();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public EnumC0229 f51523;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C16437 f51524;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C11518 f51525;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C15252 f51526;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C3168 f51528;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C7926 f51529;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C18499 f51530;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C19881 f51531;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C7312 f51532;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C22756 f51533;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C14764 f51535;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C15400 f51536;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C24705 f51537;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C22092 f51538;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC16722 f51539;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C17929 f51540;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public AbstractC22664 f51541;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C18499 f51527 = new C18499();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C23174 f51534 = new C16592();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15846 m37791(C4747 c4747) {
        C15846 c15846 = (C15846) c4747.m14643(f51522);
        return c15846 == null ? new C15846(c4747) : c15846;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3168 m37793(AbstractC22970 abstractC22970) {
        return this.f51524.m38995(abstractC22970);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Collection m37799() {
        return this.f51524.m38998();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3168 m37790(C3168 c3168, C7926 c7926) {
        C3168 c3168M10350 = c3168.m10350(c7926, ((C7768) c3168.f10272).m21146(AbstractC17836.m41689(c7926.f26345)));
        c3168M10350.f10279 = c7926;
        c3168M10350.f10278 = c3168;
        C7768 c7768 = (C7768) c3168M10350.f10272;
        c7768.f25560 = false;
        c7768.f25558 = null;
        c7768.f25568 = C11239.m28349(c3168.f10273);
        return c3168M10350;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3168 m37798(C19113 c19113) {
        C7768 c7768 = new C7768();
        C3168 c3168 = new C3168(c19113, c7768);
        c3168.f10275 = c19113;
        c3168.f10279 = this.f51529;
        c19113.f61855 = AbstractC17836.m41689(c19113.f61858);
        c19113.f61854 = new C23058(c19113.f61858);
        c19113.f61861 = new C17090(c19113.f61858);
        c7768.f25562 = c19113.f61855;
        c7768.f25558 = this.f51536;
        return c3168;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC17836 m37792(C3168 c3168) {
        if (c3168.f10273.m21911(EnumC21461.f68501)) {
            return ((C7926) c3168.f10273).f26345.f79576;
        }
        return ((C7768) c3168.f10272).f25562;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m37795(AbstractC8036 abstractC8036, C3168 c3168) {
        AbstractC22664 abstractC22664M49966;
        C11518 c11518 = this.f51525;
        C3168 c3169 = this.f51528;
        try {
            try {
                this.f51528 = c3168;
                c11518.m29004();
                abstractC8036.mo2284(this);
                abstractC22664M49966 = this.f51541;
            } catch (C21566 e) {
                C22092 c22092 = this.f51538;
                abstractC8036.getClass();
                abstractC22664M49966 = c22092.m49966(abstractC8036, e);
            }
            return abstractC22664M49966;
        } finally {
            c11518.m29003();
            this.f51528 = c3169;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14769 m37794(C14769 c14769, C3168 c3168) {
        C18499 c18499 = new C18499();
        while (c14769.m35550()) {
            AbstractC22664 abstractC22664M37795 = m37795((AbstractC8036) c14769.f48335, c3168);
            if (abstractC22664M37795 != null) {
                c18499.m43089(abstractC22664M37795);
            }
            c14769 = c14769.f48336;
        }
        return c18499.m43093();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:33:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:35:0x0107  */
    /* JADX WARN: Code duplicated, block: B:37:0x0116 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0118  */
    /* JADX WARN: Code duplicated, block: B:39:0x011e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0192  */
    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo2609(final C19113 c19113) {
        boolean z;
        C15867 c15867FindAny;
        C3168 c3168M37798;
        C3168 c3168M10350;
        C3168 c3168M38995;
        AbstractC11781 abstractC11781;
        AbstractC22295 abstractC22295;
        InterfaceC15976 interfaceC15976 = c19113.f61856;
        C7312 c7312 = this.f51532;
        InterfaceC15976 interfaceC15976M34530 = c7312.m34530(interfaceC15976);
        InterfaceC15976 interfaceC15977 = c19113.f61856;
        EnumC17468 enumC17468 = EnumC17468.SOURCE;
        boolean zMo10886 = interfaceC15977.mo10886("package-info", enumC17468);
        boolean zMo10887 = c19113.f61856.mo10886("module-info", enumC17468);
        C14764 c14764 = this.f51535;
        if (zMo10887 && c19113.m44238() != null) {
            C10360 c10360M44237 = c19113.m44237();
            if (c10360M44237 != null) {
                c7312.m34520(c10360M44237, C22843.f74153);
            }
            c19113.f61858 = c14764.f48284;
            m37794(c19113.f61857, m37798(c19113));
            C2920 c2920 = c19113.f61859;
            final C19881 c19881 = this.f51531;
            c19881.getClass();
            c2920.f9555 = new InterfaceC14852() { // from class: l.᩺ᩴۘ
                @Override // l.InterfaceC14852
                /* JADX INFO: renamed from: ۙ */
                public final void mo11629(AbstractC11781 abstractC11782) {
                    C19881.m45767(c19881, abstractC11782);
                }

                @Override // l.InterfaceC14852
                /* JADX INFO: renamed from: ۤ */
                public final /* synthetic */ boolean mo11630() {
                    return false;
                }
            };
        } else {
            C10360 c10360M44238 = c19113.m44237();
            if (c10360M44238 != null) {
                C14106 c14106M35529 = c14764.m35529(c19113.f61859, C11239.m28338(c10360M44238.f32980));
                c10360M44238.f32981 = c14106M35529;
                c19113.f61858 = c14106M35529;
                C23174 c23174 = this.f51534;
                c23174.getClass();
                c23174.mo1509(c10360M44238);
                if (c10360M44238.f32979.m35550() || this.f51523 == EnumC0229.ALWAYS || c19113.f61862 != null) {
                    if (zMo10886) {
                        z = true;
                    } else if (c10360M44238.f32979.m35550()) {
                        C17621 c17621 = (C17621) c10360M44238.f32979.f48335;
                        c17621.getClass();
                        c7312.m34520(c17621, C22843.f74164);
                    }
                }
                final Map map = c19113.f61859.f9554;
                c15867FindAny = C1170.stream(c14764.m35527(c19113.f61858.f44619)).filter(new Predicate() { // from class: l.ۧۙۘ
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
                        return ((C2920) obj) != c19113.f61859;
                    }
                }).filter(new Predicate() { // from class: l.᩻ۙۘ
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
                        C15846 c15846 = this.f80246;
                        c15846.getClass();
                        C19113 c19114 = c19113;
                        return map.get(c19114.f61858.f44619) == c15846.f51535.m35532((C2920) obj, c19114.f61858.f44619);
                    }
                }).findAny();
                if (c15867FindAny.isPresent()) {
                    AbstractC11781 abstractC11782 = (AbstractC11781) c15867FindAny.get();
                    C11040 c11040 = C22843.f74058;
                    c7312.m34520(c10360M44238, new C11040("compiler", "package.in.other.module", abstractC11782));
                }
                c19113.f61858.mo29590();
                c3168M37798 = m37798(c19113);
                if (zMo10886) {
                    c3168M10350 = c3168M37798.m10350(c10360M44238, c3168M37798.f10272);
                } else {
                    c3168M10350 = null;
                }
                if (zMo10886) {
                    C14106 c14106 = c19113.f61858;
                    C16437 c16437 = this.f51524;
                    c3168M38995 = c16437.m38995(c14106);
                    if (c3168M38995 != null) {
                        if (!this.f51539.mo6988(c19113.f61856, c3168M38995.f10275.f61856)) {
                            if (c10360M44238 != null) {
                                abstractC22295 = c10360M44238.f32980;
                                abstractC22295.getClass();
                            } else {
                                abstractC22295 = null;
                            }
                            C14106 c14107 = c19113.f61858;
                            C25213 c25213 = C13146.f42046;
                            c7312.m34531(abstractC22295, new C25213("compiler", "pkg-info.already.seen", c14107));
                        }
                    }
                    c16437.m38997(c19113.f61858, c3168M10350);
                    for (abstractC11781 = c19113.f61858; abstractC11781 != null && abstractC11781.f38066 == EnumC13603.f43219; abstractC11781 = abstractC11781.f38069) {
                        abstractC11781.f38071 |= X931RNG.BLOCK128_RESEED_MAX;
                    }
                    C15252 c15252 = this.f51526;
                    AbstractC19728 abstractC19728 = c15252.f49860;
                    C24550 c24550M35518 = c14764.m35518(c19113.f61859, abstractC19728, c19113.f61858);
                    c24550M35518.f79578 = c15252.f49864.m51194(c19113.f61858 + "." + ((Object) abstractC19728));
                    c24550M35518.f79584 = c19113.f61856;
                    c24550M35518.f38070 = InterfaceC14852.f48554;
                    c24550M35518.f79576 = AbstractC17836.m41689(c24550M35518);
                    C14106 c14108 = c19113.f61858;
                    c14108.f44617 = c24550M35518;
                    c14108.f44620 = c19113.f61856;
                }
                m37794(c19113.f61857, c3168M37798);
                if (z) {
                    this.f51533.add(c3168M10350);
                }
            } else {
                c19113.f61858 = c19113.f61859.f9550;
            }
            z = false;
            final Map map2 = c19113.f61859.f9554;
            c15867FindAny = C1170.stream(c14764.m35527(c19113.f61858.f44619)).filter(new Predicate() { // from class: l.ۧۙۘ
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
                    return ((C2920) obj) != c19113.f61859;
                }
            }).filter(new Predicate() { // from class: l.᩻ۙۘ
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
                    C15846 c15846 = this.f80246;
                    c15846.getClass();
                    C19113 c19114 = c19113;
                    return map2.get(c19114.f61858.f44619) == c15846.f51535.m35532((C2920) obj, c19114.f61858.f44619);
                }
            }).findAny();
            if (c15867FindAny.isPresent()) {
                AbstractC11781 abstractC11783 = (AbstractC11781) c15867FindAny.get();
                C11040 c11041 = C22843.f74058;
                c7312.m34520(c10360M44238, new C11040("compiler", "package.in.other.module", abstractC11783));
            }
            c19113.f61858.mo29590();
            c3168M37798 = m37798(c19113);
            if (zMo10886) {
                c3168M10350 = c3168M37798.m10350(c10360M44238, c3168M37798.f10272);
            } else {
                c3168M10350 = null;
            }
            if (zMo10886) {
                C14106 c14109 = c19113.f61858;
                C16437 c16438 = this.f51524;
                c3168M38995 = c16438.m38995(c14109);
                if (c3168M38995 != null) {
                    if (!this.f51539.mo6988(c19113.f61856, c3168M38995.f10275.f61856)) {
                        if (c10360M44238 != null) {
                            abstractC22295 = c10360M44238.f32980;
                            abstractC22295.getClass();
                        } else {
                            abstractC22295 = null;
                        }
                        C14106 c141010 = c19113.f61858;
                        C25213 c25214 = C13146.f42046;
                        c7312.m34531(abstractC22295, new C25213("compiler", "pkg-info.already.seen", c141010));
                    }
                }
                c16438.m38997(c19113.f61858, c3168M10350);
                while (abstractC11781 != null) {
                    abstractC11781.f38071 |= X931RNG.BLOCK128_RESEED_MAX;
                }
                C15252 c15253 = this.f51526;
                AbstractC19728 abstractC19729 = c15253.f49860;
                C24550 c24550M35519 = c14764.m35518(c19113.f61859, abstractC19729, c19113.f61858);
                c24550M35519.f79578 = c15253.f49864.m51194(c19113.f61858 + "." + ((Object) abstractC19729));
                c24550M35519.f79584 = c19113.f61856;
                c24550M35519.f38070 = InterfaceC14852.f48554;
                c24550M35519.f79576 = AbstractC17836.m41689(c24550M35519);
                C14106 c141011 = c19113.f61858;
                c141011.f44617 = c24550M35519;
                c141011.f44620 = c19113.f61856;
            }
            m37794(c19113.f61857, c3168M37798);
            if (z) {
                this.f51533.add(c3168M10350);
            }
        }
        c7312.m34530(interfaceC15976M34530);
        this.f51541 = null;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x016f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0199  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ff  */
    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1505(C7926 c7926) {
        C22092 c22092;
        C24550 c24550M35519;
        final C24550 c24550M35518;
        C10510 c10510;
        C18499 c18499;
        C3168 c3168 = this.f51528;
        final AbstractC11781 abstractC11781 = ((C7768) c3168.f10272).f25562.f53083;
        AbstractC17836 abstractC17836M37792 = m37792(c3168);
        EnumC13603 enumC13603 = abstractC11781.f38066;
        EnumC13603 enumC13604 = EnumC13603.f43219;
        C24705 c24705 = this.f51537;
        C7312 c7312 = this.f51532;
        C14764 c14764 = this.f51535;
        C22092 c22093 = this.f51538;
        if (enumC13603 == enumC13604) {
            C14106 c14106 = (C14106) abstractC11781;
            AbstractC11781 abstractC11782 = c14106;
            while (abstractC11782 != null && abstractC11782.f38066 == EnumC13603.f43219) {
                abstractC11782.f38071 |= X931RNG.BLOCK128_RESEED_MAX;
                abstractC11782 = abstractC11782.f38069;
                c22093 = c22093;
            }
            c22092 = c22093;
            c24550M35519 = c14764.m35518(this.f51528.f10275.f61859, c7926.f26346, c14106);
            c14106.mo29590();
            c14106.f44616.mo7480(c24550M35519);
            if ((c7926.f26341.f15825 & 1) != 0 && !this.f51528.f10275.f61856.mo10886(c24550M35519.f38072.toString(), EnumC17468.SOURCE)) {
                EnumC4960 enumC4960 = EnumC4960.CLASS;
                long j = c7926.f26341.f15825;
                if ((j & 16384) != 0) {
                    enumC4960 = EnumC4960.ENUM;
                } else if ((j & 512) != 0) {
                    enumC4960 = EnumC4960.INTERFACE;
                }
                AbstractC19728 abstractC19728 = c7926.f26346;
                C11040 c11040 = C22843.f74058;
                c7312.m34520(c7926, new C11040("compiler", "class.public.should.be.in.file", enumC4960, abstractC19728));
            }
        } else {
            c22092 = c22093;
            if (!c7926.f26346.isEmpty() && !c22092.m50022(c7926, c7926.f26346, abstractC17836M37792)) {
                this.f51541 = null;
                return;
            }
            EnumC13603 enumC13605 = abstractC11781.f38066;
            EnumC13603 enumC13606 = EnumC13603.f43213;
            if (enumC13605 == enumC13606) {
                AbstractC22970 abstractC22970 = (AbstractC22970) abstractC11781;
                c24550M35518 = c14764.m35518(this.f51528.f10275.f61859, c7926.f26346, abstractC22970);
                if (c24550M35518.f38069 != abstractC11781) {
                    AbstractC19728 abstractC19729 = c24550M35518.f38072;
                    AbstractC19728 abstractC197210 = c7926.f26346;
                    if (abstractC19729 != abstractC197210) {
                        C11040 c11041 = C22843.f74058;
                        c7312.m34520(c7926, new C11040("compiler", "same.binary.name", abstractC19729, abstractC197210));
                        AbstractC19728 abstractC197211 = c7926.f26346;
                        C11256 c11256 = AbstractC22664.f73590;
                        c24705.getClass();
                        C12748 c12748M55061 = C24705.m55061(abstractC197211, abstractC22970, c11256);
                        this.f51541 = c12748M55061;
                        c7926.f26345 = (C24550) c12748M55061.f73596;
                        return;
                    }
                    C11972.m30027(abstractC11781.f38069.f38066 != enumC13606, new Supplier() { // from class: l.ۚۙۘ
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return abstractC11781.toString();
                        }
                    });
                    C11972.m30027(c24550M35518.f38069.f38066 == enumC13606, new Supplier() { // from class: l.֫ۙۘ
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return c24550M35518.f38069.toString();
                        }
                    });
                    AbstractC17836 abstractC17836 = ((C24550) c24550M35518.f38069).f79576;
                    if (abstractC17836 != null) {
                        abstractC17836.mo7479(c24550M35518);
                    }
                    c24550M35518.f38069 = abstractC11781;
                }
                if ((512 & abstractC11781.f38071) != 0) {
                    c7926.f26341.f15825 |= 9;
                }
            } else {
                c24550M35519 = c14764.m35519(c7926.f26346, abstractC11781);
                c24550M35519.f79578 = c22092.m50030(c24550M35519);
                if (!c24550M35519.f38072.isEmpty()) {
                    c22092.m49995(c7926, c24550M35519, ((C7768) this.f51528.f10272).f25562);
                }
            }
            c7926.f26345 = c24550M35518;
            if (c22092.m50045(c24550M35518) != null) {
                c22092.m50058(c24550M35518);
                abstractC17836M37792.mo7481(c24550M35518);
                C3168 c3168M37790 = m37790(this.f51528, c7926);
                this.f51524.m38997(c24550M35518, c3168M37790);
                c24550M35518.f38070 = InterfaceC14852.f48554;
                c24550M35518.f38071 = this.f51538.m49959(c7926, c7926.f26341.f15825, c24550M35518, c7926);
                c24550M35518.f79584 = this.f51528.f10275.f61856;
                c24550M35518.f79576 = AbstractC17836.m41689(c24550M35518);
                c24550M35518.m54824();
                c10510 = (C10510) c24550M35518.f38067;
                if (abstractC11781.f38066 != EnumC13603.f43219 && (c24550M35518.f38071 & 8) == 0) {
                    while (abstractC11781.f38066.m33349(C22114.f71276) && (abstractC11781.f38071 & 8) == 0) {
                        abstractC11781 = abstractC11781.f38069;
                    }
                    if (abstractC11781.f38066 == EnumC13603.f43213) {
                        c10510.mo23450(abstractC11781.f38067);
                    }
                }
                c10510.f33438 = m37794(c7926.f26343, c3168M37790);
                c10510.f33441 = null;
                c24550M35518.f38070 = this.f51540;
                if (!c24550M35518.m29602() && (c18499 = this.f51530) != null) {
                    c18499.m43089(c24550M35518);
                }
                m37794(c7926.f26344, c3168M37790);
                this.f51541 = c24550M35518.f38067;
                return;
            }
            AbstractC19728 abstractC197212 = c24550M35518.f79577;
            C11040 c11042 = C22843.f74058;
            c7312.m34520(c7926, new C11040("compiler", "duplicate.class", abstractC197212));
            C11256 c11257 = AbstractC22664.f73590;
            c24705.getClass();
            C12748 c12748M55062 = C24705.m55061(c7926.f26346, (AbstractC22970) abstractC11781, c11257);
            this.f51541 = c12748M55062;
            c7926.f26345 = (C24550) c12748M55062.f73596;
        }
        c24550M35518 = c24550M35519;
        c7926.f26345 = c24550M35518;
        if (c22092.m50045(c24550M35518) != null) {
            c22092.m50058(c24550M35518);
            abstractC17836M37792.mo7481(c24550M35518);
            C3168 c3168M37791 = m37790(this.f51528, c7926);
            this.f51524.m38997(c24550M35518, c3168M37791);
            c24550M35518.f38070 = InterfaceC14852.f48554;
            c24550M35518.f38071 = this.f51538.m49959(c7926, c7926.f26341.f15825, c24550M35518, c7926);
            c24550M35518.f79584 = this.f51528.f10275.f61856;
            c24550M35518.f79576 = AbstractC17836.m41689(c24550M35518);
            c24550M35518.m54824();
            c10510 = (C10510) c24550M35518.f38067;
            if (abstractC11781.f38066 != EnumC13603.f43219) {
                while (abstractC11781.f38066.m33349(C22114.f71276)) {
                    abstractC11781 = abstractC11781.f38069;
                }
                if (abstractC11781.f38066 == EnumC13603.f43213) {
                    c10510.mo23450(abstractC11781.f38067);
                }
            }
            c10510.f33438 = m37794(c7926.f26343, c3168M37791);
            c10510.f33441 = null;
            c24550M35518.f38070 = this.f51540;
            if (!c24550M35518.m29602()) {
                c18499.m43089(c24550M35518);
            }
            m37794(c7926.f26344, c3168M37791);
            this.f51541 = c24550M35518.f38067;
            return;
        }
        AbstractC19728 abstractC197213 = c24550M35518.f79577;
        C11040 c11043 = C22843.f74058;
        c7312.m34520(c7926, new C11040("compiler", "duplicate.class", abstractC197213));
        C11256 c11258 = AbstractC22664.f73590;
        c24705.getClass();
        C12748 c12748M55063 = C24705.m55061(c7926.f26346, (AbstractC22970) abstractC11781, c11258);
        this.f51541 = c12748M55063;
        c7926.f26345 = (C24550) c12748M55063.f73596;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1961(C16239 c16239) {
        C17969 c17969;
        AbstractC22664 abstractC22664 = c16239.f26659;
        if (abstractC22664 != null) {
            c17969 = (C17969) abstractC22664;
        } else {
            c17969 = new C17969(((C7768) this.f51528.f10272).f25562.f53083, this.f51535.f48241, c16239.f52784);
        }
        c16239.f26659 = c17969;
        if (this.f51538.m50020(c16239, c17969.f73596, ((C7768) this.f51528.f10272).f25562)) {
            ((C7768) this.f51528.f10272).f25562.mo7481(c17969.f73596);
        }
        this.f51541 = c17969;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1516(C14835 c14835) {
        C3168 c3168 = this.f51528;
        C11972.m30021(c14835.f48524);
        C3168 c3168M10350 = c3168.m10350(c14835, ((C7768) c3168.f10272).m21146(AbstractC17836.m41689(c14835.f48524)));
        c3168M10350.f10279 = this.f51529;
        c3168M10350.f10278 = c3168;
        C7768 c7768 = (C7768) c3168M10350.f10272;
        c7768.f25560 = false;
        c7768.f25558 = null;
        this.f51524.m38997(c14835.f48524, c3168M10350);
        if (this.f51531.m45776(c14835.f48524)) {
            this.f51533.add(c3168M10350);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1949(AbstractC8036 abstractC8036) {
        this.f51541 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37796(C24550 c24550, C14769 c14769) {
        C11518 c11518 = this.f51525;
        c11518.m29004();
        C18499 c18499 = this.f51530;
        C17929 c17929 = this.f51540;
        if (c17929.f58728) {
            this.f51530 = new C18499();
        }
        try {
            m37794(c14769, (C3168) null);
            if (c17929.f58728) {
                while (this.f51530.m43096()) {
                    C24550 c24551 = (C24550) this.f51530.m43092();
                    if (c24550 == null || c24550 == c24551 || c18499 == null) {
                        c24551.mo29590();
                    } else {
                        c18499.m43089(c24551);
                    }
                }
                boolean zM45779 = this.f51531.m45779();
                C18499 c184910 = this.f51527;
                if (!zM45779) {
                    Iterator it = c14769.iterator();
                    while (it.hasNext()) {
                        C19113 c19113 = (C19113) it.next();
                        if (c19113.m44238() != null) {
                            c184910.m43089(c19113);
                        } else {
                            c17929.m41864(C14769.of((Object) c19113));
                        }
                    }
                } else {
                    c17929.m41864(c184910.m43093());
                    c184910.clear();
                    c17929.m41864(c14769);
                }
            }
            this.f51530 = c18499;
            c11518.m29003();
        } catch (Throwable th) {
            this.f51530 = c18499;
            c11518.m29003();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m37797() {
        this.f51524.m38996();
    }

    public C15846(C4747 c4747) {
        c4747.m14646(f51522, this);
        this.f51532 = C7312.m20023(c4747);
        C15714 c15714M37502 = C15714.m37502(c4747);
        C14764 c14764M35506 = C14764.m35506(c4747);
        this.f51535 = c14764M35506;
        this.f51538 = C22092.m49912(c4747);
        C17929 c17929 = (C17929) c4747.m14643(C17929.f58717);
        this.f51540 = c17929 == null ? new C17929(c4747) : c17929;
        this.f51537 = C24705.m55066(c4747);
        this.f51525 = C11518.m28979(c4747);
        this.f51536 = C15400.m36873(c4747);
        this.f51526 = C15252.m36599(c4747);
        this.f51531 = C19881.m45741(c4747);
        C19991.m45972(c4747);
        C4395 c4395M37507 = c15714M37502.m37507(1L);
        C24550 c24550 = c14764M35506.f48264;
        C7926 c7926M37514 = c15714M37502.m37514(c4395M37507, c24550.f38072, C14769.m35543(), (AbstractC22295) null, C14769.m35543(), C14769.m35543());
        this.f51529 = c7926M37514;
        c7926M37514.f26345 = c24550;
        this.f51533 = C22756.m51291(c4747);
        this.f51539 = (InterfaceC16722) c4747.m14642(InterfaceC16722.class);
        this.f51523 = EnumC0229.m1702(C13015.m32421(c4747));
        this.f51524 = C16437.m38994(c4747);
    }
}
