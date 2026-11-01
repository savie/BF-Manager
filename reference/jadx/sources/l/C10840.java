package l;

/* JADX INFO: renamed from: l.ۧۜ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: X1XW */
/* JADX INFO: loaded from: classes3.dex */
public final class C10840 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f36894;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f36895;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f36896;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC2557 f36897;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f36898;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f36899;

    public C10840(InterfaceC2557 interfaceC2557) {
        this(interfaceC2557.getName(), interfaceC2557.getParent(), true, false);
        this.f36897 = interfaceC2557;
    }

    public C10840(String str, String str2, boolean z, boolean z2) {
        this.f36896 = str;
        this.f36899 = str2;
        this.f36894 = z;
        this.f36895 = z2;
        if (str.contains("/") || !str2.startsWith("/") || !str2.endsWith("/")) {
            throw new IllegalArgumentException(C7997.m21055("name: ", str, " parent: ", str2));
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m27170() {
        return this.f36896;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String m27169() {
        String strReplaceAll = this.f36896.replaceAll("[:\\\\*?<>\"|]", "_");
        if (strReplaceAll.length() <= 200) {
            return strReplaceAll;
        }
        String strM46686 = AbstractC20745.m46686(strReplaceAll);
        String strSubstring = strReplaceAll.substring(0, strReplaceAll.length() - strM46686.length());
        if (strSubstring.length() > 50) {
            strSubstring = strSubstring.substring(0, 50);
        }
        if (strM46686.length() > 50) {
            strM46686 = strM46686.substring(0, 50);
        }
        return C15489.m37076(strSubstring, strM46686);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m27174() {
        return this.f36899;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m27178() {
        return this.f36899 + this.f36896;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m27176() {
        return this.f36895;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m27171() {
        return this.f36894;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27172() {
        if (this.f36894 && this.f36898 == null) {
            throw new RuntimeException("Failed to get file: " + this.f36896);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27173(AbstractC20745 abstractC20745) {
        this.f36898 = abstractC20745;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 m27177() {
        return this.f36898;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2557 m27175() {
        return this.f36897;
    }
}
