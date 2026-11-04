package l;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.ۘ۠᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC4037 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FutureC23690 f13767;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3354 f13768;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f13769;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public FutureC23690 f13770;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24132 f13771;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15926 f13772;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC13753 f13773;

    public RunnableC4037(C24132 c24132, FutureC23690 futureC23690, C15926 c15926, C3354 c3354) {
        this.f13771 = c24132;
        this.f13767 = futureC23690;
        this.f13772 = c15926;
        this.f13768 = c3354;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C24132 c24132 = this.f13771;
        FutureC23690 futureC23690 = this.f13767;
        if (futureC23690.isDone()) {
            FutureC23690 futureC23691 = this.f13770;
            if (futureC23691 != null) {
                futureC23691.cancel(false);
            }
            this.f13770 = null;
            return;
        }
        C15926 c15926 = this.f13772;
        if (c15926 != null) {
            try {
                if (c24132.f78112 == c15926) {
                    InterfaceC19106 interfaceC19106 = c24132.f78058;
                    C3354 c3354 = this.f13768;
                    if (interfaceC19106 == c3354 && !c24132.f78019) {
                        Throwable thM53961 = c24132.m53961();
                        if (thM53961 != null) {
                            throw new C3552(thM53961);
                        }
                        if (this.f13773 != c24132.f78022 || this.f13769 != c3354.mo15344() || !c24132.m54020()) {
                            FutureC23690 futureC23692 = this.f13770;
                            if (futureC23692 != null) {
                                futureC23692.cancel(false);
                            }
                            this.f13770 = null;
                        }
                        if (c24132.m54020() && c24132.f78022.m33641()) {
                            if (this.f13770 == null) {
                                this.f13773 = c24132.f78022;
                                this.f13769 = c3354.mo15344();
                                this.f13770 = c24132.m53980((InterfaceC19106) c3354);
                            }
                            if (this.f13770.isDone()) {
                                this.f13770.m52947();
                                futureC23690.m52935((Object) null);
                                return;
                            }
                        }
                        C21576.m49069(this, 10L);
                        return;
                    }
                }
            } catch (Throwable th) {
                FutureC23690 futureC23693 = this.f13770;
                if (futureC23693 != null) {
                    futureC23693.cancel(false);
                }
                this.f13770 = null;
                futureC23690.m52937(th);
                return;
            }
        }
        throw new CancellationException("Session preparation is no longer active");
    }
}
