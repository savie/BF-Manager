package l;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ᩴۧ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 57TP */
/* JADX INFO: loaded from: classes4.dex */
public final class C18724 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8346 f60730;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f60731 = new ConcurrentMapC13783();

    public C18724(AbstractC12684 abstractC12684, C23978 c23978) {
        this.f60730 = new C8346(abstractC12684, c23978);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m43257(final Object obj) {
        C13638.toString(obj);
        Thread.currentThread().getName();
        final C21546 c21546 = (C21546) C2492.computeIfAbsent(this.f60731, obj, new C6729());
        if (c21546.isEmpty()) {
            C8346 c8346 = this.f60730;
            if (c8346.m21806(obj) > 0) {
                try {
                    return c8346.m21811(obj);
                } catch (Exception unused) {
                }
            }
        }
        final C18018 c18018 = new C18018(0);
        c21546.offer(c18018);
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicReference atomicReference2 = new AtomicReference();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        ExecutorService executorService = C4716.f16636;
        executorService.submit(new Callable() { // from class: l.᩺ۧ᩹
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C18724.m43255(this.f74630, obj, atomicReference, c18018, countDownLatch, c21546, atomicReference2);
                return null;
            }
        });
        Future futureSubmit = executorService.submit(new Callable() { // from class: l.ܶۧ᩹
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C18724.m43256(this.f49589, c18018, obj, atomicReference, countDownLatch, c21546);
                return null;
            }
        });
        try {
            countDownLatch.await();
            Exception exc = (Exception) atomicReference2.get();
            if (exc != null) {
                throw exc;
            }
            Object obj2 = atomicReference.get();
            if (obj2 == null) {
                throw new RuntimeException("Failed to get object");
            }
            c21546.remove(c18018);
            c18018.m41958();
            if (!futureSubmit.isDone()) {
                futureSubmit.cancel(true);
            }
            return obj2;
        } catch (Throwable th) {
            c21546.remove(c18018);
            c18018.m41958();
            if (!futureSubmit.isDone()) {
                futureSubmit.cancel(true);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m43255(C18724 c18724, Object obj, AtomicReference atomicReference, C18018 c18018, CountDownLatch countDownLatch, C21546 c21546, AtomicReference atomicReference2) {
        try {
            Object objM21811 = c18724.f60730.m21811(obj);
            C13638.toString(objM21811);
            C13638.toString(obj);
            while (!atomicReference.compareAndSet(null, objM21811)) {
                if (atomicReference.get() != null) {
                    c18724.m43254(obj, objM21811, c21546);
                    return;
                }
            }
            c18018.m41961();
            countDownLatch.countDown();
        } catch (Exception e) {
            C13638.toString(obj);
            while (!atomicReference2.compareAndSet(null, e) && atomicReference2.get() == null) {
            }
            c18018.m41961();
            countDownLatch.countDown();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m43256(C18724 c18724, C18018 c18018, Object obj, AtomicReference atomicReference, CountDownLatch countDownLatch, C21546 c21546) {
        try {
            Object objM41960 = c18018.m41960();
            if (objM41960 != null) {
                objM41960.toString();
                C13638.toString(obj);
                while (!atomicReference.compareAndSet(null, objM41960)) {
                    if (atomicReference.get() != null) {
                        c18724.m43254(obj, objM41960, c21546);
                        return;
                    }
                }
                c18018.m41961();
                countDownLatch.countDown();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m43254(Object obj, Object obj2, C21546 c21546) {
        C18018 c18018;
        do {
            c18018 = (C18018) c21546.poll();
            if (c18018 == null) {
                this.f60730.m21812(obj, obj2);
                C13638.toString(obj2);
                C13638.toString(obj);
                return;
            }
        } while (!c18018.m41959(obj2));
        C13638.toString(obj2);
        C13638.toString(obj);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m43260(Object obj, Object obj2) {
        C18018 c18018;
        C13638.toString(obj);
        C13638.toString(obj2);
        Thread.currentThread().getName();
        C21546 c21546 = (C21546) this.f60731.get(obj);
        if (c21546 != null) {
            do {
                c18018 = (C18018) c21546.poll();
                if (c18018 != null) {
                }
            } while (!c18018.m41959(obj2));
            return;
        }
        this.f60730.m21812(obj, obj2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m43259(Object obj) {
        this.f60730.m21810(obj);
        C21546 c21546 = (C21546) this.f60731.remove(obj);
        if (c21546 == null) {
            return;
        }
        while (true) {
            C18018 c18018 = (C18018) c21546.poll();
            if (c18018 == null) {
                return;
            } else {
                c18018.m41958();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43258(Object obj, Object obj2) {
        C8346 c8346 = this.f60730;
        c8346.getClass();
        EnumC6333 enumC6333 = EnumC6333.NORMAL;
        c8346.m21808(obj, obj2);
    }
}
