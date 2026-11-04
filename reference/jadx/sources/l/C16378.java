package l;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ܶ᩸۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 57TP */
/* JADX INFO: loaded from: classes4.dex */
public final class C16378 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4644 f53165;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f53166 = new ConcurrentMapC17249();

    public C16378(AbstractC11946 abstractC11946, C21622 c21622) {
        this.f53165 = new C4644(abstractC11946, c21622);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m38870(final Object obj) {
        C17359.toString(obj);
        Thread.currentThread().getName();
        final C17124 c17124 = (C17124) C23217.computeIfAbsent(this.f53166, obj, new C2209());
        if (c17124.isEmpty()) {
            C4644 c4644 = this.f53165;
            if (c4644.m14494(obj) > 0) {
                try {
                    return c4644.m14491(obj);
                } catch (Exception unused) {
                }
            }
        }
        final C17870 c17870 = new C17870(0);
        c17124.offer(c17870);
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicReference atomicReference2 = new AtomicReference();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        ExecutorService executorService = C5261.f18540;
        executorService.submit(new Callable() { // from class: l.ۧ᩸۫
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C16378.m38868(this.f38332, obj, atomicReference, c17870, countDownLatch, c17124, atomicReference2);
                return null;
            }
        });
        Future futureSubmit = executorService.submit(new Callable() { // from class: l.᩻᩸۫
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C16378.m38869(this.f81792, c17870, obj, atomicReference, countDownLatch, c17124);
                return null;
            }
        });
        try {
            countDownLatch.await();
            Exception exc = (Exception) atomicReference2.get();
            if (exc != null) {
                C22327.m50389(exc);
                throw exc;
            }
            Object obj2 = atomicReference.get();
            if (obj2 == null) {
                throw new RuntimeException("Failed to get object");
            }
            c17124.remove(c17870);
            c17870.m41714();
            if (!futureSubmit.isDone()) {
                futureSubmit.cancel(true);
            }
            return obj2;
        } catch (Throwable th) {
            c17124.remove(c17870);
            c17870.m41714();
            if (!futureSubmit.isDone()) {
                futureSubmit.cancel(true);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38868(C16378 c16378, Object obj, AtomicReference atomicReference, C17870 c17870, CountDownLatch countDownLatch, C17124 c17124, AtomicReference atomicReference2) {
        try {
            Object objM14491 = c16378.f53165.m14491(obj);
            C17359.toString(objM14491);
            C17359.toString(obj);
            while (!atomicReference.compareAndSet(null, objM14491)) {
                if (atomicReference.get() != null) {
                    c16378.m38867(obj, objM14491, c17124);
                    return;
                }
            }
            c17870.m41717();
            countDownLatch.countDown();
        } catch (Exception e) {
            C17359.toString(obj);
            while (!atomicReference2.compareAndSet(null, e) && atomicReference2.get() == null) {
            }
            c17870.m41717();
            countDownLatch.countDown();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38869(C16378 c16378, C17870 c17870, Object obj, AtomicReference atomicReference, CountDownLatch countDownLatch, C17124 c17124) {
        try {
            Object objM41716 = c17870.m41716();
            if (objM41716 != null) {
                objM41716.toString();
                C17359.toString(obj);
                while (!atomicReference.compareAndSet(null, objM41716)) {
                    if (atomicReference.get() != null) {
                        c16378.m38867(obj, objM41716, c17124);
                        return;
                    }
                }
                c17870.m41717();
                countDownLatch.countDown();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38867(Object obj, Object obj2, C17124 c17124) {
        C17870 c17870;
        do {
            c17870 = (C17870) c17124.poll();
            if (c17870 == null) {
                this.f53165.m14493(obj, obj2);
                C17359.toString(obj2);
                C17359.toString(obj);
                return;
            }
        } while (!c17870.m41715(obj2));
        C17359.toString(obj2);
        C17359.toString(obj);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m38873(Object obj, Object obj2) {
        C17870 c17870;
        C17359.toString(obj);
        C17359.toString(obj2);
        Thread.currentThread().getName();
        C17124 c17124 = (C17124) this.f53166.get(obj);
        if (c17124 != null) {
            do {
                c17870 = (C17870) c17124.poll();
                if (c17870 != null) {
                }
            } while (!c17870.m41715(obj2));
            return;
        }
        this.f53165.m14493(obj, obj2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m38872(Object obj) {
        this.f53165.m14490(obj);
        C17124 c17124 = (C17124) this.f53166.remove(obj);
        if (c17124 == null) {
            return;
        }
        while (true) {
            C17870 c17870 = (C17870) c17124.poll();
            if (c17870 == null) {
                return;
            } else {
                c17870.m41714();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38871(Object obj, Object obj2) {
        C4644 c4644 = this.f53165;
        c4644.getClass();
        EnumC17167 enumC17167 = EnumC17167.NORMAL;
        c4644.m14488(obj, obj2);
    }
}
