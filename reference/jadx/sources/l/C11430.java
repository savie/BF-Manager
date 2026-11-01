package l;

import java.io.IOException;
import java.net.Socket;
import java.util.Comparator;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: l.ۨۗ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: V4F9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11430 extends AbstractC7196 {
    @Override // l.AbstractC7196
    /* JADX INFO: renamed from: ۙ */
    public final void mo19137(C5972 c5972, String str) {
        c5972.m16266(str);
    }

    @Override // l.AbstractC7196
    /* JADX INFO: renamed from: ۙ */
    public final void mo19138(C5972 c5972, String str, String str2) {
        c5972.m16270(str, str2);
    }

    @Override // l.AbstractC7196
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo19141(C22906 c22906, C0896 c0896) {
        return c22906.m50688(c0896);
    }

    @Override // l.AbstractC7196
    /* JADX INFO: renamed from: ۙ */
    public final C0896 mo19135(C22906 c22906, C16328 c16328, C15009 c15009, C8608 c8608) {
        return c22906.m50687(c16328, c15009, c8608);
    }

    @Override // l.AbstractC7196
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo19140(C16328 c16328, C16328 c16329) {
        return c16328.m38500(c16329);
    }

    @Override // l.AbstractC7196
    /* JADX INFO: renamed from: ۙ */
    public final Socket mo19134(C22906 c22906, C16328 c16328, C15009 c15009) {
        return c22906.m50686(c16328, c15009);
    }

    @Override // l.AbstractC7196
    /* JADX INFO: renamed from: ۙ */
    public final void mo19139(C21494 c21494, SSLSocket sSLSocket, boolean z) {
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        String[] strArr = c21494.f69846;
        String[] strArr2 = c21494.f69847;
        if (strArr2 != null) {
            enabledCipherSuites = C0140.m1237(C3854.f14396, sSLSocket.getEnabledCipherSuites(), strArr2);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (strArr != null) {
            enabledProtocols = C0140.m1237(C0140.f1169, sSLSocket.getEnabledProtocols(), strArr);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        Comparator comparator = C3854.f14396;
        byte[] bArr = C0140.f1168;
        int length = supportedCipherSuites.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (((C13028) comparator).compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
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
        C15145 c15145 = new C15145();
        c15145.f49480 = c21494.f69848;
        c15145.f49479 = strArr2;
        c15145.f49478 = strArr;
        c15145.f49481 = c21494.f69849;
        c15145.m36311(enabledCipherSuites);
        c15145.m36314(enabledProtocols);
        C21494 c21495 = new C21494(c15145);
        String[] strArr4 = c21495.f69846;
        if (strArr4 != null) {
            sSLSocket.setEnabledProtocols(strArr4);
        }
        String[] strArr5 = c21495.f69847;
        if (strArr5 != null) {
            sSLSocket.setEnabledCipherSuites(strArr5);
        }
    }

    @Override // l.AbstractC7196
    /* JADX INFO: renamed from: ܰ */
    public final void mo19142(C22906 c22906, C0896 c0896) {
        c22906.m50689(c0896);
    }

    @Override // l.AbstractC7196
    /* JADX INFO: renamed from: ۙ */
    public final C22874 mo19136(C22906 c22906) {
        return c22906.f74467;
    }

    @Override // l.AbstractC7196
    /* JADX INFO: renamed from: ۙ */
    public final int mo19132(C17779 c17779) {
        return c17779.f56376;
    }

    @Override // l.AbstractC7196
    /* JADX INFO: renamed from: ۙ */
    public final IOException mo19133(InterfaceC11617 interfaceC11617, IOException iOException) {
        return ((C3667) interfaceC11617).m10828(iOException);
    }
}
