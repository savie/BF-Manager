package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: l.۫ܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1EM */
/* JADX INFO: loaded from: classes4.dex */
public final class C13217 extends C3369 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32751(C11967 c11967, String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, final InterfaceC23507 interfaceC23507, Set set) {
        final C15454 c15454 = new C15454(c11967, i2 != 0);
        final C22914 c22914 = new C22914(i2, str, z3, z2, c15454, i, z4, c11967, str2, z, set);
        final ArrayList arrayList = new ArrayList();
        new Thread(new Runnable() { // from class: l.ܿ᩻ۧ
            @Override // java.lang.Runnable
            public final void run() {
                final C15454 c15455 = c15454;
                final InterfaceC23507 interfaceC23508 = interfaceC23507;
                try {
                    c15455.f50312 = c15455.f50313 ? c15455.f50311.m29999() : Collections.EMPTY_MAP;
                    final InterfaceC16047 interfaceC16047 = c22914;
                    C22914 c22915 = (C22914) interfaceC16047;
                    InterfaceC11572 interfaceC11572Mo7395 = c22915.mo7395();
                    if (interfaceC11572Mo7395 == null) {
                        C21576.m49068(new RunnableC20701(3, interfaceC23508));
                        return;
                    }
                    ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                    c22915.mo7396(concurrentLinkedQueue);
                    interfaceC23508.mo19230(0);
                    C3374 c3374 = new C3374(concurrentLinkedQueue.size());
                    c3374.m11078(new C15953(interfaceC23508));
                    C24720 c24720M55195 = C24720.m55195();
                    final ArrayList arrayList2 = arrayList;
                    C3369.m11069(C11138.f35105, new RunnableC19930(concurrentLinkedQueue, interfaceC23508, c3374, interfaceC11572Mo7395, arrayList2, c24720M55195));
                    C21576.m49068(new Runnable() { // from class: l.ۖ᩻ۧ
                        @Override // java.lang.Runnable
                        public final void run() {
                            InterfaceC23507 interfaceC23509 = interfaceC23508;
                            if (interfaceC23509.mo19226()) {
                                C22673.m51157();
                            }
                            interfaceC23509.mo19225(((C22914) interfaceC16047).mo7394(arrayList2));
                            interfaceC23509.mo19229();
                        }
                    });
                } catch (Exception e) {
                    C21576.m49068(new Runnable() { // from class: l.ۡ᩻ۧ
                        @Override // java.lang.Runnable
                        public final void run() {
                            Exception exc = e;
                            InterfaceC23507 interfaceC23509 = interfaceC23508;
                            c15455.m37008(interfaceC23509.mo19227(), exc);
                            interfaceC23509.mo19229();
                        }
                    });
                }
            }
        }).start();
    }
}
