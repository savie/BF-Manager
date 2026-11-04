package l;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۢ۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: B6I6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10132 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f32422 = C16980.m40037(C10132.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6129 f32423;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumMap f32424;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C8706 f32425;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C1610 f32426;

    public C10132(C1610 c1610) {
        this.f32426 = c1610;
        this.f32423 = c1610.m5681();
        EnumMap enumMap = new EnumMap(EnumC24203.class);
        enumMap.put(EnumC24203.CONST, new InterfaceC24370() { // from class: l.ܺ۫᩵
            @Override // l.InterfaceC24370
            /* JADX INFO: renamed from: ۙ */
            public final EnumC4695 mo2254(C7150 c7150, C18959 c18959, AbstractC16481 abstractC16481, AbstractC1566 abstractC1566) {
                AbstractC16481 abstractC16481Mo44035 = c18959.m44027() == abstractC16481 ? c18959.mo44035(0) : c18959.m44027();
                if (c7150.m19717(abstractC16481Mo44035, abstractC1566)) {
                    return EnumC4695.CHANGED;
                }
                return this.f54302.m26141(c7150, abstractC16481Mo44035, abstractC1566, (InterfaceC4232) null);
            }
        });
        enumMap.put(EnumC24203.MOVE, new InterfaceC24370() { // from class: l.ۛ۫᩵
            @Override // l.InterfaceC24370
            /* JADX INFO: renamed from: ۙ */
            public final EnumC4695 mo2254(C7150 c7150, C18959 c18959, AbstractC16481 abstractC16481, AbstractC1566 abstractC1566) {
                return C10132.m26134(this.f21608, c7150, c18959, abstractC16481, abstractC1566);
            }
        });
        enumMap.put(EnumC24203.PHI, new InterfaceC24370() { // from class: l.᩺۫᩵
            @Override // l.InterfaceC24370
            /* JADX INFO: renamed from: ۙ */
            public final EnumC4695 mo2254(C7150 c7150, C18959 c18959, AbstractC16481 abstractC16481, AbstractC1566 abstractC1566) {
                return this.f78654.m26126(c7150, c18959, abstractC16481, abstractC1566);
            }
        });
        enumMap.put(EnumC24203.AGET, new InterfaceC24370() { // from class: l.ۘ۫᩵
            @Override // l.InterfaceC24370
            /* JADX INFO: renamed from: ۙ */
            public final EnumC4695 mo2254(C7150 c7150, final C18959 c18959, AbstractC16481 abstractC16481, AbstractC1566 abstractC1566) {
                C6041 c6041M44027 = c18959.m44027();
                final C10132 c10132 = this.f14148;
                if (c6041M44027 == abstractC16481) {
                    return c10132.m26141(c7150, c18959.mo44035(0), AbstractC1566.m5528(abstractC1566), new C18788(c10132, c18959, abstractC1566));
                }
                if (c18959.mo44035(0) == abstractC16481) {
                    final AbstractC1566 abstractC1566Mo5557 = abstractC1566.mo5557();
                    if (abstractC1566Mo5557 == null) {
                        return EnumC4695.REJECT;
                    }
                    return c10132.m26141(c7150, c18959.m44027(), abstractC1566Mo5557, new InterfaceC4232() { // from class: l.ۨ۫᩵
                        @Override // l.InterfaceC4232
                        /* JADX INFO: renamed from: ۙ */
                        public final EnumC4695 mo11179(EnumC4695 enumC4695) {
                            return C10132.m26138(c10132, c18959, abstractC1566Mo5557, enumC4695);
                        }
                    });
                }
                return EnumC4695.SAME;
            }
        });
        enumMap.put(EnumC24203.APUT, new InterfaceC24370() { // from class: l.ܰ۫᩵
            @Override // l.InterfaceC24370
            /* JADX INFO: renamed from: ۙ */
            public final EnumC4695 mo2254(C7150 c7150, C18959 c18959, AbstractC16481 abstractC16481, AbstractC1566 abstractC1566) {
                AbstractC16481 abstractC16481Mo44035 = c18959.mo44035(0);
                AbstractC16481 abstractC16481Mo44036 = c18959.mo44035(2);
                C10132 c10132 = this.f46016;
                if (abstractC16481Mo44035 != abstractC16481) {
                    if (abstractC16481Mo44035 == abstractC16481Mo44036) {
                        return c10132.m26141(c7150, abstractC16481Mo44035, AbstractC1566.m5528(abstractC1566), (InterfaceC4232) null);
                    }
                    return EnumC4695.SAME;
                }
                AbstractC1566 abstractC1566Mo5557 = abstractC1566.mo5557();
                if (abstractC1566Mo5557 == null) {
                    return EnumC4695.REJECT;
                }
                return c10132.m26141(c7150, abstractC16481Mo44036, abstractC1566Mo5557, new C18986(c10132, abstractC16481Mo44036, abstractC1566Mo5557));
            }
        });
        enumMap.put(EnumC24203.IF, new InterfaceC24370() { // from class: l.᩶۫᩵
            @Override // l.InterfaceC24370
            /* JADX INFO: renamed from: ۙ */
            public final EnumC4695 mo2254(C7150 c7150, C18959 c18959, AbstractC16481 abstractC16481, AbstractC1566 abstractC1566) {
                AbstractC16481 abstractC16481Mo44035 = c18959.mo44035(0);
                AbstractC16481 abstractC16481Mo44036 = c18959.mo44035(1);
                if (abstractC16481Mo44035 == abstractC16481) {
                    abstractC16481Mo44035 = abstractC16481Mo44036;
                }
                return this.f67931.m26141(c7150, abstractC16481Mo44035, abstractC1566, new C20448(abstractC16481Mo44035, abstractC1566));
            }
        });
        enumMap.put(EnumC24203.ARITH, new InterfaceC24370() { // from class: l.ܿ۫᩵
            @Override // l.InterfaceC24370
            /* JADX INFO: renamed from: ۙ */
            public final EnumC4695 mo2254(C7150 c7150, C18959 c18959, AbstractC16481 abstractC16481, AbstractC1566 abstractC1566) {
                return C10132.m26127(this.f59807, c7150, c18959, abstractC16481, abstractC1566);
            }
        });
        enumMap.put(EnumC24203.NEG, new InterfaceC24370() { // from class: l.֡۫᩵
            @Override // l.InterfaceC24370
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final EnumC4695 mo2254(C7150 c7150, C18959 c18959, AbstractC16481 abstractC16481, AbstractC1566 abstractC1566) {
                return this.f2004.m26136(c7150, c18959, abstractC16481, abstractC1566);
            }
        });
        enumMap.put(EnumC24203.NOT, new InterfaceC24370() { // from class: l.֡۫᩵
            @Override // l.InterfaceC24370
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final EnumC4695 mo2254(C7150 c7150, C18959 c18959, AbstractC16481 abstractC16481, AbstractC1566 abstractC1566) {
                return this.f2004.m26136(c7150, c18959, abstractC16481, abstractC1566);
            }
        });
        enumMap.put(EnumC24203.CHECK_CAST, new InterfaceC24370() { // from class: l.۟۫᩵
            @Override // l.InterfaceC24370
            /* JADX INFO: renamed from: ۙ */
            public final EnumC4695 mo2254(C7150 c7150, C18959 c18959, AbstractC16481 abstractC16481, AbstractC1566 abstractC1566) {
                return C10132.m26135(this.f26247, c7150, c18959, abstractC16481, abstractC1566);
            }
        });
        enumMap.put(EnumC24203.INVOKE, new InterfaceC24370() { // from class: l.᩵۫᩵
            @Override // l.InterfaceC24370
            /* JADX INFO: renamed from: ۙ */
            public final EnumC4695 mo2254(C7150 c7150, C18959 c18959, AbstractC16481 abstractC16481, AbstractC1566 abstractC1566) {
                return C10132.m26137(this.f65898, c7150, c18959, abstractC16481, abstractC1566);
            }
        });
        enumMap.put(EnumC24203.CONSTRUCTOR, new InterfaceC24370() { // from class: l.᩵۫᩵
            @Override // l.InterfaceC24370
            /* JADX INFO: renamed from: ۙ */
            public final EnumC4695 mo2254(C7150 c7150, C18959 c18959, AbstractC16481 abstractC16481, AbstractC1566 abstractC1566) {
                return C10132.m26137(this.f65898, c7150, c18959, abstractC16481, abstractC1566);
            }
        });
        this.f32424 = enumMap;
        this.f32425 = new C8706(c1610);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC4695 m26140(C2551 c2551, C17973 c17973, AbstractC1566 abstractC1566) {
        return m26123(c2551, c17973, abstractC1566, C2675.f8501);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC4695 m26144(C2551 c2551, C17973 c17973, AbstractC1566 abstractC1566) {
        return m26123(c2551, c17973, abstractC1566, C2675.f8504);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC4695 m26146(C2551 c2551, C17973 c17973, AbstractC1566 abstractC1566) {
        return m26123(c2551, c17973, abstractC1566, C2675.f8502);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC4695 m26145(C2551 c2551, C17973 c17973, AbstractC1566 abstractC1566) {
        return m26123(c2551, c17973, abstractC1566, C2675.f8503);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private EnumC4695 m26123(C2551 c2551, C17973 c17973, AbstractC1566 abstractC1566, C2675 c2675) {
        if (abstractC1566 != null) {
            try {
                if (abstractC1566.mo5564()) {
                    C7150 c7150 = new C7150(c2551, c2675, this.f32423);
                    EnumC4695 enumC4695M26141 = m26141(c7150, c17973.m41930(), abstractC1566, (InterfaceC4232) null);
                    if (enumC4695M26141 == null) {
                        enumC4695M26141 = m26124(c7150);
                    }
                    if (enumC4695M26141 == EnumC4695.REJECT) {
                        return enumC4695M26141;
                    }
                    if (c7150.m19726()) {
                        return EnumC4695.SAME;
                    }
                    c7150.m19715();
                    return EnumC4695.CHANGED;
                }
            } catch (C2631 e) {
                throw e;
            } catch (Exception e2) {
                throw new C8597("Type update failed for variable: " + c17973 + ", new type: " + abstractC1566, e2);
            }
        }
        return EnumC4695.REJECT;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private EnumC4695 m26124(C7150 c7150) {
        EnumC4695 enumC4695M26125;
        AbstractC1566 type;
        EnumC4695 enumC4695 = EnumC4695.REJECT;
        while (true) {
            C13861 c13861M19720 = c7150.m19720();
            if (c13861M19720 == null) {
                return enumC4695;
            }
            AbstractC16481 abstractC16481M33805 = c13861M19720.m33805();
            AbstractC1566 abstractC1566M33806 = c13861M19720.m33806();
            EnumC4695 enumC4696 = null;
            if (!c13861M19720.m33808() && (abstractC16481M33805 instanceof C6041)) {
                C17973 c17973M17530 = ((C6041) abstractC16481M33805).m17530();
                if (c7150.m19717(c17973M17530.m41930(), abstractC1566M33806)) {
                    enumC4695M26125 = EnumC4695.CHANGED;
                } else {
                    C22813 c22813M41943 = c17973M17530.m41943();
                    AbstractC1566 abstractC1566M41941 = c17973M17530.m41941();
                    if (abstractC1566M41941 != null && !abstractC1566M41941.equals(abstractC1566M33806)) {
                        enumC4695M26125 = EnumC4695.REJECT;
                    } else {
                        Iterator it = c22813M41943.m51443().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                C19894 c19894 = new C19894(this, c7150, c17973M17530.m41946(), abstractC1566M33806, true);
                                c19894.m45791(new C4601(c7150, c17973M17530));
                                c7150.m19716(new C13861(c17973M17530.m41930(), abstractC1566M33806, true, c19894));
                                enumC4695M26125 = null;
                                break;
                            }
                            InterfaceC20640 interfaceC20640 = (InterfaceC20640) it.next();
                            if (interfaceC20640 instanceof InterfaceC12435) {
                                type = ((InterfaceC12435) interfaceC20640).mo2467(c7150);
                            } else {
                                type = interfaceC20640.getType();
                            }
                            if (type != null && !m26132(abstractC1566M33806, interfaceC20640, type)) {
                                enumC4695M26125 = EnumC4695.REJECT;
                                break;
                            }
                        }
                    }
                }
            } else {
                enumC4695M26125 = m26125(c7150, abstractC16481M33805, abstractC1566M33806);
            }
            c7150.m19723(c13861M19720);
            if (enumC4695M26125 != null) {
                while (true) {
                    C13861 c13861M19721 = c7150.m19721();
                    if (c13861M19721 == null) {
                        enumC4696 = enumC4695M26125;
                        break;
                    }
                    InterfaceC4232 interfaceC4232M33807 = c13861M19721.m33807();
                    C17359.requireNonNull(interfaceC4232M33807);
                    enumC4695M26125 = interfaceC4232M33807.mo11179(enumC4695M26125);
                    if (enumC4695M26125 == null) {
                        c7150.m19723(c13861M19721);
                        break;
                    }
                    if (enumC4695M26125 == EnumC4695.REJECT) {
                        c7150.m19719(c13861M19721.m33805());
                    }
                }
                enumC4695 = enumC4696;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00a4  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC4695 m26141(C7150 c7150, AbstractC16481 abstractC16481, AbstractC1566 abstractC1566, InterfaceC4232 interfaceC4232) {
        EnumC4695 enumC4695;
        if (abstractC1566 == null) {
            throw new C8597("Null type update for arg: " + abstractC16481);
        }
        if (c7150.m19725(abstractC16481)) {
            enumC4695 = EnumC4695.CHANGED;
        } else {
            AbstractC1566 type = abstractC16481.getType();
            C2675 c2675M19722 = c7150.m19722();
            if (C17359.equals(type, abstractC1566)) {
                if (c2675M19722.m8839()) {
                    enumC4695 = null;
                } else {
                    enumC4695 = EnumC4695.SAME;
                }
            } else if (abstractC1566.m5540()) {
                enumC4695 = EnumC4695.REJECT;
            } else {
                EnumC7215 enumC7215M23403 = this.f32425.m23403(abstractC1566, type);
                if (enumC7215M23403.m19814()) {
                    enumC4695 = EnumC4695.REJECT;
                } else if (enumC7215M23403 == EnumC7215.UNKNOWN && c2675M19722.m8838()) {
                    enumC4695 = EnumC4695.REJECT;
                } else if (abstractC16481.mo1129() && type != AbstractC1566.f5420) {
                    if (enumC7215M23403 == EnumC7215.EQUAL) {
                        enumC4695 = EnumC4695.SAME;
                    } else {
                        enumC4695 = EnumC4695.REJECT;
                    }
                } else if (enumC7215M23403 == EnumC7215.WIDER_BY_GENERIC && c2675M19722.m8840()) {
                    enumC4695 = EnumC4695.REJECT;
                } else if (enumC7215M23403.m19811() && !c2675M19722.m8837()) {
                    enumC4695 = EnumC4695.REJECT;
                } else if (abstractC1566.m5567()) {
                    C3101 c3101M5692 = this.f32426.m5692();
                    C2551 c2551M19718 = c7150.m19718();
                    c3101M5692.getClass();
                    if (((AbstractC1566) abstractC1566.m5544((Function) new C25269(1, C3101.m10099(c2551M19718)))) != null) {
                        enumC4695 = EnumC4695.REJECT;
                    } else {
                        enumC4695 = null;
                    }
                } else {
                    enumC4695 = null;
                }
            }
        }
        if (enumC4695 == null) {
            c7150.m19716(new C13861(abstractC16481, abstractC1566, false, interfaceC4232));
            return null;
        }
        if (interfaceC4232 == null) {
            return enumC4695;
        }
        EnumC4695 enumC4695Mo11179 = interfaceC4232.mo11179(enumC4695);
        if (enumC4695Mo11179 == null) {
            c7150.m19723(new C13861(abstractC16481, abstractC1566, false, interfaceC4232));
        }
        return enumC4695Mo11179;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m26130(C7150 c7150, C17973 c17973, EnumC4695 enumC4695) {
        if (enumC4695 == EnumC4695.REJECT) {
            c7150.m19719(c17973.m41930());
            C4937.forEach(c17973.m41946(), new C10886(1, c7150));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private EnumC4695 m26125(C7150 c7150, AbstractC16481 abstractC16481, AbstractC1566 abstractC1566) {
        if (c7150.m19725(abstractC16481)) {
            return EnumC4695.CHANGED;
        }
        c7150.m19724(abstractC16481, abstractC1566);
        C18959 c18959M39118 = abstractC16481.m39118();
        if (c18959M39118 == null) {
            return EnumC4695.SAME;
        }
        InterfaceC24370 interfaceC24370 = (InterfaceC24370) this.f32424.get(c18959M39118.getType());
        if (interfaceC24370 == null) {
            return EnumC4695.CHANGED;
        }
        return interfaceC24370.mo2254(c7150, c18959M39118, abstractC16481, abstractC1566);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m26143(LinkedHashSet linkedHashSet, AbstractC1566 abstractC1566) {
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            InterfaceC20640 interfaceC20640 = (InterfaceC20640) it.next();
            AbstractC1566 type = interfaceC20640.getType();
            if (type != null && !m26132(abstractC1566, interfaceC20640, type)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0051 A[RETURN] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m26132(AbstractC1566 abstractC1566, InterfaceC20640 interfaceC20640, AbstractC1566 abstractC1567) {
        C8706 c8706 = this.f32425;
        EnumC7215 enumC7215M23403 = c8706.m23403(abstractC1566, abstractC1567);
        switch (C19083.f61799[enumC7215M23403.ordinal()]) {
            case 1:
            case 4:
            case 5:
                return true;
            case 2:
                if (interfaceC20640.mo2468() != EnumC15418.USE) {
                    return true;
                }
                return false;
            case 3:
                if (interfaceC20640.mo2468() != EnumC15418.ASSIGN || (!abstractC1567.mo5564() && m26131(abstractC1567, abstractC1566))) {
                    return true;
                }
                return false;
            case 6:
            case 7:
                return false;
            case 8:
                f32422.mo13710("Can't compare types, unknown hierarchy: {} and {}", abstractC1566, abstractC1567);
                c8706.m23403(abstractC1566, abstractC1567);
                return true;
            default:
                throw new C8597("Not processed type compare enum: " + enumC7215M23403);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m26131(AbstractC1566 abstractC1566, AbstractC1566 abstractC1567) {
        if (abstractC1566 == AbstractC1566.f5420) {
            return true;
        }
        boolean zM5554 = abstractC1567.m5554();
        if (abstractC1566.m5554() && zM5554) {
            return m26131(abstractC1566.mo5557(), abstractC1567.mo5557());
        }
        if (zM5554 && abstractC1566.mo5566(EnumC12006.ARRAY)) {
            return true;
        }
        if (abstractC1567.mo5543() && abstractC1566.mo5566(EnumC12006.OBJECT)) {
            return true;
        }
        return abstractC1567.m5556() && abstractC1566.mo5566(abstractC1567.mo5558());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static EnumC4695 m26137(C10132 c10132, C7150 c7150, C18959 c18959, AbstractC16481 abstractC16481, final AbstractC1566 abstractC1566) {
        Function c20387;
        Supplier supplier;
        C1610 c1610 = c10132.f32426;
        AbstractC15251 abstractC15251 = (AbstractC15251) c18959;
        if (abstractC15251.m44027() == abstractC16481) {
            return EnumC4695.SAME;
        }
        if (abstractC15251.mo13131() == abstractC16481) {
            InterfaceC21197 interfaceC21197M19301 = c1610.m5683().m19301(abstractC15251);
            if (interfaceC21197M19301 == null) {
                return EnumC4695.SAME;
            }
            final C3101 c3101M5692 = c1610.m5692();
            C2551 c2551M19718 = c7150.m19718();
            c3101M5692.getClass();
            Set setM10099 = C3101.m10099(c2551M19718);
            final Map mapM10108 = c3101M5692.m10108(abstractC1566);
            final AbstractC1566 abstractC1566Mo8519 = interfaceC21197M19301.mo8519();
            final List listMo8537 = interfaceC21197M19301.mo8537();
            int size = listMo8537.size();
            if (mapM10108.isEmpty()) {
                supplier = new Supplier() { // from class: l.ܽ۫᩵
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return abstractC1566Mo8519;
                    }
                };
                c20387 = new C20387(3, listMo8537);
            } else {
                Supplier supplier2 = new Supplier() { // from class: l.ܶ۫᩵
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return c3101M5692.m10105(abstractC1566Mo8519, mapM10108);
                    }
                };
                c20387 = new Function() { // from class: l.᩹۫᩵
                    @Override // java.util.function.Function
                    /* JADX INFO: renamed from: andThen */
                    public /* synthetic */ Function mo10608andThen(Function function) {
                        return C24247.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public /* synthetic */ Function compose(Function function) {
                        return C24247.$default$compose(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        AbstractC1566 abstractC1567 = (AbstractC1566) listMo8537.get(((Integer) obj).intValue());
                        C3101 c3101 = c3101M5692;
                        AbstractC1566 abstractC1568 = abstractC1566;
                        return c3101.m10106(abstractC1568, abstractC1568, abstractC1567);
                    }
                };
                supplier = supplier2;
            }
            return new C18402(c10132, c7150, abstractC15251, size, setM10099, supplier, c20387).m42914();
        }
        return EnumC4695.SAME;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static EnumC4695 m26134(C10132 c10132, C7150 c7150, final C18959 c18959, AbstractC16481 abstractC16481, final AbstractC1566 abstractC1566) {
        if (c18959.m44027() == null) {
            return EnumC4695.CHANGED;
        }
        final boolean z = true;
        boolean z2 = c18959.m44027() == abstractC16481;
        final AbstractC16481 abstractC16481Mo44035 = z2 ? c18959.mo44035(0) : c18959.m44027();
        EnumC7215 enumC7215M23403 = c10132.f32425.m23403(abstractC1566, abstractC16481Mo44035.getType());
        if (!enumC7215M23403.m19813() && (!z2 ? !enumC7215M23403.m19812() : !enumC7215M23403.m19811())) {
            z = false;
        }
        return c10132.m26141(c7150, abstractC16481Mo44035, abstractC1566, new InterfaceC4232(z, abstractC1566, abstractC16481Mo44035, c18959) { // from class: l.ۗ۫᩵

            /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ boolean f11094;

            @Override // l.InterfaceC4232
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final EnumC4695 mo11179(EnumC4695 enumC4695) {
                EnumC4695 enumC4696 = EnumC4695.SAME;
                boolean z3 = this.f11094;
                if (enumC4695 != enumC4696 || z3) {
                    return (enumC4695 == EnumC4695.REJECT && z3) ? EnumC4695.CHANGED : enumC4695;
                }
                return EnumC4695.REJECT;
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC4695 m26127(C10132 c10132, C7150 c7150, C18959 c18959, AbstractC16481 abstractC16481, AbstractC1566 abstractC1566) {
        C22711 c22711 = (C22711) c18959;
        if (abstractC1566 == AbstractC1566.f5436 && c22711.m51191().m45426()) {
            return c10132.m26126(c7150, c18959, abstractC16481, abstractC1566);
        }
        return c10132.m26136(c7150, c18959, abstractC16481, abstractC1566);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public EnumC4695 m26136(C7150 c7150, C18959 c18959, AbstractC16481 abstractC16481, AbstractC1566 abstractC1566) {
        AbstractC16481 abstractC16481M44027;
        C19894 c19894 = new C19894(this, c7150, c18959.m44023(), abstractC1566, false);
        c19894.m45790(new C10576(2, abstractC16481));
        c19894.m45792();
        if (c18959.m44027() != abstractC16481 && (abstractC16481M44027 = c18959.m44027()) != null) {
            return m26141(c7150, abstractC16481M44027, abstractC1566, c19894);
        }
        return c19894.m45789();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        if (r4.m19957() == false) goto L30;
     */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.EnumC4695 m26135(l.C10132 r5, l.C7150 r6, l.C18959 r7, l.AbstractC16481 r8, l.AbstractC1566 r9) {
        /*
            r0 = r7
            l.ۗۢۗ r0 = (l.C3319) r0
            l.ۛ֨ۗ r1 = r7.m44027()
            r2 = 0
            if (r1 != r8) goto L18
            l.ܺ֨ۗ r7 = r7.mo44035(r2)
            l.ᩴܿ֫ r8 = new l.ᩴܿ֫
            r8.<init>()
            l.ۙۚ᩵ r5 = r5.m26141(r6, r7, r9, r8)
            return r5
        L18:
            java.lang.Object r8 = r0.m10937()
            l.֫֨ۗ r8 = (l.AbstractC1566) r8
            l.۠ܳ᩵ r1 = r5.f32425
            l.ۜܳ᩵ r1 = r1.m23403(r9, r8)
            l.ۜܳ᩵ r3 = l.EnumC7215.CONFLICT
            if (r1 != r3) goto L6e
            l.֫ۖۗ r3 = r5.f32426
            boolean r4 = r9.mo5543()
            if (r4 == 0) goto L6b
            boolean r4 = r8.mo5543()
            if (r4 != 0) goto L37
            goto L6b
        L37:
            l.᩷֡ۗ r4 = r3.m5691()
            l.ۜܿۗ r4 = r4.m49222(r9)
            l.᩷֡ۗ r3 = r3.m5691()
            l.ۜܿۗ r8 = r3.m49222(r8)
            if (r4 == 0) goto L50
            boolean r3 = r4.m19957()
            if (r3 != 0) goto L50
            goto L6b
        L50:
            if (r8 == 0) goto L59
            boolean r3 = r8.m19957()
            if (r3 != 0) goto L59
            goto L6b
        L59:
            if (r4 == 0) goto L6e
            if (r8 != 0) goto L5e
            goto L6e
        L5e:
            boolean r8 = r8.m19957()
            if (r8 == 0) goto L6b
            boolean r8 = r4.m19957()
            if (r8 == 0) goto L6b
            goto L6e
        L6b:
            l.ۙۚ᩵ r5 = l.EnumC4695.REJECT
            return r5
        L6e:
            l.ۜܳ᩵ r8 = l.EnumC7215.CONFLICT_BY_GENERIC
            if (r1 != r8) goto L7d
            l.֫۟ۗ r8 = l.EnumC1763.SOFT_CAST
            boolean r7 = r7.mo17865(r8)
            if (r7 != 0) goto L7d
            l.ۙۚ᩵ r5 = l.EnumC4695.REJECT
            return r5
        L7d:
            l.ۜܳ᩵ r7 = l.EnumC7215.NARROW_BY_GENERIC
            if (r1 != r7) goto L91
            boolean r7 = r9.m5552()
            if (r7 == 0) goto L91
            l.ۛ֨ۗ r7 = r0.m44027()
            r8 = 0
            l.ۙۚ᩵ r5 = r5.m26141(r6, r7, r9, r8)
            return r5
        L91:
            l.ܺ֨ۗ r5 = r0.mo44035(r2)
            l.֫֨ۗ r5 = r5.getType()
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto La2
            l.ۙۚ᩵ r5 = l.EnumC4695.SAME
            return r5
        La2:
            l.ۙۚ᩵ r5 = l.EnumC4695.CHANGED
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10132.m26135(l.ۢ۫᩵, l.ۜ۫᩵, l.ᩳۡۗ, l.ܺ֨ۗ, l.֫֨ۗ):l.ۙۚ᩵");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC4695 m26129(C10132 c10132, C18959 c18959, AbstractC1566 abstractC1566, EnumC4695 enumC4695) {
        if (enumC4695 == EnumC4695.REJECT) {
            AbstractC1566 type = c18959.mo44035(0).getType();
            if (type.mo5564() && type.m5554() && type.mo5557().m5556() && c10132.f32425.m23403(abstractC1566, type.mo5557()) == EnumC7215.WIDER) {
                return EnumC4695.CHANGED;
            }
        }
        return enumC4695;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC4695 m26138(C10132 c10132, C18959 c18959, AbstractC1566 abstractC1566, EnumC4695 enumC4695) {
        if (enumC4695 == EnumC4695.REJECT) {
            AbstractC1566 type = c18959.m44027().getType();
            if (type.mo5564() && type.m5556() && c10132.f32425.m23403(type, abstractC1566) == EnumC7215.WIDER) {
                return EnumC4695.CHANGED;
            }
        }
        return enumC4695;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC4695 m26128(C10132 c10132, AbstractC16481 abstractC16481, AbstractC1566 abstractC1566, EnumC4695 enumC4695) {
        EnumC7215 enumC7215M23403;
        if (enumC4695 == EnumC4695.REJECT) {
            AbstractC1566 type = abstractC16481.getType();
            if (type.mo5564() && ((enumC7215M23403 = c10132.f32425.m23403(abstractC1566, type)) == EnumC7215.WIDER || enumC7215M23403 == EnumC7215.WIDER_BY_GENERIC)) {
                return EnumC4695.CHANGED;
            }
        }
        return enumC4695;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC4695 m26126(C7150 c7150, C18959 c18959, AbstractC16481 abstractC16481, AbstractC1566 abstractC1566) {
        if (c18959.m44027() != abstractC16481) {
            return m26141(c7150, c18959.m44027(), abstractC1566, (InterfaceC4232) null);
        }
        C19894 c19894 = new C19894(this, c7150, c18959.m44023(), abstractC1566, false);
        c19894.m45790(new C12788(abstractC16481, 1));
        return c19894.m45789();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8706 m26142() {
        return this.f32425;
    }
}
