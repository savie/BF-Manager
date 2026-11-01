package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۬᩸ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBFX */
/* JADX INFO: loaded from: classes3.dex */
public final class C13387 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f44338;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final BitSet f44339;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList[] f44340;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32882(C4108 c4108) {
        ArrayList[] arrayListArr;
        C13387 c13387 = new C13387(c4108);
        HashSet hashSet = new HashSet();
        BitSet bitSetM11670 = c4108.m11670();
        ArrayList arrayListM11687 = c4108.m11687();
        int i = 0;
        while (true) {
            int iNextClearBit = bitSetM11670.nextClearBit(i);
            int size = arrayListM11687.size();
            arrayListArr = c13387.f44340;
            if (iNextClearBit >= size) {
                break;
            }
            C11871 c11871 = (C11871) arrayListM11687.get(iNextClearBit);
            i = iNextClearBit + 1;
            for (int i2 = 0; i2 < c11871.m29613().size(); i2++) {
                AbstractC22454 abstractC22454 = (AbstractC22454) c11871.m29613().get(i2);
                C0727 c0727Mo17429 = abstractC22454.mo17429();
                int size2 = c0727Mo17429.size();
                if (size2 != 0) {
                    hashSet.add(abstractC22454);
                }
                for (int i3 = 0; i3 < size2; i3++) {
                    arrayListArr[c0727Mo17429.m15275get(i3).m38400()].remove(abstractC22454);
                }
                C16251 c16251M49955 = abstractC22454.m49955();
                if (c16251M49955 != null) {
                    for (AbstractC22454 abstractC22455 : arrayListArr[c16251M49955.m38400()]) {
                        if (abstractC22455 instanceof C9859) {
                            ((C9859) abstractC22455).m24964(c16251M49955);
                        }
                    }
                }
            }
        }
        c4108.m11671(hashSet);
        HashSet hashSet2 = new HashSet();
        C1391 c1391 = new C1391();
        BitSet bitSet = c13387.f44339;
        c1391.f5791 = bitSet;
        c4108.m11672(c1391);
        while (true) {
            int iNextSetBit = bitSet.nextSetBit(0);
            if (iNextSetBit >= 0) {
                bitSet.clear(iNextSetBit);
                if (arrayListArr[iNextSetBit].size() == 0 || c13387.m32883(null, iNextSetBit)) {
                    AbstractC22454 abstractC22454M11684 = c4108.m11684(iNextSetBit);
                    if (!hashSet2.contains(abstractC22454M11684)) {
                        C0727 c0727Mo174210 = abstractC22454M11684.mo17429();
                        int size3 = c0727Mo174210.size();
                        for (int i4 = 0; i4 < size3; i4++) {
                            C16251 c16251M15275get = c0727Mo174210.m15275get(i4);
                            arrayListArr[c16251M15275get.m38400()].remove(abstractC22454M11684);
                            AbstractC22454 abstractC22454M11685 = c4108.m11684(c16251M15275get.m38400());
                            if (!(abstractC22454M11685 == null ? true : abstractC22454M11685.mo17422())) {
                                bitSet.set(c16251M15275get.m38400());
                            }
                        }
                        hashSet2.add(abstractC22454M11684);
                    }
                }
            } else {
                c4108.m11671(hashSet2);
                return;
            }
        }
    }

    public C13387(C4108 c4108) {
        int iM11685 = c4108.m11685();
        this.f44338 = iM11685;
        this.f44339 = new BitSet(iM11685);
        this.f44340 = c4108.m11668();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m32883(BitSet bitSet, int i) {
        if (bitSet == null || !bitSet.get(i)) {
            ArrayList[] arrayListArr = this.f44340;
            for (AbstractC22454 abstractC22454 : arrayListArr[i]) {
                if (abstractC22454 == null ? true : abstractC22454.mo17422()) {
                    return false;
                }
            }
            if (bitSet == null) {
                bitSet = new BitSet(this.f44338);
            }
            bitSet.set(i);
            Iterator it = arrayListArr[i].iterator();
            while (it.hasNext()) {
                C16251 c16251M49955 = ((AbstractC22454) it.next()).m49955();
                if (c16251M49955 == null || !m32883(bitSet, c16251M49955.m38400())) {
                    return false;
                }
            }
        }
        return true;
    }
}
