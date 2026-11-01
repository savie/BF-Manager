package l;

/* JADX INFO: renamed from: l.᩻۟ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 532I */
/* JADX INFO: loaded from: classes2.dex */
public final class C23556 extends AbstractC12267 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final int f76283 = Integer.numberOfLeadingZeros(31);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final AbstractC14384 f76284 = new C23556("CharMatcher.whitespace()");

    @Override // l.AbstractC14384
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1772(char c) {
        return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c) >>> f76283) == c;
    }
}
