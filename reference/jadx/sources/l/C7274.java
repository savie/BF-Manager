package l;

/* JADX INFO: renamed from: l.ۜܽۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: PARF */
/* JADX INFO: loaded from: classes4.dex */
public final class C7274 implements InterfaceC9510 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f23966;

    @Override // l.InterfaceC9510
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo15211() {
        return false;
    }

    public C7274(int i) {
        this.f23966 = i;
    }

    public final int hashCode() {
        return C7103.m19444(C7103.m19447(C7103.m19447(0, EnumC8765.CHANNEL.ordinal()), this.f23966), 2);
    }

    @Override // l.InterfaceC9510
    /* JADX INFO: renamed from: ۙ */
    public final void mo15210(AbstractC14709 abstractC14709) {
        abstractC14709.f48063 = this.f23966;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7274) {
            return this.f23966 == ((C7274) obj).f23966;
        }
        return false;
    }

    public final String toString() {
        return String.format("channel(%d)", Integer.valueOf(this.f23966));
    }
}
