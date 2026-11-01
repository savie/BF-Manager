package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Constructor;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.᩺۬۠, reason: contains not printable characters */
/* JADX INFO: compiled from: K6PM */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractFutureC23009 implements Future, Serializable {
    public static final long serialVersionUID = -7721805057305804111L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final long f74773;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Unsafe f74776;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f74778 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public volatile int f74779;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C3957[] f74775 = new C3957[32];

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final ReentrantLock f74777 = new ReentrantLock();

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final ReferenceQueue f74774 = new ReferenceQueue();

    /* JADX INFO: renamed from: ۖ */
    public abstract Object mo4167();

    /* JADX INFO: renamed from: ۙ */
    public void mo18384(Throwable th) {
    }

    /* JADX INFO: renamed from: ۨ */
    public abstract boolean mo4168();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m50884(int i) {
        int i2;
        do {
            i2 = this.f74779;
            if (i2 < 0) {
                return i2;
            }
        } while (!f74776.compareAndSwapInt(this, f74773, i2, i2 | i));
        if ((i2 >>> 16) == 0) {
            return i;
        }
        synchronized (this) {
            notifyAll();
        }
        return i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m50893() {
        int i = this.f74779;
        if (i < 0) {
            return i;
        }
        try {
            return mo4168() ? m50884(-268435456) : i;
        } catch (Throwable th) {
            return m50887(th);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50890(long j) {
        int i = this.f74779;
        if (i < 0 || !f74776.compareAndSwapInt(this, f74773, i, i | 65536)) {
            return;
        }
        synchronized (this) {
            if (this.f74779 >= 0) {
                try {
                    wait(j);
                } catch (InterruptedException unused) {
                }
            } else {
                notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private int m50886() {
        boolean z = false;
        int iM50893 = C5369.f18546.m14884(this) ? m50893() : 0;
        if (iM50893 < 0 || (iM50893 = this.f74779) < 0) {
            return iM50893;
        }
        int i = iM50893;
        do {
            if (f74776.compareAndSwapInt(this, f74773, i, i | 65536)) {
                synchronized (this) {
                    if (this.f74779 >= 0) {
                        try {
                            wait(0L);
                        } catch (InterruptedException unused) {
                            z = true;
                        }
                    } else {
                        notifyAll();
                    }
                }
            }
            i = this.f74779;
        } while (i >= 0);
        if (z) {
            Thread.currentThread().interrupt();
        }
        return i;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private int m50883() throws InterruptedException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        int iM50893 = this.f74779;
        if (iM50893 >= 0) {
            iM50893 = C5369.f18546.m14884(this) ? m50893() : 0;
            if (iM50893 >= 0) {
                while (true) {
                    int i = this.f74779;
                    if (i < 0) {
                        return i;
                    }
                    if (f74776.compareAndSwapInt(this, f74773, i, i | 65536)) {
                        synchronized (this) {
                            if (this.f74779 >= 0) {
                                wait(0L);
                            } else {
                                notifyAll();
                            }
                        }
                    }
                }
            }
        }
        return iM50893;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private int m50888() {
        int iM50893;
        int i = this.f74779;
        if (i < 0) {
            return i;
        }
        Thread threadCurrentThread = Thread.currentThread();
        if (!(threadCurrentThread instanceof C18069)) {
            return m50886();
        }
        C18069 c18069 = (C18069) threadCurrentThread;
        C2546 c2546 = c18069.f57783;
        return (!c2546.m7928(this) || (iM50893 = m50893()) >= 0) ? c18069.f57782.m14880(c2546, this, 0L) : iM50893;
    }

    public void run() throws Throwable {
        int iM50893 = m50893();
        if (iM50893 >= 0) {
            Thread threadCurrentThread = Thread.currentThread();
            if (threadCurrentThread instanceof C18069) {
                C18069 c18069 = (C18069) threadCurrentThread;
                iM50893 = c18069.f57782.m14880(c18069.f57783, this, 0L);
            } else {
                iM50893 = m50886();
            }
        }
        int i = iM50893 & (-268435456);
        if (i != -268435456) {
            if (i == -1073741824) {
                throw new CancellationException();
            }
            if (i != Integer.MIN_VALUE) {
                return;
            }
            Throwable thM50885 = m50885();
            C9253 c9253 = C5369.f18550;
            throw thM50885;
        }
    }

    static {
        Unsafe unsafe = C10309.f35350;
        f74776 = unsafe;
        try {
            f74773 = unsafe.objectFieldOffset(AbstractFutureC23009.class.getDeclaredField("ܺ"));
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private int m50887(Throwable th) {
        int iM50884 = this.f74779;
        if (iM50884 >= 0) {
            int iIdentityHashCode = System.identityHashCode(this);
            ReentrantLock reentrantLock = f74777;
            reentrantLock.lock();
            try {
                m50882();
                C3957[] c3957Arr = f74775;
                int i = iIdentityHashCode & 31;
                C3957 c3957 = c3957Arr[i];
                while (true) {
                    if (c3957 == null) {
                        c3957Arr[i] = new C3957(this, th, c3957Arr[i], f74774);
                        break;
                    }
                    if (c3957.get() == this) {
                        break;
                    }
                    c3957 = c3957.f14706;
                }
                reentrantLock.unlock();
                iM50884 = m50884(Integer.MIN_VALUE);
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        if (((-268435456) & iM50884) == Integer.MIN_VALUE) {
            mo18384(th);
        }
        return iM50884;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private Throwable m50885() {
        Throwable th;
        int iIdentityHashCode = System.identityHashCode(this);
        ReentrantLock reentrantLock = f74777;
        reentrantLock.lock();
        try {
            m50882();
            C3957 c3957 = f74775[iIdentityHashCode & 31];
            while (c3957 != null && c3957.get() != this) {
                c3957 = c3957.f14706;
            }
            reentrantLock.unlock();
            if (c3957 == null || (th = c3957.f14705) == null) {
                return null;
            }
            if (c3957.f14704 != Thread.currentThread().getId()) {
                try {
                    Constructor<?> constructor = null;
                    for (Constructor<?> constructor2 : th.getClass().getConstructors()) {
                        Class<?>[] parameterTypes = constructor2.getParameterTypes();
                        if (parameterTypes.length == 0) {
                            constructor = constructor2;
                        } else if (parameterTypes.length == 1 && parameterTypes[0] == Throwable.class) {
                            return (Throwable) constructor2.newInstance(th);
                        }
                    }
                    if (constructor != null) {
                        Throwable th2 = (Throwable) constructor.newInstance(null);
                        th2.initCause(th);
                        return th2;
                    }
                } catch (Exception unused) {
                }
            }
            return th;
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static void m50882() {
        while (true) {
            Reference referencePoll = f74774.poll();
            if (referencePoll == null) {
                return;
            }
            if (referencePoll instanceof C3957) {
                int i = ((C3957) referencePoll).f14707 & 31;
                C3957[] c3957Arr = f74775;
                C3957 c3957 = c3957Arr[i];
                C3957 c3958 = null;
                while (c3957 != null) {
                    C3957 c3959 = c3957.f14706;
                    if (c3957 == referencePoll) {
                        if (c3958 == null) {
                            c3957Arr[i] = c3959;
                            break;
                        } else {
                            c3958.f14706 = c3959;
                            break;
                        }
                    }
                    c3958 = c3957;
                    c3957 = c3959;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final void m50889() {
        ReentrantLock reentrantLock = f74777;
        if (reentrantLock.tryLock()) {
            try {
                m50882();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return (m50884(-1073741824) & (-268435456)) == -1073741824;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f74779 < 0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return (this.f74779 & (-268435456)) == -1073741824;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException {
        int iM50888 = (Thread.currentThread() instanceof C18069 ? m50888() : m50883()) & (-268435456);
        if (iM50888 == -1073741824) {
            throw new CancellationException();
        }
        if (iM50888 == Integer.MIN_VALUE) {
            throw new ExecutionException(m50885());
        }
        return mo4167();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        int i;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        int iM50893 = this.f74779;
        if (iM50893 < 0 || nanos <= 0) {
            i = iM50893;
        } else {
            long jNanoTime = System.nanoTime() + nanos;
            if (jNanoTime == 0) {
                jNanoTime = 1;
            }
            Thread threadCurrentThread = Thread.currentThread();
            if (threadCurrentThread instanceof C18069) {
                C18069 c18069 = (C18069) threadCurrentThread;
                iM50893 = c18069.f57782.m14880(c18069.f57783, this, jNanoTime);
            } else {
                iM50893 = C5369.f18546.m14884(this) ? m50893() : 0;
                if (iM50893 >= 0) {
                    while (true) {
                        i = this.f74779;
                        if (i < 0) {
                            break;
                        }
                        long jNanoTime2 = jNanoTime - System.nanoTime();
                        if (jNanoTime2 <= 0) {
                            break;
                        }
                        long millis = TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                        if (millis > 0 && f74776.compareAndSwapInt(this, f74773, i, i | 65536)) {
                            synchronized (this) {
                                if (this.f74779 >= 0) {
                                    wait(millis);
                                } else {
                                    notifyAll();
                                }
                            }
                        }
                    }
                }
            }
            i = iM50893;
        }
        if (i >= 0) {
            i = this.f74779;
        }
        int i2 = i & (-268435456);
        if (i2 == -268435456) {
            return mo4167();
        }
        if (i2 == -1073741824) {
            throw new CancellationException();
        }
        if (i2 != Integer.MIN_VALUE) {
            throw new TimeoutException();
        }
        throw new ExecutionException(m50885());
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m50892() {
        m50888();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m50891() {
        int i;
        do {
            i = this.f74779;
            if (((short) i) != 0) {
                return false;
            }
        } while (!f74776.compareAndSwapInt(this, f74773, i, ((-65536) & i) | 1));
        return true;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        Object objM50885;
        objectOutputStream.defaultWriteObject();
        int i = this.f74779 & (-268435456);
        if (i >= -268435456) {
            objM50885 = null;
        } else if (i == -1073741824) {
            objM50885 = new CancellationException();
        } else {
            objM50885 = m50885();
        }
        objectOutputStream.writeObject(objM50885);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        if (object != null) {
            m50887((Throwable) object);
        }
    }
}
