package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܽۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A4E9 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16420 implements InterfaceC10008 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14304 f52834;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f52835 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C3220 f52836;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f52837;

    public AbstractC16420(C14304 c14304) {
        this.f52834 = c14304;
        this.f52836 = new C3220(c14304.f46864.mo2292());
    }

    @Override // l.InterfaceC10008
    /* JADX INFO: renamed from: ۜ */
    public final C20591 mo2292() {
        return this.f52836;
    }

    @Override // l.InterfaceC10008
    /* JADX INFO: renamed from: ܰ */
    public long mo2293(C6043 c6043, long j) throws IOException {
        try {
            long jMo2293 = this.f52834.f46864.mo2293(c6043, j);
            if (jMo2293 > 0) {
                this.f52835 += jMo2293;
            }
            return jMo2293;
        } catch (IOException e) {
            m38677(false, e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38677(boolean z, IOException iOException) {
        C14304 c14304 = this.f52834;
        int i = c14304.f46866;
        if (i == 6) {
            return;
        }
        if (i == 5) {
            C3220 c3220 = this.f52836;
            C20591 c20591M9646 = c3220.m9646();
            c3220.m9652();
            c20591M9646.mo9648();
            c20591M9646.mo9653();
            c14304.f46866 = 6;
            C15009 c15009 = c14304.f46869;
            if (c15009 != null) {
                c15009.m36001(!z, c14304, iOException);
                return;
            }
            return;
        }
        throw new IllegalStateException("state: " + c14304.f46866);
    }
}
