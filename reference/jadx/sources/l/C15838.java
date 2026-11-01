package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܺۡᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5QJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C15838 extends C5253 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public byte[] f51261;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final byte[] m37648() {
        return this.f51261;
    }

    @Override // l.C5253
    /* JADX INFO: renamed from: ۙ */
    public final void mo14521(C15132 c15132) throws IOException {
        super.mo14521(c15132);
        this.f51261 = new byte[(m14525() - m14518()) - 24];
        c15132.m36283(8);
        c15132.m36286(this.f51261);
        c15132.m36283(m14518());
    }
}
