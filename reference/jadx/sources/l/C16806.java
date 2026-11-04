package l;

/* JADX INFO: renamed from: l.ܺۧ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M6O6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16806 implements CharSequence {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C25012 f54229;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final CharSequence f54230;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f54231;

    public C16806(CharSequence charSequence, C25012 c25012) {
        this.f54230 = charSequence;
        this.f54229 = c25012;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f54230.length();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        int i2 = this.f54231 + 1;
        this.f54231 = i2;
        if ((i2 & 1023) == 0) {
            this.f54229.m55844();
        }
        return this.f54230.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C18334(i, i2, this);
    }
}
