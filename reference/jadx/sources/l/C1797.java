package l;

/* JADX INFO: renamed from: l.֫ۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7S3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1797 implements CharSequence {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f6948;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final CharSequence f6949;

    public C1797(int i, CharSequence charSequence) {
        this.f6949 = charSequence;
        this.f6948 = Math.min(charSequence.length(), i);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f6948;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        int i2 = this.f6948;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(C2271.m6967("Index: ", i, i2, ", Length: "));
        }
        return this.f6949.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        int i3 = this.f6948;
        if (i >= 0 && i2 >= 0 && i <= i2 && i2 <= i3) {
            return this.f6949.subSequence(i, i2);
        }
        StringBuilder sbM2791 = C0589.m2791("start: ", i, ", end: ", ", length: ", i2);
        sbM2791.append(i3);
        throw new IndexOutOfBoundsException(sbM2791.toString());
    }
}
