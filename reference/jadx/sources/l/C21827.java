package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩷ۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: W6DM */
/* JADX INFO: loaded from: classes.dex */
public final class C21827 extends AbstractC16700 {
    @Override // l.AbstractC16700, l.InterfaceC13673
    public final String getName() {
        return "PrepareForCodeGen";
    }

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo22644(C24927 c24927) {
        if (c24927.mo8527().m5681().m17702()) {
            m49490(c24927);
        }
        final C2551 c2551M55584 = c24927.m55584();
        if (c2551M55584 == null && !c24927.getMethods().isEmpty()) {
            c2551M55584 = (C2551) c24927.getMethods().get(0);
        }
        if (c2551M55584 == null) {
            return true;
        }
        m49483(c2551M55584, c24927);
        C4937.forEach(c24927.getFields(), new Consumer() { // from class: l.ۖ۬ۗ
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj) {
                this.f8548.m49483(c2551M55584, (C17467) obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C12312.$default$andThen(this, consumer);
            }
        });
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0212  */
    /* JADX WARN: Code duplicated, block: B:104:0x021c  */
    /* JADX WARN: Code duplicated, block: B:107:0x0229  */
    /* JADX WARN: Code duplicated, block: B:110:0x023b  */
    /* JADX WARN: Code duplicated, block: B:113:0x024f  */
    /* JADX WARN: Code duplicated, block: B:118:0x0262  */
    /* JADX WARN: Code duplicated, block: B:120:0x0278  */
    /* JADX WARN: Code duplicated, block: B:121:0x028f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x0291  */
    /* JADX WARN: Code duplicated, block: B:124:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:125:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:126:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:127:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:99:0x0205  */
    /* JADX WARN: Instruction removed from duplicated block: B:120:0x0278, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:125:0x02b8, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:127:0x02e4, please report this as an issue */
    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo1737(C2551 c2551) {
        C21943 c21943M52203;
        C21943 c21943M52163;
        String lowerCase;
        C21943 c21943M52164;
        final HashSet hashSet;
        boolean zM17534;
        if (c2551.m8524()) {
            return;
        }
        Iterator it = c2551.m8508().iterator();
        while (true) {
            C6787 c6787 = null;
            boolean z = true;
            if (!it.hasNext()) {
                if (c2551.m8529()) {
                    Iterator it2 = c2551.m8508().iterator();
                    while (it2.hasNext()) {
                        Iterator it3 = ((ArrayList) ((C21943) it2.next()).mo1986()).iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                C18959 c18959 = (C18959) it3.next();
                                if (c18959.getType() == EnumC24203.CONSTRUCTOR) {
                                    C6787 c6788 = (C6787) c18959;
                                    if (c6788.m18922() || c6788.m18923()) {
                                        c6787 = c6788;
                                    }
                                    if (c6787 != null && !c6787.mo17865(EnumC1763.DONT_GENERATE)) {
                                        c21943M52203 = C23231.m52203(c2551.m8535());
                                        if (!((ArrayList) c21943M52203.mo1986()).isEmpty()) {
                                            c21943M52163 = C23231.m52163(c2551, c6787, c2551.m8508());
                                            if (c21943M52163 != null) {
                                                throw new C8597("Insn not found in method: " + c6787);
                                            }
                                            if (((ArrayList) c21943M52163.mo1986()).get(0) != c6787) {
                                                z = false;
                                            } else {
                                                for (C21943 c21943 : C23231.m52150(c2551.m8535(), c21943M52163)) {
                                                    if (((ArrayList) c21943.mo1986()).isEmpty() && c21943 != c21943M52163) {
                                                        z = false;
                                                    }
                                                }
                                            }
                                        } else if (((ArrayList) c21943M52203.mo1986()).get(0) != c6787) {
                                            z = false;
                                        }
                                        C0271 c0271 = (C0271) c2551.m8515().mo17862((InterfaceC2157) C11457.f36026);
                                        if (z || c0271 != null) {
                                            lowerCase = c6787.m18924().toString().toLowerCase();
                                            c21943M52164 = C23231.m52163(c2551, c6787, c2551.m8508());
                                            if (c21943M52164 == null) {
                                                c2551.m31136("Failed to move " + lowerCase + " instruction to top");
                                            } else if (z) {
                                                C20993.m47982(c21943M52164, c6787);
                                                ((ArrayList) c2551.m8515().mo19035()).add(0, new C0314(c6787));
                                            } else {
                                                hashSet = new HashSet();
                                                c6787.mo14760(hashSet);
                                                hashSet.remove(c2551.m8517());
                                                C4937.forEach(c2551.m8526(), new Consumer() { // from class: l.۬۬ۗ
                                                    @Override // java.util.function.Consumer
                                                    /* JADX INFO: renamed from: accept */
                                                    public final void n(Object obj) {
                                                        hashSet.remove((C6041) obj);
                                                    }

                                                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                                                        return C12312.$default$andThen(this, consumer);
                                                    }
                                                });
                                                if (hashSet.isEmpty()) {
                                                    c2551.m31138("'" + lowerCase + "' call moved to the top of the method (can break code semantics)");
                                                    C20993.m47982(c21943M52164, c6787);
                                                    ((ArrayList) c2551.m8515().mo19035()).add(0, new C0314(c6787));
                                                } else {
                                                    c2551.m31138("Illegal instructions before constructor call");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (c6787 != null) {
                        c21943M52203 = C23231.m52203(c2551.m8535());
                        if (!((ArrayList) c21943M52203.mo1986()).isEmpty()) {
                            c21943M52163 = C23231.m52163(c2551, c6787, c2551.m8508());
                            if (c21943M52163 != null) {
                                throw new C8597("Insn not found in method: " + c6787);
                            }
                            if (((ArrayList) c21943M52163.mo1986()).get(0) != c6787) {
                                z = false;
                            } else {
                                while (r1.hasNext()) {
                                    if (((ArrayList) c21943.mo1986()).isEmpty()) {
                                    }
                                }
                            }
                        } else if (((ArrayList) c21943M52203.mo1986()).get(0) != c6787) {
                            z = false;
                        }
                        C0271 c0272 = (C0271) c2551.m8515().mo17862((InterfaceC2157) C11457.f36026);
                        if (z) {
                            lowerCase = c6787.m18924().toString().toLowerCase();
                            c21943M52164 = C23231.m52163(c2551, c6787, c2551.m8508());
                            if (c21943M52164 == null) {
                                c2551.m31136("Failed to move " + lowerCase + " instruction to top");
                            } else if (z) {
                                hashSet = new HashSet();
                                c6787.mo14760(hashSet);
                                hashSet.remove(c2551.m8517());
                                C4937.forEach(c2551.m8526(), new Consumer() { // from class: l.۬۬ۗ
                                    @Override // java.util.function.Consumer
                                    /* JADX INFO: renamed from: accept */
                                    public final void n(Object obj) {
                                        hashSet.remove((C6041) obj);
                                    }

                                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return C12312.$default$andThen(this, consumer);
                                    }
                                });
                                if (hashSet.isEmpty()) {
                                    c2551.m31138("Illegal instructions before constructor call");
                                } else {
                                    c2551.m31138("'" + lowerCase + "' call moved to the top of the method (can break code semantics)");
                                    C20993.m47982(c21943M52164, c6787);
                                    ((ArrayList) c2551.m8515().mo19035()).add(0, new C0314(c6787));
                                }
                            } else {
                                C20993.m47982(c21943M52164, c6787);
                                ((ArrayList) c2551.m8515().mo19035()).add(0, new C0314(c6787));
                            }
                        } else {
                            lowerCase = c6787.m18924().toString().toLowerCase();
                            c21943M52164 = C23231.m52163(c2551, c6787, c2551.m8508());
                            if (c21943M52164 == null) {
                                c2551.m31136("Failed to move " + lowerCase + " instruction to top");
                            } else if (z) {
                                hashSet = new HashSet();
                                c6787.mo14760(hashSet);
                                hashSet.remove(c2551.m8517());
                                C4937.forEach(c2551.m8526(), new Consumer() { // from class: l.۬۬ۗ
                                    @Override // java.util.function.Consumer
                                    /* JADX INFO: renamed from: accept */
                                    public final void n(Object obj) {
                                        hashSet.remove((C6041) obj);
                                    }

                                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return C12312.$default$andThen(this, consumer);
                                    }
                                });
                                if (hashSet.isEmpty()) {
                                    c2551.m31138("Illegal instructions before constructor call");
                                } else {
                                    c2551.m31138("'" + lowerCase + "' call moved to the top of the method (can break code semantics)");
                                    C20993.m47982(c21943M52164, c6787);
                                    ((ArrayList) c2551.m8515().mo19035()).add(0, new C0314(c6787));
                                }
                            } else {
                                C20993.m47982(c21943M52164, c6787);
                                ((ArrayList) c2551.m8515().mo19035()).add(0, new C0314(c6787));
                            }
                        }
                    }
                }
                m49483(c2551, c2551);
                return;
            }
            C21943 c21944 = (C21943) it.next();
            if (!c21944.mo17865(EnumC1763.DONT_GENERATE)) {
                Iterator it4 = ((ArrayList) c21944.mo1986()).iterator();
                while (it4.hasNext()) {
                    C18959 c189510 = (C18959) it4.next();
                    switch (C4673.f16494[c189510.getType().ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            it4.remove();
                            break;
                        case 5:
                            if (((C6787) c189510).m18921()) {
                                it4.remove();
                            }
                            break;
                        case 6:
                            C6041 c6041M44027 = c189510.m44027();
                            if (c6041M44027.m17530().m41952() == 0) {
                                InterfaceC6238 interfaceC6238Mo44035 = c189510.mo44035(0);
                                String name = c6041M44027.getName();
                                if ((name == null || !(interfaceC6238Mo44035 instanceof InterfaceC3057)) ? false : name.equals(((InterfaceC3057) interfaceC6238Mo44035).getName())) {
                                    it4.remove();
                                }
                            }
                            break;
                    }
                }
                List listMo1986 = c21944.mo1986();
                int i = 0;
                while (true) {
                    ArrayList arrayList = (ArrayList) listMo1986;
                    if (i < arrayList.size()) {
                        C18959 c189511 = (C18959) arrayList.get(i);
                        if (c189511.getType() == EnumC24203.MOVE) {
                            AbstractC16481 abstractC16481Mo44035 = c189511.mo44035(0);
                            abstractC16481Mo44035.getClass();
                            if (abstractC16481Mo44035 instanceof C17227) {
                                C18959 c18959M40461 = ((C17227) c189511.mo44035(0)).m40461();
                                c18959M40461.m44031(c189511.m44027());
                                c18959M40461.m39414((AbstractC16678) c189511);
                                c18959M40461.m16975((AbstractC5820) c189511);
                                arrayList.set(i, c18959M40461);
                            }
                        }
                        i++;
                    } else {
                        Iterator it5 = ((ArrayList) c21944.mo1986()).iterator();
                        while (it5.hasNext()) {
                            m49486((C18959) it5.next());
                        }
                        for (C18959 c189512 : (ArrayList) c21944.mo1986()) {
                            if (c189512.getType() == EnumC24203.ARITH) {
                                EnumC1763 enumC1763 = EnumC1763.ARITH_ONEARG;
                                if (!c189512.mo17865(enumC1763) && !c189512.mo17865(EnumC1763.DECLARE_VAR)) {
                                    C6041 c6041M44028 = c189512.m44027();
                                    AbstractC16481 abstractC16481Mo44036 = c189512.mo44035(0);
                                    if (c6041M44028.equals(abstractC16481Mo44036)) {
                                        zM17534 = true;
                                    } else {
                                        abstractC16481Mo44036.getClass();
                                        zM17534 = abstractC16481Mo44036 instanceof C6041 ? c6041M44028.m17534((C6041) abstractC16481Mo44036) : false;
                                    }
                                    if (zM17534) {
                                        c189512.m44031((C6041) null);
                                        c189512.mo17866(enumC1763);
                                    }
                                }
                            }
                        }
                        Iterator it6 = ((ArrayList) c21944.mo1986()).iterator();
                        while (it6.hasNext()) {
                            ((C18959) it6.next()).mo14761(new C10140());
                        }
                        for (C18959 c189513 : (ArrayList) c21944.mo1986()) {
                            int i2 = C4673.f16494[c189513.getType().ordinal()];
                            if (i2 == 13) {
                                m49485(c2551, ((C21219) c189513).mo13131());
                            } else if (i2 == 14) {
                                m49485(c2551, c189513.mo44035(0));
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49486(C18959 c18959) {
        if (c18959.getType() != EnumC24203.ARITH) {
            if (c18959.getType() == EnumC24203.TERNARY) {
                C9812 c9812M14764 = ((C4789) c18959).m14764();
                EnumC18763 enumC18763M25590 = c9812M14764.m25590();
                for (C9812 c9812 : c9812M14764.m25586()) {
                    if (c9812.m25590() == enumC18763M25590) {
                        c9812.mo17866(EnumC1763.DONT_WRAP);
                    }
                }
            }
            for (AbstractC16481 abstractC16481 : c18959.m44026()) {
                abstractC16481.getClass();
                if (abstractC16481 instanceof C17227) {
                    m49486(((C17227) abstractC16481).m40461());
                }
            }
            return;
        }
        C22711 c22711 = (C22711) c18959;
        EnumC19727 enumC19727M51191 = c22711.m51191();
        if (enumC19727M51191 == EnumC19727.ADD || enumC19727M51191 == EnumC19727.MUL || enumC19727M51191 == EnumC19727.AND || enumC19727M51191 == EnumC19727.OR) {
            for (int i = 0; i < 2; i++) {
                AbstractC16481 abstractC16481Mo44035 = c22711.mo44035(i);
                abstractC16481Mo44035.getClass();
                if (abstractC16481Mo44035 instanceof C17227) {
                    C18959 c18959M40461 = ((C17227) abstractC16481Mo44035).m40461();
                    if (c18959M40461.getType() == EnumC24203.ARITH && ((C22711) c18959M40461).m51191() == enumC19727M51191) {
                        c18959M40461.mo17866(EnumC1763.DONT_WRAP);
                    }
                    m49486(c18959M40461);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m49490(C24927 c24927) {
        Iterator it = c24927.m55534().iterator();
        while (it.hasNext()) {
            m49490((C24927) it.next());
        }
        final int i = 0;
        int iOrElse = C23654.of((Object[]) new List[]{c24927.getMethods(), c24927.m55534(), c24927.getFields()}).flatMap(new C3984(1)).filter(new C1192()).filter(new Predicate() { // from class: l.ۡ۬ۗ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19025.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo7134negate() {
                switch (i) {
                    case 0:
                        break;
                }
                return C19025.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19025.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                switch (i) {
                    case 0:
                        return ((AbstractC12531) obj).m16977() != 0;
                    default:
                        return C20174.m46409(((InterfaceC2386) obj).getPath());
                }
            }
        }).mapToInt(new C1544(0)).min().orElse(0);
        if (iOrElse != 0) {
            c24927.m16978(iOrElse - 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m49483(C2551 c2551, AbstractC12531 abstractC12531) {
        C3648 c3648 = (C3648) abstractC12531.mo17862(C25278.f81639);
        if (c3648 == null) {
            return;
        }
        for (InterfaceC13343 interfaceC13343 : c3648.m11820()) {
            if (interfaceC13343.getVisibility() != EnumC11105.SYSTEM) {
                Iterator it = interfaceC13343.mo17112().entrySet().iterator();
                while (it.hasNext()) {
                    m49484(c2551, (C15580) ((Map.Entry) it.next()).getValue());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m49484(final C2551 c2551, C15580 c15580) {
        C14022 c14022M34143;
        int i = C4673.f16493[c15580.m37317().ordinal()];
        if (i != 1) {
            if (i == 2) {
                C11392.forEach(((InterfaceC13343) c15580.m37318()).mo17112(), new BiConsumer() { // from class: l.۠۬ۗ
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        this.f28241.m49484(c2551, (C15580) obj2);
                    }

                    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                        return C23501.$default$andThen(this, biConsumer);
                    }
                });
                return;
            } else {
                if (i != 3) {
                    return;
                }
                C4937.forEach((List) c15580.m37318(), new C7158(this, c2551, 0));
                return;
            }
        }
        Object objM37318 = c15580.m37318();
        if (objM37318 instanceof InterfaceC1213) {
            c14022M34143 = C14022.m34143(c2551.mo8527(), (InterfaceC1213) objM37318);
        } else {
            c14022M34143 = (C14022) objM37318;
        }
        C17467 c17467M5670 = c2551.mo8527().m5670(c14022M34143);
        if (c17467M5670 != null) {
            c17467M5670.m40964(c2551);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49485(C2551 c2551, AbstractC16481 abstractC16481) {
        if (abstractC16481 == null || !abstractC16481.m39120()) {
            return;
        }
        AbstractC1566 type = abstractC16481.getType();
        C3319 c3319 = new C3319(EnumC24203.CAST, type, 1);
        c3319.mo44014((AbstractC16481) C23195.m52120(0L, type));
        abstractC16481.m39113(c2551, (C18959) c3319, true);
    }
}
