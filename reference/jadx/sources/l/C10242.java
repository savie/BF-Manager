package l;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۤۧۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6OW */
/* JADX INFO: loaded from: classes3.dex */
public final class C10242 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f34936;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6568 f34938;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final CountDownLatch f34937 = new CountDownLatch(2);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AtomicReference f34935 = new AtomicReference();

    public C10242(C6568 c6568) {
        this.f34938 = c6568;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m26039(C6111 c6111, CharSequence charSequence, AbstractC20745 abstractC20745, C6111 c6112, CharSequence charSequence2, AbstractC20745 abstractC20746) throws Throwable {
        boolean z;
        RunnableC8831 runnableC8831 = new RunnableC8831(this, c6111, charSequence, abstractC20745);
        RunnableC8831 runnableC8832 = new RunnableC8831(this, c6112, charSequence2, abstractC20746);
        boolean z2 = false;
        try {
            runnableC8831.m22964();
            runnableC8832.m22964();
            while (this.f34937.getCount() != 0) {
                if (m26036()) {
                    runnableC8831.m22965();
                    runnableC8832.m22965();
                }
                try {
                    try {
                        this.f34937.await(20L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException unused) {
                        this.f34936 = true;
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
            while (m26036() && (c6111.m16973() || c6112.m16973())) {
                c6111.m17045();
                c6112.m17045();
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException unused2) {
                    this.f34936 = true;
                    z2 = true;
                }
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
            Throwable th2 = (Throwable) this.f34935.get();
            if (th2 instanceof IOException) {
                throw ((IOException) th2);
            }
            if (th2 instanceof RuntimeException) {
                throw ((RuntimeException) th2);
            }
            if (th2 instanceof Error) {
                throw ((Error) th2);
            }
            return !m26036();
        } catch (Throwable th3) {
            th = th3;
            z = z2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m26036() {
        return this.f34936 || this.f34935.get() != null || this.f34938.f22119.m9085();
    }
}
