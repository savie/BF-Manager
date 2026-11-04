package l;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.֡᩷ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: NAO7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0692 implements InterfaceC8150 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static volatile C0692 f2595;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final ReentrantLock f2596 = new ReentrantLock();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC0935 f2597;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f2598 = new CopyOnWriteArrayList();

    @Override // l.InterfaceC8150
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2995(InterfaceC0818 interfaceC0818) {
        C15243.m36590(interfaceC0818, "callback");
        synchronized (f2596) {
            if (this.f2597 == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (C18591 c18591 : this.f2598) {
                if (c18591.m43171() == interfaceC0818) {
                    arrayList.add(c18591);
                }
            }
            this.f2598.removeAll(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Activity activityM43168 = ((C18591) it.next()).m43168();
                CopyOnWriteArrayList copyOnWriteArrayList = this.f2598;
                if (!(copyOnWriteArrayList != null) || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (C15243.m36589(((C18591) it2.next()).m43168(), activityM43168)) {
                            }
                        }
                    }
                }
                InterfaceC0935 interfaceC0935 = this.f2597;
                if (interfaceC0935 != null) {
                    interfaceC0935.mo3738(activityM43168);
                }
            }
            C11471 c11471 = C11471.f36082;
        }
    }

    public C0692(C14861 c14861) {
        this.f2597 = c14861;
        if (c14861 == null) {
            return;
        }
        c14861.m35800(new C21575(this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList m2993() {
        return this.f2598;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004e A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:3:0x0005, B:5:0x0009, B:13:0x0021, B:23:0x0044, B:25:0x004e, B:39:0x007e, B:26:0x0052, B:27:0x0056, B:29:0x005d, B:33:0x0070, B:38:0x007b, B:36:0x0075, B:16:0x0028, B:17:0x002c, B:19:0x0032), top: B:45:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052 A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:3:0x0005, B:5:0x0009, B:13:0x0021, B:23:0x0044, B:25:0x004e, B:39:0x007e, B:26:0x0052, B:27:0x0056, B:29:0x005d, B:33:0x0070, B:38:0x007b, B:36:0x0075, B:16:0x0028, B:17:0x002c, B:19:0x0032), top: B:45:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x005d A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:3:0x0005, B:5:0x0009, B:13:0x0021, B:23:0x0044, B:25:0x004e, B:39:0x007e, B:26:0x0052, B:27:0x0056, B:29:0x005d, B:33:0x0070, B:38:0x007b, B:36:0x0075, B:16:0x0028, B:17:0x002c, B:19:0x0032), top: B:45:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0074  */
    /* JADX WARN: Code duplicated, block: B:36:0x0075 A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:3:0x0005, B:5:0x0009, B:13:0x0021, B:23:0x0044, B:25:0x004e, B:39:0x007e, B:26:0x0052, B:27:0x0056, B:29:0x005d, B:33:0x0070, B:38:0x007b, B:36:0x0075, B:16:0x0028, B:17:0x002c, B:19:0x0032), top: B:45:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x007b A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:3:0x0005, B:5:0x0009, B:13:0x0021, B:23:0x0044, B:25:0x004e, B:39:0x007e, B:26:0x0052, B:27:0x0056, B:29:0x005d, B:33:0x0070, B:38:0x007b, B:36:0x0075, B:16:0x0028, B:17:0x002c, B:19:0x0032), top: B:45:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x006f A[SYNTHETIC] */
    @Override // l.InterfaceC8150
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2994(Activity activity, ExecutorC20817 executorC20817, C2929 c2929) {
        C18591 c18591;
        Iterator it;
        C14115 c14115M43170;
        Object next;
        C18591 c18592;
        ReentrantLock reentrantLock = f2596;
        reentrantLock.lock();
        try {
            InterfaceC0935 interfaceC0935 = this.f2597;
            if (interfaceC0935 == null) {
                c2929.accept(new C14115(C22242.f71645));
                reentrantLock.unlock();
                return;
            }
            boolean z = true;
            CopyOnWriteArrayList copyOnWriteArrayList = this.f2598;
            if (!(copyOnWriteArrayList != null) || !copyOnWriteArrayList.isEmpty()) {
                Iterator it2 = copyOnWriteArrayList.iterator();
                do {
                    if (it2.hasNext()) {
                    }
                } while (!C15243.m36589(((C18591) it2.next()).m43168(), activity));
                c18591 = new C18591(activity, executorC20817, c2929);
                copyOnWriteArrayList.add(c18591);
                if (!z) {
                    interfaceC0935.mo3737(activity);
                } else {
                    it = copyOnWriteArrayList.iterator();
                    do {
                        c14115M43170 = null;
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!activity.equals(((C18591) next).m43168()));
                    c18592 = (C18591) next;
                    if (c18592 == null) {
                        c14115M43170 = c18592.m43170();
                    }
                    if (c14115M43170 != null) {
                        c18591.m43169(c14115M43170);
                    }
                }
                C11471 c11471 = C11471.f36082;
                reentrantLock.unlock();
            }
            z = false;
            c18591 = new C18591(activity, executorC20817, c2929);
            copyOnWriteArrayList.add(c18591);
            if (!z) {
                interfaceC0935.mo3737(activity);
            } else {
                it = copyOnWriteArrayList.iterator();
                do {
                    c14115M43170 = null;
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!activity.equals(((C18591) next).m43168()));
                c18592 = (C18591) next;
                if (c18592 == null) {
                    c14115M43170 = c18592.m43170();
                }
                if (c14115M43170 != null) {
                    c18591.m43169(c14115M43170);
                }
            }
            C11471 c11472 = C11471.f36082;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
