package l;

/* JADX INFO: renamed from: l.֫۠ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1699 extends C8756 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5644(C23800 c23800, AbstractC9462 abstractC9462, InterfaceC8050 interfaceC8050, C14023 c14023, C16348 c16348) {
        for (AbstractC3110 abstractC3110 : this.f18128) {
            C6171.m17176(abstractC3110 instanceof C18633);
            C18633 c18633 = (C18633) abstractC3110;
            if (c18633.f60404 == abstractC9462 && c18633.f60405 == interfaceC8050 && c18633.f60409.f46087 == c14023.f46087) {
                return;
            }
        }
        m14413(new C18633(c23800, abstractC9462, null, interfaceC8050, c14023, c16348));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m5643() {
        return this.f18128.m43722();
    }
}
