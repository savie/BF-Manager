package l;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.۬ۤ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 713E */
/* JADX INFO: loaded from: classes4.dex */
public final class C13789 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f43743 = new AtomicLong(0);

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f43744 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f43742 = new AtomicLong(0);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f43745 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f43741 = new ArrayList();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f43746 = new AtomicInteger();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33696(String[] strArr, final boolean z, final InterfaceC8569 interfaceC8569) {
        AtomicInteger atomicInteger = this.f43746;
        if (atomicInteger.get() != 0) {
            throw new RuntimeException();
        }
        ExecutorService executorServiceNewSingleThreadExecutor = null;
        for (String str : strArr) {
            if (interfaceC8569.mo924()) {
                break;
            }
            AbstractC22044 abstractC22044M35193 = C14584.m35193(str, new String[0]);
            final C7078 c7078 = new C7078(abstractC22044M35193, abstractC22044M35193.getName());
            if (z) {
                c7078.m19414();
            }
            m33695(c7078);
            if (c7078.f23331 && !c7078.f23329) {
                atomicInteger.incrementAndGet();
                if (executorServiceNewSingleThreadExecutor == null) {
                    executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                }
                final ExecutorService executorService = executorServiceNewSingleThreadExecutor;
                executorService.submit(new Runnable() { // from class: l.ۡۤ۫
                    @Override // java.lang.Runnable
                    public final void run() {
                        ExecutorService executorService2 = executorService;
                        InterfaceC8569 interfaceC85610 = interfaceC8569;
                        C13789 c13789 = this.f30260;
                        C7078 c7079 = c7078;
                        c13789.m33691(c7079.f23323, C8947.m23910(new StringBuilder(), c7079.f23324, "/"), z, executorService2, interfaceC85610);
                    }
                });
                executorServiceNewSingleThreadExecutor = executorService;
            }
        }
        while (atomicInteger.get() != 0) {
            SystemClock.sleep(1L);
        }
        if (executorServiceNewSingleThreadExecutor != null) {
            C5261.m15837(executorServiceNewSingleThreadExecutor);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m33691(AbstractC22044 abstractC22044, String str, final boolean z, final ExecutorService executorService, final InterfaceC8569 interfaceC8569) {
        boolean zMo924 = interfaceC8569.mo924();
        AtomicInteger atomicInteger = this.f43746;
        if (zMo924) {
            atomicInteger.decrementAndGet();
            return;
        }
        for (AbstractC22044 abstractC22045 : abstractC22044.mo4299(true)) {
            if (interfaceC8569.mo924()) {
                atomicInteger.decrementAndGet();
                return;
            }
            StringBuilder sbM27333 = C10732.m27333(str);
            sbM27333.append(abstractC22045.getName());
            final C7078 c7078 = new C7078(abstractC22045, sbM27333.toString());
            if (z) {
                c7078.m19414();
            }
            m33695(c7078);
            if (c7078.f23331 && !c7078.f23329) {
                atomicInteger.incrementAndGet();
                executorService.submit(new Runnable() { // from class: l.ۖۤ۫
                    @Override // java.lang.Runnable
                    public final void run() {
                        ExecutorService executorService2 = executorService;
                        InterfaceC8569 interfaceC85610 = interfaceC8569;
                        C13789 c13789 = this.f8365;
                        C7078 c7079 = c7078;
                        c13789.m33691(c7079.f23323, C8947.m23910(new StringBuilder(), c7079.f23324, "/"), z, executorService2, interfaceC85610);
                    }
                });
            }
        }
        atomicInteger.decrementAndGet();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33695(C7078 c7078) {
        synchronized (this.f43741) {
            this.f43741.add(c7078);
        }
        if (!c7078.f23331) {
            this.f43743.addAndGet(c7078.f23322);
        }
        this.f43744.incrementAndGet();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long m33700() {
        return this.f43743.get();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m33699() {
        return this.f43742.get();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m33697() {
        return this.f43744.get();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m33693() {
        return this.f43745.get();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33694(long j) {
        this.f43742.addAndGet(j);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m33698() {
        this.f43745.incrementAndGet();
    }
}
