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

/* JADX INFO: renamed from: l.ܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: W9N5 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14016 implements InterfaceFutureC12329 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final AbstractC5923 f46066;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Object f46067;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile C4842 f46068;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public volatile C14391 f46069;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile Object f46070;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final boolean f46065 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final Logger f46064 = Logger.getLogger(AbstractC14016.class.getName());

    static {
        AbstractC5923 c3100;
        try {
            c3100 = new C1689(AtomicReferenceFieldUpdater.newUpdater(C4842.class, Thread.class, "ܰ"), AtomicReferenceFieldUpdater.newUpdater(C4842.class, C4842.class, "ۙ"), AtomicReferenceFieldUpdater.newUpdater(AbstractC14016.class, C4842.class, "֡"), AtomicReferenceFieldUpdater.newUpdater(AbstractC14016.class, C14391.class, "ܺ"), AtomicReferenceFieldUpdater.newUpdater(AbstractC14016.class, Object.class, "᩶"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c3100 = new C3100();
        }
        f46066 = c3100;
        if (th != null) {
            f46064.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f46067 = new Object();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m33897(C4842 c4842) {
        c4842.f17014 = null;
        while (true) {
            C4842 c4843 = this.f46068;
            if (c4843 == C4842.f17012) {
                return;
            }
            C4842 c4844 = null;
            while (c4843 != null) {
                C4842 c4845 = c4843.f17013;
                if (c4843.f17014 != null) {
                    c4844 = c4843;
                } else if (c4844 != null) {
                    c4844.f17013 = c4845;
                    if (c4844.f17014 == null) {
                    }
                } else if (!f46066.mo5609(this, c4843, c4845)) {
                }
                c4843 = c4845;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C4842 c4842 = C4842.f17012;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f46070;
        if ((obj != null) && (!(obj instanceof RunnableC9452))) {
            return m33895(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C4842 c4843 = this.f46068;
            if (c4843 != c4842) {
                C4842 c4844 = new C4842();
                while (true) {
                    AbstractC5923 abstractC5923 = f46066;
                    abstractC5923.mo5607(c4844, c4843);
                    if (abstractC5923.mo5609(this, c4843, c4844)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m33897(c4844);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f46070;
                            if ((obj2 != null) && (!(obj2 instanceof RunnableC9452))) {
                                return m33895(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m33897(c4844);
                        break;
                    }
                    c4843 = this.f46068;
                    if (c4843 == c4842) {
                    }
                }
            }
            return m33895(this.f46070);
        }
        while (nanos > 0) {
            Object obj3 = this.f46070;
            if ((obj3 != null) && (!(obj3 instanceof RunnableC9452))) {
                return m33895(obj3);
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

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        C4842 c4842 = C4842.f17012;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f46070;
        if ((obj2 != null) & (!(obj2 instanceof RunnableC9452))) {
            return m33895(obj2);
        }
        C4842 c4843 = this.f46068;
        if (c4843 != c4842) {
            C4842 c4844 = new C4842();
            do {
                AbstractC5923 abstractC5923 = f46066;
                abstractC5923.mo5607(c4844, c4843);
                if (abstractC5923.mo5609(this, c4843, c4844)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m33897(c4844);
                            throw new InterruptedException();
                        }
                        obj = this.f46070;
                    } while (!((obj != null) & (!(obj instanceof RunnableC9452))));
                    return m33895(obj);
                }
                c4843 = this.f46068;
            } while (c4843 != c4842);
        }
        return m33895(this.f46070);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m33895(Object obj) throws ExecutionException {
        if (obj instanceof C10863) {
            Throwable th = ((C10863) obj).f36940;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C23563) {
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f46067) {
            return null;
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f46070;
        return (!(obj instanceof RunnableC9452)) & (obj != null);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f46070 instanceof C10863;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C10863 c10863;
        Object obj = this.f46070;
        if ((obj == null) | (obj instanceof RunnableC9452)) {
            if (f46065) {
                c10863 = new C10863(new CancellationException("Future.cancel() was called."), z);
            } else if (z) {
                c10863 = C10863.f36938;
            } else {
                c10863 = C10863.f36939;
            }
            while (!f46066.mo5608(this, obj, c10863)) {
                obj = this.f46070;
                if (!(obj instanceof RunnableC9452)) {
                }
            }
            m33898(this);
            if (obj instanceof RunnableC9452) {
                throw null;
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Object m33899(AbstractC14016 abstractC14016) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = abstractC14016.get();
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
    public static void m33898(AbstractC14016 abstractC14016) {
        C4842 c4842;
        C14391 c14391;
        do {
            c4842 = abstractC14016.f46068;
        } while (!f46066.mo5609(abstractC14016, c4842, C4842.f17012));
        while (c4842 != null) {
            Thread thread = c4842.f17014;
            if (thread != null) {
                c4842.f17014 = null;
                LockSupport.unpark(thread);
            }
            c4842 = c4842.f17013;
        }
        do {
            c14391 = abstractC14016.f46069;
        } while (!f46066.mo5610(abstractC14016, c14391, C14391.f47143));
        C14391 c14392 = null;
        while (c14391 != null) {
            C14391 c14393 = c14391.f47146;
            c14391.f47146 = c14392;
            c14392 = c14391;
            c14391 = c14393;
        }
        while (c14392 != null) {
            C14391 c14394 = c14392.f47146;
            Runnable runnable = c14392.f47145;
            if (runnable instanceof RunnableC9452) {
                throw null;
            }
            m33900(runnable, c14392.f47144);
            c14392 = c14394;
        }
    }

    public final String toString() {
        String strM33901;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f46070 instanceof C10863) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m33896(sb);
        } else {
            try {
                strM33901 = m33901();
            } catch (RuntimeException e) {
                strM33901 = "Exception thrown from implementation: " + e.getClass();
            }
            if (strM33901 != null && !strM33901.isEmpty()) {
                C0219.m1594(sb, "PENDING, info=[", strM33901, "]");
            } else if (isDone()) {
                m33896(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m33901() {
        if (this.f46070 instanceof RunnableC9452) {
            return C16523.m38890("setFuture=[", "null", "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m33896(StringBuilder sb) {
        try {
            Object objM33899 = m33899(this);
            sb.append("SUCCESS, result=[");
            sb.append(objM33899 == this ? "this future" : String.valueOf(objM33899));
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

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m33900(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f46064.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    @Override // l.InterfaceFutureC12329
    /* JADX INFO: renamed from: ۙ */
    public final void mo1994(Runnable runnable, Executor executor) {
        executor.getClass();
        C14391 c14391 = this.f46069;
        C14391 c14392 = C14391.f47143;
        if (c14391 != c14392) {
            C14391 c14393 = new C14391(runnable, executor);
            do {
                c14393.f47146 = c14391;
                if (f46066.mo5610(this, c14391, c14393)) {
                    return;
                } else {
                    c14391 = this.f46069;
                }
            } while (c14391 != c14392);
        }
        m33900(runnable, executor);
    }
}
