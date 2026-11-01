package l;

import java.io.InterruptedIOException;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܳۡ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 574A */
/* JADX INFO: loaded from: classes4.dex */
public final class C14424 implements AutoCloseable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f47297;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final HashMap f47298 = new HashMap();

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        this.f47297 = true;
        notifyAll();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C10896 m34694(String str) {
        C5956 c5956;
        if (this.f47297) {
            throw new InterruptedIOException("HLS playlist cache coordinator was closed");
        }
        c5956 = (C5956) C9735.computeIfAbsent(this.f47298, str, new C17245());
        c5956.f20258++;
        return new C10896(this, c5956);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34692(C14424 c14424, C5956 c5956) {
        c14424.getClass();
        if (c5956.f20261 == null && c5956.f20260 == 0 && c5956.f20258 == 0) {
            C9735.remove(c14424.f47298, c5956.f20259, c5956);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterruptedIOException m34691(String str, InterruptedException interruptedException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException(str);
        if (interruptedException != null) {
            interruptedIOException.initCause(interruptedException);
        }
        return interruptedIOException;
    }
}
