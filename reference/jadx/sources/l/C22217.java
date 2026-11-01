package l;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: renamed from: l.᩹ۤۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8NO */
/* JADX INFO: loaded from: classes.dex */
public final class C22217 implements InterfaceC11593 {
    @Override // l.InterfaceC11593
    /* JADX INFO: renamed from: ۙ */
    public final long mo28886() {
        return System.currentTimeMillis();
    }

    @Override // l.InterfaceC11593
    /* JADX INFO: renamed from: ۨ */
    public final long mo28888() {
        return SystemClock.elapsedRealtime();
    }

    @Override // l.InterfaceC11593
    /* JADX INFO: renamed from: ܰ */
    public final long mo28889() {
        return SystemClock.uptimeMillis();
    }

    @Override // l.InterfaceC11593
    /* JADX INFO: renamed from: ۖ */
    public final long mo28885() {
        return System.nanoTime();
    }

    @Override // l.InterfaceC11593
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC8065 mo28887(Looper looper, Handler.Callback callback) {
        return new C13045(new Handler(looper, callback));
    }
}
