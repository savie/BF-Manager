package l;

import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: KAJU */
/* JADX INFO: loaded from: classes4.dex */
public final class C15262 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24960 m36611(C9757 c9757, int i) {
        C24960 c24960M55721 = C24960.m55721(c9757, i);
        ArrayList arrayListM55749 = c24960M55721.m55749();
        for (int size = arrayListM55749.size() - 1; size >= 0; size--) {
            C19738 c19738 = (C19738) arrayListM55749.get(size);
            int iCardinality = c19738.m45465().cardinality();
            int iCardinality2 = c19738.m45467().cardinality();
            if (iCardinality > 1 && iCardinality2 > 1) {
                c19738.m45478();
            }
        }
        ArrayList arrayListM557410 = c24960M55721.m55749();
        for (int size2 = arrayListM557410.size() - 1; size2 >= 0; size2--) {
            C19738 c19739 = (C19738) arrayListM557410.get(size2);
            if (!c19739.m45449() && c19739.m45465().cardinality() > 1 && ((AbstractC5568) c19739.m45460().get(0)).mo4994()) {
                BitSet bitSet = (BitSet) c19739.m45465().clone();
                for (int iNextSetBit = bitSet.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1)) {
                    ((C19738) arrayListM557410.get(iNextSetBit)).m45461(c19739).m45460().add(0, ((AbstractC5568) c19739.m45460().get(0)).clone());
                }
                c19739.m45460().remove(0);
            }
        }
        ArrayList arrayListM557411 = c24960M55721.m55749();
        for (int size3 = arrayListM557411.size() - 1; size3 >= 0; size3--) {
            C19738 c197310 = (C19738) arrayListM557411.get(size3);
            BitSet bitSet2 = (BitSet) c197310.m45467().clone();
            for (int iNextSetBit2 = bitSet2.nextSetBit(0); iNextSetBit2 >= 0; iNextSetBit2 = bitSet2.nextSetBit(iNextSetBit2 + 1)) {
                C19738 c197311 = (C19738) arrayListM557411.get(iNextSetBit2);
                AbstractC5568 abstractC5568 = (AbstractC5568) j$$ExternalSyntheticOutline0.m(c197310.m45460(), 1);
                if ((c197310.m45467().cardinality() > 1 && c197311.m45465().cardinality() > 1) || ((abstractC5568.m16508() != null || abstractC5568.mo4992().size() > 0) && c197311.m45465().cardinality() > 1)) {
                    c197310.m45461(c197311);
                }
            }
        }
        m36613(c24960M55721, C18509.m43098(c24960M55721), 0);
        new RunnableC3330(c24960M55721).run();
        c24960M55721.m55740();
        return c24960M55721;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36612(int i, C24960 c24960) {
        m36613(c24960, C18509.m43098(c24960), i);
        new RunnableC3330(i, c24960).run();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36613(C24960 c24960, C0610 c0610, int i) {
        ArrayList arrayListM55749 = c24960.m55749();
        int size = arrayListM55749.size();
        int iM55737 = c24960.m55737() - i;
        C11796[] c11796ArrM56228 = new C25223(c24960).m56228();
        BitSet[] bitSetArr = new BitSet[iM55737];
        BitSet[] bitSetArr2 = new BitSet[iM55737];
        for (int i2 = 0; i2 < iM55737; i2++) {
            bitSetArr[i2] = new BitSet(size);
            bitSetArr2[i2] = new BitSet(size);
        }
        int size2 = arrayListM55749.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Iterator it = ((C19738) arrayListM55749.get(i3)).m45460().iterator();
            while (it.hasNext()) {
                C20946 c20946M16508 = ((AbstractC5568) it.next()).m16508();
                if (c20946M16508 != null && c20946M16508.m47903() - i >= 0) {
                    bitSetArr[c20946M16508.m47903() - i].set(i3);
                }
            }
        }
        for (int i4 = 0; i4 < iM55737; i4++) {
            BitSet bitSet = (BitSet) bitSetArr[i4].clone();
            while (true) {
                int iNextSetBit = bitSet.nextSetBit(0);
                if (iNextSetBit >= 0) {
                    bitSet.clear(iNextSetBit);
                    InterfaceC11271 it2 = c11796ArrM56228[iNextSetBit].f38102.iterator();
                    while (it2.hasNext()) {
                        int next = it2.next();
                        if (!bitSetArr2[i4].get(next)) {
                            bitSetArr2[i4].set(next);
                            int i5 = i4 + i;
                            C20946 c20946 = c0610.m2727(next).get(i5);
                            if (c20946 == null) {
                                ((C19738) arrayListM55749.get(next)).m45462(i5);
                            } else {
                                ((C19738) arrayListM55749.get(next)).m45457(c20946);
                            }
                            if (!bitSetArr[i4].get(next)) {
                                bitSet.set(next);
                            }
                        }
                    }
                }
            }
        }
    }
}
