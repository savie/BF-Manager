package l;

import android.os.SystemClock;

/* JADX INFO: renamed from: l.ۙᩴ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C7M1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5111 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12568 m15470(InterfaceC1470 interfaceC1470) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = interfaceC1470.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (interfaceC1470.mo5252(i2, jElapsedRealtime)) {
                i++;
            }
        }
        return new C12568(length, i);
    }
}
