package l;

import android.os.SystemClock;

/* JADX INFO: renamed from: l.۠֡۫, reason: contains not printable characters */
/* JADX INFO: compiled from: R9JP */
/* JADX INFO: loaded from: classes4.dex */
public final class C8264 extends C4489 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f27201;

    public C8264(C0806 c0806) {
        super(c0806);
        this.f27201 = SystemClock.uptimeMillis();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m22282() {
        try {
            ((C0806) mo14204()).f2862.m27582("MT_PING$").close();
        } catch (C22172 e) {
            if (e.m50141() != EnumC20243.STATUS_BAD_NETWORK_NAME.getValue()) {
                throw e;
            }
        }
        this.f27201 = SystemClock.uptimeMillis();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m22281() {
        return SystemClock.uptimeMillis() - this.f27201 > 30000;
    }
}
