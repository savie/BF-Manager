package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractQueue;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/* JADX INFO: renamed from: l.֡ᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: YAH1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0583 extends AbstractQueue implements Deque, Serializable {
    public static final long serialVersionUID = -387911632671998426L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient C20340 f2549;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Condition f2550;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C10463 f2551;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f2552 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public transient C20340 f2553;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Condition f2554;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient int f2555;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m2769(long j) throws InterruptedException {
        EnumC22996 enumC22996;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        int[] iArr = C12579.f42049;
        C13638.requireNonNull(timeUnit);
        switch (iArr[timeUnit.ordinal()]) {
            case 1:
                enumC22996 = EnumC22996.NANOS;
                break;
            case 2:
                enumC22996 = EnumC22996.MICROS;
                break;
            case 3:
                enumC22996 = EnumC22996.MILLIS;
                break;
            case 4:
                enumC22996 = EnumC22996.SECONDS;
                break;
            case 5:
                enumC22996 = EnumC22996.MINUTES;
                break;
            case 6:
                enumC22996 = EnumC22996.HOURS;
                break;
            case 7:
                enumC22996 = EnumC22996.DAYS;
                break;
            default:
                throw new IllegalArgumentException(timeUnit.toString());
        }
        long nanos = C21813.of(j, enumC22996).toNanos();
        C10463 c10463 = this.f2551;
        c10463.lockInterruptibly();
        while (true) {
            try {
                Object objM2767 = m2767();
                if (objM2767 != null) {
                    c10463.unlock();
                    return objM2767;
                }
                if (nanos > 0) {
                    nanos = this.f2554.awaitNanos(nanos);
                } else {
                    c10463.unlock();
                    return null;
                }
            } catch (Throwable th) {
                c10463.unlock();
                throw th;
            }
        }
    }

    public C0583() {
        C10463 c10463 = new C10463(false);
        this.f2551 = c10463;
        this.f2554 = c10463.newCondition();
        this.f2550 = c10463.newCondition();
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue, java.util.Deque
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.Deque
    public final void addFirst(Object obj) {
        if (!offerFirst(obj)) {
            throw new IllegalStateException("Deque full");
        }
    }

    @Override // java.util.Deque
    public final void addLast(Object obj) {
        if (!offerLast(obj)) {
            throw new IllegalStateException("Deque full");
        }
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        C10463 c10463 = this.f2551;
        c10463.lock();
        try {
            C20340 c20340 = this.f2549;
            while (c20340 != null) {
                c20340.f65877 = null;
                C20340 c20341 = c20340.f65879;
                c20340.f65878 = null;
                c20340.f65879 = null;
                c20340 = c20341;
            }
            this.f2553 = null;
            this.f2549 = null;
            this.f2555 = 0;
            this.f2550.signalAll();
        } finally {
            c10463.unlock();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        C10463 c10463 = this.f2551;
        c10463.lock();
        try {
            for (C20340 c20340 = this.f2549; c20340 != null; c20340 = c20340.f65879) {
                if (obj.equals(c20340.f65877)) {
                    c10463.unlock();
                    return true;
                }
            }
            c10463.unlock();
            return false;
        } catch (Throwable th) {
            c10463.unlock();
            throw th;
        }
    }

    @Override // java.util.Deque
    public final Iterator descendingIterator() {
        return new C21045(this);
    }

    @Override // java.util.AbstractQueue, java.util.Queue, java.util.Deque
    public final Object element() {
        return getFirst();
    }

    @Override // java.util.Deque
    public final Object getFirst() {
        Object objPeekFirst = peekFirst();
        if (objPeekFirst != null) {
            return objPeekFirst;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Deque
    public final Object getLast() {
        Object objPeekLast = peekLast();
        if (objPeekLast != null) {
            return objPeekLast;
        }
        throw new NoSuchElementException();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m2772() {
        C10463 c10463 = this.f2551;
        c10463.lock();
        try {
            return c10463.getWaitQueueLength(this.f2554);
        } finally {
            c10463.unlock();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m2771() {
        C10463 c10463 = this.f2551;
        c10463.lock();
        try {
            return c10463.hasWaiters(this.f2554);
        } finally {
            c10463.unlock();
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m2768() {
        C10463 c10463 = this.f2551;
        c10463.lock();
        try {
            c10463.m26425(this.f2554);
        } finally {
            c10463.unlock();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Deque
    public final Iterator iterator() {
        return new C16107(this);
    }

    @Override // java.util.Queue, java.util.Deque
    public final boolean offer(Object obj) {
        return offerLast(obj);
    }

    @Override // java.util.Deque
    public final boolean offerFirst(Object obj) {
        boolean z;
        C13638.requireNonNull(obj, "e");
        C10463 c10463 = this.f2551;
        c10463.lock();
        try {
            int i = this.f2555;
            if (i >= this.f2552) {
                z = false;
            } else {
                C20340 c20340 = this.f2549;
                C20340 c20341 = new C20340(obj, null, c20340);
                this.f2549 = c20341;
                if (this.f2553 == null) {
                    this.f2553 = c20341;
                } else {
                    c20340.f65878 = c20341;
                }
                z = true;
                this.f2555 = i + 1;
                this.f2554.signal();
            }
            return z;
        } finally {
            c10463.unlock();
        }
    }

    @Override // java.util.Deque
    public final boolean offerLast(Object obj) {
        boolean z;
        C13638.requireNonNull(obj, "e");
        C10463 c10463 = this.f2551;
        c10463.lock();
        try {
            int i = this.f2555;
            if (i >= this.f2552) {
                z = false;
            } else {
                C20340 c20340 = this.f2553;
                C20340 c20341 = new C20340(obj, c20340, null);
                this.f2553 = c20341;
                if (this.f2549 == null) {
                    this.f2549 = c20341;
                } else {
                    c20340.f65879 = c20341;
                }
                z = true;
                this.f2555 = i + 1;
                this.f2554.signal();
            }
            return z;
        } finally {
            c10463.unlock();
        }
    }

    @Override // java.util.Queue, java.util.Deque
    public final Object peek() {
        return peekFirst();
    }

    @Override // java.util.Deque
    public final Object peekFirst() {
        C10463 c10463 = this.f2551;
        c10463.lock();
        try {
            C20340 c20340 = this.f2549;
            return c20340 == null ? null : c20340.f65877;
        } finally {
            c10463.unlock();
        }
    }

    @Override // java.util.Deque
    public final Object peekLast() {
        C10463 c10463 = this.f2551;
        c10463.lock();
        try {
            C20340 c20340 = this.f2553;
            return c20340 == null ? null : c20340.f65877;
        } finally {
            c10463.unlock();
        }
    }

    @Override // java.util.Queue, java.util.Deque
    public final Object poll() {
        return pollFirst();
    }

    @Override // java.util.Deque
    public final Object pollFirst() {
        C10463 c10463 = this.f2551;
        c10463.lock();
        try {
            return m2767();
        } finally {
            c10463.unlock();
        }
    }

    @Override // java.util.Deque
    public final Object pollLast() {
        C10463 c10463 = this.f2551;
        c10463.lock();
        try {
            return m2761();
        } finally {
            c10463.unlock();
        }
    }

    @Override // java.util.Deque
    public final Object pop() {
        return removeFirst();
    }

    @Override // java.util.Deque
    public final void push(Object obj) {
        addFirst(obj);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f2555 = 0;
        this.f2549 = null;
        this.f2553 = null;
        while (true) {
            Object object = objectInputStream.readObject();
            if (object == null) {
                return;
            } else {
                addLast(object);
            }
        }
    }

    @Override // java.util.AbstractQueue, java.util.Queue, java.util.Deque
    public final Object remove() {
        return removeFirst();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final boolean remove(Object obj) {
        return removeFirstOccurrence(obj);
    }

    @Override // java.util.Deque
    public final Object removeFirst() {
        Object objPollFirst = pollFirst();
        if (objPollFirst != null) {
            return objPollFirst;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Deque
    public final boolean removeFirstOccurrence(Object obj) {
        if (obj == null) {
            return false;
        }
        C10463 c10463 = this.f2551;
        c10463.lock();
        try {
            for (C20340 c20340 = this.f2549; c20340 != null; c20340 = c20340.f65879) {
                if (obj.equals(c20340.f65877)) {
                    m2764(c20340);
                    return true;
                }
            }
            return false;
        } finally {
            c10463.unlock();
        }
    }

    @Override // java.util.Deque
    public final Object removeLast() {
        Object objPollLast = pollLast();
        if (objPollLast != null) {
            return objPollLast;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Deque
    public final boolean removeLastOccurrence(Object obj) {
        if (obj == null) {
            return false;
        }
        C10463 c10463 = this.f2551;
        c10463.lock();
        try {
            for (C20340 c20340 = this.f2553; c20340 != null; c20340 = c20340.f65878) {
                if (obj.equals(c20340.f65877)) {
                    m2764(c20340);
                    return true;
                }
            }
            return false;
        } finally {
            c10463.unlock();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final int size() {
        C10463 c10463 = this.f2551;
        c10463.lock();
        try {
            return this.f2555;
        } finally {
            c10463.unlock();
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Object m2770() {
        C10463 c10463 = this.f2551;
        c10463.lock();
        while (true) {
            try {
                Object objM2767 = m2767();
                if (objM2767 == null) {
                    this.f2554.await();
                } else {
                    c10463.unlock();
                    return objM2767;
                }
            } catch (Throwable th) {
                c10463.unlock();
                throw th;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        C10463 c10463 = this.f2551;
        c10463.lock();
        try {
            Object[] objArr = new Object[this.f2555];
            C20340 c20340 = this.f2549;
            int i = 0;
            while (c20340 != null) {
                int i2 = i + 1;
                objArr[i] = c20340.f65877;
                c20340 = c20340.f65879;
                i = i2;
            }
            c10463.unlock();
            return objArr;
        } catch (Throwable th) {
            c10463.unlock();
            throw th;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C10463 c10463 = this.f2551;
        c10463.lock();
        try {
            if (objArr.length < this.f2555) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f2555);
            }
            C20340 c20340 = this.f2549;
            int i = 0;
            while (c20340 != null) {
                objArr[i] = c20340.f65877;
                c20340 = c20340.f65879;
                i++;
            }
            if (objArr.length > i) {
                objArr[i] = null;
            }
            return objArr;
        } finally {
            c10463.unlock();
        }
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        C10463 c10463 = this.f2551;
        c10463.lock();
        try {
            return super.toString();
        } finally {
            c10463.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m2764(C20340 c20340) {
        C20340 c20341 = c20340.f65878;
        C20340 c20342 = c20340.f65879;
        if (c20341 == null) {
            m2767();
            return;
        }
        if (c20342 == null) {
            m2761();
            return;
        }
        c20341.f65879 = c20342;
        c20342.f65878 = c20341;
        c20340.f65877 = null;
        this.f2555--;
        this.f2550.signal();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private Object m2767() {
        C20340 c20340 = this.f2549;
        if (c20340 == null) {
            return null;
        }
        C20340 c20341 = c20340.f65879;
        Object obj = c20340.f65877;
        c20340.f65877 = null;
        c20340.f65879 = c20340;
        this.f2549 = c20341;
        if (c20341 == null) {
            this.f2553 = null;
        } else {
            c20341.f65878 = null;
        }
        this.f2555--;
        this.f2550.signal();
        return obj;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private Object m2761() {
        C20340 c20340 = this.f2553;
        if (c20340 == null) {
            return null;
        }
        C20340 c20341 = c20340.f65878;
        Object obj = c20340.f65877;
        c20340.f65877 = null;
        c20340.f65878 = c20340;
        this.f2553 = c20341;
        if (c20341 == null) {
            this.f2549 = null;
        } else {
            c20341.f65879 = null;
        }
        this.f2555--;
        this.f2550.signal();
        return obj;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        C10463 c10463 = this.f2551;
        c10463.lock();
        try {
            objectOutputStream.defaultWriteObject();
            for (C20340 c20340 = this.f2549; c20340 != null; c20340 = c20340.f65879) {
                objectOutputStream.writeObject(c20340.f65877);
            }
            objectOutputStream.writeObject(null);
        } finally {
            c10463.unlock();
        }
    }
}
