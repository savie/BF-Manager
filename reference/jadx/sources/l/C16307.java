package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.ܽ֨۟, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16307 extends AbstractC3956 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0429 f52514;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16307(C0429 c0429, AbstractC11242 abstractC11242, EnumC11368 enumC11368, EnumSet enumSet) {
        super(c0429, abstractC11242, enumC11368, enumSet);
        this.f52514 = c0429;
    }

    @Override // l.AbstractC3956
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo11442(EnumC13130 enumC13130) {
        return super.mo11442(enumC13130) && this.f52514.f1959;
    }

    @Override // l.AbstractC3956
    /* JADX INFO: renamed from: ۙ */
    public final void mo5135(int i, AbstractC23903 abstractC23903) {
        C21825 c21825M43726;
        C21825 c21825M43727;
        if (abstractC23903.f77452 == EnumC10477.f35865) {
            AbstractC23903 abstractC23904 = abstractC23903.f77448;
            if (abstractC23904.f77452 == EnumC10477.f35868) {
                C19670 c19670 = (C19670) abstractC23904;
                EnumSet enumSet = c19670.f63137;
                C19003 c19003 = new C19003();
                C0429 c0429 = this.f52514;
                C0243 c0243 = c0429.f1983;
                char cM2248 = c0429.m2248();
                C23942 c23942 = c0429.f1987;
                C13638.requireNonNull(c23942);
                AbstractC11242 abstractC11242 = (AbstractC11242) c0243.m1632(cM2248, new C1188(c23942));
                AbstractC11242 abstractC11243 = c0429.f1957.f77453;
                if (abstractC11243 != abstractC11242) {
                    throw c0429.m2233("module.name.mismatch", abstractC11242, abstractC11243);
                }
                char cM2249 = c0429.m2248();
                EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC18964.class);
                for (EnumC18964 enumC18964 : EnumC18964.values()) {
                    if ((enumC18964.f61411 & cM2249) != 0) {
                        enumSetNoneOf.add(enumC18964);
                    }
                }
                enumSet.addAll(enumSetNoneOf);
                char cM22410 = c0429.m2248();
                C0243 c0244 = c0429.f1983;
                C13638.requireNonNull(c0244);
                c19670.f63149 = (AbstractC11242) C0429.m2219(cM22410, new C21951(c0244), (Object) null);
                C19003 c19004 = new C19003();
                char cM22411 = c0429.m2248();
                for (int i2 = 0; i2 < cM22411; i2++) {
                    C19670 c19670M1630 = c0429.f1983.m1630(c0429.m2248());
                    char cM22412 = c0429.m2248();
                    EnumSet enumSetNoneOf2 = EnumSet.noneOf(EnumC23177.class);
                    for (EnumC23177 enumC23177 : EnumC23177.values()) {
                        if ((enumC23177.f75220 & cM22412) != 0) {
                            enumSetNoneOf2.add(enumC23177);
                        }
                    }
                    if (c19670M1630 == c0429.f1991.f14235 && c0429.f1966 >= EnumC11368.V54.f38348) {
                        EnumC23177 enumC23178 = EnumC23177.TRANSITIVE;
                        if (enumSetNoneOf2.contains(enumC23178)) {
                            throw c0429.m2233("bad.requires.flag", enumC23178);
                        }
                        EnumC23177 enumC23179 = EnumC23177.STATIC_PHASE;
                        if (enumSetNoneOf2.contains(enumC23179)) {
                            throw c0429.m2233("bad.requires.flag", enumC23179);
                        }
                    }
                    c0429.m2248();
                    c19004.m43723(new C6948(c19670M1630, enumSetNoneOf2));
                }
                C21825 c21825M43728 = c19004.m43726();
                c19670.f63134 = c21825M43728;
                c19003.addAll(c21825M43728);
                C19003 c19005 = new C19003();
                char cM22413 = c0429.m2248();
                for (int i3 = 0; i3 < cM22413; i3++) {
                    C7675 c7675M1633 = c0429.f1983.m1633(c0429.m2248());
                    char cM22414 = c0429.m2248();
                    EnumSet enumSetNoneOf3 = EnumSet.noneOf(EnumC22471.class);
                    for (EnumC22471 enumC22471 : EnumC22471.values()) {
                        if ((enumC22471.f73360 & cM22414) != 0) {
                            enumSetNoneOf3.add(enumC22471);
                        }
                    }
                    char cM22415 = c0429.m2248();
                    if (cM22415 == 0) {
                        c21825M43727 = null;
                    } else {
                        C19003 c19006 = new C19003();
                        for (int i4 = 0; i4 < cM22415; i4++) {
                            c19006.m43723(c0429.f1983.m1630(c0429.m2248()));
                        }
                        c21825M43727 = c19006.m43726();
                    }
                    c19005.m43723(new C5537(c7675M1633, c21825M43727, enumSetNoneOf3));
                }
                C21825 c21825M43729 = c19005.m43726();
                c19670.f63142 = c21825M43729;
                c19003.addAll(c21825M43729);
                C19003 c19007 = new C19003();
                char cM22416 = c0429.m2248();
                if (cM22416 != 0 && enumSet.contains(EnumC18964.OPEN)) {
                    throw c0429.m2233("module.non.zero.opens", c0429.f1957.f77453);
                }
                for (int i5 = 0; i5 < cM22416; i5++) {
                    C7675 c7675M1634 = c0429.f1983.m1633(c0429.m2248());
                    char cM22417 = c0429.m2248();
                    EnumSet enumSetNoneOf4 = EnumSet.noneOf(EnumC13299.class);
                    for (EnumC13299 enumC13299 : EnumC13299.values()) {
                        if ((enumC13299.f44162 & cM22417) != 0) {
                            enumSetNoneOf4.add(enumC13299);
                        }
                    }
                    char cM22418 = c0429.m2248();
                    if (cM22418 == 0) {
                        c21825M43726 = null;
                    } else {
                        C19003 c19008 = new C19003();
                        for (int i6 = 0; i6 < cM22418; i6++) {
                            c19008.m43723(c0429.f1983.m1630(c0429.m2248()));
                        }
                        c21825M43726 = c19008.m43726();
                    }
                    c19007.m43723(new C1303(c7675M1634, c21825M43726, enumSetNoneOf4));
                }
                C21825 c21825M437210 = c19007.m43726();
                c19670.f63145 = c21825M437210;
                c19003.addAll(c21825M437210);
                c19670.f63146 = c19003.m43726();
                C19003 c19009 = new C19003();
                char cM22419 = c0429.m2248();
                for (int i7 = 0; i7 < cM22419; i7++) {
                    c19009.m43723(new C8191((AbstractC11242) c0429.f1983.m1626(c0429.m2248(), new InterfaceC17591() { // from class: l.֡֨۟
                        @Override // l.InterfaceC17591
                        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                        public final Object mo1012(int i8, int i9, byte[] bArr) {
                            return this.f986.f52514.f1987.m52777(C2194.m6808(i8, i9, bArr));
                        }
                    })));
                }
                c0429.f1986 = c19009.m43726();
                C19003 c190010 = new C19003();
                char cM22420 = c0429.m2248();
                for (int i8 = 0; i8 < cM22420; i8++) {
                    AbstractC11242 abstractC11244 = (AbstractC11242) c0429.f1983.m1626(c0429.m2248(), new InterfaceC17591() { // from class: l.֡֨۟
                        @Override // l.InterfaceC17591
                        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                        public final Object mo1012(int i9, int i10, byte[] bArr) {
                            return this.f986.f52514.f1987.m52777(C2194.m6808(i9, i10, bArr));
                        }
                    });
                    char cM22421 = c0429.m2248();
                    C19003 c190011 = new C19003();
                    for (int i9 = 0; i9 < cM22421; i9++) {
                        c190011.m43723((AbstractC11242) c0429.f1983.m1626(c0429.m2248(), new InterfaceC17591() { // from class: l.֡֨۟
                            @Override // l.InterfaceC17591
                            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                            public final Object mo1012(int i10, int i11, byte[] bArr) {
                                return this.f986.f52514.f1987.m52777(C2194.m6808(i10, i11, bArr));
                            }
                        }));
                        c190010.m43723(new C18774(abstractC11244, c190011.m43726()));
                    }
                }
                c0429.f1967 = c190010.m43726();
            }
        }
    }
}
