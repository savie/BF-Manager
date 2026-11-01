package l;

/* JADX INFO: renamed from: l.ܽ۟ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 532I */
/* JADX INFO: loaded from: classes5.dex */
public final class C16500 extends AbstractC15795 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final char f53017;

    @Override // l.AbstractC15795, l.AbstractC14384
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC14384 mo27209() {
        throw null;
    }

    public C16500(char c) {
        this.f53017 = c;
    }

    @Override // l.AbstractC14384
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1772(char c) {
        return c != this.f53017;
    }

    public final String toString() {
        return C22697.m50267(new StringBuilder("CharMatcher.isNot('"), AbstractC14384.m34619(this.f53017), "')");
    }
}
