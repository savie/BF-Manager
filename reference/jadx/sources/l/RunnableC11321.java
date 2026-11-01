package l;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.ۧ᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC11321 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6111 f38205;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f38206;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16408 f38207;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public FutureC12075 f38208;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FutureC12075 f38209;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15990 f38210;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC12359 f38211;

    public RunnableC11321(C6111 c6111, FutureC12075 futureC12075, C15990 c15990, C16408 c16408) {
        this.f38205 = c6111;
        this.f38209 = futureC12075;
        this.f38210 = c15990;
        this.f38207 = c16408;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6111 c6111 = this.f38205;
        FutureC12075 futureC12075 = this.f38209;
        if (futureC12075.isDone()) {
            FutureC12075 futureC12076 = this.f38208;
            if (futureC12076 != null) {
                futureC12076.cancel(false);
            }
            this.f38208 = null;
            return;
        }
        C15990 c15990 = this.f38210;
        if (c15990 != null) {
            try {
                if (c6111.f20748 == c15990) {
                    InterfaceC2916 interfaceC2916 = c6111.f20708;
                    C16408 c16408 = this.f38207;
                    if (interfaceC2916 == c16408 && !c6111.f20760) {
                        Throwable thM16952 = c6111.m16952();
                        if (thM16952 != null) {
                            throw new C17013(thM16952);
                        }
                        if (this.f38211 != c6111.f20764 || this.f38206 != c16408.mo2395() || !c6111.m16836()) {
                            FutureC12075 futureC12077 = this.f38208;
                            if (futureC12077 != null) {
                                futureC12077.cancel(false);
                            }
                            this.f38208 = null;
                        }
                        if (c6111.m16836() && c6111.f20764.m30759()) {
                            if (this.f38208 == null) {
                                this.f38211 = c6111.f20764;
                                this.f38206 = c16408.mo2395();
                                this.f38208 = c6111.m16957((InterfaceC2916) c16408);
                            }
                            if (this.f38208.isDone()) {
                                this.f38208.m30027();
                                futureC12075.m30019((Object) null);
                                return;
                            }
                        }
                        C16737.m39274(this, 10L);
                        return;
                    }
                }
            } catch (Throwable th) {
                FutureC12075 futureC12078 = this.f38208;
                if (futureC12078 != null) {
                    futureC12078.cancel(false);
                }
                this.f38208 = null;
                futureC12075.m30021(th);
                return;
            }
        }
        throw new CancellationException("Session preparation is no longer active");
    }
}
