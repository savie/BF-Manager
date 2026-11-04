package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֫ᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBFX */
/* JADX INFO: loaded from: classes2.dex */
public final class C2102 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f6961;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final BitSet f6962;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList[] f6963;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7272(C24960 c24960) {
        ArrayList[] arrayListArr;
        C2102 c2102 = new C2102(c24960);
        HashSet hashSet = new HashSet();
        BitSet bitSetM55727 = c24960.m55727();
        ArrayList arrayListM55749 = c24960.m55749();
        int i = 0;
        while (true) {
            int iNextClearBit = bitSetM55727.nextClearBit(i);
            int size = arrayListM55749.size();
            arrayListArr = c2102.f6963;
            if (iNextClearBit >= size) {
                break;
            }
            C19738 c19738 = (C19738) arrayListM55749.get(iNextClearBit);
            i = iNextClearBit + 1;
            for (int i2 = 0; i2 < c19738.m45460().size(); i2++) {
                AbstractC5568 abstractC5568 = (AbstractC5568) c19738.m45460().get(i2);
                C0063 c0063Mo4992 = abstractC5568.mo4992();
                int size2 = c0063Mo4992.size();
                if (size2 != 0) {
                    hashSet.add(abstractC5568);
                }
                for (int i3 = 0; i3 < size2; i3++) {
                    arrayListArr[c0063Mo4992.m31619get(i3).m47903()].remove(abstractC5568);
                }
                C20946 c20946M16508 = abstractC5568.m16508();
                if (c20946M16508 != null) {
                    for (AbstractC5568 abstractC5569 : arrayListArr[c20946M16508.m47903()]) {
                        if (abstractC5569 instanceof C14033) {
                            ((C14033) abstractC5569).m34185(c20946M16508);
                        }
                    }
                }
            }
        }
        c24960.m55728(hashSet);
        HashSet hashSet2 = new HashSet();
        C5831 c5831 = new C5831();
        BitSet bitSet = c2102.f6962;
        c5831.f20056 = bitSet;
        c24960.m55733(c5831);
        while (true) {
            int iNextSetBit = bitSet.nextSetBit(0);
            if (iNextSetBit >= 0) {
                bitSet.clear(iNextSetBit);
                if (arrayListArr[iNextSetBit].size() == 0 || c2102.m7273(null, iNextSetBit)) {
                    AbstractC5568 abstractC5568M55738 = c24960.m55738(iNextSetBit);
                    if (!hashSet2.contains(abstractC5568M55738)) {
                        C0063 c0063Mo4993 = abstractC5568M55738.mo4992();
                        int size3 = c0063Mo4993.size();
                        for (int i4 = 0; i4 < size3; i4++) {
                            C20946 c20946M31619get = c0063Mo4993.m31619get(i4);
                            arrayListArr[c20946M31619get.m47903()].remove(abstractC5568M55738);
                            AbstractC5568 abstractC5568M55739 = c24960.m55738(c20946M31619get.m47903());
                            if (!(abstractC5568M55739 == null ? true : abstractC5568M55739.mo4983())) {
                                bitSet.set(c20946M31619get.m47903());
                            }
                        }
                        hashSet2.add(abstractC5568M55738);
                    }
                }
            } else {
                c24960.m55728(hashSet2);
                return;
            }
        }
    }

    public C2102(C24960 c24960) {
        int iM55737 = c24960.m55737();
        this.f6961 = iM55737;
        this.f6962 = new BitSet(iM55737);
        this.f6963 = c24960.m55725();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m7273(BitSet bitSet, int i) {
        if (bitSet == null || !bitSet.get(i)) {
            ArrayList[] arrayListArr = this.f6963;
            for (AbstractC5568 abstractC5568 : arrayListArr[i]) {
                if (abstractC5568 == null ? true : abstractC5568.mo4983()) {
                    return false;
                }
            }
            if (bitSet == null) {
                bitSet = new BitSet(this.f6961);
            }
            bitSet.set(i);
            Iterator it = arrayListArr[i].iterator();
            while (it.hasNext()) {
                C20946 c20946M16508 = ((AbstractC5568) it.next()).m16508();
                if (c20946M16508 == null || !m7273(bitSet, c20946M16508.m47903())) {
                    return false;
                }
            }
        }
        return true;
    }
}
