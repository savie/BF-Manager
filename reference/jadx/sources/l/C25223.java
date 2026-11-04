package l;

import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: renamed from: l.᩻ᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: MBI9 */
/* JADX INFO: loaded from: classes.dex */
public final class C25223 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11796[] f81472;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList f81473;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C24960 f81474;

    public C25223(C24960 c24960) {
        this.f81474 = c24960;
        ArrayList arrayListM55749 = c24960.m55749();
        this.f81473 = arrayListM55749;
        int size = arrayListM55749.size();
        this.f81472 = new C11796[size];
        for (int i = 0; i < size; i++) {
            C11796[] c11796Arr = this.f81472;
            C11796 c11796 = new C11796();
            c11796.f38103 = -1;
            c11796Arr[i] = c11796;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11796[] m56228() {
        InterfaceC16492 c3068;
        ArrayList arrayList = this.f81473;
        int size = arrayList.size();
        C24960 c24960 = this.f81474;
        C11796[] c11796Arr = this.f81472;
        C16271.m38603(c24960, c11796Arr);
        int size2 = arrayList.size();
        for (int i = 0; i < size2; i++) {
            int i2 = c11796Arr[i].f38103;
            if (i2 != -1) {
                ((C19738) arrayList.get(i2)).m45456((C19738) arrayList.get(i));
            }
        }
        for (int i3 = 0; i3 < size; i3++) {
            C11796 c11796 = c11796Arr[i3];
            if (size <= 3072) {
                c3068 = new C13770(size);
            } else {
                c3068 = new C3068();
            }
            c11796.f38102 = c3068;
        }
        int size3 = arrayList.size();
        for (int i4 = 0; i4 < size3; i4++) {
            C19738 c19738 = (C19738) arrayList.get(i4);
            C11796 c11797 = c11796Arr[i4];
            BitSet bitSetM45465 = c19738.m45465();
            if (bitSetM45465.cardinality() > 1) {
                for (int iNextSetBit = bitSetM45465.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSetM45465.nextSetBit(iNextSetBit + 1)) {
                    int i5 = iNextSetBit;
                    while (i5 != c11797.f38103 && i5 != -1) {
                        C11796 c11798 = c11796Arr[i5];
                        if (c11798.f38102.mo10004(i4)) {
                            break;
                        }
                        c11798.f38102.add(i4);
                        i5 = c11798.f38103;
                    }
                }
            }
        }
        return c11796Arr;
    }
}
