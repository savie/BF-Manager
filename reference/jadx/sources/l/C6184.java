package l;

import android.os.SystemClock;

/* JADX INFO: renamed from: l.ۛۚܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05B9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6184 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f21068;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f21069;

    public C6184(int i) {
        this.f21068 = i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m17825() {
        this.f21069 = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17824() {
        int iCurrentTimeMillis = (int) (((long) this.f21068) - (System.currentTimeMillis() - this.f21069));
        if (iCurrentTimeMillis > 0) {
            SystemClock.sleep(iCurrentTimeMillis);
        }
    }
}
