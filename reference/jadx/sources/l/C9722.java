package l;

import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: l.ۡ᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 66IQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C9722 implements InterfaceC8408, AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f31363;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C9044 f31364;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC13628 f31365;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f31366;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f31367;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Handler f31368;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final RunnableC5473 f31369;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Executor f31370;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f31371;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f31372;

    @Override // l.InterfaceC8408
    public final int getCount() {
        return 1;
    }

    @Override // l.InterfaceC8408
    public final long getItemId(int i) {
        return 1L;
    }

    @Override // l.InterfaceC8408
    public final /* synthetic */ void onPageSelected(int i) {
    }

    @Override // l.InterfaceC8408
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo22603() {
    }

    @Override // l.InterfaceC8408
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ boolean mo22606(int i) {
        return false;
    }

    public C9722(AbstractC22044 abstractC22044, AbstractC22044 abstractC22045, AbstractC13628 abstractC13628, RunnableC5473 runnableC5473) {
        ExecutorService executorService = C5261.f18540;
        this.f31368 = new Handler(Looper.getMainLooper());
        this.f31366 = abstractC22044;
        this.f31367 = abstractC22045;
        this.f31365 = abstractC13628;
        this.f31369 = runnableC5473;
        this.f31370 = executorService;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m25314() {
        this.f31365.mo1642(this, 0);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C9044 m25311() {
        return this.f31364;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m25313() {
        return this.f31363;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m25312() {
        if (this.f31372) {
            return;
        }
        this.f31365.mo1651(0);
    }

    @Override // l.InterfaceC8408
    /* JADX INFO: renamed from: ۙ */
    public final void mo22605(final AbstractC13628 abstractC13628, final int i, final long j) {
        final long j2 = 1 + this.f31371;
        this.f31371 = j2;
        this.f31364 = null;
        this.f31363 = false;
        this.f31370.execute(new Runnable() { // from class: l.ᩳ᩻֫
            @Override // java.lang.Runnable
            public final void run() {
                C9722.m25310(this.f62757, j2, abstractC13628, i, j);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m25310(final C9722 c9722, final long j, final AbstractC13628 abstractC13628, final int i, final long j2) {
        C1520 c1520;
        Exception iOException;
        final C9044 c9044;
        final C1520 c1521;
        final Exception exc;
        AbstractC22044 abstractC22044 = c9722.f31367;
        AbstractC22044 abstractC22045 = c9722.f31366;
        try {
            C21246 c21246 = new C21246();
            if (abstractC22044 != null && abstractC22044.mo2934()) {
                try {
                    c21246 = new C21246(abstractC22044);
                } catch (IOException unused) {
                }
            }
            InputStream inputStreamMo4290 = abstractC22045.mo4290();
            try {
                c1520 = new C1520(C24236.m54217(C14955.m35973(inputStreamMo4290).m35991(), c21246, false));
                if (inputStreamMo4290 != null) {
                    try {
                        inputStreamMo4290.close();
                    } catch (Exception e) {
                        e = e;
                        iOException = e;
                        c9044 = null;
                        c1521 = c1520;
                        exc = iOException;
                    } catch (OutOfMemoryError e2) {
                        e = e2;
                        iOException = new IOException("Vector preview ran out of memory", e);
                        c9044 = null;
                        c1521 = c1520;
                        exc = iOException;
                    }
                }
                if (c1520.getWidth() <= 0 || c1520.getHeight() <= 0) {
                    throw new IOException("Invalid vector dimensions");
                }
                c9044 = new C9044(abstractC22045.mo4294(), c1520.getWidth(), c1520.getHeight(), 1, "application/vnd.android.axml", new C15294(abstractC22045.mo4294(), abstractC22045.mo4285(), abstractC22045.mo4286()));
                c1521 = c1520;
                exc = null;
                c9722.f31368.post(new Runnable() { // from class: l.ۢ᩻֫
                    @Override // java.lang.Runnable
                    public final void run() {
                        C9722.m25309(this.f33324, j, c1521, exc, abstractC13628, i, j2, c9044);
                    }
                });
            } catch (Throwable th) {
                if (inputStreamMo4290 == null) {
                    throw th;
                }
                try {
                    inputStreamMo4290.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            c1520 = null;
            iOException = e;
            c9044 = null;
            c1521 = c1520;
            exc = iOException;
            c9722.f31368.post(new Runnable() { // from class: l.ۢ᩻֫
                @Override // java.lang.Runnable
                public final void run() {
                    C9722.m25309(this.f33324, j, c1521, exc, abstractC13628, i, j2, c9044);
                }
            });
        } catch (OutOfMemoryError e4) {
            e = e4;
            c1520 = null;
            iOException = new IOException("Vector preview ran out of memory", e);
            c9044 = null;
            c1521 = c1520;
            exc = iOException;
            c9722.f31368.post(new Runnable() { // from class: l.ۢ᩻֫
                @Override // java.lang.Runnable
                public final void run() {
                    C9722.m25309(this.f33324, j, c1521, exc, abstractC13628, i, j2, c9044);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m25309(C9722 c9722, long j, C1520 c1520, Exception exc, AbstractC13628 abstractC13628, int i, long j2, C9044 c9044) {
        if (c9722.f31372 || j != c9722.f31371) {
            if (c1520 != null) {
                c1520.close();
                return;
            }
            return;
        }
        if (exc != null) {
            if (c1520 != null) {
                c1520.close();
            }
            c9722.f31363 = true;
            boolean z = exc.getCause() instanceof OutOfMemoryError;
            Exception cause = exc;
            if (z) {
                cause = exc.getCause();
            }
            abstractC13628.mo1640(i, C22403.m50485(cause), j2);
        } else {
            c9722.f31364 = c9044;
            abstractC13628.mo1644(i, j2, c1520);
        }
        c9722.f31369.run();
    }

    @Override // l.InterfaceC8408
    /* JADX INFO: renamed from: ۙ */
    public final void mo22604(int i, long j) {
        this.f31371++;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f31372) {
            return;
        }
        this.f31372 = true;
        this.f31371++;
        this.f31365.mo1649();
        this.f31364 = null;
    }
}
