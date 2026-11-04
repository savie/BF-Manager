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

/* JADX INFO: renamed from: l.ۖ᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S4H6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2937 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final ThreadPoolExecutor f9603;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final ScheduledExecutorService f9604;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f9605 = new AtomicInteger();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public volatile C1446 f9606;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f9607;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final WeakReference f9608;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ScheduledFuture f9609;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Future f9610;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C18415 f9611;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC9629 f9612;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ThreadPoolExecutor f9613;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Object f9614;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f9615;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile int f9616;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public ScheduledFuture f9617;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(64), new ThreadFactoryC4429());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f9603 = threadPoolExecutor;
        f9604 = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC6667(0));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8158 m9602(Context context, int i, int i2) {
        String string;
        C1446 c1446 = this.f9606;
        int iM20321 = c1446.f5066.m20321();
        switch (C0700.f2605[c1446.f5064.ordinal()]) {
            case 1:
            case 2:
                string = "…";
                break;
            case 3:
                string = iM20321 != 0 ? context.getString(R.string.MT_Protector, Integer.valueOf(iM20321)) : context.getString(R.string.MT_Protector);
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
        boolean z = c1446.f5064 == EnumC9648.SEARCHING || c1446.f5064 == EnumC9648.IDLE;
        if (string != null) {
            return new C8158(string, iM20321, !z, z);
        }
        int iM20323 = c1446.f5066.m20323(i, i2);
        StringBuilder sb = new StringBuilder();
        sb.append(iM20321);
        sb.append(c1446.f5064 == EnumC9648.LIMIT_REACHED ? BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX : "");
        String string2 = sb.toString();
        if (iM20323 != -1) {
            string2 = iM20323 + "/" + string2;
        }
        return new C8158(string2, iM20321, iM20321 == 0 && c1446.f5064 == EnumC9648.COMPLETE, false);
    }

    public C2937(C24132 c24132) {
        ThreadPoolExecutor threadPoolExecutor = f9603;
        this.f9614 = new Object();
        this.f9606 = C1446.m5199(null, 0, 0);
        this.f9608 = new WeakReference(c24132);
        C17359.requireNonNull(threadPoolExecutor);
        this.f9613 = threadPoolExecutor;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ Thread m9586(Runnable runnable) {
        Thread thread = new Thread(runnable, "Search-Highlight-Worker-" + f9605.incrementAndGet());
        thread.setDaemon(true);
        return thread;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9607(InterfaceC19106 interfaceC19106, C18415 c18415) {
        C17359.requireNonNull(interfaceC19106, TextBundle.TEXT_ENTRY);
        synchronized (this.f9614) {
            m9601();
            this.f9611 = c18415;
            this.f9612 = interfaceC19106;
            this.f9606 = C1446.m5199(interfaceC19106, interfaceC19106.mo15344(), interfaceC19106.length());
            if (!this.f9607 && !this.f9615) {
                m9598(interfaceC19106);
            }
        }
        m9597();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m9611() {
        return this.f9606.f5066.m20321() != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9604(Canvas canvas, int i, int i2, float f, float f2, C10232 c10232, C14540 c14540, InterfaceC7829 interfaceC7829) {
        int iM20328;
        C7412 c7412 = this.f9606.f5066;
        if (c7412.m20321() == 0 || i == i2) {
            return;
        }
        float fM22846 = 0.0f;
        int iM20327 = c7412.m20327(i);
        int i3 = i;
        while (iM20327 < c7412.m20321() && (iM20328 = c7412.m20328(iM20327)) < i2) {
            int iMax = Math.max(i, iM20328);
            int iMin = Math.min(i2, c7412.m20322(iM20327));
            if (i3 < iMax) {
                fM22846 += ((C8533) interfaceC7829).m22846(i3, fM22846, iMax);
            }
            float f3 = fM22846;
            float fM22847 = f3 + ((C8533) interfaceC7829).m22846(iMax, f3, iMin);
            int i4 = c14540.f45762;
            if (i4 == 0) {
                c10232.setColor(c14540.f45766);
                canvas.drawRect(f3, f, fM22847, f2, c10232);
            } else {
                c10232.setColor(i4);
                canvas.drawRect(f3, f, fM22847, f2, c10232);
                c10232.setColor(c14540.f45766);
                float fM19160 = C6907.m19160(1.0f);
                canvas.drawRect(f3 + fM19160, f + fM19160, fM22847 - fM19160, f2 - fM19160, c10232);
            }
            iM20327++;
            i3 = iMin;
            fM22846 = fM22847;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9603() {
        synchronized (this.f9614) {
            m9601();
            this.f9611 = null;
            InterfaceC9629 interfaceC9629 = this.f9612;
            int length = 0;
            int iMo15344 = interfaceC9629 == null ? 0 : interfaceC9629.mo15344();
            if (interfaceC9629 != null) {
                length = interfaceC9629.length();
            }
            this.f9606 = C1446.m5199(interfaceC9629, iMo15344, length);
        }
        m9597();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m9608() {
        m9603();
        synchronized (this.f9614) {
            this.f9606 = new C1446(this.f9606.f5065, this.f9606.f5063, this.f9606.f5066, EnumC9648.INVALID_PATTERN, 0);
        }
        m9597();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9606(InterfaceC9629 interfaceC9629, int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return;
        }
        synchronized (this.f9614) {
            if (this.f9611 == null) {
                return;
            }
            m9601();
            this.f9612 = interfaceC9629;
            if (!this.f9607 && !this.f9615) {
                int iMo15344 = interfaceC9629.mo15344();
                int length = interfaceC9629.length();
                long j = (((long) length) - ((long) i3)) + ((long) i2);
                C1446 c1446 = this.f9606;
                if (j >= 0 && j <= 2147483647L && c1446.f5065 == interfaceC9629 && c1446.f5063 + 1 == iMo15344 && c1446.f5066.m20326() == ((int) j)) {
                    c1446.f5066.m20324(i, i2, i3);
                    this.f9606 = new C1446(interfaceC9629, iMo15344, c1446.f5066, c1446.f5064, 0);
                } else {
                    this.f9606 = C1446.m5199(interfaceC9629, iMo15344, length);
                }
                m9598(interfaceC9629);
                m9597();
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m9610(InterfaceC9629 interfaceC9629) {
        boolean z;
        synchronized (this.f9614) {
            m9601();
            z = true;
            this.f9607 = true;
            this.f9612 = interfaceC9629;
            if (this.f9606.f5066.m20321() == 0) {
                z = false;
            }
            this.f9606 = C1446.m5199(interfaceC9629, interfaceC9629.mo15344(), interfaceC9629.length());
        }
        if (z) {
            m9597();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9605(InterfaceC9629 interfaceC9629) {
        synchronized (this.f9614) {
            m9601();
            this.f9607 = false;
            this.f9612 = interfaceC9629;
            this.f9606 = C1446.m5199(interfaceC9629, interfaceC9629.mo15344(), interfaceC9629.length());
            if (this.f9611 != null && !this.f9615) {
                m9598(interfaceC9629);
            }
        }
        m9597();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m9612(InterfaceC9629 interfaceC9629) {
        synchronized (this.f9614) {
            m9601();
            this.f9612 = interfaceC9629;
            this.f9615 = true;
            this.f9606 = C1446.m5199(interfaceC9629, interfaceC9629.mo15344(), interfaceC9629.length());
        }
        m9597();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m9609(InterfaceC9629 interfaceC9629) {
        synchronized (this.f9614) {
            if (this.f9612 != interfaceC9629) {
                return;
            }
            m9601();
            this.f9615 = false;
            this.f9606 = C1446.m5199(interfaceC9629, interfaceC9629.mo15344(), interfaceC9629.length());
            if (this.f9611 != null && !this.f9607) {
                m9598(interfaceC9629);
            }
            m9597();
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m9598(InterfaceC9629 interfaceC9629) {
        int i;
        int i2;
        int iMo15344 = interfaceC9629.mo15344();
        int length = interfaceC9629.length();
        C24132 c24132 = (C24132) this.f9608.get();
        C20837 c20837M53974 = c24132 != null ? c24132.m53974() : null;
        boolean z = c20837M53974 != null && (i = c20837M53974.f66719) >= 0 && i < (i2 = c20837M53974.f66718) && i2 <= length;
        int i3 = z ? c20837M53974.f66719 : -1;
        int i4 = z ? c20837M53974.f66718 : -1;
        int i5 = this.f9616 + 1;
        this.f9616 = i5;
        C10394 c10394 = new C10394(i5, this.f9611, interfaceC9629, iMo15344, length, i3, i4);
        this.f9606 = new C1446(this.f9612, iMo15344, this.f9606.f5066, EnumC9648.SEARCHING, 0);
        this.f9609 = f9604.schedule(new RunnableC8337(1, this, c10394), 100L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m9599(final C2937 c2937, final C10394 c10394) {
        synchronized (c2937.f9614) {
            if (c2937.m9596(c10394) && C10394.m26702(c10394)) {
                RejectedExecutionException e = null;
                c2937.f9609 = null;
                try {
                    final Future<?> futureSubmit = c2937.f9613.submit(new RunnableC6846(1, c2937, c10394));
                    c2937.f9610 = futureSubmit;
                    c2937.f9617 = f9604.schedule(new Runnable() { // from class: l.ܰ᩷ᩴ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2937.m9589(this.f48594, c10394, futureSubmit);
                        }
                    }, 3500L, TimeUnit.MILLISECONDS);
                } catch (RejectedExecutionException e2) {
                    e = e2;
                }
                if (e != null) {
                    c2937.m9592(c10394, e);
                    return;
                }
                return;
            }
            c2937.m9600(c10394);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[LOOP:0: B:89:0x0069->B:100:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00c0 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:6:0x001c, B:11:0x002c, B:13:0x0032, B:15:0x003c, B:18:0x0048, B:20:0x0059, B:21:0x0064, B:23:0x0069, B:24:0x006d, B:29:0x007a, B:32:0x0081, B:34:0x0087, B:65:0x00de, B:44:0x00a1, B:48:0x00af, B:50:0x00b3, B:51:0x00b6, B:52:0x00bb, B:55:0x00c0, B:57:0x00cb, B:35:0x008a, B:37:0x0090, B:38:0x0093, B:40:0x0099, B:41:0x009c, B:58:0x00ce, B:60:0x00d3, B:62:0x00d7, B:64:0x00db, B:72:0x00f8, B:73:0x00f9), top: B:86:0x001c, inners: #3, #5 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x00cb A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m9588(final C2937 c2937, final C10394 c10394) {
        EnumC9648 enumC9648;
        C8903 c8903 = new C8903();
        EnumC9648 enumC9649 = EnumC9648.IDLE;
        if (c2937.f9616 == c10394.f33041) {
            Runnable runnable = new Runnable() { // from class: l.᩶᩷ᩴ
                @Override // java.lang.Runnable
                public final void run() {
                    C2937.m9595(this.f68944, c10394);
                }
            };
            try {
                C15508 c15508Mo15350 = c10394.f33044.mo15350();
                try {
                    c15508Mo15350.m37180(runnable);
                    if (!(c2937.f9616 == c10394.f33041) || !C10394.m26702(c10394) || c15508Mo15350.m37177() != c10394.f33046 || c15508Mo15350.length() != c10394.f33043) {
                        c2937.m9591(c10394);
                    } else {
                        C4245 c4245Matcher = c10394.f33042.matcher((CharSequence) c15508Mo15350);
                        c4245Matcher.m13553(runnable);
                        if (C10394.m26704(c10394)) {
                            c4245Matcher.m13567region(c10394.f33045, c10394.f33047);
                        }
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        int i = 0;
                        while (true) {
                            try {
                                try {
                                    boolean zFind = c4245Matcher.find();
                                    if ((c2937.f9616 == c10394.f33041) && C10394.m26702(c10394)) {
                                        if (c4245Matcher.m13557()) {
                                            enumC9648 = EnumC9648.TIMED_OUT;
                                        } else if (c4245Matcher.m13560()) {
                                            enumC9648 = EnumC9648.RESOURCE_LIMIT;
                                        } else {
                                            enumC9648 = c4245Matcher.m13561() ? EnumC9648.FAILED : EnumC9648.COMPLETE;
                                        }
                                        if (!zFind) {
                                            break;
                                        }
                                        int iStart = c4245Matcher.start();
                                        int iEnd = c4245Matcher.end();
                                        if (iStart != iEnd) {
                                            if (i == 9999) {
                                                if (enumC9648 != EnumC9648.COMPLETE) {
                                                    break;
                                                }
                                                enumC9648 = EnumC9648.LIMIT_REACHED;
                                                break;
                                            }
                                            c8903.m23814(iStart, iEnd);
                                            i++;
                                            if (enumC9648 == EnumC9648.COMPLETE) {
                                                break;
                                                break;
                                            } else if (SystemClock.uptimeMillis() - jUptimeMillis > c.a) {
                                                enumC9648 = EnumC9648.TIMED_OUT;
                                                break;
                                            }
                                        } else if (enumC9648 == EnumC9648.COMPLETE) {
                                            break;
                                        } else if (SystemClock.uptimeMillis() - jUptimeMillis > c.a) {
                                            enumC9648 = EnumC9648.TIMED_OUT;
                                            break;
                                        }
                                    }
                                    c2937.m9591(c10394);
                                } catch (RuntimeException e) {
                                    enumC9648 = e instanceof C24219 ? EnumC9648.RESOURCE_LIMIT : EnumC9648.FAILED;
                                }
                            } catch (CancellationException e2) {
                                throw e2;
                            }
                        }
                        C19345 c19345 = new C19345(c10394, c8903.m23813(c10394.f33043), enumC9648);
                        c15508Mo15350.close();
                        try {
                            c2937.m9594(c19345);
                            return;
                        } catch (RuntimeException e3) {
                            c2937.m9592(c10394, e3);
                            return;
                        }
                    }
                    c15508Mo15350.close();
                } catch (Throwable th) {
                    try {
                        c15508Mo15350.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (CancellationException unused) {
                c2937.m9591(c10394);
            } catch (RuntimeException e4) {
                c2937.m9592(c10394, e4);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m9589(C2937 c2937, C10394 c10394, Future future) {
        boolean z;
        synchronized (c2937.f9614) {
            if (!c2937.m9596(c10394) || future.isDone()) {
                z = false;
            } else {
                c2937.m9593(c10394, EnumC9648.TIMED_OUT);
                z = true;
                c2937.f9616++;
                c2937.f9610 = null;
                c2937.f9617 = null;
            }
        }
        if (z) {
            c2937.m9587(future);
            c2937.m9597();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m9594(final C19345 c19345) {
        synchronized (this.f9614) {
            if (m9596(c19345.f62505) && C10394.m26702(c19345.f62505)) {
                ScheduledFuture scheduledFuture = this.f9617;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.f9617 = null;
                }
                final C24132 c24132 = (C24132) this.f9608.get();
                if (c24132 == null || !c24132.post(new Runnable() { // from class: l.ܿ᩷ᩴ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2937.m9590(this.f60396, c24132, c19345);
                    }
                })) {
                    m9591(c19345.f62505);
                    return;
                }
                return;
            }
            m9600(c19345.f62505);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m9590(C2937 c2937, C24132 c24132, C19345 c19345) {
        synchronized (c2937.f9614) {
            C10394 c10394 = c19345.f62505;
            if (c2937.m9596(c10394) && C10394.m26702(c10394) && c24132.m54021() == c10394.f33044) {
                c2937.f9616++;
                c2937.f9610 = null;
                c2937.f9606 = new C1446(c10394.f33044, c10394.f33046, c19345.f62506, c19345.f62507, 0);
                c24132.m54070();
                c24132.invalidate();
                return;
            }
            c2937.m9600(c10394);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m9591(C10394 c10394) {
        synchronized (this.f9614) {
            m9600(c10394);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m9592(C10394 c10394, RuntimeException runtimeException) {
        synchronized (this.f9614) {
            if (m9596(c10394)) {
                Future future = this.f9610;
                if (future != null) {
                    m9587(future);
                }
                m9600(c10394);
                m9593(c10394, runtimeException instanceof C24219 ? EnumC9648.RESOURCE_LIMIT : EnumC9648.FAILED);
                m9597();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m9593(C10394 c10394, EnumC9648 enumC9648) {
        C1446 c1446 = this.f9606;
        if (c1446.f5065 == c10394.f33044 && c1446.f5063 == c10394.f33046) {
            this.f9606 = new C1446(c1446.f5065, c1446.f5063, c1446.f5066, enumC9648, 0);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m9587(Future future) {
        future.cancel(false);
        if (future instanceof Runnable) {
            this.f9613.remove((Runnable) future);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m9600(C10394 c10394) {
        if (m9596(c10394)) {
            m9593(c10394, EnumC9648.IDLE);
            this.f9616++;
            this.f9609 = null;
            this.f9610 = null;
            ScheduledFuture scheduledFuture = this.f9617;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.f9617 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m9595(C2937 c2937, C10394 c10394) {
        if (c2937.f9616 != c10394.f33041 || Thread.currentThread().isInterrupted()) {
            throw new CancellationException("Search highlight canceled");
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private boolean m9596(C10394 c10394) {
        return this.f9616 == c10394.f33041 && this.f9611 == c10394.f33042 && this.f9612 == c10394.f33044 && !this.f9607 && !this.f9615;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m9601() {
        this.f9616++;
        if (this.f9606.f5064 == EnumC9648.SEARCHING) {
            this.f9606 = new C1446(this.f9606.f5065, this.f9606.f5063, this.f9606.f5066, EnumC9648.IDLE, 0);
        }
        ScheduledFuture scheduledFuture = this.f9609;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f9609 = null;
        }
        Future future = this.f9610;
        if (future != null) {
            m9587(future);
            this.f9610 = null;
        }
        ScheduledFuture scheduledFuture2 = this.f9617;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
            this.f9617 = null;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m9597() {
        final C24132 c24132 = (C24132) this.f9608.get();
        if (c24132 != null) {
            c24132.post(new Runnable() { // from class: l.᩺᩷ᩴ
                @Override // java.lang.Runnable
                public final void run() {
                    C24132 c24133 = c24132;
                    c24133.m54070();
                    c24133.invalidate();
                }
            });
        }
    }
}
