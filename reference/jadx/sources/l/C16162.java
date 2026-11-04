package l;

/* JADX INFO: renamed from: l.ܶܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75HT */
/* JADX INFO: loaded from: classes5.dex */
public final class C16162 extends AbstractC20638 {
    public static final long serialVersionUID = 0;

    @Override // l.AbstractC20638, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((AbstractC20638) obj);
    }

    @Override // l.AbstractC20638
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo11449(Comparable comparable) {
        int i = C2346.f7567;
        return this.f66190.compareTo(comparable) < 0;
    }

    @Override // l.AbstractC20638
    /* JADX INFO: renamed from: ᩸ */
    public final EnumC3616 mo11452() {
        return EnumC3616.OPEN;
    }

    @Override // l.AbstractC20638
    /* JADX INFO: renamed from: ᩴ */
    public final EnumC3616 mo11450() {
        return EnumC3616.CLOSED;
    }

    @Override // l.AbstractC20638
    /* JADX INFO: renamed from: ۙ */
    public final void mo11448(StringBuilder sb) {
        sb.append('(');
        sb.append(this.f66190);
    }

    @Override // l.AbstractC20638
    /* JADX INFO: renamed from: ᩷ */
    public final void mo11451(StringBuilder sb) {
        sb.append(this.f66190);
        sb.append(']');
    }

    @Override // l.AbstractC20638
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC20638 mo38339(AbstractC6468 abstractC6468) {
        ((C12433) abstractC6468).getClass();
        int iIntValue = ((Integer) this.f66190).intValue();
        Integer numValueOf = iIntValue == Integer.MAX_VALUE ? null : Integer.valueOf(iIntValue + 1);
        if (numValueOf == null) {
            return C17654.f58034;
        }
        return new C3484(numValueOf);
    }

    @Override // l.AbstractC20638
    public final int hashCode() {
        return ~this.f66190.hashCode();
    }

    public final String toString() {
        return "/" + this.f66190 + "\\";
    }
}
