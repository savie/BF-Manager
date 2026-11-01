package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۡۡᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D88X */
/* JADX INFO: loaded from: classes4.dex */
public final class C8782 extends C5253 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public short f30202;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final short m22854() {
        return this.f30202;
    }

    @Override // l.C5253
    /* JADX INFO: renamed from: ۙ */
    public final void mo14521(C15132 c15132) throws IOException {
        super.mo14521(c15132);
        int i = C19365.f62422[m14524().ordinal()];
        if (i == 1) {
            this.f30202 = c15132.m36281();
            c15132.m36281();
            c15132.m36283(m14525() - 20);
        } else if (i == 2) {
            c15132.m36283(m14525() - 16);
        } else {
            throw new IOException("Invalid PDU type: " + m14524());
        }
    }
}
