package l;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: l.ۜ֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1EM */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC6445 implements Runnable {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22959 f21798;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8516 f21799;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC7794 f21800;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ConcurrentLinkedQueue f21801;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC16966 f21804;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f21806;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object f21803 = new Object();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile int f21797 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public volatile boolean f21802 = true;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f21805 = false;

    public RunnableC6445(ConcurrentLinkedQueue concurrentLinkedQueue, InterfaceC16966 interfaceC16966, C8516 c8516, InterfaceC7794 interfaceC7794, ArrayList arrayList, C22959 c22959) {
        this.f21801 = concurrentLinkedQueue;
        this.f21804 = interfaceC16966;
        this.f21799 = c8516;
        this.f21800 = interfaceC7794;
        this.f21806 = arrayList;
        this.f21798 = c22959;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (!this.f21801.isEmpty()) {
            if (this.f21797 > 1000) {
                if (this.f21797 > 250000) {
                    synchronized (this.f21803) {
                        if (!this.f21805) {
                            C16737.m39273(new RunnableC17794(4, this.f21804));
                            this.f21805 = true;
                        }
                    }
                    return;
                }
                if (this.f21802) {
                    synchronized (this.f21803) {
                        if (this.f21802) {
                            this.f21805 = this.f21804.mo16478();
                            this.f21802 = false;
                        }
                    }
                }
                if (this.f21805) {
                    return;
                }
            }
            InterfaceC9974 interfaceC9974 = (InterfaceC9974) this.f21801.poll();
            if (interfaceC9974 == null || this.f21804.mo16477()) {
                return;
            }
            this.f21799.m22242(1);
            List listAccept = this.f21800.accept(interfaceC9974);
            if (listAccept != null) {
                synchronized (this) {
                    this.f21797 += listAccept.size();
                    this.f21806.add(new C9206(interfaceC9974.getPath(), listAccept));
                }
                if (this.f21798.m50802()) {
                    this.f21804.mo16475(this.f21797);
                }
            }
        }
    }
}
