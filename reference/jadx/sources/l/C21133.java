package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩶ۜۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6HV */
/* JADX INFO: loaded from: classes5.dex */
public final class C21133 extends AbstractC16700 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List] */
    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo22644(C24927 c24927) {
        Iterator it = c24927.m55534().iterator();
        while (it.hasNext()) {
            mo22644((C24927) it.next());
        }
        if (!c24927.getFields().isEmpty()) {
            C2551 c2551M55570 = c24927.m55570("<clinit>()V");
            if (c2551M55570 != null && c2551M55570.mo8547().m26540() && !c2551M55570.m8524() && c2551M55570.m8508() != null && C6823.m19003((Collection) c24927.getFields(), (Predicate) new C20548(2))) {
                while (true) {
                    ArrayList<C14419> arrayListM48232 = m48232(c24927, c2551M55570, EnumC24203.SPUT);
                    if (arrayListM48232.isEmpty()) {
                        break;
                    }
                    Iterator it2 = arrayListM48232.iterator();
                    while (it2.hasNext()) {
                        C17467 c17467 = ((C14419) it2.next()).f45425;
                        if (c17467.mo8547().m26538()) {
                            c17467.m39419(C25278.f81643);
                        }
                    }
                    m48233(arrayListM48232);
                    if (arrayListM48232.isEmpty()) {
                        break;
                    }
                    for (C14419 c14419 : arrayListM48232) {
                        C3319 c3319 = c14419.f45424;
                        AbstractC16481 abstractC16481Mo44035 = c3319.mo44035(0);
                        if (abstractC16481Mo44035 instanceof C17227) {
                            ((C17227) abstractC16481Mo44035).m40461().mo17866(EnumC1763.DECLARE_VAR);
                        }
                        C9804.m25534(c2551M55570, c3319);
                        m48234(c2551M55570, c14419.f45425, c3319);
                    }
                    m48236(c24927, arrayListM48232);
                    C7347.m20164(c2551M55570);
                }
            }
            if (C6823.m19003((Collection) c24927.getFields(), (Predicate) new C23816(1))) {
                ?? arrayList = new ArrayList();
                for (C2551 c2551 : c24927.getMethods()) {
                    C10293 c10293Mo8547 = c2551.mo8547();
                    if (!c10293Mo8547.m26540() && c10293Mo8547.m26543()) {
                        arrayList.add(c2551);
                        if (c2551.m8524() || C23231.m52188(c2551.m8508())) {
                            arrayList = Collections.EMPTY_LIST;
                            break;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    ArrayList<C3979> arrayList2 = new ArrayList(arrayList.size());
                    for (C2551 c2552 : arrayList) {
                        ArrayList arrayListM48233 = m48232(c24927, c2552, EnumC24203.IPUT);
                        m48233(arrayListM48233);
                        if (!arrayListM48233.isEmpty()) {
                            arrayList2.add(new C3979(c2552, arrayListM48233));
                        }
                    }
                    C3979 c3979 = null;
                    for (C3979 c39710 : arrayList2) {
                        if (c3979 == null) {
                            c3979 = c39710;
                        } else {
                            ArrayList arrayList3 = c3979.f13628;
                            ArrayList arrayList4 = c39710.f13628;
                            if (arrayList3.size() == arrayList4.size()) {
                                int size = arrayList3.size();
                                for (int i = 0; i < size; i++) {
                                    if (m48237(((C14419) arrayList3.get(i)).f45424, ((C14419) arrayList4.get(i)).f45424)) {
                                    }
                                }
                            }
                        }
                    }
                    if (c3979 != null) {
                        ArrayList<C14419> arrayList5 = c3979.f13628;
                        for (C3979 c39711 : arrayList2) {
                            Iterator it3 = c39711.f13628.iterator();
                            while (it3.hasNext()) {
                                C3319 c33110 = ((C14419) it3.next()).f45424;
                                AbstractC16481 abstractC16481Mo44036 = c33110.mo44035(0);
                                if (abstractC16481Mo44036 instanceof C17227) {
                                    ((C17227) abstractC16481Mo44036).m40461().mo17866(EnumC1763.DECLARE_VAR);
                                }
                                C9804.m25534(c39711.f13627, c33110);
                            }
                        }
                        for (C14419 c144110 : arrayList5) {
                            m48234(c3979.f13627, c144110.f45425, c144110.f45424);
                        }
                        m48236(c24927, arrayList5);
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m48232(C24927 c24927, C2551 c2551, EnumC24203 enumC24203) {
        C17467 c17467M55538;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        C21943 c21943M8535 = c2551.m8535();
        if (c21943M8535 != null) {
            hashSet.add(c21943M8535);
            for (C21943 c21943M52194 = C23231.m52194(c21943M8535); c21943M52194 != null; c21943M52194 = C23231.m52194(c21943M52194)) {
                hashSet.add(c21943M52194);
            }
        }
        boolean z = true;
        for (C21943 c21943 : c2551.m8508()) {
            for (C18959 c18959 : (ArrayList) c21943.mo1986()) {
                boolean z2 = false;
                if (c18959.getType() == enumC24203) {
                    C3319 c3319 = (C3319) c18959;
                    C14022 c14022 = (C14022) c3319.m10937();
                    if (c14022.m34148().equals(c24927.m55571()) && (c17467M55538 = c24927.m55538(c14022)) != null) {
                        if (z && hashSet.contains(c21943)) {
                            z2 = true;
                        }
                        arrayList.add(new C14419(c17467M55538, c3319, z2));
                    }
                }
                if (z && !c18959.m44034()) {
                    z = false;
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48233(ArrayList arrayList) {
        boolean z;
        boolean zEquals;
        final Set set = (Set) C1170.stream(((Map) C1170.stream(arrayList).collect(C2025.toMap(new C12182(), new C6217(), new C24117()))).entrySet()).filter(new C15342(2)).map(new C15033(5)).collect(C2025.toSet());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C14419 c14419 = (C14419) it.next();
            if (c14419.f45423) {
                C3319 c3319 = c14419.f45424;
                AbstractC16481 abstractC16481Mo44035 = c3319.mo44035(0);
                abstractC16481Mo44035.getClass();
                if (abstractC16481Mo44035 instanceof C17227) {
                    if (((C17227) abstractC16481Mo44035).m40461().m44034() || !c3319.mo17867(C11457.f36015)) {
                        HashSet<C6041> hashSet = new HashSet();
                        c3319.mo14760(hashSet);
                        if (!hashSet.isEmpty()) {
                            for (C6041 c6041 : hashSet) {
                                c6041.getClass();
                                if (!c6041.mo17865(EnumC1763.THIS)) {
                                }
                            }
                        }
                    }
                } else if ((abstractC16481Mo44035 instanceof C23195) || abstractC16481Mo44035.mo17865(EnumC1763.THIS)) {
                }
            }
            set.add(c14419.f45425.mo13008());
        }
        if (!set.isEmpty()) {
            do {
                Iterator it2 = arrayList.iterator();
                z = false;
                while (it2.hasNext()) {
                    C14419 c144110 = (C14419) it2.next();
                    C14022 c14022Mo13008 = c144110.f45425.mo13008();
                    if (!set.contains(c14022Mo13008)) {
                        if (set.isEmpty()) {
                            zEquals = false;
                        } else {
                            C3319 c33110 = c144110.f45424;
                            final EnumC24203 enumC24203 = c33110.getType() == EnumC24203.SPUT ? EnumC24203.SGET : EnumC24203.IGET;
                            zEquals = C17359.equals((Boolean) c33110.m44009(new Function() { // from class: l.ܽۜۗ
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
                                    C18959 c18959 = (C18959) obj;
                                    if (c18959.getType() != enumC24203) {
                                        return null;
                                    }
                                    if (set.contains((C14022) ((C3319) c18959).m10937())) {
                                        return Boolean.TRUE;
                                    }
                                    return null;
                                }
                            }), Boolean.TRUE);
                        }
                        if (zEquals) {
                            set.add(c14022Mo13008);
                            z = true;
                        }
                    }
                }
            } while (z);
        }
        if (set.isEmpty()) {
            return;
        }
        C1170.removeIf(arrayList, new Predicate() { // from class: l.ܺۜۗ
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
                return set.contains(((C14419) obj).f45425.mo13008());
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m48231(HashMap map, C17467 c17467) {
        return (String) C11392.computeIfAbsent(map, c17467, new C0948(6));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48236(final C24927 c24927, List list) {
        List list2;
        final HashMap map = new HashMap(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final C14419 c14419 = (C14419) it.next();
            C3319 c3319 = c14419.f45424;
            final EnumC24203 enumC24203 = c3319.getType() == EnumC24203.SPUT ? EnumC24203.SGET : EnumC24203.IGET;
            c3319.mo14761(new Consumer() { // from class: l.᩻ۜۗ
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    C21133.m48235(enumC24203, c24927, map, c14419, (C18959) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C12312.$default$andThen(this, consumer);
                }
            });
        }
        if (map.isEmpty()) {
            list2 = Collections.EMPTY_LIST;
        } else {
            List<C17467> listM13226 = C4123.m13226(list, new C15911());
            ArrayList arrayList = new ArrayList();
            for (C17467 c17467 : listM13226) {
                int iIndexOf = arrayList.indexOf(c17467);
                List<C17467> list3 = (List) map.get(c17467);
                if (list3 == null) {
                    if (iIndexOf == -1) {
                        arrayList.add(c17467);
                    }
                } else if (iIndexOf == -1) {
                    for (C17467 c17468 : list3) {
                        if (!arrayList.contains(c17468)) {
                            arrayList.add(c17468);
                        }
                    }
                    arrayList.add(c17467);
                } else {
                    for (C17467 c17469 : list3) {
                        int iIndexOf2 = arrayList.indexOf(c17469);
                        if (iIndexOf2 == -1) {
                            arrayList.add(iIndexOf, c17469);
                        } else if (iIndexOf2 > iIndexOf) {
                            arrayList.remove(iIndexOf2);
                            arrayList.add(iIndexOf, c17469);
                        }
                    }
                }
            }
            list2 = arrayList;
        }
        List fields = c24927.getFields();
        C12884.sort(fields, C8627.thenComparing(C2661.comparingInt(new C3233()), new C20387(0, new HashMap())));
        if (list2.isEmpty() || Collections.indexOfSubList(fields, list2) != -1) {
            return;
        }
        fields.removeAll(list2);
        fields.addAll(list2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m48235(EnumC24203 enumC24203, C24927 c24927, HashMap map, C14419 c14419, C18959 c18959) {
        C17467 c17467M55538;
        if (c18959.getType() == enumC24203) {
            C14022 c14022 = (C14022) ((C3319) c18959).m10937();
            if (!c14022.m34148().equals(c24927.m55571()) || (c17467M55538 = c24927.m55538(c14022)) == null) {
                return;
            }
            ((List) C11392.computeIfAbsent(map, c14419.f45425, new C23371(0))).add(c17467M55538);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m48237(C18959 c18959, C18959 c189510) {
        if (c18959.mo4075(c189510)) {
            for (int i = 0; i < c18959.m44039(); i++) {
                AbstractC16481 abstractC16481Mo44035 = c18959.mo44035(i);
                AbstractC16481 abstractC16481Mo44036 = c189510.mo44035(i);
                abstractC16481Mo44035.getClass();
                EnumC1763 enumC1763 = EnumC1763.THIS;
                if (abstractC16481Mo44035.mo17865(enumC1763)) {
                    abstractC16481Mo44036.getClass();
                    if (abstractC16481Mo44036.mo17865(enumC1763)) {
                        continue;
                    }
                }
                if (abstractC16481Mo44035 instanceof C17227) {
                    abstractC16481Mo44036.getClass();
                    if (abstractC16481Mo44036 instanceof C17227) {
                        if (m48237(((C17227) abstractC16481Mo44035).m40461(), ((C17227) abstractC16481Mo44036).m40461())) {
                        }
                    }
                }
                if (abstractC16481Mo44035.equals(abstractC16481Mo44036)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48234(C2551 c2551, C17467 c17467, C3319 c3319) {
        C18959 c18959M40461;
        AbstractC16481 abstractC16481Mo44035 = c3319.mo44035(0);
        abstractC16481Mo44035.getClass();
        if (abstractC16481Mo44035 instanceof C17227) {
            c18959M40461 = ((C17227) abstractC16481Mo44035).m40461();
        } else {
            C18959 c18959 = new C18959(EnumC24203.ONE_ARG, 1);
            c18959.mo44014(abstractC16481Mo44035);
            c18959M40461 = c18959;
        }
        c17467.mo17864(new C12203(c2551, c18959M40461));
        if (c3319.m16977() != 0) {
            c17467.m16978(c3319.m16977());
        }
    }
}
