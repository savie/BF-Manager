package l;

/* JADX INFO: renamed from: l.ۘܿۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: N7T6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4078 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C4078 f14988 = new C4078(new C13252());

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f14989;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f14990;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f14991;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f14992;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC23844 f14993;

    public C4078(C13252 c13252) {
        this.f14993 = c13252.f44019;
        this.f14989 = c13252.f44015;
        this.f14990 = c13252.f44016;
        this.f14992 = c13252.f44018;
        this.f14991 = c13252.f44017;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4078)) {
            return false;
        }
        C4078 c4078 = (C4078) obj;
        return this.f14993.equals(c4078.f14993) && this.f14990 == c4078.f14990 && this.f14989 == c4078.f14989 && this.f14992 == c4078.f14992 && this.f14991 == c4078.f14991;
    }

    public final int hashCode() {
        return C13638.hash(this.f14993, null, null, Boolean.valueOf(this.f14989), Boolean.valueOf(this.f14990), Boolean.valueOf(this.f14992), Boolean.valueOf(this.f14991));
    }
}
