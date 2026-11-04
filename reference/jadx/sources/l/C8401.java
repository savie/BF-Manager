package l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۠ۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A6I0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8401 {
    static {
        C16980.m40037(C8401.class);
    }

    /* JADX WARN: Code duplicated, block: B:204:0x06bb  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m22578(final C2551 c2551) {
        int i;
        C11457 c11457;
        List list;
        boolean z;
        List listM49646;
        C21943 c21943;
        C21943 c21943M56580;
        C21943 c21943M52158;
        boolean z2;
        C10733 c10733;
        if (c2551.m8560()) {
            return false;
        }
        int i2 = C15616.f50739;
        int i3 = 1;
        C4937.forEach(c2551.m8508(), new C8035(i3));
        C17108.m40273(c2551);
        m22579(c2551);
        List listM8508 = c2551.m8508();
        int size = listM8508.size();
        int i4 = 0;
        while (true) {
            i = 2;
            c11457 = C11457.f36036;
            if (i4 >= size) {
                break;
            }
            C21943 c21944 = (C21943) listM8508.get(i4);
            C18959 c18959M52186 = C23231.m52186(c21944);
            if (c18959M52186 != null && (c10733 = (C10733) c18959M52186.mo17862((InterfaceC2157) c11457)) != null) {
                c18959M52186.m39419(c11457);
                C11457 c11458 = C11457.f36014;
                C8057 c8057 = (C8057) c21944.mo17862((InterfaceC2157) c11458);
                if (c8057 != null) {
                    C25314.m56586(c8057.m21946(), c21944);
                    c21944.m39419(c11458);
                }
                C19684 c19684M27337 = c10733.m27337();
                if (c21944.m49643().isEmpty()) {
                    c19684M27337.m45374(c21944);
                    c21944.mo17864(c10733);
                    c19684M27337.m45363(c21944);
                    C4937.forEach(C23231.m52198(c2551, c21944, c21944), new C23567(i, c19684M27337));
                } else {
                    C21943 c21943M56577 = C25314.m56577(c2551, c21944.m49654());
                    c21943M56577.mo17866(EnumC1763.SYNTHETIC);
                    c21943M56577.mo17864(c10733);
                    C25314.m56582(c21943M56577, c21944);
                    c19684M27337.m45374(c21943M56577);
                    c19684M27337.m45363(c21943M56577);
                }
                C19684 c19684M27338 = c10733.m27337();
                AbstractC1566 abstractC1566M45373 = c19684M27338.m45373();
                C18959 c18959M52200 = C23231.m52200((InterfaceC23435) c21944);
                if (c18959M52200 == null || c18959M52200.getType() != EnumC24203.MOVE_EXCEPTION) {
                    c19684M27338.m45362(new C20211(abstractC1566M45373, "unused"));
                } else {
                    C6041 c6041 = new C6041(c18959M52200.m44027().m17532(), abstractC1566M45373);
                    c6041.m39414((AbstractC16678) c18959M52200);
                    c18959M52200.m44031(c6041);
                    c18959M52200.mo17866(EnumC1763.DONT_INLINE);
                    c6041.mo17866(EnumC1763.CUSTOM_DECLARE);
                    c19684M27338.m45362(c6041);
                    c18959M52200.mo17864(c10733);
                }
            }
            i4++;
        }
        boolean zM22407 = C8314.m22407(c2551);
        InterfaceC2157 interfaceC2157 = C11457.f36015;
        if (zM22407) {
            List listM8509 = c2551.m8508();
            IdentityHashMap identityHashMap = new IdentityHashMap();
            C4937.forEach(listM8509, new C16853(identityHashMap, c2551, i3));
            do {
                z2 = false;
                for (int size2 = listM8509.size() - 1; size2 >= 0; size2--) {
                    C21943 c21945 = (C21943) listM8509.get(size2);
                    BitSet bitSet = new BitSet(c2551.m8518());
                    Iterator it = c21945.m49646().iterator();
                    while (it.hasNext()) {
                        bitSet.or((BitSet) identityHashMap.get((C21943) it.next()));
                    }
                    ArrayList arrayList = (ArrayList) c21945.mo1986();
                    for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                        C18959 c18959 = (C18959) arrayList.get(size3);
                        if (c18959.m44027() != null) {
                            bitSet.clear(c18959.m44027().m17532());
                        }
                        for (AbstractC16481 abstractC16481 : c18959.m44026()) {
                            abstractC16481.getClass();
                            if (abstractC16481 instanceof C6041) {
                                bitSet.set(((C6041) abstractC16481).m17532());
                            }
                        }
                        C21922 c21922 = (C21922) c18959.mo17862(interfaceC2157);
                        if (c21922 != null) {
                            Iterator it2 = ((ArrayList) c21922.m49617()).iterator();
                            while (it2.hasNext()) {
                                bitSet.or((BitSet) identityHashMap.get(((C19684) it2.next()).m45368()));
                            }
                        }
                    }
                    if (!bitSet.equals(identityHashMap.get(c21945))) {
                        identityHashMap.put(c21945, bitSet);
                        z2 = true;
                    }
                }
            } while (z2);
            for (C21943 c21946 : new ArrayList(c2551.m8508())) {
                BitSet bitSet2 = new BitSet(c2551.m8518());
                Iterator it3 = ((ArrayList) c21946.mo1986()).iterator();
                while (it3.hasNext()) {
                    C21922 c21923 = (C21922) ((C18959) it3.next()).mo17862(interfaceC2157);
                    if (c21923 != null) {
                        Iterator it4 = ((ArrayList) c21923.m49617()).iterator();
                        while (it4.hasNext()) {
                            bitSet2.or((BitSet) identityHashMap.get(((C19684) it4.next()).m45368()));
                        }
                    }
                }
                int i5 = 0;
                while (i5 < ((ArrayList) c21946.mo1986()).size() - 1) {
                    C6041 c6041M44027 = ((C18959) ((ArrayList) c21946.mo1986()).get(i5)).m44027();
                    if (c6041M44027 != null && bitSet2.get(c6041M44027.m17532())) {
                        int i6 = i5 + 1;
                        ArrayList arrayList2 = (ArrayList) c21946.mo1986();
                        C21943 c21943M56578 = C25314.m56577(c2551, ((C18959) arrayList2.get(i6)).getOffset());
                        c21943M56578.m39414((AbstractC16678) c21946);
                        c21943M56578.m39419(c11457);
                        ((ArrayList) c21943M56578.mo1986()).addAll(arrayList2.subList(i6, arrayList2.size()));
                        arrayList2.subList(i6, arrayList2.size()).clear();
                        for (C21943 c21947 : new ArrayList(c21946.m49646())) {
                            C25314.m56586(c21946, c21947);
                            C25314.m56582(c21943M56578, c21947);
                        }
                        C25314.m56582(c21946, c21943M56578);
                        i5 = -1;
                        c21946 = c21943M56578;
                    }
                    i5++;
                }
            }
            for (C21943 c21948 : c2551.m8508()) {
                c21948.m39419(interfaceC2157);
                c21948.m39418(EnumC1763.TRY_ENTER);
                c21948.m39418(EnumC1763.TRY_LEAVE);
            }
            m22579(c2551);
            for (C21943 c21949 : new ArrayList(c2551.m8508())) {
                C21922 c21924 = (C21922) c21949.mo17862(interfaceC2157);
                if (c21924 != null) {
                    C21943 c21943M56581 = C25314.m56580(c21949, c2551);
                    c21943M56581.mo17866(EnumC1763.SYNTHETIC);
                    c21943M56581.mo17866(EnumC1763.EXC_TOP_SPLITTER);
                    c21943M56581.mo17864(new C14768(c21949));
                    Iterator it5 = ((ArrayList) c21924.m49617()).iterator();
                    while (it5.hasNext()) {
                        C25314.m56582(c21943M56581, ((C19684) it5.next()).m45368());
                    }
                }
            }
            C4937.forEach(c2551.m8508(), new C8035(i3));
            C18293 c18293 = new C18293(c2551);
            C23231.m52170(c2551, new C13498(i3, c18293));
            m22575(c2551, Collections.EMPTY_LIST, c18293);
            return true;
        }
        HashMap map = new HashMap();
        for (C21943 c219410 : c2551.m8508()) {
            C21922 c21925 = (C21922) c219410.mo17862(interfaceC2157);
            if (c21925 != null) {
                Iterator it6 = ((ArrayList) c21925.m49617()).iterator();
                while (it6.hasNext()) {
                    ((List) C11392.computeIfAbsent(map, (C19684) it6.next(), new C19705(6))).add(c219410);
                }
            }
        }
        if (map.isEmpty()) {
            C4937.forEach(c2551.m8530(), new Consumer() { // from class: l.ۡۙ᩵
                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C12312.$default$andThen(this, consumer);
                }

                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    C19684 c19684 = (C19684) obj;
                    c19684.m45371();
                    C25314.m56586(c2551.m8535(), c19684.m45368());
                }
            });
        } else {
            C11392.forEach(map, new BiConsumer() { // from class: l.ۖۙ᩵
                public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return C23501.$default$andThen(this, biConsumer);
                }

                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    C19684 c19684 = (C19684) obj;
                    if (((List) obj2).isEmpty()) {
                        c19684.m45371();
                        C25314.m56586(c2551.m8535(), c19684.m45368());
                    }
                }
            });
        }
        C25314.m56587(c2551);
        c2551.m8513();
        int i7 = 3;
        if (c2551.m8560()) {
            list = Collections.EMPTY_LIST;
        } else {
            C11392.forEach(map, new C19611(i3));
            final ArrayList<C12971> arrayList3 = new ArrayList();
            C11392.forEach(map, new BiConsumer() { // from class: l.᩶ۙ᩵
                public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return C23501.$default$andThen(this, biConsumer);
                }

                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add((C19684) obj);
                    ArrayList arrayList5 = arrayList3;
                    arrayList5.add(new C12971(arrayList5.size(), arrayList4, (List) obj2));
                }
            });
            if (arrayList3.size() > 1) {
                loop27: while (true) {
                    Iterator it7 = arrayList3.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            break loop27;
                        }
                        final C12971 c12971 = (C12971) it7.next();
                        for (C12971 c12972 : arrayList3) {
                            if (c12971 != c12972 && c12972.m32383() == null) {
                                if (c12971.m32368().equals(c12972.m32368())) {
                                    arrayList3.add(new C12971(arrayList3.size(), C6544.m18427(c12971.m32377(), c12972.m32377()), c12971.m32368()));
                                    arrayList3.remove(c12971);
                                    arrayList3.remove(c12972);
                                    break;
                                }
                                Set set = (Set) C1170.stream(c12972.m32377()).flatMap(new C20957(i7)).collect(C2025.toSet());
                                boolean zAnyMatch = C1170.stream(set).anyMatch(new Predicate() { // from class: l.ۢۙ᩵
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
                                        C21922 c21926 = (C21922) ((C21943) obj).mo17862((InterfaceC2157) C11457.f36015);
                                        return c21926 != null && c21926.m49617().equals(c12971.m32377());
                                    }
                                });
                                boolean zAnyMatch2 = C1170.stream(c12972.m32368()).anyMatch(new Predicate() { // from class: l.ۢۙ᩵
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
                                        C21922 c21926 = (C21922) ((C21943) obj).mo17862((InterfaceC2157) C11457.f36015);
                                        return c21926 != null && c21926.m49617().equals(c12971.m32377());
                                    }
                                });
                                boolean zAnyMatch3 = C1170.stream(c12971.m32368()).anyMatch(new C19355(i3, set));
                                if (!zAnyMatch || (!zAnyMatch2 && !zAnyMatch3)) {
                                    if (new HashSet(c12972.m32377()).containsAll(c12971.m32377())) {
                                        arrayList3.add(new C12971(arrayList3.size(), C6544.m18427(c12971.m32377(), c12972.m32377()), C6544.m18427(c12971.m32368(), c12972.m32368())));
                                        arrayList3.remove(c12971);
                                        arrayList3.remove(c12972);
                                        break;
                                    }
                                } else {
                                    List listM18427 = C6544.m18427(c12971.m32368(), c12972.m32368());
                                    c12972.m32377().removeAll(c12971.m32377());
                                    c12972.m32381(c12971);
                                    c12971.m32371(c12972);
                                    c12971.m32370(listM18427);
                                }
                            }
                        }
                    }
                }
            }
            boolean z3 = false;
            for (C12971 c12973 : arrayList3) {
                if (c12973.m32377().size() >= 2) {
                    Iterator it8 = c12973.m32377().iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            int i8 = 5;
                            List listM19000 = C6823.m19000((Collection) c12973.m32377(), (Function) new C6360(i8));
                            List list2 = (List) C1170.stream(listM19000).flatMap(new C18964(i8)).distinct().collect(C2025.toList());
                            if (list2.size() != 1) {
                                break;
                            }
                            List listM49643 = ((C21943) list2.get(0)).m49643();
                            if ((listM49643.size() != listM19000.size() ? false : listM49643.containsAll(listM19000)) && ((List) C1170.stream(c12973.m32377()).map(new C9587(i8)).distinct().collect(C2025.toList())).size() == 1) {
                                final C19684 c19684 = (C19684) c12973.m32377().get(0);
                                C1170.removeIf(c12973.m32377(), new Predicate() { // from class: l.ܿۙ᩵
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
                                        C19684 c19685 = (C19684) obj;
                                        C19684 c19686 = c19684;
                                        if (c19685 == c19686) {
                                            return false;
                                        }
                                        ArrayList arrayListM45372 = c19685.m45372();
                                        c19686.getClass();
                                        Iterator it9 = arrayListM45372.iterator();
                                        while (it9.hasNext()) {
                                            c19686.m45359(c2551, (C1345) it9.next());
                                        }
                                        c19685.m45371();
                                        return true;
                                    }
                                });
                                z = true;
                                break;
                            }
                        } else {
                            C19684 c19685 = (C19684) it8.next();
                            if (c19685.m45365().size() == 1) {
                                C21943 c21943M45368 = c19685.m45368();
                                if (((ArrayList) c21943M45368.mo1986()).size() != 1 || !C23231.m52184((InterfaceC23435) c21943M45368, EnumC24203.MOVE_EXCEPTION)) {
                                }
                            }
                        }
                        z = false;
                        break;
                    }
                }
                z = false;
                break;
                if (z) {
                    z3 = true;
                }
            }
            if (z3) {
                C25314.m56587(c2551);
                c2551.m8513();
            }
            C4937.forEach(arrayList3, new C0198());
            C1170.removeIf(arrayList3, new C18297(i7));
            c2551.m8513();
            C25314.m56587(c2551);
            final Comparator comparatorM23405 = c2551.mo8527().m5687().m23405();
            for (final C12971 c12974 : arrayList3) {
                Iterator it9 = c12974.m32377().iterator();
                while (it9.hasNext()) {
                    C12884.sort(((C19684) it9.next()).m45372(), new Comparator() { // from class: l.۟ۙ᩵
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            C1345 c1345 = (C1345) obj;
                            C1345 c1346 = (C1345) obj2;
                            int iCompare = comparatorM23405.compare(c1345.getType(), c1346.getType());
                            return iCompare == -2 ? c1345.compareTo(c1346) : iCompare;
                        }
                    });
                }
                C12884.sort(c12974.m32377(), new Comparator() { // from class: l.ᩳۙ᩵
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        C19684 c19686 = (C19684) obj;
                        C19684 c19687 = (C19684) obj2;
                        if (c19686.equals(c19687)) {
                            throw new C8597("Same handlers in try block: " + c12974);
                        }
                        if (c19686.m45366()) {
                            return 1;
                        }
                        if (c19687.m45366()) {
                            return -1;
                        }
                        C1345 c1345 = (C1345) c19686.m45372().get(0);
                        C1345 c1346 = (C1345) c19687.m45372().get(0);
                        int iCompare = comparatorM23405.compare(c1345.getType(), c1346.getType());
                        return iCompare == -2 ? c1345.compareTo(c1346) : iCompare;
                    }
                });
            }
            list = arrayList3;
        }
        if (!list.isEmpty()) {
            int size4 = list.size() * 3;
            ArrayDeque arrayDeque = new ArrayDeque(list);
            int i9 = 0;
            while (!arrayDeque.isEmpty()) {
                C12971 c12975 = (C12971) arrayDeque.removeFirst();
                List<C21943> listM32368 = c12975.m32368();
                C21943 c21943M52201 = C23231.m52201(listM32368);
                if (c21943M52201 == null) {
                    int i10 = 0;
                    BitSet bitSetM52197 = C23231.m52197(c2551);
                    bitSetM52197.set(0, c2551.m8508().size());
                    C4937.forEach(listM32368, new C16517(i10, bitSetM52197));
                    BitSet bitSetM52198 = C23231.m52197(c2551);
                    bitSetM52198.or(bitSetM52197);
                    C23231.m52169(c2551, bitSetM52197, new C17263(i10, bitSetM52198));
                    C21943 c21943M52202 = C23231.m52202(c2551, bitSetM52198);
                    if (c21943M52202 == null) {
                        throw new C8597("Failed to find top block for try-catch from: " + listM32368);
                    }
                    if (c21943M52202.m49646().size() == i3) {
                        c21943M52201 = (C21943) c21943M52202.m49646().get(0);
                        if (!listM32368.contains(c21943M52201)) {
                            if (c21943M52202.m49646().size() == i3 || c21943M52202.mo17867(interfaceC2157)) {
                                c21943M52201 = c21943M52202;
                            } else {
                                listM49646 = c21943M52202.m49646();
                                c21943M52201 = (C21943) listM49646.get(0);
                            }
                        }
                    } else {
                        if (c21943M52202.m49646().size() == i3) {
                        }
                        c21943M52201 = c21943M52202;
                    }
                } else if (c21943M52201.m49646().size() == i3 && !c21943M52201.mo17867(interfaceC2157)) {
                    listM49646 = c21943M52201.m49646();
                    c21943M52201 = (C21943) listM49646.get(0);
                }
                if (!c21943M52201.m49643().isEmpty() || c21943M52201 == c2551.m8535()) {
                    C21943 c21943M52159 = C23231.m52159(listM32368, false);
                    if (c21943M52159 == null) {
                        c21943M52159 = C23231.m52161(c2551, listM32368);
                        if (c21943M52159 == null) {
                            c21943M52159 = null;
                        } else {
                            ArrayList arrayList4 = new ArrayList(c21943M52159.m49643());
                            arrayList4.removeAll(listM32368);
                            List list3 = (List) C1170.stream(arrayList4).filter(new C18009(i, listM32368)).collect(C2025.toList());
                            if (!list3.isEmpty() && list3.size() != c21943M52159.m49643().size()) {
                                C21943 c21943M56582 = C25314.m56580(c21943M52159, c2551);
                                c21943M56582.mo17866(EnumC1763.SYNTHETIC);
                                c21943M56582.mo17864(new C8474(c21943M52159));
                                Iterator it10 = list3.iterator();
                                while (it10.hasNext()) {
                                    C25314.m56583((C21943) it10.next(), c21943M56582, c21943M52159);
                                }
                                c21943M52159 = c21943M56582;
                            }
                        }
                    }
                    if (c21943M52159 == null || !c21943M52159.mo17865(EnumC1763.RETURN)) {
                        c21943 = null;
                    } else {
                        C21943 c21943M56583 = C25314.m56580(c21943M52159, c2551);
                        c21943M56583.mo17866(EnumC1763.SYNTHETIC);
                        C21943 c219411 = c21943M52159;
                        c21943M52159 = c21943M56583;
                        c21943 = c219411;
                    }
                    if (c21943M52201 == c2551.m8535()) {
                        c21943M56580 = C25314.m56580((C21943) c2551.m8535().m49646().get(0), c2551);
                    } else {
                        List listM49644 = c21943M52201.m49643();
                        EnumC1763 enumC1763 = EnumC1763.EXC_TOP_SPLITTER;
                        C21943 c21943M521510 = C23231.m52158(listM49644, enumC1763);
                        c21943M56580 = (c21943M521510 == null && !(c21943M52201.m49639().size() == i3 && ((ArrayList) c21943M52201.mo1986()).isEmpty() && (c21943M521510 = C23231.m52158(c21943M52201.m49639(), enumC1763)) != null && c21943M521510.m49643().size() == i3)) ? C25314.m56580(c21943M52201, c2551) : c21943M521510;
                    }
                    c21943M56580.mo17866(EnumC1763.EXC_TOP_SPLITTER);
                    EnumC1763 enumC1764 = EnumC1763.SYNTHETIC;
                    c21943M56580.mo17866(enumC1764);
                    int iSum = C1170.stream(c12975.m32377()).mapToInt(new C0944()).sum();
                    if (c21943M52159 != null && iSum != 0) {
                        List listM49647 = c21943M52159.m49646();
                        EnumC1763 enumC1765 = EnumC1763.EXC_BOTTOM_SPLITTER;
                        c21943M52158 = C23231.m52158(listM49647, enumC1765);
                        if (c21943M52158 == null) {
                            c21943M52158 = C25314.m56577(c2551, -1);
                        }
                        c21943M52158.mo17866(enumC1765);
                        c21943M52158.mo17866(enumC1764);
                        C25314.m56582(c21943M52159, c21943M52158);
                        if (c21943 != null) {
                            C18293 c18293M42620 = C18293.m42620(c2551, c21943M52159.m49643());
                            for (C19684 c19686 : c12975.m32377()) {
                                Iterator it11 = c19686.m45365().iterator();
                                while (it11.hasNext()) {
                                    if (c18293M42620.m42625((C21943) it11.next())) {
                                        C21943 c21943M42626 = c18293M42620.m42621(c19686.m45365()).m42626();
                                        if (c21943M42626 == null) {
                                            break;
                                        }
                                        C25314.m56583(c21943M42626, c21943M52159, c21943);
                                        break;
                                    }
                                }
                            }
                        }
                    } else {
                        c21943M52158 = null;
                    }
                    m22577(c12975, c21943M56580, c21943M52158);
                    if (c21943M52159 != null) {
                        C11457 c11459 = C11457.f36022;
                        if (c21943M52159.mo17867(c11459)) {
                            ArrayList arrayList5 = new ArrayList();
                            for (C21943 c219412 : c21943M52159.m49643()) {
                                if (C23231.m52205(c21943M52159, c219412)) {
                                    arrayList5.add(c219412);
                                }
                            }
                            Iterator it12 = arrayList5.iterator();
                            while (it12.hasNext()) {
                                C25314.m56583((C21943) it12.next(), c21943M52159, ((C8474) c21943M52159.mo17862((InterfaceC2157) c11459)).m22791());
                            }
                        }
                    }
                    for (C21943 c219413 : listM32368) {
                        C12971 c12976 = (C12971) c219413.mo17862((InterfaceC2157) C11457.f36033);
                        if (c12976 == null || c12976.m32374().contains(c12975)) {
                            c219413.mo17864(c12975);
                        }
                    }
                    c12975.m32382(c21943M56580);
                    c21943M56580.m49653();
                    if (c21943M52158 != null) {
                        c21943M52158.m49653();
                    }
                } else {
                    arrayDeque.addLast(c12975);
                }
                int i11 = i9 + 1;
                if (i9 > size4) {
                    throw new C8597("Try blocks wrapping queue limit reached! Please report as an issue!");
                }
                i = 2;
                i9 = i11;
                i3 = 1;
            }
        }
        c2551.m39413(C11457.f36027, list);
        C4937.forEach(c2551.m8508(), new C8035(1));
        Iterator it13 = c2551.m8530().iterator();
        while (it13.hasNext()) {
            for (C21943 c219414 : ((C19684) it13.next()).m45365()) {
                C9804 c9804 = new C9804(c219414, c2551);
                for (C18959 c189510 : (ArrayList) c219414.mo1986()) {
                    if (c189510.getType() == EnumC24203.MONITOR_ENTER) {
                        break;
                    }
                    if (c189510.getType() == EnumC24203.MONITOR_EXIT) {
                        c9804.m25544(c189510);
                    }
                }
                c9804.m25543();
            }
        }
        C15616.m37359(c2551);
        C18293 c18294 = new C18293(c2551);
        C23231.m52170(c2551, new C13498(1, c18294));
        m22575(c2551, list, c18294);
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m22579(C2551 c2551) {
        C11457 c11457;
        Iterator it = c2551.m8508().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c11457 = C11457.f36015;
            if (!zHasNext) {
                break;
            }
            for (C18959 c18959 : (ArrayList) ((C21943) it.next()).mo1986()) {
                if (c18959.mo17867(c11457) && !c18959.m44022()) {
                    c18959.m39419(c11457);
                }
            }
        }
        for (C21943 c21943 : c2551.m8508()) {
            Iterator it2 = ((ArrayList) c21943.mo1986()).iterator();
            C21922 c21922 = null;
            C21922 c21923 = null;
            while (true) {
                if (!it2.hasNext()) {
                    c21922 = c21923;
                    break;
                }
                C21922 c21924 = (C21922) ((C18959) it2.next()).mo17862((InterfaceC2157) c11457);
                if (c21924 != null) {
                    if (c21923 != null) {
                        if (!c21923.equals(c21924)) {
                            break;
                        }
                    } else {
                        c21923 = c21924;
                    }
                }
            }
            if (c21922 != null) {
                c21943.mo17864(c21922);
                for (C18959 c189510 : (ArrayList) c21943.mo1986()) {
                    EnumC1763 enumC1763 = EnumC1763.TRY_ENTER;
                    if (c189510.mo17865(enumC1763)) {
                        c21943.mo17866(enumC1763);
                    }
                    EnumC1763 enumC1764 = EnumC1763.TRY_LEAVE;
                    if (c189510.mo17865(enumC1764)) {
                        c21943.mo17866(enumC1764);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22577(C12971 c12971, C21943 c21943, C21943 c21944) {
        Iterator it = c12971.m32377().iterator();
        while (it.hasNext()) {
            C21943 c21943M45368 = ((C19684) it.next()).m45368();
            C25314.m56582(c21943, c21943M45368);
            if (c21944 != null) {
                C25314.m56582(c21944, c21943M45368);
            }
        }
        C12971 c12971M32383 = c12971.m32383();
        if (c12971M32383 != null) {
            m22577(c12971M32383, c21943, c21944);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22575(C2551 c2551, List list, C18293 c18293) {
        for (C19684 c19684 : c2551.m8530()) {
            C21943 c21943M45368 = c19684.m45368();
            if (c21943M45368 != null && !c18293.m42625(c21943M45368)) {
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        C15616.m37356(c21943M45368, c2551);
                        break;
                    }
                } while (!((C12971) it.next()).m32377().contains(c19684));
            }
        }
    }
}
