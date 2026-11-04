package l;

import com.tencent.mm.opensdk.modelmsg.WXNativeGamePageObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.᩻ۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: V40L */
/* JADX INFO: loaded from: classes.dex */
public final class C24852 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m55378(C22941 c22941) {
        ArrayList arrayList = new ArrayList();
        for (C8002 c8002 : c22941.m51742()) {
            String name = c8002.getName();
            if (name.endsWith(".class") && !name.equals("module-info.class")) {
                arrayList.add(new C15154(c8002.getName(), new C11425(c8002, c22941)));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m55380(final ArrayList arrayList, final int i, final C21645 c21645, final InterfaceC25004 interfaceC25004) throws Exception {
        final C3374 c3374 = new C3374(arrayList.size());
        c3374.m11078(interfaceC25004);
        final AtomicInteger atomicInteger = new AtomicInteger();
        final AtomicReference atomicReference = new AtomicReference();
        Runnable runnable = new Runnable() { // from class: l.֫ۛܺ
            @Override // java.lang.Runnable
            public final void run() {
                int i2;
                byte[] bArrM51731;
                ArrayList arrayList2 = arrayList;
                AtomicInteger atomicInteger2 = atomicInteger;
                AtomicReference atomicReference2 = atomicReference;
                InterfaceC25004 interfaceC25005 = interfaceC25004;
                int i3 = i;
                C3374 c3375 = c3374;
                C21645 c21646 = c21645;
                C22107 c22107 = new C22107(new byte[WXNativeGamePageObject.LENGTH_LIMIT]);
                int size = arrayList2.size();
                while (true) {
                    try {
                        int andIncrement = atomicInteger2.getAndIncrement();
                        if (andIncrement < size && atomicReference2.get() == null && !interfaceC25005.mo924()) {
                            C5460 c5460 = new C5460();
                            C15900 c15900 = new C15900();
                            c15900.f51667 = System.err;
                            c15900.f51665 = true;
                            c15900.f51669 = false;
                            c15900.f51668 = true;
                            C16646 c16646 = new C16646();
                            c16646.f53789 = true;
                            c16646.f53790 = i3;
                            C10918 c10918 = new C10918(c16646);
                            int i4 = 0;
                            while (i4 < 100) {
                                c3375.m11079(1);
                                if (i4 != 0) {
                                    int andIncrement2 = atomicInteger2.getAndIncrement();
                                    if (andIncrement2 >= size) {
                                        break;
                                    } else {
                                        andIncrement = andIncrement2;
                                    }
                                }
                                C15154 c15154 = (C15154) arrayList2.set(andIncrement, null);
                                ArrayList arrayList3 = arrayList2;
                                String str = c15154.f49446;
                                C11425 c11425 = c15154.f49445;
                                AtomicInteger atomicInteger3 = atomicInteger2;
                                C22941 c22941 = c11425.f35931;
                                C8002 c8002 = c11425.f35932;
                                synchronized (c22941) {
                                    i2 = i3;
                                    try {
                                        bArrM51731 = c22941.m51731(c8002, (C3374) null);
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                C18312 c18312 = new C18312(str, c15900.f51669, bArrM51731);
                                c18312.m42708();
                                c18312.m42700();
                                c10918.m27698(C23360.m52527(c5460, c18312, c15900, c16646, c10918));
                                if (atomicReference2.get() != null || interfaceC25005.mo924()) {
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
                            C15000 c15000M27695 = c10918.m27695(c22107);
                            c21646.m49174(c15000M27695.m36122(), c15000M27695.m36125());
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
        int i2 = C11138.f35105;
        Thread[] threadArr = new Thread[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            Thread thread = new Thread(runnable);
            thread.start();
            threadArr[i3] = thread;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            threadArr[i4].join();
        }
        if (!interfaceC25004.mo924() && atomicReference.get() != null) {
            throw ((Exception) atomicReference.get());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m55379(C22941 c22941, AbstractC22044 abstractC22044, AbstractC22044 abstractC22045, InterfaceC25004 interfaceC25004) throws Throwable {
        C25179 c25179;
        C22941 c22942 = c22941;
        AbstractC22044 abstractC22046 = abstractC22044;
        C14597 c14597 = new C14597();
        C4157 c4157 = new C4157();
        List listM51728 = c22942.m51728(false);
        C3374 c3374 = new C3374(listM51728.size());
        c3374.m11078(interfaceC25004);
        C22781 c22781 = new C22781();
        try {
            Iterator it = listM51728.iterator();
            boolean z = false;
            C8850 c8850 = null;
            c25179 = null;
            int i = 0;
            C19647 c19647 = null;
            while (it.hasNext()) {
                try {
                    C8002 c8002 = (C8002) it.next();
                    if (interfaceC25004.mo924()) {
                        if (z) {
                            abstractC22046 = abstractC22045;
                        }
                        if (c25179 != null) {
                            c25179.close();
                        }
                        return abstractC22046;
                    }
                    c3374.m11079(1);
                    C24975 c24975M55779 = C24975.m55779(c22942.m51731(c8002, (C3374) null));
                    if (c8850 == null) {
                        C19647 c19647Mo4326 = c24975M55779.mo4326();
                        c19647 = c19647Mo4326;
                        c8850 = new C8850(c19647Mo4326);
                    }
                    for (C22737 c22737 : (AbstractC8696) c24975M55779.mo4327()) {
                        if (interfaceC25004.mo924()) {
                            break;
                        }
                        C24295 c24295 = new C24295(c22737, c14597);
                        c4157.m13320(c24295);
                        C14597 c14598 = c14597;
                        Iterator it2 = it;
                        if (c4157.m13317() > 65000 || c4157.m13316() > 65000) {
                            if (!z) {
                                z = true;
                                c25179 = new C25179(abstractC22045);
                            }
                            c8850.m52043(c22781);
                            i++;
                            c25179.m56124(m55377(i));
                            c25179.write(c22781.m51382(), 0, c22781.m51383());
                            c22781.m51384();
                            c4157 = new C4157();
                            c4157.m13320(c24295);
                            c8850 = new C8850(c19647);
                        }
                        c8850.m23712((InterfaceC10122) c22737);
                        c14597 = c14598;
                        it = it2;
                    }
                    c22942 = c22941;
                    c14597 = c14597;
                    it = it;
                } catch (Throwable th) {
                    th = th;
                    if (c25179 != null) {
                        c25179.close();
                    }
                    throw th;
                }
            }
            if (z) {
                c8850.m52043(c22781);
                c25179.m56124(m55377(i + 1));
                c25179.write(c22781.m51382(), 0, c22781.m51383());
            } else {
                if (c8850 == null) {
                    c8850 = new C8850(C19647.m45292(15));
                }
                c8850.m52044(abstractC22046);
            }
            if (c25179 != null) {
                c25179.close();
            }
            return z ? abstractC22045 : abstractC22046;
        } catch (Throwable th2) {
            th = th2;
            c25179 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m55377(int i) {
        if (i > 0) {
            return i == 1 ? "classes.dex" : C14442.m34864(i, "classes", ".dex");
        }
        throw new IllegalArgumentException();
    }
}
