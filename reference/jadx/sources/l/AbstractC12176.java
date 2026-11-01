package l;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.۫ۙۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06PO */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12176 extends AbstractC21616 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile boolean f40755;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public volatile C23229 f40756;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C16409 f40757;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public volatile long f40760;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f40761;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f40764;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Object f40758 = new Object();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Handler f40763 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ExecutorService f40762 = C4716.f16636;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f40759 = new AtomicLong();

    @Override // l.AbstractC21616
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo30284(C23229 c23229) {
        this.f40756 = c23229;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30282(CharSequence charSequence, InterfaceC0180 interfaceC0180) {
        synchronized (this.f40758) {
            try {
                if (this.f40755) {
                    return;
                }
                C3329 c3329Mo2398 = charSequence instanceof InterfaceC0507 ? ((InterfaceC0507) charSequence).mo2398() : null;
                long j = 1 + this.f40760;
                this.f40760 = j;
                C16409 c16409 = new C16409(this, j, c3329Mo2398 == null ? charSequence : c3329Mo2398, c3329Mo2398, interfaceC0180);
                C16409 c164010 = this.f40757;
                if (c164010 != null) {
                    c164010.close();
                }
                this.f40757 = c16409;
                if (this.f40761) {
                    return;
                }
                this.f40761 = true;
                try {
                    this.f40762.execute(new Runnable() { // from class: l.ܺۙۜ
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC12176.m30277(this.f50979);
                        }
                    });
                } catch (Error e) {
                    e = e;
                    this.f40761 = false;
                    this.f40757 = null;
                    c16409.close();
                    throw e;
                } catch (RuntimeException e2) {
                    e = e2;
                    this.f40761 = false;
                    this.f40757 = null;
                    c16409.close();
                    throw e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30277(final AbstractC12176 abstractC12176) {
        final C16409 c16409;
        final Runnable runnableMo1383;
        while (true) {
            synchronized (abstractC12176.f40758) {
                c16409 = abstractC12176.f40757;
                abstractC12176.f40757 = null;
                if (c16409 == null) {
                    abstractC12176.f40761 = false;
                    return;
                }
            }
            try {
                if (!c16409.mo2357() && (runnableMo1383 = c16409.f52792.mo1383(c16409.f52791, c16409)) != null && !c16409.mo2357()) {
                    abstractC12176.f40763.post(new Runnable() { // from class: l.᩶ۙۜ
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC12176.m30279(this.f63878, c16409, runnableMo1383);
                        }
                    });
                }
                try {
                    c16409.close();
                } catch (Throwable unused) {
                    c16409.mo2357();
                }
            } catch (Throwable th) {
                try {
                    c16409.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30279(AbstractC12176 abstractC12176, C16409 c16409, Runnable runnable) {
        if (c16409.mo2357()) {
            return;
        }
        if (abstractC12176.f40756 == null || abstractC12176.f40756.m51236()) {
            abstractC12176.f40764 = c16409.f52790;
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30283(final Runnable runnable) {
        final long jIncrementAndGet = this.f40759.incrementAndGet();
        final long j = this.f40760;
        final C23229 c23229 = this.f40756;
        Runnable runnable2 = new Runnable() { // from class: l.᩷ۙۜ
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC12176.m30278(this.f67213, jIncrementAndGet, j, c23229, runnable);
            }
        };
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable2.run();
        } else {
            this.f40763.post(runnable2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30278(AbstractC12176 abstractC12176, long j, long j2, C23229 c23229, Runnable runnable) {
        if (!abstractC12176.f40755 && j == abstractC12176.f40759.get() && j2 == abstractC12176.f40760 && c23229 == abstractC12176.f40756) {
            if (c23229 == null || c23229.m51236()) {
                runnable.run();
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m30285() {
        if (this.f40755 || this.f40764 != this.f40760) {
            return false;
        }
        return this.f40756 == null || this.f40756.m51236();
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.f40758) {
            this.f40755 = true;
            this.f40760++;
            C16409 c16409 = this.f40757;
            if (c16409 != null) {
                c16409.close();
                this.f40757 = null;
            }
        }
        this.f70111 = null;
    }
}
