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

/* JADX INFO: renamed from: l.᩺ܳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: V4F9 */
/* JADX INFO: loaded from: classes.dex */
public final class C24363 implements Cloneable {

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public static final List f79032 = C19822.m45598(EnumC4225.HTTP_2, EnumC4225.HTTP_1_1);

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public static final List f79033 = C19822.m45598(C1374.f4899, C1374.f4901);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractC13527 f79034;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final List f79035;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f79036;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C7340 f79037;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final boolean f79038;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final int f79039;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22871 f79040;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C21511 f79041;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final InterfaceC4971 f79042;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8831 f79043;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C19273 f79044;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final List f79045;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final SocketFactory f79046;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final ProxySelector f79047;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f79048;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2120 f79049;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2120 f79050;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final int f79051;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f79052;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f79053;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final List f79054;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C3611 f79055;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final HostnameVerifier f79056;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final List f79057;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final SSLSocketFactory f79058;

    static {
        AbstractC4906.f17137 = new C12428();
    }

    public C24363() {
        this(new C6463());
    }

    public C24363(C6463 c6463) {
        boolean z;
        this.f79037 = c6463.f21732;
        this.f79054 = c6463.f21733;
        List list = c6463.f21729;
        this.f79035 = list;
        this.f79045 = C19822.m45597((List) c6463.f21726);
        this.f79057 = C19822.m45597((List) c6463.f21742);
        this.f79040 = c6463.f21738;
        this.f79047 = c6463.f21747;
        this.f79043 = c6463.f21725;
        this.f79055 = c6463.f21744;
        this.f79046 = c6463.f21743;
        Iterator it = list.iterator();
        loop0: while (true) {
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                } else {
                    z = z || ((C1374) it.next()).f4903;
                }
            }
        }
        SSLSocketFactory sSLSocketFactory = c6463.f21740;
        if (sSLSocketFactory != null || !z) {
            this.f79058 = sSLSocketFactory;
            this.f79034 = c6463.f21745;
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
                            SSLContext sSLContextMo1205 = C9052.m24178().mo1205();
                            sSLContextMo1205.init(null, new TrustManager[]{x509TrustManager}, null);
                            this.f79058 = sSLContextMo1205.getSocketFactory();
                            this.f79034 = C9052.m24178().mo24179(x509TrustManager);
                        } catch (GeneralSecurityException e) {
                            throw C19822.m45592("No System TLS", (Exception) e);
                        }
                    }
                }
                throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
            } catch (GeneralSecurityException e2) {
                throw C19822.m45592("No System TLS", (Exception) e2);
            }
        }
        if (this.f79058 != null) {
            C9052.m24178().mo1207(this.f79058);
        }
        this.f79056 = c6463.f21746;
        this.f79041 = c6463.f21741.m48919(this.f79034);
        this.f79050 = c6463.f21730;
        this.f79049 = c6463.f21728;
        this.f79044 = c6463.f21734;
        this.f79042 = c6463.f21748;
        this.f79038 = c6463.f21737;
        this.f79048 = c6463.f21739;
        this.f79036 = c6463.f21735;
        this.f79052 = c6463.f21731;
        this.f79053 = c6463.f21736;
        this.f79039 = c6463.f21727;
        this.f79051 = c6463.f21724;
        if (this.f79045.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + this.f79045);
        }
        if (this.f79057.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f79057);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m54453() {
        return this.f79053;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m54455() {
        return this.f79039;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int m54462() {
        return this.f79051;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final ProxySelector m54461() {
        return this.f79047;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8831 m54451() {
        return this.f79043;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC4971 m54446() {
        return this.f79042;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final SocketFactory m54464() {
        return this.f79046;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final SSLSocketFactory m54448() {
        return this.f79058;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final HostnameVerifier m54458() {
        return this.f79056;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C21511 m54463() {
        return this.f79041;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2120 m54449() {
        return this.f79049;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2120 m54447() {
        return this.f79050;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C19273 m54460() {
        return this.f79044;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m54465() {
        return this.f79038;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m54454() {
        return this.f79048;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean m54452() {
        return this.f79036;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final List m54457() {
        return this.f79054;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List m54456() {
        return this.f79035;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6595 m54450(C7954 c7954) {
        return C18395.m42899(this, c7954);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C6463 m54459() {
        return new C6463(this);
    }
}
