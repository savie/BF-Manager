package l;

/* JADX INFO: renamed from: l.᩺۫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75HT */
/* JADX INFO: loaded from: classes.dex */
public final class C22994 extends AbstractC18054 {
    public static final long serialVersionUID = 0;

    @Override // l.AbstractC18054, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((AbstractC18054) obj);
    }

    @Override // l.AbstractC18054
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo18344(Comparable comparable) {
        int i = C9548.f32245;
        return this.f57718.compareTo(comparable) < 0;
    }

    @Override // l.AbstractC18054
    /* JADX INFO: renamed from: ܰ */
    public final EnumC18179 mo18346() {
        return EnumC18179.OPEN;
    }

    @Override // l.AbstractC18054
    /* JADX INFO: renamed from: ۚ */
    public final EnumC18179 mo18345() {
        return EnumC18179.CLOSED;
    }

    @Override // l.AbstractC18054
    /* JADX INFO: renamed from: ۙ */
    public final void mo18343(StringBuilder sb) {
        sb.append('(');
        sb.append(this.f57718);
    }

    @Override // l.AbstractC18054
    /* JADX INFO: renamed from: ܰ */
    public final void mo18347(StringBuilder sb) {
        sb.append(this.f57718);
        sb.append(']');
    }

    @Override // l.AbstractC18054
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC18054 mo36486(AbstractC8177 abstractC8177) {
        ((C18760) abstractC8177).getClass();
        int iIntValue = ((Integer) this.f57718).intValue();
        Integer numValueOf = iIntValue == Integer.MAX_VALUE ? null : Integer.valueOf(iIntValue + 1);
        if (numValueOf == null) {
            return C6765.f22852;
        }
        return new C21582(numValueOf);
    }

    @Override // l.AbstractC18054
    public final int hashCode() {
        return ~this.f57718.hashCode();
    }

    public final String toString() {
        return "/" + this.f57718 + "\\";
    }
}
