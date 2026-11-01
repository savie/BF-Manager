package l;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.alipay.sdk.m.y.k;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.۠۠ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 16SF */
/* JADX INFO: loaded from: classes3.dex */
public final class C8042 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C6111 f28152;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f28154;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public Executor f28155;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f28157;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f28158;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Throwable f28159;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C4844 f28160;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final InterfaceC18625 f28161;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C14393 f28162;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public FutureC12075 f28163;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public volatile boolean f28164;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public FutureC12075 f28165;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C20346 f28166;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f28167;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C20556 f28168;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f28169;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f28170;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f28171;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final InterfaceC2916 f28174;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f28175;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C15990 f28176;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public FutureC12075 f28177;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C20409 f28179;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Handler f28173 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final FutureC12075 f28178 = new FutureC12075();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C4513 f28172 = new C4513();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public volatile String f28153 = "waiting_directory";

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f28156 = true;

    public C8042(C20409 c20409, InterfaceC18625 interfaceC18625, int i) {
        this.f28179 = c20409;
        C6111 c6111 = c20409.f66125;
        this.f28152 = c6111;
        this.f28168 = c20409.f66135;
        this.f28161 = interfaceC18625;
        this.f28169 = i;
        this.f28174 = c6111.m17000();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m21175() {
        return this.f28161 != null;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final FutureC12075 m21170() {
        return this.f28178.m30032((InterfaceC15954) new C12981());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21172(String str, InterfaceC3800 interfaceC3800) {
        C4844 c4844 = new C4844(new C17919(this), new C0985(interfaceC3800, str));
        this.f28160 = c4844;
        c4844.m13459();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static String m21163(C8042 c8042) {
        int i;
        String str;
        String str2;
        synchronized (c8042) {
            i = c8042.f28158;
        }
        StringBuilder sb = new StringBuilder("stage=");
        sb.append(c8042.f28153);
        sb.append("\nworkerState=");
        sb.append(i);
        sb.append("\napplyingState=");
        sb.append(c8042.f28167);
        sb.append("\ncleaning=");
        sb.append(c8042.f28157);
        sb.append("\ncanceled=");
        sb.append(c8042.f28164);
        sb.append("\ndirectoryReady=");
        C20346 c20346 = c8042.f28166;
        sb.append(c20346 == null || c20346.m45913().isDone());
        sb.append("\npersistence=");
        FutureC12075 futureC12075 = c8042.f28163;
        if (futureC12075 == null) {
            str = "absent";
        } else if (futureC12075.isDone()) {
            str = futureC12075.m30013() ? k.j : "done";
        } else {
            str = "pending";
        }
        sb.append(str);
        sb.append("\nrestoration=");
        FutureC12075 futureC12076 = c8042.f28177;
        if (futureC12076 == null) {
            str2 = "absent";
        } else if (futureC12076.isDone()) {
            str2 = futureC12076.m30013() ? k.j : "done";
        } else {
            str2 = "pending";
        }
        sb.append(str2);
        sb.append("\nfailure=");
        sb.append(Log.getStackTraceString(c8042.f28159));
        sb.append("\n");
        sb.append(c8042.f28152.m16970());
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21174(C20346 c20346, final Executor executor) {
        this.f28166 = c20346;
        c20346.m45913().m30016(new InterfaceC7486() { // from class: l.ܰ۠ۖ
            @Override // l.InterfaceC7486
            /* JADX INFO: renamed from: ܰ */
            public final void mo2142(Object obj, Throwable th) {
                C8042.m21166(this.f45151, th, executor);
            }
        });
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21166(final C8042 c8042, final Throwable th, final Executor executor) {
        Runnable runnable = new Runnable() { // from class: l.᩸۠ۖ
            @Override // java.lang.Runnable
            public final void run() {
                C8042.m21156(this.f69722, th, executor);
            }
        };
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            c8042.f28173.post(runnable);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21156(C8042 c8042, Throwable th, Executor executor) {
        if (c8042.f28175 || c8042.f28157 || c8042.f28164) {
            return;
        }
        if (th == null) {
            c8042.m21173(executor);
            return;
        }
        synchronized (c8042) {
            c8042.f28158 = 2;
        }
        c8042.f28159 = th;
        c8042.m21150();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21173(Executor executor) {
        this.f28155 = executor;
        if (this.f28161 == null) {
            m21160();
        } else {
            m21159(true);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m21160() {
        this.f28153 = "configuring_view";
        if (this.f28175 || this.f28157) {
            return;
        }
        if (this.f28164 || !m21168()) {
            m21171();
            return;
        }
        try {
            this.f28163 = this.f28162.m34654();
            C14393 c14393 = this.f28162;
            c14393.f47156.f37855.m52612(c14393.f47162.mo8735());
            C20556 c20556 = this.f28168;
            C14393 c14394 = this.f28162;
            C23874 c23874 = c14394.f47156.f37855;
            c20556.m46374(c23874.f77150, c23874.f77156, c14394.f47162, this.f28176);
            m21159(false);
        } catch (Throwable th) {
            synchronized (this) {
                this.f28158 = 2;
                this.f28159 = th;
                m21150();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m21159(final boolean z) {
        this.f28153 = z ? "queued_open" : "queued_layout";
        synchronized (this) {
            if (this.f28164) {
                this.f28158 = 2;
                m21150();
                return;
            }
            this.f28158 = 0;
            try {
                this.f28155.execute(new Runnable() { // from class: l.᩹۠ۖ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8042.m21158(this.f72466, z);
                    }
                });
            } catch (RuntimeException e) {
                synchronized (this) {
                    this.f28158 = 2;
                    this.f28159 = e;
                    m21150();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21158(final C8042 c8042, final boolean z) {
        final CancellationException cancellationException;
        synchronized (c8042) {
            if (c8042.f28158 != 0) {
                return;
            }
            c8042.f28158 = 1;
            c8042.f28153 = z ? "opening_session" : "preparing_layout";
            try {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    throw new IllegalStateException("Session preparation requires a background executor");
                }
                if (c8042.f28164) {
                    throw new CancellationException("Fragment session loading was canceled");
                }
                if (z) {
                    C14393 c14393Mo12537 = c8042.f28161.mo12537(c8042.f28172);
                    c8042.f28162 = c14393Mo12537;
                    C20346 c20346 = c8042.f28166;
                    if (c20346 != null) {
                        c14393Mo12537.m34652(c20346);
                    }
                } else {
                    c8042.f28152.m16845(c8042.f28162.f47162, new InterfaceC5614() { // from class: l.᩺۠ۖ
                        @Override // l.InterfaceC5614
                        /* JADX INFO: renamed from: ֨ */
                        public final boolean mo2357() {
                            return this.f74359.f28164;
                        }
                    });
                }
                if (c8042.f28164) {
                    throw new CancellationException("Fragment session loading was canceled");
                }
                th = null;
                cancellationException = th;
                synchronized (c8042) {
                    c8042.f28158 = 2;
                }
                c8042.f28173.post(new Runnable() { // from class: l.ܶ۠ۖ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8042.m21157(this.f49315, cancellationException, z);
                    }
                });
            } catch (Throwable th) {
                th = th;
                if (c8042.f28164 && !(th instanceof CancellationException)) {
                    cancellationException = new CancellationException("Fragment session loading was canceled");
                    cancellationException.addSuppressed(th);
                }
                synchronized (c8042) {
                    c8042.f28158 = 2;
                    c8042.f28173.post(new Runnable() { // from class: l.ܶ۠ۖ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C8042.m21157(this.f49315, cancellationException, z);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21157(C8042 c8042, Throwable th, boolean z) {
        if (c8042.f28175 || c8042.f28157) {
            return;
        }
        if (c8042.f28159 == null) {
            c8042.f28159 = th;
        }
        if (z && c8042.f28159 == null && !c8042.f28164) {
            c8042.m21160();
        } else {
            c8042.m21150();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21171() {
        C4844 c4844 = this.f28160;
        if (c4844 != null) {
            c4844.m13460();
        }
        if (this.f28175 || this.f28157) {
            return;
        }
        this.f28164 = true;
        this.f28172.cancel();
        synchronized (this) {
            if (this.f28158 == 0) {
                this.f28158 = 2;
            }
        }
        this.f28152.m17045();
        FutureC12075 futureC12075 = this.f28177;
        if (futureC12075 != null) {
            futureC12075.cancel(false);
        }
        FutureC12075 futureC12076 = this.f28165;
        if (futureC12076 != null) {
            futureC12076.cancel(false);
        }
        m21150();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m21176() {
        this.f28170 = true;
        m21171();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean m21168() {
        C20409 c20409 = this.f28179;
        return c20409.f66146 && c20409.f66125 == this.f28152 && c20409.f66135 == this.f28168;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m21150() {
        if (this.f28175 || this.f28157 || this.f28154) {
            return;
        }
        this.f28154 = true;
        this.f28173.post(new RunnableC5219(this));
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00c2  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21153(final C8042 c8042) {
        boolean z;
        FutureC12075 futureC12075;
        c8042.f28154 = false;
        if (c8042.f28175 || c8042.f28157) {
            return;
        }
        synchronized (c8042) {
            if (c8042.f28158 != 2) {
                if (c8042.f28164) {
                    c8042.f28172.cancel();
                    c8042.f28154 = true;
                    c8042.f28173.postDelayed(new RunnableC5219(c8042), 10L);
                }
                return;
            }
            if (!c8042.m21168()) {
                c8042.f28164 = true;
            }
            if (c8042.f28164 || c8042.f28159 != null) {
                c8042.f28172.cancel();
                if (!c8042.f28172.m12550()) {
                    c8042.f28154 = true;
                    c8042.f28173.postDelayed(new RunnableC5219(c8042), 10L);
                    return;
                }
            }
            if (c8042.f28159 == null) {
                c8042.f28159 = c8042.f28152.m16952();
            }
            if (!c8042.f28164 && c8042.f28159 == null && (futureC12075 = c8042.f28163) != null) {
                if (!futureC12075.isDone()) {
                    c8042.f28153 = "waiting_persistence";
                    c8042.f28154 = true;
                    c8042.f28173.postDelayed(new RunnableC5219(c8042), 10L);
                    return;
                } else {
                    try {
                        c8042.f28163.m30027();
                    } catch (Throwable th) {
                        c8042.f28159 = th;
                    }
                }
            }
            if (c8042.f28164 || c8042.f28159 != null) {
                c8042.f28152.m17045();
            }
            if (c8042.f28164 || c8042.f28159 != null || c8042.f28167 || !c8042.f28156) {
                z = false;
            } else {
                C6111 c6111 = c8042.f28152;
                C14393 c14393 = c8042.f28162;
                if (c6111.m16898(c14393.f47162, c14393.f47156.f37855.f77151)) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (c8042.f28152.m16973() && !z) {
                c8042.f28153 = "waiting_layout";
                c8042.f28154 = true;
                c8042.f28173.postDelayed(new RunnableC5219(c8042), 10L);
                return;
            }
            if (!c8042.f28164 && c8042.f28159 == null) {
                if (c8042.f28167) {
                    return;
                }
                c8042.f28167 = true;
                c8042.f28153 = "restoring_view_state";
                try {
                    c8042.f28152.m16902();
                    c8042.f28152.m16998();
                    try {
                        FutureC12075 futureC12075M46131 = c8042.f28179.m46131(c8042.f28162, c8042.f28169, c8042.f28176);
                        c8042.f28152.m16942();
                        if (z) {
                            FutureC12075 futureC12075M16957 = c8042.f28152.m16957((InterfaceC2916) c8042.f28162.f47162);
                            c8042.f28165 = futureC12075M16957;
                            futureC12075M16957.m30016(new InterfaceC7486() { // from class: l.ۘ۠ۖ
                                @Override // l.InterfaceC7486
                                /* JADX INFO: renamed from: ܰ */
                                public final void mo2142(Object obj, Throwable th2) {
                                    C8042.m21164(this.f14139, th2);
                                }
                            });
                        }
                        c8042.f28177 = futureC12075M46131;
                        futureC12075M46131.m30016(new InterfaceC7486() { // from class: l.ۜ۠ۖ
                            @Override // l.InterfaceC7486
                            /* JADX INFO: renamed from: ܰ */
                            public final void mo2142(Object obj, Throwable th2) {
                                C8042.m21154(this.f22406, th2);
                            }
                        });
                        return;
                    } catch (Throwable th2) {
                        c8042.f28152.m16942();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    c8042.f28152.m16942();
                    c8042.f28159 = th3;
                    c8042.m21150();
                    return;
                }
            }
            c8042.f28153 = "releasing_failed_session";
            c8042.f28157 = true;
            FutureC12075 futureC12076 = c8042.f28165;
            if (futureC12076 != null) {
                futureC12076.cancel(false);
            }
            final Throwable cancellationException = c8042.f28159;
            if (cancellationException == null) {
                cancellationException = new CancellationException("Fragment session loading was canceled");
            }
            try {
                C14393 c14394 = c8042.f28162;
                if (c14394 != null) {
                    c8042.f28152.m16861((InterfaceC2916) c14394.f47162);
                }
                if (c8042.f28170) {
                    InterfaceC2916 interfaceC2916M17000 = c8042.f28152.m17000();
                    InterfaceC2916 interfaceC2916 = c8042.f28174;
                    if (interfaceC2916M17000 == interfaceC2916) {
                        c8042.f28152.m16861(interfaceC2916);
                    }
                }
                c8042.f28152.m16922(false);
                C14393 c14395 = c8042.f28162;
                (c14395 == null ? FutureC12075.m30001(null) : c14395.m34643()).m30016(new InterfaceC7486() { // from class: l.ۨ۠ۖ
                    @Override // l.InterfaceC7486
                    /* JADX INFO: renamed from: ܰ */
                    public final void mo2142(Object obj, Throwable th4) {
                        C8042 c8043 = this.f38912;
                        c8043.f28173.post(new Runnable() { // from class: l.ۖ۠ۖ
                            @Override // java.lang.Runnable
                            public final void run() {
                                C8042.m21155(this.f9617, th4, th);
                            }
                        });
                    }
                });
            } catch (Throwable th4) {
                cancellationException.addSuppressed(th4);
                c8042.f28175 = true;
                c8042.f28179.m46135(c8042, c8042.f28162, false);
                c8042.f28152.m16877(c8042.f28176);
                c8042.f28178.m30021(cancellationException);
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21164(C8042 c8042, Throwable th) {
        if (c8042.f28175 || c8042.f28157 || c8042.f28164 || !c8042.m21168() || th != null || !c8042.f28152.m16996(c8042.f28162.f47162)) {
            return;
        }
        c8042.f28171 = true;
        C4844 c4844 = c8042.f28160;
        if (c4844 != null) {
            c4844.m13460();
        }
        c8042.f28179.m46134(c8042);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21154(C8042 c8042, Throwable th) {
        if (c8042.f28175 || c8042.f28157) {
            return;
        }
        if (th != null) {
            c8042.f28159 = th;
        }
        if (!c8042.m21168() || c8042.f28152.m17000() != c8042.f28162.f47162) {
            c8042.f28164 = true;
        }
        if (c8042.f28164 || c8042.f28159 != null) {
            c8042.m21150();
            return;
        }
        c8042.f28172.m12551();
        c8042.f28175 = true;
        FutureC12075 futureC12075 = c8042.f28165;
        if (futureC12075 != null) {
            futureC12075.cancel(false);
        }
        c8042.f28179.m46135(c8042, c8042.f28162, true);
        c8042.f28152.m16877(c8042.f28176);
        c8042.f28178.m30019(c8042.f28162);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21155(C8042 c8042, Throwable th, Throwable th2) {
        C20346 c20346;
        C6111 c6111 = c8042.f28152;
        if (th != null) {
            th2.addSuppressed(th);
        }
        try {
            if (c8042.f28170) {
                InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
                InterfaceC2916 interfaceC2916 = c8042.f28174;
                if (interfaceC2916M17000 == interfaceC2916) {
                    c6111.m16861(interfaceC2916);
                }
            }
        } catch (Throwable th3) {
            th2.addSuppressed(th3);
        }
        c8042.f28175 = true;
        if (c8042.f28162 == null && (c20346 = c8042.f28166) != null) {
            c20346.m45914((Throwable) null);
        }
        c8042.f28179.m46135(c8042, c8042.f28162, false);
        c6111.m16877(c8042.f28176);
        c8042.f28178.m30021(th2);
    }
}
