package l;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.᩻ܰۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: NAO7 */
/* JADX INFO: loaded from: classes.dex */
public final class C23739 implements InterfaceC14567 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final ReentrantLock f76803 = new ReentrantLock();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static volatile C23739 f76804;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC3007 f76805;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f76806 = new CopyOnWriteArrayList();

    @Override // l.InterfaceC14567
    /* JADX INFO: renamed from: ۙ */
    public final void mo33698(InterfaceC17295 interfaceC17295) {
        C13465.m32966(interfaceC17295, "callback");
        synchronized (f76803) {
            if (this.f76805 == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (C11039 c11039 : this.f76806) {
                if (c11039.m27835() == interfaceC17295) {
                    arrayList.add(c11039);
                }
            }
            this.f76806.removeAll(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Activity activityM27832 = ((C11039) it.next()).m27832();
                CopyOnWriteArrayList copyOnWriteArrayList = this.f76806;
                if (!(copyOnWriteArrayList != null) || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (C13465.m32965(((C11039) it2.next()).m27832(), activityM27832)) {
                            }
                        }
                    }
                }
                InterfaceC3007 interfaceC3007 = this.f76805;
                if (interfaceC3007 != null) {
                    interfaceC3007.mo8972(activityM27832);
                }
            }
            C7321 c7321 = C7321.f24318;
        }
    }

    public C23739(C17388 c17388) {
        this.f76805 = c17388;
        if (c17388 == null) {
            return;
        }
        c17388.m40507(new C6099(this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList m52270() {
        return this.f76806;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004e A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:3:0x0005, B:5:0x0009, B:13:0x0021, B:23:0x0044, B:25:0x004e, B:39:0x007e, B:26:0x0052, B:27:0x0056, B:29:0x005d, B:33:0x0070, B:38:0x007b, B:36:0x0075, B:16:0x0028, B:17:0x002c, B:19:0x0032), top: B:45:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052 A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:3:0x0005, B:5:0x0009, B:13:0x0021, B:23:0x0044, B:25:0x004e, B:39:0x007e, B:26:0x0052, B:27:0x0056, B:29:0x005d, B:33:0x0070, B:38:0x007b, B:36:0x0075, B:16:0x0028, B:17:0x002c, B:19:0x0032), top: B:45:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x005d A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:3:0x0005, B:5:0x0009, B:13:0x0021, B:23:0x0044, B:25:0x004e, B:39:0x007e, B:26:0x0052, B:27:0x0056, B:29:0x005d, B:33:0x0070, B:38:0x007b, B:36:0x0075, B:16:0x0028, B:17:0x002c, B:19:0x0032), top: B:45:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0074  */
    /* JADX WARN: Code duplicated, block: B:36:0x0075 A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:3:0x0005, B:5:0x0009, B:13:0x0021, B:23:0x0044, B:25:0x004e, B:39:0x007e, B:26:0x0052, B:27:0x0056, B:29:0x005d, B:33:0x0070, B:38:0x007b, B:36:0x0075, B:16:0x0028, B:17:0x002c, B:19:0x0032), top: B:45:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x007b A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:3:0x0005, B:5:0x0009, B:13:0x0021, B:23:0x0044, B:25:0x004e, B:39:0x007e, B:26:0x0052, B:27:0x0056, B:29:0x005d, B:33:0x0070, B:38:0x007b, B:36:0x0075, B:16:0x0028, B:17:0x002c, B:19:0x0032), top: B:45:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x006f A[SYNTHETIC] */
    @Override // l.InterfaceC14567
    /* JADX INFO: renamed from: ۙ */
    public final void mo33697(Activity activity, ExecutorC2053 executorC2053, C13799 c13799) {
        C11039 c11039;
        Iterator it;
        C5331 c5331M27834;
        Object next;
        C11039 c110310;
        ReentrantLock reentrantLock = f76803;
        reentrantLock.lock();
        try {
            InterfaceC3007 interfaceC3007 = this.f76805;
            if (interfaceC3007 == null) {
                c13799.accept(new C5331(C23238.f75405));
                reentrantLock.unlock();
                return;
            }
            boolean z = true;
            CopyOnWriteArrayList copyOnWriteArrayList = this.f76806;
            if (!(copyOnWriteArrayList != null) || !copyOnWriteArrayList.isEmpty()) {
                Iterator it2 = copyOnWriteArrayList.iterator();
                do {
                    if (it2.hasNext()) {
                    }
                } while (!C13465.m32965(((C11039) it2.next()).m27832(), activity));
                c11039 = new C11039(activity, executorC2053, c13799);
                copyOnWriteArrayList.add(c11039);
                if (!z) {
                    interfaceC3007.mo8971(activity);
                } else {
                    it = copyOnWriteArrayList.iterator();
                    do {
                        c5331M27834 = null;
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!activity.equals(((C11039) next).m27832()));
                    c110310 = (C11039) next;
                    if (c110310 == null) {
                        c5331M27834 = c110310.m27834();
                    }
                    if (c5331M27834 != null) {
                        c11039.m27833(c5331M27834);
                    }
                }
                C7321 c7321 = C7321.f24318;
                reentrantLock.unlock();
            }
            z = false;
            c11039 = new C11039(activity, executorC2053, c13799);
            copyOnWriteArrayList.add(c11039);
            if (!z) {
                interfaceC3007.mo8971(activity);
            } else {
                it = copyOnWriteArrayList.iterator();
                do {
                    c5331M27834 = null;
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!activity.equals(((C11039) next).m27832()));
                c110310 = (C11039) next;
                if (c110310 == null) {
                    c5331M27834 = c110310.m27834();
                }
                if (c5331M27834 != null) {
                    c11039.m27833(c5331M27834);
                }
            }
            C7321 c7322 = C7321.f24318;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
