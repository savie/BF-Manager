package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖᩳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: KAJU */
/* JADX INFO: loaded from: classes2.dex */
public final class C2697 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4108 m8230(C17661 c17661, int i) {
        C4108 c4108M11660 = C4108.m11660(c17661, i);
        ArrayList arrayListM11687 = c4108M11660.m11687();
        for (int size = arrayListM11687.size() - 1; size >= 0; size--) {
            C11871 c11871 = (C11871) arrayListM11687.get(size);
            int iCardinality = c11871.m29596().cardinality();
            int iCardinality2 = c11871.m29622().cardinality();
            if (iCardinality > 1 && iCardinality2 > 1) {
                c11871.m29623();
            }
        }
        ArrayList arrayListM11688 = c4108M11660.m11687();
        for (int size2 = arrayListM11688.size() - 1; size2 >= 0; size2--) {
            C11871 c11872 = (C11871) arrayListM11688.get(size2);
            if (!c11872.m29611() && c11872.m29596().cardinality() > 1 && ((AbstractC22454) c11872.m29613().get(0)).mo17430()) {
                BitSet bitSet = (BitSet) c11872.m29596().clone();
                for (int iNextSetBit = bitSet.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1)) {
                    ((C11871) arrayListM11688.get(iNextSetBit)).m29614(c11872).m29613().add(0, ((AbstractC22454) c11872.m29613().get(0)).clone());
                }
                c11872.m29613().remove(0);
            }
        }
        ArrayList arrayListM11689 = c4108M11660.m11687();
        for (int size3 = arrayListM11689.size() - 1; size3 >= 0; size3--) {
            C11871 c11873 = (C11871) arrayListM11689.get(size3);
            BitSet bitSet2 = (BitSet) c11873.m29622().clone();
            for (int iNextSetBit2 = bitSet2.nextSetBit(0); iNextSetBit2 >= 0; iNextSetBit2 = bitSet2.nextSetBit(iNextSetBit2 + 1)) {
                C11871 c11874 = (C11871) arrayListM11689.get(iNextSetBit2);
                AbstractC22454 abstractC22454 = (AbstractC22454) C19084.m43861(c11873.m29613(), 1);
                if ((c11873.m29622().cardinality() > 1 && c11874.m29596().cardinality() > 1) || ((abstractC22454.m49955() != null || abstractC22454.mo17429().size() > 0) && c11874.m29596().cardinality() > 1)) {
                    c11873.m29614(c11874);
                }
            }
        }
        m8232(c4108M11660, C20442.m46240(c4108M11660), 0);
        new RunnableC18220(c4108M11660).run();
        c4108M11660.m11682();
        return c4108M11660;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8231(int i, C4108 c4108) {
        m8232(c4108, C20442.m46240(c4108), i);
        new RunnableC18220(i, c4108).run();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8232(C4108 c4108, C0685 c0685, int i) {
        ArrayList arrayListM11687 = c4108.m11687();
        int size = arrayListM11687.size();
        int iM11685 = c4108.m11685() - i;
        C4213[] c4213ArrM18873 = new C7036(c4108).m18873();
        BitSet[] bitSetArr = new BitSet[iM11685];
        BitSet[] bitSetArr2 = new BitSet[iM11685];
        for (int i2 = 0; i2 < iM11685; i2++) {
            bitSetArr[i2] = new BitSet(size);
            bitSetArr2[i2] = new BitSet(size);
        }
        int size2 = arrayListM11687.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Iterator it = ((C11871) arrayListM11687.get(i3)).m29613().iterator();
            while (it.hasNext()) {
                C16251 c16251M49955 = ((AbstractC22454) it.next()).m49955();
                if (c16251M49955 != null && c16251M49955.m38400() - i >= 0) {
                    bitSetArr[c16251M49955.m38400() - i].set(i3);
                }
            }
        }
        for (int i4 = 0; i4 < iM11685; i4++) {
            BitSet bitSet = (BitSet) bitSetArr[i4].clone();
            while (true) {
                int iNextSetBit = bitSet.nextSetBit(0);
                if (iNextSetBit >= 0) {
                    bitSet.clear(iNextSetBit);
                    InterfaceC13303 it2 = c4213ArrM18873[iNextSetBit].f15295.iterator();
                    while (it2.hasNext()) {
                        int next = it2.next();
                        if (!bitSetArr2[i4].get(next)) {
                            bitSetArr2[i4].set(next);
                            int i5 = i4 + i;
                            C16251 c16251 = c0685.m3061(next).get(i5);
                            if (c16251 == null) {
                                ((C11871) arrayListM11687.get(next)).m29615(i5);
                            } else {
                                ((C11871) arrayListM11687.get(next)).m29607(c16251);
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
