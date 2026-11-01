package l;

/* JADX INFO: renamed from: l.ܿܰܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0BCI */
/* JADX INFO: loaded from: classes5.dex */
public final class C17391 extends AbstractC1100 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14093 f55353;

    public C17391(InterfaceC14093 interfaceC14093) {
        super("Exceptions");
        try {
            if (interfaceC14093.mo34077()) {
                throw new C8364("exceptions.isMutable()", null);
            }
            this.f55353 = interfaceC14093;
        } catch (NullPointerException unused) {
            throw new NullPointerException("exceptions == null");
        }
    }

    @Override // l.InterfaceC5771
    /* JADX INFO: renamed from: ۙ */
    public final int mo2281() {
        return (this.f55353.size() * 2) + 8;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14093 m40510() {
        return this.f55353;
    }
}
