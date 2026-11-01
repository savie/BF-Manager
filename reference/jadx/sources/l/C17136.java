package l;

/* JADX INFO: renamed from: l.ܿۚ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: X44P */
/* JADX INFO: loaded from: classes4.dex */
public final class C17136 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC3800 f54651;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16431 f54652;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f54653;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f54653 - ((C17136) obj).f54653;
    }

    public C17136(InterfaceC3800 interfaceC3800, InterfaceC16431 interfaceC16431, int i) {
        this.f54651 = interfaceC3800;
        this.f54652 = interfaceC16431;
        this.f54653 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17136)) {
            return false;
        }
        C17136 c17136 = (C17136) obj;
        return this.f54651.equals(c17136.f54651) && this.f54652.equals(c17136.f54652) && this.f54653 == c17136.f54653;
    }

    public final int hashCode() {
        return C13638.hash(this.f54651, this.f54652, Integer.valueOf(this.f54653));
    }
}
