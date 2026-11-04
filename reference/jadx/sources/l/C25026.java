package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩻ۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5BHG */
/* JADX INFO: loaded from: classes.dex */
public final class C25026 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1905 f80975;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final HashMap f80976 = new HashMap();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final BitSet f80977;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16820 f80978;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f80979;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f80980;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f80981;

    public C25026(C16820 c16820, C1905 c1905, ArrayList arrayList) {
        this.f80978 = c16820;
        this.f80977 = new BitSet(c16820.f54270);
        this.f80975 = c1905;
        this.f80980 = arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55853(C22438 c22438) {
        C24698 c24698M55041;
        int i = 0;
        this.f80979 = c22438.m50590().get(0);
        int i2 = 1;
        int i3 = c22438.m50590().get(1);
        this.f80981 = i3;
        int iM55852 = m55852(i3);
        BitSet bitSet = this.f80977;
        int iNextSetBit = bitSet.nextSetBit(0);
        while (true) {
            ArrayList arrayList = this.f80980;
            C16820 c16820 = this.f80978;
            if (iNextSetBit >= 0) {
                bitSet.clear(iNextSetBit);
                int iIntValue = ((Integer) this.f80976.get(Integer.valueOf(iNextSetBit))).intValue();
                C22438 c22438M39737 = c16820.m39737(iNextSetBit);
                C24698 c24698M50590 = c22438M39737.m50590();
                int i4 = -1;
                if (C16820.m39730(c16820, c22438M39737)) {
                    int iM55853 = m55852(c24698M50590.get(i));
                    int i5 = c24698M50590.get(i2);
                    c24698M55041 = new C24698(2);
                    c24698M55041.add(iM55853);
                    c24698M55041.add(i5);
                    c24698M55041.mo15005();
                } else {
                    C11599 c11599M39736 = C16820.m39736(c16820, iNextSetBit);
                    if (c11599M39736 != null) {
                        if (c11599M39736.f36420 != this.f80981) {
                            throw new RuntimeException("ret instruction returns to label " + C5306.m15934(c11599M39736.f36420) + " expected: " + C5306.m15934(this.f80981));
                        }
                        c24698M55041 = C24698.m55041(this.f80979);
                        i4 = this.f80979;
                    } else {
                        int iM50593 = c22438M39737.m50593();
                        int size = c24698M50590.size();
                        C24698 c24698 = new C24698(size);
                        for (int i6 = 0; i6 < size; i6++) {
                            int i7 = c24698M50590.get(i6);
                            int iM55854 = m55852(i7);
                            c24698.add(iM55854);
                            if (iM50593 == i7) {
                                i4 = iM55854;
                            }
                        }
                        c24698.mo15005();
                        c24698M55041 = c24698;
                    }
                }
                C15724 c15724M50596 = c22438M39737.m50596();
                int size2 = c15724M50596.size();
                int i8 = 0;
                for (int i9 = 0; i9 < size2; i9++) {
                    if (c15724M50596.m31617get(i9).m40434() != C0809.f2895) {
                        i8++;
                    }
                }
                if (i8 != size2) {
                    C15724 c15724 = new C15724(i8);
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < size2) {
                        AbstractC17216 abstractC17216M31617get = c15724M50596.m31617get(i10);
                        C15724 c15725 = c15724M50596;
                        int i12 = size2;
                        if (abstractC17216M31617get.m40434() != C0809.f2895) {
                            c15724.m31603(i11, abstractC17216M31617get);
                            i11++;
                        }
                        i10++;
                        c15724M50596 = c15725;
                        size2 = i12;
                    }
                    c15724.mo15005();
                    c15724M50596 = c15724;
                }
                c16820.m39729(new C22438(iIntValue, c15724M50596, c24698M55041, i4), (C24698) arrayList.get(iIntValue));
                if (C16820.m39730(c16820, c16820.m39737(iNextSetBit))) {
                    new C25026(c16820, this.f80975, arrayList).m55853(c16820.m39737(iIntValue));
                }
                i = 0;
                iNextSetBit = bitSet.nextSetBit(0);
                i2 = 1;
            } else {
                C16820.m39739(c16820, new C22438(c22438.mo31292(), c22438.m50596(), C24698.m55041(iM55852), iM55852), (C24698) arrayList.get(c22438.mo31292()));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m55852(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f80976;
        Integer num = (Integer) map.get(numValueOf);
        if (num != null) {
            return num.intValue();
        }
        int i2 = this.f80981;
        ArrayList arrayList = this.f80980;
        C24698 c24698 = (C24698) arrayList.get(i);
        if (c24698 == null || c24698.size() <= 0 || c24698.m55042() != i2) {
            return i;
        }
        int iMo6562 = this.f80975.mo6562();
        this.f80977.set(i);
        map.put(Integer.valueOf(i), Integer.valueOf(iMo6562));
        while (arrayList.size() <= iMo6562) {
            arrayList.add(null);
        }
        arrayList.set(iMo6562, (C24698) arrayList.get(i));
        return iMo6562;
    }
}
