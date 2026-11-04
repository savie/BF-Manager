package l;

/* JADX INFO: renamed from: l.᩷ܶۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: CAT9 */
/* JADX INFO: loaded from: classes.dex */
public final class C22147 implements InterfaceC9510 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f71339;

    @Override // l.InterfaceC9510
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo15211() {
        return false;
    }

    public C22147(int i) {
        this.f71339 = i;
    }

    public final int hashCode() {
        return C7103.m19444(C7103.m19447(C7103.m19447(0, EnumC8765.MODE.ordinal()), this.f71339), 2);
    }

    @Override // l.InterfaceC9510
    /* JADX INFO: renamed from: ۙ */
    public final void mo15210(AbstractC14709 abstractC14709) {
        abstractC14709.f48055 = this.f71339;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C22147) {
            return this.f71339 == ((C22147) obj).f71339;
        }
        return false;
    }

    public final String toString() {
        return String.format("mode(%d)", Integer.valueOf(this.f71339));
    }
}
