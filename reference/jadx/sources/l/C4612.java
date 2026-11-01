package l;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.ۙۧ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 713E */
/* JADX INFO: loaded from: classes2.dex */
public final class C4612 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AtomicLong f16335 = new AtomicLong(0);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f16332 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f16333 = new AtomicLong(0);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f16334 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f16331 = new ArrayList();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f16330 = new AtomicInteger();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12758(String[] strArr, final boolean z, final InterfaceC9408 interfaceC9408) {
        AtomicInteger atomicInteger = this.f16330;
        if (atomicInteger.get() != 0) {
            throw new RuntimeException();
        }
        ExecutorService executorServiceNewSingleThreadExecutor = null;
        for (String str : strArr) {
            if (interfaceC9408.mo2357()) {
                break;
            }
            AbstractC20745 abstractC20745M15313 = C5553.m15313(str, new String[0]);
            final C3056 c3056 = new C3056(abstractC20745M15313, abstractC20745M15313.getName());
            if (z) {
                c3056.m9157();
            }
            m12757(c3056);
            if (c3056.f11515 && !c3056.f11518) {
                atomicInteger.incrementAndGet();
                if (executorServiceNewSingleThreadExecutor == null) {
                    executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                }
                final ExecutorService executorService = executorServiceNewSingleThreadExecutor;
                executorService.submit(new Runnable() { // from class: l.ܳۛ᩹
                    @Override // java.lang.Runnable
                    public final void run() {
                        ExecutorService executorService2 = executorService;
                        InterfaceC9408 interfaceC9409 = interfaceC9408;
                        C4612 c4612 = this.f47012;
                        C3056 c3057 = c3056;
                        c4612.m12752(c3057.f11517, C22697.m50267(new StringBuilder(), c3057.f11521, "/"), z, executorService2, interfaceC9409);
                    }
                });
                executorServiceNewSingleThreadExecutor = executorService;
            }
        }
        while (atomicInteger.get() != 0) {
            SystemClock.sleep(1L);
        }
        if (executorServiceNewSingleThreadExecutor != null) {
            C4716.m13052(executorServiceNewSingleThreadExecutor);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m12752(AbstractC20745 abstractC20745, String str, final boolean z, final ExecutorService executorService, final InterfaceC9408 interfaceC9408) {
        boolean zMo2357 = interfaceC9408.mo2357();
        AtomicInteger atomicInteger = this.f16330;
        if (zMo2357) {
            atomicInteger.decrementAndGet();
            return;
        }
        for (AbstractC20745 abstractC20746 : abstractC20745.mo33983(true)) {
            if (interfaceC9408.mo2357()) {
                atomicInteger.decrementAndGet();
                return;
            }
            StringBuilder sbM23356 = C9023.m23356(str);
            sbM23356.append(abstractC20746.getName());
            final C3056 c3056 = new C3056(abstractC20746, sbM23356.toString());
            if (z) {
                c3056.m9157();
            }
            m12757(c3056);
            if (c3056.f11515 && !c3056.f11518) {
                atomicInteger.incrementAndGet();
                executorService.submit(new Runnable() { // from class: l.֫ۛ᩹
                    @Override // java.lang.Runnable
                    public final void run() {
                        ExecutorService executorService2 = executorService;
                        InterfaceC9408 interfaceC9409 = interfaceC9408;
                        C4612 c4612 = this.f6572;
                        C3056 c3057 = c3056;
                        c4612.m12752(c3057.f11517, C22697.m50267(new StringBuilder(), c3057.f11521, "/"), z, executorService2, interfaceC9409);
                    }
                });
            }
        }
        atomicInteger.decrementAndGet();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12757(C3056 c3056) {
        synchronized (this.f16331) {
            this.f16331.add(c3056);
        }
        if (!c3056.f11515) {
            this.f16335.addAndGet(c3056.f11516);
        }
        this.f16332.incrementAndGet();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long m12754() {
        return this.f16335.get();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m12761() {
        return this.f16333.get();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m12760() {
        return this.f16332.get();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m12755() {
        return this.f16334.get();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12756(long j) {
        this.f16333.addAndGet(j);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m12759() {
        this.f16334.incrementAndGet();
    }
}
