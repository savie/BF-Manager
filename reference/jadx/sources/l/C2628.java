package l;

/* JADX INFO: renamed from: l.ۖܺ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: B3ZP */
/* JADX INFO: loaded from: classes2.dex */
public final class C2628 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11948 f10256;

    public C2628(C11948 c11948) {
        this.f10256 = c11948;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m8107(AbstractC5930 abstractC5930) {
        C11948 c11948 = this.f10256;
        C22137 c22137M29761 = c11948.m29761();
        long lineNumber = c11948.getLineNumber();
        long jM49096 = c22137M29761.m49096(abstractC5930.f30189);
        long jM49094 = c22137M29761.m49094(abstractC5930.f30189, false);
        if (jM49096 == lineNumber) {
            return String.valueOf(jM49094);
        }
        return jM49096 + ":" + jM49094;
    }
}
