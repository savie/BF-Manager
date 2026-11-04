package l;

/* JADX INFO: renamed from: l.ۢۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0BCI */
/* JADX INFO: loaded from: classes4.dex */
public final class C9845 extends AbstractC5875 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC11050 f31687;

    public C9845(InterfaceC11050 interfaceC11050) {
        super("Exceptions");
        try {
            if (interfaceC11050.mo27936()) {
                throw new C12017("exceptions.isMutable()", null);
            }
            this.f31687 = interfaceC11050;
        } catch (NullPointerException unused) {
            throw new NullPointerException("exceptions == null");
        }
    }

    @Override // l.InterfaceC1159
    /* JADX INFO: renamed from: ۙ */
    public final int mo1345() {
        return (this.f31687.size() * 2) + 8;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC11050 m25639() {
        return this.f31687;
    }
}
