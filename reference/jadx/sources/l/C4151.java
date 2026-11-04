package l;

import android.util.StateSet;

/* JADX INFO: renamed from: l.ۘ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: T9OD */
/* JADX INFO: loaded from: classes3.dex */
public class C4151 extends AbstractC20559 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int[][] f14105;

    @Override // l.AbstractC20559
    /* JADX INFO: renamed from: ᩴ */
    public void mo6582() {
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m13305(int[] iArr) {
        int[][] iArr2 = this.f14105;
        int i = this.f65825;
        for (int i2 = 0; i2 < i; i2++) {
            if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                return i2;
            }
        }
        return -1;
    }
}
