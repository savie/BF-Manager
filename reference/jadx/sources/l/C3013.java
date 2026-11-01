package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.ۗۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: G4EY */
/* JADX INFO: loaded from: classes2.dex */
public final class C3013 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f11267;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C14511 f11268;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C14511 f11269;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C14511 f11262 = C14511.m34934(":");

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C14511 f11264 = C14511.m34934(":status");

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C14511 f11261 = C14511.m34934(":method");

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final C14511 f11265 = C14511.m34934(":path");

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final C14511 f11263 = C14511.m34934(":scheme");

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C14511 f11266 = C14511.m34934(":authority");

    public C3013(String str, String str2) {
        this(C14511.m34934(str), C14511.m34934(str2));
    }

    public C3013(C14511 c14511, String str) {
        this(c14511, C14511.m34934(str));
    }

    public C3013(C14511 c14511, C14511 c14512) {
        this.f11269 = c14511;
        this.f11268 = c14512;
        this.f11267 = c14512.mo34938() + c14511.mo34938() + 32;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3013) {
            C3013 c3013 = (C3013) obj;
            if (this.f11269.equals(c3013.f11269) && this.f11268.equals(c3013.f11268)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f11268.hashCode() + ((this.f11269.hashCode() + 527) * 31);
    }

    public final String toString() {
        String strMo34948 = this.f11269.mo34948();
        String strMo34949 = this.f11268.mo34948();
        byte[] bArr = C0140.f1168;
        Locale locale = Locale.US;
        return C1679.m5594(strMo34948, ": ", strMo34949);
    }
}
