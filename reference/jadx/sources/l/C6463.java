package l;

import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: l.ۛܳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: V4F9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6463 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f21724;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC8831 f21725;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final ArrayList f21726;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f21727;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC2120 f21728;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public List f21729;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public InterfaceC2120 f21730;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f21731;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C7340 f21732;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public List f21733;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C19273 f21734;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f21735;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f21736;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f21737;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC22871 f21738;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f21739;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public SSLSocketFactory f21740;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C21511 f21741;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final ArrayList f21742;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public SocketFactory f21743;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C3611 f21744;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC13527 f21745;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public HostnameVerifier f21746;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public ProxySelector f21747;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public InterfaceC4971 f21748;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18266(long j) {
        this.f21731 = C19822.m45589(j, TimeUnit.SECONDS);
    }

    public C6463() {
        this.f21726 = new ArrayList();
        this.f21742 = new ArrayList();
        this.f21732 = new C7340();
        this.f21733 = C24363.f79032;
        this.f21729 = C24363.f79033;
        this.f21738 = new C10936();
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f21747 = proxySelector;
        if (proxySelector == null) {
            this.f21747 = new C2341();
        }
        this.f21725 = InterfaceC8831.f28889;
        this.f21743 = SocketFactory.getDefault();
        this.f21746 = C4862.f16958;
        this.f21741 = C21511.f68742;
        InterfaceC2120 interfaceC2120 = InterfaceC2120.f6999;
        this.f21730 = interfaceC2120;
        this.f21728 = interfaceC2120;
        this.f21734 = new C19273();
        this.f21748 = InterfaceC4971.f17296;
        this.f21737 = true;
        this.f21739 = true;
        this.f21735 = true;
        this.f21731 = 0;
        this.f21736 = 10000;
        this.f21727 = 10000;
        this.f21724 = 10000;
    }

    public C6463(C24363 c24363) {
        ArrayList arrayList = new ArrayList();
        this.f21726 = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f21742 = arrayList2;
        this.f21732 = c24363.f79037;
        this.f21733 = c24363.f79054;
        this.f21729 = c24363.f79035;
        arrayList.addAll(c24363.f79045);
        arrayList2.addAll(c24363.f79057);
        this.f21738 = c24363.f79040;
        this.f21747 = c24363.f79047;
        this.f21725 = c24363.f79043;
        this.f21744 = c24363.f79055;
        this.f21743 = c24363.f79046;
        this.f21740 = c24363.f79058;
        this.f21745 = c24363.f79034;
        this.f21746 = c24363.f79056;
        this.f21741 = c24363.f79041;
        this.f21730 = c24363.f79050;
        this.f21728 = c24363.f79049;
        this.f21734 = c24363.f79044;
        this.f21748 = c24363.f79042;
        this.f21737 = c24363.f79038;
        this.f21739 = c24363.f79048;
        this.f21735 = c24363.f79036;
        this.f21731 = c24363.f79052;
        this.f21736 = c24363.f79053;
        this.f21727 = c24363.f79039;
        this.f21724 = c24363.f79051;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18267(long j, TimeUnit timeUnit) {
        this.f21736 = C19822.m45589(j, timeUnit);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m18278(long j, TimeUnit timeUnit) {
        this.f21727 = C19822.m45589(j, timeUnit);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m18276(long j, TimeUnit timeUnit) {
        this.f21724 = C19822.m45589(j, timeUnit);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18272(C3611 c3611) {
        this.f21744 = c3611;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18269(SocketFactory socketFactory) {
        this.f21743 = socketFactory;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18270(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
        if (x509TrustManager == null) {
            throw new NullPointerException("trustManager == null");
        }
        this.f21740 = sSLSocketFactory;
        this.f21745 = C9052.m24178().mo24179(x509TrustManager);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18274(C25220 c25220) {
        this.f21746 = c25220;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18271(InterfaceC2120 interfaceC2120) {
        this.f21728 = interfaceC2120;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m18275() {
        this.f21737 = false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m18277() {
        this.f21739 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18268(List list) {
        this.f21729 = C19822.m45597(list);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18273(InterfaceC17649 interfaceC17649) {
        this.f21726.add(interfaceC17649);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m18279(InterfaceC17649 interfaceC17649) {
        this.f21742.add(interfaceC17649);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24363 m18265() {
        return new C24363(this);
    }
}
