package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܶᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H6CN */
/* JADX INFO: loaded from: classes4.dex */
public final class C16296 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17042 f52907;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C3618 f52908;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C2551 f52909;

    public C16296(C2551 c2551, C3618 c3618, C17042 c17042) {
        this.f52909 = c2551;
        this.f52908 = c3618;
        this.f52907 = c17042;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x0143  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c1  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21943 m38657(C12050 c12050, C11785 c11785, C12567 c12567) {
        C11457 c11457;
        C2551 c2551;
        C11457 c11458;
        C6831 c6831;
        C21943 c21943M3523;
        C12050 c12050M11737;
        BitSet bitSetM49638;
        C21943 c21943M52207;
        C18959 c18959M52200;
        boolean z;
        boolean zM19030;
        boolean zBooleanValue;
        List listM8494;
        C21943 c21943M29616;
        C21943 c21943M29617 = c11785.m29616();
        HashSet hashSetM29617 = c11785.m29617();
        ArrayList arrayList = new ArrayList(hashSetM29617.size());
        C21943 c21943M52208 = C23231.m52207(c21943M29617);
        if (c21943M52208 != null && hashSetM29617.remove(c21943M52208)) {
            arrayList.add(c21943M52208);
        }
        if (hashSetM29617.remove(c21943M29617)) {
            arrayList.add(c21943M29617);
        }
        if (hashSetM29617.remove(c11785.m29613())) {
            arrayList.add(c11785.m29613());
        }
        arrayList.addAll(hashSetM29617);
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c11457 = C11457.f36036;
            c2551 = this.f52909;
            c11458 = C11457.f36019;
            if (!zHasNext) {
                c6831 = null;
                break;
            }
            final C21943 c21943 = (C21943) it.next();
            if (!c21943.mo17867(c11457) && (c18959M52200 = C23231.m52200((InterfaceC23435) c21943)) != null && c18959M52200.getType() == EnumC24203.IF) {
                List listMo17861 = c21943.mo17861(c11458);
                if (listMo17861.isEmpty() || listMo17861.get(0) == c11785) {
                    C21943 c21943M29613 = c11785.m29613();
                    if (c21943 == c21943M29613) {
                        z = true;
                    } else {
                        C21943 c21943M29618 = c11785.m29616();
                        if (!(((ArrayList) c21943M29618.mo1986()).isEmpty() && C6823.m19004(c21943M29618.m49646(), c21943)) && ((ArrayList) c21943M29613.mo1986()).isEmpty() && C6823.m19004(c21943M29613.m49643(), c21943)) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    c6831 = new C6831(c12050, c11785, c21943, z);
                    if (c21943 == c11785.m29616() || z || ((c21943M29616 = c11785.m29616()) == c21943 && ((ArrayList) c21943M29616.mo1986()).isEmpty())) {
                        zM19030 = true;
                    } else {
                        if (((ArrayList) c21943M29616.mo1986()).isEmpty() && c21943M29616.m49639().size() == 1) {
                            C21943 c21943M52209 = C23231.m52207(c21943M29616);
                            while (c21943M52209 != null && c21943M52209 != c21943 && c21943M52209.m49639().size() < 2 && c21943M52209.m49643().size() == 1 && ((ArrayList) c21943M52209.mo1986()).isEmpty()) {
                                c21943M52209 = C23231.m52207(c21943M52209);
                            }
                            if (c21943M52209 == c21943) {
                                zM19030 = true;
                            }
                        }
                        if (c21943.m49643().contains(c11785.m29616())) {
                            c6831.m19037(c11785.m29616());
                            zM19030 = c6831.m19030();
                        } else {
                            zM19030 = false;
                        }
                    }
                    if (zM19030 && c2551.m8494(c21943).size() >= 2) {
                        Iterator it2 = c21943.m49639().iterator();
                        do {
                            if (!it2.hasNext()) {
                                zM19030 = false;
                                break;
                            }
                            listM8494 = c2551.m8494((C21943) it2.next());
                            listM8494.remove(c11785);
                        } while (listM8494.isEmpty());
                    }
                    if (zM19030) {
                        ArrayList arrayListM29621 = c11785.m29621();
                        if (arrayListM29621.size() < 2) {
                            zBooleanValue = true;
                        } else {
                            C15867 c15867FindFirst = C1170.stream(arrayListM29621).filter(new Predicate() { // from class: l.ܽᩴ᩵
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
                                    return ((C16721) obj).m39487() == c21943;
                                }
                            }).findFirst();
                            if (c15867FindFirst.isEmpty()) {
                                throw new C8597("Not found exit edge by exit block: " + c21943);
                            }
                            C21943 c21943M52203 = C23231.m52203(((C16721) c15867FindFirst.get()).m39488());
                            ArrayList arrayList2 = (ArrayList) c21943M52203.mo1986();
                            if (arrayList2.size() == 1 && ((C18959) arrayList2.get(0)).getType() == EnumC24203.RETURN) {
                                zBooleanValue = true;
                            } else {
                                zBooleanValue = m38653(c21943M52203, c11785).booleanValue();
                            }
                        }
                        if (!zBooleanValue) {
                            zM19030 = false;
                        }
                    }
                    if (zM19030) {
                        break;
                    }
                }
            }
        }
        C3618 c3618 = this.f52908;
        if (c6831 != null) {
            ((ArrayList) c12050.mo19035()).add(c6831);
            InterfaceC18213 interfaceC18213M31278 = c12567.m31278();
            c12567.m31276(c6831);
            C0864 c0864M40162 = this.f52907.m40162(c6831);
            if (!((HashSet) c11785.m29620()).contains(c0864M40162.m3512())) {
                c0864M40162 = C0864.m3511(c0864M40162);
            }
            C0864 c0864 = c0864M40162;
            c6831.m1252(c0864);
            c0864.m3522().forEach(new C11145(1));
            arrayList.removeAll(c0864.m3522().m42624());
            if (!arrayList.isEmpty()) {
                List listMo1257 = c6831.mo1257();
                for (C16721 c16721 : c11785.m29621()) {
                    if (listMo1257.contains(c16721.m39487())) {
                        C21943 c21943M52204 = C23231.m52203(c16721.m39488());
                        for (C21943 c21944 : c21943M52204.m49643()) {
                            for (C16721 c16722 : c11785.m29621()) {
                                if (!listMo1257.contains(c16722.m39487()) && (C23231.m52193(c16722.m39488(), c21944) || c16722.m39488() == c21943M52204)) {
                                    m38655(c12567, c11785, c21943M52204, c16722.m39487(), new C16721(c21944, c21943M52204, false));
                                }
                                c21943M52204 = c21943M52204;
                                c21944 = c21944;
                            }
                        }
                        break;
                    }
                }
            }
            if (c6831.m19031()) {
                C21943 c21943M3512 = c0864.m3512();
                if (c21943M3512 == c11785.m29613() || c21943M3512 == c21943M29617) {
                    c21943M3512 = c0864.m3523();
                }
                c21943M3523 = C23231.m52203(c21943M3512);
                c21943M29617.m39419(c11458);
                C21943 c21943M29614 = c11785.m29613();
                EnumC1763 enumC1763 = EnumC1763.ADDED_TO_REGION;
                c21943M29614.mo17866(enumC1763);
                c12567.m31277(c11785.m29613());
                c3618.m11736(c21943M29617);
                c6831.m19027(c3618.m11737(c21943M29617));
                c21943M29617.mo17863(c11458, c11785);
                c11785.m29613().m39418(enumC1763);
            } else {
                c21943M3523 = c0864.m3523();
                if (interfaceC18213M31278 != null && c21943M3523 != null && c21943M3523.mo17865(EnumC1763.LOOP_START) && !c21943M3523.mo17861(c11458).contains(c11785) && C20531.m47080(c21943M3523, (InterfaceC6281) interfaceC18213M31278)) {
                    c21943M3523 = null;
                }
                c12567.m31277(c21943M3523);
                C21943 c21943M3513 = c0864.m3512();
                if (C17359.equals(c21943M3513, c21943M29617)) {
                    c12050M11737 = new C12050(c6831);
                } else {
                    c12050M11737 = c3618.m11737(c21943M3513);
                }
                C21943 c21943M3518 = c0864.m3518();
                if (c21943M29617 != c21943M3518) {
                    HashSet<C21943> hashSetM52150 = C23231.m52150(c21943M29617, c21943M3518);
                    hashSetM52150.remove(c21943M3518);
                    for (C21943 c21945 : hashSetM52150) {
                        if (((ArrayList) c21945.mo1986()).isEmpty() && !c21945.mo17865(EnumC1763.ADDED_TO_REGION) && !C20531.m47080(c21945, (InterfaceC6281) c12050M11737)) {
                            c12050M11737.m30228((InterfaceC6281) c21945);
                        }
                    }
                }
                c6831.m19027(c12050M11737);
            }
            c12567.m31282();
            m38654(c11785);
            return c21943M3523;
        }
        C21943 c21946 = null;
        C6831 c6832 = new C6831(c12050, c11785, null, false);
        ((ArrayList) c12050.mo19035()).add(c6832);
        c21943M29617.m39419(c11458);
        c3618.m11736(c21943M29617);
        c12567.m31276(c6832);
        ArrayList<C16721> arrayListM29622 = c11785.m29621();
        if (arrayListM29622.size() == 1) {
            C16721 c16723 = (C16721) arrayListM29622.get(0);
            C21943 c21943M39488 = c16723.m39488();
            if (m38655(c12567, c11785, c21943M39488, c16723.m39487(), c16723) && (c21943M52207 = C23231.m52207(c21943M39488)) != null) {
                c12567.m31277(c21943M52207);
                c21946 = c21943M52207;
            }
        } else {
            loop4: for (C16721 c16724 : arrayListM29622) {
                C21943 c21943M39489 = c16724.m39488();
                C21943 c21943M394810 = c16724.m39488();
                if (c21943M394810.m49643().size() > 1) {
                    bitSetM49638 = new BitSet();
                    bitSetM49638.set(c21943M394810.m49644());
                } else {
                    bitSetM49638 = c21943M394810.m49638();
                }
                List<C21943> listM52151 = C23231.m52151(c2551, bitSetM49638);
                C21943 c21943M8491 = c2551.m8491();
                if (listM52151.contains(c21943M8491)) {
                    listM52151.remove(c21943M8491);
                    listM52151.add(c21943M8491);
                }
                for (C21943 c21947 : listM52151) {
                    if (C23231.m52193(c21943M39489, c21947)) {
                        if (m38653(c21947, c11785).booleanValue()) {
                            c21946 = c21947;
                            break loop4;
                        }
                    } else if (c21947.mo17865(EnumC1763.LOOP_START) && m38653(c21943M39489, c11785).booleanValue()) {
                        c21946 = c21943M39489;
                        break loop4;
                    }
                }
            }
            c12567.m31277(c21946);
            if (c21946 != null && c21946 != c2551.m8491()) {
                for (C21943 c21948 : c21946.m49643()) {
                    for (C16721 c16725 : c11785.m29621()) {
                        C21943 c21943M394811 = c16725.m39488();
                        if (C23231.m52193(c16725.m39488(), c21948) || c21943M394811 == c21946) {
                            m38655(c12567, c11785, c21946, c16725.m39487(), new C16721(c21948, c21946, false));
                        }
                        c21948 = c21948;
                    }
                }
            }
        }
        C12050 c12050M11738 = c3618.m11737(c21943M29617);
        C21943 c21943M29615 = c11785.m29613();
        if (!C20531.m47080(c21943M29615, (InterfaceC6281) c12050M11738) && !c21943M29615.mo17867(c11457)) {
            if (c2551.m8557() == 0) {
                ((ArrayList) c12050M11738.mo19035()).add(c21943M29615);
                break;
            }
            Iterator it3 = c2551.m8530().iterator();
            do {
                if (!it3.hasNext()) {
                    ((ArrayList) c12050M11738.mo19035()).add(c21943M29615);
                    break;
                }
            } while (!((C19684) it3.next()).m45365().contains(c21943M29615));
        }
        c6832.m19027(c12050M11738);
        if (c21946 == null) {
            C21943 c21943M522010 = C23231.m52207(c21943M29615);
            c21946 = C20531.m47080(c21943M522010, (InterfaceC6281) c12050M11738) ? null : c21943M522010;
        }
        c12567.m31282();
        c21943M29617.mo17863(c11458, c11785);
        m38654(c11785);
        return c21946;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Boolean m38653(C21943 c21943, C11785 c11785) {
        List<C21943> listM52151;
        C0864 c0864M40158;
        BitSet bitSetM49638;
        LinkedList linkedList = new LinkedList(c11785.m29621());
        while (!linkedList.isEmpty()) {
            C16721 c16721 = (C16721) linkedList.remove();
            C21943 c21943M39488 = c16721.m39488();
            boolean zMo17865 = c16721.mo17865(EnumC1763.SYNTHETIC);
            C2551 c2551 = this.f52909;
            if (zMo17865) {
                listM52151 = C23231.m52151(c2551, c16721.m39488().m49638());
            } else {
                C21943 c21943M39489 = c16721.m39488();
                if (c21943M39489.m49643().size() > 1) {
                    bitSetM49638 = new BitSet();
                    bitSetM49638.set(c21943M39489.m49644());
                } else {
                    bitSetM49638 = c21943M39489.m49638();
                }
                listM52151 = C23231.m52151(c2551, bitSetM49638);
            }
            if (!c21943.m49650(c21943M39488) && c21943 != c21943M39488) {
                for (C21943 c21944 : listM52151) {
                    if (c21944 != c21943 && !C23231.m52180(c21944, c2551)) {
                        C21943 c21943M52203 = ((ArrayList) c21944.mo1986()).isEmpty() ? C23231.m52203(c21944) : c21944;
                        if (!C23231.m52193(c21943M39488, c21944)) {
                            if (c21944.mo17865(EnumC1763.LOOP_START)) {
                                C11785 c11785M29619 = c11785.m29619();
                                while (true) {
                                    if (c11785M29619 == null) {
                                        c11785M29619 = null;
                                        break;
                                    }
                                    if (c11785M29619.m29616() == c21944) {
                                        break;
                                    }
                                    c11785M29619 = c11785M29619.m29619();
                                }
                                if (c11785M29619 != null) {
                                    C21943 c21943M29613 = c11785M29619.m29613();
                                    List listM49643 = c21943M29613.m49643();
                                    if (listM49643.size() > 1) {
                                        Iterator it = listM49643.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                C21943 c21945 = (C21943) it.next();
                                                if (!C23231.m52193(c21943M39488, c21945) || m38656(c21945, listM49643, c21943M29613, c11785M29619.m29617())) {
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                        if (!C23231.m52180(c21943M52203, c2551) && c21943M52203 != c21943) {
                            List listM49639 = c21943M52203.m49639();
                            if (!listM49639.isEmpty()) {
                                Iterator it2 = listM49639.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        C21943 c21943M52204 = C23231.m52203((C21943) it2.next());
                                        if (C23231.m52180(c21943M52204, c2551) || c21943M52204 == c21943) {
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            List listM49644 = c21944.m49643();
                            C21943 c21943M52165 = C23231.m52165((C21943) listM49644.get(0), Boolean.TRUE, true);
                            Iterator it3 = listM49644.iterator();
                            while (it3.hasNext()) {
                                C21943 c21943M52166 = C23231.m52165((C21943) it3.next(), Boolean.TRUE, true);
                                if (c21944.m49650(c21943M52166)) {
                                    c21943M52165 = c21943M52166;
                                }
                            }
                            C0864 c0864M40153 = C17042.m40153(c21943M52165, c2551);
                            if (c0864M40153 != null && (c0864M40158 = C17042.m40158(c0864M40153)) != null) {
                                C18293 c18293M3522 = c0864M40158.m3522();
                                Iterator it4 = listM49644.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        if (!c18293M3522.m42625(C23231.m52165((C21943) it4.next(), Boolean.TRUE, true))) {
                                        }
                                    } else {
                                        C16721 c16722 = new C16721(c21944, c21944, true);
                                        if (!linkedList.contains(c16722)) {
                                            linkedList.add(c16722);
                                        }
                                    }
                                }
                            }
                            for (C18916 c18916 : c21944.mo17861(C11457.f36017)) {
                                C18959 c18959M43923 = c18916.m43923();
                                if (c18959M43923.getType() == EnumC24203.BREAK) {
                                    Iterator it5 = ((C24884) c18959M43923.mo17862((InterfaceC2157) C11457.f36019)).m55414().iterator();
                                    while (true) {
                                        if (!it5.hasNext()) {
                                            continue;
                                        } else if (!c11785.m29615((C11785) it5.next()) || c18916.m43921() != c21944) {
                                        }
                                    }
                                }
                            }
                            return Boolean.FALSE;
                        }
                    }
                }
            }
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0091  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:61:0x0108  */
    /* JADX WARN: Code duplicated, block: B:84:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:? A[LOOP:2: B:39:0x009d->B:85:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:? A[LOOP:3: B:59:0x0102->B:88:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m38655(C12567 c12567, C11785 c11785, C21943 c21943, C21943 c21944, C16721 c16721) {
        C11785 c11786;
        boolean z;
        C16721 c16722;
        C18959 c18959;
        List<C11785> listM8494;
        Iterator it;
        C21943 c21943M39488 = c16721.m39488();
        C21943 c21943M52203 = C23231.m52203(c21943M39488);
        C11457 c11457 = C11457.f36019;
        Iterator it2 = c21943M52203.mo17861(c11457).iterator();
        while (true) {
            c11786 = null;
            if (!it2.hasNext()) {
                z = false;
                c16722 = null;
                break;
            }
            C11785 c11787 = (C11785) it2.next();
            if (c11787 != c11785 && c11785.m29615(c11787)) {
                z = true;
                c16722 = c16721;
                break;
            }
        }
        C2551 c2551 = this.f52909;
        if (!z) {
            C21943 c21943M39487 = C23231.m52203(c21943M39488) != c21943M39488 ? null : c16721.m39487();
            C18293 c18293 = new C18293(c2551);
            while (c21943M39488 != null && !c18293.m42625(c21943M39488)) {
                c18293.m42623(c21943M39488);
                if (c21943M39487 == null || !C23231.m52193(c21943, c21943M39488)) {
                    List listM49639 = c21943M39488.m49639();
                    C21943 c21945 = listM49639.size() == 1 ? (C21943) listM49639.get(0) : null;
                    c21943M39487 = c21943M39488;
                    c21943M39488 = c21945;
                } else if (!C23231.m52183((InterfaceC23435) c21943M39487)) {
                    List listM52152 = C23231.m52152(c21943M39487);
                    if (listM52152.isEmpty()) {
                        it = C23231.m52150(c2551.m8535(), c21943M39487).iterator();
                        while (it.hasNext()) {
                            if (C23231.m52184((InterfaceC23435) it.next(), EnumC24203.SWITCH)) {
                            }
                        }
                        c16722 = new C16721(c21943M39487, c21943M39488, false);
                        z = true;
                        break;
                    }
                    C21943 c21946 = (C21943) C7750.m21093(1, listM52152);
                    c21946.getClass();
                    if (!c21946.mo17865(EnumC1763.MTH_EXIT_BLOCK) && !c21946.mo17865(EnumC1763.RETURN) && !c2551.m8521(c21946)) {
                        it = C23231.m52150(c2551.m8535(), c21943M39487).iterator();
                        while (it.hasNext()) {
                            if (C23231.m52184((InterfaceC23435) it.next(), EnumC24203.SWITCH)) {
                            }
                        }
                        c16722 = new C16721(c21943M39487, c21943M39488, false);
                        z = true;
                        break;
                    }
                }
            }
            if (z) {
                c18959 = new C18959(EnumC24203.BREAK, 0);
                c18959.mo17863(c11457, c11785);
                C18916.m43920(c16722, c18959);
                c12567.m31277(c21943M39488);
                if (c2551.m8494(c21943M39488).isEmpty()) {
                    listM8494 = c2551.m8494(c21944);
                    if (listM8494.size() >= 2) {
                        for (C11785 c11788 : listM8494) {
                            if (c11788.m29619() == null) {
                                c11786 = c11788;
                                break;
                            }
                        }
                        if (c11786 != null) {
                            C25212 c25212 = new C25212(c11786);
                            c18959.mo17864(c25212);
                            c11786.m29616().mo17864(c25212);
                        }
                    }
                }
                return true;
            }
        } else if (z) {
            c18959 = new C18959(EnumC24203.BREAK, 0);
            c18959.mo17863(c11457, c11785);
            C18916.m43920(c16722, c18959);
            c12567.m31277(c21943M39488);
            if (c2551.m8494(c21943M39488).isEmpty()) {
                listM8494 = c2551.m8494(c21944);
                if (listM8494.size() >= 2) {
                    while (r0.hasNext()) {
                        if (c11788.m29619() == null) {
                            c11786 = c11788;
                            break;
                        }
                    }
                    if (c11786 != null && c11786.m29613() != c21943M39488 && !c11786.m29617().contains(c21943M39488)) {
                        C25212 c25213 = new C25212(c11786);
                        c18959.mo17864(c25213);
                        c11786.m29616().mo17864(c25213);
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38654(C11785 c11785) {
        C21943 c21943M29613 = c11785.m29613();
        List<C21943> listM49643 = c21943M29613.m49643();
        if (listM49643.size() <= 1) {
            return;
        }
        HashSet hashSetM29617 = c11785.m29617();
        for (C21943 c21943 : listM49643) {
            if (m38656(c21943, listM49643, c21943M29613, hashSetM29617)) {
                ((ArrayList) c21943.mo1986()).add(new C18959(EnumC24203.CONTINUE, 0));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0088  */
    /* JADX WARN: Code duplicated, block: B:46:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:? A[LOOP:2: B:32:0x0082->B:47:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m38656(C21943 c21943, List list, C21943 c21944, HashSet hashSet) {
        Iterator it;
        if (c21943.mo17865(EnumC1763.SYNTHETIC) && !C23231.m52184((InterfaceC23435) c21943, EnumC24203.CONTINUE)) {
            List listM49643 = c21943.m49643();
            if (!listM49643.isEmpty()) {
                C21943 c21945 = (C21943) listM49643.get(0);
                if (!c21945.mo17865(EnumC1763.ADDED_TO_REGION) && !c21944.m49650(c21945) && !hashSet.contains(c21945)) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (!((C21943) it2.next()).m49650(c21945)) {
                            C11457 c11457 = C11457.f36017;
                            if (!c21943.mo17861(c11457).isEmpty()) {
                                Iterator it3 = c21943.mo17861(c11457).iterator();
                                while (it3.hasNext()) {
                                    if (((C18916) it3.next()).m43923().getType() == EnumC24203.BREAK) {
                                        break;
                                    }
                                }
                                it = hashSet.iterator();
                                while (it.hasNext()) {
                                    if (C23231.m52193(c21945, (C21943) it.next())) {
                                        return true;
                                    }
                                }
                                break;
                            }
                            it = hashSet.iterator();
                            while (it.hasNext()) {
                                if (C23231.m52193(c21945, (C21943) it.next())) {
                                    return true;
                                }
                            }
                            break;
                            break;
                        }
                    }
                }
            }
        }
        return false;
    }
}
