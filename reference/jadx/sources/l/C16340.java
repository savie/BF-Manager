package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: l.ܽ֫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: O7HC */
/* JADX INFO: loaded from: classes4.dex */
public final class C16340 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38512(AbstractC20745 abstractC20745, AbstractC20745 abstractC20746) throws Throwable {
        if (C13638.equals(abstractC20745.mo33986(), abstractC20746.mo33986())) {
            throw new IOException("inputFile and outputFile must be different.");
        }
        boolean z = true;
        int iMax = Math.max(1, Runtime.getRuntime().availableProcessors());
        ArrayList arrayList = new ArrayList(iMax);
        for (int i = 0; i < iMax; i++) {
            arrayList.add(abstractC20746.m46733(".part-" + i + ".tmp"));
        }
        try {
            C2455 c2455 = new C2455(abstractC20745);
            try {
                ArrayList arrayList2 = new ArrayList(c2455.m7485());
                for (C12107 c12107 : c2455.m7466()) {
                    if (c12107.m30133()) {
                        throw new IOException("Encrypted entry is not supported: " + c12107.getName());
                    }
                    arrayList2.add(c12107);
                }
                C23846.sort(arrayList2, new C15635(0));
                m38511(c2455, arrayList, arrayList2, iMax, abstractC20746, c2455.m7480());
                try {
                    c2455.close();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((AbstractC20745) it.next()).mo24647();
                    }
                } catch (Throwable th) {
                    th = th;
                    if (!z) {
                        abstractC20746.mo24647();
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((AbstractC20745) it2.next()).mo24647();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    c2455.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            th = th4;
            z = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38511(C2455 c2455, final ArrayList arrayList, ArrayList arrayList2, int i, AbstractC20745 abstractC20745, String str) throws IOException {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(i);
        ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(executorServiceNewFixedThreadPool);
        final C22212 c22212 = new C22212(c2455);
        final ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue(arrayList2);
        for (int i2 = 0; i2 < i; i2++) {
            final int i3 = i2;
            executorCompletionService.submit(new Callable(this) { // from class: l.᩶֫᩺
                @Override // java.util.concurrent.Callable
                public final Object call() throws IOException {
                    C22212 c22213 = c22212;
                    ConcurrentLinkedQueue concurrentLinkedQueue2 = concurrentLinkedQueue;
                    AbstractC20745 abstractC20746 = (AbstractC20745) arrayList.get(i3);
                    C22918 c22918 = new C22918(abstractC20746);
                    try {
                        c22918.m50733(8);
                        c22918.m50722(10);
                        C2455 c2455M49332 = c22213.m49332();
                        int i4 = 0;
                        while (true) {
                            C12107 c12107 = (C12107) concurrentLinkedQueue2.poll();
                            if (c12107 == null) {
                                c22918.close();
                                return new C0111(abstractC20746, i4);
                            }
                            if (!c12107.isDirectory()) {
                                c22918.m50727(c12107);
                                InputStream inputStreamM7471 = c2455M49332.m7471(c12107);
                                try {
                                    c22918.m50724(inputStreamM7471);
                                    inputStreamM7471.close();
                                    i4++;
                                } catch (Throwable th) {
                                    try {
                                        inputStreamM7471.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            c22918.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
            });
        }
        try {
            C22918 c22918 = new C22918(abstractC20745);
            try {
                c22918.m50734(str);
                for (int i4 = 0; i4 < i; i4++) {
                    m38510(m38509(executorCompletionService), c22918);
                }
                c22918.close();
                C4716.m13052(executorServiceNewFixedThreadPool);
            } catch (Throwable th) {
                try {
                    c22918.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            executorServiceNewFixedThreadPool.shutdownNow();
            C4716.m13052(executorServiceNewFixedThreadPool);
            if (th3 instanceof IOException) {
                throw th3;
            }
            throw new IOException(th3);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0111 m38509(ExecutorCompletionService executorCompletionService) throws IOException {
        try {
            try {
                return (C0111) executorCompletionService.take().get();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IOException("Interrupted while reading partition result.", e);
            } catch (ExecutionException e2) {
                Throwable cause = e2.getCause();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                throw new IOException(cause);
            }
        } catch (InterruptedException e3) {
            Thread.currentThread().interrupt();
            throw new IOException("Interrupted while waiting partition result.", e3);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38510(C0111 c0111, C22918 c22918) {
        if (c0111.f1083 == 0) {
            return;
        }
        C2455 c2455 = new C2455(c0111.f1084);
        try {
            for (C12107 c12107 : c2455.m7466()) {
                if (!c12107.isDirectory() && c12107.m30138() >= c12107.getSize()) {
                    c22918.m50727(c12107);
                    InputStream inputStreamM7471 = c2455.m7471(c12107);
                    try {
                        c22918.m50724(inputStreamM7471);
                        inputStreamM7471.close();
                    } catch (Throwable th) {
                        try {
                            inputStreamM7471.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } else {
                    c22918.m50728(c12107, c2455);
                }
            }
            c2455.close();
        } catch (Throwable th3) {
            try {
                c2455.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
