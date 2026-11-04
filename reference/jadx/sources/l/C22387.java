package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩷᩺ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06VH */
/* JADX INFO: loaded from: classes.dex */
public final class C22387 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f72480;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f72481;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f72482;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object f72483;

    public C22387(int i, int i2, boolean z, Object obj) {
        this.f72482 = i;
        this.f72480 = i2;
        this.f72481 = z;
        this.f72483 = obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22387 m50464(int[] iArr, ArrayList arrayList, int i) {
        int i2 = iArr[i];
        if (i2 == 16) {
            return new C22387(i2, iArr[i + 2], iArr[i + 3] != 0, null);
        }
        if (i2 == 1 || i2 == 42) {
            return new C22387(i2, 0, false, arrayList.get(iArr[i + 2]));
        }
        return null;
    }
}
