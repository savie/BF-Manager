package l;

import android.os.SystemClock;

/* JADX INFO: renamed from: l.֫۠֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R9JP */
/* JADX INFO: loaded from: classes3.dex */
public final class C1690 extends C11874 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f6700;

    public C1690(C10864 c10864) {
        super(c10864);
        this.f6700 = SystemClock.uptimeMillis();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m5612() {
        try {
            ((C10864) mo28254()).f36941.m46891("MT_PING$").close();
        } catch (C10360 e) {
            if (e.m26258() != EnumC3055.STATUS_BAD_NETWORK_NAME.getValue()) {
                throw e;
            }
        }
        this.f6700 = SystemClock.uptimeMillis();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m5611() {
        return SystemClock.uptimeMillis() - this.f6700 > 30000;
    }
}
