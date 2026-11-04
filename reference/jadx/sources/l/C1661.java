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

/* JADX INFO: renamed from: l.֫ۘۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: YAH1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1661 extends AbstractQueue implements Deque, Serializable {
    public static final long serialVersionUID = -387911632671998426L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient C5390 f5746;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C22544 f5747;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Condition f5748;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f5749 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient C5390 f5750;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Condition f5751;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient int f5752;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m5958(long j) throws InterruptedException {
        EnumC10183 enumC10183;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        int[] iArr = C24782.f80225;
        C17359.requireNonNull(timeUnit);
        switch (iArr[timeUnit.ordinal()]) {
            case 1:
                enumC10183 = EnumC10183.NANOS;
                break;
            case 2:
                enumC10183 = EnumC10183.MICROS;
                break;
            case 3:
                enumC10183 = EnumC10183.MILLIS;
                break;
            case 4:
                enumC10183 = EnumC10183.SECONDS;
                break;
            case 5:
                enumC10183 = EnumC10183.MINUTES;
                break;
            case 6:
                enumC10183 = EnumC10183.HOURS;
                break;
            case 7:
                enumC10183 = EnumC10183.DAYS;
                break;
            default:
                throw new IllegalArgumentException(timeUnit.toString());
        }
        long nanos = C18257.of(j, enumC10183).toNanos();
        C22544 c22544 = this.f5747;
        c22544.lockInterruptibly();
        while (true) {
            try {
                Object objM5956 = m5956();
                if (objM5956 != null) {
                    c22544.unlock();
                    return objM5956;
                }
                if (nanos > 0) {
                    nanos = this.f5751.awaitNanos(nanos);
                } else {
                    c22544.unlock();
                    return null;
                }
            } catch (Throwable th) {
                c22544.unlock();
                throw th;
            }
        }
    }

    public C1661() {
        C22544 c22544 = new C22544(false);
        this.f5747 = c22544;
        this.f5751 = c22544.newCondition();
        this.f5748 = c22544.newCondition();
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
        C22544 c22544 = this.f5747;
        c22544.lock();
        try {
            C5390 c5390 = this.f5750;
            while (c5390 != null) {
                c5390.f18879 = null;
                C5390 c5391 = c5390.f18881;
                c5390.f18880 = null;
                c5390.f18881 = null;
                c5390 = c5391;
            }
            this.f5746 = null;
            this.f5750 = null;
            this.f5752 = 0;
            this.f5748.signalAll();
        } finally {
            c22544.unlock();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        C22544 c22544 = this.f5747;
        c22544.lock();
        try {
            for (C5390 c5390 = this.f5750; c5390 != null; c5390 = c5390.f18881) {
                if (obj.equals(c5390.f18879)) {
                    c22544.unlock();
                    return true;
                }
            }
            c22544.unlock();
            return false;
        } catch (Throwable th) {
            c22544.unlock();
            throw th;
        }
    }

    @Override // java.util.Deque
    public final Iterator descendingIterator() {
        return new C15084(this);
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

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m5961() {
        C22544 c22544 = this.f5747;
        c22544.lock();
        try {
            return c22544.getWaitQueueLength(this.f5751);
        } finally {
            c22544.unlock();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m5959() {
        C22544 c22544 = this.f5747;
        c22544.lock();
        try {
            return c22544.hasWaiters(this.f5751);
        } finally {
            c22544.unlock();
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m5962() {
        C22544 c22544 = this.f5747;
        c22544.lock();
        try {
            c22544.m50781(this.f5751);
        } finally {
            c22544.unlock();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Deque
    public final Iterator iterator() {
        return new C12847(this);
    }

    @Override // java.util.Queue, java.util.Deque
    public final boolean offer(Object obj) {
        return offerLast(obj);
    }

    @Override // java.util.Deque
    public final boolean offerFirst(Object obj) {
        boolean z;
        C17359.requireNonNull(obj, "e");
        C22544 c22544 = this.f5747;
        c22544.lock();
        try {
            int i = this.f5752;
            if (i >= this.f5749) {
                z = false;
            } else {
                C5390 c5390 = this.f5750;
                C5390 c5391 = new C5390(obj, null, c5390);
                this.f5750 = c5391;
                if (this.f5746 == null) {
                    this.f5746 = c5391;
                } else {
                    c5390.f18880 = c5391;
                }
                z = true;
                this.f5752 = i + 1;
                this.f5751.signal();
            }
            return z;
        } finally {
            c22544.unlock();
        }
    }

    @Override // java.util.Deque
    public final boolean offerLast(Object obj) {
        boolean z;
        C17359.requireNonNull(obj, "e");
        C22544 c22544 = this.f5747;
        c22544.lock();
        try {
            int i = this.f5752;
            if (i >= this.f5749) {
                z = false;
            } else {
                C5390 c5390 = this.f5746;
                C5390 c5391 = new C5390(obj, c5390, null);
                this.f5746 = c5391;
                if (this.f5750 == null) {
                    this.f5750 = c5391;
                } else {
                    c5390.f18881 = c5391;
                }
                z = true;
                this.f5752 = i + 1;
                this.f5751.signal();
            }
            return z;
        } finally {
            c22544.unlock();
        }
    }

    @Override // java.util.Queue, java.util.Deque
    public final Object peek() {
        return peekFirst();
    }

    @Override // java.util.Deque
    public final Object peekFirst() {
        C22544 c22544 = this.f5747;
        c22544.lock();
        try {
            C5390 c5390 = this.f5750;
            return c5390 == null ? null : c5390.f18879;
        } finally {
            c22544.unlock();
        }
    }

    @Override // java.util.Deque
    public final Object peekLast() {
        C22544 c22544 = this.f5747;
        c22544.lock();
        try {
            C5390 c5390 = this.f5746;
            return c5390 == null ? null : c5390.f18879;
        } finally {
            c22544.unlock();
        }
    }

    @Override // java.util.Queue, java.util.Deque
    public final Object poll() {
        return pollFirst();
    }

    @Override // java.util.Deque
    public final Object pollFirst() {
        C22544 c22544 = this.f5747;
        c22544.lock();
        try {
            return m5956();
        } finally {
            c22544.unlock();
        }
    }

    @Override // java.util.Deque
    public final Object pollLast() {
        C22544 c22544 = this.f5747;
        c22544.lock();
        try {
            return m5955();
        } finally {
            c22544.unlock();
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
        this.f5752 = 0;
        this.f5750 = null;
        this.f5746 = null;
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
        C22544 c22544 = this.f5747;
        c22544.lock();
        try {
            for (C5390 c5390 = this.f5750; c5390 != null; c5390 = c5390.f18881) {
                if (obj.equals(c5390.f18879)) {
                    m5953(c5390);
                    return true;
                }
            }
            return false;
        } finally {
            c22544.unlock();
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
        C22544 c22544 = this.f5747;
        c22544.lock();
        try {
            for (C5390 c5390 = this.f5746; c5390 != null; c5390 = c5390.f18880) {
                if (obj.equals(c5390.f18879)) {
                    m5953(c5390);
                    return true;
                }
            }
            return false;
        } finally {
            c22544.unlock();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final int size() {
        C22544 c22544 = this.f5747;
        c22544.lock();
        try {
            return this.f5752;
        } finally {
            c22544.unlock();
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Object m5960() {
        C22544 c22544 = this.f5747;
        c22544.lock();
        while (true) {
            try {
                Object objM5956 = m5956();
                if (objM5956 == null) {
                    this.f5751.await();
                } else {
                    c22544.unlock();
                    return objM5956;
                }
            } catch (Throwable th) {
                c22544.unlock();
                throw th;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        C22544 c22544 = this.f5747;
        c22544.lock();
        try {
            Object[] objArr = new Object[this.f5752];
            C5390 c5390 = this.f5750;
            int i = 0;
            while (c5390 != null) {
                int i2 = i + 1;
                objArr[i] = c5390.f18879;
                c5390 = c5390.f18881;
                i = i2;
            }
            c22544.unlock();
            return objArr;
        } catch (Throwable th) {
            c22544.unlock();
            throw th;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C22544 c22544 = this.f5747;
        c22544.lock();
        try {
            if (objArr.length < this.f5752) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f5752);
            }
            C5390 c5390 = this.f5750;
            int i = 0;
            while (c5390 != null) {
                objArr[i] = c5390.f18879;
                c5390 = c5390.f18881;
                i++;
            }
            if (objArr.length > i) {
                objArr[i] = null;
            }
            return objArr;
        } finally {
            c22544.unlock();
        }
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        C22544 c22544 = this.f5747;
        c22544.lock();
        try {
            return super.toString();
        } finally {
            c22544.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m5953(C5390 c5390) {
        C5390 c5391 = c5390.f18880;
        C5390 c5392 = c5390.f18881;
        if (c5391 == null) {
            m5956();
            return;
        }
        if (c5392 == null) {
            m5955();
            return;
        }
        c5391.f18881 = c5392;
        c5392.f18880 = c5391;
        c5390.f18879 = null;
        this.f5752--;
        this.f5748.signal();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private Object m5956() {
        C5390 c5390 = this.f5750;
        if (c5390 == null) {
            return null;
        }
        C5390 c5391 = c5390.f18881;
        Object obj = c5390.f18879;
        c5390.f18879 = null;
        c5390.f18881 = c5390;
        this.f5750 = c5391;
        if (c5391 == null) {
            this.f5746 = null;
        } else {
            c5391.f18880 = null;
        }
        this.f5752--;
        this.f5748.signal();
        return obj;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private Object m5955() {
        C5390 c5390 = this.f5746;
        if (c5390 == null) {
            return null;
        }
        C5390 c5391 = c5390.f18880;
        Object obj = c5390.f18879;
        c5390.f18879 = null;
        c5390.f18880 = c5390;
        this.f5746 = c5391;
        if (c5391 == null) {
            this.f5750 = null;
        } else {
            c5391.f18881 = null;
        }
        this.f5752--;
        this.f5748.signal();
        return obj;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        C22544 c22544 = this.f5747;
        c22544.lock();
        try {
            objectOutputStream.defaultWriteObject();
            for (C5390 c5390 = this.f5750; c5390 != null; c5390 = c5390.f18881) {
                objectOutputStream.writeObject(c5390.f18879);
            }
            objectOutputStream.writeObject(null);
        } finally {
            c22544.unlock();
        }
    }
}
