package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: l.ܿ۬ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6E3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18345 extends AbstractC16700 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f59814 = C16980.m40037(C18345.class);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final long f59813 = Double.doubleToLongBits(1.0d);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final long f59815 = Float.floatToIntBits(1.0f);

    /* JADX WARN: Code duplicated, block: B:184:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:277:0x0545 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x011f  */
    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo1737(C2551 c2551) {
        boolean z;
        int i;
        InterfaceC4043 interfaceC4043M55537;
        InterfaceC4043 interfaceC4043M55538;
        int i2;
        boolean z2;
        C18959 c18959M39118;
        C17973 c17973M17530;
        if (c2551.m8524()) {
            return;
        }
        C9804 c9804 = new C9804(null, c2551);
        C24927 c24927M8536 = c2551.m8536();
        for (C21943 c21943 : c2551.m8508()) {
            c9804.m25548(c21943);
            ArrayList arrayList = (ArrayList) c21943.mo1986();
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                C18959 c18959 = (C18959) arrayList.get(i3);
                switch (C21329.f67955[c18959.getType().ordinal()]) {
                    case 1:
                        C6787 c6787 = (C6787) c18959;
                        InterfaceC21197 interfaceC21197M19301 = c2551.mo8527().m5683().m19301(c6787);
                        if (interfaceC21197M19301 instanceof C2551) {
                            C2551 c2552 = (C2551) interfaceC21197M19301;
                            if (c2552.mo17865(EnumC1763.ANONYMOUS_CONSTRUCTOR) && !c2552.mo17865(EnumC1763.NO_SKIP_ARGS)) {
                                C21482 c21482 = (C21482) c2552.mo17862((InterfaceC2157) C11457.f36005);
                                if (c21482 != null) {
                                    int iMin = Math.min(c2552.mo8532().m49705(), c6787.m44039());
                                    for (int i4 = 0; i4 < iMin; i4++) {
                                        if (c21482.m48890(i4)) {
                                            AbstractC16481 abstractC16481Mo44035 = c6787.mo44035(i4);
                                            abstractC16481Mo44035.mo17866(EnumC1763.DONT_INLINE);
                                            if (abstractC16481Mo44035 instanceof C6041) {
                                                ((C6041) abstractC16481Mo44035).m17530().m41945().m28514();
                                            }
                                        }
                                    }
                                } else {
                                    C4937.forEach(c6787.m44026(), new C6413());
                                }
                            }
                        }
                        break;
                    case 2:
                    case 3:
                    case 4:
                        if (c18959.getType() != EnumC24203.CONST_STR) {
                            if (c18959.getType() == EnumC24203.CONST_CLASS) {
                                interfaceC4043M55537 = c24927M8536.m55536((Object) ((C13014) c18959).m32420(), true);
                            } else {
                                i = 0;
                                interfaceC4043M55537 = c24927M8536.m55537((C23195) c18959.mo44035(0));
                            }
                            if (interfaceC4043M55537 != null) {
                                C3319 c3319 = new C3319(EnumC24203.SGET, interfaceC4043M55537.mo13008(), i);
                                c3319.m44031(c18959.m44027());
                                C23231.m52172(c2551, c21943, i3, c3319);
                                m42796(interfaceC4043M55537, c2551);
                            }
                        } else {
                            interfaceC4043M55537 = c24927M8536.m55536((Object) ((C5557) c18959).getString(), true);
                        }
                        i = 0;
                        if (interfaceC4043M55537 != null) {
                            C3319 c33110 = new C3319(EnumC24203.SGET, interfaceC4043M55537.mo13008(), i);
                            c33110.m44031(c18959.m44027());
                            C23231.m52172(c2551, c21943, i3, c33110);
                            m42796(interfaceC4043M55537, c2551);
                        }
                        break;
                    case 5:
                        C1082 c1082 = (C1082) c18959;
                        int[] iArrM4073 = c1082.m4073();
                        int length = iArrM4073.length;
                        for (int i5 = 0; i5 < length; i5++) {
                            InterfaceC4043 interfaceC4043M55536 = c24927M8536.m55536((Object) Integer.valueOf(iArrM4073[i5]), true);
                            if (interfaceC4043M55536 != null) {
                                c1082.m4066(i5, interfaceC4043M55536);
                                m42796(interfaceC4043M55536, c2551);
                            }
                        }
                        break;
                    case 6:
                        C7794 c7794 = (C7794) c18959;
                        C18959 c18959M42795 = m42795(c18959.m44027());
                        if (c18959M42795 != null && c18959M42795.getType() == EnumC24203.FILL_ARRAY) {
                            C11522 c11522 = (C11522) c18959M42795;
                            int iM29014 = c11522.m29014();
                            Object objM22394 = C8314.m22394(c2551.mo8527(), c7794.mo44035(0));
                            if ((objM22394 instanceof C23195) && iM29014 == ((int) ((C23195) objM22394).m52122())) {
                                AbstractC1566 abstractC1566M21250 = c7794.m21250();
                                AbstractC1566 abstractC1566Mo5557 = abstractC1566M21250.mo5557();
                                AbstractC1566 abstractC1566M29011 = c11522.m29011();
                                if (!abstractC1566M29011.mo5564() && abstractC1566Mo5557.m5556() && abstractC1566M29011.mo5566(abstractC1566Mo5557.mo5558())) {
                                    abstractC1566M29011 = abstractC1566Mo5557;
                                }
                                if (!abstractC1566M29011.equals(abstractC1566Mo5557) && !abstractC1566M21250.equals(AbstractC1566.f5426)) {
                                    c2551.m31136("Incorrect type for fill-array insn " + C8314.m22396(c11522.getOffset()) + ", element type: " + abstractC1566M29011 + ", insn element type: " + abstractC1566Mo5557);
                                }
                                if (!abstractC1566M29011.mo5564()) {
                                    f59814.mo13710("Unknown array element type: {} in mth: {}", abstractC1566M29011, c2551);
                                    if (!abstractC1566Mo5557.mo5564()) {
                                        abstractC1566Mo5557 = abstractC1566M29011.mo5551();
                                    }
                                    if (abstractC1566Mo5557 == null) {
                                        throw new C8597("Null array element type");
                                    }
                                    abstractC1566M29011 = abstractC1566Mo5557;
                                }
                                ArrayList<C23195> arrayListM29009 = c11522.m29009(abstractC1566M29011);
                                C24949 c24949 = new C24949(arrayListM29009.size(), abstractC1566M29011);
                                c24949.m44031(c7794.m44027().mo17528());
                                for (C23195 c23195 : arrayListM29009) {
                                    InterfaceC4043 interfaceC4043M55539 = c2551.m8536().m55537(c23195);
                                    if (interfaceC4043M55539 != null) {
                                        c24949.mo44014((AbstractC16481) AbstractC16481.m39112(new C3319(EnumC24203.SGET, interfaceC4043M55539.mo13008(), 0)));
                                        m42796(interfaceC4043M55539, c2551);
                                    } else {
                                        c24949.mo44014(c23195.mo17528());
                                    }
                                }
                                C23231.m52172(c2551, c21943, i3, c24949);
                                c9804.m25544(c18959M42795);
                            }
                        }
                        break;
                    case 7:
                        C10733 c10733 = (C10733) c21943.mo17862((InterfaceC2157) C11457.f36036);
                        if (c10733 != null) {
                            C19684 c19684M27337 = c10733.m27337();
                            C6041 c6041M44027 = c18959.m44027();
                            AbstractC1566 abstractC1566M45373 = c19684M27337.m45373();
                            String str = c19684M27337.m45366() ? "th" : "e";
                            if (c6041M44027.getName() == null) {
                                c6041M44027.setName(str);
                            }
                            C17973 c17973M17531 = c18959.m44027().m17530();
                            if (c17973M17531.m41952() == 0) {
                                c19684M27337.m45362(new C20211(abstractC1566M45373, str));
                                c9804.m25544(c18959);
                            } else if (c17973M17531.m41947() && !C8314.m22407(c2551)) {
                                C18959 c189510 = new C18959(EnumC24203.MOVE, 1);
                                c189510.m44031(c18959.m44027());
                                C20211 c20211 = new C20211(abstractC1566M45373, str);
                                c189510.mo44014((AbstractC16481) c20211);
                                c19684M27337.m45362(c20211);
                                C23231.m52172(c2551, c21943, 0, c189510);
                            }
                            c21943.m39412(c18959, C11457.f36032);
                        }
                        break;
                    case 8:
                        C22711 c22711 = (C22711) c18959;
                        if (c22711.m44039() != 2) {
                            throw new C8597("Invalid args count in insn: " + c22711);
                        }
                        AbstractC16481 abstractC16481Mo44036 = c22711.mo44035(1);
                        abstractC16481Mo44036.getClass();
                        if ((abstractC16481Mo44036 instanceof C23195) && (interfaceC4043M55538 = c24927M8536.m55537((C23195) abstractC16481Mo44036)) != null && c22711.mo14762(abstractC16481Mo44036, AbstractC16481.m39112(new C3319(EnumC24203.SGET, interfaceC4043M55538.mo13008(), 0)))) {
                            m42796(interfaceC4043M55538, c2551);
                        }
                        break;
                        break;
                    case 9:
                    case 10:
                        ArrayList arrayListM41946 = c18959.m44027().m17530().m41946();
                        if (C6823.m19005((List) arrayListM41946, (Predicate) new C5273(1))) {
                            Iterator it = new ArrayList(arrayListM41946).iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    c9804.m25544(c18959);
                                }
                                AbstractC16481 abstractC16481 = (C6041) it.next();
                                C18959 c18959M39119 = abstractC16481.m39118();
                                if (c18959M39119 != null && !c18959M39119.mo14762(abstractC16481, AbstractC16481.m39110(c18959.mo4072()))) {
                                    c2551.m31138("Failed to inline CMP insn: " + c18959 + " into " + c18959M39119);
                                }
                                break;
                            }
                        }
                        break;
                    case 11:
                        C3319 c33111 = (C3319) c18959;
                        AbstractC16481 abstractC16481Mo44037 = c33111.mo44035(0);
                        if (abstractC16481Mo44037.mo39117()) {
                            c33111.mo17866(EnumC1763.EXPLICIT_CAST);
                        } else {
                            AbstractC1566 abstractC1566 = (AbstractC1566) c33111.m10937();
                            C1610 c1610Mo8527 = c2551.mo8527();
                            AbstractC1566 type = abstractC16481Mo44037.getType();
                            AbstractC1566 abstractC1567 = AbstractC1566.f5429;
                            if (type.equals(abstractC1566)) {
                                z2 = false;
                                i2 = 1;
                            } else {
                                boolean zM19812 = c1610Mo8527.m5687().m23403(type, abstractC1566).m19812();
                                i2 = 1;
                                z2 = !zM19812;
                            }
                            if (z2) {
                                AbstractC16481 abstractC16481Mo44038 = c33111.mo44035(0);
                                abstractC16481Mo44038.getClass();
                                if (!(abstractC16481Mo44038 instanceof C6041) || (c17973M17530 = ((C6041) abstractC16481Mo44038).m17530()) == null || c17973M17530.m41952() != 1 || c17973M17530.m41947() || (c18959M39118 = c17973M17530.m41930().m39118()) == null || c18959M39118.getType() != EnumC24203.CHECK_CAST || !((AbstractC1566) ((C3319) c18959M39118).m10937()).equals(c33111.m10937())) {
                                    c18959M39118 = null;
                                }
                                if (c18959M39118 != null) {
                                    C18959 c189511 = new C18959(EnumC24203.MOVE, 1);
                                    c189511.m44031(c18959M39118.m44027());
                                    c189511.mo44014(c18959M39118.mo44035(0));
                                    C23231.m52179(c2551, c21943, c18959M39118, c189511);
                                }
                            } else {
                                C6041 c6041M44028 = c33111.m44027();
                                c6041M44028.mo1130(abstractC16481Mo44037.getType());
                                C18959 c189512 = new C18959(EnumC24203.MOVE, i2);
                                c189512.m44031(c6041M44028);
                                c189512.mo44014(abstractC16481Mo44037);
                                C23231.m52172(c2551, c21943, i3, c189512);
                            }
                        }
                        break;
                    case 12:
                        AbstractC16481 abstractC16481Mo44039 = c18959.mo44035(0);
                        if (abstractC16481Mo44039.getType() == AbstractC1566.f5436) {
                            AbstractC1566 type2 = c18959.m44027().getType();
                            if (type2.m5556()) {
                                C23231.m52172(c2551, c21943, i3, m42792(c18959.m44027(), abstractC16481Mo44039, type2));
                            }
                        }
                        break;
                    case 13:
                    case 14:
                        C3319 c33112 = (C3319) c18959;
                        AbstractC16481 abstractC16481Mo440310 = c33112.mo44035(c33112.getType() == EnumC24203.IGET ? 0 : 1);
                        if (!abstractC16481Mo440310.mo17865(EnumC1763.SUPER) && (!(abstractC16481Mo440310 instanceof C17227) || ((C17227) abstractC16481Mo440310).m40461().getType() != EnumC24203.CAST)) {
                            C14022 c14022 = (C14022) c33112.m10937();
                            AbstractC1566 type3 = c14022.m34148().getType();
                            AbstractC1566 type4 = abstractC16481Mo440310.getType();
                            if (!C17359.equals(type3, type4)) {
                                C17467 c17467M5670 = c2551.mo8527().m5670(c14022);
                                if (c17467M5670 == null) {
                                    EnumC7215 enumC7215M23403 = c2551.mo8527().m5687().m23403(type4, type3);
                                    if (!enumC7215M23403.m19813() && (enumC7215M23403 != EnumC7215.NARROW_BY_GENERIC || type4.m5569())) {
                                        C3319 c33113 = new C3319(EnumC24203.CAST, type3, 1);
                                        c33113.mo44014(abstractC16481Mo440310.mo17528());
                                        c33113.mo17866(EnumC1763.SYNTHETIC);
                                        c33113.mo17866(EnumC1763.EXPLICIT_CAST);
                                        AbstractC16481 abstractC16481M39110 = AbstractC16481.m39110(c33113);
                                        abstractC16481M39110.mo1130(type3);
                                        c33112.mo14762(abstractC16481Mo440310, abstractC16481M39110);
                                        C9804.m25533(c2551, abstractC16481Mo440310);
                                    }
                                } else {
                                    C10293 c10293Mo8547 = c17467M5670.mo8547();
                                    if (!c10293Mo8547.m26542()) {
                                        C24927 c24927M8537 = c2551.m8536();
                                        C24927 c24927M40972 = c17467M5670.m40972();
                                        if ((!C17359.equals(c24927M8537, c24927M40972) || c2551.mo8547().m26540()) && (c10293Mo8547.m26549() || (!C17359.equals(c24927M8537.m55571().m4963(), c24927M40972.m55571().m4963()) && (c10293Mo8547.m26536() || c2551.mo8527().m5687().m23404(c24927M8537, c24927M40972) != EnumC7215.NARROW)))) {
                                            C3319 c33114 = new C3319(EnumC24203.CAST, type3, 1);
                                            c33114.mo44014(abstractC16481Mo440310.mo17528());
                                            c33114.mo17866(EnumC1763.SYNTHETIC);
                                            c33114.mo17866(EnumC1763.EXPLICIT_CAST);
                                            AbstractC16481 abstractC16481M39111 = AbstractC16481.m39110(c33114);
                                            abstractC16481M39111.mo1130(type3);
                                            c33112.mo14762(abstractC16481Mo440310, abstractC16481M39111);
                                            C9804.m25533(c2551, abstractC16481Mo440310);
                                        }
                                    }
                                }
                            }
                        }
                        break;
                }
            }
            c9804.m25543();
        }
        boolean zM22407 = C8314.m22407(c2551);
        for (C21943 c21944 : c2551.m8508()) {
            c9804.m25548(c21944);
            for (C18959 c189513 : (ArrayList) c21944.mo1986()) {
                switch (C21329.f67955[c189513.getType().ordinal()]) {
                    case 15:
                        if (zM22407) {
                            C6041 c6041M44029 = c189513.m44027();
                            if (!(c6041M44029 != null && c6041M44029.m17530().m41952() == 0)) {
                                break;
                            }
                        }
                        c9804.m25544(c189513);
                        break;
                    case 16:
                    case 17:
                        c9804.m25544(c189513);
                        break;
                    default:
                        if (c189513.mo17865(EnumC1763.REMOVE)) {
                            c9804.m25544(c189513);
                        }
                        break;
                }
            }
            c9804.m25543();
        }
        do {
            z = false;
            for (C21943 c21945 : c2551.m8508()) {
                for (C18959 c189514 : (ArrayList) c21945.mo1986()) {
                    if (c189514.getType() == EnumC24203.MOVE && c189514.m39417()) {
                        C6041 c6041M440210 = c189514.m44027();
                        if (c6041M440210 != null && c6041M440210.m17530().m41952() == 0) {
                            C9804.m25537(c2551, c21945, c189514);
                            z = true;
                            break;
                        }
                    }
                }
            }
        } while (z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4789 m42792(C6041 c6041, AbstractC16481 abstractC16481, AbstractC1566 abstractC1566) {
        long j;
        C23195 c23195M52118 = C23195.m52118(0L, abstractC1566);
        if (abstractC1566 == AbstractC1566.f5424) {
            j = f59813;
        } else {
            j = abstractC1566 == AbstractC1566.f5440 ? f59815 : 1L;
        }
        return new C4789(C9812.m25576(new C17489(EnumC15997.EQ, abstractC16481, C23195.m52121())), c6041, C23195.m52118(j, abstractC1566), c23195M52118);
    }

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo22644(final C24927 c24927) {
        if (!c24927.mo8527().m5681().m17721()) {
            return true;
        }
        m42800(c24927, (C3648) c24927.mo17862(C25278.f81639));
        C4937.forEach(c24927.getFields(), new C22492(1, this, c24927));
        C4937.forEach(c24927.getMethods(), new Consumer() { // from class: l.᩺۬ۗ
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj) {
                C18345.m42797(this.f78706, c24927, (C2551) obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C12312.$default$andThen(this, consumer);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42797(C18345 c18345, C24927 c24927, C2551 c2551) {
        c18345.m42800(c24927, (C3648) c2551.mo17862(C25278.f81639));
        C23786 c23786 = (C23786) c2551.mo17862(C25278.f81645);
        if (c23786 == null) {
            return;
        }
        C4937.forEach((ArrayList) c23786.m53057(), new C14615(c18345, c24927, 0));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42799(C18345 c18345, C24927 c24927, C17467 c17467) {
        c18345.m42800(c24927, (C3648) c17467.mo17862(C25278.f81639));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m42800(C24927 c24927, C3648 c3648) {
        if (c3648 == null) {
            return;
        }
        for (InterfaceC13343 interfaceC13343 : c3648.m11820()) {
            if (interfaceC13343.getVisibility() != EnumC11105.SYSTEM) {
                for (Map.Entry entry : interfaceC13343.mo17112().entrySet()) {
                    entry.setValue(m42794(c24927, (C15580) entry.getValue()));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C15580 m42794(final C24927 c24927, C15580 c15580) {
        if (c15580.m37317() == EnumC23040.ENCODED_ANNOTATION) {
            for (Map.Entry entry : ((InterfaceC13343) c15580.m37318()).mo17112().entrySet()) {
                entry.setValue(m42794(c24927, (C15580) entry.getValue()));
            }
            return c15580;
        }
        EnumC23040 enumC23040M37317 = c15580.m37317();
        EnumC23040 enumC23040 = EnumC23040.ENCODED_ARRAY;
        if (enumC23040M37317 == enumC23040) {
            List list = (List) c15580.m37318();
            if (!list.isEmpty()) {
                C12884.replaceAll(list, new UnaryOperator() { // from class: l.ۘ۬ۗ
                    @Override // java.util.function.Function
                    /* JADX INFO: renamed from: andThen */
                    public /* synthetic */ Function mo10608andThen(Function function) {
                        return C24247.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return this.f14166.m42794(c24927, (C15580) obj);
                    }

                    @Override // java.util.function.Function
                    public /* synthetic */ Function compose(Function function) {
                        return C24247.$default$compose(this, function);
                    }
                });
            }
            return new C15580(enumC23040, list);
        }
        InterfaceC4043 interfaceC4043M55536 = c24927.m55536(c15580.m37318(), true);
        return interfaceC4043M55536 != null ? new C15580(EnumC23040.ENCODED_FIELD, interfaceC4043M55536.mo13008()) : c15580;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18959 m42795(C6041 c6041) {
        C18959 c18959M39118;
        C17973 c17973M17530 = c6041.m17530();
        int iM41952 = c17973M17530.m41952();
        if (iM41952 == 0 || (c18959M39118 = ((C6041) c17973M17530.m41946().get(0)).m39118()) == null) {
            return null;
        }
        return (iM41952 == 1 && c18959M39118.getType() == EnumC24203.MOVE) ? m42795(c18959M39118.m44027()) : c18959M39118;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42796(InterfaceC4043 interfaceC4043, C2551 c2551) {
        if (interfaceC4043 instanceof C17467) {
            ((C17467) interfaceC4043).m40964(c2551);
        }
    }
}
