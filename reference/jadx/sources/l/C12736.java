package l;

/* JADX INFO: renamed from: l.۫᩻ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6O6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12736 implements CharSequence {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final CharSequence f42481;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C16969 f42482;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f42483;

    public C12736(CharSequence charSequence, C16969 c16969) {
        this.f42481 = charSequence;
        this.f42482 = c16969;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f42481.length();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        int i2 = this.f42483 + 1;
        this.f42483 = i2;
        if ((i2 & 1023) == 0) {
            this.f42482.m39762();
        }
        return this.f42481.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C17499(i, i2, this);
    }
}
