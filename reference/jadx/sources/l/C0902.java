package l;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.֨ۗ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 16SF */
/* JADX INFO: loaded from: classes3.dex */
public final class C0902 implements InterfaceC2984 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f3365;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Throwable f3366;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19106 f3367;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f3368;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f3369;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Executor f3370;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C24526 f3371;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public FutureC23690 f3372;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f3373;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public volatile boolean f3374;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C7941 f3375;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public FutureC23690 f3376;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C8950 f3377;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f3378;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final FutureC23690 f3379;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final Handler f3380 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public FutureC23690 f3381;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C16563 f3382;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C24132 f3383;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f3384;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f3385;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C16320 f3386;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C6868 f3387;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f3388;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f3389;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC9850 f3390;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C15926 f3391;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C23582 f3392;

    public C0902(C7941 c7941, InterfaceC9850 interfaceC9850, int i, C6868 c6868) {
        FutureC23690 futureC23690 = new FutureC23690();
        this.f3379 = futureC23690;
        this.f3382 = new C16563();
        this.f3369 = true;
        this.f3375 = c7941;
        C24132 c24132 = c7941.f26387;
        this.f3383 = c24132;
        this.f3392 = c7941.f26385;
        this.f3390 = interfaceC9850;
        this.f3368 = i;
        this.f3367 = c24132.m54021();
        this.f3387 = c6868;
        c6868.m19128(new Supplier() { // from class: l.ܰۗ᩸
            @Override // java.util.function.Supplier
            public final Object get() {
                return C0902.m3656(this.f45202);
            }
        });
        futureC23690.m52931(new InterfaceC2017() { // from class: l.᩶ۗ᩸
            @Override // l.InterfaceC2017
            /* JADX INFO: renamed from: ᩷ */
            public final void mo1355(Object obj, Throwable th) {
                this.f67250.f3387.m19127(th);
            }
        });
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m3668() {
        return this.f3390 != null;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final FutureC23690 m3666() {
        return this.f3379.m52949((InterfaceC25138) new C3885());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3662(String str, InterfaceC24329 interfaceC24329) {
        C24526 c24526 = new C24526(new C18801(this), new C24023(interfaceC24329, str));
        this.f3371 = c24526;
        c24526.m54809();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m3640(C0902 c0902) {
        StringBuilder sb = new StringBuilder();
        sb.append(c0902.mo3661());
        C8950 c8950 = c0902.f3377;
        sb.append(c8950 == null ? "" : c8950.m23929());
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m3656(C0902 c0902) {
        StringBuilder sb = new StringBuilder();
        sb.append(c0902.mo3661());
        C8950 c8950 = c0902.f3377;
        sb.append(c8950 == null ? "" : c8950.m23929());
        return sb.toString();
    }

    @Override // l.InterfaceC2984
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo3661() {
        int i;
        synchronized (this) {
            i = this.f3373;
        }
        StringBuilder sb = new StringBuilder("stage=");
        sb.append(this.f3387.m19124());
        sb.append("\nloadTiming=");
        sb.append(this.f3387.m19130());
        sb.append("\nworkerState=");
        sb.append(i);
        sb.append("\napplyingState=");
        sb.append(this.f3388);
        sb.append("\ncleaning=");
        sb.append(this.f3385);
        sb.append("\ncanceled=");
        sb.append(this.f3374);
        sb.append("\ndirectoryReady=");
        C8950 c8950 = this.f3377;
        sb.append(c8950 == null || c8950.m23934().isDone());
        sb.append("\npersistence=");
        sb.append(C8950.m23920(this.f3376));
        sb.append("\nrestoration=");
        sb.append(C8950.m23920(this.f3381));
        sb.append("\nfailure=");
        sb.append(Log.getStackTraceString(this.f3366));
        sb.append("\nfragment=");
        sb.append(C8950.m23919(this.f3375));
        sb.append("\nactivity=");
        sb.append(C8950.m23919(this.f3375.getActivity()));
        sb.append("\nviewDestroyed=");
        sb.append(this.f3365);
        sb.append("\ncurrentView=");
        sb.append(m3651());
        sb.append("\n");
        sb.append(C8950.m23918((View) this.f3383));
        sb.append("\n");
        sb.append(this.f3383.m53973());
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3664(C8950 c8950, final Executor executor) {
        this.f3387.m19126("waiting_directory");
        this.f3377 = c8950;
        c8950.m23930("session_load", this);
        c8950.m23933().m52931(new InterfaceC2017() { // from class: l.ܽۗ᩸
            @Override // l.InterfaceC2017
            /* JADX INFO: renamed from: ᩷ */
            public final void mo1355(Object obj, Throwable th) {
                C0902.m3659(this.f56371, th, executor);
            }
        });
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3659(final C0902 c0902, final Throwable th, final Executor executor) {
        Runnable runnable = new Runnable() { // from class: l.ܿۗ᩸
            @Override // java.lang.Runnable
            public final void run() {
                C0902.m3644(this.f59117, th, executor);
            }
        };
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            c0902.f3380.post(runnable);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3644(C0902 c0902, Throwable th, Executor executor) {
        if (c0902.f3378 || c0902.f3385 || c0902.f3374) {
            return;
        }
        if (th == null) {
            c0902.m3663(executor);
            return;
        }
        synchronized (c0902) {
            c0902.f3373 = 2;
        }
        c0902.f3366 = th;
        c0902.m3648();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3663(Executor executor) {
        this.f3370 = executor;
        if (this.f3390 == null) {
            m3653();
        } else {
            m3647(true);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m3653() {
        this.f3387.m19126("configuring_view");
        if (this.f3378 || this.f3385) {
            return;
        }
        if (this.f3374 || !m3651()) {
            m3667();
            return;
        }
        try {
            this.f3376 = this.f3386.m38743();
            C16320 c16320 = this.f3386;
            c16320.f52984.f63046.m31881(c16320.f52980.mo11043());
            C23582 c23582 = this.f3392;
            C16320 c16321 = this.f3386;
            C12834 c12834 = c16321.f52984.f63046;
            c23582.m52811(c12834.f41119, c12834.f41120, c16321.f52980, this.f3391);
            m3647(false);
        } catch (Throwable th) {
            synchronized (this) {
                this.f3373 = 2;
                this.f3366 = th;
                m3648();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m3647(final boolean z) {
        this.f3387.m19126(z ? "queued_open" : "queued_layout");
        synchronized (this) {
            if (this.f3374) {
                this.f3373 = 2;
                m3648();
                return;
            }
            this.f3373 = 0;
            try {
                this.f3370.execute(new Runnable() { // from class: l.ۛۗ᩸
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0902.m3646(this.f20893, z);
                    }
                });
            } catch (RuntimeException e) {
                synchronized (this) {
                    this.f3373 = 2;
                    this.f3366 = e;
                    m3648();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0099  */
    /* JADX WARN: Code duplicated, block: B:44:0x009c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a3  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3646(final C0902 c0902, final boolean z) {
        final CancellationException cancellationException;
        String str;
        synchronized (c0902) {
            if (c0902.f3373 != 0) {
                return;
            }
            c0902.f3373 = 1;
            c0902.f3387.m19126(z ? "opening_session" : "preparing_layout");
            try {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    throw new IllegalStateException("Session preparation requires a background executor");
                }
                if (c0902.f3374) {
                    throw new CancellationException("Fragment session loading was canceled");
                }
                if (z) {
                    C16320 c16320Mo25641 = c0902.f3390.mo25641(c0902.f3382);
                    c0902.f3386 = c16320Mo25641;
                    C8950 c8950 = c0902.f3377;
                    if (c8950 != null) {
                        c16320Mo25641.m38737(c8950);
                    }
                    c0902.f3387.m19125(c0902.f3386.f52980.length());
                } else {
                    c0902.f3387.m19125(c0902.f3386.f52980.length());
                    c0902.f3383.m53892(c0902.f3386.f52980, new InterfaceC7509() { // from class: l.ܶۗ᩸
                        @Override // l.InterfaceC7509
                        /* JADX INFO: renamed from: ۫ */
                        public final boolean mo924() {
                            return this.f51457.f3374;
                        }
                    });
                }
                if (c0902.f3374) {
                    throw new CancellationException("Fragment session loading was canceled");
                }
                th = null;
                cancellationException = th;
                C6868 c6868 = c0902.f3387;
                if (z) {
                    str = "waiting_open_delivery";
                } else {
                    str = "waiting_layout_delivery";
                }
                c6868.m19126(str);
                synchronized (c0902) {
                    c0902.f3373 = 2;
                }
                c0902.f3380.post(new Runnable() { // from class: l.᩹ۗ᩸
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0902.m3645(this.f75432, cancellationException, z);
                    }
                });
            } catch (Throwable th) {
                th = th;
                if (c0902.f3374 && !(th instanceof CancellationException)) {
                    cancellationException = new CancellationException("Fragment session loading was canceled");
                    cancellationException.addSuppressed(th);
                }
                C6868 c6869 = c0902.f3387;
                if (z) {
                    str = "waiting_open_delivery";
                } else {
                    str = "waiting_layout_delivery";
                }
                c6869.m19126(str);
                synchronized (c0902) {
                    c0902.f3373 = 2;
                    c0902.f3380.post(new Runnable() { // from class: l.᩹ۗ᩸
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0902.m3645(this.f75432, cancellationException, z);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3645(C0902 c0902, Throwable th, boolean z) {
        if (c0902.f3378 || c0902.f3385) {
            return;
        }
        if (c0902.f3366 == null) {
            c0902.f3366 = th;
        }
        if (z && c0902.f3366 == null && !c0902.f3374) {
            c0902.m3653();
        } else {
            c0902.m3648();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m3667() {
        C24526 c24526 = this.f3371;
        if (c24526 != null) {
            c24526.m54810();
        }
        if (this.f3378 || this.f3385) {
            return;
        }
        this.f3374 = true;
        this.f3382.cancel();
        synchronized (this) {
            if (this.f3373 == 0) {
                this.f3373 = 2;
            }
        }
        this.f3383.m54012();
        FutureC23690 futureC23690 = this.f3381;
        if (futureC23690 != null) {
            futureC23690.cancel(false);
        }
        FutureC23690 futureC23691 = this.f3372;
        if (futureC23691 != null) {
            futureC23691.cancel(false);
        }
        m3648();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m3665() {
        this.f3365 = true;
        m3667();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean m3651() {
        C7941 c7941 = this.f3375;
        return c7941.f26388 && c7941.f26387 == this.f3383 && c7941.f26385 == this.f3392;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m3648() {
        if (this.f3378 || this.f3385 || this.f3389) {
            return;
        }
        this.f3389 = true;
        this.f3380.post(new RunnableC12088(this));
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00c5  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3641(final C0902 c0902) {
        boolean z;
        FutureC23690 futureC23690;
        c0902.f3389 = false;
        if (c0902.f3378 || c0902.f3385) {
            return;
        }
        synchronized (c0902) {
            if (c0902.f3373 != 2) {
                if (c0902.f3374) {
                    c0902.f3382.cancel();
                    c0902.f3389 = true;
                    c0902.f3380.postDelayed(new RunnableC12088(c0902), 10L);
                }
                return;
            }
            if (!c0902.m3651()) {
                c0902.f3374 = true;
            }
            if (c0902.f3374 || c0902.f3366 != null) {
                c0902.f3382.cancel();
                if (!c0902.f3382.m39239()) {
                    c0902.f3389 = true;
                    c0902.f3380.postDelayed(new RunnableC12088(c0902), 10L);
                    return;
                }
            }
            if (c0902.f3366 == null) {
                c0902.f3366 = c0902.f3383.m53961();
            }
            if (!c0902.f3374 && c0902.f3366 == null && (futureC23690 = c0902.f3376) != null) {
                if (!futureC23690.isDone()) {
                    c0902.f3387.m19126("waiting_persistence");
                    c0902.f3389 = true;
                    c0902.f3380.postDelayed(new RunnableC12088(c0902), 10L);
                    return;
                } else {
                    try {
                        c0902.f3376.m52947();
                    } catch (Throwable th) {
                        c0902.f3366 = th;
                    }
                }
            }
            if (c0902.f3374 || c0902.f3366 != null) {
                c0902.f3383.m54012();
            }
            if (c0902.f3374 || c0902.f3366 != null || c0902.f3388 || !c0902.f3369) {
                z = false;
            } else {
                C24132 c24132 = c0902.f3383;
                C16320 c16320 = c0902.f3386;
                if (c24132.m53939(c16320.f52980, c16320.f52984.f63046.f41123)) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (c0902.f3383.m53884() && !z) {
                c0902.f3387.m19126("waiting_layout");
                c0902.f3389 = true;
                c0902.f3380.postDelayed(new RunnableC12088(c0902), 10L);
                return;
            }
            if (!c0902.f3374 && c0902.f3366 == null) {
                if (c0902.f3388) {
                    return;
                }
                c0902.f3388 = true;
                c0902.f3387.m19126("restoring_view_state");
                try {
                    c0902.f3383.m54093();
                    c0902.f3383.m54055();
                    try {
                        FutureC23690 futureC23690M21620 = c0902.f3375.m21620(c0902.f3386, c0902.f3368, c0902.f3391);
                        c0902.f3383.m54082();
                        if (z) {
                            FutureC23690 futureC23690M53980 = c0902.f3383.m53980((InterfaceC19106) c0902.f3386.f52980);
                            c0902.f3372 = futureC23690M53980;
                            futureC23690M53980.m52931((InterfaceC2017) new C0156(0, c0902));
                        }
                        c0902.f3387.m19126("waiting_view_restoration");
                        c0902.f3381 = futureC23690M21620;
                        futureC23690M21620.m52931(new InterfaceC2017() { // from class: l.۟ۗ᩸
                            @Override // l.InterfaceC2017
                            /* JADX INFO: renamed from: ᩷ */
                            public final void mo1355(Object obj, Throwable th2) {
                                C0902.m3657(this.f25138, th2);
                            }
                        });
                        return;
                    } catch (Throwable th2) {
                        c0902.f3383.m54082();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    c0902.f3383.m54082();
                    c0902.f3366 = th3;
                    c0902.m3648();
                    return;
                }
            }
            C24132 c24133 = c0902.f3383;
            c0902.f3387.m19126("releasing_failed_session");
            c0902.f3385 = true;
            FutureC23690 futureC23691 = c0902.f3372;
            if (futureC23691 != null) {
                futureC23691.cancel(false);
            }
            Throwable cancellationException = c0902.f3366;
            if (cancellationException == null) {
                cancellationException = new CancellationException("Fragment session loading was canceled");
            }
            try {
                C16320 c16321 = c0902.f3386;
                if (c16321 != null) {
                    c24133.m53926((InterfaceC19106) c16321.f52980);
                }
                if (c0902.f3365) {
                    InterfaceC19106 interfaceC19106M54021 = c24133.m54021();
                    InterfaceC19106 interfaceC19106 = c0902.f3367;
                    if (interfaceC19106M54021 == interfaceC19106) {
                        c24133.m53926(interfaceC19106);
                    }
                }
                c24133.m53992(false);
                C16320 c16322 = c0902.f3386;
                (c16322 == null ? FutureC23690.m52928(null) : c16322.m38744()).m52931((InterfaceC2017) new C3139(c0902, cancellationException));
            } catch (Throwable th4) {
                cancellationException.addSuppressed(th4);
                c0902.f3378 = true;
                c0902.f3375.m21624(c0902, c0902.f3386, false);
                c24133.m53919(c0902.f3391);
                c0902.f3379.m52937(cancellationException);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3642(C0902 c0902, Throwable th) {
        if (c0902.f3378 || c0902.f3385 || c0902.f3374 || !c0902.m3651() || th != null || !c0902.f3383.m54079(c0902.f3386.f52980)) {
            return;
        }
        c0902.f3384 = true;
        c0902.f3387.m19129();
        C24526 c24526 = c0902.f3371;
        if (c24526 != null) {
            c24526.m54810();
        }
        c0902.f3375.m21623(c0902);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3657(C0902 c0902, Throwable th) {
        if (c0902.f3378 || c0902.f3385) {
            return;
        }
        if (th != null) {
            c0902.f3366 = th;
        }
        if (!c0902.m3651() || c0902.f3383.m54021() != c0902.f3386.f52980) {
            c0902.f3374 = true;
        }
        if (c0902.f3374 || c0902.f3366 != null) {
            c0902.m3648();
            return;
        }
        c0902.f3387.m19126("handing_off_owner");
        c0902.f3382.m39240();
        c0902.f3378 = true;
        FutureC23690 futureC23690 = c0902.f3372;
        if (futureC23690 != null) {
            futureC23690.cancel(false);
        }
        c0902.f3375.m21624(c0902, c0902.f3386, true);
        c0902.f3383.m53919(c0902.f3391);
        c0902.f3387.m19129();
        c0902.f3379.m52935(c0902.f3386);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3658(C0902 c0902, Throwable th, Throwable th2) {
        C8950 c8950;
        C24132 c24132 = c0902.f3383;
        if (th != null) {
            th2.addSuppressed(th);
        }
        try {
            if (c0902.f3365) {
                InterfaceC19106 interfaceC19106M54021 = c24132.m54021();
                InterfaceC19106 interfaceC19106 = c0902.f3367;
                if (interfaceC19106M54021 == interfaceC19106) {
                    c24132.m53926(interfaceC19106);
                }
            }
        } catch (Throwable th3) {
            th2.addSuppressed(th3);
        }
        c0902.f3378 = true;
        if (c0902.f3386 == null && (c8950 = c0902.f3377) != null) {
            c8950.m23931((Throwable) null);
        }
        c0902.f3375.m21624(c0902, c0902.f3386, false);
        c24132.m53919(c0902.f3391);
        c0902.f3379.m52937(th2);
    }
}
