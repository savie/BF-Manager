package l;

/* JADX INFO: renamed from: l.ۧ֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5I2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11273 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f35570;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C4245 f35571;

    public C11273(C18415 c18415, boolean z) {
        this.f35571 = c18415.matcher("");
        this.f35570 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m28527(String str) {
        C4245 c4245 = this.f35571;
        c4245.m13568reset((CharSequence) str);
        return this.f35570 ? c4245.matches() : c4245.find();
    }
}
