package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ܶᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBDM */
/* JADX INFO: loaded from: classes4.dex */
public final class C16271 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f52863;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList f52864;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C17017[] f52865;

    public C16271(C24960 c24960, C11796[] c11796Arr) {
        ArrayList arrayListM55749 = c24960.m55749();
        this.f52863 = arrayListM55749;
        this.f52865 = new C17017[arrayListM55749.size() + 2];
        this.f52864 = new ArrayList();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38603(C24960 c24960, C11796[] c11796Arr) {
        int i;
        C17017[] c17017Arr;
        int i2;
        C16271 c16271 = new C16271(c24960, c11796Arr);
        C19738 c19738M55739 = c24960.m55739();
        ArrayList arrayList = c16271.f52864;
        if (c19738M55739 != null) {
            arrayList.add(c19738M55739);
            c11796Arr[c19738M55739.m45472()].f38103 = c19738M55739.m45472();
        }
        c24960.m55734(new C17763(c16271));
        int size = arrayList.size() - 1;
        int i3 = size;
        while (true) {
            c17017Arr = c16271.f52865;
            if (i3 < 2) {
                break;
            }
            C19738 c19738 = (C19738) arrayList.get(i3);
            C17017 c17017 = c17017Arr[c19738.m45472()];
            BitSet bitSetM45465 = c19738.m45465();
            for (int iNextSetBit = bitSetM45465.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSetM45465.nextSetBit(iNextSetBit + 1)) {
                C19738 c19739 = (C19738) c16271.f52863.get(iNextSetBit);
                if (c17017Arr[c19739.m45472()] != null && (i2 = c17017Arr[c16271.m38602(c19739).m45472()].f55590) < c17017.f55590) {
                    c17017.f55590 = i2;
                }
            }
            c17017Arr[((C19738) arrayList.get(c17017.f55590)).m45472()].f55591.add(c19738);
            C19738 c197310 = c17017.f55589;
            c17017.f55588 = c197310;
            ArrayList arrayList2 = c17017Arr[c197310.m45472()].f55591;
            while (!arrayList2.isEmpty()) {
                C19738 c197311 = (C19738) C18011.m41990(arrayList2, 1);
                C19738 c19738M38602 = c16271.m38602(c197311);
                if (c17017Arr[c19738M38602.m45472()].f55590 < c17017Arr[c197311.m45472()].f55590) {
                    c11796Arr[c197311.m45472()].f38103 = c19738M38602.m45472();
                } else {
                    c11796Arr[c197311.m45472()].f38103 = c17017.f55589.m45472();
                }
            }
            i3--;
        }
        for (i = 2; i <= size; i++) {
            C19738 c197312 = (C19738) arrayList.get(i);
            if (c11796Arr[c197312.m45472()].f38103 != ((C19738) arrayList.get(c17017Arr[c197312.m45472()].f55590)).m45472()) {
                c11796Arr[c197312.m45472()].f38103 = c11796Arr[c11796Arr[c197312.m45472()].f38103].f38103;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C19738 m38602(C19738 c19738) {
        int iM45472 = c19738.m45472();
        C17017[] c17017Arr = this.f52865;
        C17017 c17017 = c17017Arr[iM45472];
        if (c17017.f55588 == null) {
            return c19738;
        }
        if (c17017Arr[c17017Arr[c19738.m45472()].f55588.m45472()].f55588 != null) {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            arrayList.add(c19738);
            while (!arrayList.isEmpty()) {
                int size = arrayList.size() - 1;
                C17017 c17018 = c17017Arr[((C19738) arrayList.get(size)).m45472()];
                C19738 c19739 = c17018.f55588;
                C17017 c17019 = c17017Arr[c19739.m45472()];
                if (hashSet.add(c19739) && c17019.f55588 != null) {
                    arrayList.add(c19739);
                } else {
                    arrayList.remove(size);
                    if (c17019.f55588 != null) {
                        C19738 c197310 = c17019.f55592;
                        if (c17017Arr[c197310.m45472()].f55590 < c17017Arr[c17018.f55592.m45472()].f55590) {
                            c17018.f55592 = c197310;
                        }
                        c17018.f55588 = c17019.f55588;
                    }
                }
            }
        }
        return c17017.f55592;
    }
}
