package l;

/* JADX INFO: renamed from: l.ܳܿ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 0APD */
/* JADX INFO: loaded from: classes4.dex */
public final class C14678 implements CharSequence {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final CharSequence f47983;

    public C14678(CharSequence charSequence) {
        this.f47983 = charSequence;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f47983.length();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return Character.toLowerCase(this.f47983.charAt(i));
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C14678(this.f47983.subSequence(i, i2));
    }
}
