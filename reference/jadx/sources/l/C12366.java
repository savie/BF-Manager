package l;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۨ۫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: I4RE */
/* JADX INFO: loaded from: classes4.dex */
public final class C12366 extends AbstractC20571 {
    @Override // l.InterfaceC14054
    /* JADX INFO: renamed from: ۙ */
    public final Object mo6602(Object obj, Object obj2, AbstractC12563 abstractC12563, AbstractC12563 abstractC12564) {
        C6401[] c6401Arr = (C6401[]) obj;
        C6401[] c6401Arr2 = (C6401[]) obj2;
        int i = 0;
        if (c6401Arr2 == null) {
            C6401[] c6401Arr3 = new C6401[this.f65891];
            while (i < c6401Arr.length) {
                C6401 c6401 = c6401Arr[i];
                if (c6401 != null) {
                    C6401 c6402 = new C6401();
                    this.f65890.add(c6402);
                    c6402.f21603 = c6401;
                    c6401Arr3[i] = c6402;
                }
                i++;
            }
            return c6401Arr3;
        }
        while (i < c6401Arr.length) {
            C6401 c6403 = c6401Arr[i];
            C6401 c6404 = c6401Arr2[i];
            if (c6403 != null && c6404 != null) {
                ArrayList arrayList = c6404.f21601;
                if (arrayList == null) {
                    arrayList = new ArrayList(3);
                    c6404.f21601 = arrayList;
                }
                arrayList.add(c6403);
            }
            i++;
        }
        return c6401Arr2;
    }

    @Override // l.AbstractC20571
    /* JADX INFO: renamed from: ۙ */
    public final void mo6604(InterfaceC3417 interfaceC3417) {
        ((C6401) interfaceC3417).f21602 = true;
    }

    @Override // l.AbstractC20571
    /* JADX INFO: renamed from: ۤ */
    public final void mo6607() {
        HashSet hashSet = new HashSet(this.f65890.size() / 2);
        C17587 c17587 = new C17587();
        for (C6401 c6401 : this.f65890) {
            if (c6401.f21602) {
                c17587.add(c6401);
                while (!c17587.isEmpty()) {
                    C6401 c6402 = (C6401) c17587.poll();
                    if (c6402.f21602 && !hashSet.contains(c6402)) {
                        hashSet.add(c6402);
                        C6401 c6403 = c6402.f21603;
                        if (c6403 != null && !c6403.f21602) {
                            c6403.f21602 = true;
                            c17587.add(c6403);
                        }
                        ArrayList<C6401> arrayList = c6402.f21601;
                        if (arrayList != null) {
                            for (C6401 c6404 : arrayList) {
                                if (!c6404.f21602) {
                                    c6404.f21602 = true;
                                    c17587.add(c6404);
                                }
                            }
                            c6402.f21601 = null;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m30844() {
        return this.f65891;
    }

    @Override // l.AbstractC20571
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC3417[] mo6605(int i) {
        return new C6401[i];
    }

    @Override // l.AbstractC20571
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC3417 mo6603(C4448 c4448, AbstractC11071 abstractC11071) {
        C6401 c6401 = new C6401();
        c6401.f21602 = true;
        return c6401;
    }

    @Override // l.AbstractC20571
    /* JADX INFO: renamed from: ᩴ */
    public final InterfaceC3417 mo6608() {
        return new C6401();
    }
}
