package l;

/* JADX INFO: renamed from: l.ۨۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 87S9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11647 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence f39162;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C0316 f39163;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11647 m29101(CharSequence charSequence, C0316 c0316) {
        return new C11647(charSequence, c0316);
    }

    public C11647(CharSequence charSequence, C0316 c0316) {
        C13638.requireNonNull(charSequence, "content must not be null");
        this.f39162 = charSequence;
        this.f39163 = c0316;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence m29102() {
        return this.f39162;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C0316 m29104() {
        return this.f39163;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11647 m29103(int i, int i2) {
        int i3;
        CharSequence charSequenceSubSequence = this.f39162.subSequence(i, i2);
        C0316 c0316 = this.f39163;
        return new C11647(charSequenceSubSequence, (c0316 == null || (i3 = i2 - i) == 0) ? null : C0316.m1947(c0316.m1948(), c0316.m1949() + i, c0316.m1953() + i, i3));
    }
}
