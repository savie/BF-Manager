package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩶ۨ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20145 {

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public static final C16576 f65404 = new C16576();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C6761 f65406;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final C7444 f65407;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC9462 f65408;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f65409;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public C3836 f65410;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f65415;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final C7444 f65416;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C13174 f65419;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C23549 f65420;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean f65421;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C8150 f65422;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C0576 f65423;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f65425;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C7467 f65428;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final EnumSet f65429;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f65430;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C21017 f65433;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C23882 f65435;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C23942 f65436;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C5870 f65438;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C7444 f65440;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C20414 f65441;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f65442;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public C23800 f65444;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean f65445;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC18154 f65413 = new C21348(this);

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C17820 f65417 = new C17820();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C18526 f65443 = new C18526(this);

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C8649 f65411 = new C8649(this);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C10391 f65432 = new C10391();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C23427 f65446 = new C23427();

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final InterfaceC3915 f65439 = new C0181(this);

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C14255 f65427 = new InterfaceC3915() { // from class: l.ܳۗۤ
        @Override // l.InterfaceC3915
        /* JADX INFO: renamed from: ۙ */
        public final AbstractC23903 mo1384(C4603 c4603, final AbstractC11242 abstractC11242) {
            AbstractC23903 abstractC23903Mo3804 = c4603.f16295.f34728.mo3804(C17281.m40243(abstractC11242), new Predicate() { // from class: l.ܰۙ۟
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
                    AbstractC23903 abstractC23903 = (AbstractC23903) obj;
                    return abstractC23903.f77452 == EnumC10477.f35865 && abstractC23903.mo50003() == abstractC11242;
                }
            });
            if (abstractC23903Mo3804 != null) {
                return new C8212(this.f46666, c4603, true, abstractC23903Mo3804);
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final C1553 f65431 = new InterfaceC3915() { // from class: l.֫ۗۤ
        @Override // l.InterfaceC3915
        /* JADX INFO: renamed from: ۙ */
        public final AbstractC23903 mo1384(C4603 c4603, AbstractC11242 abstractC11242) {
            C20145 c20145 = this.f6280;
            AbstractC23903 abstractC23903Mo3804 = c4603.f16295.f34722.mo3804(C17281.m40243(abstractC11242), new C3559(1, abstractC11242));
            if (abstractC23903Mo3804 == null) {
                return null;
            }
            try {
                return new C8212(c20145, c4603, true, c20145.f65423.m2738(abstractC23903Mo3804.m52724().f25392, abstractC11242));
            } catch (C4146 unused) {
                return null;
            }
        }
    };

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public InterfaceC19501 f65412 = new C16410();

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C12177 f65414 = new C12177();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C17115 f65434 = new C17115(this);

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C6531 f65418 = new C6531(this);

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public C22760 f65426 = new C22760(this);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C6326 f65424 = new C6326();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C21825 f65405 = C21825.of((Object) EnumC11678.f39282, (Object) EnumC11678.f39281, (Object) EnumC11678.f39283);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C6095 f65437 = null;

    /* JADX WARN: Type inference failed for: r0v7, types: [l.ܳۗۤ] */
    /* JADX WARN: Type inference failed for: r0v8, types: [l.֫ۗۤ] */
    public C20145(C12343 c12343) {
        c12343.m30659(f65404, this);
        C3836 c3836M11131 = C3836.m11131(c12343);
        this.f65410 = c3836M11131;
        this.f65407 = new C7444(this, EnumC10477.f35875);
        C7444 c7444 = new C7444(this, EnumC10477.f35881);
        this.f65440 = c7444;
        this.f65416 = new C7444(this, EnumC10477.f35872);
        this.f65422 = C8150.m21460(c7444);
        this.f65436 = C23942.m52776(c12343);
        this.f65441 = C20414.m46161(c12343);
        this.f65406 = C6761.m18268(c12343);
        C7467 c7467 = (C7467) c12343.m30656(C7467.f24867);
        this.f65428 = c7467 == null ? new C7467(c12343) : c7467;
        this.f65438 = C5870.m16083(c12343);
        this.f65433 = C21017.m47211(c12343);
        this.f65419 = C13174.m32565(c12343);
        this.f65423 = C0576.m2728(c12343);
        this.f65435 = C23882.m52634(c12343);
        this.f65444 = C23800.m52336(c12343);
        this.f65420 = C23549.m51906(c12343);
        C2008.m6467(c12343);
        EnumC11909 enumC11909M29706 = EnumC11909.m29706(c12343);
        C14770 c14770M35395 = C14770.m35395(c12343);
        EnumC19730 enumC19730 = EnumC19730.f63332;
        this.f65442 = c14770M35395.m35402(enumC19730, "compact") || (c14770M35395.m35405(enumC19730) && c14770M35395.m35404("rawDiagnostics"));
        this.f65429 = EnumC15912.m37832(c14770M35395);
        EnumC14128.m34159(c12343);
        this.f65430 = EnumC14026.f46097.m33945(enumC11909M29706);
        this.f65425 = EnumC14026.f46126.m33945(enumC11909M29706);
        this.f65415 = EnumC14026.f46091.m33945(enumC11909M29706);
        this.f65445 = EnumC14026.f46125.m33945(enumC11909M29706);
        this.f65408 = AbstractC9462.m24222(c3836M11131.f14243);
        this.f65409 = EnumC14026.f46096.m33945(enumC11909M29706);
        EnumC14026.f46103.m33945(enumC11909M29706);
        this.f65421 = c14770M35395.m35407("debug.dumpMethodReferenceSearchResults");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20145 m45505(C12343 c12343) {
        C20145 c20145 = (C20145) c12343.m30656(f65404);
        return c20145 == null ? new C20145(c12343) : c20145;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static AbstractC23903 m45518(AbstractC23903 abstractC23903, AbstractC23903 abstractC23904) {
        return abstractC23903.f77452.m26579(abstractC23904.f77452) ? abstractC23903 : abstractC23904;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m45514(C4603 c4603) {
        C4603 c4604 = c4603.f16300;
        return c4604 != null && ((C22990) c4603.f16299).f74716 > ((C22990) c4604.f16299).f74716;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:53:0x00bd  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m45551(C4603 c4603, AbstractC0618 abstractC0618, boolean z) {
        boolean z2;
        C19670 c19670;
        C7675 c7675;
        C23195 c23195 = c4603.f16294;
        if ((c23195 == null || (c23195.f75267.f70567 & 536870912) == 0) && (!((C22990) c4603.f16299).f74724 || c4603.f16295.f34730 != abstractC0618.m52724().f25392)) {
            short sMo20276 = (short) (abstractC0618.mo20276() & 7);
            if (sMo20276 == 0) {
                C7675 c7676 = c4603.f16295.f34721;
                if (c7676 == abstractC0618.f77448 || c7676 == abstractC0618.m52724()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else if (sMo20276 == 1) {
                if (this.f65409) {
                    C19670 c19671 = c4603.f16295.f34730;
                    c19671.mo49994();
                    C7675 c7675M52724 = abstractC0618.m52724();
                    if (c19671 != c7675M52724.f25392 && c19671.f63148.get(c7675M52724.f25396) != c7675M52724) {
                        C3836 c3836 = this.f65410;
                        if (c7675M52724 != c3836.f14227 && ((c19670 = c7675M52724.f25392) != c3836.f14288 || !c19671.f63150.contains(c19670))) {
                            z2 = false;
                        }
                    }
                }
                z2 = true;
            } else if (sMo20276 == 2) {
                if (c4603.f16301.f30086.mo44804() == abstractC0618.f77448.mo44804()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                if (sMo20276 == 4 && (c7675 = c4603.f16295.f34721) != abstractC0618.f77448 && c7675 != abstractC0618.m52724()) {
                    C22492 c22492M52720 = c4603.f16301.f30086;
                    AbstractC23903 abstractC23903 = abstractC0618.f77448;
                    while (c22492M52720 != null && !c22492M52720.mo50008(abstractC23903, this.f65444)) {
                        c22492M52720 = c22492M52720.f77448.m52720();
                    }
                    if (c22492M52720 == null) {
                        z2 = false;
                    }
                }
                z2 = true;
            }
            if (!z || abstractC0618.f77449.mo1934() == AbstractC16579.f53219) {
                return z2;
            }
            if (!z2 || !m45554(c4603, abstractC0618.f77449.mo1934(), z)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m45554(final C4603 c4603, AbstractC16579 abstractC16579, final boolean z) {
        if (abstractC16579.m39001(EnumC6617.ARRAY)) {
            return m45554(c4603, C23800.m52343(this.f65444.m52416(abstractC16579)), false);
        }
        return abstractC16579 instanceof C7406 ? C21980.stream(C0356.spliterator(((C7406) abstractC16579).m19753()), false).allMatch(new Predicate() { // from class: l.ۙۙ۟
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
                return this.f15712.m45551(c4603, ((AbstractC16579) obj).f53222, z);
            }
        }) : m45551(c4603, abstractC16579.f53222, z);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00d2  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m45553(C4603 c4603, AbstractC16579 abstractC16579, AbstractC23903 abstractC23903) {
        if (abstractC23903.f77453 != this.f65436.f77632 || abstractC23903.f77448 == abstractC16579.f53222) {
            C23195 c23195 = c4603.f16294;
            Object obj = c4603.f16299;
            if (c23195 != null && (c23195.f75267.f70567 & 536870912) != 0) {
                return true;
            }
            C22990 c22990 = (C22990) obj;
            if (c22990.f74724 && c4603.f16295.f34730 == abstractC23903.m52724().f25392) {
                return true;
            }
            short sMo20276 = (short) (abstractC23903.mo20276() & 7);
            C23800 c23800 = this.f65444;
            if (sMo20276 == 0) {
                C7675 c7675 = c4603.f16295.f34721;
                if ((c7675 == abstractC23903.f77448.f77448 || c7675 == abstractC23903.m52724()) && m45554(c4603, abstractC16579, false) && abstractC23903.mo42454((AbstractC23903) abstractC16579.f53222, c23800) && m45519(abstractC23903, abstractC16579)) {
                    return true;
                }
            } else if (sMo20276 == 2) {
                C22492 c22492 = c4603.f16301.f30086;
                if ((c22492 == abstractC23903.f77448 || c22492.mo44804() == abstractC23903.f77448.mo44804()) && abstractC23903.mo42454((AbstractC23903) abstractC16579.f53222, c23800)) {
                    return true;
                }
            } else if (sMo20276 == 4) {
                C7675 c7676 = c4603.f16295.f34721;
                if (c7676 == abstractC23903.f77448.f77448 || c7676 == abstractC23903.m52724()) {
                    if (!m45554(c4603, abstractC16579, false) && m45519(abstractC23903, abstractC16579)) {
                        return true;
                    }
                } else {
                    C22492 c22492M52720 = c4603.f16301.f30086;
                    AbstractC16579 abstractC16579Mo18112 = abstractC16579.m39001(EnumC6617.TYPEVAR) ? abstractC16579.mo18112() : abstractC16579;
                    while (c22492M52720 != null) {
                        if (c22492M52720.mo50008(abstractC23903.f77448, c23800)) {
                            c22492M52720.mo49994();
                            if ((c22492M52720.f77447 & 512) == 0 && ((abstractC23903.mo20276() & 8) != 0 || abstractC23903.f77452 == EnumC10477.f35865 || abstractC16579Mo18112.f53222.mo50008((AbstractC23903) c22492M52720, c23800))) {
                                break;
                            }
                        }
                        c22492M52720 = c22492M52720.f77448.m52720();
                    }
                    if (c22492M52720 != null || (c22990.f74723 && (abstractC23903.mo20276() & 8) == 0 && abstractC23903.f77452 != EnumC10477.f35865)) {
                        if (!m45554(c4603, abstractC16579, false)) {
                        }
                    }
                }
            } else if (m45554(c4603, abstractC16579, false) && m45519(abstractC23903, abstractC16579)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m45519(AbstractC23903 abstractC23903, AbstractC16579 abstractC16579) {
        if (abstractC23903.f77452 == EnumC10477.f35879 && !abstractC23903.m52713() && !abstractC23903.mo22992()) {
            AbstractC0618 abstractC0618 = abstractC16579.f53222;
            C23800 c23800 = this.f65444;
            C18258 c18258M42451 = ((C18258) abstractC23903).m42451(abstractC0618, c23800, true);
            if (c18258M42451 != null && c18258M42451 != abstractC23903 && abstractC23903.f77448 != c18258M42451.f77448 && c23800.m52429(c23800.m52409(c18258M42451, abstractC16579), c23800.m52409(abstractC23903, abstractC16579), true)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m45556(C4603 c4603, AbstractC16579 abstractC16579, AbstractC23903 abstractC23903, C1116 c1116, C21825 c21825, C21825 c21826, C10391 c10391) {
        C23800 c23800 = this.f65444;
        AbstractC16579 abstractC16579M52409 = c23800.m52409(abstractC23903, abstractC16579);
        C21825 c21825M48588 = C21825.m48588();
        C21825 c21825M48589 = c21826 == null ? C21825.m48588() : c21826;
        EnumC6617 enumC6617 = EnumC6617.FORALL;
        if (abstractC16579M52409.m39001(enumC6617) || !c21825M48589.m48595()) {
            if (abstractC16579M52409.m39001(enumC6617) && c21825M48589.m48595()) {
                C10894 c10894 = (C10894) abstractC16579M52409;
                C21825 c21827 = c10894.f37076;
                int iM48596 = c21825M48589.m48596();
                int iM48597 = c21827.m48596();
                C23549 c23549 = this.f65420;
                if (iM48596 != iM48597) {
                    String string = Integer.toString(c21827.m48596());
                    C14377 c14377 = C14707.f48054;
                    throw new C1155(c23549.m51910(new C14377("compiler", "wrong.number.type.args", string)));
                }
                C21825 c21828 = c21827;
                for (C21825 c21829 = c21825M48589; c21828.m48595() && c21829.m48595(); c21829 = c21829.f70877) {
                    for (C21825 c21825M52380 = c23800.m52380(c23800.m52381((C22929) c21828.f70876), c21827, c21825M48589); c21825M52380.m48595(); c21825M52380 = c21825M52380.f70877) {
                        if (!c23800.m52400((AbstractC16579) c21829.f70876, (AbstractC16579) c21825M52380.f70876, c10391)) {
                            AbstractC16579 abstractC165710 = (AbstractC16579) c21829.f70876;
                            C14377 c14378 = C14707.f48054;
                            throw new C1155(c23549.m51910(new C14377("compiler", "explicit.param.do.not.conform.to.bounds", abstractC165710, c21825M52380)));
                        }
                    }
                    c21828 = c21828.f70877;
                }
                abstractC16579M52409 = c23800.m52371(c10894.f53121, c21827, c21825M48589);
            } else if (abstractC16579M52409.m39001(enumC6617)) {
                C10894 c10895 = (C10894) abstractC16579M52409;
                C21825 c218210 = c10895.f37076;
                C21825 c21825M52357 = c23800.m52357(c218210);
                c21825M48588.getClass();
                c21825M48588 = c21825M52357.m48594(c21825M48588);
                abstractC16579M52409 = c23800.m52371(c10895.f53121, c218210, c21825M52357);
            }
        }
        AbstractC16579 abstractC165711 = abstractC16579M52409;
        C21825 c218211 = c21825M48588;
        boolean z = c218211.f70877 != null;
        for (C21825 c218212 = c21825; c218212.f70877 != null && !z; c218212 = c218212.f70877) {
            if (((AbstractC16579) c218212.f70876).m39001(EnumC6617.FORALL)) {
                z = true;
            }
        }
        if (z) {
            return this.f65419.m32579(c4603, c218211, (C13757) abstractC165711, c1116, (C18258) abstractC23903, c21825, this.f65437, c10391);
        }
        C12926 c12926M16585 = this.f65437.m16585(abstractC23903, this.f65419.f43861, c1116, c10391);
        this.f65437.f20635.mo20004(c4603, c12926M16585, c21825, abstractC165711.mo33523(), c10391);
        c12926M16585.mo32012();
        return abstractC165711;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m45525(C4603 c4603, AbstractC16579 abstractC16579, AbstractC23903 abstractC23903, C1116 c1116, C21825 c21825, C21825 c21826, C10391 c10391) {
        C6095 c6095 = this.f65437;
        try {
            C6095 c6096 = new C6095(this);
            this.f65437 = c6096;
            c6096.f20636 = c1116.f5036 == C13174.f43856 ? EnumC9729.SPECULATIVE : EnumC9729.CHECK;
            if (c4603.f16296.m22847(EnumC18651.f60512)) {
                this.f65437.f20635 = new C0450(this, c1116.f5037.mo4574());
            }
            C6095 c6097 = this.f65437;
            EnumC11678 enumC11678 = ((C22990) c4603.f16299).f74727;
            c6097.f20637 = enumC11678;
            enumC11678.m29178();
            enumC11678.m29179();
            return m45556(c4603, abstractC16579, abstractC23903, c1116, c21825, c21826, c10391);
        } finally {
            this.f65437 = c6095;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC23903 m45536(C4603 c4603, AbstractC16579 abstractC16579, AbstractC11242 abstractC11242, AbstractC0618 abstractC0618) {
        while (abstractC0618.f77449.m39001(EnumC6617.TYPEVAR)) {
            abstractC0618 = abstractC0618.f77449.mo18112().f53222;
        }
        for (AbstractC23903 abstractC23903 : abstractC0618.mo20272().m9327(abstractC11242)) {
            if (abstractC23903.f77452 == EnumC10477.f35878 && (abstractC23903.f77447 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0) {
                return m45553(c4603, abstractC16579, abstractC23903) ? abstractC23903 : new C23466(this, c4603, abstractC16579, abstractC23903);
            }
        }
        AbstractC16579 abstractC165710 = abstractC0618.f77449;
        C23800 c23800 = this.f65444;
        AbstractC16579 abstractC16579M52432 = c23800.m52432(abstractC165710);
        AbstractC23903 abstractC23903M45518 = this.f65407;
        if (abstractC16579M52432 != null && (abstractC16579M52432.m39001(EnumC6617.CLASS) || abstractC16579M52432.m39001(EnumC6617.TYPEVAR))) {
            abstractC23903M45518 = m45518(abstractC23903M45518, m45536(c4603, abstractC16579, abstractC11242, abstractC16579M52432.f53222));
        }
        for (C21825 c21825M52439 = c23800.m52439(abstractC0618.f77449); abstractC23903M45518.f77452 != EnumC10477.f35883 && c21825M52439.m48595(); c21825M52439 = c21825M52439.f70877) {
            AbstractC23903 abstractC23903M45536 = m45536(c4603, abstractC16579, abstractC11242, ((AbstractC16579) c21825M52439.f70876).f53222);
            if (abstractC23903M45518.mo20273() && abstractC23903M45536.mo20273() && abstractC23903M45536.f77448 != abstractC23903M45518.f77448) {
                abstractC23903M45518 = new C14294(this, abstractC23903M45518, abstractC23903M45536);
            } else {
                abstractC23903M45518 = m45518(abstractC23903M45518, abstractC23903M45536);
            }
        }
        return abstractC23903M45518;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC23903 m45539(C4603 c4603, AbstractC16579 abstractC16579, C21825 c21825, C21825 c21826, AbstractC23903 abstractC23903, AbstractC23903 abstractC23904, boolean z) {
        if (abstractC23903.f77452 != EnumC10477.f35866) {
            AbstractC0618 abstractC0618 = abstractC16579.f53222;
            AbstractC23903 abstractC23905 = abstractC23903.f77448;
            C23800 c23800 = this.f65444;
            if ((abstractC0618 == abstractC23905 || abstractC23903.mo42454((AbstractC23903) abstractC0618, c23800)) && m45519(abstractC23903, abstractC16579)) {
                if (z && (abstractC23903.mo20276() & 17179869184L) == 0) {
                    if (!abstractC23904.f77452.m26583()) {
                        return abstractC23904;
                    }
                    AbstractC8856 abstractC8856 = (AbstractC8856) abstractC23904.mo10880();
                    C11740 c11740 = new C11740(this, abstractC8856.f77452, "badVarargs");
                    c11740.f39468 = abstractC8856;
                    return c11740;
                }
                C6171.m17176(!abstractC23903.f77452.m26583());
                try {
                    c23800.f76946.m26289();
                    this.f65437.m16587(abstractC23903, m45556(c4603, abstractC16579, abstractC23903, null, c21825, c21826, c23800.f76946));
                    if (m45553(c4603, abstractC16579, abstractC23903)) {
                        return (!abstractC23904.f77452.m26583() || abstractC23904.f77452 == EnumC10477.f35883) ? m45549(abstractC23903, abstractC23904, abstractC16579, c4603, c21825, z) : abstractC23903;
                    }
                    C23466 c23466 = new C23466(this, c4603, abstractC16579, abstractC23903);
                    EnumC17198 enumC17198 = EnumC17198.FRAGMENT;
                    C11948 c11948Mo8964 = c23466.mo8964(enumC17198, null, null, abstractC16579, null, c21825, c21826);
                    EnumC10477 enumC10477 = abstractC23904.f77452;
                    if (enumC10477 == EnumC10477.f35881) {
                        return c23466;
                    }
                    if (enumC10477 == EnumC10477.f35869) {
                        this.f65437.m16586(abstractC23903, c11948Mo8964);
                        return new C23029(this, this.f65437);
                    }
                    if (enumC10477 == EnumC10477.f35873) {
                        this.f65437.m16586(abstractC23903, c11948Mo8964);
                        return abstractC23904;
                    }
                    if (enumC10477 != EnumC10477.f35874 || !(abstractC23904 instanceof C23466)) {
                        return abstractC23904;
                    }
                    C23466 c23467 = (C23466) abstractC23904;
                    this.f65437.m16586(c23467.f60927, c23467.mo8964(enumC17198, null, null, abstractC16579, null, c21825, c21826));
                    this.f65437.m16586(abstractC23903, c11948Mo8964);
                    return new C23029(this, this.f65437);
                } catch (C1155 e) {
                    this.f65437.m16586(abstractC23903, e.mo4255());
                    int i = C14999.f48926[abstractC23904.f77452.ordinal()];
                    if (i == 1) {
                        return new C13151(this, this.f65437);
                    }
                    if (i != 2) {
                        if (i != 3) {
                            return abstractC23904;
                        }
                    } else {
                        if (!(abstractC23904 instanceof C23466)) {
                            return abstractC23904;
                        }
                        C23466 c23468 = (C23466) abstractC23904;
                        this.f65437.m16586(c23468.f60927, c23468.mo8964(EnumC17198.FRAGMENT, null, null, abstractC16579, null, c21825, c21826));
                    }
                    return new C23029(this, this.f65437);
                }
            }
        }
        return abstractC23904;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC23903 m45549(AbstractC23903 abstractC23903, AbstractC23903 abstractC23904, AbstractC16579 abstractC16579, C4603 c4603, C21825 c21825, boolean z) {
        int i = C14999.f48926[abstractC23904.f77452.ordinal()];
        if (i != 4) {
            if (i == 5) {
                C14294 c14294 = (C14294) abstractC23904.mo10880();
                boolean z2 = true;
                boolean z3 = true;
                for (AbstractC23903 abstractC23905 : c14294.f46831) {
                    AbstractC23903 abstractC23903M45549 = m45549(abstractC23903, abstractC23905, abstractC16579, c4603, c21825, z);
                    z2 &= abstractC23903M45549 == abstractC23903;
                    z3 &= abstractC23903M45549 == abstractC23905;
                }
                if (!z2) {
                    if (!z3) {
                        c14294.f46831 = c14294.f46831.m48597(abstractC23903);
                    }
                    return c14294;
                }
            } else {
                throw new AssertionError();
            }
        } else if (abstractC23903 != abstractC23904) {
            boolean zM45520 = m45520(abstractC23903, abstractC23904, abstractC16579, c4603, c21825, z);
            boolean zM45521 = m45520(abstractC23904, abstractC23903, abstractC16579, c4603, c21825, z);
            if (!zM45520 || !zM45521) {
                if (!zM45520) {
                    if (!zM45521) {
                        return m45548(abstractC23903, abstractC23904);
                    }
                }
            }
            C23800 c23800 = this.f65444;
            if (!c23800.m52417(c23800.m52409(abstractC23903, abstractC16579), c23800.m52409(abstractC23904, abstractC16579))) {
                return m45548(abstractC23903, abstractC23904);
            }
            if ((abstractC23903.mo20276() & 2147483648L) != (abstractC23904.mo20276() & 2147483648L)) {
                return (abstractC23903.mo20276() & 2147483648L) != 0 ? abstractC23904 : abstractC23903;
            }
            if (abstractC23903.mo10880() != abstractC23904.mo10880()) {
                AbstractC0618 abstractC0618 = (AbstractC0618) abstractC23903.f77448;
                AbstractC0618 abstractC0619 = (AbstractC0618) abstractC23904.f77448;
                if (abstractC0618 != abstractC0619) {
                    if (c23800.m52423(abstractC0619, abstractC0618.f77449) == null || (((abstractC23903.f77448.f77447 & 512) != 0 && (abstractC23904.f77448.f77447 & 512) == 0) || !abstractC23903.mo42453(abstractC23904, abstractC0618, c23800, false))) {
                        if (c23800.m52423(abstractC0618, abstractC0619.f77449) == null || (((abstractC23904.f77448.f77447 & 512) != 0 && (512 & abstractC23903.f77448.f77447) == 0) || !abstractC23904.mo42453(abstractC23903, abstractC0619, c23800, false))) {
                        }
                    }
                }
                boolean z4 = (abstractC23903.mo20276() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0;
                boolean z5 = (abstractC23904.mo20276() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0;
                if (!z4 || z5) {
                    if (!z5 || z4) {
                        return m45548(abstractC23903, abstractC23904);
                    }
                }
            }
        }
        return abstractC23903;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m45520(AbstractC23903 abstractC23903, AbstractC23903 abstractC23904, AbstractC16579 abstractC16579, C4603 c4603, C21825 c21825, boolean z) {
        AbstractC16579 abstractC16579M45556;
        C10391 c10391 = this.f65432;
        c10391.m26289();
        int iMax = Math.max(Math.max(abstractC23903.f77449.mo33523().m48596(), c21825.m48596()), abstractC23904.f77449.mo33523().m48596());
        C6095 c6095 = this.f65437;
        try {
            C6095 c6096 = new C6095(this);
            this.f65437 = c6096;
            c6096.f20637 = c6095.f20637;
            c6096.f20635 = c6095.f20635.mo2275(c21825);
            C23800 c23800 = this.f65444;
            try {
                abstractC16579M45556 = m45556(c4603, abstractC16579, abstractC23904, null, m45528(c23800.m52377(c23800.m52409(abstractC23903, abstractC16579).mo33523()), abstractC23903, iMax, z), null, c10391);
            } catch (C1155 unused) {
                abstractC16579M45556 = null;
            }
            return (abstractC16579M45556 == null || c10391.m26290(EnumC0597.UNCHECKED)) ? false : true;
        } finally {
            this.f65437 = c6095;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21825 m45528(C21825 c21825, AbstractC23903 abstractC23903, int i, boolean z) {
        if ((abstractC23903.mo20276() & 17179869184L) == 0 || !z) {
            return c21825;
        }
        AbstractC16579 abstractC16579M52416 = this.f65444.m52416((AbstractC16579) c21825.last());
        if (abstractC16579M52416 == null) {
            C6171.m17174("Bad varargs = " + c21825.last() + " " + abstractC23903);
            throw null;
        }
        C21825 c21825M48589 = c21825.m48589().f70877.m48597(abstractC16579M52416).m48589();
        while (c21825M48589.m48596() < i) {
            c21825M48589 = c21825M48589.m48591((AbstractC16579) c21825M48589.last());
        }
        return c21825M48589;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC23903 m45548(AbstractC23903 abstractC23903, AbstractC23903 abstractC23904) {
        if (((abstractC23903.mo20276() | abstractC23904.mo20276()) & 4398046511104L) != 0) {
            return (abstractC23903.mo20276() & 4398046511104L) == 0 ? abstractC23903 : abstractC23904;
        }
        return new C14294(this, abstractC23903, abstractC23904);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC23903 m45537(C4603 c4603, AbstractC16579 abstractC16579, AbstractC11242 abstractC11242, C21825 c21825, C21825 c21826, AbstractC9462 abstractC9462, AbstractC23903 abstractC23903, boolean z, boolean z2) {
        C8918 c8918 = new C8918();
        c8918.f30601 = z2;
        abstractC9462.getClass();
        Iterator it = abstractC9462.mo3803(abstractC11242, c8918, EnumC10167.RECURSIVE).iterator();
        AbstractC23903 abstractC23903M45539 = abstractC23903;
        while (it.hasNext()) {
            abstractC23903M45539 = m45539(c4603, abstractC16579, c21825, c21826, (AbstractC23903) it.next(), abstractC23903M45539, z);
        }
        return abstractC23903M45539;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC23903 m45538(C4603 c4603, AbstractC16579 abstractC16579, AbstractC11242 abstractC11242, C21825 c21825, C21825 c21826, boolean z) {
        AbstractC16579 abstractC165710 = abstractC16579.f53222.f77449;
        C21825[] c21825Arr = new C21825[2];
        c21825Arr[0] = C21825.m48588();
        c21825Arr[1] = C21825.m48588();
        EnumC18089 enumC18089 = EnumC18089.f57856;
        C10060 c10060 = new C10060(this, abstractC165710);
        AbstractC23903 abstractC23903 = this.f65440;
        EnumC18089 enumC18089Mo36574 = enumC18089;
        AbstractC23903 abstractC23903M45537 = abstractC23903;
        while (true) {
            boolean zHasNext = c10060.hasNext();
            C23800 c23800 = this.f65444;
            if (zHasNext) {
                AbstractC0618 abstractC0618 = (AbstractC0618) c10060.next();
                C10060 c10061 = c10060;
                abstractC23903M45537 = m45537(c4603, abstractC16579, abstractC11242, c21825, c21826, abstractC0618.mo20272(), abstractC23903M45537, z, true);
                if (abstractC11242 == this.f65436.f77632) {
                    return abstractC23903M45537;
                }
                enumC18089Mo36574 = enumC18089Mo36574 == null ? null : enumC18089Mo36574.mo36574(abstractC0618, this);
                if (enumC18089Mo36574 != null) {
                    Iterator it = c23800.m52439(abstractC0618.f77449).iterator();
                    while (it.hasNext()) {
                        c21825Arr[enumC18089Mo36574.ordinal()] = c23800.m52441(c23800.m52398((AbstractC16579) it.next()), c21825Arr[enumC18089Mo36574.ordinal()]);
                    }
                }
                c10060 = c10061;
            } else {
                if (abstractC23903M45537.f77452.m26576() && (abstractC23903M45537.mo20276() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) == 0) {
                    abstractC23903 = abstractC23903M45537;
                }
                EnumC18089[] enumC18089ArrValues = EnumC18089.values();
                int length = enumC18089ArrValues.length;
                AbstractC23903 abstractC23904 = abstractC23903M45537;
                int i = 0;
                while (i < length) {
                    EnumC18089 enumC180810 = enumC18089ArrValues[i];
                    AbstractC23903 abstractC23905 = abstractC23904;
                    for (AbstractC16579 abstractC165711 : c21825Arr[enumC180810.ordinal()]) {
                        if (abstractC165711.mo16236() && (enumC180810 != EnumC18089.f57854 || (abstractC165711.f53222.mo20276() & 8796093022208L) != 0)) {
                            EnumC18089 enumC180811 = enumC180810;
                            int i2 = i;
                            int i3 = length;
                            AbstractC23903 abstractC23903M45538 = m45537(c4603, abstractC16579, abstractC11242, c21825, c21826, abstractC165711.f53222.mo20272(), abstractC23905, z, true);
                            abstractC23905 = (abstractC23903 != abstractC23903M45538 && abstractC23903.f77452.m26576() && abstractC23903M45538.f77452.m26576() && c23800.m52429(abstractC23903.f77449, abstractC23903M45538.f77449, true)) ? abstractC23903 : abstractC23903M45538;
                            i = i2;
                            enumC180810 = enumC180811;
                            length = i3;
                        }
                    }
                    i++;
                    abstractC23904 = abstractC23905;
                }
                return abstractC23904;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC23903 m45534(C4603 c4603, AbstractC11242 abstractC11242, C21825 c21825, C21825 c21826, boolean z) {
        boolean z2 = false;
        C4603 c4604 = c4603;
        AbstractC23903 abstractC23903M45518 = this.f65440;
        while (true) {
            C4603 c4605 = c4604.f16300;
            Object obj = c4604.f16299;
            if (c4605 != null) {
                boolean z3 = m45514(c4604) ? true : z2;
                C22990 c22990 = (C22990) obj;
                C6171.m17176(c22990.f74721 == null);
                c22990.f74721 = c4603.f16296;
                try {
                    AbstractC23903 abstractC23903M45538 = m45538(c4604, c4604.f16301.f30086.f77449, abstractC11242, c21825, c21826, z);
                    if (abstractC23903M45538.mo20273()) {
                        if (!z3 || abstractC23903M45538.f77452 != EnumC10477.f35879 || abstractC23903M45538.f77448.f77452 != EnumC10477.f35865 || (8 & abstractC23903M45538.mo20276()) != 0) {
                            c22990.f74721 = null;
                            return abstractC23903M45538;
                        }
                        C10267 c10267 = new C10267(abstractC23903M45538, this);
                        c22990.f74721 = null;
                        return c10267;
                    }
                    abstractC23903M45518 = m45518(abstractC23903M45518, abstractC23903M45538);
                    c22990.f74721 = null;
                    C22492 c22492 = c4604.f16301.f30086;
                    c22492.mo49994();
                    z2 = (c22492.f77447 & 8) != 0 ? true : z3;
                    c4604 = c4604.f16300;
                } catch (Throwable th) {
                    c22990.f74721 = null;
                    throw th;
                }
            } else {
                AbstractC23903 abstractC23903M45539 = m45538(c4603, this.f65410.f14262.f77449, abstractC11242, c21825, c21826, z);
                if (abstractC23903M45539.mo20273()) {
                    return abstractC23903M45539;
                }
                AbstractC23903 abstractC23903M455310 = abstractC23903M45518;
                for (AbstractC23903 abstractC23903Mo17330 : c4603.f16295.f34728.m9327(abstractC11242)) {
                    AbstractC23903 abstractC23903 = c4603.f16295.f34728.mo9328(abstractC23903Mo17330).f11719;
                    if (abstractC23903Mo17330.f77452 == EnumC10477.f35879) {
                        if (abstractC23903Mo17330.f77448.f77449 != abstractC23903.f77449) {
                            abstractC23903Mo17330 = abstractC23903Mo17330.mo17330(abstractC23903);
                        }
                        abstractC23903M455310 = m45539(c4603, abstractC23903.f77449, c21825, c21826, !m45553(c4603, abstractC23903.f77449, abstractC23903Mo17330) ? new C23466(this, c4603, abstractC23903.f77449, abstractC23903Mo17330) : abstractC23903Mo17330, abstractC23903M455310, z);
                    }
                }
                if (abstractC23903M455310.mo20273()) {
                    return abstractC23903M455310;
                }
                for (AbstractC23903 abstractC23903Mo17331 : c4603.f16295.f34722.m9327(abstractC11242)) {
                    AbstractC23903 abstractC23904 = c4603.f16295.f34722.mo9328(abstractC23903Mo17331).f11719;
                    if (abstractC23903Mo17331.f77452 == EnumC10477.f35879) {
                        if (abstractC23903Mo17331.f77448.f77449 != abstractC23904.f77449) {
                            abstractC23903Mo17331 = abstractC23903Mo17331.mo17330(abstractC23904);
                        }
                        abstractC23903M455310 = m45539(c4603, abstractC23904.f77449, c21825, c21826, !m45553(c4603, abstractC23904.f77449, abstractC23903Mo17331) ? new C23466(this, c4603, abstractC23904.f77449, abstractC23903Mo17331) : abstractC23903Mo17331, abstractC23903M455310, z);
                    }
                }
                return abstractC23903M455310;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC23903 m45533(C4603 c4603, AbstractC11242 abstractC11242, InterfaceC3915 interfaceC3915) {
        try {
            C22492 c22492M2738 = this.f65423.m2738(c4603.f16295.f34730, abstractC11242);
            return m45551(c4603, (AbstractC0618) c22492M2738, false) ? c22492M2738 : new C23466(this, c4603, null, c22492M2738);
        } catch (C16100 e) {
            return new C9355(this, e);
        } catch (C4146 unused) {
            AbstractC23903 abstractC23903Mo1384 = interfaceC3915.mo1384(c4603, abstractC11242);
            return abstractC23903Mo1384 != null ? abstractC23903Mo1384 : this.f65416;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC23903 m45532(C4603 c4603, AbstractC11242 abstractC11242) {
        C19670 c19670 = c4603.f16295.f34730;
        final C3836 c3836 = this.f65410;
        C7675 c7675M11152 = c3836.m11152(c19670, abstractC11242);
        if (this.f65409 && c4603.f16296.m22847(EnumC18651.f60517)) {
            AbstractC8774 abstractC8774 = ((C14023) c4603.f16296).f46089;
            if (abstractC8774.m22847(EnumC18651.f60473) && C3128.m9472(abstractC8774) == this.f65436.f77589 && C3128.m9460(((C23570) abstractC8774).f76357) == abstractC11242) {
                c7675M11152.mo49994();
                if (c7675M11152.f25395.m9329()) {
                    return m45506(c4603, abstractC11242, new Function() { // from class: l.ۢۗۤ
                        @Override // java.util.function.Function
                        /* JADX INFO: renamed from: andThen */
                        public /* synthetic */ Function mo33696andThen(Function function) {
                            return C4277.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return c3836.m11142((AbstractC11242) obj);
                        }

                        @Override // java.util.function.Function
                        public /* synthetic */ Function compose(Function function) {
                            return C4277.$default$compose(this, function);
                        }
                    }, new BiFunction() { // from class: l.ۗۗۤ
                        public /* synthetic */ BiFunction andThen(Function function) {
                            return C5689.$default$andThen(this, function);
                        }

                        @Override // java.util.function.BiFunction
                        public final Object apply(Object obj, Object obj2) {
                            return c3836.m11157((C19670) obj, (AbstractC11242) obj2);
                        }
                    }, new C1612(4), c7675M11152);
                }
            }
        }
        return c7675M11152;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC23903 m45506(C4603 c4603, AbstractC11242 abstractC11242, Function function, BiFunction biFunction, Predicate predicate, AbstractC23903 abstractC23903) {
        AbstractC23903 abstractC23904;
        for (AbstractC23903 abstractC23905 : (Iterable) function.apply(abstractC11242)) {
            if (predicate.test(abstractC23905)) {
                C19670 c19670 = c4603.f16295.f34730;
                C7675 c7675M52724 = abstractC23905.m52724();
                if (c19670 == c7675M52724.f25392 || c19670.f63148.containsKey(c7675M52724.f25396)) {
                    return new C23466(this, c4603, null, abstractC23905);
                }
                return new C8212(this, c4603, false, abstractC23905);
            }
        }
        C3836 c3836 = this.f65410;
        HashSet<C19670> hashSet = new HashSet(c3836.m11144());
        hashSet.add(c3836.f14288);
        hashSet.remove(c4603.f16295.f34730);
        for (C19670 c19671 : hashSet) {
            if (c19671.f63138 == null) {
                if (c19671.f63152 == null) {
                    this.f65435.m52641(c19671);
                }
                if (c19671.f77452 != EnumC10477.f35866 && (abstractC23904 = (AbstractC23903) biFunction.apply(c19671, abstractC11242)) != null && predicate.test(abstractC23904)) {
                    C19670 c19672 = c4603.f16295.f34730;
                    C7675 c7675M52725 = abstractC23904.m52724();
                    if (c19672 == c7675M52725.f25392 || c19672.f63148.containsKey(c7675M52725.f25396)) {
                        return new C23466(this, c4603, null, abstractC23904);
                    }
                    return new C8212(this, c4603, false, abstractC23904);
                }
            }
        }
        return abstractC23903;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC23903 m45557(C4603 c4603, AbstractC16579 abstractC16579, AbstractC11242 abstractC11242, AbstractC0618 abstractC0618) {
        for (AbstractC23903 abstractC23903 : abstractC0618.mo20272().m9327(abstractC11242)) {
            if (abstractC23903.f77452 == EnumC10477.f35865) {
                return m45553(c4603, abstractC16579, abstractC23903) ? abstractC23903 : new C23466(this, c4603, abstractC16579, abstractC23903);
            }
        }
        return this.f65416;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC23903 m45555(C4603 c4603, AbstractC16579 abstractC16579, AbstractC11242 abstractC11242, AbstractC0618 abstractC0618) {
        AbstractC16579 abstractC165710 = abstractC0618.f77449;
        C23800 c23800 = this.f65444;
        AbstractC16579 abstractC16579M52432 = c23800.m52432(abstractC165710);
        AbstractC23903 abstractC23903M45518 = this.f65416;
        if (abstractC16579M52432 != null && abstractC16579M52432.m39001(EnumC6617.CLASS)) {
            abstractC23903M45518 = m45518(abstractC23903M45518, m45521(c4603, abstractC16579, abstractC11242, abstractC16579M52432.f53222));
        }
        for (C21825 c21825M52439 = c23800.m52439(abstractC0618.f77449); abstractC23903M45518.f77452 != EnumC10477.f35883 && c21825M52439.m48595(); c21825M52439 = c21825M52439.f70877) {
            AbstractC23903 abstractC23903M45521 = m45521(c4603, abstractC16579, abstractC11242, ((AbstractC16579) c21825M52439.f70876).f53222);
            if (!abstractC23903M45518.f77452.m26583() && !abstractC23903M45521.f77452.m26583() && abstractC23903M45521.f77448 != abstractC23903M45518.f77448) {
                abstractC23903M45518 = new C14294(this, abstractC23903M45518, abstractC23903M45521);
            } else {
                abstractC23903M45518 = m45518(abstractC23903M45518, abstractC23903M45521);
            }
        }
        return abstractC23903M45518;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC23903 m45521(C4603 c4603, AbstractC16579 abstractC16579, AbstractC11242 abstractC11242, AbstractC0618 abstractC0618) {
        AbstractC23903 abstractC23903M45557 = m45557(c4603, abstractC16579, abstractC11242, abstractC0618);
        return abstractC23903M45557 != this.f65416 ? abstractC23903M45557 : m45555(c4603, abstractC16579, abstractC11242, abstractC0618);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC23903 m45531(C4603 c4603, AbstractC3110 abstractC3110, AbstractC11242 abstractC11242, InterfaceC3915 interfaceC3915) {
        Iterator it = abstractC3110.m9327(abstractC11242).iterator();
        AbstractC23903 abstractC23903M45518 = this.f65416;
        while (it.hasNext()) {
            AbstractC23903 abstractC23903M45533 = m45533(c4603, ((AbstractC23903) it.next()).mo50003(), interfaceC3915);
            EnumC10477 enumC10477 = abstractC23903M45518.f77452;
            EnumC10477 enumC10478 = EnumC10477.f35865;
            if (enumC10477 == enumC10478 && abstractC23903M45533.f77452 == enumC10478 && abstractC23903M45518 != abstractC23903M45533) {
                return new C14294(this, abstractC23903M45518, abstractC23903M45533);
            }
            abstractC23903M45518 = m45518(abstractC23903M45518, abstractC23903M45533);
        }
        return abstractC23903M45518;
    }

    /* JADX WARN: Code duplicated, block: B:130:0x0231  */
    /* JADX WARN: Code duplicated, block: B:133:0x023a  */
    /* JADX WARN: Code duplicated, block: B:135:0x0242  */
    /* JADX WARN: Code duplicated, block: B:136:0x0247  */
    /* JADX WARN: Code duplicated, block: B:139:0x0257  */
    /* JADX WARN: Code duplicated, block: B:179:0x0237 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x0258 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC23903 m45530(C3107 c3107, C4603 c4603, AbstractC11242 abstractC11242, C21059 c21059) {
        long j;
        AbstractC23903 abstractC23903M45518;
        AbstractC23903 abstractC23903M45532;
        AbstractC23903 c10267;
        C8753 c8753;
        C22492 c22492;
        boolean zM47467 = c21059.m47467(C21059.f68595);
        AbstractC23903 abstractC23903M45531 = this.f65416;
        if (zM47467) {
            AbstractC23903 c23466 = this.f65407;
            boolean z = false;
            C4603 c4604 = c4603;
            while (true) {
                if (c4604.f16300 != null) {
                    Iterator it = ((C22990) c4604.f16299).f74722.m9327(abstractC11242).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            AbstractC23903 abstractC23903 = (AbstractC23903) it.next();
                            j = 0;
                            if (abstractC23903.f77452 == EnumC10477.f35878 && (abstractC23903.f77447 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0) {
                                if (z) {
                                    c23466 = new C10267(abstractC23903, this);
                                } else {
                                    abstractC23903M45532 = abstractC23903;
                                }
                                abstractC23903M45532 = c23466;
                                break;
                            }
                        } else {
                            j = 0;
                            abstractC23903M45532 = null;
                        }
                        if (m45514(c4604)) {
                            z = true;
                        }
                        if (abstractC23903M45532 == null) {
                            C22492 c22493 = c4604.f16301.f30086;
                            abstractC23903M45532 = m45536(c4604, c22493.f77449, abstractC11242, c22493);
                        }
                        if (abstractC23903M45532.mo20273()) {
                            if (!z || abstractC23903M45532.f77452 != EnumC10477.f35878 || abstractC23903M45532.f77448.f77452 != EnumC10477.f35865 || (abstractC23903M45532.mo20276() & 8) != j) {
                                break;
                            }
                            c23466 = new C10267(abstractC23903M45532, this);
                            abstractC23903M45532 = c23466;
                            break;
                            abstractC23903M45531 = abstractC23903M45532;
                            return m45509(c3107, abstractC23903M45531, abstractC11242);
                        }
                        c23466 = m45518(c23466, abstractC23903M45532);
                        C22492 c22494 = c4604.f16301.f30086;
                        c22494.mo49994();
                        if ((c22494.f77447 & 8) != j) {
                            z = true;
                        }
                        c4604 = c4604.f16300;
                    }
                } else {
                    C22492 c22495 = this.f65410.f14262;
                    AbstractC23903 abstractC23903M45536 = m45536(c4603, c22495.f77449, abstractC11242, c22495);
                    if (!abstractC23903M45536.mo20273()) {
                        if (!c23466.mo20273()) {
                            C10164 c10164 = c4603.f16295;
                            int i = 2;
                            AbstractC3110[] abstractC3110Arr = {c10164.f34728, c10164.f34722};
                            int i2 = 0;
                            AbstractC23903 abstractC23904 = null;
                            while (true) {
                                if (i2 < i) {
                                    AbstractC3110 abstractC3110 = abstractC3110Arr[i2];
                                    Iterator it2 = abstractC3110.m9327(abstractC11242).iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            AbstractC23903 abstractC23905 = (AbstractC23903) it2.next();
                                            EnumC10477 enumC10477 = abstractC23905.f77452;
                                            EnumC10477 enumC10478 = EnumC10477.f35878;
                                            if (enumC10477 == enumC10478) {
                                                if (!c23466.f77452.m26583() && abstractC23905.f77448 != c23466.f77448) {
                                                    abstractC23903M45532 = new C14294(this, c23466, abstractC23905);
                                                } else if (!c23466.f77452.m26579(enumC10478)) {
                                                    AbstractC23903 abstractC23906 = abstractC3110.mo9328(abstractC23905).f11719;
                                                    if (m45553(c4603, abstractC23906.f77449, abstractC23905)) {
                                                        abstractC23904 = abstractC23906;
                                                        c23466 = abstractC23905;
                                                    } else {
                                                        abstractC23904 = abstractC23906;
                                                        c23466 = new C23466(this, c4603, abstractC23906.f77449, abstractC23905);
                                                    }
                                                }
                                            }
                                        } else if (!c23466.mo20273()) {
                                            i2++;
                                            i = 2;
                                        }
                                        j = 0;
                                        break;
                                    }
                                }
                                AbstractC23903 abstractC23907 = abstractC23904;
                                abstractC23903M45532 = c23466;
                                if (abstractC23903M45532.f77452 == EnumC10477.f35878 && abstractC23903M45532.f77448.f77449 != abstractC23907.f77449) {
                                    abstractC23903M45532 = abstractC23903M45532.mo17330(abstractC23907);
                                }
                                j = 0;
                                break;
                            }
                        }
                    } else {
                        c23466 = abstractC23903M45536;
                    }
                    j = 0;
                    abstractC23903M45532 = c23466;
                    break;
                }
            }
            if (abstractC23903M45532.mo20273()) {
                abstractC23903M45531 = abstractC23903M45532;
            } else {
                abstractC23903M45518 = m45518(abstractC23903M45531, abstractC23903M45532);
            }
            return m45509(c3107, abstractC23903M45531, abstractC11242);
        }
        j = 0;
        abstractC23903M45518 = abstractC23903M45531;
        if (c21059.m47467(C21059.f68585)) {
            if (abstractC11242 != this.f65436.f77594) {
                boolean z2 = false;
                C4603 c4605 = c4603;
                AbstractC23903 abstractC23903M45519 = abstractC23903M45531;
                while (true) {
                    if (c4605.f16300 != null) {
                        Iterator it3 = ((C22990) c4605.f16299).f74722.m9327(abstractC11242).iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                c10267 = abstractC23903M45531;
                                break;
                            }
                            c10267 = (AbstractC23903) it3.next();
                            EnumC10477 enumC10479 = c10267.f77452;
                            EnumC10477 enumC104710 = EnumC10477.f35865;
                            if (enumC10479 == enumC104710) {
                                if (!c10267.f77449.m39001(EnumC6617.TYPEVAR) || (!z2 && (!m45514(c4605) || c10267.f77448.f77452 != enumC104710))) {
                                    break;
                                    break;
                                    break;
                                }
                                c10267 = new C10267(c10267, this);
                                break;
                            }
                        }
                        if (m45514(c4605)) {
                            z2 = true;
                        }
                        C22492 c22496 = c4605.f16301.f30086;
                        AbstractC23903 abstractC23903M45557 = m45557(c4605, c22496.f77449, abstractC11242, c22496);
                        if (c10267 != abstractC23903M45531 && (c4603.f16298 || abstractC23903M45557 == abstractC23903M45531 || (c10267.f77452 == EnumC10477.f35865 && c10267.mo20273() && c10267.f77448.f77452 == EnumC10477.f35879))) {
                            abstractC23903M45531 = c10267;
                            break;
                        }
                        if (abstractC23903M45557 == abstractC23903M45531) {
                            C22492 c22497 = c4605.f16301.f30086;
                            abstractC23903M45557 = m45555(c4605, c22497.f77449, abstractC11242, c22497);
                        }
                        if (z2 && abstractC23903M45557.f77452 == EnumC10477.f35865) {
                            AbstractC16579 abstractC16579 = abstractC23903M45557.f77449;
                            EnumC6617 enumC6617 = EnumC6617.CLASS;
                            if (abstractC16579.m39001(enumC6617) && abstractC23903M45557.f77449.mo1934().m39001(enumC6617) && c4605.f16301.f30086.f77449.mo1942() && abstractC23903M45557.f77449.mo1934().mo1942()) {
                                abstractC23903M45531 = new C10267(abstractC23903M45557, this);
                                break;
                            }
                            if (abstractC23903M45557.mo20273()) {
                                abstractC23903M45531 = abstractC23903M45557;
                                break;
                            }
                            abstractC23903M45519 = m45518(abstractC23903M45519, abstractC23903M45557);
                            if (c4605.f16298) {
                                c8753 = (C8753) c4605.f16296;
                            } else {
                                c8753 = c4605.f16301;
                            }
                            c22492 = c8753.f30086;
                            c22492.mo49994();
                            if ((c22492.f77447 & 8) != j) {
                                z2 = true;
                            }
                            c4605 = c4605.f16300;
                        } else {
                            if (abstractC23903M45557.mo20273()) {
                                abstractC23903M45531 = abstractC23903M45557;
                                break;
                            }
                            abstractC23903M45519 = m45518(abstractC23903M45519, abstractC23903M45557);
                            if (c4605.f16298) {
                                c8753 = (C8753) c4605.f16296;
                            } else {
                                c8753 = c4605.f16301;
                            }
                            c22492 = c8753.f30086;
                            c22492.mo49994();
                            if ((c22492.f77447 & 8) != j) {
                                z2 = true;
                            }
                            c4605 = c4605.f16300;
                        }
                    } else {
                        if (!c4603.f16296.m22847(EnumC18651.f60517)) {
                            abstractC23903M45531 = m45531(c4603, c4603.f16295.f34728, abstractC11242, this.f65427);
                            if (!abstractC23903M45531.mo20273()) {
                                AbstractC23903 abstractC23903M455110 = m45518(abstractC23903M45519, abstractC23903M45531);
                                AbstractC9462 abstractC9462 = c4603.f16295.f34723;
                                C23427 c23427 = this.f65446;
                                abstractC23903M45531 = m45531(c4603, abstractC9462, abstractC11242, c23427);
                                if (!abstractC23903M45531.mo20273()) {
                                    AbstractC23903 abstractC23903M455111 = m45518(abstractC23903M455110, abstractC23903M45531);
                                    C7675 c7675 = c4603.f16295.f34721;
                                    c7675.mo49994();
                                    abstractC23903M45531 = m45531(c4603, c7675.f25395, abstractC11242, c23427);
                                    if (!abstractC23903M45531.mo20273()) {
                                        AbstractC23903 abstractC23903M455112 = m45518(abstractC23903M455111, abstractC23903M45531);
                                        abstractC23903M45531 = m45531(c4603, c4603.f16295.f34722, abstractC11242, this.f65431);
                                        if (!abstractC23903M45531.mo20273()) {
                                            abstractC23903M45531 = m45518(abstractC23903M455112, abstractC23903M45531);
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
                                break;
                            }
                            break;
                        }
                        abstractC23903M45531 = abstractC23903M45519;
                        break;
                    }
                }
            }
            if (!abstractC23903M45531.mo20273()) {
                abstractC23903M45518 = m45518(abstractC23903M45518, abstractC23903M45531);
            }
            return m45509(c3107, abstractC23903M45531, abstractC11242);
        }
        abstractC23903M45532 = abstractC23903M45518;
        if (c21059.m47467(C21059.f68583)) {
            abstractC23903M45532 = m45532(c4603, abstractC11242);
        }
        abstractC23903M45531 = abstractC23903M45532;
        return m45509(c3107, abstractC23903M45531, abstractC11242);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004a  */
    /* JADX WARN: Code duplicated, block: B:23:0x004f  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC23903 m45544(C23570 c23570, C4603 c4603, AbstractC0618 abstractC0618, AbstractC11242 abstractC11242, C21059 c21059) {
        AbstractC23903 abstractC23903M45532;
        AbstractC11242 abstractC11242M2876 = AbstractC0618.m2876(abstractC11242, abstractC0618);
        boolean zM47467 = c21059.m47467(C21059.f68585);
        AbstractC23903 abstractC23903M45518 = this.f65416;
        if (zM47467) {
            abstractC23903M45532 = m45533(c4603, abstractC11242M2876, (!this.f65409 || c21059.m47467(C21059.f68583) || abstractC0618.mo20273() || ((C22990) c4603.f16299).f74713.f12499) ? this.f65446 : this.f65439);
            if (abstractC23903M45532.mo20273()) {
                if (abstractC11242 != abstractC23903M45532.f77453) {
                }
            } else {
                abstractC23903M45518 = m45518(abstractC23903M45518, abstractC23903M45532);
            }
            if (c21059.m47467(C21059.f68583)) {
                abstractC23903M45532 = m45532(c4603, abstractC11242M2876);
            } else {
                abstractC23903M45532 = abstractC23903M45518;
            }
        } else if (c21059.m47467(C21059.f68583)) {
            abstractC23903M45532 = m45532(c4603, abstractC11242M2876);
        } else {
            abstractC23903M45532 = abstractC23903M45518;
        }
        return m45509(c23570, abstractC23903M45532, abstractC11242);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:13:0x0030  */
    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC23903 m45540(AbstractC8774 abstractC8774, C4603 c4603, AbstractC16579 abstractC16579, AbstractC11242 abstractC11242, C21059 c21059) {
        AbstractC23903 abstractC23903M45521;
        boolean zM47467 = c21059.m47467(C21059.f68595);
        AbstractC23903 abstractC23903M45518 = this.f65416;
        if (zM47467) {
            abstractC23903M45521 = m45536(c4603, abstractC16579, abstractC11242, abstractC16579.f53222);
            if (!abstractC23903M45521.mo20273()) {
                abstractC23903M45518 = m45518(abstractC23903M45518, abstractC23903M45521);
                if (c21059.m47467(C21059.f68585)) {
                    abstractC23903M45521 = m45521(c4603, abstractC16579, abstractC11242, abstractC16579.f53222);
                    if (!abstractC23903M45521.mo20273()) {
                        abstractC23903M45521 = m45518(abstractC23903M45518, abstractC23903M45521);
                    }
                } else {
                    abstractC23903M45521 = abstractC23903M45518;
                }
            }
        } else if (c21059.m47467(C21059.f68585)) {
            abstractC23903M45521 = m45521(c4603, abstractC16579, abstractC11242, abstractC16579.f53222);
            if (!abstractC23903M45521.mo20273()) {
                abstractC23903M45521 = m45518(abstractC23903M45518, abstractC23903M45521);
            }
        } else {
            abstractC23903M45521 = abstractC23903M45518;
        }
        return m45509(abstractC8774, abstractC23903M45521, abstractC11242);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC23903 m45509(InterfaceC12260 interfaceC12260, AbstractC23903 abstractC23903, AbstractC11242 abstractC11242) {
        EnumC10477 enumC10477 = abstractC23903.f77452;
        if (enumC10477 == EnumC10477.f35865 || enumC10477 == EnumC10477.f35872) {
            boolean z = this.f65425;
            C23942 c23942 = this.f65436;
            if (z && abstractC11242.equals(c23942.f77534)) {
                return new C13857(this, c23942.f77534);
            }
            AbstractC11242 abstractC11243 = c23942.f77597;
            AbstractC11242 abstractC11244 = c23942.f77597;
            if (abstractC11242.equals(abstractC11243)) {
                if (this.f65415) {
                    return new C13857(this, abstractC11244);
                }
                if (interfaceC12260 != null) {
                    C14065 c14065 = C9768.f32836;
                    this.f65441.m48204(interfaceC12260, new C14065("compiler", "illegal.ref.to.restricted.type", abstractC11244));
                }
            }
        }
        return abstractC23903;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC23903 m45546(AbstractC23903 abstractC23903, InterfaceC12260 interfaceC12260, AbstractC23903 abstractC23904, AbstractC16579 abstractC16579, AbstractC11242 abstractC11242, boolean z, C21825 c21825, C21825 c21826, InterfaceC19501 interfaceC19501) {
        C11948 c11948Mo8964;
        if (!abstractC23903.f77452.m26583()) {
            return abstractC23903;
        }
        AbstractC8856 abstractC8856 = (AbstractC8856) abstractC23903.mo10880();
        AbstractC23903 abstractC23903Mo22991 = abstractC8856.mo22991(abstractC11242, z ? abstractC16579.f53222 : this.f65410.f14243);
        C21825 c21825Mo30286 = interfaceC19501.mo30286(abstractC23903Mo22991, c21825);
        if (interfaceC19501.mo30287(abstractC16579, c21825Mo30286, c21826) && (c11948Mo8964 = abstractC8856.mo8964(EnumC17198.ERROR, interfaceC12260, abstractC23904, abstractC16579, abstractC11242, c21825Mo30286, c21826)) != null) {
            c11948Mo8964.m29766(EnumC0264.RESOLVE_ERROR);
            this.f65441.mo46176(c11948Mo8964);
        }
        return abstractC23903Mo22991;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC23903 m45545(AbstractC23903 abstractC23903, InterfaceC12260 interfaceC12260, AbstractC23903 abstractC23904, AbstractC16579 abstractC16579, AbstractC11242 abstractC11242, boolean z) {
        return m45546(abstractC23903, interfaceC12260, abstractC23904, abstractC16579, abstractC11242, z, C21825.m48588(), (C21825) null, this.f65412);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45550(AbstractC5930 abstractC5930, AbstractC23903 abstractC23903) {
        if ((abstractC23903.mo20276() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) == 0 || (abstractC23903.mo20276() & 8796093022208L) != 0) {
            return;
        }
        EnumC7654 enumC7654M38160 = C16121.m38160(abstractC23903);
        AbstractC23903 abstractC23903M52708 = abstractC23903.m52708();
        C5909 c5909 = C23879.f77204;
        this.f65441.m48199(abstractC5930, new C5909("compiler", "abstract.cant.be.accessed.directly", enumC7654M38160, abstractC23903, abstractC23903M52708));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC23903 m45543(InterfaceC12260 interfaceC12260, C4603 c4603, AbstractC23903 abstractC23903, AbstractC16579 abstractC16579, AbstractC11242 abstractC11242, C21825 c21825, C21825 c21826) {
        return m45535(c4603, interfaceC12260, abstractC23903, new C6095(this), new C5120(this, abstractC11242, abstractC16579, c21825, c21826));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC23903 m45547(AbstractC23903 abstractC23903, AbstractC16579 abstractC16579) {
        AbstractC11242 abstractC11242 = abstractC23903.f77453;
        AbstractC9462 abstractC9462 = this.f65408;
        Iterator it = abstractC9462.m9327(abstractC11242).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C23800 c23800 = this.f65444;
            if (zHasNext) {
                AbstractC23903 abstractC23904 = (AbstractC23903) it.next();
                if (c23800.m52399(abstractC16579, abstractC23904.f77449) && abstractC23903.f77448 == abstractC23904.f77448) {
                    return abstractC23904;
                }
            } else {
                AbstractC16579 abstractC16579Mo16235 = abstractC23903.f77449.mo16235();
                C3836 c3836 = this.f65410;
                if (!c23800.m52399(abstractC16579Mo16235, c3836.f14275) && !c23800.m52399(abstractC16579Mo16235, abstractC16579.mo16235())) {
                    abstractC16579 = new C13757(abstractC16579.mo33523(), abstractC16579Mo16235, abstractC16579.mo33524(), c3836.f14240);
                }
                C22054 c22054 = new C22054((abstractC23903.mo20276() & 15) | 137438954496L, abstractC23903.f77453, abstractC16579, abstractC23903.f77448, abstractC23903);
                if (!abstractC16579.mo1926()) {
                    abstractC9462.mo24224(c22054);
                }
                return c22054;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18258 m45527(InterfaceC12260 interfaceC12260, C4603 c4603, AbstractC16579 abstractC16579, AbstractC11242 abstractC11242, C21825 c21825, C21825 c21826) {
        C6095 c6095 = new C6095(this);
        c6095.f20638 = true;
        AbstractC23903 abstractC23903M45535 = m45535(c4603, interfaceC12260, abstractC16579.f53222, c6095, new C5120(this, abstractC11242, abstractC16579, c21825, c21826));
        if (abstractC23903M45535.f77452 == EnumC10477.f35879) {
            return (C18258) abstractC23903M45535;
        }
        C14377 c14377 = C14707.f48054;
        throw new C0969(this.f65420.m51910(new C14377("compiler", "fatal.err.cant.locate.meth", abstractC11242)).toString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC23903 m45542(InterfaceC12260 interfaceC12260, C4603 c4603, AbstractC16579 abstractC16579, C21825 c21825, C21825 c21826) {
        return m45535(c4603, interfaceC12260, abstractC16579.f53222, new C6095(this), new C0886(this, this.f65436.f77632, abstractC16579, c21825, c21826, interfaceC12260));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC23903 m45512(C20145 c20145, C8378 c8378, C4603 c4603, AbstractC16579 abstractC16579, C21825 c21825, C21825 c21826, boolean z) {
        AbstractC23903 abstractC23903M45507 = c20145.m45507(c4603, abstractC16579, c21825, c21826, z);
        C21017 c21017 = c20145.f65433;
        AbstractC23903 abstractC23903 = ((C22990) c4603.f16299).f74722.f11719;
        c21017.getClass();
        c21017.m47273(new C2672(c8378), abstractC23903, abstractC23903M45507);
        c21017.m47299(c8378, ((C22990) c4603.f16299).f74722.f11719, abstractC23903M45507);
        return abstractC23903M45507;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC23903 m45507(C4603 c4603, AbstractC16579 abstractC16579, C21825 c21825, C21825 c21826, boolean z) {
        C21825 c21825M48588;
        AbstractC9462 abstractC9462Mo20272 = (abstractC16579.f53222.m52721() ? this.f65410.f14275.f53222 : abstractC16579.f53222).mo20272();
        C23942 c23942 = this.f65436;
        AbstractC23903 abstractC23903M45539 = this.f65440;
        for (AbstractC23903 abstractC23903 : abstractC9462Mo20272.m9327(c23942.f77632)) {
            if (abstractC23903.f77452 == EnumC10477.f35879 && (abstractC23903.f77447 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0) {
                if (abstractC23903.f77449.m39001(EnumC6617.FORALL)) {
                    c21825M48588 = ((C10894) abstractC23903.f77449).f37076;
                } else {
                    c21825M48588 = C21825.m48588();
                }
                C21825 c21825Mo1938 = abstractC16579.f53222.f77449.mo1938();
                c21825Mo1938.getClass();
                abstractC23903M45539 = m45539(c4603, abstractC16579, c21825, c21826, new C3708(abstractC23903.mo20276(), c23942.f77632, new C10894(this.f65444.m52407(abstractC23903.f77449.mo27295(), abstractC16579), c21825M48588.m48594(c21825Mo1938)), abstractC16579.f53222, abstractC23903), abstractC23903M45539, z);
            }
        }
        return abstractC23903M45539;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22967 m45529(AbstractC16579 abstractC16579, EnumC11678 enumC11678, C6966 c6966, C21825 c21825, C21825 c21826, AbstractC11242 abstractC11242) {
        if (!abstractC11242.equals(this.f65436.f77632)) {
            return new C12446(this, c6966, abstractC11242, abstractC16579, c21825, c21826, enumC11678);
        }
        if (abstractC16579.m39001(EnumC6617.ARRAY)) {
            return new C1592(this, c6966, abstractC16579, c21825, c21826, enumC11678);
        }
        return new C5389(this, c6966, abstractC16579, c21825, c21826, enumC11678);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2068 m45523(C4603 c4603, C6966 c6966, AbstractC16579 abstractC16579, AbstractC11242 abstractC11242, C21825 c21825, C21825 c21826, AbstractC16579 abstractC165710, AbstractC10766 abstractC10766, C19524 c19524, AbstractC6738 abstractC6738) {
        C8150 c8150;
        C8150 c8151;
        C8150 c8150Mo17750;
        EnumC11678 enumC11678;
        AbstractC22967 abstractC22967M45529 = m45529(abstractC16579, EnumC11678.f39283, c6966, c21825, c21826, abstractC11242);
        AbstractC8774 abstractC8774 = c4603.f16296;
        C22990 c22990 = (C22990) c4603.f16299;
        C4603 c4603M12747 = c4603.m12747(abstractC8774, c22990.m50854(c22990.f74722));
        C6095 c6095 = new C6095(this);
        c6095.f20635 = abstractC10766;
        AbstractC8774 abstractC8775 = c4603.f16296;
        abstractC8775.getClass();
        AbstractC23903 abstractC23903M45535 = m45535(c4603M12747, abstractC8775, abstractC16579.f53222, c6095, abstractC22967M45529);
        C8150 c8152 = new C8150(abstractC23903M45535, c6095);
        boolean z = this.f65421;
        if (z) {
            m45513(c6966, c6095, abstractC23903M45535, true);
        }
        C4603 c4603M12748 = c4603.m12747(c4603.f16296, c22990.m50854(c22990.f74722));
        AbstractC22967 abstractC22967Mo30921 = abstractC22967M45529.mo30921(c19524);
        if (abstractC22967Mo30921 == null) {
            c8150 = c8152;
            c8151 = this.f65422;
        } else {
            C6095 c6096 = new C6095(this);
            c6096.f20635 = abstractC10766;
            AbstractC8774 abstractC8776 = c4603.f16296;
            abstractC8776.getClass();
            c8150 = c8152;
            AbstractC23903 abstractC23903M45536 = m45535(c4603M12748, abstractC8776, abstractC16579.f53222, c6096, abstractC22967Mo30921);
            c8151 = new C8150(abstractC23903M45536, c6096);
            if (z) {
                m45513(c6966, c6096, abstractC23903M45536, false);
            }
        }
        if (c8151 != abstractC6738.f22678.f65422) {
            c8150Mo17750 = abstractC6738.mo17751(c8150, c8151);
        } else {
            c8150Mo17750 = abstractC6738.mo17750(c8150);
        }
        AbstractC23903 abstractC23903 = c8150Mo17750.f28503;
        if (c8150Mo17750 == c8151) {
            abstractC22967M45529 = abstractC22967Mo30921;
        }
        C2068 c2068 = new C2068(abstractC23903, abstractC22967M45529);
        if (c8150Mo17750 == c8151) {
            enumC11678 = ((C22990) c4603M12748.f16299).f74727;
        } else {
            enumC11678 = ((C22990) c4603M12747.f16299).f74727;
        }
        c22990.f74727 = enumC11678;
        if (!abstractC23903.f77452.m26583()) {
            C18258 c18258 = (C18258) abstractC23903;
            if ((c18258.f77447 & 70368744177664L) != 0) {
                c22990.f74727 = EnumC11678.f39282;
                return new C2068(m45547(c18258, abstractC165710), abstractC22967M45529);
            }
        }
        return c2068;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m45513(C6966 c6966, C6095 c6095, AbstractC23903 abstractC23903, boolean z) {
        C23549 c23549;
        C11948 c11948M51910;
        C19003 c19003 = new C19003();
        Iterator it = c6095.f20639.iterator();
        char c = 0;
        int i = -1;
        int i2 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            c23549 = this.f65420;
            if (!zHasNext) {
                break;
            }
            C17384 c17384 = (C17384) it.next();
            EnumC11678 enumC11678 = c6095.f20637;
            EnumC11678 enumC11679 = c17384.f55331;
            AbstractC23903 abstractC23904 = c17384.f55329;
            if (enumC11678 == enumC11679 && c17384.m40497()) {
                if (abstractC23904.f77449.m39001(EnumC6617.FORALL)) {
                    AbstractC16579 abstractC16579 = c17384.f55332;
                    C14377 c14377 = C14707.f48054;
                    Object[] objArr = new Object[1];
                    objArr[c] = abstractC16579;
                    c11948M51910 = c23549.m51910(new C14377("compiler", "partial.inst.sig", objArr));
                } else {
                    c11948M51910 = null;
                }
                c19003.m43723(c23549.m51914(c11948M51910 == null ? "applicable.method.found.2" : "applicable.method.found.3", Integer.valueOf(i2), abstractC23904.mo22992() ? C14707.f48045 : C14707.f48117, abstractC23904, c11948M51910));
                if (abstractC23904 == abstractC23903) {
                    i = i2;
                }
                i2++;
            }
            c = 0;
        }
        C20414 c20414 = this.f65441;
        c20414.mo46176(new C1675(c23549.m51909((EnumC0597) null, EnumSet.noneOf(EnumC0264.class), c20414.m48186(), c6966, c23549.m51913("method.ref.search.results.multi", z ? C14707.f48057 : C14707.f48043, c6966.toString(), Integer.valueOf(i))), c19003.m43726()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC23903 m45535(C4603 c4603, InterfaceC12260 interfaceC12260, AbstractC23903 abstractC23903, C6095 c6095, AbstractC10329 abstractC10329) {
        EnumC10477 enumC10477;
        C6095 c6096 = this.f65437;
        try {
            AbstractC23903 abstractC23904 = this.f65440;
            this.f65437 = c6095;
            for (EnumC11678 enumC11678 : this.f65405) {
                if (enumC11678.ordinal() > abstractC10329.f35431.ordinal() || !abstractC23904.f77452.m26583() || (enumC10477 = abstractC23904.f77452) == EnumC10477.f35883 || enumC10477 == EnumC10477.f35882) {
                    break;
                    break;
                    break;
                    break;
                }
                C6095 c6097 = this.f65437;
                EnumC11678 enumC11679 = c6097.f20637;
                c6097.f20637 = enumC11678;
                AbstractC23903 abstractC23903Mo5434 = abstractC10329.mo5434(c4603, enumC11678);
                abstractC10329.mo8018(interfaceC12260, abstractC23903Mo5434);
                AbstractC23903 abstractC23903Mo29177 = enumC11678.mo29177(abstractC23904, abstractC23903Mo5434);
                C22990 c22990 = (C22990) c4603.f16299;
                if (abstractC23904 == abstractC23903Mo29177) {
                    enumC11678 = enumC11679;
                }
                c22990.f74727 = enumC11678;
                abstractC23904 = abstractC23903Mo29177;
            }
            return abstractC10329.mo8017(c4603, interfaceC12260, abstractC23903, abstractC23904);
        } finally {
            this.f65437 = c6096;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC23903 m45541(InterfaceC12260 interfaceC12260, C4603 c4603, AbstractC0618 abstractC0618, AbstractC11242 abstractC11242) {
        AbstractC23903 abstractC23903Mo3804;
        boolean z = false;
        for (C4603 c4604 = c4603; c4604.f16300 != null; c4604 = c4604.f16300) {
            if (m45514(c4604)) {
                z = true;
            }
            if (c4604.f16301.f30086 == abstractC0618 && (abstractC23903Mo3804 = ((C22990) c4604.f16299).f74722.mo3804(abstractC11242, (Predicate) null)) != null) {
                AbstractC23903 c10267 = z ? new C10267(abstractC23903Mo3804, this) : abstractC23903Mo3804;
                AbstractC16579 abstractC16579 = c4603.f16301.f30086.f77449;
                return m45545(c10267, interfaceC12260, (AbstractC23903) abstractC16579.f53222, abstractC16579, abstractC11242, true);
            }
            C22492 c22492 = c4604.f16301.f30086;
            c22492.mo49994();
            if ((c22492.f77447 & 8) != 0) {
                z = true;
            }
        }
        boolean zM52721 = abstractC0618.m52721();
        C3836 c3836 = this.f65410;
        C20414 c20414 = this.f65441;
        if (zM52721) {
            C23942 c23942 = this.f65436;
            if (abstractC11242 == c23942.f77638 && !m45514(c4603)) {
                C22492 c22493 = c4603.f16301.f30086;
                C23800 c23800 = this.f65444;
                if (c23800.m52389(abstractC0618, (AbstractC0618) c22493)) {
                    AbstractC16579 abstractC165710 = c4603.f16301.f30190;
                    C19003 c19003 = new C19003();
                    for (AbstractC16579 abstractC165711 : c23800.m52439(abstractC165710)) {
                        boolean z2 = true;
                        for (AbstractC16579 abstractC165712 : c23800.m52356(abstractC165710)) {
                            if (abstractC165711 != abstractC165712 && !abstractC165712.m39001(EnumC6617.ERROR) && c23800.m52413(abstractC165712, abstractC165711, false)) {
                                z2 = false;
                            }
                        }
                        if (z2) {
                            c19003.m43723(abstractC165711);
                        }
                    }
                    for (AbstractC16579 abstractC165713 : c19003.m43726()) {
                        if (abstractC165713.f53222 == abstractC0618) {
                            ((C22990) c4603.f16299).f74720 = abstractC165713;
                            return new C6263(0L, c23942.f77638, c23800.m52423(abstractC0618, c4603.f16301.f30190), c4603.f16301.f30086);
                        }
                    }
                    for (AbstractC16579 abstractC165714 : c23800.m52356(c4603.f16301.f30190)) {
                        if (abstractC165714.f53222.mo50008((AbstractC23903) abstractC0618, c23800) && abstractC165714.f53222 != abstractC0618) {
                            C14377 c14377 = C14707.f48054;
                            C14377 c14378 = new C14377("compiler", "redundant.supertype", abstractC0618, abstractC165714);
                            C5909 c5909 = C23879.f77204;
                            c20414.m48199(interfaceC12260, new C5909("compiler", "illegal.default.super.call", abstractC0618, c14378));
                            return c3836.f14276;
                        }
                    }
                    C6171.m17170();
                    throw null;
                }
            }
        }
        C5909 c59010 = C23879.f77204;
        c20414.m48199(interfaceC12260, new C5909("compiler", "not.encl.class", abstractC0618));
        return c3836.f14276;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m45552(C4603 c4603, AbstractC16579 abstractC16579) {
        AbstractC23903 abstractC23903M45508;
        EnumC6617 enumC6617 = EnumC6617.CLASS;
        return abstractC16579.m39001(enumC6617) && abstractC16579.mo1934().m39001(enumC6617) && ((abstractC23903M45508 = m45508(c4603, (AbstractC23903) abstractC16579.f53222, false)) == null || abstractC23903M45508.f77452.m26583());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC23903 m45508(C4603 c4603, AbstractC23903 abstractC23903, boolean z) {
        AbstractC23903 abstractC23903Mo3804;
        AbstractC11242 abstractC11242 = this.f65436.f77533;
        if (z) {
            c4603 = c4603.f16300;
        }
        if (c4603 != null) {
            boolean z2 = false;
            while (c4603 != null && c4603.f16300 != null) {
                if (m45514(c4603)) {
                    z2 = true;
                }
                if (c4603.f16301.f30086.mo50008((AbstractC23903) abstractC23903.f77448.m52720(), this.f65444) && (abstractC23903Mo3804 = ((C22990) c4603.f16299).f74722.mo3804(abstractC11242, (Predicate) null)) != null) {
                    return z2 ? new C10267(abstractC23903Mo3804, this) : abstractC23903Mo3804;
                }
                C22492 c22492 = c4603.f16301.f30086;
                c22492.mo49994();
                if ((c22492.f77447 & 8) != 0) {
                    z2 = true;
                }
                c4603 = c4603.f16300;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m45526(InterfaceC12260 interfaceC12260, C4603 c4603, AbstractC16579 abstractC16579, boolean z) {
        AbstractC23903 abstractC23903M45545;
        boolean zM26580 = abstractC16579.f53222.f77448.f77452.m26580(C21059.f68591);
        C20414 c20414 = this.f65441;
        if (zM26580) {
            abstractC23903M45545 = m45541(interfaceC12260, c4603, abstractC16579.mo1934().f53222, this.f65436.f77533);
        } else {
            AbstractC0618 abstractC0618 = abstractC16579.f53222;
            AbstractC23903 abstractC23903M45508 = m45508(c4603, (AbstractC23903) abstractC0618, z);
            if (abstractC23903M45508 == null) {
                C5909 c5909 = C23879.f77204;
                c20414.m48199(interfaceC12260, new C5909("compiler", "encl.class.required", abstractC0618));
                abstractC23903M45545 = this.f65410.f14276;
            } else {
                AbstractC16579 abstractC165710 = c4603.f16301.f30086.f77449;
                abstractC23903M45545 = m45545(abstractC23903M45508, interfaceC12260, (AbstractC23903) abstractC165710.f53222, abstractC165710, abstractC23903M45508.f77453, true);
            }
        }
        AbstractC16579 abstractC165711 = abstractC23903M45545.f77449;
        if (((C22990) c4603.f16299).f74710 && abstractC165711.f53222 == c4603.f16301.f30086) {
            C5909 c59010 = C23879.f77204;
            c20414.m48199(interfaceC12260, new C5909("compiler", "cant.ref.before.ctor.called", "this"));
        }
        return abstractC165711;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m45522(C21825 c21825) {
        if (c21825 == null || c21825.isEmpty()) {
            return this.f65424;
        }
        C19003 c19003 = new C19003();
        Iterator it = c21825.iterator();
        while (it.hasNext()) {
            AbstractC16579 abstractC16579 = (AbstractC16579) it.next();
            if (abstractC16579.m39001(EnumC6617.DEFERRED)) {
                c19003.m43723(((C10104) abstractC16579).f34494);
            } else {
                c19003.m43723(abstractC16579);
            }
        }
        return c19003;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11948 m45524(C4603 c4603, final C7675 c7675) {
        boolean zContains = c4603.f16295.f34730.f63150.contains(c7675.f25392);
        C3836 c3836 = this.f65410;
        C23549 c23549 = this.f65420;
        if (!zContains) {
            C19670 c19670 = c7675.f25392;
            C19670 c19671 = c3836.f14288;
            if (c19670 != c19671) {
                C19670 c19672 = c4603.f16295.f34730;
                if (c19672 != c19671) {
                    C14377 c14377 = C14707.f48054;
                    return c23549.m51910(new C14377("compiler", "not.def.access.does.not.read", c19672, c7675, c19670));
                }
                C14377 c14378 = C14707.f48054;
                return c23549.m51910(new C14377("compiler", "not.def.access.does.not.read.from.unnamed", c7675, c19670));
            }
            C19670 c19673 = c4603.f16295.f34730;
            C14377 c14379 = C14707.f48054;
            return c23549.m51910(new C14377("compiler", "not.def.access.does.not.read.unnamed", c7675, c19673));
        }
        if (C9030.stream(c7675.m52724().f25392.f63142).anyMatch(new Predicate() { // from class: l.ۨۙ۟
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
                return ((C5537) obj).f18986 == c7675;
            }
        })) {
            C19670 c19674 = c4603.f16295.f34730;
            if (c19674 != c3836.f14288) {
                C19670 c19675 = c7675.f25392;
                C14377 c143710 = C14707.f48054;
                return c23549.m51910(new C14377("compiler", "not.def.access.not.exported.to.module", c7675, c19675, c19674));
            }
            C19670 c19676 = c7675.f25392;
            C14377 c143711 = C14707.f48054;
            return c23549.m51910(new C14377("compiler", "not.def.access.not.exported.to.module.from.unnamed", c7675, c19676));
        }
        if (c4603.f16295.f34730 != c3836.f14288) {
            C19670 c19677 = c7675.f25392;
            C14377 c143712 = C14707.f48054;
            return c23549.m51910(new C14377("compiler", "not.def.access.not.exported", c7675, c19677));
        }
        C19670 c19678 = c7675.f25392;
        C14377 c143713 = C14707.f48054;
        return c23549.m51910(new C14377("compiler", "not.def.access.not.exported.from.unnamed", c7675, c19678));
    }
}
