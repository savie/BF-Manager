package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܰ۠ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08E3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13700 extends AbstractC0998 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C14010 f45188;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C7659 f45189;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33405(C14010 c14010) {
        this.f45188 = c14010;
    }

    @Override // l.AbstractC0998
    /* JADX INFO: renamed from: ܰ */
    public final void mo2809() {
        double[] dArrM36892 = this.f45189.m36892(0);
        double[] dArrM36893 = this.f45189.m36892(1);
        C14010 c14010 = this.f45188;
        if (c14010 != null) {
            for (int i = 0; i < 8; i++) {
                try {
                    c14010.m33874(dArrM36892[i]);
                    c14010.m33874(dArrM36893[i]);
                } catch (IOException unused) {
                    return;
                }
            }
        }
    }
}
