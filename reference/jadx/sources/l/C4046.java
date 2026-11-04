package l;

import java.io.InterruptedIOException;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۘۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 574A */
/* JADX INFO: loaded from: classes2.dex */
public final class C4046 implements AutoCloseable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f13785;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final HashMap f13786 = new HashMap();

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        this.f13785 = true;
        notifyAll();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C6284 m13012(String str) {
        C12249 c12249;
        if (this.f13785) {
            throw new InterruptedIOException("HLS playlist cache coordinator was closed");
        }
        c12249 = (C12249) C11392.computeIfAbsent(this.f13786, str, new C20454());
        c12249.f39407++;
        return new C6284(this, c12249);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13010(C4046 c4046, C12249 c12249) {
        c4046.getClass();
        if (c12249.f39406 == null && c12249.f39405 == 0 && c12249.f39407 == 0) {
            C11392.remove(c4046.f13786, c12249.f39404, c12249);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterruptedIOException m13009(String str, InterruptedException interruptedException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException(str);
        if (interruptedException != null) {
            interruptedIOException.initCause(interruptedException);
        }
        return interruptedIOException;
    }
}
