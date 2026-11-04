package l;

import bin.mt.json.JSONObject;
import java.util.Collection;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi;

/* JADX INFO: renamed from: l.۟ܺ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 0CMQ */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C8008 implements InterfaceC19795, InterfaceC18689 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m21874(JSONObject jSONObject, String str, JSONObject jSONObject2, String str2) {
        return jSONObject2.add(str2, C12556.m31237(jSONObject.get(str)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m21875(char c, String str, String str2) {
        return str + c + str2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21876(int i, int i2, String str, StringBuilder sb) {
        sb.append(C6033.m17503(i, i2));
        sb.append(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21877(BouncyCastleProvider bouncyCastleProvider, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        bouncyCastleProvider.addKeyInfoConverter(aSN1ObjectIdentifier, new SnovaKeyFactorySpi());
    }

    @Override // l.InterfaceC18689
    /* JADX INFO: renamed from: ۙ */
    public boolean mo5131(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    @Override // l.InterfaceC19795
    public void invoke(Object obj) {
        ((InterfaceC19992) obj).getClass();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m21872(InterfaceC14864 interfaceC14864, String str, C21578 c21578, C21578 c21579, boolean z, boolean z2) {
        if (z2) {
            return 1;
        }
        if (interfaceC14864.mo28694()) {
            interfaceC14864.mo28697(str, c21578, c21579, z);
        }
        return interfaceC14864.mo28700();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m21873(Collection collection) {
        return collection instanceof InterfaceC19195 ? ((InterfaceC19195) collection).m44464() : collection.size();
    }
}
