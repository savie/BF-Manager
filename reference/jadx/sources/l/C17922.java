package l;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.ᩳ۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A186 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C17922 implements InterfaceC14767, InterfaceC7359 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f56919 = 2;

    public /* synthetic */ C17922() {
    }

    public /* synthetic */ C17922(C19602 c19602, C15100 c15100) {
    }

    public /* synthetic */ C17922(C19602 c19602, boolean z) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m41614(int i, int i2, int i3, int i4) {
        return ((i * i2) + i3) * i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m41615(AbstractC20745 abstractC20745, StringBuilder sb) {
        sb.append(abstractC20745.mo33986());
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m41616(String str, String str2, StringBuilder sb, ASN1ObjectIdentifier aSN1ObjectIdentifier, ConfigurableProvider configurableProvider) {
        sb.append(str);
        configurableProvider.addAlgorithm(str2, aSN1ObjectIdentifier, sb.toString());
        return new StringBuilder();
    }

    @Override // l.InterfaceC7359
    public void invoke(Object obj) {
        InterfaceC10430 interfaceC10430 = (InterfaceC10430) obj;
        switch (this.f56919) {
            case 3:
                interfaceC10430.getClass();
                break;
            default:
                interfaceC10430.getClass();
                break;
        }
    }

    @Override // l.InterfaceC14767
    /* JADX INFO: renamed from: ۙ */
    public String mo7576(C12257 c12257) {
        String str = c12257.f41013;
        return str != null ? str : c12257.f41015.toString();
    }
}
