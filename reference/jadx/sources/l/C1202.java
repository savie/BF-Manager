package l;

/* JADX INFO: renamed from: l.֨۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 532I */
/* JADX INFO: loaded from: classes3.dex */
public final class C1202 extends AbstractC19101 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final char f4371;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final char f4372;

    public C1202(char c, char c2) {
        this.f4371 = c;
        this.f4372 = c2;
    }

    @Override // l.AbstractC21825
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo4420(char c) {
        return c == this.f4371 || c == this.f4372;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
        sb.append(AbstractC21825.m49480(this.f4371));
        return C8947.m23910(sb, AbstractC21825.m49480(this.f4372), "\")");
    }
}
