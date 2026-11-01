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

/* JADX INFO: renamed from: l.ۙ᩶ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: F77E */
/* JADX INFO: loaded from: classes2.dex */
public final class C4874 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C6866 f17142;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C22862 f17143;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4043 f17144;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C0219 f17145;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AtomicReference f17146;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C16523 f17147;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C11101 f17148;

    public C4874(C4043 c4043, C22862 c22862, C6866 c6866, AtomicReference atomicReference) {
        C16523 c16523 = new C16523();
        C0219 c0219 = new C0219();
        C11101 c11101 = new C11101();
        this.f17144 = c4043;
        this.f17143 = c22862;
        this.f17142 = c6866;
        this.f17146 = atomicReference;
        this.f17147 = c16523;
        this.f17145 = c0219;
        this.f17148 = c11101;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13581(List list) throws Exception {
        this.f17147.getClass();
        ExecutorService executorService = C4716.f16632;
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(C5464.f18831);
        this.f17145.getClass();
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        AtomicInteger atomicInteger = new AtomicInteger();
        C11101 c11101 = this.f17148;
        AtomicReference atomicReference = this.f17146;
        try {
            if (m13578(list, executorServiceNewFixedThreadPool, new C3338(executorServiceNewSingleThreadExecutor, atomicInteger, atomicReference, c11101)) | m13579(executorServiceNewFixedThreadPool) | m13579(executorServiceNewSingleThreadExecutor)) {
                Thread.currentThread().interrupt();
            }
            Exception exc = (Exception) atomicReference.get();
            if (exc != null) {
                throw exc;
            }
        } catch (Throwable th) {
            if (m13579(executorServiceNewFixedThreadPool) | m13579(executorServiceNewSingleThreadExecutor)) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m13578(List list, ExecutorService executorService, C3338 c3338) throws Throwable {
        C4043 c4043 = this.f17144;
        AtomicReference atomicReference = this.f17146;
        boolean z = false;
        C9835 c9835 = null;
        try {
            Iterator it = list.iterator();
            z = false;
            boolean zM13580 = false;
            C9835 c9836 = null;
            while (it.hasNext()) {
                try {
                    C2072 c2072 = (C2072) it.next();
                    if (((C18861) c4043.f14939).mo2357() || atomicReference.get() != null) {
                        break;
                    }
                    try {
                        if (c2072.f7668 != c9836) {
                            if (z) {
                                c9836.m24941();
                            }
                            c9836 = c2072.f7668;
                            c9836.m24940();
                            z = true;
                        }
                        zM13580 |= m13580(c2072, executorService, c3338);
                    } catch (Exception e) {
                        while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                        }
                    }
                    if (((C18861) c4043.f14939).mo2357() || atomicReference.get() != null) {
                        break;
                    }
                } catch (Throwable th) {
                    th = th;
                    c9835 = c9836;
                    if (z) {
                        c9835.m24941();
                    }
                    throw th;
                }
            }
            if (z) {
                c9836.m24941();
            }
            return zM13580;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m13580(C2072 c2072, ExecutorService executorService, C3338 c3338) {
        C9835 c9835 = c2072.f7667;
        boolean z = false;
        if (c9835 != null) {
            try {
                if (c9835 != c2072.f7668) {
                    c9835.m24940();
                    z = true;
                }
            } finally {
                if (z) {
                    c9835.m24941();
                }
            }
        }
        return m13577(c2072.f7666, executorService, c3338);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m13577(ArrayList arrayList, ExecutorService executorService, final C3338 c3338) {
        AtomicReference atomicReference;
        ArrayList<Future> arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            atomicReference = this.f17146;
            if (!zHasNext) {
                break;
            }
            final C14774 c14774 = (C14774) it.next();
            if (((C18861) this.f17144.f14939).mo2357() || atomicReference.get() != null) {
                break;
            }
            arrayList2.add(executorService.submit(new Callable() { // from class: l.᩻ܺۨ
                @Override // java.util.concurrent.Callable
                public final Object call() throws Throwable {
                    C4874.m13576(this.f76977, c14774, c3338);
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
    public static void m13576(C4874 c4874, C14774 c14774, C3338 c3338) throws Throwable {
        if (((C18861) c4874.f17144.f14939).mo2357() || c4874.f17146.get() != null) {
            return;
        }
        ((C8516) c4874.f17143.f74364).m22242(1);
        C6866 c6866 = c4874.f17142;
        C18861.m43496(c6866.f23151, c6866.f23154, c6866.f23153, c6866.f23150, c6866.f23152, c6866.f23155, c6866.f23149, c14774, c3338);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m13579(ExecutorService executorService) {
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
