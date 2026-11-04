package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩻ۖ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: DD2 */
/* JADX INFO: loaded from: classes.dex */
public final class C24748 extends AbstractC20272 implements InterfaceC15224, InterfaceC19597 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C23256 f80129;

    public C24748(C3864 c3864) {
        super(c3864);
        this.f80129 = new C23256(c3864);
    }

    @Override // l.AbstractC20272
    /* JADX INFO: renamed from: ۙ */
    public final void mo5772(int i, Object obj) {
        C23256 c23256 = this.f80129;
        c23256.f75362 = i;
        ((Consumer) obj).accept(c23256);
    }

    @Override // java.util.Iterator
    public final Object next() {
        int iM46538 = m46538();
        C23256 c23256 = this.f80129;
        c23256.f75362 = iM46538;
        return c23256;
    }
}
