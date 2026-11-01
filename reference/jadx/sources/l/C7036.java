package l;

import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: renamed from: l.ۜ᩸ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: MBI9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7036 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4213[] f23641;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayList f23642;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C4108 f23643;

    public C7036(C4108 c4108) {
        this.f23643 = c4108;
        ArrayList arrayListM11687 = c4108.m11687();
        this.f23642 = arrayListM11687;
        int size = arrayListM11687.size();
        this.f23641 = new C4213[size];
        for (int i = 0; i < size; i++) {
            C4213[] c4213Arr = this.f23641;
            C4213 c4213 = new C4213();
            c4213.f15296 = -1;
            c4213Arr[i] = c4213;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4213[] m18873() {
        InterfaceC6952 c18241;
        ArrayList arrayList = this.f23642;
        int size = arrayList.size();
        C4108 c4108 = this.f23643;
        C4213[] c4213Arr = this.f23641;
        C21853.m48635(c4108, c4213Arr);
        int size2 = arrayList.size();
        for (int i = 0; i < size2; i++) {
            int i2 = c4213Arr[i].f15296;
            if (i2 != -1) {
                ((C11871) arrayList.get(i2)).m29605((C11871) arrayList.get(i));
            }
        }
        for (int i3 = 0; i3 < size; i3++) {
            C4213 c4213 = c4213Arr[i3];
            if (size <= 3072) {
                c18241 = new C1991(size);
            } else {
                c18241 = new C18241();
            }
            c4213.f15295 = c18241;
        }
        int size3 = arrayList.size();
        for (int i4 = 0; i4 < size3; i4++) {
            C11871 c11871 = (C11871) arrayList.get(i4);
            C4213 c4214 = c4213Arr[i4];
            BitSet bitSetM29596 = c11871.m29596();
            if (bitSetM29596.cardinality() > 1) {
                for (int iNextSetBit = bitSetM29596.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSetM29596.nextSetBit(iNextSetBit + 1)) {
                    int i5 = iNextSetBit;
                    while (i5 != c4214.f15296 && i5 != -1) {
                        C4213 c4215 = c4213Arr[i5];
                        if (c4215.f15295.mo6408(i4)) {
                            break;
                        }
                        c4215.f15295.add(i4);
                        i5 = c4215.f15296;
                    }
                }
            }
        }
        return c4213Arr;
    }
}
