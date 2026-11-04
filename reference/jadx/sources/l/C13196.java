package l;

/* JADX INFO: renamed from: l.۫ܶۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: UASO */
/* JADX INFO: loaded from: classes4.dex */
public final class C13196 implements InterfaceC9510 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f42145;

    @Override // l.InterfaceC9510
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo15211() {
        return false;
    }

    public C13196(int i) {
        this.f42145 = i;
    }

    public final int hashCode() {
        return C7103.m19444(C7103.m19447(C7103.m19447(0, EnumC8765.TYPE.ordinal()), this.f42145), 2);
    }

    @Override // l.InterfaceC9510
    /* JADX INFO: renamed from: ۙ */
    public final void mo15210(AbstractC14709 abstractC14709) {
        abstractC14709.f48064 = this.f42145;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C13196) {
            return this.f42145 == ((C13196) obj).f42145;
        }
        return false;
    }

    public final String toString() {
        return String.format("type(%d)", Integer.valueOf(this.f42145));
    }
}
