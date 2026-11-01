package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.֨۟ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06VH */
/* JADX INFO: loaded from: classes2.dex */
public final class C0973 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Object f3804;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f3805;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f3806;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f3807;

    public C0973(int i, int i2, boolean z, Object obj) {
        this.f3807 = i;
        this.f3805 = i2;
        this.f3806 = z;
        this.f3804 = obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0973 m3764(int[] iArr, ArrayList arrayList, int i) {
        int i2 = iArr[i];
        if (i2 == 16) {
            return new C0973(i2, iArr[i + 2], iArr[i + 3] != 0, null);
        }
        if (i2 == 1 || i2 == 42) {
            return new C0973(i2, 0, false, arrayList.get(iArr[i + 2]));
        }
        return null;
    }
}
