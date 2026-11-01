package l;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: l.ܿۨۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1EE */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC17321 implements Runnable {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ConcurrentLinkedQueue f55111;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22959 f55112;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC7794 f55113;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f55114;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC16966 f55117;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8516 f55119;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object f55116 = new Object();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile int f55110 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public volatile boolean f55115 = true;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f55118 = false;

    public RunnableC17321(ConcurrentLinkedQueue concurrentLinkedQueue, InterfaceC16966 interfaceC16966, C8516 c8516, InterfaceC7794 interfaceC7794, ArrayList arrayList, C22959 c22959) {
        this.f55111 = concurrentLinkedQueue;
        this.f55117 = interfaceC16966;
        this.f55119 = c8516;
        this.f55113 = interfaceC7794;
        this.f55114 = arrayList;
        this.f55112 = c22959;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (!this.f55111.isEmpty()) {
            if (this.f55110 > 1000) {
                if (this.f55110 > 250000) {
                    synchronized (this.f55116) {
                        if (!this.f55118) {
                            C16737.m39273(new RunnableC17794(4, this.f55117));
                            this.f55118 = true;
                        }
                    }
                    return;
                }
                if (this.f55115) {
                    synchronized (this.f55116) {
                        if (this.f55115) {
                            this.f55118 = this.f55117.mo16478();
                            this.f55115 = false;
                        }
                    }
                }
                if (this.f55118) {
                    return;
                }
            }
            InterfaceC9354 interfaceC9354 = (InterfaceC9354) this.f55111.poll();
            if (interfaceC9354 == null || this.f55117.mo16477()) {
                return;
            }
            this.f55119.m22242(1);
            List listAccept = this.f55113.accept(interfaceC9354);
            if (listAccept != null) {
                synchronized (this) {
                    this.f55110 += listAccept.size();
                    this.f55114.add(new C9206(interfaceC9354.mo24004(), listAccept));
                }
                if (this.f55112.m50802()) {
                    this.f55117.mo16475(this.f55110);
                }
            }
        }
    }
}
