package l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩺֫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes.dex */
public final class C22680 extends C1052 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C16576 f73838 = new C16576();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean f73839;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C4603 f73840;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C23549 f73841;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public AbstractC0806 f73842;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f73843;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C3836 f73844;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C23942 f73845;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C10727 f73846;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C20145 f73847;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C6761 f73848;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f73849;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C12802 f73850;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C6118 f73851;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C23800 f73852;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C1512 f73853;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C5286 f73854;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean f73855;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f73856;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C13526 f73857;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C20414 f73858;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public HashMap f73859;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean f73860;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22680 m50219(C12343 c12343) {
        C22680 c22680 = (C22680) c12343.m30656(f73838);
        return c22680 == null ? new C22680(c12343) : c22680;
    }

    @Override // l.C1052
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC8774 mo3964(AbstractC8774 abstractC8774) {
        AbstractC0806 abstractC0806 = (AbstractC0806) this.f73859.get(abstractC8774);
        if (abstractC0806 == null) {
            abstractC0806 = this.f73842;
        }
        AbstractC0806 abstractC0807 = this.f73842;
        try {
            this.f73842 = abstractC0806;
            return super.mo3964(abstractC8774);
        } finally {
            this.f73842 = abstractC0807;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21825 m50238(C21825 c21825, AbstractC0806 abstractC0806) {
        C19003 c19003 = new C19003();
        Iterator it = c21825.iterator();
        while (it.hasNext()) {
            AbstractC8774 abstractC8774 = (AbstractC8774) it.next();
            AbstractC0806 abstractC0807 = this.f73842;
            try {
                this.f73842 = abstractC0806;
                AbstractC8774 abstractC8774Mo3964 = super.mo3964(abstractC8774);
                this.f73842 = abstractC0807;
                c19003.m43723(abstractC8774Mo3964);
            } catch (Throwable th) {
                this.f73842 = abstractC0807;
                throw th;
            }
        }
        return c19003.m43726();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC8774 m50237(C4603 c4603, AbstractC8774 abstractC8774, C5286 c5286) {
        this.f73854 = c5286;
        this.f73840 = c4603;
        this.f73842 = null;
        this.f73859 = new HashMap();
        return mo3964(abstractC8774);
    }

    @Override // l.C1052, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1065(C8753 c8753) {
        if (c8753.f30086.f77448.f77452 == EnumC10477.f35867) {
            c8753 = C12802.m31783(this.f73850, c8753);
        }
        C6118 c6118 = this.f73851;
        try {
            this.f73851 = new C6118(this, c8753);
            super.mo1065(c8753);
            if (!this.f73851.f20901.isEmpty()) {
                C5286 c5286 = this.f73854;
                int i = c5286.f18294;
                try {
                    c5286.m14629((InterfaceC12260) c8753);
                    C6118.m17099(this.f73851, m50209());
                    this.f73854.f18294 = i;
                } catch (Throwable th) {
                    this.f73854.f18294 = i;
                    throw th;
                }
            }
            C21825<AbstractC8774> c21825M43726 = this.f73851.f20897.m43726();
            C21825 c21825 = c8753.f30090;
            c21825.getClass();
            c8753.f30090 = c21825M43726.m48594(c21825);
            for (AbstractC8774 abstractC8774 : c21825M43726) {
                C22492 c22492 = c8753.f30086;
                c22492.mo49994();
                c22492.f73417.mo24224(((C23195) abstractC8774).f75263);
            }
            this.f4871 = c8753;
            this.f73851 = c6118;
        } catch (Throwable th2) {
            this.f73851 = c6118;
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x01f0  */
    @Override // l.C1052, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3959(C22489 c22489) {
        C21825 c21825M14632;
        C18258 c18258;
        C6263 c6263;
        char c;
        C21452 c21452M14617;
        boolean z;
        C18258 c18259;
        C2217 c2217 = (C2217) this.f73842;
        final C18258 c182510 = c2217.f7990;
        final C6263 c6264 = c2217.f7986;
        C13757 c13757 = (C13757) c182510.f77449;
        final AbstractC23903 abstractC23903 = c2217.f3411;
        C13638.requireNonNull(abstractC23903);
        m50223(c22489, new Supplier() { // from class: l.ۡܳۤ
            @Override // java.util.function.Supplier
            public final Object get() {
                return abstractC23903.mo50009();
            }
        }, new Consumer() { // from class: l.۟ܳۤ
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj) {
                abstractC23903.m52712((C21825) obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C1455.$default$andThen(this, consumer);
            }
        }, new C10208(1, c182510));
        AbstractC11242 abstractC11242 = abstractC23903.f77453;
        C23942 c23942 = this.f73845;
        int i = 0;
        boolean z2 = abstractC11242 == c23942.f77632;
        if (z2 || abstractC11242 == c23942.f77608) {
            final AbstractC23903 abstractC23904 = abstractC23903.f77448;
            C13638.requireNonNull(abstractC23904);
            Supplier supplier = z2 ? new Supplier() { // from class: l.᩷ܳۤ
                @Override // java.util.function.Supplier
                public final Object get() {
                    return abstractC23904.m52697();
                }
            } : new Supplier() { // from class: l.ܺܳۤ
                @Override // java.util.function.Supplier
                public final Object get() {
                    return abstractC23904.m52729();
                }
            };
            C13638.requireNonNull(abstractC23904);
            m50223(c22489, supplier, z2 ? new C20230(i, abstractC23904) : new C0473(i, abstractC23904), new Consumer() { // from class: l.ۤܳۤ
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    c182510.m52699((C21825) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C1455.$default$andThen(this, consumer);
                }
            });
        }
        if (c6264 != null && c6264.mo17325() == EnumC1923.FIELD) {
            m50223(c22489, new Supplier() { // from class: l.ۡܳۤ
                @Override // java.util.function.Supplier
                public final Object get() {
                    return c6264.mo50009();
                }
            }, new Consumer() { // from class: l.۟ܳۤ
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    c6264.m52712((C21825) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C1455.$default$andThen(this, consumer);
                }
            }, new Consumer() { // from class: l.ۤܳۤ
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    c182510.m52699((C21825) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C1455.$default$andThen(this, consumer);
                }
            });
        }
        C5286 c5286 = this.f73854;
        C21783 c21783M14618 = c5286.m14618(c182510.f77447);
        AbstractC11242 abstractC11243 = c182510.f77453;
        AbstractC5930 abstractC5930M14641 = this.f73854.m14641(c13757.f45368.f53222);
        C21825 c21825M48588 = C21825.m48588();
        C21825 c21825 = c2217.f7991;
        C21825 c21826 = c13757.f45366;
        if (c21826 == null) {
            c21825M14632 = C21825.m48588();
        } else {
            c21825M14632 = this.f73854.m14632(c21826);
        }
        C23195 c23195M14624 = c5286.m14624(c21783M14618, abstractC11243, abstractC5930M14641, c21825M48588, null, c21825, c21825M14632, null, null);
        c23195M14624.f75263 = c182510;
        c23195M14624.f30190 = c13757;
        EnumC9897 enumC9897M49993 = c22489.m49993();
        EnumC9897 enumC9897 = EnumC9897.EXPRESSION;
        C3836 c3836 = this.f73844;
        C23800 c23800 = this.f73852;
        if (enumC9897M49993 == enumC9897) {
            AbstractC5930 abstractC5930 = (AbstractC5930) c22489.f73408;
            AbstractC16579 abstractC16579Mo16235 = c23195M14624.f30190.mo16235();
            AbstractC16579 abstractC16579 = abstractC5930.f30190;
            c = 0;
            EnumC6617 enumC6617 = EnumC6617.VOID;
            boolean zM39001 = abstractC16579.m39001(enumC6617);
            boolean zM39002 = abstractC16579Mo16235.m39001(enumC6617);
            boolean zM52399 = c23800.m52399(abstractC16579Mo16235, c23800.m52383(c3836.f14293).f77449);
            C5286 c5287 = this.f73854;
            int i2 = c5287.f18294;
            c18258 = c182510;
            c6263 = c6264;
            try {
                if (zM39002) {
                    c5287.m14629((InterfaceC12260) abstractC5930);
                    c21452M14617 = this.f73854.m14617(0L, C21825.of((Object) c5287.m14642(abstractC5930)));
                } else if (zM39001 && zM52399) {
                    C19003 c19003 = new C19003();
                    C5286 c5288 = this.f73854;
                    c5288.m14629((InterfaceC12260) abstractC5930);
                    c19003.m43723(c5288.m14642(abstractC5930));
                    C5286 c5289 = this.f73854;
                    C1321 c1321M14581 = c5289.m14581(EnumC6617.BOT, (Object) null);
                    c1321M14581.f30190 = c3836.f14228;
                    c19003.m43723(c5289.m14635(c1321M14581));
                    c21452M14617 = this.f73854.m14617(0L, c19003.m43726());
                } else {
                    c5287.m14629((InterfaceC12260) abstractC5930);
                    c21452M14617 = c5287.m14617(0L, C21825.of((Object) this.f73854.m14635(abstractC5930)));
                }
                this.f73854.f18294 = i2;
            } catch (Throwable th) {
                this.f73854.f18294 = i2;
                throw th;
            }
        } else {
            c18258 = c182510;
            c6263 = c6264;
            c = 0;
            C21452 c21452 = (C21452) c22489.f73408;
            boolean z3 = c22489.f73409;
            AbstractC16579 abstractC16579Mo16236 = c23195M14624.f30190.mo16235();
            boolean zM39003 = abstractC16579Mo16236.m39001(EnumC6617.VOID);
            boolean zM523910 = c23800.m52399(abstractC16579Mo16236, c23800.m52383(c3836.f14293).f77449);
            c21452M14617 = (C21452) new C12469(this, zM39003, c23195M14624).mo3964(c21452);
            if (z3 && zM523910) {
                C21825 c21827 = c21452M14617.f69737;
                C5286 c52810 = this.f73854;
                C1321 c1321M14582 = c52810.m14581(EnumC6617.BOT, (Object) null);
                c1321M14582.f30190 = c3836.f14228;
                c21452M14617.f69737 = c21827.m48591(c52810.m14635(c1321M14582));
            }
        }
        c23195M14624.f75268 = (C21452) mo3964(c21452M14617);
        if (!this.f73849 || this.f73839 || c2217.m3376()) {
            z = false;
            c18259 = c18258;
        } else {
            C17407 c17407 = new C17407(this, c23195M14624.f75263, c23195M14624.f75268);
            C17407 c17408 = (C17407) C9735.putIfAbsent(this.f73851.f20899, c17407, c17407);
            if (c17408 != null) {
                c18259 = c17408.f55394;
                if (this.f73856) {
                    C9438 c9438 = C2005.f7500;
                    Object[] objArr = new Object[1];
                    objArr[c] = c18259;
                    this.f73858.m48198(c22489, new C9438("compiler", "verbose.l2m.deduplicate", objArr));
                }
                z = true;
            } else {
                z = false;
                c18259 = c18258;
            }
        }
        if (!z) {
            C6118.m17099(this.f73851, c23195M14624);
        }
        C19003 c19004 = new C19003();
        AbstractC5930 abstractC5931 = c2217.f7985;
        if (abstractC5931 != null) {
            c19004.m43723(abstractC5931);
        } else if (!c18259.mo22992()) {
            c19004.m43723(this.f73854.m14586((AbstractC23903) new C6263(8589938704L, c23942.f77533, c18259.f77448.m52720().f77449, abstractC23903.m52720())));
        }
        for (AbstractC23903 abstractC23905 : c2217.m6832(EnumC3628.CAPTURED_VAR).keySet()) {
            C6263 c6265 = c6263;
            if (abstractC23905 != c6265) {
                C3107 c3107M14586 = this.f73854.m14586(abstractC23905);
                c3107M14586.f30190 = abstractC23905.f77449;
                c19004.m43723(c3107M14586);
            }
            c6263 = c6265;
        }
        Iterator it = c2217.m6832(EnumC3628.CAPTURED_OUTER_THIS).keySet().iterator();
        while (it.hasNext()) {
            c19004.m43723(this.f73854.m14627(((AbstractC23903) it.next()).f77449));
        }
        this.f4871 = m50217(this.f73842, c18259.mo36947(), m50238(c19004.m43726(), c2217.f3408));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50223(C22489 c22489, Supplier supplier, Consumer consumer, Consumer consumer2) {
        C19003 c19003 = new C19003();
        C19003 c19004 = new C19003();
        for (C13278 c13278 : (C21825) supplier.get()) {
            if (c13278.f39811.f37185 == c22489) {
                c19004.m43723(c13278);
            } else {
                c19003.m43723(c13278);
            }
        }
        if (c19004.m43722()) {
            consumer.n(c19003.m43726());
            consumer2.n(c19004.m43726());
        }
    }

    @Override // l.C1052, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3929(C6966 c6966) {
        AbstractC5930 abstractC5930M14586;
        C5040 c5040 = (C5040) this.f73842;
        C18258 c18258 = (C18258) c6966.f23412;
        switch (C16702.f53494[c6966.f23410.ordinal()]) {
            case 1:
            case 2:
                abstractC5930M14586 = this.f73854.m14586((AbstractC23903) new C6263(8589938704L, this.f73845.f77533, c5040.f3411.m52720().f77449, c5040.f3411.m52720()));
                break;
            case 3:
                abstractC5930M14586 = this.f73848.m18295(this.f73857.m33045(this.f73852.m52402(c6966.f23412.f77448.f77449), this.f73840, c6966.f23408));
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                abstractC5930M14586 = null;
                break;
            default:
                throw new InternalError("Should not have an invalid kind");
        }
        this.f4871 = m50217(c5040, c18258.mo36947(), abstractC5930M14586 == null ? C21825.m48588() : m50238(C21825.of((Object) abstractC5930M14586), c5040.f3408));
    }

    @Override // l.C1052, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1262(C3107 c3107) {
        if (this.f73842 == null || !this.f73850.m31793(c3107.f11716)) {
            super.mo1262(c3107);
            return;
        }
        C5286 c5286 = this.f73854;
        int i = c5286.f18294;
        try {
            c5286.m14629((InterfaceC12260) c3107);
            AbstractC5930 abstractC5930M6834 = ((C2217) this.f73842).m6834(c3107);
            if (abstractC5930M6834 != null) {
                this.f4871 = abstractC5930M6834;
            } else {
                super.mo1262(c3107);
            }
        } finally {
            this.f73854.f18294 = i;
        }
    }

    @Override // l.C1052, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1268(C23570 c23570) {
        if (this.f73842 != null) {
            C22680 c22680 = this.f73850.f42638;
            AbstractC0806 abstractC0806 = c22680.f73842;
            if (abstractC0806 instanceof C2217) {
                C2217 c2217 = (C2217) abstractC0806;
                if (!c23570.f76355.mo22992() && c23570.f76356 == c22680.f73845.f77533 && c23570.f76355.f77448.f77452 == EnumC10477.f35865 && !((Map) c2217.f7989.get(EnumC3628.CAPTURED_OUTER_THIS)).isEmpty()) {
                    C5286 c5286 = this.f73854;
                    int i = c5286.f18294;
                    try {
                        c5286.m14629((InterfaceC12260) c23570);
                        C3107 c3107M6833 = ((C2217) this.f73842).m6833(c23570);
                        if (c3107M6833 != null) {
                            this.f4871 = c3107M6833;
                        } else {
                            super.mo1268(c23570);
                        }
                        return;
                    } finally {
                        this.f73854.f18294 = i;
                    }
                }
            }
        }
        super.mo1268(c23570);
    }

    @Override // l.C1052, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3932(C8378 c8378) {
        AbstractC0806 abstractC0806 = this.f73842;
        if (abstractC0806 == null || !this.f73850.m31790(abstractC0806, c8378)) {
            super.mo3932(c8378);
            return;
        }
        C5286 c5286 = this.f73854;
        int i = c5286.f18294;
        try {
            c5286.m14629((InterfaceC12260) c8378);
            ((C2217) this.f73842).m6835(c8378);
            super.mo3932(c8378);
        } finally {
            this.f73854.f18294 = i;
        }
    }

    @Override // l.C1052, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3928(C6656 c6656) {
        AbstractC0806 abstractC0806 = this.f73842;
        C2217 c2217 = (C2217) abstractC0806;
        if (abstractC0806 != null) {
            EnumC3628 enumC3628 = EnumC3628.LOCAL_VAR;
            if (c2217.m6832(enumC3628).containsKey(c6656.f22475)) {
                c6656.f22481 = (AbstractC5930) mo3964(c6656.f22481);
                c6656.f22475 = (C6263) c2217.m6832(enumC3628).get(c6656.f22475);
                this.f4871 = c6656;
                return;
            }
        }
        super.mo3928(c6656);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private C23195 m50209() {
        C19003 c19003 = new C19003();
        C19003 c19004 = new C19003();
        for (Map.Entry entry : this.f73851.f20901.entrySet()) {
            C17924 c17924M14612 = this.f73854.m14612((AbstractC11242) null);
            c19004.m43723(c17924M14612);
            C19003 c19005 = (C19003) entry.getValue();
            c19005.m43723(c17924M14612);
            C21825 c21825M43726 = c19005.m43726();
            C5286 c5286 = this.f73854;
            c19003.m43723(c5286.m14615(C18630.f60397, C21825.of((Object) c5286.m14580(entry.getKey())), c21825M43726, (AbstractC8774) null));
        }
        C5286 c5287 = this.f73854;
        C3836 c3836 = this.f73844;
        C2026 c2026M14577 = c5287.m14577(m50216("getImplMethodName", c3836.f14220, C21825.m48588(), C21825.m48588()), c19003.m43726());
        Iterator it = c19004.iterator();
        while (it.hasNext()) {
            ((C17924) it.next()).f56927 = c2026M14577;
        }
        C5286 c5288 = this.f73854;
        AbstractC16579 abstractC16579 = c3836.f14269;
        C21825 c21825Of = C21825.of((Object) c5288.m14580("Invalid lambda deserialization"));
        AbstractC23903 abstractC23903M45542 = this.f73847.m45542((InterfaceC12260) null, this.f73840, abstractC16579, C3128.m9446(c21825Of), C21825.m48588());
        C5286 c5289 = this.f73854;
        C8378 c8378M14600 = c5289.m14600((AbstractC5930) null, (C21825) null, c5289.m14641(abstractC16579.f53222), c21825Of, (C8753) null, false);
        c8378M14600.f29097 = abstractC23903M45542;
        c8378M14600.f30190 = abstractC16579;
        C21452 c21452M14617 = c5288.m14617(0L, C21825.of((Object) c2026M14577, (Object) c5288.m14578(c8378M14600)));
        C5286 c52810 = this.f73854;
        C23195 c23195M14624 = c52810.m14624(c52810.m14618(this.f73851.f20896.f77447), this.f73845.f77548, this.f73854.m14641(this.f73851.f20896.f77449.mo16235().f53222), C21825.m48588(), null, C21825.of((Object) this.f73854.m14594(this.f73851.f20898, (AbstractC5930) null)), C21825.m48588(), c21452M14617, null);
        c23195M14624.f75263 = this.f73851.f20896;
        c23195M14624.f30190 = this.f73851.f20896.f77449;
        return c23195M14624;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m50221(C15437 c15437, AbstractC16579 abstractC16579, C18258 c18258, InterfaceC12260 interfaceC12260, C21825 c21825, C13757 c13757) {
        String strM50212 = m50212(abstractC16579);
        String string = c18258.f77453.toString();
        AbstractC16579 abstractC165710 = c18258.f77449;
        C23800 c23800 = this.f73852;
        int i = 0;
        String strM50213 = m50213(c23800.m52402(abstractC165710), false);
        String strM50214 = m50212(c23800.m52402(c15437.f77448.f77449));
        String string2 = c15437.f77453.toString();
        String strM50215 = m50213(c23800.m52402(c15437.f77449), false);
        C3836 c3836 = this.f73844;
        C3131 c3131 = c3836.f14232;
        C15434 c15434M50216 = m50216("getImplMethodKind", c3131, C21825.m48588(), C21825.m48588());
        C1321 c1321M14580 = this.f73854.m14580(Integer.valueOf(c15437.m36946()));
        C5286 c5286 = this.f73854;
        EnumC18651 enumC18651 = EnumC18651.f60546;
        C22864 c22864M14622 = c5286.m14622(enumC18651, (AbstractC5930) c15434M50216, (AbstractC5930) c1321M14580);
        c22864M14622.f35957 = this.f73846.m26961(c22864M14622, enumC18651, c3131, c3131);
        c22864M14622.f30190 = c3836.f14263;
        C19003 c19003 = new C19003();
        Iterator it = c13757.f45367.iterator();
        while (it.hasNext()) {
            AbstractC16579 abstractC165711 = (AbstractC16579) it.next();
            C19003 c19004 = new C19003();
            String str = string2;
            c19004.m43723(this.f73854.m14580(Integer.valueOf(i)));
            C21825 c21825M43726 = c19004.m43726();
            C19003 c19005 = new C19003();
            c19005.m43723(c3836.f14232);
            c19003.m43723(this.f73854.m14584(c23800.m52402(abstractC165711), m50216("getCapturedArg", c3836.f14275, c19005.m43726(), c21825M43726)));
            i++;
            it = it;
            string2 = str;
            c23800 = c23800;
        }
        String str2 = string2;
        C4849 c4849M14588 = this.f73854.m14588(m50220(m50220(m50220(m50220(m50220(c22864M14622, "getFunctionalInterfaceClass", strM50212), "getFunctionalInterfaceMethodName", string), "getFunctionalInterfaceMethodSignature", strM50213), "getImplClass", strM50214), "getImplMethodSignature", strM50215), this.f73854.m14635(m50218(interfaceC12260, c3836.f14298, this.f73845.f77596, c21825, c13757, c19003.m43726(), c18258.f77453)), (AbstractC14728) null);
        C19003 c19006 = (C19003) this.f73851.f20901.get(str2);
        if (c19006 == null) {
            c19006 = new C19003();
            this.f73851.f20901.put(str2, c19006);
        }
        c19006.m43723(c4849M14588);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C22864 m50220(C22864 c22864, String str, String str2) {
        C3836 c3836 = this.f73844;
        C21825 c21825Of = C21825.of((Object) c3836.f14275);
        C3131 c3131 = c3836.f14263;
        C13757 c13757 = new C13757(c21825Of, c3131, C21825.m48588(), c3836.f14240);
        C4603 c4603 = this.f73840;
        AbstractC16579 abstractC16579 = c3836.f14275;
        AbstractC11242 abstractC11242 = this.f73845.f77561;
        C21825 c21825Of2 = C21825.of((Object) abstractC16579);
        C21825 c21825M48588 = C21825.m48588();
        C20145 c20145 = this.f73847;
        c20145.getClass();
        AbstractC23903 abstractC23903M45543 = c20145.m45543((InterfaceC12260) null, c4603, abstractC16579.f53222, abstractC16579, abstractC11242, c21825Of2, c21825M48588);
        C5286 c5286 = this.f73854;
        C21825 c21825M48589 = C21825.m48588();
        C23570 c23570M14626 = this.f73854.m14626(m50216(str, c3836.f14220, C21825.m48588(), C21825.m48588()), abstractC23903M45543);
        c23570M14626.f30190 = c13757;
        C15434 c15434M14610 = c5286.m14610(c23570M14626, c21825M48589, C21825.of((Object) this.f73854.m14580(str2)));
        c15434M14610.f30190 = c3131;
        C5286 c5287 = this.f73854;
        EnumC18651 enumC18651 = EnumC18651.f60464;
        C22864 c22864M14622 = c5287.m14622(enumC18651, (AbstractC5930) c22864, (AbstractC5930) c15434M14610);
        c22864M14622.f35957 = this.f73846.m26961(c22864M14622, enumC18651, c3131, c3131);
        c22864M14622.f30190 = c3131;
        return c22864M14622;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C15434 m50216(String str, AbstractC16579 abstractC16579, C21825 c21825, C21825 c21826) {
        C21825 c21825M48588 = C21825.m48588();
        C3836 c3836 = this.f73844;
        C13757 c13757 = new C13757(c21825, abstractC16579, c21825M48588, c3836.f14240);
        C4603 c4603 = this.f73840;
        AbstractC16579 abstractC165710 = c3836.f14260;
        AbstractC6302 abstractC6302 = this.f73845.f77631;
        abstractC6302.getClass();
        char[] charArray = str.toCharArray();
        AbstractC11242 abstractC11242Mo17390 = abstractC6302.mo17390(charArray, charArray.length);
        C21825 c21825M48589 = C21825.m48588();
        C20145 c20145 = this.f73847;
        c20145.getClass();
        AbstractC23903 abstractC23903M45543 = c20145.m45543((InterfaceC12260) null, c4603, abstractC165710.f53222, abstractC165710, abstractC11242Mo17390, c21825, c21825M48589);
        C5286 c5286 = this.f73854;
        C21825 c21825M485810 = C21825.m48588();
        C5286 c5287 = this.f73854;
        C3107 c3107M14586 = c5287.m14586((AbstractC23903) this.f73851.f20898);
        c3107M14586.f30190 = abstractC165710;
        C23570 c23570M14626 = c5287.m14626(c3107M14586, abstractC23903M45543);
        c23570M14626.f30190 = c13757;
        C15434 c15434M14610 = c5286.m14610(c23570M14626, c21825M485810, c21826);
        c15434M14610.f30190 = abstractC16579;
        return c15434M14610;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m50231(AbstractC16579 abstractC16579, AbstractC5930 abstractC5930) {
        if (abstractC16579 != null) {
            int i = C16702.f53496[abstractC5930.mo1803().ordinal()];
            if (i == 1) {
                ((C15434) abstractC5930).f50299 = abstractC16579;
            } else if (i == 2) {
                ((C8378) abstractC5930).f29094 = abstractC16579;
            } else {
                if (i == 3) {
                    m50231(abstractC16579, ((C2422) abstractC5930).f9708);
                    return;
                }
                throw new AssertionError();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50224(C22680 c22680, AbstractC23903 abstractC23903, C21825 c21825, AbstractC16579 abstractC16579) {
        C6171.m17176(abstractC23903.f77452 == EnumC10477.f35879);
        C21825 c21825Mo33523 = c22680.f73852.m52402(abstractC23903.f77449).mo33523();
        if (abstractC16579 != null) {
            C6171.m17176((abstractC23903.mo20276() & 17179869184L) != 0);
        }
        c22680.f73857.m33054(c21825, c21825Mo33523, abstractC16579, c22680.f73840);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C15434 m50217(AbstractC0806 abstractC0806, C15437 c15437, C21825 c21825) {
        C21825 c21826;
        int i;
        AbstractC1696 abstractC1696 = abstractC0806.f3413;
        C21825<AbstractC23903> c21827 = abstractC0806.f3409;
        AbstractC0618 abstractC0618 = abstractC1696.f6716.f53222;
        C23800 c23800 = this.f73852;
        C18258 c18258 = (C18258) c23800.m52385(abstractC0618);
        AbstractC16579 abstractC16579M52402 = c23800.m52402(c18258.f77449);
        C21825 c21825Mo33523 = abstractC16579M52402.mo33523();
        AbstractC16579 abstractC16579Mo16235 = abstractC16579M52402.mo16235();
        C21825 c21825Mo33524 = abstractC16579M52402.mo33524();
        C3836 c3836 = this.f73844;
        C13757 c13757 = new C13757(c21825Mo33523, abstractC16579Mo16235, c21825Mo33524, c3836.f14240);
        c15437.getClass();
        AbstractC16579 abstractC16579M52403 = c23800.m52402(abstractC1696.m5634(c23800));
        C21825 c21825Of = C21825.of((Object) c13757, (Object) c15437, (Object) new C13757(abstractC16579M52403.mo33523(), abstractC16579M52403.mo16235(), abstractC16579M52403.mo33524(), c3836.f14240));
        C19003 c19003 = new C19003();
        Iterator it = c21825.iterator();
        while (it.hasNext()) {
            c19003.m43723(((AbstractC5930) it.next()).f30190);
        }
        C13757 c13758 = new C13757(c19003.m43726(), abstractC1696.f30190, C21825.m48588(), c3836.f14240);
        boolean zM3375 = abstractC0806.m3375();
        C23942 c23942 = this.f73845;
        AbstractC11242 abstractC11242 = zM3375 ? c23942.f77596 : c23942.f77590;
        if (abstractC0806.m3375()) {
            C19003 c19004 = new C19003();
            AbstractC16579 abstractC16579 = abstractC1696.f6716;
            abstractC16579.getClass();
            Iterator it2 = (abstractC16579 instanceof C23594 ? c23800.m52356(abstractC1696.f6716) : C21825.m48588()).iterator();
            while (it2.hasNext()) {
                AbstractC16579 abstractC16579M52404 = c23800.m52402((AbstractC16579) it2.next());
                AbstractC0618 abstractC0619 = abstractC16579M52404.f53222;
                if (abstractC0619 != c3836.f14268.f53222 && abstractC0619 != abstractC1696.f30190.f53222 && abstractC0619 != c3836.f14275.f53222) {
                    c19004.m43723(abstractC16579M52404);
                }
            }
            boolean zM3376 = abstractC0806.m3376();
            boolean zM43722 = c19004.m43722();
            boolean zM48595 = c21827.m48595();
            int i2 = zM3376;
            if (zM43722) {
                i = (zM3376 ? 1 : 0) | 2;
            }
            if (zM48595) {
                i2 = i;
                i2 = (i2 == true ? 1 : 0) | 4;
            }
            i2 = i;
            C21825 c21825M48591 = c21825Of.m48591(C8711.m22543(i2));
            if (zM43722) {
                C21825 c21825M48592 = c21825M48591.m48591(C8711.m22543(c19004.m43728()));
                C21825 c21825M43726 = c19004.m43726();
                if (c21825M43726 == null) {
                    c21825M43726 = null;
                } else {
                    Iterator it3 = c21825M43726.iterator();
                    while (it3.hasNext()) {
                        InterfaceC7299.class.cast(it3.next());
                    }
                }
                c21825M48592.getClass();
                c21825M48591 = c21825M43726.m48594(c21825M48592);
            }
            if (zM48595) {
                c21825M48591 = c21825M48591.m48591(C8711.m22543(c21827.m48596() - 1));
                for (AbstractC23903 abstractC23903 : c21827) {
                    if (!c23800.m52399(abstractC23903.mo50006(c23800), c18258.mo50006(c23800))) {
                        c21825M48591 = c21825M48591.m48591((C13757) abstractC23903.mo50006(c23800));
                    }
                }
            }
            C21825 c21828 = c21825M48591;
            if (abstractC0806.m3376()) {
                C5286 c5286 = this.f73854;
                int i3 = c5286.f18294;
                try {
                    c5286.m14629((InterfaceC12260) this.f73851.f20900);
                    m50221(c15437, abstractC1696.f30190, c18258, abstractC1696, c21828, c13758);
                    this.f73854.f18294 = i3;
                } catch (Throwable th) {
                    this.f73854.f18294 = i3;
                    throw th;
                }
            }
            c21826 = c21828;
        } else {
            c21826 = c21825Of;
        }
        return m50218(abstractC1696, c3836.f14298, abstractC11242, c21826, c13758, c21825, c18258.f77453);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C15434 m50218(InterfaceC12260 interfaceC12260, AbstractC16579 abstractC16579, AbstractC11242 abstractC11242, C21825 c21825, C13757 c13757, C21825 c21826, AbstractC11242 abstractC11243) {
        C23800 c23800 = this.f73852;
        C3836 c3836 = this.f73844;
        C5286 c5286 = this.f73854;
        int i = c5286.f18294;
        try {
            c5286.m14629(interfaceC12260);
            C21825 c21825Of = C21825.of((Object) c3836.f14301, (Object) c3836.f14220, (Object) c3836.f14295);
            C13638.requireNonNull(c23800);
            C6969 c6969 = new C6969(abstractC11243, c3836.f14243, this.f73847.m45527(interfaceC12260, this.f73840, abstractC16579, abstractC11242, c21825.m48592((Function) new C10645(1, c23800)).m48594(c21825Of), C21825.m48588()).mo36947(), c13757, (InterfaceC7299[]) c21825.toArray(new InterfaceC7299[c21825.m48596()]));
            C5286 c5287 = this.f73854;
            C23570 c23570M14625 = c5287.m14625(c5287.m14641(abstractC16579.f53222), abstractC11242);
            C6969 c69610 = (C6969) C9735.putIfAbsent(this.f73851.f20895, C17882.m41504(c6969, c23800), c6969);
            if (c69610 != null) {
                c6969 = c69610;
            }
            c23570M14625.f76355 = c6969;
            c23570M14625.f30190 = c13757.f45368;
            C15434 c15434M14610 = this.f73854.m14610(c23570M14625, C21825.m48588(), c21826);
            c15434M14610.f30190 = c13757.f45368;
            return c15434M14610;
        } finally {
            this.f73854.f18294 = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m50213(AbstractC16579 abstractC16579, boolean z) {
        try {
            C11058 c11058 = new C11058(this, z);
            c11058.mo30442(abstractC16579);
            return c11058.f37545.toString();
        } catch (C15333 e) {
            C22492 c22492 = this.f73840.f16301.f30086;
            AbstractC16579 abstractC16579M36713 = e.m36713();
            C14377 c14377 = C14707.f48054;
            this.f73858.m48197(C23879.m52624(c22492, new C14377("compiler", "illegal.signature", c22492, abstractC16579M36713)));
            return "<ERRONEOUS>";
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m50212(AbstractC16579 abstractC16579) {
        try {
            C11058 c11058 = new C11058(this, false);
            c11058.m48424(abstractC16579);
            return c11058.f37545.toString();
        } catch (C15333 e) {
            C22492 c22492 = this.f73840.f16301.f30086;
            AbstractC16579 abstractC16579M36713 = e.m36713();
            C14377 c14377 = C14707.f48054;
            this.f73858.m48197(C23879.m52624(c22492, new C14377("compiler", "illegal.signature", c22492, abstractC16579M36713)));
            return "<ERRONEOUS>";
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m50225(C22680 c22680, AbstractC23903 abstractC23903, AbstractC23903 abstractC23904) {
        return ((abstractC23903.mo20276() & 4) == 0 || abstractC23903.m52724() == abstractC23904.m52724()) ? false : true;
    }

    public C22680(C12343 c12343) {
        boolean zM35402;
        c12343.m30659(f73838, this);
        this.f73841 = C23549.m51906(c12343);
        this.f73858 = C20414.m46161(c12343);
        this.f73853 = C1512.m5224(c12343);
        this.f73845 = C23942.m52776(c12343);
        this.f73844 = C3836.m11131(c12343);
        this.f73847 = C20145.m45505(c12343);
        this.f73846 = C10727.m26956(c12343);
        this.f73854 = C5286.m14576(c12343);
        this.f73852 = C23800.m52336(c12343);
        this.f73857 = C13526.m33043(c12343);
        this.f73850 = new C12802(this);
        C14770 c14770M35395 = C14770.m35395(c12343);
        this.f73843 = c14770M35395.m35407("debug.dumpLambdaToMethodStats");
        this.f73848 = C6761.m18268(c12343);
        this.f73860 = c14770M35395.m35407("forceSerializable");
        EnumC19730 enumC19730 = EnumC19730.f63377;
        boolean z = c14770M35395.m35405(enumC19730) || c14770M35395.m35402(enumC19730, "lines");
        if (c14770M35395.m35405(enumC19730)) {
            zM35402 = c14770M35395.m35408(EnumC19730.f63393);
        } else {
            zM35402 = c14770M35395.m35402(enumC19730, "vars");
        }
        this.f73839 = z || zM35402;
        this.f73856 = c14770M35395.m35407("debug.dumpLambdaToMethodDeduplication");
        String strM35397 = c14770M35395.m35397("deduplicateLambdas");
        this.f73849 = strM35397 != null ? Boolean.parseBoolean(strM35397) : true;
        this.f73855 = EnumC14128.m34159(c12343).m34170();
    }
}
