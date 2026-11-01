package l;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: l.֫۫۬, reason: contains not printable characters */
/* JADX INFO: compiled from: M799 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1824 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Object f6990;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Context f6991;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C14526 f6992;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C0219 f6993;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Executor f6994;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f6995;

    public C1824(Context context) {
        ExecutorService executorService = C4716.f16636;
        C0219 c0219 = new C0219();
        this.f6990 = new Object();
        this.f6991 = context.getApplicationContext();
        this.f6994 = executorService;
        this.f6993 = c0219;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5947(InterfaceC2557 interfaceC2557, C6265 c6265, long j, int i, InterfaceC20170 interfaceC20170) {
        String strM17346 = c6265.m17346();
        synchronized (this.f6990) {
            C14526 c14526 = this.f6992;
            if (c14526 != null && c14526.f47582 == i) {
                InterfaceC2557 interfaceC2558 = c14526.f47576;
                String path = null;
                String path2 = interfaceC2558 == null ? null : interfaceC2558.getPath();
                if (interfaceC2557 != null) {
                    path = interfaceC2557.getPath();
                }
                if (C13638.equals(path2, path) && C13638.equals(this.f6992.f47585, strM17346)) {
                    C14526 c14527 = this.f6992;
                    c14527.f47576 = interfaceC2557;
                    c14527.f47580 = c6265;
                    c14527.f47585 = strM17346;
                    c14527.f47581 = j;
                    c14527.f47578 = interfaceC20170;
                    if (c14527.f47586 == null && !this.f6995) {
                        c14527.f47584 = false;
                    }
                    return;
                }
            }
            C14526 c14528 = this.f6992;
            m5940(c14528);
            this.f6992 = new C14526(interfaceC2557, c6265, strM17346, j, i, interfaceC20170);
            if (!this.f6995 && c14528 != null && c14528.f47586 != null) {
                this.f6995 = true;
                this.f6994.execute(new RunnableC19464(this, c14528));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5945(int i, int i2, long j) {
        synchronized (this.f6990) {
            C14526 c14526 = this.f6992;
            if (c14526 == null) {
                return;
            }
            int iMax = Math.max(1, i);
            int iMax2 = Math.max(1, i2);
            int i3 = c14526.f47582;
            int i4 = c14526.f47579;
            long j2 = c14526.f47581;
            long jMax = Math.max(1L, 1000L);
            if (j2 <= 0) {
                j2 = C17492.FOREVER_NS;
            }
            C23698 c23698 = new C23698(i3, i4, iMax, iMax2, (Math.max(0L, Math.min(j, j2)) / jMax) * jMax);
            if (c23698.equals(c14526.f47587)) {
                return;
            }
            c14526.f47575 = c23698;
            if (!this.f6995) {
                m5926();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5944() {
        synchronized (this.f6990) {
            C14526 c14526 = this.f6992;
            if (c14526 != null) {
                c14526.f47579++;
                c14526.f47575 = null;
                c14526.f47583 = true;
                if (!this.f6995) {
                    m5926();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m5948() {
        synchronized (this.f6990) {
            C14526 c14526 = this.f6992;
            if (c14526 != null && !c14526.f47584) {
                if (c14526.f47586 != null || this.f6995) {
                    m5940(c14526);
                    if (!this.f6995) {
                        m5926();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5946(Runnable runnable) {
        synchronized (this.f6990) {
            C14526 c14526 = this.f6992;
            if (c14526 != null) {
                m5940(c14526);
                c14526.f47588.add(runnable);
                if (!this.f6995) {
                    m5926();
                }
                return;
            }
            Object[] objArr = {runnable};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            C13638.requireNonNull(obj);
            arrayList.add(obj);
            List listUnmodifiableList = C0561.unmodifiableList(arrayList);
            this.f6995 = true;
            this.f6994.execute(new RunnableC10292(this, listUnmodifiableList));
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m5940(C14526 c14526) {
        if (c14526 == null) {
            return;
        }
        c14526.f47579++;
        c14526.f47575 = null;
        c14526.f47583 = false;
        c14526.f47584 = true;
        c14526.f47577 = false;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m5926() {
        List list;
        final C14526 c14526 = this.f6992;
        if (c14526 == null) {
            return;
        }
        boolean z = c14526.f47584;
        Executor executor = this.f6994;
        if (z && c14526.f47586 != null) {
            this.f6995 = true;
            executor.execute(new RunnableC19464(this, c14526));
            return;
        }
        if (z && c14526.f47586 == null) {
            c14526.f47584 = false;
            ArrayList arrayList = c14526.f47588;
            if (arrayList.isEmpty()) {
                list = Collections.EMPTY_LIST;
            } else {
                ArrayList arrayList2 = new ArrayList(arrayList);
                arrayList.clear();
                list = arrayList2;
            }
            if (!list.isEmpty()) {
                this.f6995 = true;
                executor.execute(new RunnableC10292(this, list));
                return;
            }
        }
        if (c14526.f47583) {
            final InterfaceC17347 interfaceC17347 = c14526.f47586;
            c14526.f47583 = false;
            if (interfaceC17347 != null && interfaceC17347.mo6594()) {
                this.f6995 = true;
                executor.execute(new Runnable() { // from class: l.ۡ۫۬
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1824.m5934(this.f30443, interfaceC17347, c14526);
                    }
                });
                return;
            }
        }
        C23698 c23698 = c14526.f47575;
        if (c23698 == null) {
            return;
        }
        c14526.f47575 = null;
        c14526.f47587 = c23698;
        this.f6995 = true;
        executor.execute(new RunnableC3091(this, c14526, c23698));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m5930(C1824 c1824, C14526 c14526) {
        c1824.m5942(c14526);
        c1824.m5927(c14526);
        c1824.m5939();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m5934(C1824 c1824, InterfaceC17347 interfaceC17347, C14526 c14526) {
        try {
            interfaceC17347.mo6593();
        } catch (Throwable unused) {
        }
        if (c1824.m5938(c14526)) {
            c1824.m5942(c14526);
            c1824.m5927(c14526);
        }
        c1824.m5939();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5932(final C1824 c1824, final C14526 c14526, final C23698 c23698) {
        Bitmap bitmapMo6591;
        try {
            InterfaceC17347 interfaceC17347M5928 = c1824.m5928(c14526);
            if (interfaceC17347M5928 != null) {
                bitmapMo6591 = interfaceC17347M5928.mo6591(c23698.f76676 * 1000, c23698.f76678, c23698.f76680, new InterfaceC0413() { // from class: l.۟۫۬
                    @Override // l.InterfaceC0413
                    /* JADX INFO: renamed from: ۙ */
                    public final void mo2170() {
                        C1824.m5941(this.f24875, c14526, c23698);
                    }
                });
                c1824.m5935(c14526, interfaceC17347M5928);
            } else {
                bitmapMo6591 = null;
            }
        } catch (Throwable unused) {
        }
        c1824.m5936(c14526, c23698, bitmapMo6591);
        synchronized (c1824.f6990) {
            c14526.f47587 = null;
        }
        if (c1824.m5938(c14526)) {
            c1824.m5942(c14526);
            c1824.m5927(c14526);
        }
        c1824.m5939();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private InterfaceC17347 m5928(C14526 c14526) {
        InterfaceC17347 interfaceC17347M16456;
        InterfaceC17347 interfaceC17347 = c14526.f47586;
        if (interfaceC17347 != null) {
            return interfaceC17347;
        }
        C0219 c0219 = this.f6993;
        Context context = this.f6991;
        C6265 c6265 = c14526.f47580;
        long j = c14526.f47581;
        c0219.getClass();
        if (c6265.m17342()) {
            int i = C2073.f7669;
            if (j > 0 && j <= 10000) {
                try {
                    interfaceC17347M16456 = new C10998(context, c6265, C2073.m6584(c6265, j));
                } catch (IOException | RuntimeException unused) {
                    interfaceC17347M16456 = C6058.m16456(context, c6265);
                }
            } else {
                interfaceC17347M16456 = C6058.m16456(context, c6265);
            }
        } else {
            interfaceC17347M16456 = C6058.m16456(context, c6265);
        }
        InterfaceC17347 interfaceC17348 = interfaceC17347M16456;
        synchronized (this.f6990) {
            if (!c14526.f47584 && this.f6992 == c14526) {
                c14526.f47586 = interfaceC17348;
                return interfaceC17348;
            }
            interfaceC17348.mo6592();
            return null;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m5941(C1824 c1824, C14526 c14526, C23698 c23698) {
        synchronized (c1824.f6990) {
            if (Thread.currentThread().isInterrupted() || c1824.f6992 != c14526 || c14526.f47584 || c14526.f47579 != c23698.f76677) {
                throw new InterruptedIOException("Video preview request was canceled");
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m5935(final C14526 c14526, InterfaceC17347 interfaceC17347) {
        C9587 c9587Mo6590;
        synchronized (this.f6990) {
            if (c14526.f47577) {
                return;
            }
            c14526.f47577 = true;
            try {
                c9587Mo6590 = interfaceC17347.mo6590();
            } catch (Throwable unused) {
                c9587Mo6590 = null;
            }
            final C9587 c9587 = c9587Mo6590;
            if (c9587 == null) {
                return;
            }
            synchronized (this.f6990) {
                if (this.f6992 == c14526 && !c14526.f47584) {
                    final int i = c14526.f47582;
                    final int i2 = c14526.f47579;
                    C16737.m39273(new Runnable() { // from class: l.᩷۫۬
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1824.m5931(this.f67810, c14526, i2, i, c9587);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m5931(C1824 c1824, C14526 c14526, int i, int i2, C9587 c9587) {
        synchronized (c1824.f6990) {
            if (c1824.f6992 == c14526 && c14526.f47579 == i && c14526.f47582 == i2 && !c14526.f47584) {
                c14526.f47578.mo12749(i2, c9587);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m5936(final C14526 c14526, final C23698 c23698, final Bitmap bitmap) {
        synchronized (this.f6990) {
            if (this.f6992 == c14526 && c14526.f47579 == c23698.f76677 && c14526.f47582 == c23698.f76679) {
                C16737.m39273(new Runnable() { // from class: l.ܺ۫۬
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1824.m5933(this.f51627, c14526, c23698, bitmap);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5933(C1824 c1824, C14526 c14526, C23698 c23698, Bitmap bitmap) {
        synchronized (c1824.f6990) {
            if (c1824.f6992 == c14526 && c14526.f47579 == c23698.f76677 && c14526.f47582 == c23698.f76679) {
                c14526.f47578.mo12748(c23698.f76679, bitmap);
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private boolean m5938(C14526 c14526) {
        boolean z;
        synchronized (this.f6990) {
            z = c14526.f47584;
        }
        return z;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m5942(C14526 c14526) {
        InterfaceC17347 interfaceC17347;
        synchronized (this.f6990) {
            interfaceC17347 = c14526.f47586;
            c14526.f47586 = null;
            c14526.f47584 = false;
            c14526.f47577 = false;
        }
        m5943(interfaceC17347);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m5927(C14526 c14526) {
        List list;
        synchronized (this.f6990) {
            ArrayList arrayList = c14526.f47588;
            if (arrayList.isEmpty()) {
                list = Collections.EMPTY_LIST;
            } else {
                ArrayList arrayList2 = new ArrayList(arrayList);
                arrayList.clear();
                list = arrayList2;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5929(C1824 c1824, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        c1824.m5939();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m5939() {
        synchronized (this.f6990) {
            this.f6995 = false;
            m5926();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m5943(InterfaceC17347 interfaceC17347) {
        if (interfaceC17347 != null) {
            interfaceC17347.mo6592();
        }
    }
}
