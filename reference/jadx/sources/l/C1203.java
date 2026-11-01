package l;

/* JADX INFO: renamed from: l.֨ܶܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZBCT */
/* JADX INFO: loaded from: classes3.dex */
public final class C1203 extends AbstractC9901 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f5318;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C18843 f5319;

    @Override // l.AbstractC9901
    /* JADX INFO: renamed from: ֨ */
    public final String mo2375() {
        return "CallSiteRef";
    }

    @Override // l.AbstractC9901
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo2379() {
        return false;
    }

    public C1203(C18843 c18843, int i) {
        this.f5319 = c18843;
        this.f5318 = i;
    }

    @Override // l.AbstractC9901
    /* JADX INFO: renamed from: ܰ */
    public final int mo2378(AbstractC9901 abstractC9901) {
        C1203 c1203 = (C1203) abstractC9901;
        int iCompareTo = this.f5319.compareTo(c1203.f5319);
        return iCompareTo != 0 ? iCompareTo : Integer.compare(this.f5318, c1203.f5318);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C1909 m4400() {
        return this.f5319.m43482();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C3320 m4398() {
        return this.f5319.m43477();
    }

    public final String toString() {
        return this.f5319.m43485().toString();
    }

    @Override // l.InterfaceC19653
    /* JADX INFO: renamed from: ۙ */
    public final String mo2376() {
        return this.f5319.m43485().mo2376();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C22371 m4399() {
        return this.f5319.m43485();
    }
}
