package l;

import com.umeng.commonsdk.statistics.AnalyticsConstants;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: l.᩸ۢܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7SL */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21500 extends AbstractC1744 implements InterfaceFutureC12329 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final boolean f69865;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final AbstractC22206 f69866;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile C15151 f69868;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public volatile C13740 f69869;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile Object f69870;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Object f69867 = new Object();

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final C16562 f69864 = new C16562(AbstractC5272.class);

    public Object get() {
        return m48144();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m48142(C13740 c13740, C13740 c13741) {
        return f69866.mo3893(this, c13740, c13741);
    }

    public Object get(long j, TimeUnit timeUnit) {
        return m48140(j, timeUnit);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13740 m48141(C13740 c13740) {
        return f69866.mo3888(this, c13740);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m48139(AbstractC21500 abstractC21500, Object obj, Object obj2) {
        return f69866.mo3892(abstractC21500, obj, obj2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m48140(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C15151 c15151 = C15151.f49492;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f69870;
        if ((obj != null) && (!(obj instanceof RunnableC9279))) {
            return AbstractC5272.m14560(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C15151 c15152 = this.f69868;
            if (c15152 != c15151) {
                C15151 c15153 = new C15151();
                while (true) {
                    m48138(c15153, c15152);
                    if (f69866.mo3894(this, c15152, c15153)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                m48136(c15153);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f69870;
                            if ((obj2 != null) && (!(obj2 instanceof RunnableC9279))) {
                                return AbstractC5272.m14560(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m48136(c15153);
                        break;
                    }
                    c15152 = this.f69868;
                    if (c15152 == c15151) {
                    }
                }
            }
            Object obj3 = this.f69870;
            C13638.requireNonNull(obj3);
            return AbstractC5272.m14560(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f69870;
            if ((obj4 != null) && (!(obj4 instanceof RunnableC9279))) {
                return AbstractC5272.m14560(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbM39970 = C17114.m39970("Waited ", " ", j);
        sbM39970.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbM39970.toString();
        if (nanos + 1000 < 0) {
            String strM37076 = C15489.m37076(string3, " (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strM37077 = strM37076 + jConvert + " " + lowerCase;
                if (z) {
                    strM37077 = C15489.m37076(strM37077, ",");
                }
                strM37076 = C15489.m37076(strM37077, " ");
            }
            if (z) {
                strM37076 = strM37076 + nanos2 + " nanoseconds ";
            }
            string3 = C15489.m37076(strM37076, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(C15489.m37076(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(C1679.m5594(string3, " for ", string));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object m48144() throws InterruptedException {
        Object obj;
        C15151 c15151 = C15151.f49492;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f69870;
        if ((obj2 != null) & (!(obj2 instanceof RunnableC9279))) {
            return AbstractC5272.m14560(obj2);
        }
        C15151 c15152 = this.f69868;
        if (c15152 != c15151) {
            C15151 c15153 = new C15151();
            do {
                m48138(c15153, c15152);
                if (!f69866.mo3894(this, c15152, c15153)) {
                    c15152 = this.f69868;
                } else {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m48136(c15153);
                            throw new InterruptedException();
                        }
                        obj = this.f69870;
                    } while (!((obj != null) & (!(obj instanceof RunnableC9279))));
                    return AbstractC5272.m14560(obj);
                }
            } while (c15152 != c15151);
        }
        Object obj3 = this.f69870;
        C13638.requireNonNull(obj3);
        return AbstractC5272.m14560(obj3);
    }

    static {
        boolean z;
        AbstractC22206 c13034;
        Throwable th;
        AbstractC22206 c22912;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f69865 = z;
        String property = System.getProperty("java.runtime.name", "");
        Throwable e = null;
        if (property == null || property.contains(AnalyticsConstants.SDK_TYPE)) {
            try {
                c22912 = new C22912();
            } catch (Error | Exception e2) {
                try {
                    c13034 = new C1038();
                } catch (Error | Exception e3) {
                    e = e3;
                    c13034 = new C13034();
                }
                AbstractC22206 abstractC22206 = c13034;
                th = e2;
                c22912 = abstractC22206;
            }
        } else {
            try {
                c22912 = new C1038();
            } catch (NoClassDefFoundError unused2) {
                c22912 = new C13034();
            }
        }
        th = null;
        f69866 = c22912;
        if (e != null) {
            C16562 c16562 = f69864;
            Logger loggerM38979 = c16562.m38979();
            Level level = Level.SEVERE;
            loggerM38979.log(level, "UnsafeAtomicHelper is broken!", th);
            c16562.m38979().log(level, "AtomicReferenceFieldUpdaterAtomicHelper is broken!", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48137(C15151 c15151, Thread thread) {
        f69866.mo3890(c15151, thread);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48138(C15151 c15151, C15151 c15152) {
        f69866.mo3891(c15151, c15152);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m48143() {
        for (C15151 c15151Mo3889 = f69866.mo3889(this); c15151Mo3889 != null; c15151Mo3889 = c15151Mo3889.f49493) {
            Thread thread = c15151Mo3889.f49494;
            if (thread != null) {
                c15151Mo3889.f49494 = null;
                LockSupport.unpark(thread);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m48136(C15151 c15151) {
        c15151.f49494 = null;
        while (true) {
            C15151 c15152 = this.f69868;
            if (c15152 == C15151.f49492) {
                return;
            }
            C15151 c15153 = null;
            while (c15152 != null) {
                C15151 c15154 = c15152.f49493;
                if (c15152.f49494 != null) {
                    c15153 = c15152;
                } else if (c15153 == null) {
                    if (!f69866.mo3894(this, c15152, c15154)) {
                    }
                } else {
                    c15153.f49493 = c15154;
                    if (c15153.f49494 == null) {
                    }
                }
                c15152 = c15154;
            }
            return;
        }
    }
}
