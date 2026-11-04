package l;

import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܰۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X1XW */
/* JADX INFO: loaded from: classes4.dex */
public final class C14406 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f45397;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC2386 f45398;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f45399;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f45400;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f45401;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f45402;

    public C14406(InterfaceC2386 interfaceC2386) {
        this(interfaceC2386.getName(), interfaceC2386.getParent(), true, false);
        this.f45398 = interfaceC2386;
    }

    public C14406(String str, String str2, boolean z, boolean z2) {
        this.f45400 = str;
        this.f45399 = str2;
        this.f45402 = z;
        this.f45397 = z2;
        if (str.contains("/") || !str2.startsWith("/") || !str2.endsWith("/")) {
            throw new IllegalArgumentException(ExternalValue$$ExternalSyntheticOutline0.m("name: ", str, " parent: ", str2));
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m34846() {
        return this.f45400;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String m34842() {
        String strReplaceAll = this.f45400.replaceAll("[:\\\\*?<>\"|]", "_");
        if (strReplaceAll.length() <= 200) {
            return strReplaceAll;
        }
        String strM49832 = AbstractC22044.m49832(strReplaceAll);
        String strSubstring = strReplaceAll.substring(0, strReplaceAll.length() - strM49832.length());
        if (strSubstring.length() > 50) {
            strSubstring = strSubstring.substring(0, 50);
        }
        if (strM49832.length() > 50) {
            strM49832 = strM49832.substring(0, 50);
        }
        return C14483.m34972(strSubstring, strM49832);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m34844() {
        return this.f45399;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m34843() {
        return this.f45399 + this.f45400;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m34840() {
        return this.f45397;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m34837() {
        return this.f45402;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34838() {
        if (this.f45402 && this.f45401 == null) {
            throw new RuntimeException("Failed to get file: " + this.f45400);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34839(AbstractC22044 abstractC22044) {
        this.f45401 = abstractC22044;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m34845() {
        return this.f45401;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2386 m34841() {
        return this.f45398;
    }
}
