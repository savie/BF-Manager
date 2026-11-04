package l;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: renamed from: l.ۗ᩺ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAIG */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC3743 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ScheduledFuture f12839;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC6727 f12840;

    public RunnableC3743(AbstractC6727 abstractC6727) {
        this.f12840 = abstractC6727;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12168() {
        this.f12839.cancel(false);
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC6727 abstractC6727 = this.f12840;
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        try {
            if (abstractC6727.f22410 != null) {
                ClassLoader classLoader = (ClassLoader) abstractC6727.f22410.get();
                if (classLoader == null) {
                    m12168();
                } else {
                    Thread.currentThread().setContextClassLoader(classLoader);
                    abstractC6727.mo14492();
                    abstractC6727.mo14486();
                }
            } else {
                try {
                    abstractC6727.mo14492();
                } catch (Exception unused) {
                } catch (OutOfMemoryError e) {
                    e.printStackTrace(System.err);
                }
                try {
                    abstractC6727.mo14486();
                } catch (Exception unused2) {
                }
            }
            Thread.currentThread().setContextClassLoader(contextClassLoader);
        } catch (Throwable th) {
            Thread.currentThread().setContextClassLoader(contextClassLoader);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12169(ScheduledFuture scheduledFuture) {
        this.f12839 = scheduledFuture;
    }
}
