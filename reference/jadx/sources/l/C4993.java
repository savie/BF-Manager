package l;

/* JADX INFO: renamed from: l.ۙܶۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: EAS0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4993 implements InterfaceC9510 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9510 f17352;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f17353;

    @Override // l.InterfaceC9510
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo15211() {
        return true;
    }

    public C4993(int i, InterfaceC9510 interfaceC9510) {
        this.f17353 = i;
        this.f17352 = interfaceC9510;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m15212() {
        return this.f17353;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC9510 m15213() {
        return this.f17352;
    }

    @Override // l.InterfaceC9510
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo15210(AbstractC14709 abstractC14709) {
        this.f17352.mo15210(abstractC14709);
    }

    public final int hashCode() {
        return C7103.m19444(C7103.m19445(C7103.m19447(0, this.f17353), this.f17352), 2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4993)) {
            return false;
        }
        C4993 c4993 = (C4993) obj;
        return this.f17353 == c4993.f17353 && this.f17352.equals(c4993.f17352);
    }
}
