package l;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩻᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: B6EY */
/* JADX INFO: loaded from: classes.dex */
public final class C25314 extends AbstractC16700 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f81771 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumSet f81772;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumSet f81773;

    static {
        EnumC24203 enumC24203 = EnumC24203.RETURN;
        EnumC24203 enumC24204 = EnumC24203.IF;
        EnumC24203 enumC24205 = EnumC24203.SWITCH;
        EnumC24203 enumC24206 = EnumC24203.THROW;
        f81773 = EnumSet.of(enumC24203, enumC24204, enumC24205, EnumC24203.MONITOR_ENTER, EnumC24203.MONITOR_EXIT, enumC24206, EnumC24203.MOVE_EXCEPTION);
        f81772 = EnumSet.of(enumC24203, enumC24206, EnumC24203.GOTO, enumC24204, enumC24205, EnumC24203.JAVA_JSR, EnumC24203.JAVA_RET);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m56584(EnumC24203 enumC24203) {
        return f81773.contains(enumC24203);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0050  */
    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo1737(final C2551 c2551) {
        C11457 c11457;
        if (c2551.m8524()) {
            return;
        }
        c2551.m8541();
        C21943 c21943M56577 = m56577(c2551, -1);
        c21943M56577.mo17866(EnumC1763.MTH_ENTER_BLOCK);
        c2551.m8556(c21943M56577);
        C21943 c21943M56578 = m56577(c2551, -1);
        c21943M56578.mo17866(EnumC1763.MTH_EXIT_BLOCK);
        c2551.m8539(c21943M56578);
        HashMap map = new HashMap();
        C18959[] c18959ArrM8506 = c2551.m8506();
        int length = c18959ArrM8506.length;
        C18959 c18959 = null;
        int i = 0;
        while (true) {
            c11457 = C11457.f36035;
            if (i >= length) {
                break;
            }
            C18959 c189510 = c18959ArrM8506[i];
            if (c189510 != null && (c189510.getType() != EnumC24203.NOP || !c189510.m39417())) {
                int offset = c189510.getOffset();
                if (c18959 != null) {
                    EnumC24203 type = c18959.getType();
                    if (!f81772.contains(type)) {
                        EnumSet enumSet = f81773;
                        if (enumSet.contains(type) || enumSet.contains(c189510.getType()) || c189510.mo17865(EnumC1763.TRY_ENTER) || c18959.mo17865(EnumC1763.TRY_LEAVE) || c189510.mo17867(C11457.f36036)) {
                            C21943 c21943M56579 = m56577(c2551, offset);
                            m56582(c21943M56577, c21943M56579);
                            c21943M56577 = c21943M56579;
                            break;
                        }
                        Iterator it = c18959.mo17861(c11457).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((C13277) it.next()).m32824() == c18959.getOffset()) {
                                }
                            } else {
                                Iterator it2 = c189510.mo17861(c11457).iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (((C13277) it2.next()).m32823() == c189510.getOffset()) {
                                        }
                                    } else {
                                        if (c189510.getType() != EnumC24203.IF || ((C21943) map.get(Integer.valueOf(((C17489) c189510).mo39519()))) != c21943M56577) {
                                            break;
                                            break;
                                        }
                                        break;
                                    }
                                }
                            }
                            C21943 c21943M565710 = m56577(c2551, offset);
                            m56582(c21943M56577, c21943M565710);
                            c21943M56577 = c21943M565710;
                            break;
                        }
                    }
                    c21943M56577 = m56577(c2551, offset);
                } else {
                    C21943 c21943M565711 = m56577(c2551, offset);
                    m56582(c21943M56577, c21943M565711);
                    c21943M56577 = c21943M565711;
                    break;
                }
                map.put(Integer.valueOf(offset), c21943M56577);
                ((ArrayList) c21943M56577.mo1986()).add(c189510);
                c18959 = c189510;
            }
            i++;
        }
        Iterator it3 = c2551.m8508().iterator();
        while (it3.hasNext()) {
            Iterator it4 = ((ArrayList) ((C21943) it3.next()).mo1986()).iterator();
            while (it4.hasNext()) {
                for (C13277 c13277 : ((C18959) it4.next()).mo17861(c11457)) {
                    m56582(m56576(c13277.m32824(), map), m56576(c13277.m32823(), map));
                }
            }
        }
        C4937.forEach(c2551.m8508(), new C11887());
        Iterator it5 = c2551.m8508().iterator();
        while (it5.hasNext()) {
            ArrayList arrayList = (ArrayList) ((C21943) it5.next()).mo1986();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                C18959 c189511 = (C18959) arrayList.get(i2);
                if (c189511.getType() == EnumC24203.MOVE_MULTI) {
                    int iM44039 = c189511.m44039() / 2;
                    for (int i3 = 0; i3 < iM44039; i3++) {
                        C18959 c189512 = new C18959(EnumC24203.MOVE, 1);
                        int i4 = i3 * 2;
                        c189512.m44031((C6041) c189511.mo44035(i4));
                        c189512.mo44014(c189511.mo44035(i4 + 1));
                        c189512.m39414((AbstractC16678) c189511);
                        c189512.m16975((AbstractC5820) c189511);
                        if (i3 == 0) {
                            c189512.m44024(c189511.getOffset());
                            arrayList.set(i2, c189512);
                        } else {
                            arrayList.add(i2 + i3, c189512);
                        }
                    }
                    i2 += iM44039 - 1;
                    size = arrayList.size();
                }
                i2++;
            }
        }
        if (c2551.mo17865(EnumC1763.RESOLVE_JAVA_JSR)) {
            int size2 = c2551.m8508().size();
            int i5 = 0;
            loop9: while (true) {
                List listM8508 = c2551.m8508();
                int size3 = listM8508.size();
                Iterator it6 = listM8508.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break loop9;
                    }
                    final C21943 c21943 = (C21943) it6.next();
                    if (C23231.m52184((InterfaceC23435) c21943, EnumC24203.JAVA_RET)) {
                        C23231.m52174(c2551, c21943, new Predicate() { // from class: l.᩵᩷᩵
                            @Override // java.util.function.Predicate
                            public /* synthetic */ Predicate and(Predicate predicate) {
                                return C19025.$default$and(this, predicate);
                            }

                            @Override // java.util.function.Predicate
                            /* JADX INFO: renamed from: negate */
                            public /* synthetic */ Predicate mo7134negate() {
                                return C19025.$default$negate(this);
                            }

                            public /* synthetic */ Predicate or(Predicate predicate) {
                                return C19025.$default$or(this, predicate);
                            }

                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj) {
                                return C12633.m31400(c2551, c21943, (C21943) obj);
                            }
                        });
                        if (size3 != c2551.m8508().size()) {
                            break;
                        }
                    }
                }
                int i6 = i5 + 1;
                if (i5 > size2) {
                    throw new C8597("Fail to resolve jsr instructions");
                }
                i5 = i6;
            }
        }
        Iterator it7 = c2551.m8508().iterator();
        while (it7.hasNext()) {
            Iterator it8 = ((ArrayList) ((C21943) it7.next()).mo1986()).iterator();
            while (it8.hasNext()) {
                ((C18959) it8.next()).m39419(c11457);
            }
        }
        Iterator it9 = c2551.m8508().iterator();
        while (it9.hasNext()) {
            C1170.removeIf((ArrayList) ((C21943) it9.next()).mo1986(), new C2471(1));
        }
        C1170.removeIf(c2551.m8508(), new C23326(3));
        C1170.removeIf(c2551.m8508(), new C2193());
        if (!c2551.m8560()) {
            for (C21943 c21944 : c2551.m8508()) {
                Iterator it10 = ((ArrayList) c21944.mo1986()).iterator();
                while (it10.hasNext()) {
                    C21922 c21922 = (C21922) ((C18959) it10.next()).mo17862((InterfaceC2157) C11457.f36015);
                    if (c21922 != null) {
                        Iterator it11 = ((ArrayList) c21922.m49617()).iterator();
                        while (it11.hasNext()) {
                            C21943 c21943M56576 = m56576(((C19684) it11.next()).m45367(), map);
                            if (!c21943M56576.mo17867(C11457.f36014)) {
                                List listM49643 = c21944.m49643();
                                if (listM49643.isEmpty()) {
                                    throw new C8597("Unexpected missing predecessor for block: " + c21944);
                                }
                                C21943 c21945 = listM49643.size() == 1 ? (C21943) listM49643.get(0) : c21944;
                                if (!c21945.m49646().contains(c21943M56576)) {
                                    m56582(c21945, c21943M56576);
                                    c21943M56576.mo17864(new C8057(c21945));
                                }
                            }
                        }
                    }
                }
            }
        }
        C21943 c21943M8491 = c2551.m8491();
        for (C21943 c21946 : c2551.m8508()) {
            if (c21946.m49646().isEmpty() && c21946 != c21943M8491) {
                m56582(c21946, c21943M8491);
                if (C23231.m52184((InterfaceC23435) c21946, EnumC24203.RETURN)) {
                    c21946.mo17866(EnumC1763.RETURN);
                }
            }
        }
        c2551.m8512();
        c2551.m8525();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21943 m56577(C2551 c2551, int i) {
        List listM8508 = c2551.m8508();
        C21943 c21943 = new C21943(c2551.m8546(), listM8508.size(), i);
        listM8508.add(c21943);
        return c21943;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m56582(C21943 c21943, C21943 c21944) {
        if (!c21943.m49646().contains(c21944)) {
            c21943.m49646().add(c21944);
        }
        if (c21944.m49643().contains(c21943)) {
            return;
        }
        c21944.m49643().add(c21943);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m56586(C21943 c21943, C21943 c21944) {
        c21943.m49646().remove(c21944);
        c21944.m49643().remove(c21943);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m56585(C21943 c21943) {
        Iterator it = c21943.m49643().iterator();
        while (it.hasNext()) {
            ((C21943) it.next()).m49646().remove(c21943);
        }
        c21943.m49643().clear();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m56583(C21943 c21943, C21943 c21944, C21943 c21945) {
        m56586(c21943, c21944);
        m56582(c21943, c21945);
        m56589(c21943, c21944, c21945);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21943 m56578(C2551 c2551, C21943 c21943, C21943 c21944) {
        C21943 c21943M56577 = m56577(c2551, c21944.m49654());
        c21943M56577.mo17866(EnumC1763.SYNTHETIC);
        m56586(c21943, c21944);
        m56582(c21943, c21943M56577);
        m56582(c21943M56577, c21944);
        m56589(c21943, c21944, c21943M56577);
        c21943.m49653();
        c21943M56577.m49653();
        return c21943M56577;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21943 m56580(C21943 c21943, C2551 c2551) {
        C21943 c21943M56577 = m56577(c2551, c21943.m49654());
        for (C21943 c21944 : new ArrayList(c21943.m49643())) {
            m56583(c21944, c21943, c21943M56577);
            c21944.m49653();
        }
        m56582(c21943M56577, c21943);
        c21943M56577.m49653();
        return c21943M56577;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m56588(C21943 c21943, C21943 c21944) {
        List listMo1986 = c21944.mo1986();
        Iterator it = ((ArrayList) c21943.mo1986()).iterator();
        while (it.hasNext()) {
            ((ArrayList) listMo1986).add(((C18959) it.next()).m44018());
        }
        c21944.m39414((AbstractC16678) c21943);
        c21944.m39419(C11457.f36018);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m56575(C2551 c2551, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C21943 c21943 = (C21943) it.next();
            C21943 c21943M56577 = m56577(c2551, c21943.m49654());
            m56588(c21943, c21943M56577);
            arrayList2.add(c21943M56577);
            map.put(c21943, c21943M56577);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C21943 c21944 = (C21943) it2.next();
            C21943 c21943M56579 = m56579(c21944, map);
            Iterator it3 = c21944.m49646().iterator();
            while (it3.hasNext()) {
                m56582(c21943M56579, m56579((C21943) it3.next(), map));
            }
            C14768 c14768 = (C14768) c21944.mo17862((InterfaceC2157) C11457.f36018);
            if (c14768 != null) {
                c21943M56579.mo17864(new C14768(m56579(c14768.m35538(), map)));
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21943 m56579(C21943 c21943, HashMap map) {
        C21943 c21944 = (C21943) map.get(c21943);
        if (c21944 != null) {
            return c21944;
        }
        throw new C8597("Copy blocks tree failed. Missing block for connection: " + c21943);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m56589(C21943 c21943, C21943 c21944, C21943 c21945) {
        C14768 c14768 = (C14768) c21943.mo17862((InterfaceC2157) C11457.f36018);
        if (c14768 != null && c14768.m35538() == c21944) {
            c21943.mo17864(new C14768(c21945));
        }
        C18959 c18959M52200 = C23231.m52200((InterfaceC23435) c21943);
        if (c18959M52200 instanceof AbstractC9284) {
            ((AbstractC9284) c18959M52200).mo4069(c21944, c21945);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21943 m56576(int i, HashMap map) {
        C21943 c21943 = (C21943) map.get(Integer.valueOf(i));
        if (c21943 != null) {
            return c21943;
        }
        throw new C8597(C13645.m33382(i, "Missing block: "));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m56587(C2551 c2551) {
        for (C21943 c21943 : c2551.m8508()) {
            if (c21943.mo17865(EnumC1763.REMOVE)) {
                m56581(c21943);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m56590(final C21943 c21943) {
        if (!((ArrayList) c21943.mo1986()).isEmpty() || !c21943.m39417() || c21943.m49646().size() > 1 || c21943.m49643().isEmpty() || c21943.mo17865(EnumC1763.MTH_ENTER_BLOCK) || c21943.mo17865(EnumC1763.MTH_EXIT_BLOCK) || c21943.m49646().contains(c21943)) {
            return false;
        }
        if (c21943.m49646().size() == 1) {
            final C21943 c21944 = (C21943) c21943.m49646().get(0);
            C4937.forEach(c21943.m49643(), new Consumer() { // from class: l.۫᩷᩵
                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C12312.$default$andThen(this, consumer);
                }

                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    C21943 c21945 = (C21943) obj;
                    List listM49646 = c21945.m49646();
                    C21943 c21946 = c21943;
                    listM49646.remove(c21946);
                    C21943 c21947 = c21944;
                    C25314.m56582(c21945, c21947);
                    C25314.m56589(c21945, c21946, c21947);
                    c21945.m49653();
                }
            });
            m56586(c21943, c21944);
        } else {
            C4937.forEach(c21943.m49643(), new C5922(0, c21943));
        }
        c21943.mo17866(EnumC1763.REMOVE);
        c21943.m49646().clear();
        c21943.m49643().clear();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m56581(C21943 c21943) {
        for (C21943 c21944 : c21943.m49643()) {
            c21944.m49646().remove(c21943);
            c21944.m49653();
        }
        Iterator it = c21943.m49646().iterator();
        while (it.hasNext()) {
            ((C21943) it.next()).m49643().remove(c21943);
        }
        c21943.mo17866(EnumC1763.REMOVE);
        c21943.m49643().clear();
        c21943.m49646().clear();
    }
}
