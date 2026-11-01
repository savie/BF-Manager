package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۫۫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: U5KR */
/* JADX INFO: loaded from: classes4.dex */
public final class C12415 extends AbstractC3241 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static Comparator f41446 = new C16648();

    @Override // l.AbstractC3241
    /* JADX INFO: renamed from: ۙ */
    public final void mo9693(InterfaceC9593 interfaceC9593) {
        ((C17353) interfaceC9593).f55217 = true;
    }

    @Override // l.AbstractC3241
    /* JADX INFO: renamed from: ۨ */
    public final void mo9696() {
        HashSet hashSet = new HashSet(this.f12053.size() / 2);
        C23704 c23704 = new C23704();
        c23704.addAll(this.f12053);
        while (!c23704.isEmpty()) {
            C17353 c17353 = (C17353) c23704.poll();
            if (c17353.f55217 && !hashSet.contains(c17353)) {
                hashSet.add(c17353);
                C17353 c17354 = c17353.f55212;
                if (c17354 != null && !c17354.f55217) {
                    c17354.f55217 = true;
                    c23704.add(c17354);
                }
                ArrayList<C17353> arrayList = c17353.f55215;
                if (arrayList != null && arrayList.size() > 0) {
                    for (C17353 c17355 : arrayList) {
                        if (c17355 != null && !c17355.f55217) {
                            c17355.f55217 = true;
                            c23704.add(c17355);
                        }
                    }
                    c17353.f55215 = null;
                }
            }
        }
        Iterator it = this.f12053.iterator();
        while (it.hasNext()) {
            ((C17353) it.next()).f55212 = null;
        }
        this.f12053 = null;
    }

    @Override // l.InterfaceC19595
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final C17353[] mo6323(C17353[] c17353Arr, C17353[] c17353Arr2, AbstractC4777 abstractC4777, AbstractC4777 abstractC4778) {
        boolean z;
        C17353 c17353;
        C17353 c17354;
        ArrayList<C15592> arrayList;
        HashMap map = new HashMap();
        if (abstractC4778.f16795 == EnumC2890.LABEL && (arrayList = ((C17002) abstractC4778).f54351) != null) {
            for (C15592 c15592 : arrayList) {
                map.put(Integer.valueOf(((C2184) c15592.f31402).f7921), c15592);
            }
        }
        if (c17353Arr2 == null) {
            c17353Arr2 = (C17353[]) m9691();
            for (int i = 0; i < c17353Arr2.length; i++) {
                if (!map.containsKey(Integer.valueOf(i)) && (c17354 = c17353Arr[i]) != null) {
                    C17353 c17355 = new C17353(0);
                    this.f12053.add(c17355);
                    c17355.f55212 = c17354;
                    c17355.f55213 = c17354.f55213 + 1;
                    c17355.f55216 = c17354.f55216;
                    c17353Arr2[i] = c17355;
                }
            }
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            for (int i2 = 0; i2 < c17353Arr2.length; i2++) {
                if (!map.containsKey(Integer.valueOf(i2))) {
                    C17353 c17356 = c17353Arr[i2];
                    C17353 c17357 = c17353Arr2[i2];
                    if (c17356 != null && c17357 != null) {
                        if (c17357.f55215 == null) {
                            c17357.f55215 = new ArrayList(5);
                        }
                        c17357.f55215.add(c17356);
                    }
                }
            }
        }
        for (C15592 c15593 : map.values()) {
            C2184 c2184 = (C2184) c15593.f31402;
            if (z) {
                c17353 = new C17353(0);
                c17353.f55216 = c2184;
                c17353.f55214 = new HashMap();
                c17353Arr2[c2184.f7921] = c17353;
            } else {
                c17353 = c17353Arr2[c2184.f7921];
            }
            ArrayList arrayList2 = new ArrayList();
            C17353 c17358 = c17353Arr[c2184.f7921];
            if (c17358 != null) {
                arrayList2.add(c17358);
            }
            for (AbstractC7124 abstractC7124 : c15593.f31401.mo19023()) {
                C17353 c17359 = c17353Arr[((C2184) abstractC7124).f7921];
                if (c17359 != null) {
                    arrayList2.add(c17359);
                }
            }
            Collections.sort(arrayList2, f41446);
            C17353 c173510 = (C17353) arrayList2.get(0);
            c173510.f55217 = true;
            c17353.f55214.put(abstractC4777, c173510.f55216);
        }
        return c17353Arr2;
    }

    @Override // l.AbstractC3241
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC9593[] mo9694(int i) {
        return new C17353[i];
    }

    @Override // l.AbstractC3241
    /* JADX INFO: renamed from: ۚ */
    public final InterfaceC9593 mo9695() {
        return new C17353(0);
    }

    @Override // l.AbstractC3241
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC9593 mo9692(C2184 c2184, AbstractC7124 abstractC7124) {
        C17353 c17353 = (C17353) super.mo9692(c2184, abstractC7124);
        c17353.f55216 = c2184;
        c17353.f55217 = true;
        return c17353;
    }
}
