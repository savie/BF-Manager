package l;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: renamed from: l.ۚۢܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: B3B1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5272 extends AbstractC21500 {
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public void mo14562() {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        C1516 c1516;
        Object obj = this.f69870;
        if ((obj == null) | (obj instanceof RunnableC9279)) {
            if (AbstractC21500.f69865) {
                c1516 = new C1516(new CancellationException("Future.cancel() was called."), z);
            } else {
                if (z) {
                    c1516 = C1516.f6214;
                } else {
                    c1516 = C1516.f6215;
                }
                C13638.requireNonNull(c1516);
            }
            while (!AbstractC21500.m48139(this, obj, c1516)) {
                obj = this.f69870;
                if (!(obj instanceof RunnableC9279)) {
                }
            }
            m14559(this, z);
            if (obj instanceof RunnableC9279) {
                throw null;
            }
            return true;
        }
        return false;
    }

    public boolean isCancelled() {
        return this.f69870 instanceof C1516;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.f69870;
        return (!(obj instanceof RunnableC9279)) & (obj != null);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Object m14560(Object obj) throws ExecutionException {
        if (obj instanceof C1516) {
            Throwable th = ((C1516) obj).f6216;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C4566) {
            throw new ExecutionException(((C4566) obj).f16215);
        }
        if (obj == AbstractC21500.f69867) {
            return null;
        }
        return obj;
    }

    @Override // l.InterfaceFutureC12329
    /* JADX INFO: renamed from: ۙ */
    public void mo1994(Runnable runnable, Executor executor) {
        C13740 c13740;
        C18304.m42513(executor, "Executor was null.");
        if (!isDone() && (c13740 = this.f69869) != C13740.f45298) {
            C13740 c13741 = new C13740(runnable, executor);
            do {
                c13741.f45301 = c13740;
                if (m48142(c13740, c13741)) {
                    return;
                } else {
                    c13740 = this.f69869;
                }
            } while (c13740 != C13740.f45298);
        }
        m14561(runnable, executor);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo14563(Object obj) {
        if (obj == null) {
            obj = AbstractC21500.f69867;
        }
        if (!AbstractC21500.m48139(this, null, obj)) {
            return false;
        }
        m14559(this, false);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo14564(Throwable th) {
        th.getClass();
        if (!AbstractC21500.m48139(this, null, new C4566(th))) {
            return false;
        }
        m14559(this, false);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m14556(InterfaceFutureC12329 interfaceFutureC12329) {
        Object obj;
        Throwable thM24343;
        if (interfaceFutureC12329 instanceof InterfaceC11623) {
            Object c1516 = ((AbstractC5272) interfaceFutureC12329).f69870;
            if (c1516 instanceof C1516) {
                C1516 c1517 = (C1516) c1516;
                if (c1517.f6217) {
                    c1516 = c1517.f6216 != null ? new C1516(c1517.f6216, false) : C1516.f6215;
                }
            }
            C13638.requireNonNull(c1516);
            return c1516;
        }
        if ((interfaceFutureC12329 instanceof AbstractC1744) && (thM24343 = C9507.m24343((AbstractC1744) interfaceFutureC12329)) != null) {
            return new C4566(thM24343);
        }
        boolean zIsCancelled = interfaceFutureC12329.isCancelled();
        if ((!AbstractC21500.f69865) && zIsCancelled) {
            C1516 c1518 = C1516.f6215;
            C13638.requireNonNull(c1518);
            return c1518;
        }
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = interfaceFutureC12329.get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (Error e) {
                e = e;
                return new C4566(e);
            } catch (CancellationException e2) {
                if (!zIsCancelled) {
                    return new C4566(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + interfaceFutureC12329, e2));
                }
                return new C1516(e2, false);
            } catch (ExecutionException e3) {
                if (zIsCancelled) {
                    return new C1516(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + interfaceFutureC12329, e3), false);
                }
                return new C4566(e3.getCause());
            } catch (Exception e4) {
                e = e4;
                return new C4566(e);
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        if (!zIsCancelled) {
            return obj == null ? AbstractC21500.f69867 : obj;
        }
        return new C1516(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + interfaceFutureC12329), false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m14557(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[");
                sb.append(e.getCause());
                sb.append("]");
                return;
            } catch (Exception e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        m14558(sb, obj);
        sb.append("]");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14559(AbstractC5272 abstractC5272, boolean z) {
        abstractC5272.m48143();
        abstractC5272.mo14562();
        C13740 c13740M48141 = abstractC5272.m48141(C13740.f45298);
        C13740 c13740 = null;
        while (c13740M48141 != null) {
            C13740 c13741 = c13740M48141.f45301;
            c13740M48141.f45301 = c13740;
            c13740 = c13740M48141;
            c13740M48141 = c13741;
        }
        while (c13740 != null) {
            C13740 c13742 = c13740.f45301;
            Runnable runnable = c13740.f45300;
            C13638.requireNonNull(runnable);
            if (runnable instanceof RunnableC9279) {
                throw null;
            }
            Executor executor = c13740.f45299;
            C13638.requireNonNull(executor);
            m14561(runnable, executor);
            c13740 = c13742;
        }
    }

    @Override // l.AbstractC1744
    /* JADX INFO: renamed from: ۙ */
    public final Throwable mo5786() {
        if (!(this instanceof InterfaceC11623)) {
            return null;
        }
        Object obj = this.f69870;
        if (obj instanceof C4566) {
            return ((C4566) obj).f16215;
        }
        return null;
    }

    public final String toString() {
        String strMo14565;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m14557(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            if (this.f69870 instanceof RunnableC9279) {
                sb.append(", setFuture=[");
                try {
                    sb.append((Object) null);
                } catch (Throwable th) {
                    if ((th instanceof Error) && !(th instanceof StackOverflowError)) {
                        throw th;
                    }
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append("]");
            } else {
                try {
                    strMo14565 = mo14565();
                    if (strMo14565 == null || strMo14565.isEmpty()) {
                        strMo14565 = null;
                    }
                } catch (Throwable th2) {
                    if ((th2 instanceof Error) && !(th2 instanceof StackOverflowError)) {
                        throw th2;
                    }
                    strMo14565 = "Exception thrown from implementation: " + th2.getClass();
                }
                if (strMo14565 != null) {
                    C0219.m1594(sb, ", info=[", strMo14565, "]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                m14557(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String mo14565() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m14558(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m14561(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            AbstractC21500.f69864.m38979().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }
}
