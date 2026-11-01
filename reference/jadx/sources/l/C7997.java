package l;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.۠ۛ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B94 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7997 implements InterfaceC7359, InterfaceC1118 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m21055(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6055 m21056(C18111 c18111, long j, String str, Object[] objArr) {
        c18111.mo2149(j, str, objArr);
        return new C6055();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21058(StringBuilder sb, ASN1ObjectIdentifier aSN1ObjectIdentifier, ConfigurableProvider configurableProvider, String str) {
        sb.append(aSN1ObjectIdentifier);
        configurableProvider.addAlgorithm(sb.toString(), str);
    }

    @Override // l.InterfaceC7359
    public void invoke(Object obj) {
        ((InterfaceC10430) obj).getClass();
    }

    @Override // l.InterfaceC1118
    /* JADX INFO: renamed from: ۙ */
    public String mo4141(C12257 c12257) throws IOException {
        String str = c12257.f41013;
        if (str != null) {
            return str;
        }
        throw new IOException("HLS thumbnail cache key is missing");
    }
}
