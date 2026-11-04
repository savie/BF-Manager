package l;

/* JADX INFO: renamed from: l.ۗܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75HT */
/* JADX INFO: loaded from: classes3.dex */
public final class C3484 extends AbstractC20638 {
    public static final long serialVersionUID = 0;

    @Override // l.AbstractC20638, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((AbstractC20638) obj);
    }

    @Override // l.AbstractC20638
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo11449(Comparable comparable) {
        int i = C2346.f7567;
        return this.f66190.compareTo(comparable) <= 0;
    }

    @Override // l.AbstractC20638
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC3616 mo11452() {
        return EnumC3616.CLOSED;
    }

    @Override // l.AbstractC20638
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final EnumC3616 mo11450() {
        return EnumC3616.OPEN;
    }

    @Override // l.AbstractC20638
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11448(StringBuilder sb) {
        sb.append('[');
        sb.append(this.f66190);
    }

    @Override // l.AbstractC20638
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo11451(StringBuilder sb) {
        sb.append(this.f66190);
        sb.append(')');
    }

    @Override // l.AbstractC20638
    public final int hashCode() {
        return this.f66190.hashCode();
    }

    public final String toString() {
        return "\\" + this.f66190 + "/";
    }
}
