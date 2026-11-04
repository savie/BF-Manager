package l;

/* JADX INFO: renamed from: l.۬ᩳۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAVQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C14022 implements InterfaceC4043 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractC1566 f44420;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f44421;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f44422;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C1345 f44423;

    @Override // l.InterfaceC4043
    /* JADX INFO: renamed from: ᩺ */
    public final C14022 mo13008() {
        return this;
    }

    public C14022(C1345 c1345, String str, AbstractC1566 abstractC1566) {
        this.f44423 = c1345;
        this.f44422 = str;
        this.f44420 = abstractC1566;
        this.f44421 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14022 m34144(C1610 c1610, C1345 c1345, String str, AbstractC1566 abstractC1566) {
        return c1610.m5678().m14833(new C14022(c1345, str, abstractC1566));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14022 m34143(C1610 c1610, InterfaceC1213 interfaceC1213) {
        return c1610.m5678().m14833(new C14022(C1345.m4954(c1610, interfaceC1213.mo4434()), interfaceC1213.getName(), AbstractC1566.m5535(interfaceC1213.getType())));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m34147() {
        return this.f44422;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC1566 m34149() {
        return this.f44420;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C1345 m34148() {
        return this.f44423;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m34145() {
        return this.f44421;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m34146(C14022 c14022) {
        return this.f44422.equals(c14022.f44422) && this.f44420.equals(c14022.f44420);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C14022.class == obj.getClass()) {
            C14022 c14022 = (C14022) obj;
            if (this.f44422.equals(c14022.f44422) && this.f44420.equals(c14022.f44420) && this.f44423.equals(c14022.f44423)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f44423.hashCode() + ((this.f44420.hashCode() + (this.f44422.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return this.f44423 + "." + this.f44422 + ' ' + this.f44420;
    }
}
