package l;

import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

/* JADX INFO: renamed from: l.۠᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: X598 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8882 extends URLStreamHandler {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f29005 = C16980.m40037(C8882.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC23032 f29006;

    @Override // java.net.URLStreamHandler
    public final int getDefaultPort() {
        return 445;
    }

    public C8882() {
    }

    public C8882(InterfaceC23032 interfaceC23032) {
        this.f29006 = interfaceC23032;
    }

    @Override // java.net.URLStreamHandler
    public final URLConnection openConnection(URL url) {
        InterfaceC25186 interfaceC25186 = f29005;
        if (interfaceC25186.mo13707()) {
            interfaceC25186.mo13721("Opening file " + url);
        }
        if (this.f29006 == null) {
            this.f29006 = C10351.m26627();
        }
        return new C12523(url, this.f29006);
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
            path = C8008.m21875('#', path, ref);
        }
        String str2 = path;
        int port = url.getPort();
        setURL(url, "smb", url.getHost(), port == -1 ? 445 : port, url.getAuthority(), url.getUserInfo(), str2, url.getQuery(), null);
    }
}
