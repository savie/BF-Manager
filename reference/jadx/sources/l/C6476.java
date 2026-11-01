package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۜۖܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5BHG */
/* JADX INFO: loaded from: classes2.dex */
public final class C6476 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final BitSet f21853;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f21854;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12827 f21855;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f21856;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final HashMap f21857 = new HashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f21858;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22705 f21859;

    public C6476(C22705 c22705, C12827 c12827, ArrayList arrayList) {
        this.f21859 = c22705;
        this.f21853 = new BitSet(c22705.f73960);
        this.f21855 = c12827;
        this.f21858 = arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17672(C12018 c12018) {
        C4129 c4129M11753;
        int i = 0;
        this.f21856 = c12018.m29916().get(0);
        int i2 = 1;
        int i3 = c12018.m29916().get(1);
        this.f21854 = i3;
        int iM17671 = m17671(i3);
        BitSet bitSet = this.f21853;
        int iNextSetBit = bitSet.nextSetBit(0);
        while (true) {
            ArrayList arrayList = this.f21858;
            C22705 c22705 = this.f21859;
            if (iNextSetBit >= 0) {
                bitSet.clear(iNextSetBit);
                int iIntValue = ((Integer) this.f21857.get(Integer.valueOf(iNextSetBit))).intValue();
                C12018 c12018M50338 = c22705.m50338(iNextSetBit);
                C4129 c4129M29916 = c12018M50338.m29916();
                int i4 = -1;
                if (C22705.m50331(c22705, c12018M50338)) {
                    int iM17672 = m17671(c4129M29916.get(i));
                    int i5 = c4129M29916.get(i2);
                    c4129M11753 = new C4129(2);
                    c4129M11753.add(iM17672);
                    c4129M11753.add(i5);
                    c4129M11753.mo9637();
                } else {
                    C3653 c3653M50337 = C22705.m50337(c22705, iNextSetBit);
                    if (c3653M50337 != null) {
                        if (c3653M50337.f13390 != this.f21854) {
                            throw new RuntimeException("ret instruction returns to label " + C22475.m49982(c3653M50337.f13390) + " expected: " + C22475.m49982(this.f21854));
                        }
                        c4129M11753 = C4129.m11753(this.f21856);
                        i4 = this.f21856;
                    } else {
                        int iM29918 = c12018M50338.m29918();
                        int size = c4129M29916.size();
                        C4129 c4129 = new C4129(size);
                        for (int i6 = 0; i6 < size; i6++) {
                            int i7 = c4129M29916.get(i6);
                            int iM17673 = m17671(i7);
                            c4129.add(iM17673);
                            if (iM29918 == i7) {
                                i4 = iM17673;
                            }
                        }
                        c4129.mo9637();
                        c4129M11753 = c4129;
                    }
                }
                C21895 c21895M29911 = c12018M50338.m29911();
                int size2 = c21895M29911.size();
                int i8 = 0;
                for (int i9 = 0; i9 < size2; i9++) {
                    if (c21895M29911.m15274get(i9).m37181() != C6372.f21513) {
                        i8++;
                    }
                }
                if (i8 != size2) {
                    C21895 c21895 = new C21895(i8);
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < size2) {
                        AbstractC15546 abstractC15546M15274get = c21895M29911.m15274get(i10);
                        C21895 c21896 = c21895M29911;
                        int i12 = size2;
                        if (abstractC15546M15274get.m37181() != C6372.f21513) {
                            c21895.m15260(i11, abstractC15546M15274get);
                            i11++;
                        }
                        i10++;
                        c21895M29911 = c21896;
                        size2 = i12;
                    }
                    c21895.mo9637();
                    c21895M29911 = c21895;
                }
                c22705.m50326(new C12018(iIntValue, c21895M29911, c4129M11753, i4), (C4129) arrayList.get(iIntValue));
                if (C22705.m50331(c22705, c22705.m50338(iNextSetBit))) {
                    new C6476(c22705, this.f21855, arrayList).m17672(c22705.m50338(iIntValue));
                }
                i = 0;
                iNextSetBit = bitSet.nextSetBit(0);
                i2 = 1;
            } else {
                C22705.m50340(c22705, new C12018(c12018.mo29913(), c12018.m29911(), C4129.m11753(iM17671), iM17671), (C4129) arrayList.get(c12018.mo29913()));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m17671(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f21857;
        Integer num = (Integer) map.get(numValueOf);
        if (num != null) {
            return num.intValue();
        }
        int i2 = this.f21854;
        ArrayList arrayList = this.f21858;
        C4129 c4129 = (C4129) arrayList.get(i);
        if (c4129 == null || c4129.size() <= 0 || c4129.m11761() != i2) {
            return i;
        }
        int iMo3427 = this.f21855.mo3427();
        this.f21853.set(i);
        map.put(Integer.valueOf(i), Integer.valueOf(iMo3427));
        while (arrayList.size() <= iMo3427) {
            arrayList.add(null);
        }
        arrayList.set(iMo3427, (C4129) arrayList.get(i));
        return iMo3427;
    }
}
