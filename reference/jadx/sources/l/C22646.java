package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩸۟ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6BW */
/* JADX INFO: loaded from: classes.dex */
public final class C22646 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f73555 = new HashMap();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final BitSet f73556;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C2551 f73557;

    public C22646(C2551 c2551) {
        this.f73557 = c2551;
        this.f73556 = C23231.m52197(c2551);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m51047(C22646 c22646, HashSet hashSet, C21943 c21943) {
        C2551 c2551 = c22646.f73557;
        return !hashSet.contains(c21943) || c21943.equals(c2551.m8535()) || c21943.equals(c2551.m8491());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m51050(C21943 c21943) {
        return this.f73556.get(c21943.getId());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21943 m51049(C21943 c21943) {
        return (C21943) this.f73555.get(c21943);
    }

    /* JADX WARN: Code duplicated, block: B:119:0x02c8 A[PHI: r8
      0x02c8: PHI (r8v14 l.᩷ۡۗ) = (r8v12 l.᩷ۡۗ), (r8v17 l.᩷ۡۗ) binds: [B:125:0x02f1, B:118:0x02c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m51048() {
        boolean z;
        BitSet bitSet;
        C21943 c21943M40991;
        C2551 c2551 = this.f73557;
        ArrayList arrayList = new ArrayList(c2551.m8508().size());
        C23231.m52170(c2551, (Consumer) new C21900(0, arrayList));
        if (!c2551.m8560()) {
            for (C21943 c21943 : c2551.m8508()) {
                C11457 c11457 = C11457.f36018;
                C14768 c14768 = (C14768) c21943.mo17862((InterfaceC2157) c11457);
                if (c14768 != null) {
                    C21943 c21943M35538 = c14768.m35538();
                    if (!c21943.m49646().contains(c21943M35538)) {
                        throw new C8597("Readable normal edge lost for " + c21943 + " -> " + c21943M35538);
                    }
                    for (C21943 c21944 : new ArrayList(c21943.m49646())) {
                        if (c21944 != c21943M35538) {
                            C25314.m56586(c21943, c21944);
                        }
                    }
                    c21943.m39419(c11457);
                }
            }
        }
        HashMap map = new HashMap();
        for (C19684 c19684 : c2551.m8530()) {
            C21943 c21943M45368 = c19684.m45368();
            if (c21943M45368 != null) {
                ((List) C11392.computeIfAbsent(map, c21943M45368, new C22493(6))).add(c19684);
            }
        }
        do {
            z = false;
            for (C21943 c21945 : c2551.m8508()) {
                if (c21945 != c2551.m8535() && c21945 != c2551.m8491() && c21945.mo17865(EnumC1763.SYNTHETIC) && !map.containsKey(c21945) && ((ArrayList) c21945.mo1986()).isEmpty() && (c21945.m49643().isEmpty() || c21945.m49646().isEmpty())) {
                    C25314.m56585(c21945);
                    Iterator it = new ArrayList(c21945.m49646()).iterator();
                    while (it.hasNext()) {
                        C25314.m56586(c21945, (C21943) it.next());
                    }
                    c21945.mo17866(EnumC1763.REMOVE);
                    z = true;
                }
            }
            C15616.m37359(c2551);
        } while (z);
        for (C21943 c21946 : c2551.m8508()) {
            if (((ArrayList) c21946.mo1986()).isEmpty() && (!c21946.m49643().isEmpty() || map.containsKey(c21946))) {
                if (c21946.m49646().size() == 1 && c21946.m49646().get(0) != c21946) {
                    C21943 c21947 = (C21943) c21946.m49646().get(0);
                    List list = (List) map.remove(c21946);
                    if (list != null) {
                        C4937.forEach(list, new C10711(0, c21947));
                        ((List) C11392.computeIfAbsent(map, c21947, new C15033(4))).addAll(list);
                    }
                    List listM49643 = c21946.m49643();
                    C25314.m56586(c21946, c21947);
                    if (listM49643.size() == 1) {
                        C25314.m56583((C21943) listM49643.get(0), c21946, c21947);
                    } else {
                        Iterator it2 = new ArrayList(listM49643).iterator();
                        while (it2.hasNext()) {
                            C25314.m56583((C21943) it2.next(), c21946, c21947);
                        }
                    }
                    c21946.mo17866(EnumC1763.REMOVE);
                }
            }
        }
        C15616.m37359(c2551);
        final HashSet hashSet = new HashSet(c2551.m8508());
        C1170.removeIf(arrayList, new Predicate() { // from class: l.ۙ۟ۗ
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
                return C22646.m51047(this.f16687, hashSet, (C21943) obj);
            }
        });
        Iterator it3 = c2551.m8530().iterator();
        while (true) {
            boolean zHasNext = it3.hasNext();
            bitSet = this.f73556;
            if (!zHasNext) {
                break;
            }
            C21943 c21943M45369 = ((C19684) it3.next()).m45368();
            if (c21943M45369 != null) {
                bitSet.set(c21943M45369.getId());
            }
        }
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        int size = arrayList.size();
        int i = 0;
        C21943 c21948 = null;
        while (i < size) {
            C21943 c21949 = (C21943) arrayList.get(i);
            i++;
            C21943 c219410 = i == size ? null : (C21943) arrayList.get(i);
            List listM49644 = c21949.m49643();
            int size2 = listM49644.size();
            if (size2 > 1) {
                bitSet.set(c21949.getId());
            } else if (size2 == 1 && c21948 != null && !c21948.equals(listM49644.get(0)) && !c21949.mo17865(EnumC1763.EXC_BOTTOM_SPLITTER)) {
                bitSet.set(c21949.getId());
            }
            C18959 c18959M52200 = C23231.m52200((InterfaceC23435) c21949);
            if (c18959M52200 instanceof AbstractC9284) {
                if (c18959M52200 instanceof C17489) {
                    C17489 c17489 = (C17489) c18959M52200;
                    C21943 c21943M40992 = c17489.m40992();
                    if (C17359.equals(c219410, c21943M40992)) {
                        c17489.m40993();
                        bitSet.set(c17489.m40992().getId());
                    } else {
                        bitSet.set(c21943M40992.getId());
                    }
                    c17489.normalize();
                } else {
                    Iterator it4 = c21949.m49646().iterator();
                    while (it4.hasNext()) {
                        bitSet.set(((C21943) it4.next()).getId());
                    }
                }
            }
            boolean z2 = c18959M52200 instanceof C17489;
            HashMap map2 = this.f73555;
            if (z2) {
                c21943M40991 = ((C17489) c18959M52200).m40991();
                if (!c21943M40991.equals(c219410)) {
                    map2.put(c21949, c21943M40991);
                    bitSet.set(c21943M40991.getId());
                }
            } else if (c21949.m49646().size() == 1 && !c2551.m8521(c21949)) {
                c21943M40991 = (C21943) c21949.m49646().get(0);
                if (!c21943M40991.equals(c219410)) {
                    map2.put(c21949, c21943M40991);
                    bitSet.set(c21943M40991.getId());
                }
            }
            c21948 = c21949;
        }
        if (c2551.m8534()) {
            int size3 = arrayList.size() - 1;
            C21943 c219411 = (C21943) arrayList.get(size3);
            if (c219411.mo17865(EnumC1763.RETURN) && ((ArrayList) c219411.mo1986()).size() == 1 && !bitSet.get(c219411.getId())) {
                arrayList.remove(size3);
            }
        }
        return arrayList;
    }
}
