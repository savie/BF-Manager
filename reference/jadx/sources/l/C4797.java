package l;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۙܿ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: I4RE */
/* JADX INFO: loaded from: classes3.dex */
public final class C4797 extends AbstractC3241 {
    @Override // l.InterfaceC19595
    /* JADX INFO: renamed from: ۙ */
    public final Object mo6323(Object obj, Object obj2, AbstractC4777 abstractC4777, AbstractC4777 abstractC4778) {
        C13971[] c13971Arr = (C13971[]) obj;
        C13971[] c13971Arr2 = (C13971[]) obj2;
        int i = 0;
        if (c13971Arr2 == null) {
            C13971[] c13971Arr3 = new C13971[this.f12055];
            while (i < c13971Arr.length) {
                C13971 c13971 = c13971Arr[i];
                if (c13971 != null) {
                    C13971 c13972 = new C13971();
                    this.f12053.add(c13972);
                    c13972.f45951 = c13971;
                    c13971Arr3[i] = c13972;
                }
                i++;
            }
            return c13971Arr3;
        }
        while (i < c13971Arr.length) {
            C13971 c13973 = c13971Arr[i];
            C13971 c13974 = c13971Arr2[i];
            if (c13973 != null && c13974 != null) {
                ArrayList arrayList = c13974.f45949;
                if (arrayList == null) {
                    arrayList = new ArrayList(3);
                    c13974.f45949 = arrayList;
                }
                arrayList.add(c13973);
            }
            i++;
        }
        return c13971Arr2;
    }

    @Override // l.AbstractC3241
    /* JADX INFO: renamed from: ۙ */
    public final void mo9693(InterfaceC9593 interfaceC9593) {
        ((C13971) interfaceC9593).f45950 = true;
    }

    @Override // l.AbstractC3241
    /* JADX INFO: renamed from: ۨ */
    public final void mo9696() {
        HashSet hashSet = new HashSet(this.f12053.size() / 2);
        C23704 c23704 = new C23704();
        for (C13971 c13971 : this.f12053) {
            if (c13971.f45950) {
                c23704.add(c13971);
                while (!c23704.isEmpty()) {
                    C13971 c13972 = (C13971) c23704.poll();
                    if (c13972.f45950 && !hashSet.contains(c13972)) {
                        hashSet.add(c13972);
                        C13971 c13973 = c13972.f45951;
                        if (c13973 != null && !c13973.f45950) {
                            c13973.f45950 = true;
                            c23704.add(c13973);
                        }
                        ArrayList<C13971> arrayList = c13972.f45949;
                        if (arrayList != null) {
                            for (C13971 c13974 : arrayList) {
                                if (!c13974.f45950) {
                                    c13974.f45950 = true;
                                    c23704.add(c13974);
                                }
                            }
                            c13972.f45949 = null;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m13319() {
        return this.f12055;
    }

    @Override // l.AbstractC3241
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC9593[] mo9694(int i) {
        return new C13971[i];
    }

    @Override // l.AbstractC3241
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC9593 mo9692(C2184 c2184, AbstractC7124 abstractC7124) {
        C13971 c13971 = new C13971();
        c13971.f45950 = true;
        return c13971;
    }

    @Override // l.AbstractC3241
    /* JADX INFO: renamed from: ۚ */
    public final InterfaceC9593 mo9695() {
        return new C13971();
    }
}
