package l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܳ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6FB */
/* JADX INFO: loaded from: classes5.dex */
public final class C15616 extends AbstractC16700 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f50739 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f50740 = C16980.m40037(C15616.class);

    /* JADX WARN: Code duplicated, block: B:117:0x0268 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x026a  */
    /* JADX WARN: Code duplicated, block: B:120:0x027f  */
    /* JADX WARN: Code duplicated, block: B:123:0x028f  */
    /* JADX WARN: Code duplicated, block: B:126:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:128:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:130:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:131:0x02b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:132:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:134:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:136:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:139:0x0305  */
    /* JADX WARN: Code duplicated, block: B:145:0x0317  */
    /* JADX WARN: Code duplicated, block: B:147:0x0325  */
    /* JADX WARN: Code duplicated, block: B:148:0x0327  */
    /* JADX WARN: Code duplicated, block: B:252:0x0585  */
    /* JADX WARN: Code duplicated, block: B:266:0x05c8 A[LOOP:28: B:264:0x05c2->B:266:0x05c8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:273:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:279:0x0619 A[LOOP:30: B:277:0x0613->B:279:0x0619, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:282:0x063d  */
    /* JADX WARN: Code duplicated, block: B:384:0x00ec A[EDGE_INSN: B:384:0x00ec->B:57:0x00ec BREAK  A[LOOP:2: B:31:0x0087->B:59:0x0148], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:389:0x008c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:417:0x029d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:419:0x0289 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:422:0x030d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:424:0x02ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:461:0x05de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:466:0x058f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:470:0x05e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:473:0x04d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:487:0x05ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:488:0x05fd A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:134:0x02c0, please report this as an issue */
    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo1737(final C2551 c2551) {
        int i;
        C11457 c11457;
        boolean z;
        C18959 c18959;
        boolean z2;
        List<C21943> listM49643;
        final C18959 c18959M52200;
        final HashMap map;
        final HashSet hashSet;
        boolean z3;
        C21943 c21943M56577;
        Iterator it;
        C10733 c10733;
        C18959 c18959M52201;
        boolean z4;
        List listM49644;
        int size;
        List listMo17861;
        int size2;
        C11785 c11785;
        C21943 c21943M29613;
        List listM49645;
        boolean z5;
        C21943 c21943M29616;
        List listM49646;
        int size3;
        C21943 c21943M56578;
        C21943 c21943M29614;
        boolean z6;
        EnumC1763 enumC1763;
        C21943 c21943M29615;
        boolean z7;
        boolean z8;
        boolean z9;
        C18959 c18959M52202;
        if (c2551.m8524() || c2551.m8508().isEmpty()) {
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = c2551.m8508().iterator();
        while (it2.hasNext()) {
            m37349(linkedHashSet, (C21943) it2.next(), c2551);
        }
        m37348(linkedHashSet, c2551);
        m37355(c2551);
        List listM8508 = c2551.m8508();
        Iterator it3 = listM8508.iterator();
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            boolean zHasNext = it3.hasNext();
            i = 1;
            c11457 = C11457.f36036;
            if (!zHasNext) {
                break;
            }
            C21943 c21943 = (C21943) it3.next();
            if (c21943.mo17865(EnumC1763.LOOP_START) || c21943.mo17865(EnumC1763.LOOP_END)) {
                List listM49647 = c21943.m49643();
                if (listM49647.size() > 1 && ((c18959M52202 = C23231.m52200((InterfaceC23435) c21943)) == null || c18959M52202.getType() != EnumC24203.IF)) {
                    C18959 c18959M52186 = C23231.m52186(c21943);
                    if (c18959M52186 == null || !c18959M52186.mo17867(c11457)) {
                        int i2 = 0;
                        while (true) {
                            Iterator it4 = listM49647.iterator();
                            C18959 c189510 = null;
                            while (it4.hasNext()) {
                                ArrayList arrayList = (ArrayList) ((C21943) it4.next()).mo1986();
                                int size4 = arrayList.size();
                                C18959 c189511 = size4 <= i2 ? null : (C18959) arrayList.get((size4 - i2) - 1);
                                if (c189511 == null) {
                                    break;
                                }
                                if (c189510 == null) {
                                    c189510 = c189511;
                                } else if (c189510 == c189511) {
                                    if (c189510.m44034()) {
                                        break;
                                        break;
                                    }
                                } else {
                                    if (!c189510.mo4075(c189511) || !m37353(c189510.m44027(), c189511.m44027())) {
                                        break;
                                    }
                                    int iM44039 = c189510.m44039();
                                    for (int i3 = 0; i3 < iM44039; i3++) {
                                        if (!m37353(c189510.mo44035(i3), c189511.mo44035(i3))) {
                                            break;
                                        }
                                    }
                                    if (c189510.m44034()) {
                                        break;
                                    }
                                }
                            }
                            i2++;
                        }
                        if (i2 > 0) {
                            ArrayList arrayList2 = (ArrayList) ((C21943) listM49647.get(0)).mo1986();
                            int size5 = arrayList2.size();
                            List listSubList = arrayList2.subList(size5 - i2, size5);
                            ArrayList arrayList3 = (ArrayList) c21943.mo1986();
                            ArrayList arrayList4 = new ArrayList(arrayList3.size() + listSubList.size());
                            arrayList4.addAll(listSubList);
                            arrayList4.addAll(arrayList3);
                            arrayList3.clear();
                            arrayList3.addAll(arrayList4);
                            C4937.forEach(listM49647, new C11300(i2, 1));
                            c2551.m31133("Move duplicate insns, count: " + i2 + " to block " + c21943);
                            z11 = true;
                        }
                    }
                }
            }
        }
        if (C8401.m22578(c2551)) {
            z11 = true;
        }
        Iterator it5 = listM8508.iterator();
        while (it5.hasNext()) {
            if (C25314.m56590((C21943) it5.next())) {
                z11 = true;
            }
        }
        int i4 = C25314.f81771;
        if (C1170.removeIf(c2551.m8508(), new C23326(3))) {
            z11 = true;
        }
        if (z11) {
            m37357(c2551);
            m37355(c2551);
        }
        if (C23822.m53156(c2551)) {
            m37355(c2551);
        }
        C4937.forEach(c2551.m8508(), new C8035(i));
        int size6 = c2551.m8508().size();
        int iMax = Math.max(200, size6);
        int i5 = 0;
        while (true) {
            Iterator it6 = c2551.m8508().iterator();
            while (true) {
                if (!it6.hasNext()) {
                    if (c2551.m8534()) {
                        z = false;
                    } else {
                        boolean z12 = false;
                        for (C21943 c21944 : new ArrayList(c2551.m8489())) {
                            C21943 c21945 = (C21943) C4123.m13219(c21944.m49643());
                            if (c21945 != null && (c18959 = (C18959) C4123.m13219(c21945.mo1986())) != null && c18959.m44025()) {
                                C6041 c6041M44027 = c18959.m44027();
                                C18959 c18959M52203 = C23231.m52200((InterfaceC23435) c21944);
                                if (c18959M52203 != null && c18959M52203.getType() == EnumC24203.RETURN && c6041M44027.m17527(c18959M52203.mo44035(0))) {
                                    ((ArrayList) c21945.mo1986()).addAll(c21944.mo1986());
                                    c21945.m39414((AbstractC16678) c21944);
                                    C25314.m56586(c21945, c21944);
                                    ((ArrayList) c21944.mo1986()).clear();
                                    c21944.mo17866(EnumC1763.REMOVE);
                                    C21943 c21943M8491 = c2551.m8491();
                                    C25314.m56586(c21944, c21943M8491);
                                    C25314.m56582(c21945, c21943M8491);
                                    c21945.m49653();
                                    z12 = true;
                                }
                            }
                        }
                        if (z12) {
                            m37359(c2551);
                        }
                        z = z12;
                    }
                    if (!z) {
                        int i6 = 2;
                        if (C18170.m42340(c2551, EnumC21154.SWITCH)) {
                            Iterator it7 = c2551.m8508().iterator();
                            while (true) {
                                if (it7.hasNext()) {
                                    C21943 c21946 = (C21943) it7.next();
                                    ArrayList arrayList5 = (ArrayList) c21946.mo1986();
                                    if (arrayList5.size() != i || c21946.m49646().size() != i || ((C18959) arrayList5.get(0)).getType() != EnumC24203.MOVE || (size = (listM49644 = c21946.m49643()).size()) < 3) {
                                        z4 = false;
                                        break;
                                    }
                                    Iterator it8 = listM49644.iterator();
                                    boolean z13 = false;
                                    boolean z14 = false;
                                    while (true) {
                                        if (!it8.hasNext()) {
                                            if (!z13 || !z14) {
                                                break;
                                            }
                                            C21943 c21947 = (C21943) c21946.m49646().get(0);
                                            ArrayList arrayList6 = new ArrayList(listM49644);
                                            for (int i7 = 1; i7 < size; i7++) {
                                                C21943 c21948 = (C21943) arrayList6.get(i7);
                                                C21943 c21943M56579 = C25314.m56577(c2551, -1);
                                                c21943M56579.mo17866(EnumC1763.SYNTHETIC);
                                                Iterator it9 = ((ArrayList) c21946.mo1986()).iterator();
                                                while (it9.hasNext()) {
                                                    C18959 c18959M44018 = ((C18959) it9.next()).m44018();
                                                    c18959M44018.mo17866(EnumC1763.SYNTHETIC);
                                                    ((ArrayList) c21943M56579.mo1986()).add(c18959M44018);
                                                }
                                                c21943M56579.m39414((AbstractC16678) c21946);
                                                C25314.m56583(c21948, c21946, c21943M56579);
                                                C25314.m56582(c21943M56579, c21947);
                                            }
                                            z4 = true;
                                            break;
                                        }
                                        C18959 c18959M52204 = C23231.m52200((InterfaceC23435) it8.next());
                                        if (c18959M52204 != null) {
                                            int i8 = C20092.f64572[c18959M52204.getType().ordinal()];
                                            if (i8 == i) {
                                                z13 = true;
                                            } else if (i8 == i6) {
                                                z14 = true;
                                            }
                                        }
                                        z4 = false;
                                        break;
                                    }
                                    if (!z4) {
                                        i6 = 2;
                                        i = 1;
                                    }
                                }
                            }
                        }
                        boolean z15 = false;
                        for (C21943 c21949 : c2551.m8489()) {
                            if (!c21949.mo17865(EnumC1763.SYNTHETIC) && !c21949.mo17865(EnumC1763.ORIG_RETURN) && !c21949.mo17867(c11457)) {
                                List listM49648 = c21949.m49643();
                                if (listM49648.size() >= 2 && (c18959M52201 = C23231.m52200((InterfaceC23435) c21949)) != null && (c18959M52201.m44039() != 1 || ((ArrayList) c21949.mo1986()).size() != 1 || m37352(listM49648, c18959M52201.mo44035(0)))) {
                                    boolean z16 = true;
                                    for (C21943 c219410 : new ArrayList(listM49648)) {
                                        if (z16) {
                                            c21949.mo17866(EnumC1763.ORIG_RETURN);
                                            z16 = false;
                                        } else {
                                            C21943 c21943M565710 = C25314.m56577(c2551, -1);
                                            c21943M565710.mo17866(EnumC1763.SYNTHETIC);
                                            c21943M565710.mo17866(EnumC1763.RETURN);
                                            Iterator it10 = ((ArrayList) c21949.mo1986()).iterator();
                                            while (it10.hasNext()) {
                                                C18959 c18959M44019 = ((C18959) it10.next()).m44018();
                                                c18959M44019.mo17866(EnumC1763.SYNTHETIC);
                                                ((ArrayList) c21943M565710.mo1986()).add(c18959M44019);
                                            }
                                            C25314.m56583(c219410, c21949, c21943M565710);
                                        }
                                    }
                                    z15 = true;
                                } else if (c21949.mo17865(EnumC1763.IGNORE_THROW_SPLIT)) {
                                    listM49643 = c21949.m49643();
                                    if (listM49643.size() >= 2) {
                                        map = new HashMap(listM49643.size());
                                        hashSet = new HashSet(listM49643.size());
                                        for (final C21943 c219411 : listM49643) {
                                            C23231.m52174(c2551, c219411, new Predicate() { // from class: l.᩷᩷᩵
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
                                                    return C15616.m37354(c18959M52200, map, c219411, hashSet, (C21943) obj);
                                                }
                                            });
                                        }
                                        if (hashSet.size() == 1) {
                                            c21949.mo17866(EnumC1763.IGNORE_THROW_SPLIT);
                                        } else {
                                            z3 = true;
                                            for (C21943 c219412 : new ArrayList(listM49643)) {
                                                if (z3) {
                                                    z3 = false;
                                                } else {
                                                    c21943M56577 = C25314.m56577(c2551, -1);
                                                    c21943M56577.mo17866(EnumC1763.SYNTHETIC);
                                                    it = ((ArrayList) c21949.mo1986()).iterator();
                                                    while (it.hasNext()) {
                                                        C18959 c18959M440110 = ((C18959) it.next()).m44018();
                                                        c18959M440110.mo17866(EnumC1763.SYNTHETIC);
                                                        ((ArrayList) c21943M56577.mo1986()).add(c18959M440110);
                                                    }
                                                    c21943M56577.m39414((AbstractC16678) c21949);
                                                    c10733 = (C10733) map.get(c219412);
                                                    if (c10733 != null) {
                                                        c10733.m27337().m45363(c21943M56577);
                                                    }
                                                    C25314.m56583(c219412, c21949, c21943M56577);
                                                }
                                            }
                                            z15 = true;
                                        }
                                    }
                                }
                            } else if (c21949.mo17865(EnumC1763.IGNORE_THROW_SPLIT)) {
                                listM49643 = c21949.m49643();
                                if (listM49643.size() >= 2 && (c18959M52200 = C23231.m52200((InterfaceC23435) c21949)) != null && c18959M52200.getType() == EnumC24203.THROW) {
                                    map = new HashMap(listM49643.size());
                                    hashSet = new HashSet(listM49643.size());
                                    while (r12.hasNext()) {
                                        C23231.m52174(c2551, c219411, new Predicate() { // from class: l.᩷᩷᩵
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
                                                return C15616.m37354(c18959M52200, map, c219411, hashSet, (C21943) obj);
                                            }
                                        });
                                    }
                                    if (hashSet.size() == 1) {
                                        c21949.mo17866(EnumC1763.IGNORE_THROW_SPLIT);
                                    } else {
                                        z3 = true;
                                        while (r5.hasNext()) {
                                            if (z3) {
                                                z3 = false;
                                            } else {
                                                c21943M56577 = C25314.m56577(c2551, -1);
                                                c21943M56577.mo17866(EnumC1763.SYNTHETIC);
                                                it = ((ArrayList) c21949.mo1986()).iterator();
                                                while (it.hasNext()) {
                                                    C18959 c18959M440111 = ((C18959) it.next()).m44018();
                                                    c18959M440111.mo17866(EnumC1763.SYNTHETIC);
                                                    ((ArrayList) c21943M56577.mo1986()).add(c18959M440111);
                                                }
                                                c21943M56577.m39414((AbstractC16678) c21949);
                                                c10733 = (C10733) map.get(c219412);
                                                if (c10733 != null) {
                                                    c10733.m27337().m45363(c21943M56577);
                                                }
                                                C25314.m56583(c219412, c21949, c21943M56577);
                                            }
                                        }
                                        z15 = true;
                                    }
                                }
                            }
                        }
                        if (z15) {
                            C21943 c21943M8492 = c2551.m8491();
                            C25314.m56585(c21943M8492);
                            for (C21943 c219413 : c2551.m8508()) {
                                if (c219413 != c21943M8492 && c219413.m49646().isEmpty() && !c219413.mo17865(EnumC1763.REMOVE)) {
                                    C25314.m56582(c219413, c21943M8492);
                                }
                            }
                        }
                        z2 = z15;
                        break;
                    }
                    break;
                }
                C21943 c219414 = (C21943) it6.next();
                if (c219414.mo17865(EnumC1763.LOOP_START) && (size2 = (listMo17861 = c219414.mo17861(C11457.f36019)).size()) != 0) {
                    Iterator it11 = listMo17861.iterator();
                    while (true) {
                        if (!it11.hasNext()) {
                            if (size2 <= i) {
                                if (size2 == i) {
                                    c11785 = (C11785) listMo17861.get(0);
                                    c21943M29613 = c11785.m29613();
                                    listM49645 = c21943M29613.m49643();
                                    if (listM49645.size() > i) {
                                        z5 = false;
                                        for (C21943 c219415 : new ArrayList(listM49645)) {
                                            if (!c219415.mo17865(EnumC1763.SYNTHETIC)) {
                                                C25314.m56578(c2551, c219415, c21943M29613);
                                                z5 = true;
                                            }
                                        }
                                    } else {
                                        z5 = false;
                                    }
                                    if (!z5) {
                                        c21943M29616 = c11785.m29616();
                                        listM49646 = c21943M29616.m49643();
                                        size3 = listM49646.size() - i;
                                        if (size3 == i) {
                                            z6 = false;
                                        } else {
                                            if (size3 == 0) {
                                                enumC1763 = EnumC1763.MTH_ENTER_BLOCK;
                                                if (!c21943M29616.mo17865(enumC1763)) {
                                                    c2551.m31138("Unexpected block without predecessors: " + c21943M29616);
                                                }
                                                C21943 c21943M565711 = C25314.m56577(c2551, -1);
                                                c21943M565711.mo17866(EnumC1763.SYNTHETIC);
                                                c21943M565711.mo17866(enumC1763);
                                                c2551.m8556(c21943M565711);
                                                c21943M29616.m39418(enumC1763);
                                                C25314.m56582(c21943M565711, c21943M29616);
                                            } else {
                                                c21943M56578 = C25314.m56577(c2551, -1);
                                                c21943M56578.mo17866(EnumC1763.SYNTHETIC);
                                                c21943M29614 = c11785.m29613();
                                                for (C21943 c219416 : new ArrayList(listM49646)) {
                                                    if (c219416 != c21943M29614) {
                                                        C25314.m56583(c219416, c21943M29616, c21943M56578);
                                                    }
                                                }
                                                C25314.m56582(c21943M56578, c21943M29616);
                                            }
                                            z6 = true;
                                        }
                                        if (!z6) {
                                            c21943M29615 = c11785.m29613();
                                            if (c21943M29615.m49646().size() <= i) {
                                                z7 = false;
                                            } else {
                                                C21943 c21943M565712 = C25314.m56577(c2551, -1);
                                                c21943M565712.mo17866(EnumC1763.SYNTHETIC);
                                                c21943M565712.mo17866(EnumC1763.LOOP_END);
                                                C21943 c21943M29617 = c11785.m29616();
                                                C25314.m56583(c21943M29615, c21943M29617, c21943M565712);
                                                C25314.m56582(c21943M565712, c21943M29617);
                                                z7 = true;
                                            }
                                            if (z7) {
                                                break;
                                            }
                                        }
                                    }
                                }
                                z10 = false;
                                break;
                            }
                            Iterator it12 = listMo17861.iterator();
                            while (true) {
                                if (it12.hasNext()) {
                                    if (((C11785) it12.next()).m29616() != c219414) {
                                        z8 = false;
                                        break;
                                    }
                                } else {
                                    C21943 c21943M565713 = C25314.m56577(c2551, c219414.m49654());
                                    c21943M565713.mo17866(EnumC1763.SYNTHETIC);
                                    C25314.m56582(c21943M565713, c219414);
                                    Iterator it13 = listMo17861.iterator();
                                    while (it13.hasNext()) {
                                        C25314.m56583(((C11785) it13.next()).m29613(), c219414, c21943M565713);
                                    }
                                    z8 = true;
                                    break;
                                }
                            }
                            if (!z8) {
                                if (size2 == i) {
                                    c11785 = (C11785) listMo17861.get(0);
                                    c21943M29613 = c11785.m29613();
                                    listM49645 = c21943M29613.m49643();
                                    if (listM49645.size() > i) {
                                        z5 = false;
                                        while (r9.hasNext()) {
                                            if (!c219415.mo17865(EnumC1763.SYNTHETIC)) {
                                                C25314.m56578(c2551, c219415, c21943M29613);
                                                z5 = true;
                                            }
                                        }
                                    } else {
                                        z5 = false;
                                    }
                                    if (!z5) {
                                        c21943M29616 = c11785.m29616();
                                        listM49646 = c21943M29616.m49643();
                                        size3 = listM49646.size() - i;
                                        if (size3 == i) {
                                            z6 = false;
                                        } else {
                                            if (size3 == 0) {
                                                enumC1763 = EnumC1763.MTH_ENTER_BLOCK;
                                                if (!c21943M29616.mo17865(enumC1763)) {
                                                    c2551.m31138("Unexpected block without predecessors: " + c21943M29616);
                                                }
                                                C21943 c21943M565714 = C25314.m56577(c2551, -1);
                                                c21943M565714.mo17866(EnumC1763.SYNTHETIC);
                                                c21943M565714.mo17866(enumC1763);
                                                c2551.m8556(c21943M565714);
                                                c21943M29616.m39418(enumC1763);
                                                C25314.m56582(c21943M565714, c21943M29616);
                                            } else {
                                                c21943M56578 = C25314.m56577(c2551, -1);
                                                c21943M56578.mo17866(EnumC1763.SYNTHETIC);
                                                c21943M29614 = c11785.m29613();
                                                while (r9.hasNext()) {
                                                    if (c219416 != c21943M29614) {
                                                        C25314.m56583(c219416, c21943M29616, c21943M56578);
                                                    }
                                                }
                                                C25314.m56582(c21943M56578, c21943M29616);
                                            }
                                            z6 = true;
                                        }
                                        if (!z6) {
                                            c21943M29615 = c11785.m29613();
                                            if (c21943M29615.m49646().size() <= i) {
                                                z7 = false;
                                            } else {
                                                C21943 c21943M565715 = C25314.m56577(c2551, -1);
                                                c21943M565715.mo17866(EnumC1763.SYNTHETIC);
                                                c21943M565715.mo17866(EnumC1763.LOOP_END);
                                                C21943 c21943M29618 = c11785.m29616();
                                                C25314.m56583(c21943M29615, c21943M29618, c21943M565715);
                                                C25314.m56582(c21943M565715, c21943M29618);
                                                z7 = true;
                                            }
                                            if (z7) {
                                                break;
                                            }
                                        }
                                    }
                                }
                                z10 = false;
                                break;
                            }
                            break;
                        }
                        ArrayList<C16721> arrayListM29621 = ((C11785) it11.next()).m29621();
                        if (arrayListM29621.isEmpty()) {
                            z9 = false;
                        } else {
                            z9 = false;
                            for (C16721 c16721 : arrayListM29621) {
                                C21943 c21943M39488 = c16721.m39488();
                                C21943 c21943M39487 = c16721.m39487();
                                EnumC1763 enumC1764 = EnumC1763.SYNTHETIC;
                                if (!c21943M39488.mo17865(enumC1764) && !c21943M39487.mo17865(enumC1764)) {
                                    C25314.m56578(c2551, c21943M39487, c21943M39488);
                                    z9 = true;
                                }
                            }
                        }
                        if (z9) {
                        }
                        z10 = true;
                        break;
                    }
                }
                if (!z10) {
                    z10 = false;
                }
                z2 = true;
                break;
            }
            if (!z2) {
                break;
            }
            m37355(c2551);
            int i9 = i5 + 1;
            if (i5 > iMax) {
                c2551.m31136("CFG modification limit reached, blocks count: " + size6);
                break;
            } else {
                i = 1;
                i5 = i9;
                z10 = false;
            }
        }
        m37357(c2551);
        C17108.m40273(c2551);
        c2551.m8492();
        C4937.forEach(c2551.m8508(), new Consumer() { // from class: l.ۤ᩷᩵
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj) {
                C15616.m37351((C21943) obj, c2551);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C12312.$default$andThen(this, consumer);
            }
        });
        if (c2551.m8528() != 0) {
            for (C11785 c11786 : c2551.m8558()) {
                for (C11785 c11787 : c2551.m8558()) {
                    if (c11786 != c11787 && c11786.m29620().containsAll(c11787.m29620())) {
                        C11785 c11785M29619 = c11787.m29619();
                        if (c11785M29619 != null) {
                            if (c11785M29619.m29620().containsAll(c11786.m29620())) {
                                c11786.m29622(c11785M29619);
                                c11787.m29622(c11786);
                            } else {
                                c11785M29619.m29622(c11786);
                            }
                        } else {
                            c11787.m29622(c11786);
                        }
                    }
                }
            }
        }
        try {
            if (c2551.mo17865(EnumC1763.COMPUTE_POST_DOM)) {
                try {
                    int size7 = c2551.m8508().size();
                    ArrayList arrayList7 = new ArrayList(size7);
                    C23231.m52171(c2551, new C21900(0, arrayList7));
                    int size8 = arrayList7.size();
                    int[] iArr = new int[size7];
                    for (int i10 = 0; i10 < size8; i10++) {
                        iArr[i10] = ((C21943) arrayList7.get(i10)).m49644();
                    }
                    C21943.m49632(arrayList7);
                    C21943[] c21943ArrM40274 = C17108.m40274(arrayList7, new C7620(9));
                    C21943 c219417 = (C21943) arrayList7.get(0);
                    c219417.m49640(C20247.f65032);
                    c219417.m49652(null);
                    for (int i11 = 1; i11 < size8; i11++) {
                        C21943 c219418 = (C21943) arrayList7.get(i11);
                        C21943 c219419 = c21943ArrM40274[i11];
                        c219418.m49652(c219419);
                        c219418.m49640(C17108.m40272(c21943ArrM40274, c219419));
                    }
                    for (int i12 = 1; i12 < size8; i12++) {
                        C21943 c219420 = (C21943) arrayList7.get(i12);
                        BitSet bitSet = new BitSet(size8);
                        BitSet bitSetM49637 = c219420.m49637();
                        for (int iNextSetBit = bitSetM49637.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSetM49637.nextSetBit(iNextSetBit + 1)) {
                            bitSet.set(iArr[iNextSetBit]);
                        }
                        bitSet.clear(iArr[i12]);
                        c219420.m49640(bitSet);
                    }
                    int i13 = size7 - size8;
                    if (i13 != 0) {
                        int size9 = 0;
                        for (C21943 c219421 : c2551.m8508()) {
                            if (c219421.m49637() == null) {
                                c219421.m49640(C20247.f65032);
                                c219421.m49652(null);
                                size9 += ((ArrayList) c219421.mo1986()).size();
                            }
                        }
                        c2551.m31137("Infinite loop detected, blocks: " + i13 + ", insns: " + size9);
                    }
                } catch (Exception | StackOverflowError e) {
                    c2551.m31134("Failed to build post-dominance tree", e);
                }
                c2551.m8512();
            }
            C4937.forEach(c2551.m8508(), new C8035(1));
        } catch (Throwable th) {
            c2551.m8512();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m37357(C2551 c2551) {
        C21943 c21943;
        while (true) {
            for (C21943 c21944 : c2551.m8508()) {
                if (c21944.m49643().isEmpty() && c21944 != c2551.m8535()) {
                    if (c21944.mo17867(C11457.f36022)) {
                        Iterator it = c21944.m49646().iterator();
                        do {
                            if (!it.hasNext()) {
                                c21943 = null;
                                break;
                            }
                            c21943 = (C21943) it.next();
                        } while (!c21943.mo17865(EnumC1763.EXC_BOTTOM_SPLITTER));
                        if (c21943 != null && c21943.m49643().size() == 1) {
                            HashSet hashSet = new HashSet();
                            hashSet.add(c21943);
                            hashSet.add(c21944);
                            m37348(hashSet, c2551);
                            c2551.m31137("Removed unreachable split cross block " + c21944);
                        }
                    }
                    throw new C8597("Unreachable block: " + c21944);
                }
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m37353(AbstractC16481 abstractC16481, AbstractC16481 abstractC16482) {
        if (abstractC16481 == abstractC16482) {
            return true;
        }
        if (abstractC16481 == null || abstractC16482 == null || !abstractC16481.getClass().equals(abstractC16482.getClass())) {
            return false;
        }
        if (abstractC16481 instanceof C6041) {
            return ((C6041) abstractC16481).m17532() == ((C6041) abstractC16482).m17532();
        }
        if (abstractC16481 instanceof C23195) {
            return ((C23195) abstractC16481).m52122() == ((C23195) abstractC16482).m52122();
        }
        throw new C8597("Unexpected InsnArg types: " + abstractC16481 + " and " + abstractC16482);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37351(C21943 c21943, C2551 c2551) {
        if (c21943.mo17865(EnumC1763.LOOP_START)) {
            List listMo17861 = c21943.mo17861(C11457.f36019);
            C17359.requireNonNull(c2551);
            C4937.forEach(listMo17861, new C16801(1, c2551));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m37354(C18959 c18959, HashMap map, C21943 c21943, HashSet hashSet, C21943 c21944) {
        C10733 c10733 = (C10733) c21944.mo17862((InterfaceC2157) C11457.f36036);
        if (c10733 == null) {
            return false;
        }
        boolean zContains = c10733.m27337().m45365().contains(c21944);
        if (zContains && m37352(Collections.singletonList(c21944), c18959.mo44035(0))) {
            map.put(c21943, c10733);
            hashSet.add(c21944);
        }
        return zContains;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m37352(List list, AbstractC16481 abstractC16481) {
        abstractC16481.getClass();
        if (!(abstractC16481 instanceof C6041)) {
            return false;
        }
        int iM17532 = ((C6041) abstractC16481).m17532();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((ArrayList) ((C21943) it.next()).mo1986()).iterator();
            while (it2.hasNext()) {
                C6041 c6041M44027 = ((C18959) it2.next()).m44027();
                if (c6041M44027 != null && c6041M44027.m17532() == iM17532) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m37359(C2551 c2551) {
        if (C1170.removeIf(c2551.m8508(), new C23606(1, c2551))) {
            c2551.m8512();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m37358(C21943 c21943, C2551 c2551) {
        if (!c21943.mo17865(EnumC1763.REMOVE)) {
            return false;
        }
        if (!c21943.m49643().isEmpty() || !c21943.m49646().isEmpty()) {
            f50740.mo13710("Block {} not deleted, method: {}", c21943, c2551);
            return false;
        }
        C12971 c12971 = (C12971) c21943.mo17862((InterfaceC2157) C11457.f36033);
        if (c12971 == null) {
            return true;
        }
        c12971.m32373(c21943);
        return true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m37356(C21943 c21943, C2551 c2551) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m37349(linkedHashSet, c21943, c2551);
        m37348(linkedHashSet, c2551);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37349(LinkedHashSet linkedHashSet, C21943 c21943, C2551 c2551) {
        if (!c21943.m49643().isEmpty() || c21943 == c2551.m8535()) {
            return;
        }
        C21943 c21943M8535 = c2551.m8535();
        int i = C25314.f81771;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(c21943);
        while (!arrayDeque.isEmpty()) {
            C21943 c21944 = (C21943) arrayDeque.pop();
            if (!linkedHashSet.contains(c21944)) {
                linkedHashSet.add(c21944);
                for (C21943 c21945 : c21944.m49646()) {
                    if (c21945 != c21943M8535 && linkedHashSet.containsAll(c21945.m49643())) {
                        arrayDeque.push(c21945);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37348(HashSet hashSet, C2551 c2551) {
        if (hashSet.isEmpty()) {
            return;
        }
        long jCount = C1170.stream(hashSet).filter(new C19907(3)).count();
        if (jCount != 0) {
            c2551.m31138("Unreachable blocks removed: " + jCount + ", instructions: " + C1170.stream(hashSet).mapToInt(new C13737(1)).sum());
        }
        C4937.forEach(hashSet, new C23076());
        c2551.m8508().removeAll(hashSet);
        c2551.m8512();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m37355(C2551 c2551) {
        C4937.forEach(c2551.m8508(), new C13621());
        int size = c2551.m8508().size();
        ArrayList arrayList = new ArrayList(size);
        C23231.m52170(c2551, (Consumer) new C21900(0, arrayList));
        if (arrayList.size() != size) {
            throw new C8597("Found unreachable blocks");
        }
        c2551.m8498(arrayList);
        C21943[] c21943ArrM40274 = C17108.m40274(arrayList, new C20299(6));
        C21943 c21943 = (C21943) arrayList.get(0);
        c21943.m49649(C20247.f65032);
        c21943.m49641((C21943) null);
        int size2 = arrayList.size();
        for (int i = 1; i < size2; i++) {
            C21943 c21944 = (C21943) arrayList.get(i);
            C21943 c21945 = c21943ArrM40274[i];
            c21944.m49641(c21945);
            c21945.m49635(c21944);
            BitSet bitSetM40272 = C17108.m40272(c21943ArrM40274, c21945);
            bitSetM40272.clear(i);
            c21944.m49649(bitSetM40272);
        }
        C4937.forEach(c2551.m8508(), new C5176());
    }
}
