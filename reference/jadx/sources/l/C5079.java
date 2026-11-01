package l;

import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: l.ۚۗ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: V4F9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5079 implements Cloneable {

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public static final List f17693 = C0140.m1228(EnumC22013.HTTP_2, EnumC22013.HTTP_1_1);

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static final List f17694 = C0140.m1228(C21494.f69843, C21494.f69844);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f17695;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final ProxySelector f17696;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC7383 f17697;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final List f17698;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean f17699;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final boolean f17700;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final boolean f17701;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final List f17702;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C22906 f17703;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final SocketFactory f17704;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20084 f17705;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List f17706;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final List f17707;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C1032 f17708;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final int f17709;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final HostnameVerifier f17710;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C8795 f17711;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final int f17712;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17033 f17713;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC10277 f17714;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f17715;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C2921 f17716;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17033 f17717;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final SSLSocketFactory f17718;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC8089 f17719;

    static {
        AbstractC7196.f24003 = new C11430();
    }

    public C5079() {
        this(new C2256());
    }

    public C5079(C2256 c2256) {
        boolean z;
        this.f17711 = c2256.f8063;
        this.f17702 = c2256.f8066;
        List list = c2256.f8069;
        this.f17706 = list;
        this.f17707 = C0140.m1227((List) c2256.f8065);
        this.f17698 = C0140.m1227((List) c2256.f8076);
        this.f17705 = c2256.f8071;
        this.f17696 = c2256.f8064;
        this.f17719 = c2256.f8060;
        this.f17716 = c2256.f8070;
        this.f17704 = c2256.f8077;
        Iterator it = list.iterator();
        loop0: while (true) {
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                } else {
                    z = z || ((C21494) it.next()).f69848;
                }
            }
        }
        SSLSocketFactory sSLSocketFactory = c2256.f8057;
        if (sSLSocketFactory != null || !z) {
            this.f17718 = sSLSocketFactory;
            this.f17714 = c2256.f8059;
        } else {
            try {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                if (trustManagers.length == 1) {
                    TrustManager trustManager = trustManagers[0];
                    if (trustManager instanceof X509TrustManager) {
                        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                        try {
                            SSLContext sSLContextMo11388 = C18743.m43294().mo11388();
                            sSLContextMo11388.init(null, new TrustManager[]{x509TrustManager}, null);
                            this.f17718 = sSLContextMo11388.getSocketFactory();
                            this.f17714 = C18743.m43294().mo11389(x509TrustManager);
                        } catch (GeneralSecurityException e) {
                            throw C0140.m1222("No System TLS", (Exception) e);
                        }
                    }
                }
                throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
            } catch (GeneralSecurityException e2) {
                throw C0140.m1222("No System TLS", (Exception) e2);
            }
        }
        if (this.f17718 != null) {
            C18743.m43294().mo18248(this.f17718);
        }
        this.f17710 = c2256.f8075;
        this.f17708 = c2256.f8062.m3877(this.f17714);
        this.f17717 = c2256.f8067;
        this.f17713 = c2256.f8061;
        this.f17703 = c2256.f8058;
        this.f17697 = c2256.f8081;
        this.f17701 = c2256.f8074;
        this.f17699 = c2256.f8079;
        this.f17700 = c2256.f8072;
        this.f17695 = c2256.f8068;
        this.f17715 = c2256.f8080;
        this.f17709 = c2256.f8078;
        this.f17712 = c2256.f8073;
        if (this.f17707.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + this.f17707);
        }
        if (this.f17698.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f17698);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m14155() {
        return this.f17715;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int m14163() {
        return this.f17709;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int m14170() {
        return this.f17712;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final ProxySelector m14169() {
        return this.f17696;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final InterfaceC8089 m14166() {
        return this.f17719;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7383 m14156() {
        return this.f17697;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final SocketFactory m14161() {
        return this.f17704;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final SSLSocketFactory m14171() {
        return this.f17718;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final HostnameVerifier m14167() {
        return this.f17710;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C1032 m14165() {
        return this.f17708;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17033 m14158() {
        return this.f17713;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final InterfaceC17033 m14162() {
        return this.f17717;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C22906 m14159() {
        return this.f17703;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m14174() {
        return this.f17701;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m14160() {
        return this.f17699;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m14164() {
        return this.f17700;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final List m14168() {
        return this.f17702;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final List m14173() {
        return this.f17706;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11617 m14157(C22719 c22719) {
        return C3667.m10826(this, c22719);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C2256 m14172() {
        return new C2256(this);
    }
}
