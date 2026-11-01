package l;

/* JADX INFO: renamed from: l.᩵֡ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7LP */
/* JADX INFO: loaded from: classes4.dex */
public final class C19111 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f61747;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C22137 f61748;

    public C19111(C8528 c8528, AbstractC8774 abstractC8774) {
        this.f61747 = abstractC8774.f30189;
        this.f61748 = c8528.f29531.m48186();
    }

    public final int hashCode() {
        return this.f61747 << (this.f61748.hashCode() + 16);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19111)) {
            return false;
        }
        C19111 c19111 = (C19111) obj;
        return this.f61747 == c19111.f61747 && this.f61748 == c19111.f61748;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C22137 c22137 = this.f61748;
        sb.append(c22137.m49095().getName());
        sb.append(" @ ");
        sb.append(c22137.m49096(this.f61747));
        return sb.toString();
    }
}
