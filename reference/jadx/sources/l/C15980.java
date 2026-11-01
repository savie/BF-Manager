package l;

/* JADX INFO: renamed from: l.ܺܰܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8Q3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15980 extends C15026 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C17216 f51753;

    public C15980(InterfaceC6558 interfaceC6558, C17216 c17216) {
        super(interfaceC6558);
        this.f51753 = c17216;
    }

    @Override // l.InterfaceC18553
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C17216 mo37959() {
        return this.f51753;
    }

    @Override // l.InterfaceC18553
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7648 mo37958(int i) {
        return this.f51753.m40159(m36013().mo36012(i));
    }

    @Override // l.InterfaceC6558
    /* JADX INFO: renamed from: ۬ */
    public final C7648 mo17795() {
        return this.f51753.m40159(m36013().mo17783());
    }

    @Override // l.C15026
    public final boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof C15980)) {
            return this.f51753.equals(((C15980) obj).f51753);
        }
        return false;
    }

    @Override // l.C15026
    public final int hashCode() {
        return this.f51753.hashCode() + (super.hashCode() * 31);
    }
}
