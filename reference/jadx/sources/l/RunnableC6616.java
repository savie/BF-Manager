package l;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: l.ۛ᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1EE */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC6616 implements Runnable {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24720 f22104;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f22105;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC11572 f22106;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3374 f22107;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ConcurrentLinkedQueue f22108;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC23507 f22111;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Object f22103 = new Object();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile int f22110 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile boolean f22109 = true;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f22112 = false;

    public RunnableC6616(ConcurrentLinkedQueue concurrentLinkedQueue, InterfaceC23507 interfaceC23507, C3374 c3374, InterfaceC11572 interfaceC11572, ArrayList arrayList, C24720 c24720) {
        this.f22108 = concurrentLinkedQueue;
        this.f22111 = interfaceC23507;
        this.f22107 = c3374;
        this.f22106 = interfaceC11572;
        this.f22105 = arrayList;
        this.f22104 = c24720;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (!this.f22108.isEmpty()) {
            if (this.f22110 > 1000) {
                if (this.f22110 > 250000) {
                    synchronized (this.f22103) {
                        if (!this.f22112) {
                            C21576.m49068(new RunnableC4783(5, this.f22111));
                            this.f22112 = true;
                        }
                    }
                    return;
                }
                if (this.f22109) {
                    synchronized (this.f22103) {
                        if (this.f22109) {
                            this.f22112 = this.f22111.mo19228();
                            this.f22109 = false;
                        }
                    }
                }
                if (this.f22112) {
                    return;
                }
            }
            InterfaceC14906 interfaceC14906 = (InterfaceC14906) this.f22108.poll();
            if (interfaceC14906 == null || this.f22111.mo19226()) {
                return;
            }
            this.f22107.m11079(1);
            List listAccept = this.f22106.accept(interfaceC14906);
            if (listAccept != null) {
                synchronized (this) {
                    this.f22110 += listAccept.size();
                    this.f22105.add(new C5607(interfaceC14906.mo10208(), listAccept));
                }
                if (this.f22104.m55199()) {
                    this.f22111.mo19224(this.f22110);
                }
            }
        }
    }
}
