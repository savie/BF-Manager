package l;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۡ֡ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7LP */
/* JADX INFO: loaded from: classes3.dex */
public final class C8528 extends AbstractC19357 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final C16576 f29523 = new C16576();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public AbstractC16579 f29524;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C23549 f29525;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f29526 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C4603 f29527;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C5870 f29528;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C3836 f29529;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6761 f29530;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C20414 f29531;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8528 m22273(C12343 c12343) {
        C8528 c8528 = (C8528) c12343.m30656(f29523);
        return c8528 == null ? new C8528(c12343) : c8528;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22285(AbstractC16579 abstractC16579, AbstractC5930 abstractC5930) {
        this.f29524 = abstractC16579;
        if (((C22990) this.f29527.f16299).f74713 == EnumC3377.SPECULATIVE) {
            abstractC5930.f30190 = abstractC16579;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC16579 m22276(AbstractC8774 abstractC8774, AbstractC16579 abstractC16579, C1116 c1116) {
        if (abstractC16579.m39001(EnumC6617.DEFERRED)) {
            return ((C10104) abstractC16579).m25713(c1116);
        }
        return c1116.mo4137(abstractC8774, abstractC16579);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m22282(AbstractC8774 abstractC8774, C4603 c4603) {
        C4603 c4604 = this.f29527;
        try {
            this.f29527 = c4603;
            abstractC8774.mo1802(this);
            return this.f29524;
        } finally {
            this.f29527 = c4604;
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1264(AbstractC8774 abstractC8774) {
        C6761 c6761 = this.f29530;
        abstractC8774.mo1802(c6761);
        this.f29524 = c6761.f22800;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22283(final AbstractC5930 abstractC5930, final Function function) {
        final C19111 c19111 = new C19111(this, abstractC5930);
        m22284(abstractC5930, new Supplier() { // from class: l.ۗ᩶ۤ
            @Override // java.util.function.Supplier
            public final Object get() {
                return C8528.m22274(this.f12728, abstractC5930, c19111, function);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC11350 m22274(C8528 c8528, AbstractC5930 abstractC5930, C19111 c19111, Function function) {
        C5870 c5870 = c8528.f29528;
        C4603 c4603 = c8528.f29527;
        C6761 c6761 = c8528.f29530;
        C13638.requireNonNull(c6761);
        return (AbstractC11350) function.apply((AbstractC5930) c5870.m16084(abstractC5930, c4603, new C4293(c8528, c6761, c19111), c5870.f20047, null, EnumC3377.SPECULATIVE, null));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22284(AbstractC5930 abstractC5930, Supplier supplier) {
        C19111 c19111 = new C19111(this, abstractC5930);
        AbstractC11350 abstractC11350 = (AbstractC11350) this.f29526.get(c19111);
        if (abstractC11350 != null) {
            m22285(abstractC11350.mo6775(this.f29527, abstractC5930), abstractC5930);
            return;
        }
        AbstractC11350 abstractC11351 = (AbstractC11350) supplier.get();
        this.f29526.put(c19111, abstractC11351);
        m22285(abstractC11351, abstractC5930);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6410 m22270(C8528 c8528, C21077 c21077, C21077 c21078) {
        return new C6410(c8528, c21077, c8528.f29527, c21078, new HashMap());
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1266(final C21077 c21077) {
        m22283(c21077, new Function() { // from class: l.ۢ᩶ۤ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo33696andThen(Function function) {
                return C4277.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C8528.m22270(this.f33560, c21077, (C21077) obj);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C4277.$default$compose(this, function);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2176 m22269(C8528 c8528, C7341 c7341, C7341 c7342) {
        return new C2176(c8528, c7341, c8528.f29527, c7342, new HashMap());
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1263(final C7341 c7341) {
        m22283(c7341, new Function() { // from class: l.ۧ᩶ۤ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo33696andThen(Function function) {
                return C4277.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C8528.m22269(this.f37976, c7341, (C7341) obj);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C4277.$default$compose(this, function);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7822 m22272(C8528 c8528, C9789 c9789, C9789 c97810) {
        return new C7822(c8528, c9789, c8528.f29527, c97810, new HashMap());
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3934(final C9789 c9789) {
        m22283(c9789, new Function() { // from class: l.᩻᩶ۤ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo33696andThen(Function function) {
                return C4277.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C8528.m22272(this.f77498, c9789, (C9789) obj);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C4277.$default$compose(this, function);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x004e  */
    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3929(C6966 c6966) {
        boolean z;
        C4603 c4603 = this.f29527;
        C4603 c4603M12747 = c4603.m12747(c6966, c4603.f16299);
        AbstractC5930 abstractC5930 = c6966.f23408;
        C6761 c6761 = this.f29530;
        C1116 c1116M18325 = c6761.m18325(c6966);
        C3587 c3587 = new C3587(this);
        C5870 c5870 = this.f29528;
        AbstractC5930 abstractC5931 = (AbstractC5930) c5870.m16084(abstractC5930, c4603M12747, c1116M18325, c5870.f20047, null, EnumC3377.SPECULATIVE, c3587);
        C6966 c6967 = (C6966) new C0306(c6761.f22794).mo1921((AbstractC8774) c6966, (Object) null);
        c6967.f23408 = abstractC5931;
        AbstractC23903 abstractC23903M9471 = C3128.m9471(abstractC5931);
        C22990 c22990 = (C22990) c4603M12747.f16299;
        if (abstractC23903M9471 != null) {
            AbstractC11242 abstractC11242 = abstractC23903M9471.f77453;
            if (abstractC11242 == abstractC11242.f38032.f21322.f77638) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        c22990.f74723 = z;
        C20145 c20145 = c6761.f22822;
        AbstractC16579 abstractC16579 = abstractC5931.f30190;
        AbstractC11242 abstractC11243 = c6966.f23413;
        AbstractC16579 abstractC16579M52419 = c20145.f65444.m52419(abstractC16579);
        AbstractC22967 abstractC22967M45529 = c20145.m45529(abstractC16579M52419, EnumC11678.f39283, c6967, C21825.m48588(), (C21825) null, abstractC11243);
        C4603 c4603M12748 = c4603M12747.m12747(c4603M12747.f16296, c22990.m50854(c22990.f74722));
        AbstractC8774 abstractC8774 = c4603M12747.f16296;
        abstractC8774.getClass();
        AbstractC0618 abstractC0618 = abstractC16579M52419.f53222;
        C17820 c17820 = c20145.f65417;
        C6095 c6095 = new C6095(c20145);
        c6095.f20635 = c17820;
        AbstractC23903 abstractC23903M45535 = c20145.m45535(c4603M12748, abstractC8774, abstractC0618, c6095, abstractC22967M45529);
        c22990.f74727 = ((C22990) c4603M12748.f16299).f74727;
        if (!abstractC23903M45535.f77452.m26583()) {
            c6966.f23412 = abstractC23903M45535;
        }
        if (abstractC23903M45535.f77452.m26581()) {
            c6966.mo17206(EnumC13317.ERROR);
        } else {
            AbstractC16579 abstractC165710 = abstractC23903M45535.f77449;
            if ((abstractC165710 != null && abstractC165710.m39001(EnumC6617.FORALL)) || (abstractC23903M45535.mo20276() & 17179869184L) != 0 || (C3128.m9451(abstractC5931, c6966.f23413.f38032.f21322) && abstractC5931.f30190.mo1936() && !abstractC5931.f30190.m39001(EnumC6617.ARRAY))) {
                c6966.mo17206(EnumC13317.OVERLOADED);
            } else {
                c6966.mo17206(EnumC13317.UNOVERLOADED);
            }
        }
        m22285(new C10104(c5870, c6966, this.f29527), c6966);
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3959(final C22489 c22489) {
        if (c22489.f73411 == EnumC5555.EXPLICIT) {
            m22284(c22489, new Supplier() { // from class: l.֫᩶ۤ
                @Override // java.util.function.Supplier
                public final Object get() {
                    return C8528.m22275(this.f7627, c22489);
                }
            });
            return;
        }
        C5870 c5870 = this.f29528;
        C13638.requireNonNull(c5870);
        m22285(new C10104(c5870, c22489, this.f29527), c22489);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12761 m22275(C8528 c8528, C22489 c22489) {
        return new C12761(c8528, c22489, c8528.f29527, c8528.f29528.m16085(c22489, c8528.f29527, c8528.f29530.f22807), new HashMap());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21227 m22277(C8528 c8528, C15434 c15434, C15434 c15435) {
        return new C21227(c8528, c15434, c8528.f29527, c15435, new HashMap());
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3932(final C8378 c8378) {
        if (C3128.m9473(c8378)) {
            m22283(c8378, new Function() { // from class: l.ܳ᩶ۤ
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public /* synthetic */ Function mo33696andThen(Function function) {
                    return C4277.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return C8528.m22278(this.f48255, c8378, (C8378) obj);
                }

                @Override // java.util.function.Function
                public /* synthetic */ Function compose(Function function) {
                    return C4277.$default$compose(this, function);
                }
            });
            return;
        }
        C4603 c4603 = this.f29527;
        C6761 c6761 = this.f29530;
        m22285(c6761.m18299(c8378, c4603, c6761.f22809), c8378);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22639 m22278(C8528 c8528, C8378 c8378, C8378 c8379) {
        return new C22639(c8528, c8378, c8528.f29527, c8379, new HashMap());
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3947(final C15434 c15434) {
        if (c15434.f50297.isEmpty()) {
            m22283(c15434, new Function() { // from class: l.ۛ᩶ۤ
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public /* synthetic */ Function mo33696andThen(Function function) {
                    return C4277.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return C8528.m22277(this.f21278, c15434, (C15434) obj);
                }

                @Override // java.util.function.Function
                public /* synthetic */ Function compose(Function function) {
                    return C4277.$default$compose(this, function);
                }
            });
            return;
        }
        C4603 c4603 = this.f29527;
        C6761 c6761 = this.f29530;
        m22285(c6761.m18299(c15434, c4603, c6761.f22809), c15434);
    }

    public C8528(C12343 c12343) {
        c12343.m30659(f29523, this);
        this.f29528 = C5870.m16083(c12343);
        this.f29525 = C23549.m51906(c12343);
        this.f29530 = C6761.m18268(c12343);
        this.f29529 = C3836.m11131(c12343);
        this.f29531 = C20414.m46161(c12343);
    }
}
