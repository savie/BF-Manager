package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;

/* JADX INFO: renamed from: l.᩸᩸ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBDM */
/* JADX INFO: loaded from: classes4.dex */
public final class C21853 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f70927;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayList f70928;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C23265[] f70929;

    public C21853(C4108 c4108, C4213[] c4213Arr) {
        ArrayList arrayListM11687 = c4108.m11687();
        this.f70927 = arrayListM11687;
        this.f70929 = new C23265[arrayListM11687.size() + 2];
        this.f70928 = new ArrayList();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48635(C4108 c4108, C4213[] c4213Arr) {
        int i;
        C23265[] c23265Arr;
        int i2;
        C21853 c21853 = new C21853(c4108, c4213Arr);
        C11871 c11871M11683 = c4108.m11683();
        ArrayList arrayList = c21853.f70928;
        if (c11871M11683 != null) {
            arrayList.add(c11871M11683);
            c4213Arr[c11871M11683.m29617()].f15296 = c11871M11683.m29617();
        }
        c4108.m11675(new C15504(c21853));
        int size = arrayList.size() - 1;
        int i3 = size;
        while (true) {
            c23265Arr = c21853.f70929;
            if (i3 < 2) {
                break;
            }
            C11871 c11871 = (C11871) arrayList.get(i3);
            C23265 c23265 = c23265Arr[c11871.m29617()];
            BitSet bitSetM29596 = c11871.m29596();
            for (int iNextSetBit = bitSetM29596.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSetM29596.nextSetBit(iNextSetBit + 1)) {
                C11871 c11872 = (C11871) c21853.f70927.get(iNextSetBit);
                if (c23265Arr[c11872.m29617()] != null && (i2 = c23265Arr[c21853.m48634(c11872).m29617()].f75490) < c23265.f75490) {
                    c23265.f75490 = i2;
                }
            }
            c23265Arr[((C11871) arrayList.get(c23265.f75490)).m29617()].f75492.add(c11871);
            C11871 c11873 = c23265.f75491;
            c23265.f75489 = c11873;
            ArrayList arrayList2 = c23265Arr[c11873.m29617()].f75492;
            while (!arrayList2.isEmpty()) {
                C11871 c11874 = (C11871) C17745.m41308(arrayList2, 1);
                C11871 c11871M48634 = c21853.m48634(c11874);
                if (c23265Arr[c11871M48634.m29617()].f75490 < c23265Arr[c11874.m29617()].f75490) {
                    c4213Arr[c11874.m29617()].f15296 = c11871M48634.m29617();
                } else {
                    c4213Arr[c11874.m29617()].f15296 = c23265.f75491.m29617();
                }
            }
            i3--;
        }
        for (i = 2; i <= size; i++) {
            C11871 c11875 = (C11871) arrayList.get(i);
            if (c4213Arr[c11875.m29617()].f15296 != ((C11871) arrayList.get(c23265Arr[c11875.m29617()].f75490)).m29617()) {
                c4213Arr[c11875.m29617()].f15296 = c4213Arr[c4213Arr[c11875.m29617()].f15296].f15296;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C11871 m48634(C11871 c11871) {
        int iM29617 = c11871.m29617();
        C23265[] c23265Arr = this.f70929;
        C23265 c23265 = c23265Arr[iM29617];
        if (c23265.f75489 == null) {
            return c11871;
        }
        if (c23265Arr[c23265Arr[c11871.m29617()].f75489.m29617()].f75489 != null) {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            arrayList.add(c11871);
            while (!arrayList.isEmpty()) {
                int size = arrayList.size() - 1;
                C23265 c23266 = c23265Arr[((C11871) arrayList.get(size)).m29617()];
                C11871 c11872 = c23266.f75489;
                C23265 c23267 = c23265Arr[c11872.m29617()];
                if (hashSet.add(c11872) && c23267.f75489 != null) {
                    arrayList.add(c11872);
                } else {
                    arrayList.remove(size);
                    if (c23267.f75489 != null) {
                        C11871 c11873 = c23267.f75488;
                        if (c23265Arr[c11873.m29617()].f75490 < c23265Arr[c23266.f75488.m29617()].f75490) {
                            c23266.f75488 = c11873;
                        }
                        c23266.f75489 = c23267.f75489;
                    }
                }
            }
        }
        return c23265.f75488;
    }
}
