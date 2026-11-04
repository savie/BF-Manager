package l;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: renamed from: l.᩷ܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: B3B1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22196 extends AbstractC2059 {
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public void mo50211() {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        C1291 c1291;
        Object obj = this.f6857;
        boolean z2 = false;
        if ((obj == null) | (obj instanceof RunnableC9493)) {
            if (AbstractC2059.f6852) {
                c1291 = new C1291(new CancellationException("Future.cancel() was called."), z);
            } else {
                if (z) {
                    c1291 = C1291.f4609;
                } else {
                    c1291 = C1291.f4608;
                }
                C17359.requireNonNull(c1291);
            }
            C1291 c1292 = c1291;
            z2 = false;
            AbstractC22196 abstractC22196 = this;
            while (true) {
                if (!AbstractC2059.m7109(abstractC22196, obj, c1292)) {
                    obj = abstractC22196.f6857;
                    if (!(obj instanceof RunnableC9493)) {
                        break;
                    }
                } else {
                    m50207(abstractC22196, z);
                    if (obj instanceof RunnableC9493) {
                        InterfaceFutureC14736 interfaceFutureC14736 = ((RunnableC9493) obj).f30741;
                        if (interfaceFutureC14736 instanceof InterfaceC13968) {
                            abstractC22196 = (AbstractC22196) interfaceFutureC14736;
                            obj = abstractC22196.f6857;
                            if ((obj == null) | (obj instanceof RunnableC9493)) {
                                z2 = true;
                            }
                        } else {
                            interfaceFutureC14736.cancel(z);
                        }
                    }
                    return true;
                }
            }
        }
        return z2;
    }

    public boolean isCancelled() {
        return this.f6857 instanceof C1291;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.f6857;
        return (!(obj instanceof RunnableC9493)) & (obj != null);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Object m50208(Object obj) throws ExecutionException {
        if (obj instanceof C1291) {
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(((C1291) obj).f4610);
            throw cancellationException;
        }
        if (obj instanceof C8748) {
            throw new ExecutionException(((C8748) obj).f28452);
        }
        if (obj == AbstractC2059.f6854) {
            return null;
        }
        return obj;
    }

    @Override // l.InterfaceFutureC14736
    /* JADX INFO: renamed from: ۙ */
    public void mo7375(Runnable runnable, Executor executor) {
        C7257 c7257;
        C12128.m30305(executor, "Executor was null.");
        if (!isDone() && (c7257 = this.f6855) != C7257.f23914) {
            C7257 c7258 = new C7257(runnable, executor);
            do {
                c7258.f23917 = c7257;
                if (m7112(c7257, c7258)) {
                    return;
                } else {
                    c7257 = this.f6855;
                }
            } while (c7257 != C7257.f23914);
        }
        m50209(runnable, executor);
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo2584(Throwable th) {
        if (!AbstractC2059.m7109(this, null, new C8748(th))) {
            return false;
        }
        m50207(this, false);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m50205(StringBuilder sb) {
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
        m50206(sb, obj);
        sb.append("]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50207(AbstractC22196 abstractC22196, boolean z) {
        Object c8748;
        Object c1291;
        Object obj;
        Throwable thM4789;
        C7257 c7257 = null;
        while (true) {
            abstractC22196.m7113();
            if (z) {
                z = false;
            }
            abstractC22196.mo50211();
            C7257 c7258 = c7257;
            C7257 c7257M7111 = abstractC22196.m7111(C7257.f23914);
            C7257 c7259 = c7258;
            while (c7257M7111 != null) {
                C7257 c72510 = c7257M7111.f23917;
                c7257M7111.f23917 = c7259;
                c7259 = c7257M7111;
                c7257M7111 = c72510;
            }
            while (c7259 != null) {
                c7257 = c7259.f23917;
                Runnable runnable = c7259.f23916;
                C17359.requireNonNull(runnable);
                if (runnable instanceof RunnableC9493) {
                    RunnableC9493 runnableC9493 = (RunnableC9493) runnable;
                    abstractC22196 = runnableC9493.f30742;
                    if (abstractC22196.f6857 == runnableC9493) {
                        InterfaceFutureC14736 interfaceFutureC14736 = runnableC9493.f30741;
                        if (interfaceFutureC14736 instanceof InterfaceC13968) {
                            c8748 = ((AbstractC22196) interfaceFutureC14736).f6857;
                            if (c8748 instanceof C1291) {
                                C1291 c1292 = (C1291) c8748;
                                if (c1292.f4611) {
                                    c8748 = c1292.f4610 != null ? new C1291(c1292.f4610, false) : C1291.f4608;
                                }
                            }
                            C17359.requireNonNull(c8748);
                        } else if ((interfaceFutureC14736 instanceof AbstractC10261) && (thM4789 = C1313.m4789((AbstractC10261) interfaceFutureC14736)) != null) {
                            c8748 = new C8748(thM4789);
                        } else {
                            boolean zIsCancelled = interfaceFutureC14736.isCancelled();
                            if ((!AbstractC2059.f6852) && zIsCancelled) {
                                c8748 = C1291.f4608;
                                C17359.requireNonNull(c8748);
                            } else {
                                boolean z2 = false;
                                while (true) {
                                    try {
                                        obj = interfaceFutureC14736.get();
                                        break;
                                    } catch (InterruptedException unused) {
                                        z2 = true;
                                    } catch (Throwable th) {
                                        if (z2) {
                                            Thread.currentThread().interrupt();
                                        }
                                        throw th;
                                    }
                                }
                                if (z2) {
                                    try {
                                        Thread.currentThread().interrupt();
                                    } catch (Error e) {
                                        e = e;
                                        c8748 = new C8748(e);
                                    } catch (CancellationException e2) {
                                        if (!zIsCancelled) {
                                            c1291 = new C8748(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + interfaceFutureC14736, e2));
                                            c8748 = c1291;
                                        } else {
                                            c8748 = new C1291(e2, false);
                                        }
                                    } catch (ExecutionException e3) {
                                        if (zIsCancelled) {
                                            c1291 = new C1291(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + interfaceFutureC14736, e3), false);
                                            c8748 = c1291;
                                        } else {
                                            c8748 = new C8748(e3.getCause());
                                        }
                                    } catch (Exception e4) {
                                        e = e4;
                                        c8748 = new C8748(e);
                                    }
                                }
                                if (zIsCancelled) {
                                    c8748 = new C1291(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + interfaceFutureC14736), false);
                                } else {
                                    c8748 = obj == null ? AbstractC2059.f6854 : obj;
                                }
                            }
                        }
                        if (AbstractC2059.m7109(abstractC22196, runnableC9493, c8748)) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = c7259.f23915;
                    C17359.requireNonNull(executor);
                    m50209(runnable, executor);
                }
                c7259 = c7257;
            }
            return;
        }
    }

    @Override // l.AbstractC10261
    /* JADX INFO: renamed from: ۙ */
    public final Throwable mo26453() {
        if (!(this instanceof InterfaceC13968)) {
            return null;
        }
        Object obj = this.f6857;
        if (obj instanceof C8748) {
            return ((C8748) obj).f28452;
        }
        return null;
    }

    public final String toString() {
        String strMo50210;
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
            m50205(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.f6857;
            if (obj instanceof RunnableC9493) {
                sb.append(", setFuture=[");
                InterfaceFutureC14736 interfaceFutureC14736 = ((RunnableC9493) obj).f30741;
                try {
                    if (interfaceFutureC14736 == this) {
                        sb.append("this future");
                    } else {
                        sb.append(interfaceFutureC14736);
                    }
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
                    strMo50210 = mo50210();
                    if (strMo50210 == null || strMo50210.isEmpty()) {
                        strMo50210 = null;
                    }
                } catch (Throwable th2) {
                    if ((th2 instanceof Error) && !(th2 instanceof StackOverflowError)) {
                        throw th2;
                    }
                    strMo50210 = "Exception thrown from implementation: " + th2.getClass();
                }
                if (strMo50210 != null) {
                    C22121.m50078(sb, ", info=[", strMo50210, "]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                m50205(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String mo50210() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m50206(StringBuilder sb, Object obj) {
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

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m50209(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            AbstractC2059.f6853.m13672().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo2583(Object obj) {
        if (obj == null) {
            obj = AbstractC2059.f6854;
        }
        if (!AbstractC2059.m7109(this, null, obj)) {
            return false;
        }
        m50207(this, false);
        return true;
    }
}
