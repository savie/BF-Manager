package l;

/* JADX INFO: renamed from: l.ۢ۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0APD */
/* JADX INFO: loaded from: classes3.dex */
public final class C10129 implements CharSequence {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final CharSequence f32417;

    public C10129(CharSequence charSequence) {
        this.f32417 = charSequence;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f32417.length();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return Character.toLowerCase(this.f32417.charAt(i));
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C10129(this.f32417.subSequence(i, i2));
    }
}
