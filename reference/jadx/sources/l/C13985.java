package l;

/* JADX INFO: renamed from: l.۬ܽۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: AARL */
/* JADX INFO: loaded from: classes4.dex */
public final class C13985 implements InterfaceC9510 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f44337;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f44338;

    @Override // l.InterfaceC9510
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo15211() {
        return true;
    }

    public C13985(int i, int i2) {
        this.f44338 = i;
        this.f44337 = i2;
    }

    public final int hashCode() {
        return C7103.m19444(C7103.m19447(C7103.m19447(C7103.m19447(0, EnumC8765.CUSTOM.ordinal()), this.f44338), this.f44337), 3);
    }

    @Override // l.InterfaceC9510
    /* JADX INFO: renamed from: ۙ */
    public final void mo15210(AbstractC14709 abstractC14709) {
        abstractC14709.mo15472(this.f44338, this.f44337);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13985)) {
            return false;
        }
        C13985 c13985 = (C13985) obj;
        return this.f44338 == c13985.f44338 && this.f44337 == c13985.f44337;
    }
}
