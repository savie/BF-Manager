package l;

import android.util.SparseIntArray;

/* JADX INFO: renamed from: l.᩸֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B5F4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22442 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final SparseIntArray f72654 = new SparseIntArray();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final SparseIntArray f72653 = new SparseIntArray();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m50619(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        return i3 + 1 > i2 ? i4 + 1 : i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50620() {
        this.f72654.clear();
    }
}
