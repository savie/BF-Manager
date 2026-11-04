package l;

/* JADX INFO: renamed from: l.ۚ۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZBCT */
/* JADX INFO: loaded from: classes3.dex */
public final class C5503 extends AbstractC13487 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f19136;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C3265 f19137;

    @Override // l.AbstractC13487
    /* JADX INFO: renamed from: ۫ */
    public final String mo1845() {
        return "CallSiteRef";
    }

    @Override // l.AbstractC13487
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo1849() {
        return false;
    }

    public C5503(C3265 c3265, int i) {
        this.f19137 = c3265;
        this.f19136 = i;
    }

    @Override // l.AbstractC13487
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1848(AbstractC13487 abstractC13487) {
        C5503 c5503 = (C5503) abstractC13487;
        int iCompareTo = this.f19137.compareTo(c5503.f19137);
        return iCompareTo != 0 ? iCompareTo : Integer.compare(this.f19136, c5503.f19136);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C6994 m16332() {
        return this.f19137.m10662();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C5085 m16330() {
        return this.f19137.m10663();
    }

    public final String toString() {
        return this.f19137.m10666().toString();
    }

    @Override // l.InterfaceC6052
    /* JADX INFO: renamed from: ۙ */
    public final String mo1843() {
        return this.f19137.m10666().mo1843();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C12960 m16331() {
        return this.f19137.m10666();
    }
}
