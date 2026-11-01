package l;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import bin.mt.plus.R;
import com.alipay.sdk.m.y.c;
import com.google.android.material.badge.BadgeDrawable;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.۬ۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: S4H6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12880 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final ThreadPoolExecutor f42827;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f42828 = new AtomicInteger();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final ScheduledExecutorService f42829;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C14690 f42830;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public volatile int f42831;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public volatile C22052 f42832;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f42833;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Object f42834;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Future f42835;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ScheduledFuture f42836;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final WeakReference f42837;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f42838;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final ThreadPoolExecutor f42839;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC0507 f42840;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public ScheduledFuture f42841;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(64), new ThreadFactoryC14248());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f42827 = threadPoolExecutor;
        f42829 = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC10720());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11469 m31932(Context context, int i, int i2) {
        String string;
        C22052 c22052 = this.f42832;
        int iM17743 = c22052.f71471.m17743();
        switch (C13586.f44806[c22052.f71473.ordinal()]) {
            case 1:
            case 2:
                string = "…";
                break;
            case 3:
                string = iM17743 != 0 ? context.getString(R.string.MT_Protector, Integer.valueOf(iM17743)) : context.getString(R.string.MT_Protector);
                break;
            case 4:
                string = context.getString(R.string.MT_Protector);
                break;
            case 5:
                string = context.getString(R.string.MT_Protector);
                break;
            case 6:
                string = context.getString(R.string.MT_Protector);
                break;
            default:
                string = null;
                break;
        }
        boolean z = c22052.f71473 == EnumC0884.SEARCHING || c22052.f71473 == EnumC0884.IDLE;
        if (string != null) {
            return new C11469(string, iM17743, !z, z);
        }
        int iM17745 = c22052.f71471.m17745(i, i2);
        StringBuilder sb = new StringBuilder();
        sb.append(iM17743);
        sb.append(c22052.f71473 == EnumC0884.LIMIT_REACHED ? BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX : "");
        String string2 = sb.toString();
        if (iM17745 != -1) {
            string2 = iM17745 + "/" + string2;
        }
        return new C11469(string2, iM17743, iM17743 == 0 && c22052.f71473 == EnumC0884.COMPLETE, false);
    }

    public C12880(C6111 c6111) {
        ThreadPoolExecutor threadPoolExecutor = f42827;
        this.f42834 = new Object();
        this.f42832 = C22052.m48999(null, 0, 0);
        this.f42837 = new WeakReference(c6111);
        C13638.requireNonNull(threadPoolExecutor);
        this.f42839 = threadPoolExecutor;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ Thread m31916(Runnable runnable) {
        Thread thread = new Thread(runnable, "Search-Highlight-Worker-" + f42828.incrementAndGet());
        thread.setDaemon(true);
        return thread;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31937(InterfaceC2916 interfaceC2916, C14690 c14690) {
        C13638.requireNonNull(interfaceC2916, TextBundle.TEXT_ENTRY);
        synchronized (this.f42834) {
            m31915();
            this.f42830 = c14690;
            this.f42840 = interfaceC2916;
            this.f42832 = C22052.m48999(interfaceC2916, interfaceC2916.mo2395(), interfaceC2916.length());
            if (!this.f42833 && !this.f42838) {
                m31926(interfaceC2916);
            }
        }
        m31925();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m31941() {
        return this.f42832.f71471.m17743() != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31934(Canvas canvas, int i, int i2, float f, float f2, C4916 c4916, C1590 c1590, InterfaceC13855 interfaceC13855) {
        int iM17742;
        C6529 c6529 = this.f42832.f71471;
        if (c6529.m17743() == 0 || i == i2) {
            return;
        }
        float fM2080 = 0.0f;
        int iM17749 = c6529.m17749(i);
        int i3 = i;
        while (iM17749 < c6529.m17743() && (iM17742 = c6529.m17742(iM17749)) < i2) {
            int iMax = Math.max(i, iM17742);
            int iMin = Math.min(i2, c6529.m17744(iM17749));
            if (i3 < iMax) {
                fM2080 += ((C0363) interfaceC13855).m2080(i3, fM2080, iMax);
            }
            float f3 = fM2080;
            float fM2081 = f3 + ((C0363) interfaceC13855).m2080(iMax, f3, iMin);
            int i4 = c1590.f6414;
            if (i4 == 0) {
                c4916.setColor(c1590.f6441);
                canvas.drawRect(f3, f, fM2081, f2, c4916);
            } else {
                c4916.setColor(i4);
                canvas.drawRect(f3, f, fM2081, f2, c4916);
                c4916.setColor(c1590.f6441);
                float fM33769 = C13932.m33769(1.0f);
                canvas.drawRect(f3 + fM33769, f + fM33769, fM2081 - fM33769, f2 - fM33769, c4916);
            }
            iM17749++;
            i3 = iMin;
            fM2080 = fM2081;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31933() {
        synchronized (this.f42834) {
            m31915();
            this.f42830 = null;
            InterfaceC0507 interfaceC0507 = this.f42840;
            int length = 0;
            int iMo2395 = interfaceC0507 == null ? 0 : interfaceC0507.mo2395();
            if (interfaceC0507 != null) {
                length = interfaceC0507.length();
            }
            this.f42832 = C22052.m48999(interfaceC0507, iMo2395, length);
        }
        m31925();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m31938() {
        m31933();
        synchronized (this.f42834) {
            this.f42832 = new C22052(this.f42832.f71474, this.f42832.f71472, this.f42832.f71471, EnumC0884.INVALID_PATTERN, 0);
        }
        m31925();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31936(InterfaceC0507 interfaceC0507, int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return;
        }
        synchronized (this.f42834) {
            if (this.f42830 == null) {
                return;
            }
            m31915();
            this.f42840 = interfaceC0507;
            if (!this.f42833 && !this.f42838) {
                int iMo2395 = interfaceC0507.mo2395();
                int length = interfaceC0507.length();
                long j = (((long) length) - ((long) i3)) + ((long) i2);
                C22052 c22052 = this.f42832;
                if (j >= 0 && j <= 2147483647L && c22052.f71474 == interfaceC0507 && c22052.f71472 + 1 == iMo2395 && c22052.f71471.m17748() == ((int) j)) {
                    c22052.f71471.m17746(i, i2, i3);
                    this.f42832 = new C22052(interfaceC0507, iMo2395, c22052.f71471, c22052.f71473, 0);
                } else {
                    this.f42832 = C22052.m48999(interfaceC0507, iMo2395, length);
                }
                m31926(interfaceC0507);
                m31925();
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m31940(InterfaceC0507 interfaceC0507) {
        boolean z;
        synchronized (this.f42834) {
            m31915();
            z = true;
            this.f42833 = true;
            this.f42840 = interfaceC0507;
            if (this.f42832.f71471.m17743() == 0) {
                z = false;
            }
            this.f42832 = C22052.m48999(interfaceC0507, interfaceC0507.mo2395(), interfaceC0507.length());
        }
        if (z) {
            m31925();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31935(InterfaceC0507 interfaceC0507) {
        synchronized (this.f42834) {
            m31915();
            this.f42833 = false;
            this.f42840 = interfaceC0507;
            this.f42832 = C22052.m48999(interfaceC0507, interfaceC0507.mo2395(), interfaceC0507.length());
            if (this.f42830 != null && !this.f42838) {
                m31926(interfaceC0507);
            }
        }
        m31925();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m31931(InterfaceC0507 interfaceC0507) {
        synchronized (this.f42834) {
            m31915();
            this.f42840 = interfaceC0507;
            this.f42838 = true;
            this.f42832 = C22052.m48999(interfaceC0507, interfaceC0507.mo2395(), interfaceC0507.length());
        }
        m31925();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m31939(InterfaceC0507 interfaceC0507) {
        synchronized (this.f42834) {
            if (this.f42840 != interfaceC0507) {
                return;
            }
            m31915();
            this.f42838 = false;
            this.f42832 = C22052.m48999(interfaceC0507, interfaceC0507.mo2395(), interfaceC0507.length());
            if (this.f42830 != null && !this.f42833) {
                m31926(interfaceC0507);
            }
            m31925();
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m31926(InterfaceC0507 interfaceC0507) {
        int i;
        int i2;
        int iMo2395 = interfaceC0507.mo2395();
        int length = interfaceC0507.length();
        C6111 c6111 = (C6111) this.f42837.get();
        C17069 c17069M16807 = c6111 != null ? c6111.m16807() : null;
        boolean z = c17069M16807 != null && (i = c17069M16807.f54487) >= 0 && i < (i2 = c17069M16807.f54486) && i2 <= length;
        int i3 = z ? c17069M16807.f54487 : -1;
        int i4 = z ? c17069M16807.f54486 : -1;
        int i5 = this.f42831 + 1;
        this.f42831 = i5;
        C5118 c5118 = new C5118(i5, this.f42830, interfaceC0507, iMo2395, length, i3, i4);
        this.f42832 = new C22052(this.f42840, iMo2395, this.f42832.f71471, EnumC0884.SEARCHING, 0);
        this.f42836 = f42829.schedule(new RunnableC23316(1, this, c5118), 100L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m31930(final C12880 c12880, final C5118 c5118) {
        synchronized (c12880.f42834) {
            if (c12880.m31928(c5118) && C5118.m14265(c5118)) {
                RejectedExecutionException e = null;
                c12880.f42836 = null;
                try {
                    final Future<?> futureSubmit = c12880.f42839.submit(new Runnable() { // from class: l.֫ۗۖ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C12880.m31922(this.f6275, c5118);
                        }
                    });
                    c12880.f42835 = futureSubmit;
                    c12880.f42841 = f42829.schedule(new Runnable() { // from class: l.ۢۗۖ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C12880.m31923(this.f31581, c5118, futureSubmit);
                        }
                    }, 3500L, TimeUnit.MILLISECONDS);
                } catch (RejectedExecutionException e2) {
                    e = e2;
                }
                if (e != null) {
                    c12880.m31920(c5118, e);
                    return;
                }
                return;
            }
            c12880.m31929(c5118);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[LOOP:0: B:89:0x0069->B:100:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00c0 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:6:0x001c, B:11:0x002c, B:13:0x0032, B:15:0x003c, B:18:0x0048, B:20:0x0059, B:21:0x0064, B:23:0x0069, B:24:0x006d, B:29:0x007a, B:32:0x0081, B:34:0x0087, B:65:0x00de, B:44:0x00a1, B:48:0x00af, B:50:0x00b3, B:51:0x00b6, B:52:0x00bb, B:55:0x00c0, B:57:0x00cb, B:35:0x008a, B:37:0x0090, B:38:0x0093, B:40:0x0099, B:41:0x009c, B:58:0x00ce, B:60:0x00d3, B:62:0x00d7, B:64:0x00db, B:72:0x00f8, B:73:0x00f9), top: B:86:0x001c, inners: #3, #5 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x00cb A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31922(final C12880 c12880, final C5118 c5118) {
        EnumC0884 enumC0884;
        C3706 c3706 = new C3706();
        EnumC0884 enumC0885 = EnumC0884.IDLE;
        if (c12880.f42831 == c5118.f17824) {
            Runnable runnable = new Runnable() { // from class: l.ۗۗۖ
                @Override // java.lang.Runnable
                public final void run() {
                    C12880.m31927(this.f11085, c5118);
                }
            };
            try {
                C3329 c3329Mo2399 = c5118.f17828.mo2399();
                try {
                    c3329Mo2399.m9894(runnable);
                    if (!(c12880.f42831 == c5118.f17824) || !C5118.m14265(c5118) || c3329Mo2399.m9896() != c5118.f17827 || c3329Mo2399.length() != c5118.f17822) {
                        c12880.m31919(c5118);
                    } else {
                        C6222 c6222Matcher = c5118.f17826.matcher((CharSequence) c3329Mo2399);
                        c6222Matcher.m17263(runnable);
                        if (C5118.m14269(c5118)) {
                            c6222Matcher.m17275region(c5118.f17825, c5118.f17823);
                        }
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        int i = 0;
                        while (true) {
                            try {
                                try {
                                    boolean zFind = c6222Matcher.find();
                                    if ((c12880.f42831 == c5118.f17824) && C5118.m14265(c5118)) {
                                        if (c6222Matcher.m17270()) {
                                            enumC0884 = EnumC0884.TIMED_OUT;
                                        } else if (c6222Matcher.m17258()) {
                                            enumC0884 = EnumC0884.RESOURCE_LIMIT;
                                        } else {
                                            enumC0884 = c6222Matcher.m17273() ? EnumC0884.FAILED : EnumC0884.COMPLETE;
                                        }
                                        if (!zFind) {
                                            break;
                                        }
                                        int iStart = c6222Matcher.start();
                                        int iEnd = c6222Matcher.end();
                                        if (iStart != iEnd) {
                                            if (i == 9999) {
                                                if (enumC0884 != EnumC0884.COMPLETE) {
                                                    break;
                                                }
                                                enumC0884 = EnumC0884.LIMIT_REACHED;
                                                break;
                                            }
                                            c3706.m10879(iStart, iEnd);
                                            i++;
                                            if (enumC0884 == EnumC0884.COMPLETE) {
                                                break;
                                                break;
                                            } else if (SystemClock.uptimeMillis() - jUptimeMillis > c.a) {
                                                enumC0884 = EnumC0884.TIMED_OUT;
                                                break;
                                            }
                                        } else if (enumC0884 == EnumC0884.COMPLETE) {
                                            break;
                                        } else if (SystemClock.uptimeMillis() - jUptimeMillis > c.a) {
                                            enumC0884 = EnumC0884.TIMED_OUT;
                                            break;
                                        }
                                    }
                                    c12880.m31919(c5118);
                                } catch (RuntimeException e) {
                                    enumC0884 = e instanceof C18188 ? EnumC0884.RESOURCE_LIMIT : EnumC0884.FAILED;
                                }
                            } catch (CancellationException e2) {
                                throw e2;
                            }
                        }
                        C2295 c2295 = new C2295(c5118, c3706.m10878(c5118.f17822), enumC0884);
                        c3329Mo2399.close();
                        try {
                            c12880.m31918(c2295);
                            return;
                        } catch (RuntimeException e3) {
                            c12880.m31920(c5118, e3);
                            return;
                        }
                    }
                    c3329Mo2399.close();
                } catch (Throwable th) {
                    try {
                        c3329Mo2399.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (CancellationException unused) {
                c12880.m31919(c5118);
            } catch (RuntimeException e4) {
                c12880.m31920(c5118, e4);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31923(C12880 c12880, C5118 c5118, Future future) {
        boolean z;
        synchronized (c12880.f42834) {
            if (!c12880.m31928(c5118) || future.isDone()) {
                z = false;
            } else {
                c12880.m31921(c5118, EnumC0884.TIMED_OUT);
                z = true;
                c12880.f42831++;
                c12880.f42835 = null;
                c12880.f42841 = null;
            }
        }
        if (z) {
            c12880.m31917(future);
            c12880.m31925();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m31918(final C2295 c2295) {
        synchronized (this.f42834) {
            if (m31928(c2295.f8174) && C5118.m14265(c2295.f8174)) {
                ScheduledFuture scheduledFuture = this.f42841;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.f42841 = null;
                }
                final C6111 c6111 = (C6111) this.f42837.get();
                if (c6111 == null || !c6111.post(new Runnable() { // from class: l.ۙۙۚ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C12880.m31924(this.f15707, c6111, c2295);
                    }
                })) {
                    m31919(c2295.f8174);
                    return;
                }
                return;
            }
            m31929(c2295.f8174);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31924(C12880 c12880, C6111 c6111, C2295 c2295) {
        synchronized (c12880.f42834) {
            C5118 c5118 = c2295.f8174;
            if (c12880.m31928(c5118) && C5118.m14265(c5118) && c6111.m17000() == c5118.f17828) {
                c12880.f42831++;
                c12880.f42835 = null;
                c12880.f42832 = new C22052(c5118.f17828, c5118.f17827, c2295.f8175, c2295.f8176, 0);
                c6111.m16984();
                c6111.invalidate();
                return;
            }
            c12880.m31929(c5118);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m31919(C5118 c5118) {
        synchronized (this.f42834) {
            m31929(c5118);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m31920(C5118 c5118, RuntimeException runtimeException) {
        synchronized (this.f42834) {
            if (m31928(c5118)) {
                Future future = this.f42835;
                if (future != null) {
                    m31917(future);
                }
                m31929(c5118);
                m31921(c5118, runtimeException instanceof C18188 ? EnumC0884.RESOURCE_LIMIT : EnumC0884.FAILED);
                m31925();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m31921(C5118 c5118, EnumC0884 enumC0884) {
        C22052 c22052 = this.f42832;
        if (c22052.f71474 == c5118.f17828 && c22052.f71472 == c5118.f17827) {
            this.f42832 = new C22052(c22052.f71474, c22052.f71472, c22052.f71471, enumC0884, 0);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m31917(Future future) {
        future.cancel(false);
        if (future instanceof Runnable) {
            this.f42839.remove((Runnable) future);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m31929(C5118 c5118) {
        if (m31928(c5118)) {
            m31921(c5118, EnumC0884.IDLE);
            this.f42831++;
            this.f42836 = null;
            this.f42835 = null;
            ScheduledFuture scheduledFuture = this.f42841;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.f42841 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m31927(C12880 c12880, C5118 c5118) {
        if (c12880.f42831 != c5118.f17824 || Thread.currentThread().isInterrupted()) {
            throw new CancellationException("Search highlight canceled");
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private boolean m31928(C5118 c5118) {
        return this.f42831 == c5118.f17824 && this.f42830 == c5118.f17826 && this.f42840 == c5118.f17828 && !this.f42833 && !this.f42838;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m31915() {
        this.f42831++;
        if (this.f42832.f71473 == EnumC0884.SEARCHING) {
            this.f42832 = new C22052(this.f42832.f71474, this.f42832.f71472, this.f42832.f71471, EnumC0884.IDLE, 0);
        }
        ScheduledFuture scheduledFuture = this.f42836;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f42836 = null;
        }
        Future future = this.f42835;
        if (future != null) {
            m31917(future);
            this.f42835 = null;
        }
        ScheduledFuture scheduledFuture2 = this.f42841;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
            this.f42841 = null;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m31925() {
        final C6111 c6111 = (C6111) this.f42837.get();
        if (c6111 != null) {
            c6111.post(new Runnable() { // from class: l.᩻ۗۖ
                @Override // java.lang.Runnable
                public final void run() {
                    C6111 c6112 = c6111;
                    c6112.m16984();
                    c6112.invalidate();
                }
            });
        }
    }
}
