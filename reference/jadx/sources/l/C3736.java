package l;

import com.tencent.mm.opensdk.modelmsg.WXNativeGamePageObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۘۚܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: V40L */
/* JADX INFO: loaded from: classes2.dex */
public final class C3736 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m10942(C2455 c2455) {
        ArrayList arrayList = new ArrayList();
        for (C12107 c12107 : c2455.m7466()) {
            String name = c12107.getName();
            if (name.endsWith(".class") && !name.equals("module-info.class")) {
                arrayList.add(new C5148(c12107.getName(), new C18246(c2455, c12107)));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10944(final ArrayList arrayList, final int i, final C16740 c16740, final InterfaceC23333 interfaceC23333) throws Exception {
        final C8516 c8516 = new C8516(arrayList.size());
        c8516.m22241(interfaceC23333);
        final AtomicInteger atomicInteger = new AtomicInteger();
        final AtomicReference atomicReference = new AtomicReference();
        Runnable runnable = new Runnable() { // from class: l.۬ۚܶ
            @Override // java.lang.Runnable
            public final void run() {
                int i2;
                byte[] bArrM7475;
                ArrayList arrayList2 = arrayList;
                AtomicInteger atomicInteger2 = atomicInteger;
                AtomicReference atomicReference2 = atomicReference;
                InterfaceC23333 interfaceC23334 = interfaceC23333;
                int i3 = i;
                C8516 c8517 = c8516;
                C16740 c16741 = c16740;
                C2907 c2907 = new C2907(new byte[WXNativeGamePageObject.LENGTH_LIMIT]);
                int size = arrayList2.size();
                while (true) {
                    try {
                        int andIncrement = atomicInteger2.getAndIncrement();
                        if (andIncrement < size && atomicReference2.get() == null && !interfaceC23334.mo2357()) {
                            C0914 c0914 = new C0914();
                            C15027 c15027 = new C15027();
                            c15027.f48995 = System.err;
                            c15027.f48994 = true;
                            c15027.f48993 = false;
                            c15027.f48997 = true;
                            C6559 c6559 = new C6559();
                            c6559.f22100 = true;
                            c6559.f22101 = i3;
                            C4669 c4669 = new C4669(c6559);
                            int i4 = 0;
                            while (i4 < 100) {
                                c8517.m22242(1);
                                if (i4 != 0) {
                                    int andIncrement2 = atomicInteger2.getAndIncrement();
                                    if (andIncrement2 >= size) {
                                        break;
                                    } else {
                                        andIncrement = andIncrement2;
                                    }
                                }
                                C5148 c5148 = (C5148) arrayList2.set(andIncrement, null);
                                ArrayList arrayList3 = arrayList2;
                                String str = c5148.f17882;
                                C18246 c18246 = c5148.f17881;
                                AtomicInteger atomicInteger3 = atomicInteger2;
                                C2455 c2455 = (C2455) c18246.f58233;
                                C12107 c12107 = (C12107) c18246.f58234;
                                synchronized (c2455) {
                                    i2 = i3;
                                    try {
                                        bArrM7475 = c2455.m7475(c12107, (C8516) null);
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                C19883 c19883 = new C19883(str, c15027.f48993, bArrM7475);
                                c19883.m45139();
                                c19883.m45130();
                                c4669.m12874(C21376.m47914(c0914, c19883, c15027, c6559, c4669));
                                if (atomicReference2.get() != null || interfaceC23334.mo2357()) {
                                    return;
                                }
                                i4++;
                                arrayList2 = arrayList3;
                                atomicInteger2 = atomicInteger3;
                                i3 = i2;
                            }
                            ArrayList arrayList4 = arrayList2;
                            AtomicInteger atomicInteger4 = atomicInteger2;
                            int i5 = i3;
                            C2718 c2718M12871 = c4669.m12871(c2907);
                            c16741.m39301(c2718M12871.m8296(), c2718M12871.m8290());
                            arrayList2 = arrayList4;
                            atomicInteger2 = atomicInteger4;
                            i3 = i5;
                        }
                        return;
                    } catch (Exception e) {
                        while (!atomicReference2.compareAndSet(null, e) && atomicReference2.get() == null) {
                        }
                        return;
                    }
                }
            }
        };
        int i2 = C5464.f18831;
        Thread[] threadArr = new Thread[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            Thread thread = new Thread(runnable);
            thread.start();
            threadArr[i3] = thread;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            threadArr[i4].join();
        }
        if (!interfaceC23333.mo2357() && atomicReference.get() != null) {
            throw ((Exception) atomicReference.get());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m10943(C2455 c2455, AbstractC20745 abstractC20745, AbstractC20745 abstractC20746, InterfaceC23333 interfaceC23333) throws Throwable {
        C22918 c22918;
        C2455 c2456 = c2455;
        AbstractC20745 abstractC20747 = abstractC20745;
        C5122 c5122 = new C5122();
        C2299 c2299 = new C2299();
        List listM7472 = c2456.m7472(false);
        C8516 c8516 = new C8516(listM7472.size());
        c8516.m22241(interfaceC23333);
        C16246 c16246 = new C16246();
        try {
            Iterator it = listM7472.iterator();
            boolean z = false;
            C8485 c8485 = null;
            c22918 = null;
            int i = 0;
            C7474 c7474 = null;
            while (it.hasNext()) {
                try {
                    C12107 c12107 = (C12107) it.next();
                    if (interfaceC23333.mo2357()) {
                        if (z) {
                            abstractC20747 = abstractC20746;
                        }
                        if (c22918 != null) {
                            c22918.close();
                        }
                        return abstractC20747;
                    }
                    c8516.m22242(1);
                    C17684 c17684M41161 = C17684.m41161(c2456.m7475(c12107, (C8516) null));
                    if (c8485 == null) {
                        C7474 c7474Mo34147 = c17684M41161.mo34147();
                        c7474 = c7474Mo34147;
                        c8485 = new C8485(c7474Mo34147);
                    }
                    for (C7807 c7807 : (AbstractC18494) c17684M41161.mo34148()) {
                        if (interfaceC23333.mo2357()) {
                            break;
                        }
                        C11473 c11473 = new C11473(c7807, c5122);
                        c2299.m7032(c11473);
                        C5122 c5123 = c5122;
                        Iterator it2 = it;
                        if (c2299.m7033() > 65000 || c2299.m7030() > 65000) {
                            if (!z) {
                                z = true;
                                c22918 = new C22918(abstractC20746);
                            }
                            c8485.m37936(c16246);
                            i++;
                            c22918.m50725(m10941(i));
                            c22918.write(c16246.m38373(), 0, c16246.m38372());
                            c16246.m38375();
                            c2299 = new C2299();
                            c2299.m7032(c11473);
                            c8485 = new C8485(c7474);
                        }
                        c8485.m22160((InterfaceC22762) c7807);
                        c5122 = c5123;
                        it = it2;
                    }
                    c2456 = c2455;
                    c5122 = c5122;
                    it = it;
                } catch (Throwable th) {
                    th = th;
                    if (c22918 != null) {
                        c22918.close();
                    }
                    throw th;
                }
            }
            if (z) {
                c8485.m37936(c16246);
                c22918.m50725(m10941(i + 1));
                c22918.write(c16246.m38373(), 0, c16246.m38372());
            } else {
                if (c8485 == null) {
                    c8485 = new C8485(C7474.m19963(15));
                }
                c8485.m37937(abstractC20747);
            }
            if (c22918 != null) {
                c22918.close();
            }
            return z ? abstractC20746 : abstractC20747;
        } catch (Throwable th2) {
            th = th2;
            c22918 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m10941(int i) {
        if (i > 0) {
            return i == 1 ? "classes.dex" : C2271.m6966(i, "classes", ".dex");
        }
        throw new IllegalArgumentException();
    }
}
