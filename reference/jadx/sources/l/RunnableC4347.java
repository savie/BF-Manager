package l;

import android.util.Base64;
import java.security.MessageDigest;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۙۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: L19N */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC4347 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC5614 f15552;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C12107 f15553;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicReference f15554;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ThreadLocal f15555;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicBoolean f15556;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22212 f15557;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f15558;

    public RunnableC4347(C12107 c12107, ThreadLocal threadLocal, String str, InterfaceC5614 interfaceC5614, AtomicBoolean atomicBoolean, C22212 c22212, AtomicReference atomicReference) {
        this.f15552 = interfaceC5614;
        this.f15556 = atomicBoolean;
        this.f15557 = c22212;
        this.f15554 = atomicReference;
        this.f15553 = c12107;
        this.f15555 = threadLocal;
        this.f15558 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        C12107 c12107 = this.f15553;
        if (this.f15552.mo2357()) {
            return;
        }
        AtomicBoolean atomicBoolean = this.f15556;
        if (atomicBoolean.get()) {
            return;
        }
        try {
            MessageDigest messageDigest = (MessageDigest) this.f15555.get();
            C13638.requireNonNull(messageDigest);
            C22253.m49417(messageDigest, this.f15557.m49332().m7471(c12107));
            if (Base64.encodeToString(messageDigest.digest(), 2).equals(this.f15558)) {
                return;
            }
            c12107.m30135();
            atomicBoolean.set(true);
        } catch (Throwable th) {
            atomicBoolean.set(true);
            do {
                atomicReference = this.f15554;
                if (atomicReference.compareAndSet(null, th)) {
                    return;
                }
            } while (atomicReference.get() == null);
        }
    }
}
