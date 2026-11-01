package l;

import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

/* JADX INFO: renamed from: l.۬ۡ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: X598 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13008 extends URLStreamHandler {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f43379 = C13488.m32997(C13008.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC19067 f43380;

    @Override // java.net.URLStreamHandler
    public final int getDefaultPort() {
        return 445;
    }

    public C13008() {
    }

    public C13008(InterfaceC19067 interfaceC19067) {
        this.f43380 = interfaceC19067;
    }

    @Override // java.net.URLStreamHandler
    public final URLConnection openConnection(URL url) {
        InterfaceC4314 interfaceC4314 = f43379;
        if (interfaceC4314.mo12125()) {
            interfaceC4314.mo12135("Opening file " + url);
        }
        if (this.f43380 == null) {
            this.f43380 = C5431.m15009();
        }
        return new C17241(url, this.f43380);
    }

    @Override // java.net.URLStreamHandler
    public final void parseURL(URL url, String str, int i, int i2) {
        String host = url.getHost();
        if (str.equals("smb://")) {
            i2 += 2;
            str = "smb:////";
        } else if (!str.startsWith("smb://") && host != null && host.length() == 0) {
            str = "//".concat(str);
            i2 += 2;
        }
        super.parseURL(url, str, i, i2);
        String path = url.getPath();
        String ref = url.getRef();
        if (ref != null) {
            path = path + '#' + ref;
        }
        String str2 = path;
        int port = url.getPort();
        setURL(url, "smb", url.getHost(), port == -1 ? 445 : port, url.getAuthority(), url.getUserInfo(), str2, url.getQuery(), null);
    }
}
