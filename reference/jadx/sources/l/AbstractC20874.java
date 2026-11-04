package l;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.᩵᩹ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06PO */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20874 extends AbstractC21775 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f66811;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public volatile long f66813;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public volatile C11555 f66814;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f66815;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C3720 f66816;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile boolean f66817;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Object f66812 = new Object();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Handler f66818 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ExecutorService f66809 = C5261.f18540;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AtomicLong f66810 = new AtomicLong();

    @Override // l.AbstractC21775
    /* JADX INFO: renamed from: ۙ */
    public void mo14427(C11555 c11555) {
        this.f66814 = c11555;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47706(CharSequence charSequence, InterfaceC23858 interfaceC23858) {
        synchronized (this.f66812) {
            try {
                if (this.f66817) {
                    return;
                }
                C15508 c15508Mo15337 = charSequence instanceof InterfaceC9629 ? ((InterfaceC9629) charSequence).mo15337() : null;
                long j = 1 + this.f66813;
                this.f66813 = j;
                C3720 c3720 = new C3720(this, j, c15508Mo15337 == null ? charSequence : c15508Mo15337, c15508Mo15337, interfaceC23858);
                C3720 c3721 = this.f66816;
                if (c3721 != null) {
                    c3721.close();
                }
                this.f66816 = c3720;
                if (this.f66811) {
                    return;
                }
                this.f66811 = true;
                try {
                    this.f66809.execute(new Runnable() { // from class: l.ܽ᩹ۧ
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC20874.m47701(this.f58621);
                        }
                    });
                } catch (Error e) {
                    e = e;
                    this.f66811 = false;
                    this.f66816 = null;
                    c3720.close();
                    throw e;
                } catch (RuntimeException e2) {
                    e = e2;
                    this.f66811 = false;
                    this.f66816 = null;
                    c3720.close();
                    throw e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47701(final AbstractC20874 abstractC20874) {
        final C3720 c3720;
        final Runnable runnableMo19062;
        while (true) {
            synchronized (abstractC20874.f66812) {
                c3720 = abstractC20874.f66816;
                abstractC20874.f66816 = null;
                if (c3720 == null) {
                    abstractC20874.f66811 = false;
                    return;
                }
            }
            try {
                if (!c3720.mo924() && (runnableMo19062 = c3720.f12787.mo19062(c3720.f12783, c3720)) != null && !c3720.mo924()) {
                    abstractC20874.f66818.post(new Runnable() { // from class: l.ܶ᩹ۧ
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC20874.m47703(this.f53207, c3720, runnableMo19062);
                        }
                    });
                }
                try {
                    c3720.close();
                } catch (Throwable unused) {
                    c3720.mo924();
                }
            } catch (Throwable th) {
                try {
                    c3720.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m47703(AbstractC20874 abstractC20874, C3720 c3720, Runnable runnable) {
        if (c3720.mo924()) {
            return;
        }
        if (abstractC20874.f66814 == null || abstractC20874.f66814.m29071()) {
            abstractC20874.f66815 = c3720.f12785;
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47707(final Runnable runnable) {
        final long jIncrementAndGet = this.f66810.incrementAndGet();
        final long j = this.f66813;
        final C11555 c11555 = this.f66814;
        Runnable runnable2 = new Runnable() { // from class: l.ܺ᩹ۧ
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC20874.m47702(this.f55893, jIncrementAndGet, j, c11555, runnable);
            }
        };
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable2.run();
        } else {
            this.f66818.post(runnable2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m47702(AbstractC20874 abstractC20874, long j, long j2, C11555 c11555, Runnable runnable) {
        if (!abstractC20874.f66817 && j == abstractC20874.f66810.get() && j2 == abstractC20874.f66813 && c11555 == abstractC20874.f66814) {
            if (c11555 == null || c11555.m29071()) {
                runnable.run();
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m47708() {
        if (this.f66817 || this.f66815 != this.f66813) {
            return false;
        }
        return this.f66814 == null || this.f66814.m29071();
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.f66812) {
            this.f66817 = true;
            this.f66813++;
            C3720 c3720 = this.f66816;
            if (c3720 != null) {
                c3720.close();
                this.f66816 = null;
            }
        }
        this.f69427 = null;
    }
}
