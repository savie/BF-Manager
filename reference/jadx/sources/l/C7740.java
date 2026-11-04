package l;

/* JADX INFO: renamed from: l.۟۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BAP */
/* JADX INFO: loaded from: classes4.dex */
public final class C7740 extends AbstractC2519 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6994 f25489;

    @Override // l.AbstractC13487
    /* JADX INFO: renamed from: ۫ */
    public final String mo1845() {
        return "proto";
    }

    @Override // l.AbstractC13487
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo1849() {
        return false;
    }

    public C7740(C6994 c6994) {
        this.f25489 = c6994;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7740) {
            return this.f25489.equals(((C7740) obj).f25489);
        }
        return false;
    }

    public final int hashCode() {
        return this.f25489.hashCode();
    }

    @Override // l.AbstractC13487
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1848(AbstractC13487 abstractC13487) {
        return this.f25489.compareTo(((C7740) abstractC13487).f25489);
    }

    @Override // l.InterfaceC6052
    /* JADX INFO: renamed from: ۙ */
    public final String mo1843() {
        return this.f25489.m19306();
    }

    public final String toString() {
        return "proto{" + this.f25489.m19306() + '}';
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C6994 m21068() {
        return this.f25489;
    }

    @Override // l.InterfaceC22239
    public final C5085 getType() {
        return C5085.f17763;
    }
}
