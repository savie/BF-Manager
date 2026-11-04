package l;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۜۡ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: I7LP */
/* JADX INFO: loaded from: classes3.dex */
public final class C7044 extends AbstractC0578 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C13477 f23238 = new C13477();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f23239 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C14764 f23240;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C12863 f23241;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC22664 f23242;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C7312 f23243;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C3168 f23244;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C0310 f23245;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C19991 f23246;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7044 m19373(C4747 c4747) {
        C7044 c7044 = (C7044) c4747.m14643(f23238);
        return c7044 == null ? new C7044(c4747) : c7044;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19386(AbstractC22664 abstractC22664, AbstractC22295 abstractC22295) {
        this.f23242 = abstractC22664;
        if (((C7768) this.f23244.f10272).f25555 == EnumC23584.SPECULATIVE) {
            abstractC22295.f26659 = abstractC22664;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC22664 m19377(AbstractC8036 abstractC8036, AbstractC22664 abstractC22664, C14479 c14479) {
        if (abstractC22664.m51067(EnumC21172.DEFERRED)) {
            return ((C8666) abstractC22664).m23334(c14479);
        }
        return c14479.mo30220(abstractC8036, abstractC22664);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m19383(AbstractC8036 abstractC8036, C3168 c3168) {
        C3168 c3169 = this.f23244;
        try {
            this.f23244 = c3168;
            abstractC8036.mo2284(this);
            return this.f23242;
        } finally {
            this.f23244 = c3169;
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1949(AbstractC8036 abstractC8036) {
        C0310 c0310 = this.f23245;
        abstractC8036.mo2284(c0310);
        this.f23242 = c0310.f1691;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19384(final AbstractC22295 abstractC22295, final Function function) {
        final C8535 c8535 = new C8535(this, abstractC22295);
        m19385(abstractC22295, new Supplier() { // from class: l.ۗۡ᩺
            @Override // java.util.function.Supplier
            public final Object get() {
                return C7044.m19372(this.f10819, abstractC22295, c8535, function);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC6299 m19372(C7044 c7044, AbstractC22295 abstractC22295, C8535 c8535, Function function) {
        C12863 c12863 = c7044.f23241;
        C3168 c3168 = c7044.f23244;
        C0310 c0310 = c7044.f23245;
        C17359.requireNonNull(c0310);
        return (AbstractC6299) function.apply((AbstractC22295) c12863.m31896(abstractC22295, c3168, new C20469(c7044, c0310, c8535), c12863.f41185, null, EnumC23584.SPECULATIVE, null));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19385(AbstractC22295 abstractC22295, Supplier supplier) {
        C8535 c8535 = new C8535(this, abstractC22295);
        AbstractC6299 abstractC6299 = (AbstractC6299) this.f23239.get(c8535);
        if (abstractC6299 != null) {
            m19386(abstractC6299.mo4038(this.f23244, abstractC22295), abstractC22295);
            return;
        }
        AbstractC6299 abstractC62910 = (AbstractC6299) supplier.get();
        this.f23239.put(c8535, abstractC62910);
        m19386(abstractC62910, abstractC22295);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7790 m19374(C7044 c7044, C1412 c1412, C1412 c1413) {
        return new C7790(c7044, c1412, c7044.f23244, c1413, new HashMap());
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1945(final C1412 c1412) {
        m19384(c1412, new Function() { // from class: l.᩹ۡ᩺
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo10608andThen(Function function) {
                return C24247.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C7044.m19374(this.f75905, c1412, (C1412) obj);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C24247.$default$compose(this, function);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24199 m19378(C7044 c7044, C10162 c10162, C10162 c10163) {
        return new C24199(c7044, c10162, c7044.f23244, c10163, new HashMap());
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1508(final C10162 c10162) {
        m19384(c10162, new Function() { // from class: l.ܺۡ᩺
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo10608andThen(Function function) {
                return C24247.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C7044.m19378(this.f54041, c10162, (C10162) obj);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C24247.$default$compose(this, function);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2569 m19371(C7044 c7044, C13256 c13256, C13256 c13257) {
        return new C2569(c7044, c13256, c7044.f23244, c13257, new HashMap());
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1514(final C13256 c13256) {
        m19384(c13256, new Function() { // from class: l.ܽۡ᩺
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo10608andThen(Function function) {
                return C24247.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C7044.m19371(this.f56831, c13256, (C13256) obj);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C24247.$default$compose(this, function);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x004e  */
    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1954(C12598 c12598) {
        boolean z;
        C3168 c3168 = this.f23244;
        C3168 c3168M10350 = c3168.m10350(c12598, c3168.f10272);
        AbstractC22295 abstractC22295 = c12598.f40436;
        C0310 c0310 = this.f23245;
        C14479 c14479M1980 = c0310.m1980(c12598);
        C0332 c0332 = new C0332(this);
        C12863 c12863 = this.f23241;
        AbstractC22295 abstractC22296 = (AbstractC22295) c12863.m31896(abstractC22295, c3168M10350, c14479M1980, c12863.f41185, null, EnumC23584.SPECULATIVE, c0332);
        C12598 c12599 = (C12598) new C8781(c0310.f1700).mo23491((AbstractC8036) c12598, (Object) null);
        c12599.f40436 = abstractC22296;
        AbstractC11781 abstractC11781M28352 = C11239.m28352(abstractC22296);
        C7768 c7768 = (C7768) c3168M10350.f10272;
        if (abstractC11781M28352 != null) {
            AbstractC19728 abstractC19728 = abstractC11781M28352.f38072;
            if (abstractC19728 == abstractC19728.f63499.f73707.f49851) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        c7768.f25569 = z;
        C22010 c22010 = c0310.f1707;
        AbstractC22664 abstractC22664 = abstractC22296.f26659;
        AbstractC19728 abstractC19729 = c12598.f40431;
        AbstractC22664 abstractC22664M55158 = c22010.f71021.m55158(abstractC22664);
        AbstractC0097 abstractC0097M49760 = c22010.m49760(abstractC22664M55158, EnumC20234.f64935, c12599, C14769.m35543(), (C14769) null, abstractC19729);
        C3168 c3168M10351 = c3168M10350.m10350(c3168M10350.f10273, c7768.m21146(c7768.f25562));
        AbstractC8036 abstractC8036 = c3168M10350.f10273;
        abstractC8036.getClass();
        AbstractC22970 abstractC22970 = abstractC22664M55158.f73596;
        C7883 c7883 = c22010.f71011;
        C12775 c12775 = new C12775(c22010);
        c12775.f40881 = c7883;
        AbstractC11781 abstractC11781M49763 = c22010.m49763(c3168M10351, abstractC8036, abstractC22970, c12775, abstractC0097M49760);
        c7768.f25570 = ((C7768) c3168M10351.f10272).f25570;
        if (!abstractC11781M49763.f38066.m33353()) {
            c12598.f40439 = abstractC11781M49763;
        }
        if (abstractC11781M49763.f38066.m33352()) {
            c12598.mo6738(EnumC3649.ERROR);
        } else {
            AbstractC22664 abstractC22665 = abstractC11781M49763.f38067;
            if ((abstractC22665 != null && abstractC22665.m51067(EnumC21172.FORALL)) || (abstractC11781M49763.mo29591() & 17179869184L) != 0 || (C11239.m28335(abstractC22296, c12598.f40431.f63499.f73707) && abstractC22296.f26659.mo9328() && !abstractC22296.f26659.m51067(EnumC21172.ARRAY))) {
                c12598.mo6738(EnumC3649.OVERLOADED);
            } else {
                c12598.mo6738(EnumC3649.UNOVERLOADED);
            }
        }
        m19386(new C8666(c12863, c12598, this.f23244), c12598);
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1518(final C16327 c16327) {
        if (c16327.f53000 == EnumC17819.EXPLICIT) {
            m19385(c16327, new Supplier() { // from class: l.ܶۡ᩺
                @Override // java.util.function.Supplier
                public final Object get() {
                    return C7044.m19375(this.f51913, c16327);
                }
            });
            return;
        }
        C12863 c12863 = this.f23241;
        C17359.requireNonNull(c12863);
        m19386(new C8666(c12863, c16327, this.f23244), c16327);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18231 m19375(C7044 c7044, C16327 c16327) {
        return new C18231(c7044, c16327, c7044.f23244, c7044.f23241.m31897(c16327, c7044.f23244, c7044.f23245.f1683), new HashMap());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1078 m19370(C7044 c7044, C24533 c24533, C24533 c24534) {
        return new C1078(c7044, c24533, c7044.f23244, c24534, new HashMap());
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1521(C18565 c18565) {
        if (C11239.m28349(c18565)) {
            m19384(c18565, new C19794(1, this, c18565));
            return;
        }
        C3168 c3168 = this.f23244;
        C0310 c0310 = this.f23245;
        m19386(c0310.m1933(c18565, c3168, c0310.f1687), c18565);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18977 m19376(C7044 c7044, C18565 c18565, C18565 c18566) {
        return new C18977(c7044, c18565, c7044.f23244, c18566, new HashMap());
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1527(final C24533 c24533) {
        if (c24533.f79552.isEmpty()) {
            m19384(c24533, new Function() { // from class: l.᩻ۡ᩺
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public /* synthetic */ Function mo10608andThen(Function function) {
                    return C24247.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return C7044.m19370(this.f80760, c24533, (C24533) obj);
                }

                @Override // java.util.function.Function
                public /* synthetic */ Function compose(Function function) {
                    return C24247.$default$compose(this, function);
                }
            });
            return;
        }
        C3168 c3168 = this.f23244;
        C0310 c0310 = this.f23245;
        m19386(c0310.m1933(c24533, c3168, c0310.f1687), c24533);
    }

    public C7044(C4747 c4747) {
        c4747.m14646(f23238, this);
        this.f23241 = C12863.m31895(c4747);
        this.f23246 = C19991.m45972(c4747);
        this.f23245 = C0310.m1899(c4747);
        this.f23240 = C14764.m35506(c4747);
        this.f23243 = C7312.m20023(c4747);
    }
}
