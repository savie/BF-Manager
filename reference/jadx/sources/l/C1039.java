package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֨۠ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6BK */
/* JADX INFO: loaded from: classes3.dex */
public final class C1039 extends AbstractC16700 {
    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo1737(C2551 c2551) {
        if (c2551.m8524()) {
            return;
        }
        m3944(c2551);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:102:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:104:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:105:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:109:0x0203  */
    /* JADX WARN: Code duplicated, block: B:110:0x0208  */
    /* JADX WARN: Code duplicated, block: B:112:0x020e  */
    /* JADX WARN: Code duplicated, block: B:114:0x021b  */
    /* JADX WARN: Code duplicated, block: B:116:0x0221  */
    /* JADX WARN: Code duplicated, block: B:119:0x024c  */
    /* JADX WARN: Code duplicated, block: B:121:0x0265  */
    /* JADX WARN: Code duplicated, block: B:123:0x0270  */
    /* JADX WARN: Code duplicated, block: B:124:0x0276  */
    /* JADX WARN: Code duplicated, block: B:128:0x028d  */
    /* JADX WARN: Code duplicated, block: B:135:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:136:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:138:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:139:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:144:0x0244 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x02cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x02cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x0293 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:48:0x0100  */
    /* JADX WARN: Code duplicated, block: B:50:0x010e  */
    /* JADX WARN: Code duplicated, block: B:76:0x016e  */
    /* JADX WARN: Code duplicated, block: B:87:0x018c  */
    /* JADX WARN: Code duplicated, block: B:89:0x019f  */
    /* JADX WARN: Code duplicated, block: B:98:0x01c0  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m3944(C2551 c2551) {
        Iterator it;
        Iterator it2;
        AbstractC16481 abstractC16481M39112;
        RunnableC11146 runnableC11146;
        AbstractC16481 abstractC16481M39113;
        C17973 c17973M17530;
        ArrayList arrayList;
        Iterator it3;
        int i;
        C6041 c6041;
        Iterator it4;
        Iterator it5;
        Iterator it6;
        C18959 c18959M39118;
        C18959 c18959M39119;
        long jM52122;
        AbstractC1566 type;
        C23195 c23195M52120;
        AbstractC1566 type2;
        int i2;
        InterfaceC4043 interfaceC4043M55536;
        AbstractC15251 abstractC15251;
        C21965 c21965Mo18926;
        AbstractC1566 abstractC1566;
        ArrayList arrayList2 = new ArrayList();
        Iterator it7 = c2551.m8508().iterator();
        while (it7.hasNext()) {
            C21943 c21943 = (C21943) it7.next();
            arrayList2.clear();
            Iterator it8 = ((ArrayList) c21943.mo1986()).iterator();
            while (it8.hasNext()) {
                C18959 c18959 = (C18959) it8.next();
                if (c18959.mo17865(EnumC1763.DONT_INLINE) || c18959.mo17865(EnumC1763.DONT_GENERATE) || c18959.m44027() == null) {
                    it = it7;
                    it2 = it8;
                } else {
                    C17973 c17973M17531 = c18959.m44027().m17530();
                    int i3 = C9987.f32090[c18959.getType().ordinal()];
                    if (i3 == 1 || i3 == 2) {
                        AbstractC16481 abstractC16481Mo44035 = c18959.mo44035(0);
                        abstractC16481Mo44035.getClass();
                        if ((abstractC16481Mo44035 instanceof C23195) && !(abstractC16481Mo44035.mo39117() && m3943(c17973M17531))) {
                            abstractC16481M39112 = abstractC16481Mo44035;
                            runnableC11146 = null;
                            abstractC16481M39113 = abstractC16481M39112;
                            c17973M17530 = c18959.m44027().m17530();
                            if (c17973M17530.m41952() == 0) {
                                it = it7;
                                it2 = it8;
                            } else {
                                arrayList = new ArrayList(c17973M17530.m41946());
                                it3 = arrayList.iterator();
                                i = 0;
                                while (it3.hasNext()) {
                                    c6041 = (C6041) it3.next();
                                    if (!c6041.mo17865(EnumC1763.DONT_INLINE_CONST) || c6041.mo17865(EnumC1763.DONT_INLINE) || (c18959M39118 = c6041.m39118()) == null || c18959M39118.mo17865(EnumC1763.DONT_GENERATE) || (c6041.m17536() && !c6041.m17530().m41947())) {
                                        it4 = it7;
                                        it5 = it8;
                                        it6 = it3;
                                    } else if (c18959M39118.getType() == EnumC24203.CONSTRUCTOR) {
                                        InterfaceC21197 interfaceC21197M19301 = c2551.mo8527().m5683().m19301((C6787) c18959M39118);
                                        C2551 c2552 = interfaceC21197M19301 instanceof C2551 ? (C2551) interfaceC21197M19301 : null;
                                        if (c2552 == null || !(c2552.mo17865(EnumC1763.METHOD_CANDIDATE_FOR_INLINE) || c2552.mo17865(EnumC1763.ANONYMOUS_CONSTRUCTOR))) {
                                            c18959M39119 = c6041.m39118();
                                            if (c18959M39119 == null && c18959M39119.getType() != EnumC24203.PHI && C8314.m22409(c2551, c18959, c18959M39119)) {
                                                if (abstractC16481M39113 instanceof C23195) {
                                                    jM52122 = ((C23195) abstractC16481M39113).m52122();
                                                    it4 = it7;
                                                    type = c6041.getType();
                                                    it5 = it8;
                                                    if (type == AbstractC1566.f5420) {
                                                        type = c6041.m17531();
                                                    }
                                                    if (type.mo5543() && jM52122 != 0) {
                                                        type = AbstractC1566.f5415;
                                                    }
                                                    c23195M52120 = C23195.m52120(jM52122, type);
                                                    c23195M52120.m39414(abstractC16481M39113);
                                                    if (c18959M39119.mo14762(c6041, c23195M52120)) {
                                                        type2 = c23195M52120.getType();
                                                        if (type2.mo5564()) {
                                                            interfaceC4043M55536 = c2551.m8536().m55537(c23195M52120);
                                                        } else {
                                                            if (type2.mo5566(EnumC12006.INT)) {
                                                                interfaceC4043M55536 = c2551.m8536().m55536((Object) Integer.valueOf((int) jM52122), false);
                                                            } else {
                                                                i2 = 0;
                                                                interfaceC4043M55536 = null;
                                                            }
                                                            if (interfaceC4043M55536 != null) {
                                                                it6 = it3;
                                                                if (c23195M52120.m39113(c2551, (C18959) new C3319(EnumC24203.SGET, interfaceC4043M55536.mo13008(), i2), true) != null) {
                                                                    C18345.m42796(interfaceC4043M55536, c2551);
                                                                }
                                                            } else {
                                                                it6 = it3;
                                                                if (c18959M39119 instanceof AbstractC15251) {
                                                                    abstractC15251 = (AbstractC15251) c18959M39119;
                                                                    c21965Mo18926 = abstractC15251.mo18926();
                                                                    if (abstractC15251.mo13131() == c23195M52120) {
                                                                        abstractC1566 = (AbstractC1566) c21965Mo18926.m49702().get(c18959M39119.m44020(c23195M52120) - abstractC15251.mo13126());
                                                                        if (abstractC1566.m5556()) {
                                                                            c23195M52120.mo1130(abstractC1566);
                                                                            if (abstractC1566.equals(AbstractC1566.f5421)) {
                                                                                c23195M52120.mo17866(EnumC1763.EXPLICIT_PRIMITIVE_TYPE);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        if (c23195M52120.mo39117()) {
                                                                            throw new C8597("Unexpected instance arg in invoke");
                                                                        }
                                                                        AbstractC1566 type3 = c21965Mo18926.m49700().getType();
                                                                        C3319 c3319 = new C3319(EnumC24203.CAST, type3, 1);
                                                                        c3319.mo44014((AbstractC16481) c23195M52120);
                                                                        c3319.mo17866(EnumC1763.EXPLICIT_CAST);
                                                                        C17227 c17227M39112 = AbstractC16481.m39112(c3319);
                                                                        c17227M39112.mo1130(type3);
                                                                        c18959M39119.mo14762(c23195M52120, c17227M39112);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        i2 = 0;
                                                        if (interfaceC4043M55536 != null) {
                                                            it6 = it3;
                                                            if (c23195M52120.m39113(c2551, (C18959) new C3319(EnumC24203.SGET, interfaceC4043M55536.mo13008(), i2), true) != null) {
                                                                C18345.m42796(interfaceC4043M55536, c2551);
                                                            }
                                                        } else {
                                                            it6 = it3;
                                                            if (c18959M39119 instanceof AbstractC15251) {
                                                                abstractC15251 = (AbstractC15251) c18959M39119;
                                                                c21965Mo18926 = abstractC15251.mo18926();
                                                                if (abstractC15251.mo13131() == c23195M52120) {
                                                                    abstractC1566 = (AbstractC1566) c21965Mo18926.m49702().get(c18959M39119.m44020(c23195M52120) - abstractC15251.mo13126());
                                                                    if (abstractC1566.m5556()) {
                                                                        c23195M52120.mo1130(abstractC1566);
                                                                        if (abstractC1566.equals(AbstractC1566.f5421)) {
                                                                            c23195M52120.mo17866(EnumC1763.EXPLICIT_PRIMITIVE_TYPE);
                                                                        }
                                                                    }
                                                                } else {
                                                                    if (c23195M52120.mo39117()) {
                                                                        throw new C8597("Unexpected instance arg in invoke");
                                                                    }
                                                                    AbstractC1566 type4 = c21965Mo18926.m49700().getType();
                                                                    C3319 c33110 = new C3319(EnumC24203.CAST, type4, 1);
                                                                    c33110.mo44014((AbstractC16481) c23195M52120);
                                                                    c33110.mo17866(EnumC1763.EXPLICIT_CAST);
                                                                    C17227 c17227M39113 = AbstractC16481.m39112(c33110);
                                                                    c17227M39113.mo1130(type4);
                                                                    c18959M39119.mo14762(c23195M52120, c17227M39113);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    it4 = it7;
                                                    it5 = it8;
                                                    it6 = it3;
                                                    if (!c18959M39119.mo14762(c6041, abstractC16481M39113.mo17528())) {
                                                    }
                                                }
                                                c18959M39119.m44021(c18959);
                                                i++;
                                            } else {
                                                it4 = it7;
                                                it5 = it8;
                                            }
                                            it6 = it3;
                                        } else {
                                            it4 = it7;
                                            it5 = it8;
                                            it6 = it3;
                                        }
                                    } else {
                                        c18959M39119 = c6041.m39118();
                                        if (c18959M39119 == null) {
                                            it4 = it7;
                                            it5 = it8;
                                            it6 = it3;
                                        } else {
                                            if (abstractC16481M39113 instanceof C23195) {
                                                jM52122 = ((C23195) abstractC16481M39113).m52122();
                                                it4 = it7;
                                                type = c6041.getType();
                                                it5 = it8;
                                                if (type == AbstractC1566.f5420) {
                                                    type = c6041.m17531();
                                                }
                                                if (type.mo5543()) {
                                                    type = AbstractC1566.f5415;
                                                }
                                                c23195M52120 = C23195.m52120(jM52122, type);
                                                c23195M52120.m39414(abstractC16481M39113);
                                                if (c18959M39119.mo14762(c6041, c23195M52120)) {
                                                    it6 = it3;
                                                } else {
                                                    type2 = c23195M52120.getType();
                                                    if (type2.mo5564()) {
                                                        interfaceC4043M55536 = c2551.m8536().m55537(c23195M52120);
                                                    } else {
                                                        if (type2.mo5566(EnumC12006.INT)) {
                                                            interfaceC4043M55536 = c2551.m8536().m55536((Object) Integer.valueOf((int) jM52122), false);
                                                        } else {
                                                            i2 = 0;
                                                            interfaceC4043M55536 = null;
                                                        }
                                                        if (interfaceC4043M55536 != null) {
                                                            it6 = it3;
                                                            if (c23195M52120.m39113(c2551, (C18959) new C3319(EnumC24203.SGET, interfaceC4043M55536.mo13008(), i2), true) != null) {
                                                                C18345.m42796(interfaceC4043M55536, c2551);
                                                            }
                                                        } else {
                                                            it6 = it3;
                                                            if (c18959M39119 instanceof AbstractC15251) {
                                                                abstractC15251 = (AbstractC15251) c18959M39119;
                                                                c21965Mo18926 = abstractC15251.mo18926();
                                                                if (abstractC15251.mo13131() == c23195M52120) {
                                                                    abstractC1566 = (AbstractC1566) c21965Mo18926.m49702().get(c18959M39119.m44020(c23195M52120) - abstractC15251.mo13126());
                                                                    if (abstractC1566.m5556()) {
                                                                        c23195M52120.mo1130(abstractC1566);
                                                                        if (abstractC1566.equals(AbstractC1566.f5421)) {
                                                                            c23195M52120.mo17866(EnumC1763.EXPLICIT_PRIMITIVE_TYPE);
                                                                        }
                                                                    }
                                                                } else {
                                                                    if (c23195M52120.mo39117()) {
                                                                        throw new C8597("Unexpected instance arg in invoke");
                                                                    }
                                                                    AbstractC1566 type5 = c21965Mo18926.m49700().getType();
                                                                    C3319 c33111 = new C3319(EnumC24203.CAST, type5, 1);
                                                                    c33111.mo44014((AbstractC16481) c23195M52120);
                                                                    c33111.mo17866(EnumC1763.EXPLICIT_CAST);
                                                                    C17227 c17227M39114 = AbstractC16481.m39112(c33111);
                                                                    c17227M39114.mo1130(type5);
                                                                    c18959M39119.mo14762(c23195M52120, c17227M39114);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    i2 = 0;
                                                    if (interfaceC4043M55536 != null) {
                                                        it6 = it3;
                                                        if (c23195M52120.m39113(c2551, (C18959) new C3319(EnumC24203.SGET, interfaceC4043M55536.mo13008(), i2), true) != null) {
                                                            C18345.m42796(interfaceC4043M55536, c2551);
                                                        }
                                                    } else {
                                                        it6 = it3;
                                                        if (c18959M39119 instanceof AbstractC15251) {
                                                            abstractC15251 = (AbstractC15251) c18959M39119;
                                                            c21965Mo18926 = abstractC15251.mo18926();
                                                            if (abstractC15251.mo13131() == c23195M52120) {
                                                                abstractC1566 = (AbstractC1566) c21965Mo18926.m49702().get(c18959M39119.m44020(c23195M52120) - abstractC15251.mo13126());
                                                                if (abstractC1566.m5556()) {
                                                                    c23195M52120.mo1130(abstractC1566);
                                                                    if (abstractC1566.equals(AbstractC1566.f5421)) {
                                                                        c23195M52120.mo17866(EnumC1763.EXPLICIT_PRIMITIVE_TYPE);
                                                                    }
                                                                }
                                                            } else {
                                                                if (c23195M52120.mo39117()) {
                                                                    throw new C8597("Unexpected instance arg in invoke");
                                                                }
                                                                AbstractC1566 type6 = c21965Mo18926.m49700().getType();
                                                                C3319 c33112 = new C3319(EnumC24203.CAST, type6, 1);
                                                                c33112.mo44014((AbstractC16481) c23195M52120);
                                                                c33112.mo17866(EnumC1763.EXPLICIT_CAST);
                                                                C17227 c17227M39115 = AbstractC16481.m39112(c33112);
                                                                c17227M39115.mo1130(type6);
                                                                c18959M39119.mo14762(c23195M52120, c17227M39115);
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                it4 = it7;
                                                it5 = it8;
                                                it6 = it3;
                                                if (!c18959M39119.mo14762(c6041, abstractC16481M39113.mo17528())) {
                                                }
                                            }
                                            c18959M39119.m44021(c18959);
                                            i++;
                                        }
                                    }
                                    it7 = it4;
                                    it8 = it5;
                                    it3 = it6;
                                }
                                it = it7;
                                it2 = it8;
                                if (i != arrayList.size()) {
                                    if (C1170.stream(c17973M17530.m41946()).allMatch(new C20954(1))) {
                                        c18959.mo17866(EnumC1763.DONT_GENERATE);
                                    }
                                }
                            }
                            arrayList2.add(c18959);
                            if (runnableC11146 != null) {
                                runnableC11146.run();
                            }
                        } else {
                            it = it7;
                            it2 = it8;
                        }
                    } else {
                        if (i3 == 3) {
                            InterfaceC4043 interfaceC4043M55537 = c2551.m8536().m55536((Object) ((C5557) c18959).getString(), true);
                            if (interfaceC4043M55537 == null) {
                                abstractC16481M39112 = AbstractC16481.m39112(c18959.mo4072());
                            } else {
                                abstractC16481M39113 = AbstractC16481.m39112(new C3319(EnumC24203.SGET, interfaceC4043M55537.mo13008(), 0));
                                abstractC16481M39113.mo1130(AbstractC1566.f5417);
                                runnableC11146 = new RunnableC11146(interfaceC4043M55537, c2551, 1);
                            }
                            c17973M17530 = c18959.m44027().m17530();
                            if (c17973M17530.m41952() == 0) {
                                it = it7;
                                it2 = it8;
                            } else {
                                arrayList = new ArrayList(c17973M17530.m41946());
                                it3 = arrayList.iterator();
                                i = 0;
                                while (it3.hasNext()) {
                                    c6041 = (C6041) it3.next();
                                    if (c6041.mo17865(EnumC1763.DONT_INLINE_CONST)) {
                                        it4 = it7;
                                        it5 = it8;
                                        it6 = it3;
                                    } else {
                                        it4 = it7;
                                        it5 = it8;
                                        it6 = it3;
                                    }
                                    it7 = it4;
                                    it8 = it5;
                                    it3 = it6;
                                }
                                it = it7;
                                it2 = it8;
                                if (i != arrayList.size()) {
                                    if (C1170.stream(c17973M17530.m41946()).allMatch(new C20954(1))) {
                                        c18959.mo17866(EnumC1763.DONT_GENERATE);
                                    }
                                }
                            }
                            arrayList2.add(c18959);
                            if (runnableC11146 != null) {
                                runnableC11146.run();
                            }
                        } else if (i3 == 4 && !c17973M17531.m41947()) {
                            abstractC16481M39112 = AbstractC16481.m39112(c18959.mo4072());
                            abstractC16481M39112.mo1130(AbstractC1566.f5427);
                        } else {
                            it = it7;
                            it2 = it8;
                        }
                        runnableC11146 = null;
                        abstractC16481M39113 = abstractC16481M39112;
                        c17973M17530 = c18959.m44027().m17530();
                        if (c17973M17530.m41952() == 0) {
                            it = it7;
                            it2 = it8;
                        } else {
                            arrayList = new ArrayList(c17973M17530.m41946());
                            it3 = arrayList.iterator();
                            i = 0;
                            while (it3.hasNext()) {
                                c6041 = (C6041) it3.next();
                                if (c6041.mo17865(EnumC1763.DONT_INLINE_CONST)) {
                                    it4 = it7;
                                    it5 = it8;
                                    it6 = it3;
                                } else {
                                    it4 = it7;
                                    it5 = it8;
                                    it6 = it3;
                                }
                                it7 = it4;
                                it8 = it5;
                                it3 = it6;
                            }
                            it = it7;
                            it2 = it8;
                            if (i != arrayList.size()) {
                                if (C1170.stream(c17973M17530.m41946()).allMatch(new C20954(1))) {
                                    c18959.mo17866(EnumC1763.DONT_GENERATE);
                                }
                            }
                        }
                        arrayList2.add(c18959);
                        if (runnableC11146 != null) {
                            runnableC11146.run();
                        }
                    }
                }
                it7 = it;
                it8 = it2;
            }
            C9804.m25536(c2551, c21943, arrayList2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0061  */
    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m3943(C17973 c17973) {
        ArrayList arrayListM41946 = c17973.m41946();
        if (!arrayListM41946.isEmpty()) {
            Iterator it = arrayListM41946.iterator();
            int i = 0;
            while (true) {
                boolean zM3943 = true;
                if (it.hasNext()) {
                    AbstractC16481 abstractC16481 = (C6041) it.next();
                    C18959 c18959M39118 = abstractC16481.m39118();
                    if (c18959M39118 != null) {
                        if (c18959M39118.getType() == EnumC24203.MOVE) {
                            zM3943 = m3943(c18959M39118.m44027().m17530());
                        } else {
                            switch (C9987.f32090[c18959M39118.getType().ordinal()]) {
                                case 5:
                                    if (((C21219) c18959M39118).mo13131() == abstractC16481) {
                                        abstractC16481.mo17866(EnumC1763.DONT_INLINE_CONST);
                                    } else {
                                        zM3943 = false;
                                    }
                                    break;
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                    if (c18959M39118.mo44035(0) == abstractC16481) {
                                        abstractC16481.mo17866(EnumC1763.DONT_INLINE_CONST);
                                    } else {
                                        zM3943 = false;
                                    }
                                    break;
                                case 14:
                                    if (c18959M39118.mo44035(1) == abstractC16481) {
                                        abstractC16481.mo17866(EnumC1763.DONT_INLINE_CONST);
                                    } else {
                                        zM3943 = false;
                                    }
                                    break;
                                default:
                                    zM3943 = false;
                                    break;
                            }
                        }
                        if (zM3943) {
                            i++;
                        }
                    }
                } else if (i == arrayListM41946.size()) {
                    return true;
                }
            }
        }
        return false;
    }
}
