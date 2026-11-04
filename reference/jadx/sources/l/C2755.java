package l;

/* JADX INFO: renamed from: l.ۖܶۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAT6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2755 extends AbstractC7230 implements Comparable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f9117;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f9117 - ((C2755) obj).f9117;
    }

    public C2755() {
        this.f9117 = 0;
    }

    public C2755(int i) {
        this.f9117 = i;
    }

    @Override // l.AbstractC7230
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4584(AbstractC9488 abstractC9488, C2777 c2777) {
        return abstractC9488.mo2516(this.f9117);
    }

    @Override // l.AbstractC7230
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC7230 mo4585(AbstractC9488 abstractC9488, C2777 c2777) {
        if (abstractC9488.mo2516(this.f9117)) {
            return C10212.f32654;
        }
        return null;
    }

    public final int hashCode() {
        return this.f9117 + 31;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2755) {
            return this == obj || this.f9117 == ((C2755) obj).f9117;
        }
        return false;
    }

    public final String toString() {
        return C12669.m31437(this.f9117, ">=prec}?", new StringBuilder("{"));
    }
}
