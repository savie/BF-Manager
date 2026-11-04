package l;

import java.util.Locale;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.᩻᩵᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T6QN */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C25272 implements InterfaceC5417, InterfaceC23285, InterfaceC19795, InterfaceC11711 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f81632;

    public /* synthetic */ C25272(int i) {
        this.f81632 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m56409(String str, String str2) {
        return str + str2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m56410(String str, String str2, StringBuilder sb, ASN1ObjectIdentifier aSN1ObjectIdentifier, ConfigurableProvider configurableProvider) {
        sb.append(aSN1ObjectIdentifier);
        configurableProvider.addAlgorithm(sb.toString(), str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        return sb2;
    }

    @Override // l.InterfaceC11711
    /* JADX INFO: renamed from: ۙ */
    public Object mo14221(Object obj, Throwable th) {
        return null;
    }

    @Override // l.InterfaceC19795
    public void invoke(Object obj) {
        ((InterfaceC19992) obj).getClass();
    }

    @Override // l.InterfaceC23285
    /* JADX INFO: renamed from: ۙ */
    public String mo25860(C25368 c25368) {
        String str = c25368.f81911;
        return str != null ? str : c25368.f81907.toString();
    }

    @Override // l.InterfaceC5417
    public Object apply(Object obj) {
        switch (this.f81632) {
            case 3:
                C5954 c5954 = (C5954) obj;
                return c5954.f20386 + ": " + c5954.f20387;
            default:
                InterfaceC12993 interfaceC12993 = (InterfaceC12993) obj;
                return C16930.m39908((int) interfaceC12993.getLineNumber(), (int) interfaceC12993.getColumnNumber(), interfaceC12993.mo32403(Locale.ENGLISH));
        }
    }
}
