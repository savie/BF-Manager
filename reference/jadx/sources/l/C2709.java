package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۖܰۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: F77E */
/* JADX INFO: loaded from: classes2.dex */
public final class C2709 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22847 f9045;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AtomicReference f9046;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C15387 f9047;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C0472 f9048;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C13921 f9049;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C18063 f9050;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C19863 f9051;

    public C2709(C22847 c22847, C19863 c19863, C15387 c15387, AtomicReference atomicReference) {
        C18063 c18063 = new C18063();
        C13921 c13921 = new C13921(1);
        C0472 c0472 = new C0472();
        this.f9045 = c22847;
        this.f9051 = c19863;
        this.f9047 = c15387;
        this.f9046 = atomicReference;
        this.f9050 = c18063;
        this.f9049 = c13921;
        this.f9048 = c0472;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9027(List list) throws Exception {
        this.f9050.getClass();
        ExecutorService executorService = C5261.f18541;
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(C11138.f35105);
        this.f9049.getClass();
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        AtomicInteger atomicInteger = new AtomicInteger();
        C0472 c0472 = this.f9048;
        AtomicReference atomicReference = this.f9046;
        try {
            if (m9024(list, executorServiceNewFixedThreadPool, new C9420(executorServiceNewSingleThreadExecutor, atomicInteger, atomicReference, c0472)) | m9025(executorServiceNewFixedThreadPool) | m9025(executorServiceNewSingleThreadExecutor)) {
                Thread.currentThread().interrupt();
            }
            Exception exc = (Exception) atomicReference.get();
            if (exc == null) {
                return;
            }
            C22327.m50389(exc);
            throw exc;
        } catch (Throwable th) {
            if (m9025(executorServiceNewFixedThreadPool) | m9025(executorServiceNewSingleThreadExecutor)) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m9024(List list, ExecutorService executorService, C9420 c9420) throws Throwable {
        C22847 c22847 = this.f9045;
        AtomicReference atomicReference = this.f9046;
        boolean z = false;
        C9861 c9861 = null;
        try {
            Iterator it = list.iterator();
            z = false;
            boolean zM9026 = false;
            C9861 c9862 = null;
            while (it.hasNext()) {
                try {
                    C18812 c18812 = (C18812) it.next();
                    if (((C25085) c22847.f74224).mo924() || atomicReference.get() != null) {
                        break;
                    }
                    try {
                        if (c18812.f61135 != c9862) {
                            if (z) {
                                c9862.m25646();
                            }
                            c9862 = c18812.f61135;
                            c9862.m25645();
                            z = true;
                        }
                        zM9026 |= m9026(c18812, executorService, c9420);
                    } catch (Exception e) {
                        while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                        }
                    }
                    if (((C25085) c22847.f74224).mo924() || atomicReference.get() != null) {
                        break;
                    }
                } catch (Throwable th) {
                    th = th;
                    c9861 = c9862;
                    if (z) {
                        c9861.m25646();
                    }
                    throw th;
                }
            }
            if (z) {
                c9862.m25646();
            }
            return zM9026;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m9026(C18812 c18812, ExecutorService executorService, C9420 c9420) {
        C9861 c9861 = c18812.f61134;
        boolean z = false;
        if (c9861 != null) {
            try {
                if (c9861 != c18812.f61135) {
                    c9861.m25645();
                    z = true;
                }
            } finally {
                if (z) {
                    c9861.m25646();
                }
            }
        }
        return m9023(c18812.f61133, executorService, c9420);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m9023(ArrayList arrayList, ExecutorService executorService, final C9420 c9420) {
        AtomicReference atomicReference;
        ArrayList<Future> arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            atomicReference = this.f9046;
            if (!zHasNext) {
                break;
            }
            final C7625 c7625 = (C7625) it.next();
            if (((C25085) this.f9045.f74224).mo924() || atomicReference.get() != null) {
                break;
            }
            arrayList2.add(executorService.submit(new Callable() { // from class: l.۟ܰۤ
                @Override // java.util.concurrent.Callable
                public final Object call() throws Throwable {
                    C2709.m9022(this.f26353, c7625, c9420);
                    return null;
                }
            }));
        }
        boolean z = false;
        for (Future future : arrayList2) {
            boolean z2 = false;
            while (!z2) {
                try {
                    future.get();
                } catch (InterruptedException e) {
                    while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                    }
                    z = true;
                } catch (CancellationException unused) {
                } catch (ExecutionException e2) {
                    Throwable cause = e2.getCause();
                    Exception runtimeException = cause instanceof Exception ? (Exception) cause : new RuntimeException(cause);
                    while (!atomicReference.compareAndSet(null, runtimeException) && atomicReference.get() == null) {
                    }
                }
                z2 = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m9022(C2709 c2709, C7625 c7625, C9420 c9420) throws Throwable {
        if (((C25085) c2709.f9045.f74224).mo924() || c2709.f9046.get() != null) {
            return;
        }
        ((C3374) c2709.f9051.f63894).m11079(1);
        C15387 c15387 = c2709.f9047;
        C25085.m55905(c15387.f50172, c15387.f50177, c15387.f50173, c15387.f50178, c15387.f50176, c15387.f50175, c15387.f50174, c7625, c9420);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m9025(ExecutorService executorService) {
        executorService.shutdown();
        boolean z = false;
        while (!executorService.awaitTermination(1L, TimeUnit.DAYS)) {
            try {
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        return z;
    }
}
