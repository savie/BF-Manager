package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۗۡܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08E3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3307 extends AbstractC4053 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C3067 f10811;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C13508 f10812;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10925(C3067 c3067) {
        this.f10811 = c3067;
    }

    @Override // l.AbstractC4053
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2017() {
        double[] dArrM20605 = this.f10812.m20605(0);
        double[] dArrM20606 = this.f10812.m20605(1);
        C3067 c3067 = this.f10811;
        if (c3067 != null) {
            for (int i = 0; i < 8; i++) {
                try {
                    c3067.m10000(dArrM20605[i]);
                    c3067.m10000(dArrM20606[i]);
                } catch (IOException unused) {
                    return;
                }
            }
        }
    }
}
