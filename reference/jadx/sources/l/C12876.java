package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۫ۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M6E4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12876 extends AbstractC16700 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f41209;

    @Override // l.AbstractC16700, l.InterfaceC13673
    public final String getName() {
        return "ProcessAnonymous";
    }

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo8439(C1610 c1610) {
        boolean zM17694 = c1610.m5681().m17694();
        this.f41209 = zM17694;
        if (zM17694) {
            C4937.forEach((ArrayList) c1610.m5680(), new C10638());
            final HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            for (C24927 c24927 : (ArrayList) c1610.m5680()) {
                C4000 c4000 = (C4000) c24927.mo17862((InterfaceC2157) C11457.f36004);
                if (c4000 != null) {
                    C24927 c24927M12936 = c4000.m12936();
                    List arrayList = (List) map2.get(c24927M12936);
                    if (arrayList == null || arrayList.isEmpty()) {
                        arrayList = new ArrayList(2);
                        map2.put(c24927M12936, arrayList);
                    }
                    arrayList.add(c24927);
                    C11392.putIfAbsent(map2, c24927, Collections.EMPTY_LIST);
                    map.put(c24927, c24927M12936);
                }
            }
            if (map.isEmpty()) {
                return;
            }
            final HashSet hashSet = new HashSet();
            C11392.forEach(map2, new BiConsumer() { // from class: l.᩸ۙ᩵
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    C12876.m31912(this.f72989, hashSet, map, (C24927) obj, (List) obj2);
                }

                public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return C23501.$default$andThen(this, biConsumer);
                }
            });
            Iterator it = ((ArrayList) c1610.m5680()).iterator();
            while (it.hasNext()) {
                List listM55560 = ((C24927) it.next()).m55560();
                if (listM55560.size() > 1) {
                    hashSet.clear();
                    hashSet.addAll(listM55560);
                    listM55560.clear();
                    listM55560.addAll(hashSet);
                    Collections.sort(listM55560);
                }
            }
        }
    }

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo22644(C24927 c24927) {
        if (!this.f41209 || !c24927.mo17865(EnumC1763.CLASS_UNLOADED)) {
            return false;
        }
        try {
            m31916(c24927);
        } catch (Exception | StackOverflowError e) {
            C23977.m53506(c24927, "Anonymous visitor error", e);
        }
        C4937.forEach(c24927.m55534(), new C21900(1, this));
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31913(C12876 c12876, C24927 c24927) {
        try {
            m31916(c24927);
        } catch (Exception | StackOverflowError e) {
            c24927.getClass();
            C23977.m53506(c24927, "Anonymous visitor error", e);
        }
        C4937.forEach(c24927.m55534(), new C21900(1, c12876));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m31917(C24927 c24927) {
        try {
            m31916(c24927);
        } catch (Exception | StackOverflowError e) {
            c24927.getClass();
            C23977.m53506(c24927, "Anonymous visitor error", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31912(C12876 c12876, HashSet hashSet, HashMap map, C24927 c24927, List list) {
        ArrayList arrayList;
        if (list.isEmpty()) {
            hashSet.clear();
            while (hashSet.add(c24927)) {
                C24927 c24928 = (C24927) map.get(c24927);
                if (c24928 == null) {
                    C24927 c24927M55556 = c24927.m55556();
                    if (hashSet.size() <= 2) {
                        return;
                    }
                    List listM55560 = c24927M55556.m55560();
                    if (listM55560.isEmpty()) {
                        arrayList = listM55560;
                        ArrayList arrayList2 = new ArrayList(hashSet.size());
                        c24927M55556.m55539(arrayList2);
                        arrayList = arrayList2;
                    }
                    arrayList = listM55560;
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((C24927) it.next()).m55556());
                    }
                    return;
                }
                c24927 = c24928;
            }
            c24927.m31138("Loop in anonymous inline: " + c24927 + ", path: " + hashSet);
            C4937.forEach(hashSet, new C15113());
        }
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0191 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x018f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:? A[LOOP:2: B:73:0x0165->B:129:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:? A[LOOP:3: B:76:0x0179->B:130:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x009c  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x0145 A[EDGE_INSN: B:63:0x0145->B:64:0x0146 BREAK  A[LOOP:0: B:51:0x0110->B:123:0x0110, LOOP_LABEL: LOOP:0: B:51:0x0110->B:123:0x0110]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0148  */
    /* JADX WARN: Code duplicated, block: B:66:0x014b  */
    /* JADX WARN: Code duplicated, block: B:75:0x016b  */
    /* JADX WARN: Code duplicated, block: B:78:0x017f  */
    /* JADX WARN: Code duplicated, block: B:80:0x018f  */
    /* JADX WARN: Code duplicated, block: B:96:0x01d8  */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m31916(C24927 c24927) {
        C24927 c24927M8536;
        Iterator it;
        EnumC24138 enumC24138;
        C17467 c17467;
        Iterator it2;
        C2551 c2551;
        boolean z;
        C17467 c17468;
        List listM40968;
        C24927 c24927M8537;
        boolean zM19005;
        if (!c24927.mo8547().m26528()) {
            String strM4971 = c24927.m55571().m4971();
            if (!strM4971.contains("$") && !Character.isDigit(strM4971.charAt(0))) {
                if (c24927.m55533().size() != 1 || c24927.m55555().size() != 1) {
                    return;
                }
                C2551 c2552 = (C2551) c24927.m55555().get(0);
                if (!c2552.mo8532().m49706() || !c2552.m8536().m55554()) {
                    return;
                }
            }
        }
        C2551 c2553 = (C2551) C6823.m19007(c24927.getMethods(), (Predicate) new C16541(1));
        if (c2553 == null) {
            return;
        }
        AbstractC1566 abstractC1566 = null;
        if (c2553.m8514().size() == 1) {
            C2551 c2554 = (C2551) c2553.m8514().get(0);
            c24927M8536 = c2554.m8536();
            if (c24927M8536.equals(c24927)) {
                if (c24927M8536.m55556().equals(c24927)) {
                    it = c24927.getFields().iterator();
                    loop2: while (true) {
                        if (it.hasNext()) {
                            c17467 = (C17467) it.next();
                            it2 = c17467.m40968().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (m31914(c17467.mo8547(), c24927, (C2551) it2.next())) {
                                        enumC24138 = null;
                                        break loop2;
                                    }
                                }
                            }
                        } else {
                            enumC24138 = EnumC24138.CONSTRUCTOR;
                            break;
                        }
                    }
                } else {
                    enumC24138 = null;
                    break loop2;
                }
            } else {
                c2551 = (C2551) c2553.m8514().get(0);
                if (!c2551.mo8532().m49706()) {
                    z = false;
                    break loop0;
                }
                listM40968 = c17468.m40968();
                if (listM40968.size() != 2) {
                    z = false;
                    break loop0;
                } else {
                    z = false;
                    break loop0;
                }
                if (z) {
                    enumC24138 = null;
                    break loop2;
                }
                enumC24138 = EnumC24138.INSTANCE_FIELD;
            }
        } else {
            List listM8514 = c2553.m8514();
            if (listM8514.isEmpty()) {
                zM19005 = false;
            } else {
                final C24927 c24927M8538 = ((C2551) listM8514.get(0)).m8536();
                zM19005 = C6823.m19005(listM8514, new Predicate() { // from class: l.ᩴۙ᩵
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
                        C2551 c2555 = (C2551) obj;
                        return c2555.m8529() && c2555.m8536().equals(c24927M8538);
                    }
                });
            }
            if (!zM19005) {
                enumC24138 = null;
                break loop2;
            }
            C2551 c2555 = (C2551) c2553.m8514().get(0);
            c24927M8536 = c2555.m8536();
            if (c24927M8536.equals(c24927)) {
                if (c24927M8536.m55556().equals(c24927) || !m31915(c24927, c2553, c2555)) {
                    enumC24138 = null;
                    break loop2;
                }
                it = c24927.getFields().iterator();
                loop2: while (true) {
                    if (it.hasNext()) {
                        c17467 = (C17467) it.next();
                        it2 = c17467.m40968().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (m31914(c17467.mo8547(), c24927, (C2551) it2.next())) {
                                    enumC24138 = null;
                                    break loop2;
                                }
                            }
                        }
                    } else {
                        enumC24138 = EnumC24138.CONSTRUCTOR;
                        break;
                    }
                }
            } else {
                c2551 = (C2551) c2553.m8514().get(0);
                if (!c2551.mo8532().m49706() && !c24927.m55555().isEmpty() && (c17468 = (C17467) C6823.m19007(c24927.getFields(), (Predicate) new C0980(2, c24927))) != null) {
                    listM40968 = c17468.m40968();
                    if (listM40968.size() != 2 || !listM40968.contains(c2551) || !listM40968.containsAll(c24927.m55555()) || !m31915(c24927, c2553, c2551)) {
                        z = false;
                        break loop0;
                    }
                    Iterator it3 = c24927.getFields().iterator();
                    loop0: while (true) {
                        if (!it3.hasNext()) {
                            c17468.mo17866(EnumC1763.INLINE_INSTANCE_FIELD);
                            z = true;
                            break;
                        }
                        C17467 c17469 = (C17467) it3.next();
                        if (c17469 != c17468) {
                            Iterator it4 = c17469.m40968().iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    continue;
                                } else if (m31914(c17469.mo8547(), c24927, (C2551) it4.next())) {
                                    z = false;
                                    break loop0;
                                }
                            }
                        }
                    }
                } else {
                    z = false;
                    break loop0;
                }
                if (z) {
                    enumC24138 = null;
                    break loop2;
                }
                enumC24138 = EnumC24138.INSTANCE_FIELD;
            }
        }
        if (enumC24138 == null) {
            return;
        }
        int size = c24927.m55564().size();
        if (size <= 1) {
            AbstractC1566 abstractC1566M55553 = c24927.m55553();
            if (abstractC1566M55553 == null || abstractC1566M55553.equals(AbstractC1566.f5426)) {
                if (size == 1) {
                    abstractC1566 = (AbstractC1566) c24927.m55564().get(0);
                } else {
                    abstractC1566 = AbstractC1566.f5426;
                }
            } else if (size == 0) {
                abstractC1566 = abstractC1566M55553;
            } else {
                AbstractC1566 abstractC1567 = (AbstractC1566) c24927.m55564().get(0);
                if (c24927.mo8527().m5691().m49227(abstractC1566M55553.mo5570()).contains(abstractC1567.mo5570())) {
                    abstractC1566 = abstractC1566M55553;
                } else if (c24927.mo8527().m5681().m17693() && abstractC1566M55553.mo5570().equals("kotlin.jvm.internal.Lambda")) {
                    abstractC1566 = abstractC1567;
                }
            }
        }
        if (abstractC1566 == null) {
            return;
        }
        if (enumC24138 == EnumC24138.INSTANCE_FIELD) {
            c24927M8537 = ((C2551) c24927.m55555().get(0)).m8536();
        } else {
            c24927M8537 = ((C2551) c2553.m8514().get(0)).m8536();
        }
        c24927M8537.m55577(c24927);
        c24927.mo17864(new C4000(c24927M8537, abstractC1566, enumC24138));
        c24927.mo17866(EnumC1763.DONT_GENERATE);
        c2553.mo17866(EnumC1763.ANONYMOUS_CONSTRUCTOR);
        C24927 c24927M55556 = c24927M8537.m55556();
        c24927.m55581(c24927M55556);
        List listM55533 = c24927M8537.m55533();
        if (listM55533 != null && !listM55533.isEmpty()) {
            listM55533.remove(c24927);
        }
        if (c24927.m55579()) {
            c24927M55556.m55581(c24927);
            c24927M55556.m55546(c24927);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m31915(C24927 c24927, C2551 c2551, C2551 c2552) {
        for (C2551 c2553 : c24927.getMethods()) {
            if (c2553 != c2551) {
                for (C2551 c2554 : c2553.m8514()) {
                    if (!c2554.equals(c2552) && m31914(c2553.mo8547(), c24927, c2554)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m31914(C10293 c10293, C24927 c24927, C2551 c2551) {
        C24927 c24927M8536 = c2551.m8536();
        if (c24927M8536.equals(c24927)) {
            return false;
        }
        if (c10293.m26528()) {
            return !c24927M8536.m55574().equals(c24927);
        }
        return true;
    }
}
