package l;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.۟ۡ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: O6OW */
/* JADX INFO: loaded from: classes3.dex */
public final class C7788 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f25857;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20227 f25859;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final CountDownLatch f25858 = new CountDownLatch(2);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AtomicReference f25860 = new AtomicReference();

    public C7788(C20227 c20227) {
        this.f25859 = c20227;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m21180(C24132 c24132, CharSequence charSequence, AbstractC22044 abstractC22044, C24132 c24133, CharSequence charSequence2, AbstractC22044 abstractC22045) throws Throwable {
        boolean z;
        RunnableC0330 runnableC0330 = new RunnableC0330(this, c24132, charSequence, abstractC22044);
        RunnableC0330 runnableC0331 = new RunnableC0330(this, c24133, charSequence2, abstractC22045);
        boolean z2 = false;
        try {
            runnableC0330.m2043();
            runnableC0331.m2043();
            while (this.f25858.getCount() != 0) {
                if (m21177()) {
                    runnableC0330.m2044();
                    runnableC0331.m2044();
                }
                try {
                    try {
                        this.f25858.await(20L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException unused) {
                        this.f25857 = true;
                        z2 = true;
                    }
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            while (m21177() && (c24132.m53884() || c24133.m53884())) {
                c24132.m54012();
                c24133.m54012();
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException unused2) {
                    this.f25857 = true;
                    z2 = true;
                }
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
            Throwable th2 = (Throwable) this.f25860.get();
            if (th2 instanceof IOException) {
                IOException iOException = (IOException) th2;
                C22327.m50389(iOException);
                throw iOException;
            }
            if (th2 instanceof RuntimeException) {
                RuntimeException runtimeException = (RuntimeException) th2;
                C22327.m50389(runtimeException);
                throw runtimeException;
            }
            if (th2 instanceof Error) {
                Error error = (Error) th2;
                C22327.m50389(error);
                throw error;
            }
            return !m21177();
        } catch (Throwable th3) {
            th = th3;
            z = z2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m21177() {
        return this.f25857 || this.f25860.get() != null || this.f25859.f64919.m55624();
    }
}
