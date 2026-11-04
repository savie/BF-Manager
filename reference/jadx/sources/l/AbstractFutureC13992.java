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

/* JADX INFO: renamed from: l.۬ܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: K6PM */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractFutureC13992 implements Future, Serializable {
    public static final long serialVersionUID = -7721805057305804111L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final Unsafe f44346;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final long f44349;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f44351 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile int f44352;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final C8772[] f44347 = new C8772[32];

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final ReentrantLock f44350 = new ReentrantLock();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final ReferenceQueue f44348 = new ReferenceQueue();

    /* JADX INFO: renamed from: ۙ */
    public void mo19921(Throwable th) {
    }

    /* JADX INFO: renamed from: ۤ */
    public abstract boolean mo4841();

    /* JADX INFO: renamed from: ᩸ */
    public abstract Object mo4842();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m34083(int i) {
        int i2;
        do {
            i2 = this.f44352;
            if (i2 < 0) {
                return i2;
            }
        } while (!f44346.compareAndSwapInt(this, f44349, i2, i2 | i));
        if ((i2 >>> 16) == 0) {
            return i;
        }
        synchronized (this) {
            notifyAll();
        }
        return i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m34093() {
        int i = this.f44352;
        if (i < 0) {
            return i;
        }
        try {
            return mo4841() ? m34083(-268435456) : i;
        } catch (Throwable th) {
            return m34088(th);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34090(long j) {
        int i = this.f44352;
        if (i < 0 || !f44346.compareAndSwapInt(this, f44349, i, i | 65536)) {
            return;
        }
        synchronized (this) {
            if (this.f44352 >= 0) {
                try {
                    wait(j);
                } catch (InterruptedException unused) {
                }
            } else {
                notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private int m34084() {
        boolean z = false;
        int iM34093 = C10263.f32776.m26469(this) ? m34093() : 0;
        if (iM34093 < 0 || (iM34093 = this.f44352) < 0) {
            return iM34093;
        }
        int i = iM34093;
        do {
            if (f44346.compareAndSwapInt(this, f44349, i, i | 65536)) {
                synchronized (this) {
                    if (this.f44352 >= 0) {
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
            i = this.f44352;
        } while (i >= 0);
        if (z) {
            Thread.currentThread().interrupt();
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m34082() throws InterruptedException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        int iM34093 = this.f44352;
        if (iM34093 >= 0) {
            iM34093 = C10263.f32776.m26469(this) ? m34093() : 0;
            if (iM34093 >= 0) {
                while (true) {
                    int i = this.f44352;
                    if (i < 0) {
                        return i;
                    }
                    if (f44346.compareAndSwapInt(this, f44349, i, i | 65536)) {
                        synchronized (this) {
                            if (this.f44352 >= 0) {
                                wait(0L);
                            } else {
                                notifyAll();
                            }
                        }
                    }
                }
            }
        }
        return iM34093;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private int m34087() {
        int iM34093;
        int i = this.f44352;
        if (i < 0) {
            return i;
        }
        Thread threadCurrentThread = Thread.currentThread();
        if (!(threadCurrentThread instanceof C10965)) {
            return m34084();
        }
        C10965 c10965 = (C10965) threadCurrentThread;
        C19214 c19214 = c10965.f34641;
        return (!c19214.m44549(this) || (iM34093 = m34093()) >= 0) ? c10965.f34640.m26465(c19214, this, 0L) : iM34093;
    }

    public void run() throws Throwable {
        int iM34093 = m34093();
        if (iM34093 >= 0) {
            Thread threadCurrentThread = Thread.currentThread();
            if (threadCurrentThread instanceof C10965) {
                C10965 c10965 = (C10965) threadCurrentThread;
                iM34093 = c10965.f34640.m26465(c10965.f34641, this, 0L);
            } else {
                iM34093 = m34084();
            }
        }
        int i = iM34093 & (-268435456);
        if (i != -268435456) {
            if (i == -1073741824) {
                throw new CancellationException();
            }
            if (i != Integer.MIN_VALUE) {
                return;
            }
            Throwable thM34085 = m34085();
            C14738 c14738 = C10263.f32775;
            throw thM34085;
        }
    }

    static {
        Unsafe unsafe = C5746.f19778;
        f44346 = unsafe;
        try {
            f44349 = unsafe.objectFieldOffset(AbstractFutureC13992.class.getDeclaredField("ܰ"));
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m34088(Throwable th) {
        int iM34083 = this.f44352;
        if (iM34083 >= 0) {
            int iIdentityHashCode = System.identityHashCode(this);
            ReentrantLock reentrantLock = f44350;
            reentrantLock.lock();
            try {
                m34086();
                C8772[] c8772Arr = f44347;
                int i = iIdentityHashCode & 31;
                C8772 c8772 = c8772Arr[i];
                while (true) {
                    if (c8772 == null) {
                        c8772Arr[i] = new C8772(this, th, c8772Arr[i], f44348);
                        break;
                    }
                    if (c8772.get() == this) {
                        break;
                    }
                    c8772 = c8772.f28521;
                }
                reentrantLock.unlock();
                iM34083 = m34083(Integer.MIN_VALUE);
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        if (((-268435456) & iM34083) == Integer.MIN_VALUE) {
            mo19921(th);
        }
        return iM34083;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private Throwable m34085() {
        Throwable th;
        int iIdentityHashCode = System.identityHashCode(this);
        ReentrantLock reentrantLock = f44350;
        reentrantLock.lock();
        try {
            m34086();
            C8772 c8772 = f44347[iIdentityHashCode & 31];
            while (c8772 != null && c8772.get() != this) {
                c8772 = c8772.f28521;
            }
            reentrantLock.unlock();
            if (c8772 == null || (th = c8772.f28520) == null) {
                return null;
            }
            if (c8772.f28523 != Thread.currentThread().getId()) {
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

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static void m34086() {
        while (true) {
            Reference referencePoll = f44348.poll();
            if (referencePoll == null) {
                return;
            }
            if (referencePoll instanceof C8772) {
                int i = ((C8772) referencePoll).f28522 & 31;
                C8772[] c8772Arr = f44347;
                C8772 c8772 = c8772Arr[i];
                C8772 c8773 = null;
                while (c8772 != null) {
                    C8772 c8774 = c8772.f28521;
                    if (c8772 == referencePoll) {
                        if (c8773 == null) {
                            c8772Arr[i] = c8774;
                            break;
                        } else {
                            c8773.f28521 = c8774;
                            break;
                        }
                    }
                    c8773 = c8772;
                    c8772 = c8774;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final void m34089() {
        ReentrantLock reentrantLock = f44350;
        if (reentrantLock.tryLock()) {
            try {
                m34086();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return (m34083(-1073741824) & (-268435456)) == -1073741824;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f44352 < 0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return (this.f44352 & (-268435456)) == -1073741824;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException {
        int iM34087 = (Thread.currentThread() instanceof C10965 ? m34087() : m34082()) & (-268435456);
        if (iM34087 == -1073741824) {
            throw new CancellationException();
        }
        if (iM34087 == Integer.MIN_VALUE) {
            throw new ExecutionException(m34085());
        }
        return mo4842();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        int i;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        int iM34093 = this.f44352;
        if (iM34093 < 0 || nanos <= 0) {
            i = iM34093;
        } else {
            long jNanoTime = System.nanoTime() + nanos;
            if (jNanoTime == 0) {
                jNanoTime = 1;
            }
            Thread threadCurrentThread = Thread.currentThread();
            if (threadCurrentThread instanceof C10965) {
                C10965 c10965 = (C10965) threadCurrentThread;
                iM34093 = c10965.f34640.m26465(c10965.f34641, this, jNanoTime);
            } else {
                iM34093 = C10263.f32776.m26469(this) ? m34093() : 0;
                if (iM34093 >= 0) {
                    while (true) {
                        i = this.f44352;
                        if (i < 0) {
                            break;
                        }
                        long jNanoTime2 = jNanoTime - System.nanoTime();
                        if (jNanoTime2 <= 0) {
                            break;
                        }
                        long millis = TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                        if (millis > 0 && f44346.compareAndSwapInt(this, f44349, i, i | 65536)) {
                            synchronized (this) {
                                if (this.f44352 >= 0) {
                                    wait(millis);
                                } else {
                                    notifyAll();
                                }
                            }
                        }
                    }
                }
            }
            i = iM34093;
        }
        if (i >= 0) {
            i = this.f44352;
        }
        int i2 = i & (-268435456);
        if (i2 == -268435456) {
            return mo4842();
        }
        if (i2 == -1073741824) {
            throw new CancellationException();
        }
        if (i2 != Integer.MIN_VALUE) {
            throw new TimeoutException();
        }
        throw new ExecutionException(m34085());
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m34092() {
        m34087();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m34091() {
        int i;
        do {
            i = this.f44352;
            if (((short) i) != 0) {
                return false;
            }
        } while (!f44346.compareAndSwapInt(this, f44349, i, ((-65536) & i) | 1));
        return true;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        Object objM34085;
        objectOutputStream.defaultWriteObject();
        int i = this.f44352 & (-268435456);
        if (i >= -268435456) {
            objM34085 = null;
        } else if (i == -1073741824) {
            objM34085 = new CancellationException();
        } else {
            objM34085 = m34085();
        }
        objectOutputStream.writeObject(objM34085);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        if (object != null) {
            m34088((Throwable) object);
        }
    }
}
