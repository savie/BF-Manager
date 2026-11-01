package l;

import android.os.SystemClock;

/* JADX INFO: renamed from: l.᩷ۛ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 05B9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20697 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f67312;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f67313;

    public C20697(int i) {
        this.f67312 = i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m46548() {
        this.f67313 = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46547() {
        int iCurrentTimeMillis = (int) (((long) this.f67312) - (System.currentTimeMillis() - this.f67313));
        if (iCurrentTimeMillis > 0) {
            SystemClock.sleep(iCurrentTimeMillis);
        }
    }
}
