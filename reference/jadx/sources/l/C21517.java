package l;

/* JADX INFO: renamed from: l.᩶ᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7S3 */
/* JADX INFO: loaded from: classes.dex */
public final class C21517 implements CharSequence {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f68753;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final CharSequence f68754;

    public C21517(int i, CharSequence charSequence) {
        this.f68754 = charSequence;
        this.f68753 = Math.min(charSequence.length(), i);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f68753;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        int i2 = this.f68753;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(C6934.m19217("Index: ", i, i2, ", Length: "));
        }
        return this.f68754.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        int i3 = this.f68753;
        if (i >= 0 && i2 >= 0 && i <= i2 && i2 <= i3) {
            return this.f68754.subSequence(i, i2);
        }
        StringBuilder sbM5126 = C1402.m5126("start: ", i, ", end: ", ", length: ", i2);
        sbM5126.append(i3);
        throw new IndexOutOfBoundsException(sbM5126.toString());
    }
}
