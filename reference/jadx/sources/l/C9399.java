package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ۢۛۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: S424 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9399 extends AbstractC19357 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final C16576 f31856 = new C16576();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C12325 f31857;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC13464 f31858;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public EnumC8441 f31859;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C17573 f31860;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C16826 f31861;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C8753 f31862;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C11492 f31863;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C19003 f31864;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C4603 f31866;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C23942 f31867;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C21017 f31868;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C16617 f31870;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C13609 f31871;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C23800 f31872;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C3836 f31873;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C20414 f31874;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public AbstractC16579 f31875;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C19003 f31865 = new C19003();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C22220 f31869 = new C14338();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9399 m24138(C12343 c12343) {
        C9399 c9399 = (C9399) c12343.m30656(f31856);
        return c9399 == null ? new C9399(c12343) : c9399;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4603 m24141(AbstractC0618 abstractC0618) {
        return this.f31863.m28678(abstractC0618);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Collection m24140() {
        return this.f31863.m28681();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4603 m24137(C4603 c4603, C8753 c8753) {
        C4603 c4603M12747 = c4603.m12747(c8753, ((C22990) c4603.f16299).m50854(AbstractC9462.m24222(c8753.f30086)));
        c4603M12747.f16301 = c8753;
        c4603M12747.f16300 = c4603;
        C22990 c22990 = (C22990) c4603M12747.f16299;
        c22990.f74710 = false;
        c22990.f74715 = null;
        c22990.f74711 = C3128.m9473(c4603.f16296);
        return c4603M12747;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C4603 m24146(C10164 c10164) {
        C22990 c22990 = new C22990();
        C4603 c4603 = new C4603(c10164, c22990);
        c4603.f16295 = c10164;
        c4603.f16301 = this.f31862;
        c10164.f34723 = AbstractC9462.m24222(c10164.f34721);
        c10164.f34728 = new C20045(c10164.f34721);
        c10164.f34722 = new C1699(c10164.f34721);
        c22990.f74722 = c10164.f34723;
        c22990.f74715 = this.f31861;
        return c4603;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC9462 m24139(C4603 c4603) {
        if (c4603.f16296.m22847(EnumC18651.f60468)) {
            return ((C8753) c4603.f16296).f30086.f73417;
        }
        return ((C22990) c4603.f16299).f74722;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m24142(AbstractC8774 abstractC8774, C4603 c4603) {
        AbstractC16579 abstractC16579M47261;
        C17573 c17573 = this.f31860;
        C4603 c4604 = this.f31866;
        try {
            try {
                this.f31866 = c4603;
                c17573.m40875();
                abstractC8774.mo1802(this);
                abstractC16579M47261 = this.f31875;
            } catch (C4146 e) {
                C21017 c21017 = this.f31868;
                abstractC8774.getClass();
                abstractC16579M47261 = c21017.m47261(abstractC8774, e);
            }
            return abstractC16579M47261;
        } finally {
            c17573.m40873();
            this.f31866 = c4604;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21825 m24143(C21825 c21825, C4603 c4603) {
        C19003 c19003 = new C19003();
        while (c21825.m48595()) {
            AbstractC16579 abstractC16579M24142 = m24142((AbstractC8774) c21825.f70876, c4603);
            if (abstractC16579M24142 != null) {
                c19003.m43723(abstractC16579M24142);
            }
            c21825 = c21825.f70877;
        }
        return c19003.m43726();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:35:0x0109  */
    /* JADX WARN: Code duplicated, block: B:37:0x0118 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x011a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0120  */
    /* JADX WARN: Code duplicated, block: B:49:0x0194  */
    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3935(final C10164 c10164) {
        boolean z;
        C11521 c11521FindAny;
        C4603 c4603M24146;
        C4603 c4603M12747;
        C4603 c4603M28678;
        AbstractC23903 abstractC23903;
        AbstractC5930 abstractC5930;
        InterfaceC2173 interfaceC2173 = c10164.f34725;
        C20414 c20414 = this.f31874;
        InterfaceC2173 interfaceC2173M48202 = c20414.m48202(interfaceC2173);
        InterfaceC2173 interfaceC2174 = c10164.f34725;
        EnumC11347 enumC11347 = EnumC11347.SOURCE;
        boolean zMo6761 = interfaceC2174.mo6761("package-info", enumC11347);
        boolean zMo6762 = c10164.f34725.mo6761("module-info", enumC11347);
        C3836 c3836 = this.f31873;
        if (zMo6762 && c10164.m25899() != null) {
            C7672 c7672M25894 = c10164.m25894();
            if (c7672M25894 != null) {
                c20414.m48199(c7672M25894, C23879.f77338);
            }
            c10164.f34721 = c3836.f14227;
            m24143(c10164.f34727, m24146(c10164));
            C19670 c19670 = c10164.f34730;
            C12325 c12325 = this.f31857;
            c12325.getClass();
            c19670.f63147 = new C1359(8, c12325);
        } else {
            C7672 c7672M25895 = c10164.m25894();
            int i = 1;
            if (c7672M25895 != null) {
                C7675 c7675M11157 = c3836.m11157(c10164.f34730, C3128.m9460(c7672M25895.f25385));
                c7672M25895.f25387 = c7675M11157;
                c10164.f34721 = c7675M11157;
                C22220 c22220 = this.f31869;
                c22220.getClass();
                c22220.mo3930(c7672M25895);
                if (c7672M25895.f25386.m48595() || this.f31859 == EnumC8441.ALWAYS || c10164.f34729 != null) {
                    if (zMo6761) {
                        z = true;
                    } else if (c7672M25895.f25386.m48595()) {
                        C5224 c5224 = (C5224) c7672M25895.f25386.f70876;
                        c5224.getClass();
                        c20414.m48199(c5224, C23879.f77305);
                    }
                }
                final Map map = c10164.f34730.f63148;
                c11521FindAny = C9030.stream(c3836.m11153(c10164.f34721.f25396)).filter(new C13237(i, c10164)).filter(new Predicate() { // from class: l.᩻ۛۤ
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
                        C9399 c9399 = this.f76100;
                        c9399.getClass();
                        C10164 c10165 = c10164;
                        return map.get(c10165.f34721.f25396) == c9399.f31873.m11143((C19670) obj, c10165.f34721.f25396);
                    }
                }).findAny();
                if (c11521FindAny.isPresent()) {
                    AbstractC23903 abstractC23904 = (AbstractC23903) c11521FindAny.get();
                    C5909 c5909 = C23879.f77204;
                    c20414.m48199(c7672M25895, new C5909("compiler", "package.in.other.module", abstractC23904));
                }
                c10164.f34721.mo49994();
                c4603M24146 = m24146(c10164);
                if (zMo6761) {
                    c4603M12747 = c4603M24146.m12747(c7672M25895, c4603M24146.f16299);
                } else {
                    c4603M12747 = null;
                }
                if (zMo6761) {
                    C7675 c7675 = c10164.f34721;
                    C11492 c11492 = this.f31863;
                    c4603M28678 = c11492.m28678(c7675);
                    if (c4603M28678 != null) {
                        if (!this.f31858.mo22150(c10164.f34725, c4603M28678.f16295.f34725)) {
                            if (c7672M25895 != null) {
                                abstractC5930 = c7672M25895.f25385;
                                abstractC5930.getClass();
                            } else {
                                abstractC5930 = null;
                            }
                            C7675 c7676 = c10164.f34721;
                            C14065 c14065 = C9768.f32836;
                            c20414.m48204(abstractC5930, new C14065("compiler", "pkg-info.already.seen", c7676));
                        }
                    }
                    c11492.m28680(c10164.f34721, c4603M12747);
                    for (abstractC23903 = c10164.f34721; abstractC23903 != null && abstractC23903.f77452 == EnumC10477.f35867; abstractC23903 = abstractC23903.f77448) {
                        abstractC23903.f77447 |= X931RNG.BLOCK128_RESEED_MAX;
                    }
                    C23942 c23942 = this.f31867;
                    AbstractC11242 abstractC11242 = c23942.f77545;
                    C22492 c22492M11149 = c3836.m11149(c10164.f34730, abstractC11242, c10164.f34721);
                    c22492M11149.f73414 = c23942.f77631.m17389(c10164.f34721 + "." + ((Object) abstractC11242));
                    c22492M11149.f73415 = c10164.f34725;
                    c22492M11149.f77451 = InterfaceC13320.f44208;
                    c22492M11149.f73417 = AbstractC9462.m24222(c22492M11149);
                    C7675 c7677 = c10164.f34721;
                    c7677.f25394 = c22492M11149;
                    c7677.f25393 = c10164.f34725;
                }
                m24143(c10164.f34727, c4603M24146);
                if (z) {
                    this.f31870.add(c4603M12747);
                }
            } else {
                c10164.f34721 = c10164.f34730.f63141;
            }
            z = false;
            final Map map2 = c10164.f34730.f63148;
            c11521FindAny = C9030.stream(c3836.m11153(c10164.f34721.f25396)).filter(new C13237(i, c10164)).filter(new Predicate() { // from class: l.᩻ۛۤ
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
                    C9399 c9399 = this.f76100;
                    c9399.getClass();
                    C10164 c10165 = c10164;
                    return map2.get(c10165.f34721.f25396) == c9399.f31873.m11143((C19670) obj, c10165.f34721.f25396);
                }
            }).findAny();
            if (c11521FindAny.isPresent()) {
                AbstractC23903 abstractC23905 = (AbstractC23903) c11521FindAny.get();
                C5909 c59010 = C23879.f77204;
                c20414.m48199(c7672M25895, new C5909("compiler", "package.in.other.module", abstractC23905));
            }
            c10164.f34721.mo49994();
            c4603M24146 = m24146(c10164);
            if (zMo6761) {
                c4603M12747 = c4603M24146.m12747(c7672M25895, c4603M24146.f16299);
            } else {
                c4603M12747 = null;
            }
            if (zMo6761) {
                C7675 c7678 = c10164.f34721;
                C11492 c11493 = this.f31863;
                c4603M28678 = c11493.m28678(c7678);
                if (c4603M28678 != null) {
                    if (!this.f31858.mo22150(c10164.f34725, c4603M28678.f16295.f34725)) {
                        if (c7672M25895 != null) {
                            abstractC5930 = c7672M25895.f25385;
                            abstractC5930.getClass();
                        } else {
                            abstractC5930 = null;
                        }
                        C7675 c7679 = c10164.f34721;
                        C14065 c14066 = C9768.f32836;
                        c20414.m48204(abstractC5930, new C14065("compiler", "pkg-info.already.seen", c7679));
                    }
                }
                c11493.m28680(c10164.f34721, c4603M12747);
                while (abstractC23903 != null) {
                    abstractC23903.f77447 |= X931RNG.BLOCK128_RESEED_MAX;
                }
                C23942 c23943 = this.f31867;
                AbstractC11242 abstractC11243 = c23943.f77545;
                C22492 c22492M111410 = c3836.m11149(c10164.f34730, abstractC11243, c10164.f34721);
                c22492M111410.f73414 = c23943.f77631.m17389(c10164.f34721 + "." + ((Object) abstractC11243));
                c22492M111410.f73415 = c10164.f34725;
                c22492M111410.f77451 = InterfaceC13320.f44208;
                c22492M111410.f73417 = AbstractC9462.m24222(c22492M111410);
                C7675 c76710 = c10164.f34721;
                c76710.f25394 = c22492M111410;
                c76710.f25393 = c10164.f34725;
            }
            m24143(c10164.f34727, c4603M24146);
            if (z) {
                this.f31870.add(c4603M12747);
            }
        }
        c20414.m48202(interfaceC2173M48202);
        this.f31875 = null;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0170  */
    /* JADX WARN: Code duplicated, block: B:58:0x019a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0200  */
    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1065(C8753 c8753) {
        C21017 c21017;
        C22492 c22492M11147;
        final C22492 c22492M11149;
        C0309 c0309;
        C19003 c19003;
        C4603 c4603 = this.f31866;
        AbstractC23903 abstractC23903 = ((C22990) c4603.f16299).f74722.f11719;
        AbstractC9462 abstractC9462M24139 = m24139(c4603);
        EnumC10477 enumC10477 = abstractC23903.f77452;
        EnumC10477 enumC10478 = EnumC10477.f35867;
        C23800 c23800 = this.f31872;
        C20414 c20414 = this.f31874;
        C3836 c3836 = this.f31873;
        C21017 c21018 = this.f31868;
        if (enumC10477 == enumC10478) {
            C7675 c7675 = (C7675) abstractC23903;
            AbstractC23903 abstractC23904 = c7675;
            while (abstractC23904 != null && abstractC23904.f77452 == EnumC10477.f35867) {
                abstractC23904.f77447 |= X931RNG.BLOCK128_RESEED_MAX;
                abstractC23904 = abstractC23904.f77448;
                c21018 = c21018;
            }
            c21017 = c21018;
            c22492M11147 = c3836.m11149(this.f31866.f16295.f34730, c8753.f30093, c7675);
            c7675.mo49994();
            c7675.f25395.mo24226(c22492M11147);
            if ((c8753.f30089.f70567 & 1) != 0 && !this.f31866.f16295.f34725.mo6761(c22492M11147.f77453.toString(), EnumC11347.SOURCE)) {
                EnumC7654 enumC7654 = EnumC7654.CLASS;
                long j = c8753.f30089.f70567;
                if ((j & 16384) != 0) {
                    enumC7654 = EnumC7654.ENUM;
                } else if ((j & 512) != 0) {
                    enumC7654 = EnumC7654.INTERFACE;
                }
                AbstractC11242 abstractC11242 = c8753.f30093;
                C5909 c5909 = C23879.f77204;
                c20414.m48199(c8753, new C5909("compiler", "class.public.should.be.in.file", enumC7654, abstractC11242));
            }
        } else {
            c21017 = c21018;
            if (!c8753.f30093.isEmpty() && !c21017.m47320(c8753, c8753.f30093, abstractC9462M24139)) {
                this.f31875 = null;
                return;
            }
            EnumC10477 enumC10479 = abstractC23903.f77452;
            EnumC10477 enumC104710 = EnumC10477.f35865;
            if (enumC10479 == enumC104710) {
                AbstractC0618 abstractC0618 = (AbstractC0618) abstractC23903;
                c22492M11149 = c3836.m11149(this.f31866.f16295.f34730, c8753.f30093, abstractC0618);
                if (c22492M11149.f77448 != abstractC23903) {
                    AbstractC11242 abstractC11243 = c22492M11149.f77453;
                    AbstractC11242 abstractC11244 = c8753.f30093;
                    if (abstractC11243 != abstractC11244) {
                        C5909 c59010 = C23879.f77204;
                        c20414.m48199(c8753, new C5909("compiler", "same.binary.name", abstractC11243, abstractC11244));
                        AbstractC11242 abstractC11245 = c8753.f30093;
                        C14422 c14422 = AbstractC16579.f53219;
                        c23800.getClass();
                        C5954 c5954M52331 = C23800.m52331(abstractC11245, abstractC0618, c14422);
                        this.f31875 = c5954M52331;
                        c8753.f30086 = (C22492) c5954M52331.f53222;
                        return;
                    }
                    C6171.m17177(abstractC23903.f77448.f77452 != enumC104710, new C12400(1, abstractC23903));
                    C6171.m17177(c22492M11149.f77448.f77452 == enumC104710, new Supplier() { // from class: l.ۧۛۤ
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return c22492M11149.f77448.toString();
                        }
                    });
                    AbstractC9462 abstractC9462 = ((C22492) c22492M11149.f77448).f73417;
                    if (abstractC9462 != null) {
                        abstractC9462.mo24223(c22492M11149);
                    }
                    c22492M11149.f77448 = abstractC23903;
                }
                if ((512 & abstractC23903.f77447) != 0) {
                    c8753.f30089.f70567 |= 9;
                }
            } else {
                c22492M11147 = c3836.m11147(c8753.f30093, abstractC23903);
                c22492M11147.f73414 = c21017.m47330(c22492M11147);
                if (!c22492M11147.f77453.isEmpty()) {
                    c21017.m47283(c8753, c22492M11147, ((C22990) this.f31866.f16299).f74722);
                }
            }
            c8753.f30086 = c22492M11149;
            if (c21017.m47341(c22492M11149) != null) {
                c21017.m47254(c22492M11149);
                abstractC9462M24139.mo24224(c22492M11149);
                C4603 c4603M24137 = m24137(this.f31866, c8753);
                this.f31863.m28680(c22492M11149, c4603M24137);
                c22492M11149.f77451 = InterfaceC13320.f44208;
                c22492M11149.f77447 = this.f31868.m47257(c8753, c8753.f30089.f70567, c22492M11149, c8753);
                c22492M11149.f73415 = this.f31866.f16295.f34725;
                c22492M11149.f73417 = AbstractC9462.m24222(c22492M11149);
                c22492M11149.m50011();
                c0309 = (C0309) c22492M11149.f77449;
                if (abstractC23903.f77452 != EnumC10477.f35867 && (c22492M11149.f77447 & 8) == 0) {
                    while (abstractC23903.f77452.m26580(C21059.f68591) && (abstractC23903.f77447 & 8) == 0) {
                        abstractC23903 = abstractC23903.f77448;
                    }
                    if (abstractC23903.f77452 == EnumC10477.f35865) {
                        c0309.mo1927(abstractC23903.f77449);
                    }
                }
                c0309.f1655 = m24143(c8753.f30088, c4603M24137);
                c0309.f1659 = null;
                c22492M11149.f77451 = this.f31871;
                if (!c22492M11149.m52728() && (c19003 = this.f31864) != null) {
                    c19003.m43723(c22492M11149);
                }
                m24143(c8753.f30090, c4603M24137);
                this.f31875 = c22492M11149.f77449;
                return;
            }
            AbstractC11242 abstractC11246 = c22492M11149.f73419;
            C5909 c59011 = C23879.f77204;
            c20414.m48199(c8753, new C5909("compiler", "duplicate.class", abstractC11246));
            C14422 c14423 = AbstractC16579.f53219;
            c23800.getClass();
            C5954 c5954M52332 = C23800.m52331(c8753.f30093, (AbstractC0618) abstractC23903, c14423);
            this.f31875 = c5954M52332;
            c8753.f30086 = (C22492) c5954M52332.f53222;
        }
        c22492M11149 = c22492M11147;
        c8753.f30086 = c22492M11149;
        if (c21017.m47341(c22492M11149) != null) {
            c21017.m47254(c22492M11149);
            abstractC9462M24139.mo24224(c22492M11149);
            C4603 c4603M24138 = m24137(this.f31866, c8753);
            this.f31863.m28680(c22492M11149, c4603M24138);
            c22492M11149.f77451 = InterfaceC13320.f44208;
            c22492M11149.f77447 = this.f31868.m47257(c8753, c8753.f30089.f70567, c22492M11149, c8753);
            c22492M11149.f73415 = this.f31866.f16295.f34725;
            c22492M11149.f73417 = AbstractC9462.m24222(c22492M11149);
            c22492M11149.m50011();
            c0309 = (C0309) c22492M11149.f77449;
            if (abstractC23903.f77452 != EnumC10477.f35867) {
                while (abstractC23903.f77452.m26580(C21059.f68591)) {
                    abstractC23903 = abstractC23903.f77448;
                }
                if (abstractC23903.f77452 == EnumC10477.f35865) {
                    c0309.mo1927(abstractC23903.f77449);
                }
            }
            c0309.f1655 = m24143(c8753.f30088, c4603M24138);
            c0309.f1659 = null;
            c22492M11149.f77451 = this.f31871;
            if (!c22492M11149.m52728()) {
                c19003.m43723(c22492M11149);
            }
            m24143(c8753.f30090, c4603M24138);
            this.f31875 = c22492M11149.f77449;
            return;
        }
        AbstractC11242 abstractC11247 = c22492M11149.f73419;
        C5909 c59012 = C23879.f77204;
        c20414.m48199(c8753, new C5909("compiler", "duplicate.class", abstractC11247));
        C14422 c14424 = AbstractC16579.f53219;
        c23800.getClass();
        C5954 c5954M52333 = C23800.m52331(c8753.f30093, (AbstractC0618) abstractC23903, c14424);
        this.f31875 = c5954M52333;
        c8753.f30086 = (C22492) c5954M52333.f53222;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3958(C22179 c22179) {
        C22929 c22929;
        AbstractC16579 abstractC16579 = c22179.f30190;
        if (abstractC16579 != null) {
            c22929 = (C22929) abstractC16579;
        } else {
            c22929 = new C22929(((C22990) this.f31866.f16299).f74722.f11719, this.f31873.f14228, c22179.f72545);
        }
        c22179.f30190 = c22929;
        if (this.f31868.m47323(c22179, c22929.f53222, ((C22990) this.f31866.f16299).f74722)) {
            ((C22990) this.f31866.f16299).f74722.mo24224(c22929.f53222);
        }
        this.f31875 = c22929;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1981(C18255 c18255) {
        C4603 c4603 = this.f31866;
        C6171.m17171(c18255.f58256);
        C4603 c4603M12747 = c4603.m12747(c18255, ((C22990) c4603.f16299).m50854(AbstractC9462.m24222(c18255.f58256)));
        c4603M12747.f16301 = this.f31862;
        c4603M12747.f16300 = c4603;
        C22990 c22990 = (C22990) c4603M12747.f16299;
        c22990.f74710 = false;
        c22990.f74715 = null;
        this.f31863.m28680(c18255.f58256, c4603M12747);
        if (this.f31857.m30633(c18255.f58256)) {
            this.f31870.add(c4603M12747);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1264(AbstractC8774 abstractC8774) {
        this.f31875 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24144(C22492 c22492, C21825 c21825) {
        C17573 c17573 = this.f31860;
        c17573.m40875();
        C19003 c19003 = this.f31864;
        C13609 c13609 = this.f31871;
        if (c13609.f44898) {
            this.f31864 = new C19003();
        }
        try {
            m24143(c21825, (C4603) null);
            if (c13609.f44898) {
                while (this.f31864.m43722()) {
                    C22492 c22493 = (C22492) this.f31864.m43727();
                    if (c22492 == null || c22492 == c22493 || c19003 == null) {
                        c22493.mo49994();
                    } else {
                        c19003.m43723(c22493);
                    }
                }
                boolean zM30629 = this.f31857.m30629();
                C19003 c19004 = this.f31865;
                if (!zM30629) {
                    Iterator it = c21825.iterator();
                    while (it.hasNext()) {
                        C10164 c10164 = (C10164) it.next();
                        if (c10164.m25899() != null) {
                            c19004.m43723(c10164);
                        } else {
                            c13609.m33279(C21825.of((Object) c10164));
                        }
                    }
                } else {
                    c13609.m33279(c19004.m43726());
                    c19004.clear();
                    c13609.m33279(c21825);
                }
            }
            this.f31864 = c19003;
            c17573.m40873();
        } catch (Throwable th) {
            this.f31864 = c19003;
            c17573.m40873();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m24145() {
        this.f31863.m28679();
    }

    public C9399(C12343 c12343) {
        c12343.m30659(f31856, this);
        this.f31874 = C20414.m46161(c12343);
        C5286 c5286M14576 = C5286.m14576(c12343);
        C3836 c3836M11131 = C3836.m11131(c12343);
        this.f31873 = c3836M11131;
        this.f31868 = C21017.m47211(c12343);
        C13609 c13609 = (C13609) c12343.m30656(C13609.f44889);
        this.f31871 = c13609 == null ? new C13609(c12343) : c13609;
        this.f31872 = C23800.m52336(c12343);
        this.f31860 = C17573.m40852(c12343);
        this.f31861 = C16826.m39463(c12343);
        this.f31867 = C23942.m52776(c12343);
        this.f31857 = C12325.m30599(c12343);
        C23549.m51906(c12343);
        C21783 c21783M14618 = c5286M14576.m14618(1L);
        C22492 c22492 = c3836M11131.f14262;
        C8753 c8753M14601 = c5286M14576.m14601(c21783M14618, c22492.f77453, C21825.m48588(), (AbstractC5930) null, C21825.m48588(), C21825.m48588());
        this.f31862 = c8753M14601;
        c8753M14601.f30086 = c22492;
        this.f31870 = C16617.m39076(c12343);
        this.f31858 = (InterfaceC13464) c12343.m30655(InterfaceC13464.class);
        this.f31859 = EnumC8441.m22101(C14770.m35395(c12343));
        this.f31863 = C11492.m28677(c12343);
    }
}
