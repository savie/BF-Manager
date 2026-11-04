package l;

/* JADX INFO: renamed from: l.ۚ᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: J8Q3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5923 extends C2961 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C16549 f20266;

    public C5923(InterfaceC1470 interfaceC1470, C16549 c16549) {
        super(interfaceC1470);
        this.f20266 = c16549;
    }

    @Override // l.InterfaceC14147
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C16549 mo17236() {
        return this.f20266;
    }

    @Override // l.InterfaceC14147
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15648 mo17235(int i) {
        return this.f20266.m39194(m9650().mo9649(i));
    }

    @Override // l.InterfaceC1470
    /* JADX INFO: renamed from: ۚ */
    public final C15648 mo5254() {
        return this.f20266.m39194(m9650().mo5257());
    }

    @Override // l.C2961
    public final boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof C5923)) {
            return this.f20266.equals(((C5923) obj).f20266);
        }
        return false;
    }

    @Override // l.C2961
    public final int hashCode() {
        return this.f20266.hashCode() + (super.hashCode() * 31);
    }
}
