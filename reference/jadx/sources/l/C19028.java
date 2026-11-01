package l;

import java.lang.invoke.MethodHandle;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.ᩴ᩸ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4GW */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19028 implements InterfaceC7359, InterfaceC21304, InterfaceC3232 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ Class m43759() {
        return MethodHandle.class;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m43760(String str, String str2, StringBuilder sb, ASN1ObjectIdentifier aSN1ObjectIdentifier, ConfigurableProvider configurableProvider) {
        sb.append(aSN1ObjectIdentifier);
        configurableProvider.addAlgorithm(sb.toString(), str);
        return new StringBuilder(str2);
    }

    @Override // l.InterfaceC3232
    /* JADX INFO: renamed from: ۙ */
    public String mo9687(EnumC15934 enumC15934, String str, String str2) {
        return EnumC14523.m34961(enumC15934, str, str2);
    }

    @Override // l.InterfaceC21304
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List mo43763(String str, boolean z, boolean z2) {
        return C19894.m45161(str, z, z2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43762(ArrayList arrayList, int i) {
        arrayList.remove(arrayList.size() - i);
    }

    @Override // l.InterfaceC7359
    public void invoke(Object obj) {
        ((InterfaceC10430) obj).getClass();
    }
}
