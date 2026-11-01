package l;

import bin.mt.json.JSONObject;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;

/* JADX INFO: renamed from: l.ᩴܳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: D73Y */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18828 implements InterfaceC7359, InterfaceC19534 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m43457(JSONObject jSONObject, String str, String str2, String str3, String str4) {
        return C4969.m13777(jSONObject.add(str3, C4969.m13786(str, str2)), str4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m43458(ASN1Sequence aSN1Sequence, int i) {
        return ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i)).getOctets();
    }

    @Override // l.InterfaceC19534
    /* JADX INFO: renamed from: ۙ */
    public InputStream mo14059(InputStream inputStream) {
        return new C18071(inputStream);
    }

    @Override // l.InterfaceC7359
    public void invoke(Object obj) {
        ((InterfaceC10430) obj).getClass();
    }
}
