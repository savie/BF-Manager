package l;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: renamed from: l.֡ۨۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8NO */
/* JADX INFO: loaded from: classes3.dex */
public final class C0404 implements InterfaceC14814 {
    @Override // l.InterfaceC14814
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long mo2208() {
        return System.currentTimeMillis();
    }

    @Override // l.InterfaceC14814
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long mo2210() {
        return SystemClock.elapsedRealtime();
    }

    @Override // l.InterfaceC14814
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long mo2211() {
        return SystemClock.uptimeMillis();
    }

    @Override // l.InterfaceC14814
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long mo2212() {
        return System.nanoTime();
    }

    @Override // l.InterfaceC14814
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4879 mo2209(Looper looper, Handler.Callback callback) {
        return new C19049(new Handler(looper, callback));
    }
}
