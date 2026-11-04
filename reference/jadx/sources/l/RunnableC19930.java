package l;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: l.ᩴܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1EM */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC19930 implements Runnable {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3374 f64104;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ConcurrentLinkedQueue f64105;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC11572 f64106;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f64107;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24720 f64108;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC23507 f64111;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Object f64103 = new Object();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile int f64110 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile boolean f64109 = true;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f64112 = false;

    public RunnableC19930(ConcurrentLinkedQueue concurrentLinkedQueue, InterfaceC23507 interfaceC23507, C3374 c3374, InterfaceC11572 interfaceC11572, ArrayList arrayList, C24720 c24720) {
        this.f64105 = concurrentLinkedQueue;
        this.f64111 = interfaceC23507;
        this.f64104 = c3374;
        this.f64106 = interfaceC11572;
        this.f64107 = arrayList;
        this.f64108 = c24720;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (!this.f64105.isEmpty()) {
            if (this.f64110 > 1000) {
                if (this.f64110 > 250000) {
                    synchronized (this.f64103) {
                        if (!this.f64112) {
                            C21576.m49068(new RunnableC4783(5, this.f64111));
                            this.f64112 = true;
                        }
                    }
                    return;
                }
                if (this.f64109) {
                    synchronized (this.f64103) {
                        if (this.f64109) {
                            this.f64112 = this.f64111.mo19228();
                            this.f64109 = false;
                        }
                    }
                }
                if (this.f64112) {
                    return;
                }
            }
            InterfaceC16200 interfaceC16200 = (InterfaceC16200) this.f64105.poll();
            if (interfaceC16200 == null || this.f64111.mo19226()) {
                return;
            }
            this.f64104.m11079(1);
            List listAccept = this.f64106.accept(interfaceC16200);
            if (listAccept != null) {
                synchronized (this) {
                    this.f64110 += listAccept.size();
                    this.f64107.add(new C5607(interfaceC16200.getPath(), listAccept));
                }
                if (this.f64108.m55199()) {
                    this.f64111.mo19224(this.f64110);
                }
            }
        }
    }
}
