package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۧ֡ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: RBB2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11249 extends AbstractC17216 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final AbstractC13487 f35520;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f35521;

    public C11249(C18708 c18708, C9012 c9012, C0063 c0063, ArrayList arrayList, AbstractC13487 abstractC13487) {
        super(c18708, c9012, null, c0063);
        if (c18708.m43508() != 1) {
            throw new IllegalArgumentException("opcode with invalid branchingness: " + c18708.m43508());
        }
        this.f35521 = arrayList;
        this.f35520 = abstractC13487;
    }

    @Override // l.AbstractC17216
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC11050 mo7781() {
        return C13705.f43487;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final ArrayList m28484() {
        return this.f35521;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC13487 m28485() {
        return this.f35520;
    }

    @Override // l.AbstractC17216
    /* JADX INFO: renamed from: ۙ */
    public final void mo7779(InterfaceC16470 interfaceC16470) {
        interfaceC16470.mo39058(this);
    }

    @Override // l.AbstractC17216
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC17216 mo7777(C5085 c5085) {
        throw new UnsupportedOperationException("unsupported");
    }

    @Override // l.AbstractC17216
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC17216 mo7778(C20946 c20946, C0063 c0063) {
        return new C11249(m40434(), m40433(), c0063, this.f35521, this.f35520);
    }
}
