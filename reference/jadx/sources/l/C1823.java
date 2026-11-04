package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֫ۡ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: H1MW */
/* JADX INFO: loaded from: classes3.dex */
public final class C1823 extends AbstractC20468 implements InterfaceC15224, InterfaceC19597 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4060 f6183;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C23452 f6184;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1823(C4060 c4060) {
        super(c4060);
        this.f6183 = c4060;
    }

    @Override // l.AbstractC20468
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6300(int i, Object obj) {
        C23452 c23452 = new C23452(this.f6183, i);
        this.f6184 = c23452;
        ((Consumer) obj).accept(c23452);
    }

    @Override // java.util.Iterator
    public final Object next() {
        C23452 c23452 = new C23452(this.f6183, m46974());
        this.f6184 = c23452;
        return c23452;
    }

    @Override // l.AbstractC20468, java.util.Iterator
    public final void remove() {
        super.remove();
        this.f6184.f75903 = -1;
    }
}
