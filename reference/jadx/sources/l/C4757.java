package l;

/* JADX INFO: renamed from: l.ۙ۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: GBCR */
/* JADX INFO: loaded from: classes3.dex */
public final class C4757 extends AbstractC13487 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C8791 f16708;

    @Override // l.AbstractC13487
    /* JADX INFO: renamed from: ۫ */
    public final String mo1845() {
        return "annotation";
    }

    @Override // l.AbstractC13487
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo1849() {
        return false;
    }

    public C4757(C8791 c8791) {
        c8791.m46488();
        this.f16708 = c8791;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4757)) {
            return false;
        }
        return this.f16708.equals(((C4757) obj).f16708);
    }

    public final int hashCode() {
        return this.f16708.hashCode();
    }

    @Override // l.AbstractC13487
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1848(AbstractC13487 abstractC13487) {
        return this.f16708.compareTo(((C4757) abstractC13487).f16708);
    }

    public final String toString() {
        return this.f16708.mo1843();
    }

    @Override // l.InterfaceC6052
    /* JADX INFO: renamed from: ۙ */
    public final String mo1843() {
        return this.f16708.mo1843();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C8791 m14670() {
        return this.f16708;
    }
}
