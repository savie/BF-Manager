package l;

/* JADX INFO: renamed from: l.ۧۖܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18UV */
/* JADX INFO: loaded from: classes3.dex */
public final class C10710 extends AbstractC2324 implements Comparable {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f36529;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f36530;

    @Override // l.AbstractC2324
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ boolean mo3635(AbstractC2324 abstractC2324) {
        return false;
    }

    public C10710(int i, C17216 c17216, int i2, C1536 c1536, int i3) {
        int i4;
        super(i, c17216, i2);
        this.f36530 = C13958.m33815(i3, c1536.f6243) ? 1 : 0;
        C7648 c7648 = this.f8252;
        int i5 = c7648.f25246;
        int i6 = -1;
        if (i5 != -1 && (i4 = c7648.f25253) != -1) {
            i6 = i5 * i4;
        }
        this.f36529 = i6;
    }

    @Override // l.AbstractC2324
    /* JADX INFO: renamed from: ۙ */
    public final int mo3634() {
        return this.f36530;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C10710 c10710) {
        return Integer.compare(this.f36529, c10710.f36529);
    }
}
