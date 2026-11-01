package l;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.ܺ᩹᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: H1KB */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16236 implements InterfaceC7359, InterfaceC2123 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m38346(int i, int i2, int i3, int i4) {
        return (i3 - (i * i2)) * i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m38347(Class cls, String str, String str2) {
        return str + cls + str2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m38348(EnumC20934 enumC20934, StringBuilder sb, String str) {
        sb.append(enumC20934.m47084());
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m38349(ConfigurableProvider configurableProvider, String str, String str2, String str3, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm(str, str2);
        return str3 + aSN1ObjectIdentifier;
    }

    @Override // l.InterfaceC2123
    /* JADX INFO: renamed from: ۙ */
    public int mo1698(String str, boolean z) {
        return z ? 2 : 1;
    }

    @Override // l.InterfaceC7359
    public void invoke(Object obj) {
        ((InterfaceC10430) obj).getClass();
    }
}
