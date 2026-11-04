package l;

import android.os.SystemClock;

/* JADX INFO: renamed from: l.᩷ۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56BZ */
/* JADX INFO: loaded from: classes.dex */
public final class C21990 implements AutoCloseable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C7402 f70945;

    public C21990(C7402 c7402) {
        this.f70945 = c7402;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        int i;
        C7402 c7402 = this.f70945;
        if (c7402 != null) {
            synchronized (c7402.f24389) {
                if (!c7402.f24399 && (i = c7402.f24387) > 0) {
                    int i2 = i - 1;
                    c7402.f24387 = i2;
                    if (i2 == 0) {
                        long j = c7402.f24400;
                        ((C9732) c7402.f24389.f34277).getClass();
                        c7402.f24400 = j + Math.max(0L, SystemClock.elapsedRealtime() - c7402.f24393);
                        c7402.f24397 = EnumC4836.RUNNING;
                        c7402.f24389.m27520();
                    }
                }
            }
            this.f70945 = null;
        }
    }
}
