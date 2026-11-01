package l;

/* JADX INFO: renamed from: l.֫֫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: V4E2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1510 extends AbstractC19191 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f6158;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23683 f6159;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C4424 f6160;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f6161;

    public C1510(C4424 c4424, String str, String str2) {
        this.f6160 = c4424;
        this.f6158 = str;
        this.f6161 = str2;
        this.f6159 = C0834.m3437(new C14212(c4424.m12357(1), c4424));
    }

    @Override // l.AbstractC19191
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C9501 mo5213() {
        String str = this.f6158;
        if (str == null) {
            return null;
        }
        try {
            return C9501.m24336(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // l.AbstractC19191
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long mo5212() {
        try {
            String str = this.f6161;
            if (str != null) {
                return Long.parseLong(str);
            }
            return -1L;
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @Override // l.AbstractC19191
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final InterfaceC23683 mo5211() {
        return this.f6159;
    }
}
