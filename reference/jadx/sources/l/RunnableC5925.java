package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۚ᩷᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC5925 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11890 f20270;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2196 f20271;

    public RunnableC5925(C2196 c2196, C11890 c11890) {
        this.f20271 = c2196;
        this.f20270 = c11890;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2196 c2196 = this.f20271;
        List list = c2196.f7213;
        C11890 c11890 = this.f20270;
        list.add(c11890);
        if (!C20512.m47035(C5596.m16575())) {
            C21587.m49118("AttaReporter", "attaReport net disconnect, " + c11890);
        } else {
            try {
                C2196.m7506(c2196);
            } catch (Exception e) {
                C21587.m49112("AttaReporter", "Exception", e);
            }
        }
    }
}
