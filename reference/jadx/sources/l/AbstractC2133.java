package l;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: l.֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: W9N5 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2133 implements InterfaceFutureC14736 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final AbstractC5116 f7015;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final boolean f7016 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final Logger f7017 = Logger.getLogger(AbstractC2133.class.getName());

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Object f7018;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile C23016 f7019;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile C5862 f7020;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile Object f7021;

    static {
        AbstractC5116 c13319;
        try {
            c13319 = new C20032(AtomicReferenceFieldUpdater.newUpdater(C5862.class, Thread.class, "᩷"), AtomicReferenceFieldUpdater.newUpdater(C5862.class, C5862.class, "ۙ"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2133.class, C5862.class, "ܿ"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2133.class, C23016.class, "ܰ"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2133.class, Object.class, "᩶"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c13319 = new C13319();
        }
        f7015 = c13319;
        if (th != null) {
            f7017.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f7018 = new Object();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m7371(C5862 c5862) {
        c5862.f20103 = null;
        while (true) {
            C5862 c5863 = this.f7020;
            if (c5863 == C5862.f20101) {
                return;
            }
            C5862 c5864 = null;
            while (c5863 != null) {
                C5862 c5865 = c5863.f20102;
                if (c5863.f20103 != null) {
                    c5864 = c5863;
                } else if (c5864 != null) {
                    c5864.f20102 = c5865;
                    if (c5864.f20103 == null) {
                    }
                } else if (!f7015.mo15476(this, c5863, c5865)) {
                }
                c5863 = c5865;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C5862 c5862 = C5862.f20101;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f7021;
        if ((obj != null) && (!(obj instanceof RunnableC15556))) {
            return m7368(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C5862 c5863 = this.f7020;
            if (c5863 != c5862) {
                C5862 c5864 = new C5862();
                while (true) {
                    AbstractC5116 abstractC5116 = f7015;
                    abstractC5116.mo15474(c5864, c5863);
                    if (abstractC5116.mo15476(this, c5863, c5864)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m7371(c5864);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f7021;
                            if ((obj2 != null) && (!(obj2 instanceof RunnableC15556))) {
                                return m7368(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m7371(c5864);
                        break;
                    }
                    c5863 = this.f7020;
                    if (c5863 == c5862) {
                    }
                }
            }
            return m7368(this.f7021);
        }
        while (nanos > 0) {
            Object obj3 = this.f7021;
            if ((obj3 != null) && (!(obj3 instanceof RunnableC15556))) {
                return m7368(obj3);
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

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        C5862 c5862 = C5862.f20101;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f7021;
        if ((obj2 != null) & (!(obj2 instanceof RunnableC15556))) {
            return m7368(obj2);
        }
        C5862 c5863 = this.f7020;
        if (c5863 != c5862) {
            C5862 c5864 = new C5862();
            do {
                AbstractC5116 abstractC5116 = f7015;
                abstractC5116.mo15474(c5864, c5863);
                if (abstractC5116.mo15476(this, c5863, c5864)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m7371(c5864);
                            throw new InterruptedException();
                        }
                        obj = this.f7021;
                    } while (!((obj != null) & (!(obj instanceof RunnableC15556))));
                    return m7368(obj);
                }
                c5863 = this.f7020;
            } while (c5863 != c5862);
        }
        return m7368(this.f7021);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m7368(Object obj) throws ExecutionException {
        if (obj instanceof C22270) {
            Throwable th = ((C22270) obj).f72123;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C11081) {
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f7018) {
            return null;
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f7021;
        return (!(obj instanceof RunnableC15556)) & (obj != null);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f7021 instanceof C22270;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C22270 c22270;
        Object obj = this.f7021;
        if ((obj == null) | (obj instanceof RunnableC15556)) {
            if (f7016) {
                c22270 = new C22270(new CancellationException("Future.cancel() was called."), z);
            } else if (z) {
                c22270 = C22270.f72121;
            } else {
                c22270 = C22270.f72122;
            }
            while (!f7015.mo15475(this, obj, c22270)) {
                obj = this.f7021;
                if (!(obj instanceof RunnableC15556)) {
                }
            }
            m7370(this);
            if (obj instanceof RunnableC15556) {
                throw null;
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Object m7372(AbstractC2133 abstractC2133) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = abstractC2133.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7370(AbstractC2133 abstractC2133) {
        C5862 c5862;
        C23016 c23016;
        do {
            c5862 = abstractC2133.f7020;
        } while (!f7015.mo15476(abstractC2133, c5862, C5862.f20101));
        while (c5862 != null) {
            Thread thread = c5862.f20103;
            if (thread != null) {
                c5862.f20103 = null;
                LockSupport.unpark(thread);
            }
            c5862 = c5862.f20102;
        }
        do {
            c23016 = abstractC2133.f7019;
        } while (!f7015.mo15477(abstractC2133, c23016, C23016.f74697));
        C23016 c23017 = null;
        while (c23016 != null) {
            C23016 c23018 = c23016.f74700;
            c23016.f74700 = c23017;
            c23017 = c23016;
            c23016 = c23018;
        }
        while (c23017 != null) {
            C23016 c23019 = c23017.f74700;
            Runnable runnable = c23017.f74699;
            if (runnable instanceof RunnableC15556) {
                throw null;
            }
            m7373(runnable, c23017.f74698);
            c23017 = c23019;
        }
    }

    public final String toString() {
        String strM7374;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f7021 instanceof C22270) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m7369(sb);
        } else {
            try {
                strM7374 = m7374();
            } catch (RuntimeException e) {
                strM7374 = "Exception thrown from implementation: " + e.getClass();
            }
            if (strM7374 != null && !strM7374.isEmpty()) {
                C22121.m50078(sb, "PENDING, info=[", strM7374, "]");
            } else if (isDone()) {
                m7369(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m7374() {
        if (this.f7021 instanceof RunnableC15556) {
            return C14442.m34865("setFuture=[", "null", "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m7369(StringBuilder sb) {
        try {
            Object objM7372 = m7372(this);
            sb.append("SUCCESS, result=[");
            sb.append(objM7372 == this ? "this future" : String.valueOf(objM7372));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m7373(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f7017.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    @Override // l.InterfaceFutureC14736
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo7375(Runnable runnable, Executor executor) {
        executor.getClass();
        C23016 c23016 = this.f7019;
        C23016 c23017 = C23016.f74697;
        if (c23016 != c23017) {
            C23016 c23018 = new C23016(runnable, executor);
            do {
                c23018.f74700 = c23016;
                if (f7015.mo15477(this, c23016, c23018)) {
                    return;
                } else {
                    c23016 = this.f7019;
                }
            } while (c23016 != c23017);
        }
        m7373(runnable, executor);
    }
}
