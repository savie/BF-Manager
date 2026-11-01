package l;

import android.os.SystemClock;

/* JADX INFO: renamed from: l.۠ۚܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: C7M1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7970 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9382 m21026(InterfaceC6558 interfaceC6558) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = interfaceC6558.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (interfaceC6558.mo17791(i2, jElapsedRealtime)) {
                i++;
            }
        }
        return new C9382(length, i);
    }
}
