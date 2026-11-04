package l;

/* JADX INFO: renamed from: l.ᩴܶۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2ASJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19909 implements InterfaceC9510 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f64060;

    @Override // l.InterfaceC9510
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo15211() {
        return false;
    }

    public C19909(int i) {
        this.f64060 = i;
    }

    public final int hashCode() {
        return C7103.m19444(C7103.m19447(C7103.m19447(0, EnumC8765.PUSH_MODE.ordinal()), this.f64060), 2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C19909) {
            return this.f64060 == ((C19909) obj).f64060;
        }
        return false;
    }

    public final String toString() {
        return String.format("pushMode(%d)", Integer.valueOf(this.f64060));
    }

    @Override // l.InterfaceC9510
    /* JADX INFO: renamed from: ۙ */
    public final void mo15210(AbstractC14709 abstractC14709) {
        abstractC14709.f48054.m54929(abstractC14709.f48055);
        abstractC14709.f48055 = this.f64060;
    }
}
