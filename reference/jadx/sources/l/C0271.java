package l;

/* JADX INFO: renamed from: l.֡۟ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 532I */
/* JADX INFO: loaded from: classes3.dex */
public final class C0271 extends AbstractC15795 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final char f1562;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final char f1563;

    public C0271(char c, char c2) {
        this.f1562 = c;
        this.f1563 = c2;
    }

    @Override // l.AbstractC14384
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo1772(char c) {
        return c == this.f1562 || c == this.f1563;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
        sb.append(AbstractC14384.m34619(this.f1562));
        return C22697.m50267(sb, AbstractC14384.m34619(this.f1563), "\")");
    }
}
