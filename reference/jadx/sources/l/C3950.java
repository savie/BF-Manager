package l;

import com.alipay.sdk.app.OpenAuthTask;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۘ۬֨, reason: contains not printable characters */
/* JADX INFO: compiled from: BAIG */
/* JADX INFO: loaded from: classes2.dex */
public final class C3950 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AbstractC12233 f14681;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f14683;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5614 f14684;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ArrayList f14687;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f14688 = new AtomicInteger();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f14682 = new AtomicInteger();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f14690 = new AtomicInteger();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f14691 = new AtomicInteger();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final LinkedBlockingQueue f14685 = new LinkedBlockingQueue(OpenAuthTask.Duplex);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile boolean f14689 = true;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f14686 = true;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f14692 = true;

    public C3950(AbstractC12233 abstractC12233, InterfaceC5614 interfaceC5614) {
        this.f14681 = abstractC12233;
        this.f14684 = interfaceC5614;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11437() {
        this.f14683 = this.f14692;
        this.f14687 = new ArrayList();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11439(boolean z) {
        this.f14686 = z;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m11441(boolean z) {
        this.f14692 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11440(String[] strArr, C18541 c18541) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            InterfaceC2557 interfaceC2557Mo10264 = this.f14681.mo10264(str);
            if (interfaceC2557Mo10264 != null) {
                arrayList.add(interfaceC2557Mo10264);
            }
        }
        m11438(arrayList, c18541);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11438(List list, InterfaceC1128 interfaceC1128) {
        this.f14689 = true;
        RunnableC22296 runnableC22296 = new RunnableC22296(0, this, interfaceC1128);
        int iM30349 = this.f14681.m30349();
        ArrayList arrayList = new ArrayList(iM30349);
        for (int i = 0; i < iM30349; i++) {
            arrayList.add(C4716.f16635.submit(runnableC22296));
        }
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m11434((InterfaceC2557) it.next(), "");
                if (this.f14684.mo2357()) {
                    this.f14689 = false;
                    return;
                }
            }
            if (this.f14683) {
                C21445 c21445 = new C21445();
                for (C13124 c13124 : this.f14687) {
                    ((List) C9735.computeIfAbsent(c21445, Integer.valueOf(C6851.m18452(c13124.f43706, '/')), new C10968(3))).add(c13124);
                }
                ArrayList arrayList2 = new ArrayList(c21445.keySet());
                Collections.sort(arrayList2);
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    while (true) {
                        if (this.f14685.isEmpty() && this.f14690.get() == this.f14691.get()) {
                            break;
                        }
                        if (this.f14684.mo2357()) {
                            this.f14689 = false;
                            return;
                        }
                        Thread.sleep(10L);
                    }
                    Iterator it2 = ((List) c21445.getOrDefault(arrayList2.get(size), null)).iterator();
                    while (it2.hasNext()) {
                        this.f14685.put((C13124) it2.next());
                    }
                }
            }
            this.f14689 = false;
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                try {
                    ((Future) it3.next()).get();
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th) {
            this.f14689 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m11435(C3950 c3950, InterfaceC1128 interfaceC1128) {
        AtomicInteger atomicInteger = c3950.f14691;
        atomicInteger.incrementAndGet();
        while (true) {
            try {
                C13124 c13124M11436 = c3950.m11436();
                if (c13124M11436 == null) {
                    break;
                } else {
                    interfaceC1128.mo2212(c13124M11436, c3950.f14682.incrementAndGet(), c3950.f14688.get());
                }
            } catch (Throwable th) {
                atomicInteger.decrementAndGet();
                throw th;
            }
        }
        if (c3950.f14684.mo2357()) {
            c3950.f14685.clear();
        }
        atomicInteger.decrementAndGet();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C13124 m11436() {
        this.f14690.incrementAndGet();
        while (!this.f14684.mo2357()) {
            try {
                try {
                    C13124 c13124 = (C13124) this.f14685.poll(200L, TimeUnit.MILLISECONDS);
                    if (c13124 == null) {
                        if (!this.f14689) {
                            break;
                        }
                    } else {
                        this.f14690.decrementAndGet();
                        return c13124;
                    }
                } catch (InterruptedException unused) {
                }
            } catch (Throwable th) {
                this.f14690.decrementAndGet();
                throw th;
            }
        }
        this.f14690.decrementAndGet();
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m11434(InterfaceC2557 interfaceC2557, String str) throws InterruptedException {
        InterfaceC5614 interfaceC5614 = this.f14684;
        if (interfaceC5614.mo2357()) {
            return;
        }
        String name = interfaceC2557.getName();
        String path = interfaceC2557.getPath();
        if (!str.isEmpty()) {
            name = C1679.m5594(str, "/", name);
        }
        boolean zIsDirectory = interfaceC2557.isDirectory();
        LinkedBlockingQueue linkedBlockingQueue = this.f14685;
        AtomicInteger atomicInteger = this.f14688;
        if (!zIsDirectory) {
            if (this.f14686 || str.isEmpty()) {
                atomicInteger.incrementAndGet();
                linkedBlockingQueue.put(new C13124(path, name, true));
                return;
            }
            return;
        }
        if ((this.f14686 || this.f14692) && !interfaceC2557.mo7986()) {
            Iterator it = this.f14681.mo10263(path, true).iterator();
            while (it.hasNext()) {
                m11434((InterfaceC2557) it.next(), name);
            }
            if (interfaceC5614.mo2357()) {
                return;
            }
        }
        if (this.f14692 || str.isEmpty()) {
            atomicInteger.incrementAndGet();
            if (this.f14683) {
                this.f14687.add(new C13124(path, name, false));
            } else {
                linkedBlockingQueue.put(new C13124(path, name, false));
            }
        }
    }
}
