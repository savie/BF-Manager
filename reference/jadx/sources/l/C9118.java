package l;

import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۡۘ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AII */
/* JADX INFO: loaded from: classes4.dex */
public final class C9118 extends C1727 implements InterfaceC0916 {

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public String f29611;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final C9864 f29612;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public String f29613;

    public C9118(C9864 c9864) {
        this.f29612 = c9864;
        m27211();
        m27209();
        m6100();
    }

    @Override // l.InterfaceC0916
    public final C9864 getKey() {
        return this.f29612;
    }

    @Override // l.C15150, l.InterfaceC0916
    /* JADX INFO: renamed from: ۤ */
    public final int mo3694(String str, String str2) throws SocketException, SocketTimeoutException {
        try {
            return super.mo3694(str, str2);
        } catch (SocketException e) {
            String message = e.getMessage();
            if ("Broken pipe".equalsIgnoreCase(message) || "Software caused connection abort".equalsIgnoreCase(message)) {
                try {
                    mo6118();
                } catch (IOException unused) {
                }
            }
            throw e;
        } catch (SocketTimeoutException e2) {
            try {
                mo6118();
            } catch (IOException unused2) {
            }
            throw e2;
        }
    }

    @Override // l.InterfaceC0916
    /* JADX INFO: renamed from: ۫ */
    public final IOException mo3698() throws SocketException {
        String strM36450 = m36450();
        String strValueOf = String.valueOf(m36451());
        throw new SocketException(strM36450.contains(strValueOf) ? "FTP reply: ".concat(strM36450) : ExternalValue$$ExternalSyntheticOutline0.m("FTP reply ", strValueOf, ": ", strM36450));
    }

    @Override // l.InterfaceC0916
    public final String getPath() {
        return this.f29611;
    }

    @Override // l.InterfaceC0916
    /* JADX INFO: renamed from: ֫ */
    public final String mo3684() {
        return this.f29613;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static String m24272(String str) {
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

    @Override // l.InterfaceC0916
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo3708(String str) throws SocketException {
        if (AbstractC7364.m20187(str).equals(this.f29611)) {
            return true;
        }
        if (!C24087.m53643(m36446(EnumC24848.CWD, str))) {
            return false;
        }
        mo3701();
        return true;
    }

    @Override // l.InterfaceC0916
    /* JADX INFO: renamed from: ܳ */
    public final String mo3701() throws SocketException {
        String strM24272 = m36446(EnumC24848.PWD, (String) null) != 257 ? null : m24272((String) j$$ExternalSyntheticOutline0.m(this.f49434, 1));
        if (strM24272 == null) {
            mo3698();
            throw null;
        }
        String strM20187 = AbstractC7364.m20187(strM24272);
        this.f29611 = strM20187;
        if (this.f29613 == null) {
            this.f29613 = strM20187;
        }
        return strM24272;
    }
}
