package l;

/* JADX INFO: renamed from: l.ܽܶܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BAP */
/* JADX INFO: loaded from: classes5.dex */
public final class C16727 extends AbstractC23783 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C1909 f53562;

    @Override // l.AbstractC9901
    /* JADX INFO: renamed from: ֨ */
    public final String mo2375() {
        return "proto";
    }

    @Override // l.AbstractC9901
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo2379() {
        return false;
    }

    public C16727(C1909 c1909) {
        this.f53562 = c1909;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C16727) {
            return this.f53562.equals(((C16727) obj).f53562);
        }
        return false;
    }

    public final int hashCode() {
        return this.f53562.hashCode();
    }

    @Override // l.AbstractC9901
    /* JADX INFO: renamed from: ܰ */
    public final int mo2378(AbstractC9901 abstractC9901) {
        return this.f53562.compareTo(((C16727) abstractC9901).f53562);
    }

    @Override // l.InterfaceC19653
    /* JADX INFO: renamed from: ۙ */
    public final String mo2376() {
        return this.f53562.m6219();
    }

    public final String toString() {
        return "proto{" + this.f53562.m6219() + '}';
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C1909 m39215() {
        return this.f53562;
    }

    @Override // l.InterfaceC4919
    public final C3320 getType() {
        return C3320.f12267;
    }
}
