package l;

/* JADX INFO: renamed from: l.᩺᩺ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5XG */
/* JADX INFO: loaded from: classes.dex */
public final class C23302 extends AbstractC13264 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f75555;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC15914 f75556;

    public C23302(C1428 c1428, int i) {
        this.f75556 = c1428;
        this.f75555 = i;
    }

    @Override // l.AbstractC13264, l.InterfaceC21350
    /* JADX INFO: renamed from: ۛܰ */
    public final InterfaceC15914 mo32743() {
        return this.f75556;
    }

    @Override // l.InterfaceC21350
    /* JADX INFO: renamed from: ۨܰ */
    public final String mo6347() {
        InterfaceC15914 interfaceC15914 = this.f75556;
        if (interfaceC15914 == null) {
            return null;
        }
        return interfaceC15914.getType();
    }

    @Override // l.InterfaceC21350
    /* JADX INFO: renamed from: ۗ */
    public final int mo6346() {
        return this.f75555;
    }
}
