package l;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: renamed from: l.֫᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: UAIG */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC2099 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ScheduledFuture f7740;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC4817 f7741;

    public RunnableC2099(AbstractC4817 abstractC4817) {
        this.f7741 = abstractC4817;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6645() {
        this.f7740.cancel(false);
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC4817 abstractC4817 = this.f7741;
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        try {
            if (abstractC4817.f16927 != null) {
                ClassLoader classLoader = (ClassLoader) abstractC4817.f16927.get();
                if (classLoader == null) {
                    m6645();
                } else {
                    Thread.currentThread().setContextClassLoader(classLoader);
                    abstractC4817.mo13388();
                    abstractC4817.mo13381();
                }
            } else {
                try {
                    abstractC4817.mo13388();
                } catch (Exception unused) {
                } catch (OutOfMemoryError e) {
                    e.printStackTrace(System.err);
                }
                try {
                    abstractC4817.mo13381();
                } catch (Exception unused2) {
                }
            }
        } finally {
            Thread.currentThread().setContextClassLoader(contextClassLoader);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6646(ScheduledFuture scheduledFuture) {
        this.f7740 = scheduledFuture;
    }
}
