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

/* JADX INFO: renamed from: l.ܳᩴ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: M799 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Context f50540;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C13921 f50541;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f50542;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C20011 f50543;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Executor f50544;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object f50545;

    public C15535(Context context) {
        ExecutorService executorService = C5261.f18540;
        C13921 c13921 = new C13921(1);
        this.f50545 = new Object();
        this.f50540 = context.getApplicationContext();
        this.f50544 = executorService;
        this.f50541 = c13921;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37218(InterfaceC2386 interfaceC2386, C6044 c6044, long j, int i, InterfaceC2945 interfaceC2945) {
        String strM17550 = c6044.m17550();
        synchronized (this.f50545) {
            C20011 c20011 = this.f50543;
            if (c20011 != null && c20011.f64297 == i) {
                InterfaceC2386 interfaceC2387 = c20011.f64307;
                String path = null;
                String path2 = interfaceC2387 == null ? null : interfaceC2387.getPath();
                if (interfaceC2386 != null) {
                    path = interfaceC2386.getPath();
                }
                if (C17359.equals(path2, path) && C17359.equals(this.f50543.f64302, strM17550)) {
                    C20011 c20012 = this.f50543;
                    c20012.f64307 = interfaceC2386;
                    c20012.f64299 = c6044;
                    c20012.f64302 = strM17550;
                    c20012.f64298 = j;
                    c20012.f64296 = interfaceC2945;
                    if (c20012.f64304 == null && !this.f50542) {
                        c20012.f64303 = false;
                    }
                    return;
                }
            }
            C20011 c20013 = this.f50543;
            m37208(c20013);
            this.f50543 = new C20011(interfaceC2386, c6044, strM17550, j, i, interfaceC2945);
            if (!this.f50542 && c20013 != null && c20013.f64304 != null) {
                this.f50542 = true;
                this.f50544.execute(new RunnableC18607(this, c20013));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37216(int i, int i2, long j) {
        synchronized (this.f50545) {
            C20011 c20011 = this.f50543;
            if (c20011 == null) {
                return;
            }
            int iMax = Math.max(1, i);
            int iMax2 = Math.max(1, i2);
            int i3 = c20011.f64297;
            int i4 = c20011.f64305;
            long j2 = c20011.f64298;
            long jMax = Math.max(1L, 1000L);
            if (j2 <= 0) {
                j2 = C25227.FOREVER_NS;
            }
            C22995 c22995 = new C22995(i3, i4, iMax, iMax2, (Math.max(0L, Math.min(j, j2)) / jMax) * jMax);
            if (c22995.equals(c20011.f64301)) {
                return;
            }
            c20011.f64300 = c22995;
            if (!this.f50542) {
                m37213();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37215() {
        synchronized (this.f50545) {
            C20011 c20011 = this.f50543;
            if (c20011 != null) {
                c20011.f64305++;
                c20011.f64300 = null;
                c20011.f64306 = true;
                if (!this.f50542) {
                    m37213();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m37219() {
        synchronized (this.f50545) {
            C20011 c20011 = this.f50543;
            if (c20011 != null && !c20011.f64303) {
                if (c20011.f64304 != null || this.f50542) {
                    m37208(c20011);
                    if (!this.f50542) {
                        m37213();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37217(Runnable runnable) {
        synchronized (this.f50545) {
            C20011 c20011 = this.f50543;
            if (c20011 != null) {
                m37208(c20011);
                c20011.f64308.add(runnable);
                if (!this.f50542) {
                    m37213();
                }
                return;
            }
            Object[] objArr = {runnable};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            C17359.requireNonNull(obj);
            arrayList.add(obj);
            List listUnmodifiableList = C4681.unmodifiableList(arrayList);
            this.f50542 = true;
            this.f50544.execute(new RunnableC19353(this, listUnmodifiableList));
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m37208(C20011 c20011) {
        if (c20011 == null) {
            return;
        }
        c20011.f64305++;
        c20011.f64300 = null;
        c20011.f64306 = false;
        c20011.f64303 = true;
        c20011.f64295 = false;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m37213() {
        List list;
        final C20011 c20011 = this.f50543;
        if (c20011 == null) {
            return;
        }
        boolean z = c20011.f64303;
        Executor executor = this.f50544;
        if (z && c20011.f64304 != null) {
            this.f50542 = true;
            executor.execute(new RunnableC18607(this, c20011));
            return;
        }
        if (z && c20011.f64304 == null) {
            c20011.f64303 = false;
            ArrayList arrayList = c20011.f64308;
            if (arrayList.isEmpty()) {
                list = Collections.EMPTY_LIST;
            } else {
                ArrayList arrayList2 = new ArrayList(arrayList);
                arrayList.clear();
                list = arrayList2;
            }
            if (!list.isEmpty()) {
                this.f50542 = true;
                executor.execute(new RunnableC19353(this, list));
                return;
            }
        }
        if (c20011.f64306) {
            final InterfaceC5095 interfaceC5095 = c20011.f64304;
            c20011.f64306 = false;
            if (interfaceC5095 != null && interfaceC5095.mo15406()) {
                this.f50542 = true;
                executor.execute(new Runnable() { // from class: l.۟᩸֫
                    @Override // java.lang.Runnable
                    public final void run() {
                        C15535.m37200(this.f26935, interfaceC5095, c20011);
                    }
                });
                return;
            }
        }
        final C22995 c22995 = c20011.f64300;
        if (c22995 == null) {
            return;
        }
        c20011.f64300 = null;
        c20011.f64301 = c22995;
        this.f50542 = true;
        executor.execute(new Runnable() { // from class: l.֡᩸֫
            @Override // java.lang.Runnable
            public final void run() {
                C15535.m37203(this.f2623, c20011, c22995);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37201(C15535 c15535, C20011 c20011) {
        c15535.m37212(c20011);
        c15535.m37214(c20011);
        c15535.m37207();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37200(C15535 c15535, InterfaceC5095 interfaceC5095, C20011 c20011) {
        try {
            interfaceC5095.mo15405();
        } catch (Throwable unused) {
        }
        if (c15535.m37209(c20011)) {
            c15535.m37212(c20011);
            c15535.m37214(c20011);
        }
        c15535.m37207();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37203(final C15535 c15535, final C20011 c20011, final C22995 c22995) {
        Bitmap bitmapMo15403;
        try {
            InterfaceC5095 interfaceC5095M37197 = c15535.m37197(c20011);
            if (interfaceC5095M37197 != null) {
                bitmapMo15403 = interfaceC5095M37197.mo15403(c22995.f74652 * 1000, c22995.f74650, c22995.f74651, new InterfaceC8911() { // from class: l.ۢ᩸֫
                    @Override // l.InterfaceC8911
                    /* JADX INFO: renamed from: ۙ */
                    public final void mo23824() {
                        C15535.m37211(this.f33086, c20011, c22995);
                    }
                });
                c15535.m37205(c20011, interfaceC5095M37197);
            } else {
                bitmapMo15403 = null;
            }
        } catch (Throwable unused) {
        }
        c15535.m37206(c20011, c22995, bitmapMo15403);
        synchronized (c15535.f50545) {
            c20011.f64301 = null;
        }
        if (c15535.m37209(c20011)) {
            c15535.m37212(c20011);
            c15535.m37214(c20011);
        }
        c15535.m37207();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private InterfaceC5095 m37197(C20011 c20011) {
        InterfaceC5095 interfaceC5095M50304;
        InterfaceC5095 interfaceC5095 = c20011.f64304;
        if (interfaceC5095 != null) {
            return interfaceC5095;
        }
        C13921 c13921 = this.f50541;
        Context context = this.f50540;
        C6044 c6044 = c20011.f64299;
        long j = c20011.f64298;
        c13921.getClass();
        if (c6044.m17549()) {
            int i = C22823.f73956;
            if (j > 0 && j <= 10000) {
                try {
                    interfaceC5095M50304 = new C11060(context, c6044, C22823.m51454(c6044, j));
                } catch (IOException | RuntimeException unused) {
                    interfaceC5095M50304 = C22249.m50304(context, c6044);
                }
            } else {
                interfaceC5095M50304 = C22249.m50304(context, c6044);
            }
        } else {
            interfaceC5095M50304 = C22249.m50304(context, c6044);
        }
        InterfaceC5095 interfaceC5096 = interfaceC5095M50304;
        synchronized (this.f50545) {
            if (!c20011.f64303 && this.f50543 == c20011) {
                c20011.f64304 = interfaceC5096;
                return interfaceC5096;
            }
            interfaceC5096.mo15404();
            return null;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m37211(C15535 c15535, C20011 c20011, C22995 c22995) {
        synchronized (c15535.f50545) {
            if (Thread.currentThread().isInterrupted() || c15535.f50543 != c20011 || c20011.f64303 || c20011.f64305 != c22995.f74648) {
                throw new InterruptedIOException("Video preview request was canceled");
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37205(final C20011 c20011, InterfaceC5095 interfaceC5095) {
        C13298 c13298Mo15407;
        synchronized (this.f50545) {
            if (c20011.f64295) {
                return;
            }
            c20011.f64295 = true;
            try {
                c13298Mo15407 = interfaceC5095.mo15407();
            } catch (Throwable unused) {
                c13298Mo15407 = null;
            }
            final C13298 c13298 = c13298Mo15407;
            if (c13298 == null) {
                return;
            }
            synchronized (this.f50545) {
                if (this.f50543 == c20011 && !c20011.f64303) {
                    final int i = c20011.f64297;
                    final int i2 = c20011.f64305;
                    C21576.m49068(new Runnable() { // from class: l.֨᩸֫
                        @Override // java.lang.Runnable
                        public final void run() {
                            C15535.m37202(this.f5088, c20011, i2, i, c13298);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37202(C15535 c15535, C20011 c20011, int i, int i2, C13298 c13298) {
        synchronized (c15535.f50545) {
            if (c15535.f50543 == c20011 && c20011.f64305 == i && c20011.f64297 == i2 && !c20011.f64303) {
                c20011.f64296.mo9642(i2, c13298);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37206(final C20011 c20011, final C22995 c22995, final Bitmap bitmap) {
        synchronized (this.f50545) {
            if (this.f50543 == c20011 && c20011.f64305 == c22995.f74648 && c20011.f64297 == c22995.f74649) {
                C21576.m49068(new Runnable() { // from class: l.ۡ᩸֫
                    @Override // java.lang.Runnable
                    public final void run() {
                        C15535.m37204(this.f31195, c20011, c22995, bitmap);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37204(C15535 c15535, C20011 c20011, C22995 c22995, Bitmap bitmap) {
        synchronized (c15535.f50545) {
            if (c15535.f50543 == c20011 && c20011.f64305 == c22995.f74648 && c20011.f64297 == c22995.f74649) {
                c20011.f64296.mo9641(c22995.f74649, bitmap);
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private boolean m37209(C20011 c20011) {
        boolean z;
        synchronized (this.f50545) {
            z = c20011.f64303;
        }
        return z;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m37212(C20011 c20011) {
        InterfaceC5095 interfaceC5095;
        synchronized (this.f50545) {
            interfaceC5095 = c20011.f64304;
            c20011.f64304 = null;
            c20011.f64303 = false;
            c20011.f64295 = false;
        }
        m37210(interfaceC5095);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m37214(C20011 c20011) {
        List list;
        synchronized (this.f50545) {
            ArrayList arrayList = c20011.f64308;
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
    public static void m37199(C15535 c15535, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        c15535.m37207();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m37207() {
        synchronized (this.f50545) {
            this.f50542 = false;
            m37213();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m37210(InterfaceC5095 interfaceC5095) {
        if (interfaceC5095 != null) {
            interfaceC5095.mo15404();
        }
    }
}
