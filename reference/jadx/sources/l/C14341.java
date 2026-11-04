package l;

/* JADX INFO: renamed from: l.ܰۘܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1LA */
/* JADX INFO: loaded from: classes4.dex */
public final class C14341 implements CharSequence {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final CharSequence f45236;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final CharSequence f45237;

    public C14341(CharSequence charSequence, CharSequence charSequence2) {
        this.f45236 = charSequence;
        this.f45237 = charSequence2;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f45237.length() + this.f45236.length();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        CharSequence charSequence = this.f45236;
        if (i < charSequence.length()) {
            return charSequence.charAt(i);
        }
        return this.f45237.charAt(i - charSequence.length());
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i == 0 && i2 == length()) {
            return this;
        }
        CharSequence charSequence = this.f45236;
        if (i < charSequence.length() && i2 < charSequence.length()) {
            return charSequence.subSequence(i, i2);
        }
        int length = charSequence.length();
        CharSequence charSequence2 = this.f45237;
        if (i >= length && i2 >= charSequence.length()) {
            return charSequence2.subSequence(i - charSequence.length(), i2 - charSequence.length());
        }
        return new C14341(charSequence.subSequence(i, charSequence.length()), charSequence2.subSequence(0, i2 - charSequence.length()));
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return ((Object) this.f45236) + this.f45237.toString();
    }
}
