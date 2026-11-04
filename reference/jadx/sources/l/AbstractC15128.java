package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܳۚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4E9 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15128 implements InterfaceC13810 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C23508 f49361;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f49362 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16620 f49363;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f49364;

    public AbstractC15128(C16620 c16620) {
        this.f49363 = c16620;
        this.f49361 = new C23508(c16620.f53748.mo4181());
    }

    @Override // l.InterfaceC13810
    /* JADX INFO: renamed from: ۧ */
    public final C22411 mo4181() {
        return this.f49361;
    }

    @Override // l.InterfaceC13810
    /* JADX INFO: renamed from: ᩷ */
    public long mo4186(C1879 c1879, long j) throws IOException {
        try {
            long jMo4186 = this.f49363.f53748.mo4186(c1879, j);
            if (jMo4186 > 0) {
                this.f49362 += jMo4186;
            }
            return jMo4186;
        } catch (IOException e) {
            m36402(false, e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36402(boolean z, IOException iOException) {
        C16620 c16620 = this.f49363;
        int i = c16620.f53746;
        if (i == 6) {
            return;
        }
        if (i == 5) {
            C23508 c23508 = this.f49361;
            C22411 c22411M52696 = c23508.m52696();
            c23508.m52695();
            c22411M52696.mo50548();
            c22411M52696.mo50552();
            c16620.f53746 = 6;
            C19076 c19076 = c16620.f53745;
            if (c19076 != null) {
                c19076.m44181(!z, c16620, iOException);
                return;
            }
            return;
        }
        throw new IllegalStateException("state: " + c16620.f53746);
    }
}
