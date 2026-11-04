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

/* JADX INFO: renamed from: l.֫᩵۫, reason: contains not printable characters */
/* JADX INFO: compiled from: BAIG */
/* JADX INFO: loaded from: classes2.dex */
public final class C2143 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f7076;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7509 f7077;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ArrayList f7079;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC18881 f7081;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f7078 = new AtomicInteger();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f7086 = new AtomicInteger();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f7083 = new AtomicInteger();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f7082 = new AtomicInteger();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final LinkedBlockingQueue f7084 = new LinkedBlockingQueue(OpenAuthTask.Duplex);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public volatile boolean f7085 = true;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f7080 = true;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f7087 = true;

    public C2143(AbstractC18881 abstractC18881, InterfaceC7509 interfaceC7509) {
        this.f7081 = abstractC18881;
        this.f7077 = interfaceC7509;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7403() {
        this.f7076 = this.f7087;
        this.f7079 = new ArrayList();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7405(boolean z) {
        this.f7080 = z;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m7407(boolean z) {
        this.f7087 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7406(String[] strArr, C2011 c2011) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            InterfaceC2386 interfaceC2386Mo20831 = this.f7081.mo20831(str);
            if (interfaceC2386Mo20831 != null) {
                arrayList.add(interfaceC2386Mo20831);
            }
        }
        m7404(arrayList, c2011);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7404(List list, InterfaceC13329 interfaceC13329) {
        this.f7085 = true;
        RunnableC15566 runnableC15566 = new RunnableC15566(0, this, interfaceC13329);
        int iM43792 = this.f7081.m43792();
        ArrayList arrayList = new ArrayList(iM43792);
        for (int i = 0; i < iM43792; i++) {
            arrayList.add(C5261.f18538.submit(runnableC15566));
        }
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m7401((InterfaceC2386) it.next(), "");
                if (this.f7077.mo924()) {
                    this.f7085 = false;
                    return;
                }
            }
            if (this.f7076) {
                C14307 c14307 = new C14307();
                for (C5872 c5872 : this.f7079) {
                    ((List) C11392.computeIfAbsent(c14307, Integer.valueOf(C24276.m54279(c5872.f20146, '/')), new C15431(3))).add(c5872);
                }
                ArrayList arrayList2 = new ArrayList(c14307.keySet());
                Collections.sort(arrayList2);
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    while (true) {
                        if (this.f7084.isEmpty() && this.f7083.get() == this.f7082.get()) {
                            break;
                        }
                        if (this.f7077.mo924()) {
                            this.f7085 = false;
                            return;
                        }
                        Thread.sleep(10L);
                    }
                    Iterator it2 = ((List) c14307.get(arrayList2.get(size))).iterator();
                    while (it2.hasNext()) {
                        this.f7084.put((C5872) it2.next());
                    }
                }
            }
            this.f7085 = false;
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                try {
                    ((Future) it3.next()).get();
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th) {
            this.f7085 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m7400(C2143 c2143, InterfaceC13329 interfaceC13329) {
        AtomicInteger atomicInteger = c2143.f7082;
        atomicInteger.incrementAndGet();
        while (true) {
            try {
                C5872 c5872M7402 = c2143.m7402();
                if (c5872M7402 == null) {
                    break;
                } else {
                    interfaceC13329.mo6894(c5872M7402, c2143.f7086.incrementAndGet(), c2143.f7078.get());
                }
            } catch (Throwable th) {
                atomicInteger.decrementAndGet();
                throw th;
            }
        }
        if (c2143.f7077.mo924()) {
            c2143.f7084.clear();
        }
        atomicInteger.decrementAndGet();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C5872 m7402() {
        this.f7083.incrementAndGet();
        while (!this.f7077.mo924()) {
            try {
                try {
                    C5872 c5872 = (C5872) this.f7084.poll(200L, TimeUnit.MILLISECONDS);
                    if (c5872 == null) {
                        if (!this.f7085) {
                            break;
                        }
                    } else {
                        this.f7083.decrementAndGet();
                        return c5872;
                    }
                } catch (InterruptedException unused) {
                }
            } catch (Throwable th) {
                this.f7083.decrementAndGet();
                throw th;
            }
        }
        this.f7083.decrementAndGet();
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m7401(InterfaceC2386 interfaceC2386, String str) throws InterruptedException {
        InterfaceC7509 interfaceC7509 = this.f7077;
        if (interfaceC7509.mo924()) {
            return;
        }
        String name = interfaceC2386.getName();
        String path = interfaceC2386.getPath();
        if (!str.isEmpty()) {
            name = C20196.m46451(str, "/", name);
        }
        boolean zIsDirectory = interfaceC2386.isDirectory();
        LinkedBlockingQueue linkedBlockingQueue = this.f7084;
        AtomicInteger atomicInteger = this.f7078;
        if (!zIsDirectory) {
            if (this.f7080 || str.isEmpty()) {
                atomicInteger.incrementAndGet();
                linkedBlockingQueue.put(new C5872(path, name, true));
                return;
            }
            return;
        }
        if ((this.f7080 || this.f7087) && !interfaceC2386.mo8107()) {
            Iterator it = this.f7081.mo20830(path, true).iterator();
            while (it.hasNext()) {
                m7401((InterfaceC2386) it.next(), name);
            }
            if (interfaceC7509.mo924()) {
                return;
            }
        }
        if (this.f7087 || str.isEmpty()) {
            atomicInteger.incrementAndGet();
            if (this.f7076) {
                this.f7079.add(new C5872(path, name, false));
            } else {
                linkedBlockingQueue.put(new C5872(path, name, false));
            }
        }
    }
}
