package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: l.ܶ֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1EM */
/* JADX INFO: loaded from: classes4.dex */
public final class C14913 extends C12733 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35658(C8229 c8229, String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, final InterfaceC16966 interfaceC16966, Set set) {
        final C22674 c22674 = new C22674(c8229, i2 != 0);
        final C3622 c3622 = new C3622(i2, str, z3, z2, c22674, i, z4, c8229, str2, z, set);
        final ArrayList arrayList = new ArrayList();
        new Thread(new Runnable() { // from class: l.ۧܳۘ
            @Override // java.lang.Runnable
            public final void run() {
                final C22674 c22675 = c22674;
                final InterfaceC16966 interfaceC16967 = interfaceC16966;
                try {
                    c22675.f73834 = c22675.f73835 ? c22675.f73833.m21605() : Collections.EMPTY_MAP;
                    final InterfaceC0737 interfaceC0737 = c3622;
                    C3622 c3623 = (C3622) interfaceC0737;
                    InterfaceC7794 interfaceC7794Mo3200 = c3623.mo3200();
                    if (interfaceC7794Mo3200 == null) {
                        C16737.m39273(new RunnableC18517(5, interfaceC16967));
                        return;
                    }
                    ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                    c3623.mo3202(concurrentLinkedQueue);
                    interfaceC16967.mo16481(0);
                    C8516 c8516 = new C8516(concurrentLinkedQueue.size());
                    c8516.m22241(new C4328(interfaceC16967));
                    C22959 c22959M50797 = C22959.m50797();
                    final ArrayList arrayList2 = arrayList;
                    C12733.m31637(C5464.f18831, new RunnableC6445(concurrentLinkedQueue, interfaceC16967, c8516, interfaceC7794Mo3200, arrayList2, c22959M50797));
                    C16737.m39273(new Runnable() { // from class: l.ܰ֫ۘ
                        @Override // java.lang.Runnable
                        public final void run() {
                            InterfaceC16966 interfaceC16968 = interfaceC16967;
                            if (interfaceC16968.mo16477()) {
                                C15829.m37616();
                            }
                            interfaceC16968.mo16476(((C3622) interfaceC0737).mo3201(arrayList2));
                            interfaceC16968.mo16480();
                        }
                    });
                } catch (Exception e) {
                    C16737.m39273(new Runnable() { // from class: l.ۗܳۘ
                        @Override // java.lang.Runnable
                        public final void run() {
                            Exception exc = e;
                            InterfaceC16966 interfaceC16968 = interfaceC16967;
                            c22675.m50207(interfaceC16968.mo16479(), exc);
                            interfaceC16968.mo16480();
                        }
                    });
                }
            }
        }).start();
    }
}
