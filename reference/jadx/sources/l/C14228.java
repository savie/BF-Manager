package l;

/* JADX INFO: renamed from: l.ܰ֡ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 87S9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14228 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence f44956;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C5280 f44957;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14228 m34536(CharSequence charSequence, C5280 c5280) {
        return new C14228(charSequence, c5280);
    }

    public C14228(CharSequence charSequence, C5280 c5280) {
        C17359.requireNonNull(charSequence, "content must not be null");
        this.f44956 = charSequence;
        this.f44957 = c5280;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence m34537() {
        return this.f44956;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C5280 m34539() {
        return this.f44957;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14228 m34538(int i, int i2) {
        int i3;
        CharSequence charSequenceSubSequence = this.f44956.subSequence(i, i2);
        C5280 c5280 = this.f44957;
        return new C14228(charSequenceSubSequence, (c5280 == null || (i3 = i2 - i) == 0) ? null : C5280.m15866(c5280.m15872(), c5280.m15867() + i, c5280.m15871() + i, i3));
    }
}
