package l;

import android.util.Base64;
import java.security.MessageDigest;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۡۤ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: L19N */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC9322 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicBoolean f30291;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicReference f30292;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C8002 f30293;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ThreadLocal f30294;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC7509 f30295;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15481 f30296;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f30297;

    public RunnableC9322(C8002 c8002, ThreadLocal threadLocal, String str, InterfaceC7509 interfaceC7509, AtomicBoolean atomicBoolean, C15481 c15481, AtomicReference atomicReference) {
        this.f30295 = interfaceC7509;
        this.f30291 = atomicBoolean;
        this.f30296 = c15481;
        this.f30292 = atomicReference;
        this.f30293 = c8002;
        this.f30294 = threadLocal;
        this.f30297 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        C8002 c8002 = this.f30293;
        if (this.f30295.mo924()) {
            return;
        }
        AtomicBoolean atomicBoolean = this.f30291;
        if (atomicBoolean.get()) {
            return;
        }
        try {
            MessageDigest messageDigest = (MessageDigest) this.f30294.get();
            C17359.requireNonNull(messageDigest);
            C15022.m36175(messageDigest, this.f30296.m37046().m51727(c8002));
            if (Base64.encodeToString(messageDigest.digest(), 2).equals(this.f30297)) {
                return;
            }
            c8002.m21848();
            atomicBoolean.set(true);
        } catch (Throwable th) {
            atomicBoolean.set(true);
            do {
                atomicReference = this.f30292;
                if (atomicReference.compareAndSet(null, th)) {
                    return;
                }
            } while (atomicReference.get() == null);
        }
    }
}
