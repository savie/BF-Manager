package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧᩳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: TBH1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11165 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20337 f37844;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17661 m28099(C4108 c4108, boolean z) {
        int i;
        Iterator it;
        C7742 c7742M47460 = new C21042(c4108, new C11165(c4108, z).f37844).m47460();
        c4108.m11691();
        c4108.m11674(c7742M47460);
        ArrayList<C11871> arrayListM11687 = c4108.m11687();
        for (C11871 c11871 : arrayListM11687) {
            c11871.m29603(new C6225(arrayListM11687));
            c11871.m29624();
        }
        Iterator it2 = arrayListM11687.iterator();
        while (it2.hasNext()) {
            ((C11871) it2.next()).m29612();
        }
        int iM11665 = c4108.m11665();
        C11976 c11976 = new C11976(c4108.m11685());
        int iM11685 = c4108.m11685();
        int i2 = 0;
        while (true) {
            i = 1;
            if (i2 >= iM11685) {
                break;
            }
            if (i2 < iM11665) {
                c11976.mo20392(i2, (iM11685 - iM11665) + i2, 1);
            } else {
                c11976.mo20392(i2, i2 - iM11665, 1);
            }
            i2++;
        }
        c4108.m11674(c11976);
        c4108.m11675(new C17514(c4108.m11687()));
        ArrayList arrayListM11688 = c4108.m11687();
        C11871 c11871M11680 = c4108.m11680();
        BitSet bitSetM11670 = c4108.m11670();
        int iCardinality = bitSetM11670.cardinality();
        if (c11871M11680 != null && bitSetM11670.get(c11871M11680.m29617())) {
            iCardinality--;
        }
        C5667 c5667 = new C5667(iCardinality);
        Iterator it3 = arrayListM11688.iterator();
        int i3 = 0;
        while (it3.hasNext()) {
            C11871 c11872 = (C11871) it3.next();
            if (!bitSetM11670.get(c11872.m29617()) || c11872 == c11871M11680) {
                it = it3;
            } else {
                int i4 = i3 + 1;
                C4129 c4129M29621 = c11872.m29621();
                int iM29610 = c11872.m29610();
                C11871 c11871M11681 = c4108.m11680();
                int iM11755 = c4129M29621.m11755(c11871M11681 == null ? -1 : c11871M11681.m29627());
                if (iM11755 < 0) {
                    iM11755 = -1;
                }
                if (iM11755 >= 0) {
                    if (c4129M29621.size() > i) {
                        throw new RuntimeException("Exit predecessor must have no other successors".concat(C22475.m49982(c11872.m29627())));
                    }
                    c4129M29621 = C4129.f15128;
                    C12723 c12723Mo17426 = ((AbstractC22454) C19084.m43861(c11872.m29613(), i)).mo17426();
                    if (c12723Mo17426.m31577() != 2 && c12723Mo17426 != C6372.f21549) {
                        throw new RuntimeException("Exit predecessor must end in valid exit statement.");
                    }
                    iM29610 = -1;
                }
                c4129M29621.mo9637();
                int iM29627 = c11872.m29627();
                ArrayList arrayListM29613 = c11872.m29613();
                int size = arrayListM29613.size();
                C21895 c21895 = new C21895(size);
                int i5 = 0;
                while (i5 < size) {
                    c21895.m15260(i5, ((AbstractC22454) arrayListM29613.get(i5)).mo17421());
                    i5++;
                    it3 = it3;
                }
                it = it3;
                c21895.mo9637();
                c5667.m15551(i3, new C12018(iM29627, c21895, c4129M29621, iM29610));
                i3 = i4;
            }
            i = 1;
            it3 = it;
        }
        if (c11871M11680 == null || c11871M11680.m29613().isEmpty()) {
            return new C16104(new C17661(c5667, c4108.m11669(c4108.m11666()))).m38137();
        }
        throw new RuntimeException("Exit block must have no insns when leaving SSA form");
    }

    public C11165(C4108 c4108, boolean z) {
        this.f37844 = C16809.m39453(c4108);
    }
}
