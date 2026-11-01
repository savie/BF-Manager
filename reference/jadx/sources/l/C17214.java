package l;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.ܿ۠ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6QN */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C17214 implements InterfaceC7359, InterfaceC15954, InterfaceC2288 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f54863;

    public /* synthetic */ C17214(int i) {
        this.f54863 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m40152(int i, String str) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        return sb;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m40153(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m40154(ConfigurableProvider configurableProvider, String str, String str2, String str3, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm(str, aSN1ObjectIdentifier, str2);
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        return sb;
    }

    @Override // l.InterfaceC15954
    public Object apply(Object obj) {
        return null;
    }

    @Override // l.InterfaceC2288
    public /* synthetic */ void cancel() {
    }

    @Override // l.InterfaceC2288
    /* JADX INFO: renamed from: ܰ */
    public AbstractC11462 mo2001(int i) {
        return new C22504(i);
    }

    @Override // l.InterfaceC7359
    public void invoke(Object obj) {
        InterfaceC10430 interfaceC10430 = (InterfaceC10430) obj;
        switch (this.f54863) {
            case 4:
                interfaceC10430.getClass();
                break;
            default:
                interfaceC10430.getClass();
                break;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m40151(InterfaceC22382 interfaceC22382) {
        return ((C13210) interfaceC22382).m32695(-1L, "exo_len");
    }
}
