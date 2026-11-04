package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֫۫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: U5KR */
/* JADX INFO: loaded from: classes3.dex */
public final class C1926 extends AbstractC20571 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static Comparator f6471 = new C5655();

    @Override // l.AbstractC20571
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6604(InterfaceC3417 interfaceC3417) {
        ((C11620) interfaceC3417).f36456 = true;
    }

    @Override // l.AbstractC20571
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo6607() {
        HashSet hashSet = new HashSet(this.f65890.size() / 2);
        C17587 c17587 = new C17587();
        c17587.addAll(this.f65890);
        while (!c17587.isEmpty()) {
            C11620 c11620 = (C11620) c17587.poll();
            if (c11620.f36456 && !hashSet.contains(c11620)) {
                hashSet.add(c11620);
                C11620 c11621 = c11620.f36459;
                if (c11621 != null && !c11621.f36456) {
                    c11621.f36456 = true;
                    c17587.add(c11621);
                }
                ArrayList<C11620> arrayList = c11620.f36455;
                if (arrayList != null && arrayList.size() > 0) {
                    for (C11620 c11622 : arrayList) {
                        if (c11622 != null && !c11622.f36456) {
                            c11622.f36456 = true;
                            c17587.add(c11622);
                        }
                    }
                    c11620.f36455 = null;
                }
            }
        }
        Iterator it = this.f65890.iterator();
        while (it.hasNext()) {
            ((C11620) it.next()).f36459 = null;
        }
        this.f65890 = null;
    }

    @Override // l.InterfaceC14054
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final C11620[] mo6602(C11620[] c11620Arr, C11620[] c11620Arr2, AbstractC12563 abstractC12563, AbstractC12563 abstractC12564) {
        boolean z;
        C11620 c11620;
        C11620 c11621;
        ArrayList<C20022> arrayList;
        HashMap map = new HashMap();
        if (abstractC12564.f40344 == EnumC20768.LABEL && (arrayList = ((C11817) abstractC12564).f38143) != null) {
            for (C20022 c20022 : arrayList) {
                map.put(Integer.valueOf(((C4448) c20022.f12388).f15916), c20022);
            }
        }
        if (c11620Arr2 == null) {
            c11620Arr2 = (C11620[]) m47169();
            for (int i = 0; i < c11620Arr2.length; i++) {
                if (!map.containsKey(Integer.valueOf(i)) && (c11621 = c11620Arr[i]) != null) {
                    C11620 c11622 = new C11620(0);
                    this.f65890.add(c11622);
                    c11622.f36459 = c11621;
                    c11622.f36454 = c11621.f36454 + 1;
                    c11622.f36458 = c11621.f36458;
                    c11620Arr2[i] = c11622;
                }
            }
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            for (int i2 = 0; i2 < c11620Arr2.length; i2++) {
                if (!map.containsKey(Integer.valueOf(i2))) {
                    C11620 c11623 = c11620Arr[i2];
                    C11620 c11624 = c11620Arr2[i2];
                    if (c11623 != null && c11624 != null) {
                        if (c11624.f36455 == null) {
                            c11624.f36455 = new ArrayList(5);
                        }
                        c11624.f36455.add(c11623);
                    }
                }
            }
        }
        for (C20022 c20023 : map.values()) {
            C4448 c4448 = (C4448) c20023.f12388;
            if (z) {
                c11620 = new C11620(0);
                c11620.f36458 = c4448;
                c11620.f36457 = new HashMap();
                c11620Arr2[c4448.f15916] = c11620;
            } else {
                c11620 = c11620Arr2[c4448.f15916];
            }
            ArrayList arrayList2 = new ArrayList();
            C11620 c11625 = c11620Arr[c4448.f15916];
            if (c11625 != null) {
                arrayList2.add(c11625);
            }
            for (AbstractC11071 abstractC11071 : c20023.f12387.mo15448()) {
                C11620 c11626 = c11620Arr[((C4448) abstractC11071).f15916];
                if (c11626 != null) {
                    arrayList2.add(c11626);
                }
            }
            Collections.sort(arrayList2, f6471);
            C11620 c11627 = (C11620) arrayList2.get(0);
            c11627.f36456 = true;
            c11620.f36457.put(abstractC12563, c11627.f36458);
        }
        return c11620Arr2;
    }

    @Override // l.AbstractC20571
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3417[] mo6605(int i) {
        return new C11620[i];
    }

    @Override // l.AbstractC20571
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3417 mo6608() {
        return new C11620(0);
    }

    @Override // l.AbstractC20571
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3417 mo6603(C4448 c4448, AbstractC11071 abstractC11071) {
        C11620 c11620 = (C11620) super.mo6603(c4448, abstractC11071);
        c11620.f36458 = c4448;
        c11620.f36456 = true;
        return c11620;
    }
}
