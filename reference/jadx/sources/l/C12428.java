package l;

import java.io.IOException;
import java.net.Socket;
import java.util.Comparator;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: l.ۨܳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: V4F9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12428 extends AbstractC4906 {
    @Override // l.AbstractC4906
    /* JADX INFO: renamed from: ۙ */
    public final void mo15056(C1988 c1988, String str) {
        c1988.m6810(str);
    }

    @Override // l.AbstractC4906
    /* JADX INFO: renamed from: ۙ */
    public final void mo15057(C1988 c1988, String str, String str2) {
        c1988.m6814(str, str2);
    }

    @Override // l.AbstractC4906
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo15059(C19273 c19273, C14600 c14600) {
        return c19273.m44618(c14600);
    }

    @Override // l.AbstractC4906
    /* JADX INFO: renamed from: ۙ */
    public final C14600 mo15053(C19273 c19273, C13306 c13306, C19076 c19076, C7208 c7208) {
        return c19273.m44617(c13306, c19076, c7208);
    }

    @Override // l.AbstractC4906
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo15058(C13306 c13306, C13306 c13307) {
        return c13306.m32864(c13307);
    }

    @Override // l.AbstractC4906
    /* JADX INFO: renamed from: ۙ */
    public final Socket mo15052(C19273 c19273, C13306 c13306, C19076 c19076) {
        return c19273.m44616(c13306, c19076);
    }

    @Override // l.AbstractC4906
    /* JADX INFO: renamed from: ۙ */
    public final void mo15055(C1374 c1374, SSLSocket sSLSocket, boolean z) {
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        String[] strArr = c1374.f4905;
        String[] strArr2 = c1374.f4902;
        if (strArr2 != null) {
            enabledCipherSuites = C19822.m45607(C0628.f2455, sSLSocket.getEnabledCipherSuites(), strArr2);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (strArr != null) {
            enabledProtocols = C19822.m45607(C19822.f63725, sSLSocket.getEnabledProtocols(), strArr);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        Comparator comparator = C0628.f2455;
        byte[] bArr = C19822.f63715;
        int length = supportedCipherSuites.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (((C18527) comparator).compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i++;
            }
        }
        if (z && i != -1) {
            String str = supportedCipherSuites[i];
            int length2 = enabledCipherSuites.length;
            String[] strArr3 = new String[length2 + 1];
            System.arraycopy(enabledCipherSuites, 0, strArr3, 0, enabledCipherSuites.length);
            strArr3[length2] = str;
            enabledCipherSuites = strArr3;
        }
        C10322 c10322 = new C10322();
        c10322.f32924 = c1374.f4903;
        c10322.f32923 = strArr2;
        c10322.f32926 = strArr;
        c10322.f32925 = c1374.f4904;
        c10322.m26593(enabledCipherSuites);
        c10322.m26596(enabledProtocols);
        C1374 c1375 = new C1374(c10322);
        String[] strArr4 = c1375.f4905;
        if (strArr4 != null) {
            sSLSocket.setEnabledProtocols(strArr4);
        }
        String[] strArr5 = c1375.f4902;
        if (strArr5 != null) {
            sSLSocket.setEnabledCipherSuites(strArr5);
        }
    }

    @Override // l.AbstractC4906
    /* JADX INFO: renamed from: ᩷ */
    public final void mo15060(C19273 c19273, C14600 c14600) {
        c19273.m44619(c14600);
    }

    @Override // l.AbstractC4906
    /* JADX INFO: renamed from: ۙ */
    public final C17354 mo15054(C19273 c19273) {
        return c19273.f62322;
    }

    @Override // l.AbstractC4906
    /* JADX INFO: renamed from: ۙ */
    public final int mo15050(C1242 c1242) {
        return c1242.f4494;
    }

    @Override // l.AbstractC4906
    /* JADX INFO: renamed from: ۙ */
    public final IOException mo15051(InterfaceC6595 interfaceC6595, IOException iOException) {
        return ((C18395) interfaceC6595).m42901(iOException);
    }
}
