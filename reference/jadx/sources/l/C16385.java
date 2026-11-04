package l;

/* JADX INFO: renamed from: l.ܶ᩸᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 18UV */
/* JADX INFO: loaded from: classes5.dex */
public final class C16385 extends AbstractC21607 implements Comparable {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f53178;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f53179;

    @Override // l.AbstractC21607
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ boolean mo14151(AbstractC21607 abstractC21607) {
        return false;
    }

    public C16385(int i, C16549 c16549, int i2, C20861 c20861, int i3) {
        int i4;
        super(i, c16549, i2);
        this.f53179 = C14442.m34867(i3, c20861.f66772) ? 1 : 0;
        C15648 c15648 = this.f69019;
        int i5 = c15648.f50814;
        int i6 = -1;
        if (i5 != -1 && (i4 = c15648.f50852) != -1) {
            i6 = i5 * i4;
        }
        this.f53178 = i6;
    }

    @Override // l.AbstractC21607
    /* JADX INFO: renamed from: ۙ */
    public final int mo14149() {
        return this.f53179;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C16385 c16385) {
        return Integer.compare(this.f53178, c16385.f53178);
    }
}
