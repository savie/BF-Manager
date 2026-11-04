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

/* JADX INFO: renamed from: l.֡ܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7HC */
/* JADX INFO: loaded from: classes2.dex */
public final class C0544 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2540(AbstractC22044 abstractC22044, AbstractC22044 abstractC22045) throws Throwable {
        if (C17359.equals(abstractC22044.mo4294(), abstractC22045.mo4294())) {
            throw new IOException("inputFile and outputFile must be different.");
        }
        boolean z = true;
        int iMax = Math.max(1, Runtime.getRuntime().availableProcessors());
        ArrayList arrayList = new ArrayList(iMax);
        for (int i = 0; i < iMax; i++) {
            arrayList.add(abstractC22045.m49862(".part-" + i + ".tmp"));
        }
        try {
            C22941 c22941 = new C22941(abstractC22044);
            try {
                ArrayList arrayList2 = new ArrayList(c22941.m51749());
                for (C8002 c8002 : c22941.m51742()) {
                    if (c8002.m21856()) {
                        throw new IOException("Encrypted entry is not supported: " + c8002.getName());
                    }
                    arrayList2.add(c8002);
                }
                C12884.sort(arrayList2, new C14713(0));
                m2539(c22941, arrayList, arrayList2, iMax, abstractC22045, c22941.m51732());
                try {
                    c22941.close();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((AbstractC22044) it.next()).mo4296();
                    }
                } catch (Throwable th) {
                    th = th;
                    if (!z) {
                        abstractC22045.mo4296();
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((AbstractC22044) it2.next()).mo4296();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    c22941.close();
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
    private void m2539(C22941 c22941, final ArrayList arrayList, ArrayList arrayList2, int i, AbstractC22044 abstractC22044, String str) throws IOException {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(i);
        ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(executorServiceNewFixedThreadPool);
        final C15481 c15481 = new C15481(c22941);
        final ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue(arrayList2);
        for (int i2 = 0; i2 < i; i2++) {
            final int i3 = i2;
            executorCompletionService.submit(new Callable(this) { // from class: l.᩶ܺܺ
                @Override // java.util.concurrent.Callable
                public final Object call() throws IOException {
                    C15481 c15482 = c15481;
                    ConcurrentLinkedQueue concurrentLinkedQueue2 = concurrentLinkedQueue;
                    AbstractC22044 abstractC22045 = (AbstractC22044) arrayList.get(i3);
                    C25179 c25179 = new C25179(abstractC22045);
                    try {
                        c25179.m56135(8);
                        c25179.m56121(10);
                        C22941 c22941M37046 = c15482.m37046();
                        int i4 = 0;
                        while (true) {
                            C8002 c8002 = (C8002) concurrentLinkedQueue2.poll();
                            if (c8002 == null) {
                                c25179.close();
                                return new C18443(abstractC22045, i4);
                            }
                            if (!c8002.isDirectory()) {
                                c25179.m56125(c8002);
                                InputStream inputStreamM51727 = c22941M37046.m51727(c8002);
                                try {
                                    c25179.m56123(inputStreamM51727);
                                    inputStreamM51727.close();
                                    i4++;
                                } catch (Throwable th) {
                                    try {
                                        inputStreamM51727.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            c25179.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
            });
        }
        try {
            C25179 c25179 = new C25179(abstractC22044);
            try {
                c25179.m56136(str);
                for (int i4 = 0; i4 < i; i4++) {
                    m2538(m2537(executorCompletionService), c25179);
                }
                c25179.close();
                C5261.m15837(executorServiceNewFixedThreadPool);
            } catch (Throwable th) {
                try {
                    c25179.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            executorServiceNewFixedThreadPool.shutdownNow();
            C5261.m15837(executorServiceNewFixedThreadPool);
            if (th3 instanceof IOException) {
                throw th3;
            }
            throw new IOException(th3);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18443 m2537(ExecutorCompletionService executorCompletionService) throws IOException {
        IOException iOException;
        try {
            try {
                return (C18443) executorCompletionService.take().get();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IOException("Interrupted while reading partition result.", e);
            } catch (ExecutionException e2) {
                Throwable cause = e2.getCause();
                if (cause instanceof IOException) {
                    iOException = (IOException) cause;
                } else {
                    iOException = new IOException(cause);
                }
                C22327.m50389(iOException);
                throw iOException;
            }
        } catch (InterruptedException e3) {
            Thread.currentThread().interrupt();
            throw new IOException("Interrupted while waiting partition result.", e3);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2538(C18443 c18443, C25179 c25179) {
        if (c18443.f60047 == 0) {
            return;
        }
        C22941 c22941 = new C22941(c18443.f60048);
        try {
            for (C8002 c8002 : c22941.m51742()) {
                if (!c8002.isDirectory() && c8002.m21838() >= c8002.getSize()) {
                    c25179.m56125(c8002);
                    InputStream inputStreamM51727 = c22941.m51727(c8002);
                    try {
                        c25179.m56123(inputStreamM51727);
                        inputStreamM51727.close();
                    } catch (Throwable th) {
                        try {
                            inputStreamM51727.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } else {
                    c25179.m56126(c8002, c22941);
                }
            }
            c22941.close();
        } catch (Throwable th3) {
            try {
                c22941.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
