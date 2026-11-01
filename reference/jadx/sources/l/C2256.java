package l;

import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: l.ۖۗ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: V4F9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2256 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public SSLSocketFactory f8057;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C22906 f8058;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public AbstractC10277 f8059;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public InterfaceC8089 f8060;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC17033 f8061;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C1032 f8062;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C8795 f8063;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public ProxySelector f8064;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final ArrayList f8065;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public List f8066;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC17033 f8067;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f8068;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public List f8069;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C2921 f8070;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public InterfaceC20084 f8071;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f8072;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f8073;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f8074;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public HostnameVerifier f8075;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final ArrayList f8076;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public SocketFactory f8077;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f8078;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f8079;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f8080;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public InterfaceC7383 f8081;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6923(long j) {
        this.f8068 = C0140.m1219(j, TimeUnit.SECONDS);
    }

    public C2256() {
        this.f8065 = new ArrayList();
        this.f8076 = new ArrayList();
        this.f8063 = new C8795();
        this.f8066 = C5079.f17693;
        this.f8069 = C5079.f17694;
        this.f8071 = new C15851();
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f8064 = proxySelector;
        if (proxySelector == null) {
            this.f8064 = new C8160();
        }
        this.f8060 = InterfaceC8089.f28341;
        this.f8077 = SocketFactory.getDefault();
        this.f8075 = C7454.f24839;
        this.f8062 = C1032.f4816;
        InterfaceC17033 interfaceC17033 = InterfaceC17033.f54416;
        this.f8067 = interfaceC17033;
        this.f8061 = interfaceC17033;
        this.f8058 = new C22906();
        this.f8081 = InterfaceC7383.f24507;
        this.f8074 = true;
        this.f8079 = true;
        this.f8072 = true;
        this.f8068 = 0;
        this.f8080 = 10000;
        this.f8078 = 10000;
        this.f8073 = 10000;
    }

    public C2256(C5079 c5079) {
        ArrayList arrayList = new ArrayList();
        this.f8065 = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f8076 = arrayList2;
        this.f8063 = c5079.f17711;
        this.f8066 = c5079.f17702;
        this.f8069 = c5079.f17706;
        arrayList.addAll(c5079.f17707);
        arrayList2.addAll(c5079.f17698);
        this.f8071 = c5079.f17705;
        this.f8064 = c5079.f17696;
        this.f8060 = c5079.f17719;
        this.f8070 = c5079.f17716;
        this.f8077 = c5079.f17704;
        this.f8057 = c5079.f17718;
        this.f8059 = c5079.f17714;
        this.f8075 = c5079.f17710;
        this.f8062 = c5079.f17708;
        this.f8067 = c5079.f17717;
        this.f8061 = c5079.f17713;
        this.f8058 = c5079.f17703;
        this.f8081 = c5079.f17697;
        this.f8074 = c5079.f17701;
        this.f8079 = c5079.f17699;
        this.f8072 = c5079.f17700;
        this.f8068 = c5079.f17695;
        this.f8080 = c5079.f17715;
        this.f8078 = c5079.f17709;
        this.f8073 = c5079.f17712;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6924(long j, TimeUnit timeUnit) {
        this.f8080 = C0140.m1219(j, timeUnit);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m6933(long j, TimeUnit timeUnit) {
        this.f8078 = C0140.m1219(j, timeUnit);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m6932(long j, TimeUnit timeUnit) {
        this.f8073 = C0140.m1219(j, timeUnit);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6929(C2921 c2921) {
        this.f8070 = c2921;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6926(SocketFactory socketFactory) {
        this.f8077 = socketFactory;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6927(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
        if (x509TrustManager == null) {
            throw new NullPointerException("trustManager == null");
        }
        this.f8057 = sSLSocketFactory;
        this.f8059 = C18743.m43294().mo11389(x509TrustManager);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6930(C15118 c15118) {
        this.f8075 = c15118;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6931(InterfaceC17033 interfaceC17033) {
        this.f8061 = interfaceC17033;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6925(List list) {
        this.f8069 = C0140.m1227(list);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6928(InterfaceC1738 interfaceC1738) {
        this.f8065.add(interfaceC1738);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m6934(InterfaceC1738 interfaceC1738) {
        this.f8076.add(interfaceC1738);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5079 m6922() {
        return new C5079(this);
    }
}
