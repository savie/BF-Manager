package l;

import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;

/* JADX INFO: renamed from: l.ۛܶ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AII */
/* JADX INFO: loaded from: classes3.dex */
public final class C6130 extends C16730 implements InterfaceC17419 {

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public String f20931;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final C12481 f20932;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public String f20933;

    public C6130(C12481 c12481) {
        this.f20932 = c12481;
        m23284();
        m23271();
        m39218();
    }

    @Override // l.InterfaceC17419
    public final C12481 getKey() {
        return this.f20932;
    }

    @Override // l.C20963, l.InterfaceC17419
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int mo17115(String str, String str2) throws SocketException, SocketTimeoutException {
        try {
            return super.mo17115(str, str2);
        } catch (SocketException e) {
            String message = e.getMessage();
            if ("Broken pipe".equalsIgnoreCase(message) || "Software caused connection abort".equalsIgnoreCase(message)) {
                try {
                    mo23286();
                } catch (IOException unused) {
                }
            }
            throw e;
        } catch (SocketTimeoutException e2) {
            try {
                mo23286();
            } catch (IOException unused2) {
            }
            throw e2;
        }
    }

    @Override // l.InterfaceC17419
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final IOException mo17113() throws SocketException {
        String strM47142 = m47142();
        String strValueOf = String.valueOf(m47139());
        throw new SocketException(strM47142.contains(strValueOf) ? "FTP reply: ".concat(strM47142) : C7997.m21055("FTP reply ", strValueOf, ": ", strM47142));
    }

    @Override // l.InterfaceC17419
    public final String getPath() {
        return this.f20933;
    }

    @Override // l.InterfaceC17419
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String mo17114() {
        return this.f20931;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static String m17112(String str) {
        String strSubstring = str.substring(4);
        if (strSubstring.startsWith("当前目录是")) {
            strSubstring = strSubstring.substring(5);
        }
        if (!strSubstring.startsWith("\"")) {
            return strSubstring;
        }
        StringBuilder sb = new StringBuilder(strSubstring.length());
        boolean z = false;
        for (int i = 1; i < strSubstring.length(); i++) {
            char cCharAt = strSubstring.charAt(i);
            if (cCharAt != '\"') {
                if (z) {
                    return sb.toString();
                }
                sb.append(cCharAt);
            } else if (z) {
                sb.append(cCharAt);
                z = false;
            } else {
                z = true;
            }
        }
        return z ? sb.toString() : strSubstring;
    }

    @Override // l.InterfaceC17419
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo17116(String str) throws SocketException {
        if (AbstractC11462.m28608(str).equals(this.f20933)) {
            return true;
        }
        if (!C13571.m33171(m47136(EnumC17435.CWD, str))) {
            return false;
        }
        mo17117();
        return true;
    }

    @Override // l.InterfaceC17419
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String mo17117() throws SocketException {
        String strM17112 = m47136(EnumC17435.PWD, (String) null) != 257 ? null : m17112((String) C19084.m43861(this.f68303, 1));
        if (strM17112 == null) {
            mo17113();
            throw null;
        }
        String strM28608 = AbstractC11462.m28608(strM17112);
        this.f20933 = strM28608;
        if (this.f20931 == null) {
            this.f20931 = strM28608;
        }
        return strM17112;
    }
}
