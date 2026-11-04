package l;

/* JADX INFO: renamed from: l.ۡ۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 532I */
/* JADX INFO: loaded from: classes4.dex */
public final class C9404 extends AbstractC19101 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final char f30524;

    @Override // l.AbstractC19101, l.AbstractC21825
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC21825 mo23311() {
        throw null;
    }

    public C9404(char c) {
        this.f30524 = c;
    }

    @Override // l.AbstractC21825
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4420(char c) {
        return c != this.f30524;
    }

    public final String toString() {
        return C8947.m23910(new StringBuilder("CharMatcher.isNot('"), AbstractC21825.m49480(this.f30524), "')");
    }
}
