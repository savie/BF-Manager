package l;

import android.util.StateSet;

/* JADX INFO: renamed from: l.ۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T9OD */
/* JADX INFO: loaded from: classes3.dex */
public class C9950 extends AbstractC18416 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int[][] f34010;

    @Override // l.AbstractC18416
    /* JADX INFO: renamed from: ۚ */
    public void mo3328() {
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m25175(int[] iArr) {
        int[][] iArr2 = this.f34010;
        int i = this.f58706;
        for (int i2 = 0; i2 < i; i2++) {
            if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                return i2;
            }
        }
        return -1;
    }
}
