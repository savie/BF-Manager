package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩻ۡ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: H1MW */
/* JADX INFO: loaded from: classes.dex */
public final class C24944 extends AbstractC20468 implements InterfaceC15224, InterfaceC19597 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C23452 f80759;

    public C24944(C4060 c4060) {
        super(c4060);
        this.f80759 = new C23452(c4060);
    }

    @Override // l.AbstractC20468
    /* JADX INFO: renamed from: ۙ */
    public final void mo6300(int i, Object obj) {
        C23452 c23452 = this.f80759;
        c23452.f75903 = i;
        ((Consumer) obj).accept(c23452);
    }

    @Override // java.util.Iterator
    public final Object next() {
        int iM46974 = m46974();
        C23452 c23452 = this.f80759;
        c23452.f75903 = iM46974;
        return c23452;
    }
}
