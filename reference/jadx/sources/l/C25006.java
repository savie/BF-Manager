package l;

/* JADX INFO: renamed from: l.᩻ۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4TV */
/* JADX INFO: loaded from: classes.dex */
public final class C25006 implements InterfaceC2630 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4245 f80943;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C11974 f80944;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C18415 f80945;

    public C25006(C18415 c18415, C11974 c11974) {
        this.f80945 = c18415;
        this.f80943 = c18415.matcher("");
        this.f80944 = c11974;
    }

    @Override // l.InterfaceC2630
    /* JADX INFO: renamed from: ۙ */
    public final C11974 mo4795(int i, int i2, CharSequence charSequence) {
        C4245 c4245 = this.f80943;
        try {
            c4245.m13568reset(charSequence);
            c4245.m13567region(i, i2);
            if (c4245.matches()) {
                return this.f80944;
            }
            return null;
        } finally {
            c4245.m13568reset((CharSequence) "");
        }
    }
}
