package l;

import com.umeng.commonsdk.statistics.AnalyticsConstants;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: l.֫ܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7SL */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2059 extends AbstractC10261 implements InterfaceFutureC14736 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final AbstractC11007 f6851;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final boolean f6852;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile C7257 f6855;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile C5788 f6856;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile Object f6857;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Object f6854 = new Object();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final C4296 f6853 = new C4296(AbstractC22196.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m7112(C7257 c7257, C7257 c7258) {
        return f6851.mo27860(this, c7257, c7258);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return m7114();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return m7110(j, timeUnit);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7257 m7111(C7257 c7257) {
        return f6851.mo27855(this, c7257);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m7109(AbstractC2059 abstractC2059, Object obj, Object obj2) {
        return f6851.mo27858(abstractC2059, obj, obj2);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m7113() {
        for (C5788 c5788Mo27854 = f6851.mo27854(this, C5788.f19879); c5788Mo27854 != null; c5788Mo27854 = c5788Mo27854.f19880) {
            Thread thread = c5788Mo27854.f19881;
            if (thread != null) {
                c5788Mo27854.f19881 = null;
                LockSupport.unpark(thread);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m7110(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f6857;
        if ((obj != null) && (!(obj instanceof RunnableC9493))) {
            return AbstractC22196.m50208(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C5788 c5788 = this.f6856;
            if (c5788 != C5788.f19879) {
                C5788 c5789 = new C5788();
                while (true) {
                    m7108(c5789, c5788);
                    if (f6851.mo27859(this, c5788, c5789)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                m7106(c5789);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f6857;
                            if ((obj2 != null) && (!(obj2 instanceof RunnableC9493))) {
                                return AbstractC22196.m50208(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m7106(c5789);
                        break;
                    }
                    c5788 = this.f6856;
                    if (c5788 == C5788.f19879) {
                    }
                }
            }
            Object obj3 = this.f6857;
            C17359.requireNonNull(obj3);
            return AbstractC22196.m50208(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f6857;
            if ((obj4 != null) && (!(obj4 instanceof RunnableC9493))) {
                return AbstractC22196.m50208(obj4);
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
        StringBuilder sbM8289 = C2458.m8289("Waited ", " ", j);
        sbM8289.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbM8289.toString();
        if (nanos + 1000 < 0) {
            String strM34972 = C14483.m34972(string3, " (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strM34973 = strM34972 + jConvert + " " + lowerCase;
                if (z) {
                    strM34973 = C14483.m34972(strM34973, ",");
                }
                strM34972 = C14483.m34972(strM34973, " ");
            }
            if (z) {
                strM34972 = strM34972 + nanos2 + " nanoseconds ";
            }
            string3 = C14483.m34972(strM34972, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(C14483.m34972(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(C20196.m46451(string3, " for ", string));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object m7114() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f6857;
        if ((obj2 != null) & (!(obj2 instanceof RunnableC9493))) {
            return AbstractC22196.m50208(obj2);
        }
        C5788 c5788 = this.f6856;
        if (c5788 != C5788.f19879) {
            C5788 c5789 = new C5788();
            do {
                m7108(c5789, c5788);
                if (!f6851.mo27859(this, c5788, c5789)) {
                    c5788 = this.f6856;
                } else {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m7106(c5789);
                            throw new InterruptedException();
                        }
                        obj = this.f6857;
                    } while (!((obj != null) & (!(obj instanceof RunnableC9493))));
                    return AbstractC22196.m50208(obj);
                }
            } while (c5788 != C5788.f19879);
        }
        Object obj3 = this.f6857;
        C17359.requireNonNull(obj3);
        return AbstractC22196.m50208(obj3);
    }

    static {
        boolean z;
        AbstractC11007 c22942;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f6852 = z;
        String property = System.getProperty("java.runtime.name", "");
        if (property == null || property.contains(AnalyticsConstants.SDK_TYPE)) {
            try {
                c22942 = new C13245();
            } catch (Error | Exception unused2) {
                c22942 = new C22942();
            }
        } else {
            c22942 = new C22942();
        }
        f6851 = c22942;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7107(C5788 c5788, Thread thread) {
        f6851.mo27856(c5788, thread);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7108(C5788 c5788, C5788 c5789) {
        f6851.mo27857(c5788, c5789);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m7106(C5788 c5788) {
        c5788.f19881 = null;
        while (true) {
            C5788 c5789 = this.f6856;
            if (c5789 == C5788.f19879) {
                return;
            }
            C5788 c57810 = null;
            while (c5789 != null) {
                C5788 c57811 = c5789.f19880;
                if (c5789.f19881 != null) {
                    c57810 = c5789;
                } else if (c57810 == null) {
                    if (!f6851.mo27859(this, c5789, c57811)) {
                    }
                } else {
                    c57810.f19880 = c57811;
                    if (c57810.f19881 == null) {
                    }
                }
                c5789 = c57811;
            }
            return;
        }
    }
}
